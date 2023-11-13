package io.github.m_debdutta.bootcamp.measurement;

public enum Unit {
  FEET(12, 0, UnitType.LENGTH),
  INCH(1, 0, UnitType.LENGTH),
  CENTIMETER(1 / 2.5, 0, UnitType.LENGTH),
  MILLIMETER(0.04, 0, UnitType.LENGTH),
  GALLON(3.78, 0, UnitType.VOLUME),
  LITER(1, 0, UnitType.VOLUME),
  CELSIUS(1.8, 32, UnitType.TEMPERATURE),
  FAHRENHEIT(1, 0, UnitType.TEMPERATURE);

  private final double standardizationFactor;
  private final double standardizationDelta;
  private final UnitType unitType;

  Unit(double standardizationFactor, double standardizationDelta, UnitType unitType) {
    this.standardizationFactor = standardizationFactor;
    this.standardizationDelta = standardizationDelta;
    this.unitType = unitType;
  }

  public double toStandard(double measure) {
    return this.standardizationFactor * measure + this.standardizationDelta;
  }

  public boolean isSameUnit(Unit unit) {
    return this.unitType == unit.unitType;
  }
}
