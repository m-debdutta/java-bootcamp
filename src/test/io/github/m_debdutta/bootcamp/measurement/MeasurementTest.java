package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
  @Test
  void oneFeetIsEqualToTwelveInches() throws InvalidLengthException {
    Measurement oneFeet = Measurement.initialize(1, Unit.FEET);
    Measurement twelveInch = Measurement.initialize(12, Unit.INCH);
    assertEquals(oneFeet, twelveInch);
  }

  @Test
  void shouldNotBeEqualGivenDifferentLengths() throws InvalidLengthException {
    Measurement oneFeet = Measurement.initialize(1, Unit.FEET);
    Measurement elevenInch = Measurement.initialize(11, Unit.INCH);
    assertNotEquals(oneFeet, elevenInch);
  }

  @Test
  void twoInchIsEqualToFiveCentimeter() throws InvalidLengthException {
    Measurement twoInch = Measurement.initialize(2, Unit.INCH);
    Measurement fiveCentimeter = Measurement.initialize(5, Unit.CENTIMETER);
    assertEquals(twoInch, fiveCentimeter);
  }

  @Test
  void oneCentimeterIsEqualToTenMillimeter() throws InvalidLengthException {
    Measurement oneCentimeter = Measurement.initialize(1, Unit.CENTIMETER);
    Measurement tenMillimeter = Measurement.initialize(10, Unit.MILLIMETER);
    assertEquals(oneCentimeter, tenMillimeter);
  }

  @Test
  void shouldNotAllowNegativeMeasure() {
    assertThrows(InvalidLengthException.class, () -> Measurement.initialize(-1, Unit.INCH));
  }

  @Test
  void oneGallonShouldBeEqualToThreePointSevenEightLiters() throws InvalidLengthException {
    Measurement oneGallon = Measurement.initialize(1, Unit.GALLON);
    Measurement threePointSevenEightLiters = Measurement.initialize(3.78, Unit.LITER);
    assertEquals(oneGallon, threePointSevenEightLiters);
  }
}