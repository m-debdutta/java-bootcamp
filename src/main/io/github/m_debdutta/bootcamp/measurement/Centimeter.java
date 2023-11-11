package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;

public class Centimeter {

  public final int value;

  private Centimeter(int centimeter) {
    this.value = centimeter;
  }

  public static Centimeter initialize(int centimeter) throws InvalidLengthException {
    if (centimeter < 0) throw new InvalidLengthException();
    return new Centimeter(centimeter);
  }
}
