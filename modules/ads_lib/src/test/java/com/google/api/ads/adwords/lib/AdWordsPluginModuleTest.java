// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.testing.GenericAdWordsServices;
import com.google.api.ads.common.lib.useragent.ExtensionUserAgentProvider;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** Tests for {@link AdWordsPluginModule}. */
@RunWith(JUnit4.class)
public class AdWordsPluginModuleTest {

  @Mock private AdWordsSession session;
  @Mock private ExtensionUserAgentProvider extensionUserAgentProvider;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  /**
   * Verifies that the constructor will fail with a {@link NullPointerException} if the {@link
   * ExtensionUserAgentProvider} is {@code null}.
   */
  @Test
  public void testConstructor_nullProvider_fails() {
    thrown.expect(NullPointerException.class);
    new AdWordsPluginModule(null);
  }

  /**
   * Verifies that {@link UserAgentCombiner} instances behave as expected when an {@link
   * AdWordsPluginModule} is or is not provided to the injector.
   */
  @Test
  public void testCombinedUserAgentBehavior() {
    // Create a mock ExtensionUserAgentProvider that returns a specific string from getUserAgent.
    String pluginUserAgentSnippet = "MyCustomExtension";
    when(extensionUserAgentProvider.getUserAgent()).thenReturn(pluginUserAgentSnippet);

    // Create an AdWordsServicesInterface using an AdWordsPluginModule configured with the
    // ExtensionUserAgentProvider.
    GenericAdWordsServices genericAdWordsServices =
        (GenericAdWordsServices)
            new GenericAdWordsServices()
                .withPluginModule(new AdWordsPluginModule(extensionUserAgentProvider));
    
    // Get the combined user agent from the UserAgentCombiner provided by the
    // AdWordsServicesInterface, and confirm the combined user agent it returns includes the
    // string from the mock ExtensionUserAgentProvider.
    UserAgentCombiner userAgentCombiner =
        genericAdWordsServices.getBootstrapper().getInstanceOf(session, UserAgentCombiner.class);
    String combinedUserAgent = userAgentCombiner.getUserAgent("foo");
    assertThat(
        "Combined user agent does not contain the string from the plugin",
        combinedUserAgent,
        Matchers.containsString(pluginUserAgentSnippet));

    // Get a UserAgentCombiner from an AdWordsServicesInterface without a plugin and confirm the
    // combined user agent it returns does not contain the string from the mock
    // ExtensionUserAgentProvider.
    genericAdWordsServices = new GenericAdWordsServices();
    userAgentCombiner =
        genericAdWordsServices.getBootstrapper().getInstanceOf(session, UserAgentCombiner.class);
    combinedUserAgent = userAgentCombiner.getUserAgent("foo");
    assertThat(
        "Combined user agent contains string from the plugin, but plugin was not provided",
        combinedUserAgent,
        Matchers.not(Matchers.containsString(pluginUserAgentSnippet)));
  }
}
