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

import static org.junit.Assert.assertEquals;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Test case for the {@link AdWordsSessionUtil} class. */
@RunWith(JUnit4.class)
public class AdWordsSessionUtilTest {
  private static final String CID_WITH_DASH = "123-456-7890";
  private static final String CID_WITHOUT_DASH = CID_WITH_DASH.replace("-", "");
  private static final long CID_VALID = Long.parseLong(CID_WITHOUT_DASH);
  private static final String CID_EMPTY = "";
  private static final String CID_INVALID1 = "123-456-7890A";
  private static final String CID_INVALID2 = "abc";
  
  @Test
  public void testNullCidSession() throws ValidationException {
    AdWordsSession session = getTestAdWordsSessionWithoutCid();
    assertEquals(
        "Null cid test failed.",
        AdWordsSessionUtil.VIRTUAL_CID,
        AdWordsSessionUtil.getClientCustomerId(session));
  }
  
  @Test
  public void testCidWithDash() throws ValidationException {
    AdWordsSession session = getTestAdWordsSessionWithoutCid();
    session.setClientCustomerId(CID_WITH_DASH);
    assertEquals(
        "Valid cid with dash test failed.",
        CID_VALID,
        AdWordsSessionUtil.getClientCustomerId(session));
  }

  @Test
  public void testCidWithoutDash() throws ValidationException {
    AdWordsSession session = getTestAdWordsSessionWithoutCid();
    session.setClientCustomerId(CID_WITHOUT_DASH);
    assertEquals(
        "Valid cid without dash test failed.",
        CID_VALID,
        AdWordsSessionUtil.getClientCustomerId(session));
  }
  
  @Test(expected = RateLimiterException.class)
  public void testEmptyCid() throws ValidationException {
    getInvalidCid(CID_EMPTY);
  }
  
  @Test(expected = RateLimiterException.class)
  public void testInvalidCid1() throws ValidationException {
    getInvalidCid(CID_INVALID1);
  }

  @Test(expected = RateLimiterException.class)
  public void testInvalidCid2() throws ValidationException {
    getInvalidCid(CID_INVALID2);
  }

  protected static AdWordsSession getTestAdWordsSessionWithoutCid() throws ValidationException {
    return new AdWordsSession.Builder()
        .withEndpoint("http://www.google.com")
        .withDeveloperToken("DeveloperToken")
        .withUserAgent("UserAgent")
        .withOAuth2Credential(new GoogleCredential.Builder().build())
        .build();
  }
  
  private static long getInvalidCid(String invalidCid) throws ValidationException {
    AdWordsSession session = getTestAdWordsSessionWithoutCid();
    session.setClientCustomerId(invalidCid);
    return AdWordsSessionUtil.getClientCustomerId(session);
  }
}
