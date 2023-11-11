package io.github.m_debdutta.bootcamp.measurement;

public class IncompatableUnitException extends Throwable {
  public IncompatableUnitException() {
    super("Different type cannot be compared");
  }
}
