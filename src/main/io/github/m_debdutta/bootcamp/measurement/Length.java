package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;

import java.util.Objects;

public class Length {
  private final double measure;
  private final LengthUnit unit;

  private Length(double measure, LengthUnit unit) {
    this.measure = measure;
    this.unit = unit;
  }

  public static Length initialize(int measure, LengthUnit unit) throws InvalidLengthException {
    if (measure < 0) throw new InvalidLengthException();
    return new Length(measure, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Length length1 = (Length) o;
    return this.isEqual(length1);
  }

  private boolean isEqual(Length length1) {
    return length1.toStandard() == this.toStandard();
  }

  private double toStandard() {
    return this.unit.toStandard(this.measure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.measure);
  }
}
