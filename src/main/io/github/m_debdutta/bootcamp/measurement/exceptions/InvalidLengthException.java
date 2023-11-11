package io.github.m_debdutta.bootcamp.measurement.exceptions;

public class InvalidLengthException extends Throwable {
  public InvalidLengthException() {
    super("Negative values are not allowed");
  }
}
