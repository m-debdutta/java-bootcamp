package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;

public class Inch {
  public final int value;

  private Inch(int inch) {
    this.value = inch;
  }

  public static Inch initialize(int inch) throws InvalidLengthException {
    if (inch < 0) throw new InvalidLengthException();
    return new Inch(inch);
  }
}
