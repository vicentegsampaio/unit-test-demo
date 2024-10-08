package com.exemplo.arrayutils.exceptions;

public class HttpClientBadRequestException extends RuntimeException {
  public HttpClientBadRequestException(String message) {
    super(message);
  }
}
