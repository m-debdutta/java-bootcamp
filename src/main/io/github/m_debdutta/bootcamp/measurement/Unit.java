package io.github.m_debdutta.bootcamp.measurement;

import java.util.function.Function;

public enum Unit {
  FEET((x -> x * 12), UnitType.LENGTH),
  INCH((x -> x), UnitType.LENGTH),
  CENTIMETER(x -> x / 2.5, UnitType.LENGTH),
  MILLIMETER((x -> x / 25), UnitType.LENGTH),
  GALLON((x -> x * 3.78), UnitType.VOLUME),
  LITER((x -> x), UnitType.VOLUME),
  CELSIUS((x -> x), UnitType.TEMPERATURE),
  FAHRENHEIT((x -> (x - 32) * 1 / 1.8), UnitType.TEMPERATURE);

  private final UnitType unitType;
  private final Function<Double, Double> standardizationFn;

  Unit(Function<Double, Double> standardizationFn, UnitType unitType) {
    this.standardizationFn = standardizationFn;
    this.unitType = unitType;
  }

  public double toStandard(double measure) {
    return this.standardizationFn.apply(measure);
  }

  public boolean isSameUnit(Unit unit) {
    return this.unitType == unit.unitType;
  }
}
