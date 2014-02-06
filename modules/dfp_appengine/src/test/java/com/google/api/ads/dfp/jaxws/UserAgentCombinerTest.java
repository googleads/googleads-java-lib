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

import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.inject.Guice;
import com.google.inject.Injector;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link UserAgentCombiner} with DFP and JAX-WS.
 *
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class UserAgentCombinerTest extends TestCase {

  private static final String USER_AGENT =
      "userAgent (DfpApi-Java, Dfp-AppEngine/1.24.1, Common-Java/1.24.1,"
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
