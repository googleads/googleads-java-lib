// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.AdsUtilityRegistry;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.EnumSet;
import java.util.Set;

/**
 * Tests for {@link AdsUtilityRegistry}.
 */
@RunWith(JUnit4.class)
public class AdsUtilityRegistryTest {

  private AdsUtilityRegistry registry;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
    registry = new AdsUtilityRegistry();
  }

  @Test
  public void testAddDuplicate() {
    Set<AdsUtility> expectedUtilities = EnumSet.<AdsUtility>of(AdsUtility.BATCH_JOB_HELPER);
    registry.addUtility(AdsUtility.BATCH_JOB_HELPER);
    assertEquals(expectedUtilities, registry.getRegisteredUtilities());
    registry.addUtility(AdsUtility.BATCH_JOB_HELPER);
    assertEquals(expectedUtilities, registry.getRegisteredUtilities());
  }

  @Test
  public void testRemovePartial() {
    // Add the batch job utility.
    registry.addUtility(AdsUtility.BATCH_JOB_HELPER);
    Set<AdsUtility> addedUtility = EnumSet.<AdsUtility>of(AdsUtility.BATCH_JOB_HELPER);
    // Add the product partition tree utility.
    registry.addUtility(AdsUtility.PRODUCT_PARTITION_TREE);
    // Only remove the batch job utility.
    registry.removeUtilities(addedUtility);
    assertEquals(
        "removeUtilities should only remove the provided utility",
        EnumSet.<AdsUtility>of(AdsUtility.PRODUCT_PARTITION_TREE),
        registry.getRegisteredUtilities());
  }

  @Test
  public void testAddNull_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("Null ads utility");
    registry.addUtility(null);
  }

  @Test
  public void testRemoveNull_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("Null utilities collection");
    registry.removeUtilities(null);
  }
}
