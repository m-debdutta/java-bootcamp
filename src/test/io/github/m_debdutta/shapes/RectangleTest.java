package io.github.m_debdutta.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
  @Test
  void areaShouldBeOneForUnitDimensions() {
    Rectangle rectangle = new Rectangle(1, 1);
    assertEquals(1, rectangle.area());
  }

  @Test
  void areaShouldBeProductOfLengthAndBreadth() {
    Rectangle rectangle = new Rectangle(5, 4);
    assertEquals(20, rectangle.area());
  }

  @Test
  void perimeterShouldBeFourForUnitDimensions() {
    Rectangle rectangle = new Rectangle(1, 1);
    assertEquals(4, rectangle.perimeter());
  }

  @Test
  void perimeterShouldBeDoubleOfSumOfLengthAndBreadth() {
    Rectangle rectangle = new Rectangle(5, 4);
    assertEquals(18, rectangle.perimeter());
  }
}