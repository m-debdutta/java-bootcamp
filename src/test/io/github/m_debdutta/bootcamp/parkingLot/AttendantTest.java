package io.github.m_debdutta.bootcamp.parkingLot;

import io.github.m_debdutta.bootcamp.parkingLot.exception.ParkingLotFullException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AttendantTest {

  @Test
  void shouldBeAbleToParkWhenThereAreAvailableSpaces() throws ParkingLotFullException {
    ArrayList<ParkingLot> parkingLots = new ArrayList<>();
    parkingLots.add(new ParkingLot(1));
    Attendant attendant = new Attendant(parkingLots);
    assertTrue(attendant.park());
  }

  @Test
  void shouldHandleMoreThanOneParkingLot() throws ParkingLotFullException {
    ArrayList<ParkingLot> parkingLots = new ArrayList<>();
    parkingLots.add(new ParkingLot(1));
    parkingLots.add(new ParkingLot(2));
    Attendant attendant = new Attendant(parkingLots);
    attendant.park();
    assertTrue(attendant.park());
  }
}