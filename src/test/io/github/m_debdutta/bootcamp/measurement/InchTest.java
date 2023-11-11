package io.github.m_debdutta.bootcamp.measurement;

import io.github.m_debdutta.bootcamp.measurement.exceptions.InvalidLengthException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class InchTest {
  @Test
  void shouldNotAcceptNegativeValue() {
    assertThrows(InvalidLengthException.class, () -> Inch.initialize(-1));
  }
}