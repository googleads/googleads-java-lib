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

package com.google.api.ads.adwords.extension.ratelimiter;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.exception.ValidationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test case for the {@link ApiInvocationHandlerWithRateLimiter} class.
 */
@RunWith(JUnit4.class)
public class ApiInvocationHandlerWithRateLimiterTest {
  private static final String TEST_CID1 = "1";
  private static final String TEST_CID2 = "2";
  
  /**
   * Test that the {@link ApiInvocationHandlerWithRateLimiter} class holds an AdWordsSession
   * reference, instead of creating a copy of it.
   */
  @Test
  public void testCidChangeInAdWordsSession() throws ValidationException {
    AdWordsSession session = AdWordsSessionUtilTest.getTestAdWordsSessionWithoutCid();
    session.setClientCustomerId(TEST_CID1);
    Object obj = new Object();

    // Don't use ApiServicesRetryStrategy, because in ApiRateLimiterTest we need to change system
    // settings before creating its instance for the expected testing behavior!
    ApiRetryStrategy retryStrategy = ApiReportingRetryStrategy.newInstance();
    ApiInvocationHandlerWithRateLimiter awapiInvocationHandler =
        new ApiInvocationHandlerWithRateLimiter(obj, session, retryStrategy);

    assertSame(
        "Same adwords session object check.", session, awapiInvocationHandler.getAdWordsSession());
    assertTrue(
        "AdWordsSession cid1 check",
        awapiInvocationHandler.getAdWordsSession().getClientCustomerId().equals(TEST_CID1));

    session.setClientCustomerId(TEST_CID2);
    assertSame(
        "Same adwords session object check.", session, awapiInvocationHandler.getAdWordsSession());
    assertTrue(
        "AdWordsSession cid2 check",
        awapiInvocationHandler.getAdWordsSession().getClientCustomerId().equals(TEST_CID2));
  }
}
