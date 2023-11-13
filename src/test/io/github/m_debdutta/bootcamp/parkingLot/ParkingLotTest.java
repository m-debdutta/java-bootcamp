package io.github.m_debdutta.bootcamp.parkingLot;

import io.github.m_debdutta.bootcamp.parkingLot.exception.ParkingLotFullException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
  @Test
  void shouldAbleToParkInAFreeSpot() throws ParkingLotFullException {
    ParkingLot parkingLot = new ParkingLot(10);
    assertTrue(parkingLot.park());
  }

  @Test
  void shouldAbleToKnowIfParkingLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(10);
    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldBeAbleToKnowIfParkingLotIsNotFull() throws ParkingLotFullException {
    ParkingLot parkingLot = new ParkingLot(1);
    parkingLot.park();
    assertTrue(parkingLot.isFull());
  }

  @Test
  void shouldNotParkIfParkingLotIsFull() throws ParkingLotFullException {
    ParkingLot parkingLot = new ParkingLot(1);
    parkingLot.park();
    assertThrows(ParkingLotFullException.class, parkingLot::park);
  }
}