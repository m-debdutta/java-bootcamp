package io.github.m_debdutta.bootcamp.shapes;

import io.github.m_debdutta.bootcamp.shapes.exceptions.InvalidDimensionException;

public class Rectangle {

  private final double length;
  private final double breadth;

  private Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public static Rectangle create(double length, double breadth) throws InvalidDimensionException {
    if (length < 0 || breadth < 0) throw new InvalidDimensionException();
    return new Rectangle(length, breadth);
  }

  public static Rectangle createSquare(double side) throws InvalidDimensionException {
    if (side < 0) throw new InvalidDimensionException();
    return new Rectangle(side, side);
  }

  public double area() {
    return this.length * this.breadth;
  }

  public double perimeter() {
    return 2 * (this.length + this.breadth);
  }
}
