package io.github.m_debdutta.bootcamp.measurement;

public enum Unit {
  FEET(12 * 2.5, UnitType.LENGTH),
  INCH(2.5, UnitType.LENGTH),
  CENTIMETER(1, UnitType.LENGTH),
  MILLIMETER(0.1, UnitType.LENGTH),
  GALLON(3.78, UnitType.VOLUME),
  LITER(1, UnitType.VOLUME);

  private final double standardizationFactor;
  private final UnitType unitType;

  Unit(double standardizationFactor, UnitType unitType) {
    this.standardizationFactor = standardizationFactor;
    this.unitType = unitType;
  }

  public double toStandard(double measure) {
    return measure * this.standardizationFactor;
  }

  public boolean isSameUnit(Unit unit) {
    return this.unitType == unit.unitType;
  }
}
