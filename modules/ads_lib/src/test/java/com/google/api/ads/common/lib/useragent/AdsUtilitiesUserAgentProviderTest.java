// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.useragent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.AdsUtilityRegistry;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Test for {@link AdsUtilitiesUserAgentProvider}.
 */
@RunWith(JUnit4.class)
public class AdsUtilitiesUserAgentProviderTest {
  private AdsUtilitiesUserAgentProvider userAgentProvider;
  private AdsUtilityRegistry adsUtilityRegistry = AdsUtilityRegistry.getInstance();

  @Mock
  private AdsLibConfiguration adsLibConfiguration;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    userAgentProvider = new AdsUtilitiesUserAgentProvider(adsUtilityRegistry, adsLibConfiguration);
  }

  /**
   * Tests that a single registered utility will result in the correct user agent if include
   * utilities is true.
   */
  @Test
  public void testGenerateUserAgent_utilityRegistered_includeUtilitiesTrue() {
    when(adsLibConfiguration.isIncludeAdsUtilitiesInUserAgent()).thenReturn(true);

    adsUtilityRegistry.addUtility(AdsUtility.PRODUCT_PARTITION_TREE);

    String actualUserAgent = userAgentProvider.getUserAgent();
    assertEquals("User agent should include registered utilities if include utilities is true",
        AdsUtility.PRODUCT_PARTITION_TREE.getUserAgentIdentifier(), actualUserAgent);
  }

  /**
   * Tests that the user agent provider will always return multiple user agent identifiers
   * in alphabetical order, regardless of the order of registration.
   */
  @Test
  public void testGenerateUserAgent_multipleUtilitiesRegistered_includeUtilitiesTrue() {
    when(adsLibConfiguration.isIncludeAdsUtilitiesInUserAgent()).thenReturn(true);

    List<AdsUtility> adsUtilities = Arrays.asList(
            AdsUtility.PRODUCT_PARTITION_TREE,
            AdsUtility.SELECTOR_BUILDER,
            AdsUtility.REPORT_DOWNLOADER);

    for (int i = 0; i < adsUtilities.size(); i++) {
      Collections.shuffle(adsUtilities);
      for (AdsUtility adsUtility : adsUtilities) {
        adsUtilityRegistry.addUtility(adsUtility);
      }

      String expectedUserAgent =
          "ProductPartitionTree, ReportDownloader, SelectorBuilder";
      String actualUserAgent = userAgentProvider.getUserAgent();
      assertEquals(
          "User agent should include registered utilities in alphabetical order if include "
          + "utilities is true",
          expectedUserAgent, actualUserAgent);
      assertTrue("User agent provider should clear utilities",
          adsUtilityRegistry.popRegisteredUtilities().isEmpty());
    }
  }

  /**
   * Tests that if no utilities are registered, the provider will return null.
   */
  @Test
  public void testGenerateUserAgent_noUtilitiesRegistered_includeUtilitiesTrue() {
    when(adsLibConfiguration.isIncludeAdsUtilitiesInUserAgent()).thenReturn(true);

    String actualUserAgent = userAgentProvider.getUserAgent();

    assertNull("User agent should be null if no utilities are registered", actualUserAgent);
    assertTrue("User agent provider should clear utilities",
        adsUtilityRegistry.popRegisteredUtilities().isEmpty());
  }

  /**
   * Tests that if include utilities is false, the provider will return null (even if utilities
   * are registered).
   */
  @Test
  public void testGenerateUserAgent_utilitiesRegistered_includeUtilitiesFalse() {
    when(adsLibConfiguration.isIncludeAdsUtilitiesInUserAgent()).thenReturn(false);

    adsUtilityRegistry.addUtility(AdsUtility.PRODUCT_PARTITION_TREE);

    String actualUserAgent = userAgentProvider.getUserAgent();
    assertNull("User agent should be null if include utilities is false", actualUserAgent);
    assertTrue("User agent provider should clear utilities",
        adsUtilityRegistry.popRegisteredUtilities().isEmpty());
  }
}
