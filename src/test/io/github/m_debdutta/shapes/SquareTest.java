package io.github.m_debdutta.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
  @Test
  void areaShouldBeOneForUnitSide() {
    Square square = new Square(1);
    assertEquals(1, square.area());
  }

  @Test
  void areaShouldBeSquareOfSide() {
    Square square = new Square(3);
    assertEquals(9, square.area());
  }

  @Test
  void perimeterShouldBeFourForUnitSide() {
    Square square = new Square(1);
    assertEquals(4, square.perimeter());
  }

  @Test
  void perimeterShouldFourTimesTheSide() {
    Square square = new Square(2);
    assertEquals(8, square.perimeter());
  }
}