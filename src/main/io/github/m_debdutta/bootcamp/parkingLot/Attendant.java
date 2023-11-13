package io.github.m_debdutta.bootcamp.parkingLot;

import io.github.m_debdutta.bootcamp.parkingLot.exception.ParkingLotFullException;

import java.util.ArrayList;

public class Attendant {
  private final ArrayList<ParkingLot> parkingLots;

  public Attendant(ArrayList<ParkingLot> parkingLots) {
    this.parkingLots = parkingLots;
  }

  private ParkingLot getFreeParkingLot() throws ParkingLotFullException {
    int index = 0;
    while (index < this.parkingLots.size()) {
      ParkingLot currentParkingLot = this.parkingLots.get(index);
      if (!currentParkingLot.isFull()) {
        return currentParkingLot;
      }
      index++;
    }
    throw new ParkingLotFullException();
  }

  //TODO: should parkinglot return boolean??

  public boolean park() throws ParkingLotFullException {
    ParkingLot freeParkingLot = this.getFreeParkingLot();
    return freeParkingLot.park();
  }
}
