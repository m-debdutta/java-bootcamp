package io.github.m_debdutta.bootcamp.parkingLot;

// As a parking lot attendant, I want to park a car.

import io.github.m_debdutta.bootcamp.parkingLot.exception.ParkingLotFullException;

import java.util.ArrayList;

public class ParkingLot {
  private final ArrayList<ParkingSpot> parkingSpots;
  private int freeSpots;

  public ParkingLot(int size) {
    this.freeSpots = size;
    this.parkingSpots = new ArrayList<ParkingSpot>();
  }

  public Boolean park() throws ParkingLotFullException {
    if (this.isFull()) throw new ParkingLotFullException();
    this.parkingSpots.add(ParkingSpot.OCCUPIED);
    this.freeSpots--;
    return true;
  }

  public boolean isFull() {
    return this.freeSpots == 0;
  }
}
