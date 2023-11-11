package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
  @Test
  void oneFeetIsEqualToTwelveInches() throws InvalidLengthException {
    Length oneFeet = Length.initialize(1, LengthUnit.FEET);
    Length twelveInch = Length.initialize(12, LengthUnit.INCH);
    assertEquals(oneFeet, twelveInch);
  }

  @Test
  void shouldNotBeEqualGivenDifferentLengths() throws InvalidLengthException {
    Length oneFeet = Length.initialize(1, LengthUnit.FEET);
    Length elevenInch = Length.initialize(11, LengthUnit.INCH);
    assertNotEquals(oneFeet, elevenInch);
  }

  @Test
  void twoInchIsEqualToFiveCentimeter() throws InvalidLengthException {
    Length twoInch = Length.initialize(2, LengthUnit.INCH);
    Length fiveCentimeter = Length.initialize(5, LengthUnit.CENTIMETER);
    assertEquals(twoInch, fiveCentimeter);
  }

  @Test
  void oneCentimeterIsEqualToTenMillimeter() throws InvalidLengthException {
    Length oneCentimeter = Length.initialize(1, LengthUnit.CENTIMETER);
    Length tenMillimeter = Length.initialize(10, LengthUnit.MILLIMETER);
    assertEquals(oneCentimeter, tenMillimeter);
  }

  @Test
  void shouldNotAllowNegativeMeasure() {
    assertThrows(InvalidLengthException.class, () -> Length.initialize(-1, LengthUnit.INCH));
  }
}