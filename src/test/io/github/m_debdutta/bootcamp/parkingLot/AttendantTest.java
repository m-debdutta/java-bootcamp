package io.github.m_debdutta.bootcamp.parkingLot;

import io.github.m_debdutta.bootcamp.parkingLot.exception.ParkingLotFullException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AttendantTest {

  @Test
  void shouldBeAbleToParkWhenThereAreAvailableSpaces() throws ParkingLotFullException {
    ParkingLot p1 = new ParkingLot(1);
    Attendant attendant = new Attendant();
    attendant.assignParkingLot(p1);

    assertTrue(attendant.park());
  }

  @Test
  void shouldHandleMoreThanOneParkingLot() throws ParkingLotFullException {
    Attendant attendant = new Attendant();

    attendant.assignParkingLot(new ParkingLot(1));
    attendant.assignParkingLot(new ParkingLot(2));
    attendant.park();

    assertTrue(attendant.park());
  }

  @Test
  void shouldNotParkIfAllParkingLotsAreFull() throws ParkingLotFullException {
    Attendant attendant = new Attendant();

    attendant.assignParkingLot(new ParkingLot(1));
    attendant.assignParkingLot(new ParkingLot(1));
    attendant.park();
    attendant.park();

    assertThrows(ParkingLotFullException.class, attendant::park);
  }
}