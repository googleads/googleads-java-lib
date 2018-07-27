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

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.axis.v201806.cm.ApiError;
import com.google.api.ads.adwords.axis.v201806.cm.ApiException;
import com.google.api.ads.adwords.axis.v201806.cm.RateExceededError;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * Test case for the {@link ApiRateLimiter} class.
 */
@RunWith(JUnit4.class)
public class ApiRateLimiterTest {
  private static final Long TEST_CID = 1L;
  private static final Object DUMMY_OBJECT = new Object();
  private static final Object[] EMPTY_ARGS = new Object[0];

  private static final int RETRY_AFTER_SECONDS = 1;
  private static final int LONG_RETRY_AFTER_SECONDS = 5;

  private static final RateExceededError rateExceededError = new RateExceededError();
  private static final RateExceededError rateExceededErrorLong = new RateExceededError();
  private static final ApiException rateExceededException = new ApiException();
  private static final ApiException rateExceededExceptionLong = new ApiException();

  private static final ApiException otherApiException = new ApiException();
  private static final RemoteException remoteException = new RemoteException("message");

  // Overwrite default configuration.
  private static final int MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR = 3;
  private static final int MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR = 5;
  private static Properties systemPropertiesRestore;

  // The service that mocks AdWords API services.
  private interface MockService {
    Object invoke() throws RemoteException;
  }

  @Mock private final MockService mockService = Mockito.mock(MockService.class);
  private Method method;
  private ApiRateLimiter rateLimiter;

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @BeforeClass
  public static void beforeClass() {
    systemPropertiesRestore = System.getProperties();

    System.setProperty(
        ApiServicesRetryStrategy.MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY,
        String.valueOf(MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR));
    System.setProperty(
        ApiServicesRetryStrategy.MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_PROPERTY,
        String.valueOf(MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR));

    rateExceededError.setRateScope("DEVELOPER");
    rateExceededError.setRetryAfterSeconds(RETRY_AFTER_SECONDS);
    rateExceededException.setErrors(new ApiError[] {rateExceededError});

    rateExceededErrorLong.setRateScope("DEVELOPER");
    rateExceededErrorLong.setRetryAfterSeconds(LONG_RETRY_AFTER_SECONDS);
    rateExceededExceptionLong.setErrors(new ApiError[] {rateExceededErrorLong});
  }

  @AfterClass
  public static void tearDown() {
    System.setProperties(systemPropertiesRestore);
  }

  @Before
  public void setUp() throws Exception {
    method = mockService.getClass().getDeclaredMethod("invoke");
    rateLimiter = new ApiRateLimiter(ApiServicesRetryStrategy.newInstance());
  }

  private static void assertExceptionType(Throwable e, Class<?> type) {
    assertTrue("Unexpected exception type!", type.isInstance(e));
  }

  private static void assertExceptionCause(Throwable e, Class<?> type) {
    assertTrue("Unexpected exeption cause!", type.isInstance(e.getCause()));
  }
  
  // Test that AdWords API call succeeds.
  @Test
  public void testPass() throws Throwable {
    when(mockService.invoke()).thenReturn(DUMMY_OBJECT);
    rateLimiter.run(TEST_CID, mockService, method, EMPTY_ARGS);
  }

  // Test that AdWords API call failed with RateExceededError first, but succeeds on retry.
  @Test
  public void testPassAfterOneRetry() throws Throwable {
    when(mockService.invoke()).thenThrow(rateExceededException).thenReturn(DUMMY_OBJECT);

    long startTime = System.currentTimeMillis();
    rateLimiter.run(TEST_CID, mockService, method, EMPTY_ARGS);
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;

    long minWaitMillis =
        SECONDS.toMillis(RETRY_AFTER_SECONDS * ApiServicesRetryStrategy.MIN_WAIT_TIME_MULTIPLIER);
    assertTrue("Unexpected execution duration!", duration > minWaitMillis);
  }

  // Test that AdWords API call failed with RateExceededError with all retries.
  @Test
  public void testFailWithRateExceededError() throws Throwable {
    when(mockService.invoke()).thenThrow(rateExceededException);

    long startTime = System.currentTimeMillis();
    try {
      rateLimiter.run(TEST_CID, mockService, method, EMPTY_ARGS);
    } catch (Throwable e) {
      assertExceptionType(e, ApiException.class);
    }
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;

    // The last attempt failure will skip wait and propagate error immediately.
    int waitedAttempts = MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR - 1;
    long minWaitMillis =
        SECONDS.toMillis(
            RETRY_AFTER_SECONDS
                * ApiServicesRetryStrategy.MIN_WAIT_TIME_MULTIPLIER
                * waitedAttempts);
    assertTrue("Unexpected execution duration!", duration > minWaitMillis);
  }

  // Test that AdWords API call failed with RateExceededError with all retries.
  @Test
  public void testMaxWaitTimeWithRateExceededError() throws Throwable {
    when(mockService.invoke()).thenThrow(rateExceededExceptionLong);

    try {
      rateLimiter.run(TEST_CID, mockService, method, EMPTY_ARGS);
    } catch (Throwable e) {
      assertExceptionType(e, RateLimiterException.class);
      assertExceptionCause(e, ApiException.class);
    }
  }

  // Test that AdWords API call failed with other ApiException.
  @Test
  public void testFailWithOtherApiException() throws Throwable {
    when(mockService.invoke()).thenThrow(otherApiException);

    thrown.expect(ApiException.class);
    rateLimiter.run(TEST_CID, mockService, method, EMPTY_ARGS);
  }

  // Test that AdWords API call failed with RemoteException.
  @Test
  public void testFailWithRemoteException() throws Throwable {
    when(mockService.invoke()).thenThrow(remoteException);

    thrown.expect(RemoteException.class);
    rateLimiter.run(TEST_CID, mockService, method, EMPTY_ARGS);
  }
}
