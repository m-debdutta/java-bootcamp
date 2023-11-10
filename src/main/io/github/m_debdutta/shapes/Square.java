package io.github.m_debdutta.shapes;

import io.github.m_debdutta.shapes.exceptions.InvalidDimensionException;

public class Square implements TwoDimensionalShape {
  private final double side;

  private Square(double side) {
    this.side = side;
  }

  public static Square create(double side) throws InvalidDimensionException {
    if (side < 0) throw new InvalidDimensionException();
    return new Square(side);
  }

  @Override
  public double area() {
    return this.side * this.side;
  }

  @Override
  public double perimeter() {
    return 4 * this.side;
  }
}
