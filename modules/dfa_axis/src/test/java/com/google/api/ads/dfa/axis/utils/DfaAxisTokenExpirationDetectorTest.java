// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.axis.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.axis.AxisFault;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test for the {@link DfaAxisTokenExpirationDetector} class.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class DfaAxisTokenExpirationDetectorTest {

  private DfaAxisTokenExpirationDetector detector;

  @Before
  public void setUp() throws Exception {
    detector = new DfaAxisTokenExpirationDetector();
  }

  @Test
  public void testIsTokenExpirationException_AxisException_true() throws Exception {
    assertTrue(detector.isTokenExpiredException(
        new MockAxisException(DfaAxisTokenExpirationDetector.TOKEN_EXPIRED_CODE,
            DfaAxisTokenExpirationDetector.TOKEN_EXPIRED_MESSAGE)));
  }

  @Test
  public void testIsTokenExpirationException_AxisException_wrongMessage() throws Exception {
    assertFalse(detector.isTokenExpiredException(
        new MockAxisException(DfaAxisTokenExpirationDetector.TOKEN_EXPIRED_CODE,
            "Some other msg.")));
  }

  @Test
  public void testIsTokenExpirationException_AxisException_wrongCode() throws Exception {
    assertFalse(detector.isTokenExpiredException(
        new MockAxisException(22, DfaAxisTokenExpirationDetector.TOKEN_EXPIRED_MESSAGE)));
  }

  @Test
  public void testIsTokenExpirationException_AxisException_false() throws Exception {
    assertFalse(detector.isTokenExpiredException(new MockAxisException(42, "")));
  }

  @Test
  public void testIsTokenExpirationException_notAxisException() throws Exception {
    assertFalse(detector.isTokenExpiredException(new NullPointerException()));
  }

  @Test
  public void testIsTokenExpirationException_noSuchMethodException() throws Exception {
    final class NoSuchMethodThrower extends AxisFault {}
    assertFalse(detector.isTokenExpiredException(new NoSuchMethodThrower()));
  }

  private static class MockAxisException extends AxisFault {
    private final long errorCode;
    private final String errorMessage;

    public MockAxisException(long errorCode, String errorMessage) {
      this.errorCode = errorCode;
      this.errorMessage = errorMessage;
    }

    @SuppressWarnings("unused") // Called via reflection.
    public long getErrorCode() {
      return errorCode;
    }

    @SuppressWarnings("unused") // Called via reflection.
    public String getErrorMessage() {
      return errorMessage;
    }
  }
}
