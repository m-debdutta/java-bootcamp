package io.github.m_debdutta.probablity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChanceTest {
  @Test
  void shouldRepresentChanceOfGettingTailByFlippingACoin() throws OutOfRangeException {
    Chance chanceOfGettingTails = Chance.as(0.5);
    assertEquals(chanceOfGettingTails, Chance.as(0.5));
  }

  @Test
  void shouldThrowOutOfRangeExceptionWhenProbabilityIsLessThanZero() {
    assertThrows(OutOfRangeException.class, () -> Chance.as(-1));
  }

  @Test
  void shouldThrowOutOfRangeExceptionWhenProbabilityIsGreaterThanOne() {
    assertThrows(OutOfRangeException.class, () -> Chance.as(2));
  }
}