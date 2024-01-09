package io.github.m_debdutta.bootcamp.parkingLot;

// As a parking lot attendant, I want to park a car.

import io.github.m_debdutta.bootcamp.parkingLot.exception.ParkingLotFullException;

import java.util.ArrayList;

public class ParkingLot {
  private final ArrayList<ParkingSpot> parkingSpots;
  private final int size;
  private final ArrayList<Observer> fullParkingMonitors;
  private final ArrayList<Observer> eightyPercentParkingMonitors;
  private int freeSpots;

  public ParkingLot(int size) {
    this.size = size;
    this.freeSpots = size;
    this.parkingSpots = new ArrayList<ParkingSpot>();
    this.fullParkingMonitors = new ArrayList<>();
    this.eightyPercentParkingMonitors = new ArrayList<>();
  }

  public void addFullParkingMonitor(Observer monitor) {
    this.fullParkingMonitors.add(monitor);
  }

  public void addEightyPercentMonitor(Observer monitor) {
    this.eightyPercentParkingMonitors.add(monitor);
  }

  public Boolean park() throws ParkingLotFullException {
    if (this.isFull()) throw new ParkingLotFullException();

    this.parkingSpots.add(ParkingSpot.OCCUPIED);
    this.freeSpots--;
    this.notifyListeners();
    return true;
  }

  private void notifyListeners() {
    if (this.isFull()) this.notifyParkingFull();
    if (this.isEightyPercentFull()) this.notifyEightyPercentParkingFull();
  }

  private boolean isEightyPercentFull() {
    return Math.floor(this.size * 0.2) == this.freeSpots;
  }

  private void notifyEightyPercentParkingFull() {
    if (this.eightyPercentParkingMonitors.isEmpty()) return;
    this.eightyPercentParkingMonitors.forEach(Observer::notifyEightyPercentFullParking);
  }

  private void notifyParkingFull() {
    if (this.fullParkingMonitors.isEmpty()) return;
    this.fullParkingMonitors.forEach(Observer::notifyFullParking);
  }

  public boolean isFull() {
    return this.freeSpots == 0;
  }
}
