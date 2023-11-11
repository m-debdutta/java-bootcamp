package io.github.m_debdutta.bootcamp.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthUnitTest {
  @Test
  void shouldConvertFeetToStandardUnit() {
    assertEquals(12 * 2.5, LengthUnit.FEET.toStandard(1));
  }

  @Test
  void shouldConvertInchToStandardUnit() {
    assertEquals(2.5, LengthUnit.INCH.toStandard(1));
  }

  @Test
  void shouldConvertCentimeterToStandardUnit() {
    assertEquals(1, LengthUnit.CENTIMETER.toStandard(1));
  }

  @Test
  void shouldConvertMilimeterToStandardUnit() {
    assertEquals(0.1, LengthUnit.MILLIMETER.toStandard(1));
  }
}