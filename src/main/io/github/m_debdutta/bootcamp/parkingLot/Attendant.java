package io.github.m_debdutta.bootcamp.parkingLot;

import io.github.m_debdutta.bootcamp.parkingLot.exception.ParkingLotFullException;

import java.util.ArrayList;

//TODO: always keep the free parking lot as a state.
public class Attendant {
  private final ArrayList<ParkingLot> parkingLots;

  public Attendant() {
    this.parkingLots = new ArrayList<>();
  }

  public void assignParkingLot(ParkingLot parkingLot) {
    this.parkingLots.add(parkingLot);
  }

  private ParkingLot getFreeParkingLot() throws ParkingLotFullException {
    int index = 0;

    while (index < this.parkingLots.size()) {
      ParkingLot currentParkingLot = this.parkingLots.get(index);
      if (!currentParkingLot.isFull()) return currentParkingLot;
      index++;
    }

    throw new ParkingLotFullException();
  }

  //TODO: should parking lot return boolean??
  public boolean park() throws ParkingLotFullException {
    ParkingLot freeParkingLot = this.getFreeParkingLot();
    return freeParkingLot.park();
  }
}
