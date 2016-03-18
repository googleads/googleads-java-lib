// Copyright 2012 Google Inc. All Rights Reserved.

package com.google.api.ads.common.lib.conf;

/**
 * Exception thrown when configuration could not be loaded.
 */
public class ConfigurationLoadException extends Exception {

  /**
   * Constructor.
   *
   * @param message the message
   * @param cause the cause
   */
  public ConfigurationLoadException(String message, Throwable cause) {
    super(message, cause);
  }

}
