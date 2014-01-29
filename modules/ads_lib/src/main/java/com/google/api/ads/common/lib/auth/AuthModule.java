// Copyright 2012 Google Inc. All Rights Reserved.

package com.google.api.ads.common.lib.auth;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Module for authentication.
 *
 * @author Adam Rogal
 */
public class AuthModule extends AbstractModule {

  public static final Long DEFAULT_OAUTH2_REFRESH_WINDOW = 60L;

  /**
   * Default constructor.
   */
  public AuthModule() {
  }

  @Override
  protected void configure() {
    bindConstant().annotatedWith(Names.named("requestMethod")).to("POST");
    bindConstant()
        .annotatedWith(Names.named("oAuth2RefreshWindow")).to(DEFAULT_OAUTH2_REFRESH_WINDOW);
  }
}
