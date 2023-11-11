package io.github.m_debdutta.bootcamp.measurement;

public enum LengthUnit {
  FEET(12 * 2.5),
  INCH(2.5),
  CENTIMETER(1),
  MILLIMETER(0.1);

  private final double standardizationFactor;

  LengthUnit(double standardizationFactor) {
    this.standardizationFactor = standardizationFactor;
  }

  public double toStandard(double measure) {
    return measure * this.standardizationFactor;
  }
}
