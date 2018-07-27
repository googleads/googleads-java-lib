package com.google.api.ads.adwords.extension.ratelimiter;

import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.axis.v201806.cm.ApiError;
import com.google.api.ads.adwords.axis.v201806.cm.ApiException;
import com.google.api.ads.adwords.axis.v201806.cm.RateExceededError;
import com.google.api.ads.adwords.extension.ratelimiter.ApiServicesRetryStrategy.DateProvider;
import com.google.api.ads.adwords.extension.ratelimiter.ApiServicesRetryStrategy.RandomProvider;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ApiServicesRetryStrategyTest {

  private static final ApiException accountException = new ApiException();
  private static final ApiException developerException = new ApiException();
  private static final ApiException noRetryException = new ApiException();
  private static final RateExceededError developerError = new RateExceededError();
  private static final RateExceededError accountError = new RateExceededError();
  private static final RateExceededError noRetryError = new RateExceededError();
  private ApiServicesRetryStrategy retries;

  @Mock private Random mockRandom;

  @Before
  public void setup() {
    accountError.setRateScope("ACCOUNT");
    accountError.setRetryAfterSeconds(10);
    accountException.setErrors(new ApiError[] {accountError});
    developerError.setRateScope("DEVELOPER");
    developerError.setRetryAfterSeconds(10);
    developerException.setErrors(new ApiError[] {developerError});
    noRetryError.setRateScope("UNKNOWN");
    noRetryError.setRetryAfterSeconds(10);
    noRetryException.setErrors(new ApiError[] {noRetryError});

    retries =
        new ApiServicesRetryStrategy(new FakeDateProvider(), new FakeRandomProvider(mockRandom));

    when(mockRandom.nextDouble()).thenReturn(1.0);
  }

  @Test
  public void ApiServicesRetryStrategy_shouldRetryOnError_retriesAccountLimit() {
    assertThat(retries.shouldRetryOnError(123, accountException)).isTrue();
  }

  @Test
  public void ApiServicesRetryStrategy_shouldRetryOnError_retriesDeveloperLimit() {
    assertThat(retries.shouldRetryOnError(123, developerException)).isTrue();
  }

  @Test
  public void ApiServicesRetryStrategy_shouldRetryOnError_noRetryInvalidException() {
    assertThat(retries.shouldRetryOnError(123, noRetryException)).isFalse();
  }

  @Test
  public void ApiServicesRetryStrategy_shouldRetryOnError_incrementsWaitTimeForAcccount() {
    retries.shouldRetryOnError(123, accountException);
    assertThat(retries.getAccountWaitTime(123)).isEqualTo(20000);
    assertThat(retries.getDeveloperWaitTime()).isEqualTo(0);
  }

  @Test
  public void ApiServicesRetryStrategy_shouldRetryOnError_incrementsWaitTimeForDeveloper() {
    retries.shouldRetryOnError(123, developerException);
    assertThat(retries.getDeveloperWaitTime()).isEqualTo(20000);
    assertThat(retries.getAccountWaitTime(123)).isEqualTo(0);
  }

  @Test
  public void ApiServicesRetryStrategy_calcWaitTimeBeforeCall_respectsHigherAccount() {
    accountError.setRetryAfterSeconds(20);
    retries.shouldRetryOnError(123, accountException);
    retries.shouldRetryOnError(123, developerException);
    assertThat(retries.calcWaitTimeBeforeCall(123, 0, null)).isEqualTo(40000);
  }

  @Test
  public void ApiServicesRetryStrategy_calcWaitTimeBeforeCall_respectsHigherDeveloper() {
    developerError.setRetryAfterSeconds(20);
    retries.shouldRetryOnError(123, accountException);
    retries.shouldRetryOnError(123, developerException);
    assertThat(retries.calcWaitTimeBeforeCall(123, 0, null)).isEqualTo(40000);
  }

  private static class FakeDateProvider implements DateProvider {

    @Override
    public long getNowInMillis() {
      return 0;
    }
  }

  private static class FakeRandomProvider implements RandomProvider {

    private final Random random;

    public FakeRandomProvider(Random random) {
      this.random = random;
    }

    @Override
    public Random get() {
      return random;
    }
  }
}
