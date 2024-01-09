package io.github.m_debdutta.bootcamp.parkingLot;

import io.github.m_debdutta.bootcamp.parkingLot.exception.ParkingLotFullException;

import java.util.ArrayList;

//TODO: always keep the free parking lot as a state.
public class Attendant implements Observer {
  private final ArrayList<ParkingLot> parkingLots;
  private final int parkingLotIndex;
//  private final ParkingLot currentParkingLot;

  public Attendant() {
    this.parkingLotIndex = 0;
    this.parkingLots = new ArrayList<>();
//    this.currentParkingLot = this.parkingLots.get(0);
  }

  public void assignParkingLot(ParkingLot parkingLot) {
    this.parkingLots.add(parkingLot);
  }

  private ParkingLot updateCurrentParkingLot() throws ParkingLotFullException {
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
    ParkingLot freeParkingLot = this.updateCurrentParkingLot();
    return freeParkingLot.park();
  }

  @Override
  public void notifyFullParking() {
    System.out.println("Parking lot is full.");
  }

  @Override
  public void notifyEightyPercentFullParking() {
    System.out.println("Parking lot is 80% full.");
  }
}
