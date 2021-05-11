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

package com.google.api.ads.common.lib.utils;

import static org.junit.Assert.assertEquals;

import java.util.EnumSet;
import java.util.Set;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link AdsUtilityRegistry}.
 */
@RunWith(JUnit4.class)
public class AdsUtilityRegistryTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @After
  public void tearDown() throws Exception {
    AdsUtilityRegistry.getInstance().popRegisteredUtilities();
  }

  @Test
  public void testAddDuplicate() {
    AdsUtilityRegistry registry = AdsUtilityRegistry.getInstance();
    Set<AdsUtility> expectedUtilities = EnumSet.<AdsUtility>of(AdsUtility.BATCH_JOB_HELPER);
    registry.addUtility(AdsUtility.BATCH_JOB_HELPER);
    registry.addUtility(AdsUtility.BATCH_JOB_HELPER);
    assertEquals(expectedUtilities, registry.popRegisteredUtilities());
  }

  @Test
  public void testAddNull_fails() {
    AdsUtilityRegistry registry = AdsUtilityRegistry.getInstance();
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("Null ads utility");
    registry.addUtility(null);
  }

  @Test
  public void testRemoveTwiceOk() {
    AdsUtilityRegistry registry = AdsUtilityRegistry.getInstance();
    registry.addUtility(AdsUtility.BATCH_JOB_HELPER);
    registry.popRegisteredUtilities();
    registry.popRegisteredUtilities();
  }
}
