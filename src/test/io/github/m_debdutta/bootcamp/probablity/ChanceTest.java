package io.github.m_debdutta.bootcamp.probablity;

import io.github.m_debdutta.bootcamp.probablity.exceptions.OutOfRangeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChanceTest {
  @Test
  void shouldRepresentChanceOfGettingTailsByFlippingACoin() throws OutOfRangeException {
    Chance chanceOfGettingTails = Chance.of(0.5);
    assertEquals(chanceOfGettingTails, Chance.of(0.5));
  }

  @Test
  void shouldThrowOutOfRangeExceptionWhenProbabilityIsLessThanZero() {
    assertThrows(OutOfRangeException.class, () -> Chance.of(-1));
  }

  @Test
  void shouldThrowOutOfRangeExceptionWhenProbabilityIsGreaterThanOne() {
    assertThrows(OutOfRangeException.class, () -> Chance.of(2));
  }

  @Test
  void shouldRepresentChanceOfNotGettingTailsByFlippingACoin() throws OutOfRangeException {
    Chance chanceOfGettingTail = Chance.of(0.5);
    assertEquals(Chance.of(0.5), chanceOfGettingTail.not());
  }

  @Test
  void shouldRepresentChanceOfGettingTwoTailsByFlippingTwoCoin() throws OutOfRangeException {
    Chance chanceOfGettingTailCoin1 = Chance.of(0.5);
    Chance chanceOfGettingTailCoin2 = Chance.of(0.5);
    Chance cumulativeChance = chanceOfGettingTailCoin1.and(chanceOfGettingTailCoin2);
    assertEquals(Chance.of(0.25), cumulativeChance);
  }

  @Test
  void shouldRepresentChanceOfGettingAtLeastOneTailByFlippingTwoCoin() throws OutOfRangeException {
    Chance tailOnFirstCoin = Chance.of(0.5);
    Chance tailOnSecondCoin = Chance.of(0.5);
    Chance atLeastOneTail = tailOnFirstCoin.or(tailOnSecondCoin);
    assertEquals(Chance.of(0.75), atLeastOneTail);
  }
}