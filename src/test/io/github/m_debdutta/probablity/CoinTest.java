package io.github.m_debdutta.probablity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinTest {
  @Test
  void chanceOfGettingTailShouldBeHalf() {
    assertEquals(0.5, Coin.tailProbablity());
  }

  @Test
  void chanceOfGettingHeadShouldBeHalf() {
    assertEquals(0.5, Coin.headProbablity());
  }
}