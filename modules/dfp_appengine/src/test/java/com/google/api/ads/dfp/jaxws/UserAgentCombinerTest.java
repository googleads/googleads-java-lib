// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.jaxws;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.inject.Guice;
import com.google.inject.Injector;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link UserAgentCombiner} with DFP and JAX-WS.
 */
@RunWith(JUnit4.class)
public class UserAgentCombinerTest {

  private static final String USER_AGENT =
      "userAgent (DfpApi-Java, Dfp-AppEngine/3.12.0, Common-Java/3.12.0,"
          + " JAX-WS/Unknown, Java/" + System.getProperty("java.version") + ", maven)";

  /**
   * Tests that the user agent is generated correctly.
   */
  @Test
  public void testUserAgent() throws Exception {
    Injector injector = Guice.createInjector(new DfpJaxWsModule());

    String userAgent = USER_AGENT;


    UserAgentCombiner userAgentCombiner = injector.getInstance(UserAgentCombiner.class);
    assertEquals(userAgent, userAgentCombiner.getUserAgent("userAgent"));
  }
}
