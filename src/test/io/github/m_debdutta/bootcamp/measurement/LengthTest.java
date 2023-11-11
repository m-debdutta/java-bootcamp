package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LengthTest {
  @Test
  void shouldBeEqualWhenTwoLengthAreSame() throws InvalidLengthException {
    Feet feet = Feet.initialize(1);
    Inch inch = Inch.initialize(12);
    Length l1 = new Length(feet);
    Length l2 = new Length(inch);
    assertEquals(l1, l2);
  }

  @Test
  void shouldNotBeEqualWhenComparingTwoDifferentLengths() throws InvalidLengthException {
    Feet feet = Feet.initialize(1);
    Inch inch = Inch.initialize(11);
    Length l1 = new Length(feet);
    Length l2 = new Length(inch);
    assertNotEquals(l1, l2);
  }
}