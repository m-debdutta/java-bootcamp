package io.github.m_debdutta.bootcamp.probablity;

import io.github.m_debdutta.bootcamp.probablity.exceptions.OutOfRangeException;

import java.util.Objects;

public class Chance {
  private final double probability;

  private Chance(double probability) {
    this.probability = probability;
  }

  public static Chance of(double probability) throws OutOfRangeException {
    if (probability < 0 || probability > 1) throw new OutOfRangeException();
    return new Chance(probability);
  }

  public Chance and(Chance otherChance) throws OutOfRangeException {
    return Chance.of(otherChance.probability * this.probability);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Chance chance = (Chance) o;
    return Double.compare(this.probability, chance.probability) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.probability);
  }

  public Chance not() throws OutOfRangeException {
    return Chance.of(1 - this.probability);
  }

  public Chance or(Chance otherChance) throws OutOfRangeException {
    return Chance.of(this.probability + otherChance.probability - this.and(otherChance).probability);
  }
}
