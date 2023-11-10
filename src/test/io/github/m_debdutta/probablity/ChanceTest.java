package io.github.m_debdutta.probablity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChanceTest {
  @Test
  void shouldRepresentChanceOfGettingTailsByFlippingACoin() throws OutOfRangeException {
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

  @Test
  void shouldRepresentChanceOfNotGettingTailsByFlippingACoin() throws OutOfRangeException {
    Chance chanceOfGettingTail = Chance.as(0.5);
    assertEquals(Chance.as(0.5), chanceOfGettingTail.not());
  }

  @Test
  void shouldRepresentChanceOfGettingTwoTailsByFlippingTwoCoin() throws OutOfRangeException {
    Chance chanceOfGettingTailCoin1 = Chance.as(0.5);
    Chance chanceOfGettingTailCoin2 = Chance.as(0.5);
    Chance cumulativeChance = chanceOfGettingTailCoin1.and(chanceOfGettingTailCoin2);
    assertEquals(Chance.as(0.25), cumulativeChance);
  }

  @Test
  void shouldRepresentChanceOfGettingAtLeastOneTailByFlippingTwoCoin() throws OutOfRangeException {
    Chance chanceOfGettingNoTails = Chance.as(0.25);
    assertEquals(Chance.as(0.75), chanceOfGettingNoTails.not());
  }
}