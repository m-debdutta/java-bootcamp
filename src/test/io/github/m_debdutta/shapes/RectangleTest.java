package io.github.m_debdutta.shapes;

import io.github.m_debdutta.shapes.exceptions.InvalidDimensionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {
  @Test
  void areaShouldBeOneForUnitDimensions() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.createSquare(1, 1);
    assertEquals(1, rectangle.area());
  }

  @Test
  void areaShouldBeProductOfLengthAndBreadth() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.createSquare(5, 4);
    assertEquals(20, rectangle.area());
  }

  @Test
  void perimeterShouldBeFourForUnitDimensions() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.createSquare(1, 1);
    assertEquals(4, rectangle.perimeter());
  }

  @Test
  void perimeterShouldBeDoubleOfSumOfLengthAndBreadth() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.createSquare(5, 4);
    assertEquals(18, rectangle.perimeter());
  }

  @Test
  void shouldNotCreateRectangleWithNegativeDimensions() {
    InvalidDimensionException exception = assertThrows(InvalidDimensionException.class, () -> Rectangle.createSquare(-4, 2));
  }

  @Test
  void areaOfSquareShouldBeOneForUnitSide() throws InvalidDimensionException {
    Rectangle square = Rectangle.createSquare(1);
    assertEquals(1, square.area());
  }

  @Test
  void areaOfSquareShouldBeSquareOfSide() throws InvalidDimensionException {
    Rectangle square = Rectangle.createSquare(3);
    assertEquals(9, square.area());
  }

  @Test
  void perimeterOfSquareShouldBeFourForUnitSide() throws InvalidDimensionException {
    Rectangle square = Rectangle.createSquare(1);
    assertEquals(4, square.perimeter());
  }

  @Test
  void perimeterOfSquareShouldBeFourTimesTheSide() throws InvalidDimensionException {
    Rectangle square = Rectangle.createSquare(2);
    assertEquals(8, square.perimeter());
  }

  @Test
  void shouldNotCreateSquareWithNegativeSide() {
    assertThrows(InvalidDimensionException.class, () -> Rectangle.createSquare(-4));
  }
}