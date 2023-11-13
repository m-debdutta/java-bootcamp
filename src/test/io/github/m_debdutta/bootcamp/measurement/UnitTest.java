package io.github.m_debdutta.bootcamp.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTest {
  @Test
  void shouldConvertFeetToStandardUnit() {
    assertEquals(12, Unit.FEET.toStandard(1));
  }

  @Test
  void shouldConvertInchToStandardUnit() {
    assertEquals(1, Unit.INCH.toStandard(1));
  }

  @Test
  void shouldConvertCentimeterToStandardUnit() {
    assertEquals(0.4, Unit.CENTIMETER.toStandard(1));
  }

  @Test
  void shouldConvertMillimeterToStandardUnit() {
    assertEquals(0.04, Unit.MILLIMETER.toStandard(1));
  }

  @Test
  void shouldConvertCelsiusesFahrenheit() {
    assertEquals(1, Unit.FAHRENHEIT.toStandard(33.8), 0.01);
  }
}