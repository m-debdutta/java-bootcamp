package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;

public class Feet {

  public final int value;

  private Feet(int feet) {
    this.value = feet;
  }

  public static Feet initialize(int feet) throws InvalidLengthException {
    if (feet < 0) throw new InvalidLengthException();
    return new Feet(feet);
  }
}
