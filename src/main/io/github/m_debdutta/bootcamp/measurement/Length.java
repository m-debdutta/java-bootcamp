package io.github.m_debdutta.bootcamp.measurement;

import java.util.Objects;

public class Length {
  private final double length;

  public Length(Feet feet) {
    this.length = feet.value * 12 * 2.5;
  }

  public Length(Inch inch) {
    this.length = inch.value * 2.5;
  }

  public Length(Centimeter centimeter) {
    this.length = centimeter.value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Length length1 = (Length) o;
    return this.isEqual(length1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.length);
  }

  private boolean isEqual(Length l2) {
    return this.length == l2.length;
  }
}
