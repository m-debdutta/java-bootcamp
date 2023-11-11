package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;

import java.util.Objects;

public class Measurement {
  private final double measure;
  private final Unit unit;

  private Measurement(double measure, Unit unit) {
    this.measure = measure;
    this.unit = unit;
  }

  public static Measurement initialize(double measure, Unit unit) throws InvalidLengthException {
    if (measure < 0) throw new InvalidLengthException();
    return new Measurement(measure, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Measurement length1 = (Measurement) o;
    return this.isEqual(length1);
  }

  private boolean isEqual(Measurement m) {
    return this.isSameUnitType(m) && m.toStandard() == this.toStandard();
  }

  private boolean isSameUnitType(Measurement m) {
    return this.unit.isSameUnit(m.unit);
  }

  private double toStandard() {
    return this.unit.toStandard(this.measure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.measure);
  }

  public Measurement add(Measurement m) throws IncompatableUnitException, InvalidLengthException {
    if (!this.isSameUnitType(m)) throw new IncompatableUnitException();
    return Measurement.initialize(this.measure + m.measure, this.unit);
  }
}
