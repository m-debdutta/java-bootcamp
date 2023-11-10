package io.github.m_debdutta.shapes;

import io.github.m_debdutta.shapes.exceptions.InvalidDimensionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {
  @Test
  void areaShouldBeOneForUnitDimensions() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(1, 1);
    assertEquals(1, rectangle.area());
  }

  @Test
  void areaShouldBeProductOfLengthAndBreadth() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(5, 4);
    assertEquals(20, rectangle.area());
  }

  @Test
  void perimeterShouldBeFourForUnitDimensions() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(1, 1);
    assertEquals(4, rectangle.perimeter());
  }

  @Test
  void perimeterShouldBeDoubleOfSumOfLengthAndBreadth() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(5, 4);
    assertEquals(18, rectangle.perimeter());
  }

  @Test
  void shouldNotCreateRectangleWithNegativeDimensions() {
    InvalidDimensionException exception = assertThrows(InvalidDimensionException.class, () -> Rectangle.create(-4, 2));
  }
}