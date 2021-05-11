package com.google.api.ads.adwords.lib.factory;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.base.Preconditions;
import com.google.inject.AbstractModule;

/**
 * Guice module that binds a given {@link AdWordsSession} to the {@link AdWordsSession} class.
 */
public class AdWordsSessionModule extends AbstractModule {

  private final AdWordsSession session;

  public AdWordsSessionModule(AdWordsSession session) {
    this.session = Preconditions.checkNotNull(session, "Null session");
  }

  @Override
  protected void configure() {
    bind(AdWordsSession.class).toInstance(session);
  }
}
