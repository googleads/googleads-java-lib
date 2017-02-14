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

package com.google.api.ads.adwords.lib.utils;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.logging.BatchJobLogger;
import com.google.api.ads.common.lib.testing.MockHttpServer;
import com.google.api.ads.common.lib.testing.MockResponse;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link BatchJobUploader}.
 */
@RunWith(JUnit4.class)
public class BatchJobUploaderTest {
  @Mock private AdWordsSession adWordsSession;
  @Mock private BatchJobMutateRequestInterface request;
  @Mock private BatchJobLogger batchJobLogger;
  @Mock private BatchJobUploadBodyProvider uploadBodyProvider;
  
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @SuppressWarnings("rawtypes")
  private BatchJobUploader uploader;
  
  private MockHttpServer mockHttpServer;

  @SuppressWarnings("rawtypes")
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    mockHttpServer = new MockHttpServer();
    uploader = new BatchJobUploader(adWordsSession, mockHttpServer.getHttpTransport());
    when(request.createBatchJobUploadBodyProvider()).thenReturn(uploadBodyProvider);
  }

  /**
   * Sanity check that the public constructor works properly. All other tests use the
   * package private constructor, but users of the utility will use the public one.
   */
  @SuppressWarnings("rawtypes")
  @Test
  public void testPublicConstructor() {
    assertNotNull(new BatchJobUploader(adWordsSession));
  }
  
  /**
   * Tests that IOExceptions from executing an upload request are propagated properly.
   */
  @SuppressWarnings("rawtypes")
  @Test
  public void testUploadBatchJobOperations_ioException_fails() throws Exception {
    final IOException ioException = new IOException("mock IO exception");
    MockLowLevelHttpRequest lowLevelHttpRequest = new MockLowLevelHttpRequest(){
      @Override
      public LowLevelHttpResponse execute() throws IOException {
        throw ioException;
      }
    };
    when(uploadBodyProvider.getHttpContent(request, true, true))
        .thenReturn(new ByteArrayContent(null, "foo".getBytes(UTF_8)));
    MockHttpTransport transport = new MockHttpTransport.Builder()
        .setLowLevelHttpRequest(lowLevelHttpRequest).build();
    uploader = new BatchJobUploader(adWordsSession, transport);
    thrown.expect(BatchJobException.class);
    thrown.expectCause(Matchers.sameInstance(ioException));
    BatchJobUploadStatus uploadStatus =
        new BatchJobUploadStatus(0, URI.create("http://www.example.com"));
    uploader.uploadIncrementalBatchJobOperations(request, true, uploadStatus);
  }
  
  /**
   * Tests that IOExceptions from initiating an upload are propagated properly.
   */
  @SuppressWarnings("rawtypes")
  @Test
  public void testUploadBatchJobOperations_initiateFails_fails() throws Exception {
    final IOException ioException = new IOException("mock IO exception");
    MockLowLevelHttpRequest lowLevelHttpRequest = new MockLowLevelHttpRequest(){
      @Override
      public LowLevelHttpResponse execute() throws IOException {
        throw ioException;
      }
    };
    when(uploadBodyProvider.getHttpContent(request, true, true))
        .thenReturn(new ByteArrayContent(null, "foo".getBytes(UTF_8)));
    MockHttpTransport transport = new MockHttpTransport.Builder()
        .setLowLevelHttpRequest(lowLevelHttpRequest).build();
    uploader = new BatchJobUploader(adWordsSession, transport);
    thrown.expect(BatchJobException.class);
    thrown.expectCause(Matchers.sameInstance(ioException));
    thrown.expectMessage("initiate upload");
    uploader.uploadIncrementalBatchJobOperations(request, true, new BatchJobUploadStatus(
        0, URI.create("http://www.example.com")));
  }
  
  @Test
  public void testUploadIncrementalBatchJobOperations_notFirst() throws Exception {
    BatchJobUploadStatus status =
        new BatchJobUploadStatus(10, URI.create(mockHttpServer.getServerUrl()));
    String uploadRequestBody = "<mutate>testUpload</mutate>";
    when(uploadBodyProvider.getHttpContent(request, false, true))
        .thenReturn(new ByteArrayContent(null, uploadRequestBody.getBytes(UTF_8)));
    mockHttpServer.setMockResponse(new MockResponse("testUploadResponse"));

    // Invoked the incremental upload method.
    BatchJobUploadResponse response =
        uploader.uploadIncrementalBatchJobOperations(request, true, status);
    assertEquals("Should have made one request", 1, mockHttpServer.getAllResponses().size());

    // Check the request.
    String firstRequest = mockHttpServer.getLastResponse().getRequestBody();
    String expectedBody = "testUpload</mutate>";
    expectedBody =
        Strings.padEnd(expectedBody, BatchJobUploader.REQUIRED_CONTENT_LENGTH_INCREMENT, ' ');

    assertEquals("Request body is incorrect", expectedBody, firstRequest);
    assertEquals("Request should have succeeded", 200, response.getHttpStatus());

    // Check the BatchJobUploadStatus.
    BatchJobUploadStatus expectedStatus =
        new BatchJobUploadStatus(
            status.getTotalContentLength() + expectedBody.getBytes(UTF_8).length,
            URI.create(mockHttpServer.getServerUrl()));
    BatchJobUploadStatus actualStatus = response.getBatchJobUploadStatus();
    assertEquals(
        "Status total content length is incorrect",
        expectedStatus.getTotalContentLength(),
        actualStatus.getTotalContentLength());
    assertEquals(
        "Status resumable upload URI is incorrect",
        expectedStatus.getResumableUploadUri(),
        actualStatus.getResumableUploadUri());
  }
  
  @Test
  public void testUploadIncrementalBatchJobOperations_notFirst_notLast() throws Exception {
    BatchJobUploadStatus status =
        new BatchJobUploadStatus(10, URI.create(mockHttpServer.getServerUrl()));
    String uploadRequestBody = "<mutate>testUpload</mutate>";
    when(uploadBodyProvider.getHttpContent(request, false, false))
        .thenReturn(new ByteArrayContent(null, uploadRequestBody.getBytes(UTF_8)));
    mockHttpServer.setMockResponse(new MockResponse("testUploadResponse"));

    // Invoked the incremental upload method.
    BatchJobUploadResponse response =
        uploader.uploadIncrementalBatchJobOperations(request, false, status);
    assertEquals("Should have made one request", 1, mockHttpServer.getAllResponses().size());

    // Check the request.
    String firstRequest = mockHttpServer.getLastResponse().getRequestBody();
    String expectedBody = "testUpload";
    expectedBody =
        Strings.padEnd(expectedBody, BatchJobUploader.REQUIRED_CONTENT_LENGTH_INCREMENT, ' ');

    assertEquals("Request body is incorrect", expectedBody, firstRequest);
    assertEquals("Request should have succeeded", 200, response.getHttpStatus());

    // Check the BatchJobUploadStatus.
    BatchJobUploadStatus expectedStatus =
        new BatchJobUploadStatus(
            status.getTotalContentLength() + expectedBody.getBytes(UTF_8).length,
            URI.create(mockHttpServer.getServerUrl()));
    BatchJobUploadStatus actualStatus = response.getBatchJobUploadStatus();
    assertEquals(
        "Status total content length is incorrect",
        expectedStatus.getTotalContentLength(),
        actualStatus.getTotalContentLength());
    assertEquals(
        "Status resumable upload URI is incorrect",
        expectedStatus.getResumableUploadUri(),
        actualStatus.getResumableUploadUri());
  }
  
  @Test
  public void testUploadIncrementalBatchJobOperations_firstAndLast() throws Exception {
    BatchJobUploadStatus status =
        new BatchJobUploadStatus(0, URI.create(mockHttpServer.getServerUrl()));
    String uploadRequestBody = "testUpload";
    when(uploadBodyProvider.getHttpContent(request, true, true))
        .thenReturn(new ByteArrayContent(null, uploadRequestBody.getBytes(UTF_8)));
    List<MockResponse> expectedResponses =
        Lists.newArrayList(new MockResponse("ignore"), new MockResponse("testUploadResponse"));
    mockHttpServer.setMockResponses(expectedResponses);

    // Invoked the incremental upload method.
    BatchJobUploadResponse response =
        uploader.uploadIncrementalBatchJobOperations(request, true, status);
    assertEquals("Should have made two requests", 2, mockHttpServer.getAllResponses().size());

    // Check the first request.
    String firstRequest = mockHttpServer.getAllResponses().get(0).getRequestBody();
    assertEquals("First request should have an empty body", "", firstRequest);
    assertEquals(
        "First request should include resumable header",
        "start",
        mockHttpServer.getAllResponses().get(0).getRequestHeader("x-goog-resumable").get(0));

    // Check the second request.
    assertEquals(
        "Second request body is incorrect",
        uploadRequestBody,
        mockHttpServer.getLastResponse().getRequestBody());
    assertEquals("Last request should have succeeded", 200, response.getHttpStatus());

    // Check the BatchJobUploadStatus.
    BatchJobUploadStatus expectedStatus =
        new BatchJobUploadStatus(
            uploadRequestBody.getBytes(UTF_8).length, URI.create(mockHttpServer.getServerUrl()));
    BatchJobUploadStatus actualStatus = response.getBatchJobUploadStatus();
    assertEquals(
        "Status total content length is incorrect",
        expectedStatus.getTotalContentLength(),
        actualStatus.getTotalContentLength());
    assertEquals(
        "Status resumable upload URI is incorrect",
        expectedStatus.getResumableUploadUri(),
        actualStatus.getResumableUploadUri());
  }
  
  @Test
  public void testConstructContentRangeHeaderValue_notLast_nonZeroLength_zeroPrevious() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0, null);
    long requestLength = 100;
    String expectedContentRange = "bytes 0-99/*";
    assertEquals(
        expectedContentRange,
        uploader.constructContentRangeHeaderValue(requestLength, false, status));
  }

  @Test
  public void testConstructContentRangeHeaderValue_notLast_nonZeroLength_nonZeroPrevious() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(100, null);
    long requestLength = 100;
    String expectedContentRange = "bytes 100-199/*";
    assertEquals(
        expectedContentRange,
        uploader.constructContentRangeHeaderValue(requestLength, false, status));
  }

  @Test
  public void testConstructContentRangeHeaderValue_isLast_nonZeroLength_nonZeroPrevious() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(100, null);
    long requestLength = 100;
    String expectedContentRange = "bytes 100-199/200";
    assertEquals(
        expectedContentRange,
        uploader.constructContentRangeHeaderValue(requestLength, true, status));
  }

  @Test
  public void testConstructContentRangeHeaderValue_isLast_nonZeroLength_zeroPrevious() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0, null);
    long requestLength = 100;
    String expectedContentRange = "bytes 0-99/100";
    assertEquals(
        expectedContentRange,
        uploader.constructContentRangeHeaderValue(requestLength, true, status));
  }

  @Test
  public void testConstructContentRangeHeaderValue_notLast_zeroLength() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0, null);
    thrown.expect(IllegalArgumentException.class);
    uploader.constructContentRangeHeaderValue(0, false, status);
  }


  @Test
  public void testTrimStartEndElements_isFirst_isLast() {
    List<String> testData = Lists.newArrayList();
    testData.add("<mutate><foo></foo></mutate>");
    testData.add(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v209912\"><foo></foo>"
        + "</ns1:mutate>");
    testData.add("<mutate></mutate>");

    for (String requestXml : testData) {
      String postProcessed = uploader.trimStartEndElements(requestXml, true, true);
      assertEquals(
          "Trimmed result should not change if isFirst and isLast", requestXml, postProcessed);
    }
  }

  @Test
  public void testTrimStartEndElements_notFirst_isLast() {
    List<List<String>> testData = Lists.newArrayList();
    testData.add(Lists.newArrayList("<mutate><foo></foo></mutate>", "<foo></foo></mutate>"));
    testData.add(Lists.newArrayList(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v209912\"><foo></foo>"
        + "</ns1:mutate>",
        "<foo></foo></ns1:mutate>"));
    testData.add(Lists.newArrayList("<mutate></mutate>", "</mutate>"));

    for (List<String> testPair : testData) {
      String requestXml = testPair.get(0);
      String postProcessed = uploader.trimStartEndElements(requestXml, false, true);
      assertEquals("Trimmed result should exclude starting mutate if !isFirst and isLast",
          testPair.get(1), postProcessed);
    }
  }

  @Test
  public void testTrimStartEndElements_isFirst_notLast() {
    List<List<String>> testData = Lists.newArrayList();
    testData.add(Lists.newArrayList("<mutate><foo></foo></mutate>", "<mutate><foo></foo>"));
    testData.add(Lists.newArrayList(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v209912\"><foo></foo>"
        + "</ns1:mutate>",
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v209912\"><foo></foo>"));
    testData.add(Lists.newArrayList("<mutate></mutate>", "<mutate>"));

    for (List<String> testPair : testData) {
      String requestXml = testPair.get(0);
      String postProcessed = uploader.trimStartEndElements(requestXml, true, false);
      assertEquals("Trimmed result should exclude ending mutate if isFirst and !isLast",
          testPair.get(1), postProcessed);
    }
  }

  @Test
  public void testTrimStartEndElements_notFirst_notLast() {
    List<List<String>> testData = Lists.newArrayList();
    testData.add(Lists.newArrayList("<mutate><foo></foo></mutate>", "<foo></foo>"));
    testData.add(Lists.newArrayList(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v209912\"><foo></foo>"
        + "</ns1:mutate>",
        "<foo></foo>"));
    testData.add(Lists.newArrayList("<mutate></mutate>", ""));

    for (List<String> testPair : testData) {
      String requestXml = testPair.get(0);
      String postProcessed = uploader.trimStartEndElements(requestXml, false, false);
      assertEquals(
          "Trimmed result should exclude starting and ending mutate if !isFirst and !isLast",
          testPair.get(1), postProcessed);
    }
  }

  /**
   * Verifies that {@code trimStartEndElements} fails with an {@link IllegalArgumentException} if
   * the request does not contain the expected opening or closing tag.
   */
  @Test
  public void testTrimStartEndElements_missingMutateElements() {
    List<String> testData = Lists.newArrayList();
    testData.add("<bar><foo></foo></bar>");
    testData.add(
        "<ns1:operation xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v209912\"><foo></foo>"
        + "</ns1:operation>");
    testData.add(
        "<operation xmlns=\"https://adwords.google.com/api/adwords/cm/v209912\"><foo></foo>"
        + "</operation>");

    for (String requestXml : testData) {
      // Not using ExpectedException here because the test needs to continue after each exception
      // is thrown.
      try {
        uploader.trimStartEndElements(requestXml, false, true);
        fail("Should have thrown an IllegalArgumentException for isLast and input: " + requestXml);
      } catch (IllegalArgumentException e) {
        assertTrue("Expected exception", true);
      }
      try {
        uploader.trimStartEndElements(requestXml, true, false);
        fail("Should have thrown an IllegalArgumentException for isFirst and input: " + requestXml);
      } catch (IllegalArgumentException e) {
        assertTrue("Expected exception", true);
      }
    }
  }
}
