// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.utils.logging;

import static org.mockito.Mockito.verify;

import com.google.api.ads.common.lib.client.RemoteCallReturn;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** Test for the {@link AdsServiceLoggers} class. */
@RunWith(JUnit4.class)
public class AdsServiceLoggersTest {

  private AdsServiceLoggers adsServiceLoggers;

  @Mock private RemoteCallReturn remoteCallReturn;
  @Mock private RemoteCallLoggerDelegate loggerDelegate;

  public AdsServiceLoggersTest() {}

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    adsServiceLoggers = new AdsServiceLoggers(loggerDelegate);
  }

  @Test
  public void testLogRequest() {
    adsServiceLoggers.logRequest(remoteCallReturn);
    verify(loggerDelegate).logRequestSummary(remoteCallReturn);
    verify(loggerDelegate).logRequestDetails(remoteCallReturn);
  }
}