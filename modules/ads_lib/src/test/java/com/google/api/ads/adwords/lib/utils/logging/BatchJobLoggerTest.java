// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.logging;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.utils.BatchJobMutateResponseInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResultInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponseException;
import com.google.common.io.ByteSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import java.io.IOException;

/**
 * Tests for {@link BatchJobLogger}.
 */
@RunWith(JUnit4.class)
public class BatchJobLoggerTest {
  private BatchJobLogger batchJobLogger;

  @Mock
  private Logger logger;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    when(logger.isDebugEnabled()).thenReturn(true);
    batchJobLogger = new BatchJobLogger(logger);
  }

  @After
  public void tearDown() throws Exception {
    // Not concerned with whether isDebugEnabled was invoked.
    verify(logger, atLeast(0)).isDebugEnabled();

    // Confirm that all logger method invocations have been verified. This ensures that the test
    // will fail if it verified a call to info and a call to debug, but then there was an
    // unexpected call to warn (for example).
    verifyNoMoreInteractions(logger);
  }

  /**
   * Verifies that if all arguments to {@code logUpload} are null, the logger logs a success
   * message.
   */
  @Test
  public void testLogUpload_allNullArgumentsLoggedAsSuccessToInfo() {
    batchJobLogger.logUpload(null, null, null, null);

    // Verify the INFO level log message is correct.
    verify(logger, times(1))
        .info(Matchers.notNull(String.class), Matchers.contains(BatchJobLogger.SUCCESS_STATUS),
            Matchers.isNull());


    // Verify the DEBUG level log message is correct.
    verify(logger, times(1))
        .debug(Matchers.notNull(String.class), Matchers.contains(BatchJobLogger.SUCCESS_STATUS),
            Matchers.isNull(), Matchers.isNull());
  }

  /**
   * Verifies that if all arguments to {@code logUpload} are null except for the exception, the
   * logger logs a failure message.
   */
  @Test
  public void testLogUpload_exceptionLoggedAsFailureToWarn() {
    Exception exception = new IllegalArgumentException("Some failure");
    batchJobLogger.logUpload(null, null, null, exception);

    // Verify the WARN level log message is correct.
    verify(logger, times(1))
        .warn(Matchers.notNull(String.class), Matchers.contains(BatchJobLogger.FAILURE_STATUS),
            Matchers.isNull(), Matchers.same(exception));

    // Verify the DEBUG level log message is correct.
    verify(logger, times(1))
        .debug(Matchers.notNull(String.class), Matchers.contains(BatchJobLogger.FAILURE_STATUS),
            Matchers.isNull(), Matchers.isNull());
  }

  /**
   * Verifies that all relevant information is logged to the proper levels for a successful
   * upload.
   */
  @Test
  public void testLogUpload_success() throws IOException {
    String uploadContents = "<mutate><a></a></mutate>";
    Object uploadUrl = "http://www.example.com/upload";
    String responseBody = "Upload succeeded";
    int responseCode = 200;
    String responseMessage = "OK";
    BatchJobUploadResponse uploadResponse =
        new BatchJobUploadResponse(ByteSource.wrap(responseBody.getBytes()).openStream(),
            responseCode, responseMessage, uploadContents.getBytes().length, null);

    ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);

    batchJobLogger.logUpload(uploadContents, uploadUrl, uploadResponse, null);

    // Verify the INFO level log message is correct.
    verify(logger, times(1))
        .info(Matchers.notNull(String.class), messageCaptor.capture(), Matchers.eq(uploadUrl));

    assertThat("A null exception should be logged as successful", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(BatchJobLogger.SUCCESS_STATUS));
    assertThat("HTTP response code should be logged", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(Integer.toString(responseCode)));
    assertThat("HTTP response message should be logged", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(responseMessage));

    messageCaptor = ArgumentCaptor.forClass(String.class);

    // Verify the DEBUG level log message is correct.
    verify(logger, times(1))
        .debug(Matchers.notNull(String.class), messageCaptor.capture(), Matchers.eq(uploadUrl),
            Matchers.eq(uploadContents));

    assertThat("A null exception should be logged as successful", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(BatchJobLogger.SUCCESS_STATUS));
    assertThat("HTTP response code should be logged", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(Integer.toString(responseCode)));
    assertThat("HTTP response message should be logged", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(responseMessage));
  }

  /**
   * Verifies that all relevant information is logged to the proper levels for a failed
   * upload.
   */
  @Test
  public void testLogUpload_failure() throws IOException {
    String uploadContents = "<mutate><a></a></mutate>";
    Object uploadUrl = "http://www.example.com/upload";
    String responseBody = "Something went terribly wrong!";
    int responseCode = 500;
    String responseMessage = "Internal Server Error";
    BatchJobUploadResponse uploadResponse =
        new BatchJobUploadResponse(ByteSource.wrap(responseBody.getBytes()).openStream(),
            responseCode, responseMessage, uploadContents.getBytes().length, null);
    Exception exception =
        new HttpResponseException.Builder(responseCode, responseMessage, new HttpHeaders()).build();

    ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);

    batchJobLogger.logUpload(uploadContents, uploadUrl, uploadResponse, exception);

    // Verify the WARN level log message is correct.
    verify(logger, times(1))
        .warn(Matchers.notNull(String.class), messageCaptor.capture(), Matchers.eq(uploadUrl),
            Matchers.same(exception));

    assertThat("A non-null exception should be logged as failed", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(BatchJobLogger.FAILURE_STATUS));
    assertThat("HTTP response code should be logged", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(Integer.toString(responseCode)));
    assertThat("HTTP response message should be logged", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(responseMessage));

    messageCaptor = ArgumentCaptor.forClass(String.class);

    // Verify the DEBUG level log message is correct.
    verify(logger, times(1))
        .debug(Matchers.notNull(String.class), messageCaptor.capture(), Matchers.eq(uploadUrl),
            Matchers.eq(uploadContents));

    assertThat("A non-null exception should be logged as failed", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(BatchJobLogger.FAILURE_STATUS));
    assertThat("HTTP response code should be logged", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(Integer.toString(responseCode)));
    assertThat("HTTP response message should be logged", messageCaptor.getValue(),
        org.hamcrest.Matchers.containsString(responseMessage));
  }

  /**
   * Verifies that if all arguments to {@code logDownload} are null, the logger logs a success
   * message.
   */
  @Test
  public void testLogDownload_allNullArgumentsLoggedAsSuccessToInfo() {
    batchJobLogger.logDownload(null, null, null);

    // Verify the INFO level log message is correct.
    verify(logger, times(1))
        .info(Matchers.notNull(String.class), Matchers.contains(BatchJobLogger.SUCCESS_STATUS),
            Matchers.eq(0), Matchers.isNull());
  }

  /**
   * Verifies that all relevant information is logged to the proper levels for a failed
   * download with a null download URL and response.
   */
  @Test
  public void testLogDownload_exceptionLoggedAsFailureToWarn() {
    Exception exception = new IllegalArgumentException("Some failure");
    batchJobLogger.logDownload(null, null, exception);

    // Verify the WARN level log message is correct.
    verify(logger, times(1))
        .warn(Matchers.notNull(String.class), Matchers.contains(BatchJobLogger.FAILURE_STATUS),
            Matchers.isNull(), Matchers.same(exception));
  }

  /**
   * Verifies that all relevant information is logged to the proper levels for a successful
   * download.
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testLogDownload_success() {
    BatchJobMutateResponseInterface<String, Exception,
        BatchJobMutateResultInterface<String, Exception>> response =
        Mockito.mock(BatchJobMutateResponseInterface.class);
    int numberOfResults = 5;
    when(response.getMutateResults())
        .thenReturn(new BatchJobMutateResultInterface[numberOfResults]);
    String downloadUrl = "http://www.example.com/download";
    batchJobLogger.logDownload(downloadUrl, response, null);

    // Verify the INFO level log message is correct.
    verify(logger, times(1))
        .info(Matchers.notNull(String.class), Matchers.contains(BatchJobLogger.SUCCESS_STATUS),
            Matchers.eq(numberOfResults), Matchers.eq(downloadUrl));
  }

  /**
   * Verifies that all relevant information is logged to the proper levels for a failed
   * download with a non-null download URL.
   */
  @Test
  public void testLogDownload_failure() {
    Exception exception = new IllegalArgumentException("Some failure");
    String downloadUrl = "http://www.example.com/download";
    batchJobLogger.logDownload(downloadUrl, null, exception);

    // Verify the WARN level log message is correct.
    verify(logger, times(1))
        .warn(Matchers.notNull(String.class), Matchers.contains(BatchJobLogger.FAILURE_STATUS),
            Matchers.eq(downloadUrl), Matchers.same(exception));
  }
}
