package com.google.api.ads.adwords.lib.factory;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.inject.AbstractModule;

/**
 * Guice module that binds a given {@link AdWordsSession} to the {@link AdWordsSession} class.
 */
class AdWordsSessionModule extends AbstractModule {

  private final AdWordsSession session;

  AdWordsSessionModule(AdWordsSession session) {
    this.session = session;
  }

  @Override
  protected void configure() {
    bind(AdWordsSession.class).toInstance(session);
  }
}
