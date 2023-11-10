package io.github.m_debdutta.shapes;

public class Square implements TwoDimensionalShape {
  private final double side;

  public Square(double side) {
    this.side = side;
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
