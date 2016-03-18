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

package com.google.api.ads.common.lib.useragent;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Test for {@link UserAgentCombiner}.

 */
@RunWith(JUnit4.class)
public class UserAgentCombinerTest {

  private UserAgentCombiner userAgentCombiner;

  @Mock private UserAgentProvider userAgentProvider1;
  @Mock private UserAgentProvider userAgentProvider2;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    userAgentCombiner =
        new UserAgentCombiner(Lists.newArrayList(userAgentProvider1, userAgentProvider2));
  }

  @Test
  public void testGenerateLibraryUserAgent() {
    String nonLibraryUserAgent = "myUserAgent";

    when(userAgentProvider1.getUserAgent()).thenReturn("userAgent/1");
    when(userAgentProvider2.getUserAgent()).thenReturn("userAgent/2");

    assertEquals("myUserAgent (userAgent/1, userAgent/2)",
        userAgentCombiner.getUserAgent(nonLibraryUserAgent));
  }
}
