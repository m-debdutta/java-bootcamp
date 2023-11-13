package io.github.m_debdutta.bootcamp.parkingLot.exception;

public class ParkingLotFullException extends Throwable {
  public ParkingLotFullException() {
    super("Parking lot is full");
  }
}
