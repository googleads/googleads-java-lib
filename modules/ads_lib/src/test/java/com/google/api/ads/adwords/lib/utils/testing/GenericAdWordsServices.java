package com.google.api.ads.adwords.lib.utils.testing;

import com.google.api.ads.adwords.lib.AdWordsModule;
import com.google.api.ads.adwords.lib.AdWordsPluginModule;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.factory.BaseAdWordsServices;
import com.google.api.ads.adwords.lib.factory.DependencyBootstrapper;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import org.mockito.Mockito;

/**
 * Subclass of {@link com.google.api.ads.adwords.lib.factory.BaseAdWordsServices} that does not
 * depend on a particular SOAP framework. Useful for tests of non-SOAP utilities.
 */
public class GenericAdWordsServices extends BaseAdWordsServices {

  /** Constructs an instance without an {@link AdWordsPluginModule}. */
  public GenericAdWordsServices() {
    super(Guice.createInjector(new GenericAdWordsModule()));
  }

  /** Constructs an instance with an {@link AdWordsPluginModule}. */
  private GenericAdWordsServices(AdWordsPluginModule pluginModule) {
    super(Guice.createInjector(new GenericAdWordsModule(), pluginModule));
  }

  @Override
  public AdWordsServicesInterface withPluginModule(AdWordsPluginModule pluginModule) {
    return new GenericAdWordsServices(pluginModule);
  }

  public DependencyBootstrapper getBootstrapper() {
    return createBootstrapper();
  }
  
  private static class GenericAdWordsModule extends AbstractModule {

    @Override
    protected void configure() {
      // Create a mock factory helper. This is required for setting up the injector, but isn't
      // actually used when obtaining non-SOAP utilities.
      @SuppressWarnings("rawtypes")
      final AdsServiceClientFactoryHelper mockFactoryHelper =
          Mockito.mock(AdsServiceClientFactoryHelper.class);
      bind(AdsServiceClientFactoryHelper.class).toInstance(mockFactoryHelper);
      install(new AdWordsModule());
    }
  }
}
