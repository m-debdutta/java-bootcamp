package io.github.m_debdutta.shapes;

import io.github.m_debdutta.shapes.exceptions.InvalidDimensionException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SquareTest {
  @Test
  void areaShouldBeOneForUnitSide() throws InvalidDimensionException {
    Square square = Square.create(1);
    assertEquals(1, square.area());
  }

  @Test
  void areaShouldBeSquareOfSide() throws InvalidDimensionException {
    Square square = Square.create(3);
    assertEquals(9, square.area());
  }

  @Test
  void perimeterShouldBeFourForUnitSide() throws InvalidDimensionException {
    Square square = Square.create(1);
    assertEquals(4, square.perimeter());
  }

  @Test
  void perimeterShouldFourTimesTheSide() throws InvalidDimensionException {
    Square square = Square.create(2);
    assertEquals(8, square.perimeter());
  }

  @Test
  void shouldNotCreateRectangleWithNegativeDimensions() {
    InvalidDimensionException exception = assertThrows(InvalidDimensionException.class, () -> Square.create(-4));
  }
}