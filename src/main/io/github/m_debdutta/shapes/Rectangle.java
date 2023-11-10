package io.github.m_debdutta.shapes;

import io.github.m_debdutta.shapes.exceptions.InvalidDimensionException;

public class Rectangle implements TwoDimensionalShape {

  private final double length;
  private final double breadth;

  private Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  static Rectangle create(double length, double breadth) throws InvalidDimensionException {
    if (length < 0 || breadth < 0) throw new InvalidDimensionException();
    return new Rectangle(length, breadth);
  }

  @Override
  public double area() {
    return this.length * this.breadth;
  }

  @Override
  public double perimeter() {
    return 2 * (this.length + this.breadth);
  }
}
