package com.google.api.ads.adwords.lib.utils.testing;

import com.google.api.ads.adwords.lib.AdWordsModule;
import com.google.api.ads.adwords.lib.factory.BaseAdWordsServices;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.mockito.Mockito;

/**
 * Subclass of {@link com.google.api.ads.adwords.lib.factory.BaseAdWordsServices} that does not
 * depend on a particular SOAP framework. Useful for tests of non-SOAP utilities.
 */
public class GenericAdWordsServices extends BaseAdWordsServices {

  public GenericAdWordsServices() {
    super(createInjector());
  }

  private static Injector createInjector() {
    // Create a mock factory helper. This is required for setting up the injector, but isn't
    // actually used when obtaining non-SOAP utilities.
    @SuppressWarnings("rawtypes")
    final AdsServiceClientFactoryHelper mockFactoryHelper =
        Mockito.mock(AdsServiceClientFactoryHelper.class);
    return Guice.createInjector(new AdWordsModule(),
        new AbstractModule() {
          @Override
          protected void configure() {
            bind(AdsServiceClientFactoryHelper.class).toInstance(mockFactoryHelper);
          }
        });
  }
}
