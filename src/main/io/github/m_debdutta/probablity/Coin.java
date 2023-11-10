package io.github.m_debdutta.probablity;

public class Coin {
  public static final double tailProbability = 0.5;
  public static final double headProbability = 0.5;

  public static double notTailProbability() {
    return 1 - tailProbability;
  }
}
