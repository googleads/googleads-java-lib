// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.logging.BatchJobLogger;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;

/**
 * Utility for uploading operations to a BatchJob and downloading results from
 * a completed BatchJob.
 */
public class BatchJobUploader {
  private final AdWordsSession session;
  private final HttpTransport httpTransport;
  private final BatchJobLogger batchJobLogger;

  /**
   * For incremental uploads, each request's contents must have a length in bytes
   * divisible by this size.
   */
  @VisibleForTesting
  static final int REQUIRED_CONTENT_LENGTH_INCREMENT = 262144;

  @Inject
  BatchJobUploader(
      AdWordsSession session, HttpTransport httpTransport, BatchJobLogger batchJobLogger) {
    this.session = session;
    this.httpTransport = httpTransport;
    this.batchJobLogger = batchJobLogger;
  }

  private HttpHeaders createHttpHeaders() {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType("application/xml");
    headers.setUserAgent(session.getUserAgent());
    return headers;
  }

  /**
   * Incrementally uploads a batch job's operations and returns the response.
   *
   * @param request the request to upload
   * @param isLastRequest if the request is the last request in the sequence of uploads for the job
   * @param batchJobUploadStatus the current upload status of the job
   */
  public BatchJobUploadResponse uploadIncrementalBatchJobOperations(
      final BatchJobMutateRequestInterface request, final boolean isLastRequest,
      BatchJobUploadStatus batchJobUploadStatus) throws BatchJobException {
    Preconditions.checkNotNull(batchJobUploadStatus, "Null batch job upload status");
    Preconditions.checkNotNull(
        batchJobUploadStatus.getResumableUploadUri(), "No resumable session URI");

    // This reference is final because it is referenced below within an anonymous class.
    final BatchJobUploadStatus effectiveStatus;
    if (batchJobUploadStatus.getTotalContentLength() == 0) {
      // If this is the first upload, then issue a request to get the resumable session URI from
      // Google Cloud Storage.
      URI uploadUri = initiateResumableUpload(batchJobUploadStatus.getResumableUploadUri());
      effectiveStatus = new BatchJobUploadStatus(0, uploadUri);
    } else {
      effectiveStatus = batchJobUploadStatus;
    }

    // The process below follows the Google Cloud Storage guidelines for resumable
    // uploads of unknown size:
    // https://cloud.google.com/storage/docs/concepts-techniques#unknownresumables
    ByteArrayContent content = request.createBatchJobUploadBodyProvider().getHttpContent(
        request, effectiveStatus.getTotalContentLength() == 0, isLastRequest);
    try {
      content = postProcessContent(
          content, effectiveStatus.getTotalContentLength() == 0L, isLastRequest);
    } catch (IOException e) {
      throw new BatchJobException("Failed to post-process the request content", e);
    }

    String requestXml = null;
    Throwable exception = null;
    BatchJobUploadResponse batchJobUploadResponse = null;
    final long contentLength = content.getLength();

    try {
      HttpRequestFactory requestFactory =
          httpTransport.createRequestFactory(
              req -> {
                HttpHeaders headers = createHttpHeaders();
                headers.setContentLength(contentLength);
                headers.setContentRange(
                    constructContentRangeHeaderValue(
                        contentLength, isLastRequest, effectiveStatus));
                req.setHeaders(headers);
                req.setLoggingEnabled(true);
              });

      // Incremental uploads require a PUT request.
      HttpRequest httpRequest =
          requestFactory.buildPutRequest(
              new GenericUrl(effectiveStatus.getResumableUploadUri()), content);

      requestXml = Streams.readAll(content.getInputStream(), UTF_8);
      content.getInputStream().reset();

      HttpResponse response = httpRequest.execute();
      batchJobUploadResponse = new BatchJobUploadResponse(
          response,
          effectiveStatus.getTotalContentLength() + httpRequest.getContent().getLength(),
          effectiveStatus.getResumableUploadUri());
      return batchJobUploadResponse;
    } catch (HttpResponseException e) {
      if (e.getStatusCode() == 308) {
        // 308 indicates that the upload succeeded.
        batchJobUploadResponse =
            new BatchJobUploadResponse(new ByteArrayInputStream(new byte[0]), e.getStatusCode(),
                e.getStatusMessage(), effectiveStatus.getTotalContentLength() + contentLength,
                effectiveStatus.getResumableUploadUri());
        return batchJobUploadResponse;
      }
      exception = e;
      throw new BatchJobException("Failed response status from batch upload URL.", e);
    } catch (IOException e) {
      exception = e;
      throw new BatchJobException("Problem sending data to batch upload URL.", e);
    } finally {
      batchJobLogger.logUpload(
          requestXml, effectiveStatus.getResumableUploadUri(), batchJobUploadResponse, exception);
    }
  }

  /**
   * Initiates the resumable upload by sending a request to Google Cloud Storage.
   *
   * @param batchJobUploadUrl the {@code uploadUrl} of a {@code BatchJob}
   * @return the URI for the initiated resumable upload
   */
  private URI initiateResumableUpload(URI batchJobUploadUrl) throws BatchJobException {
    // This follows the Google Cloud Storage guidelines for initiating resumable uploads:
    // https://cloud.google.com/storage/docs/resumable-uploads-xml
    HttpRequestFactory requestFactory =
        httpTransport.createRequestFactory(
            req -> {
              HttpHeaders headers = createHttpHeaders();
              headers.setContentLength(0L);
              headers.set("x-goog-resumable", "start");
              req.setHeaders(headers);
              req.setLoggingEnabled(true);
            });

    try {
      HttpRequest httpRequest =
          requestFactory.buildPostRequest(new GenericUrl(batchJobUploadUrl), new EmptyContent());
      HttpResponse response = httpRequest.execute();
      if (response.getHeaders() == null || response.getHeaders().getLocation() == null) {
        throw new BatchJobException(
            "Initiate upload failed. Resumable upload URI was not in the response.");
      }
      return URI.create(response.getHeaders().getLocation());
    } catch (IOException e) {
      throw new BatchJobException("Failed to initiate upload", e);
    }
  }

  /**
   * Post-processes the request content to conform to the requirements of Google Cloud Storage.
   *
   * @param content the content produced by the {@link BatchJobUploadBodyProvider}.
   * @param isFirstRequest if this is the first request for the batch job.
   * @param isLastRequest if this is the last request for the batch job.
   */
  private ByteArrayContent postProcessContent(
      ByteArrayContent content, boolean isFirstRequest, boolean isLastRequest) throws IOException {
    if (isFirstRequest && isLastRequest) {
      return content;
    }

    String serializedRequest = Streams.readAll(content.getInputStream(), UTF_8);

    serializedRequest = trimStartEndElements(serializedRequest, isFirstRequest, isLastRequest);

    // The request is part of a set of incremental uploads, so pad to the required content
    // length. This is not necessary if all operations for the job are being uploaded in a
    // single request.
    int numBytes = serializedRequest.getBytes(UTF_8).length;
    int remainder = numBytes % REQUIRED_CONTENT_LENGTH_INCREMENT;
    if (remainder > 0) {
      int pad = REQUIRED_CONTENT_LENGTH_INCREMENT - remainder;
      serializedRequest = Strings.padEnd(serializedRequest, numBytes + pad, ' ');
    }
    return new ByteArrayContent(content.getType(), serializedRequest.getBytes(UTF_8));
  }

  /**
   * Returns {@code serializedRequest} with the start or end {@code mutate} element removed,
   * depending on whether the request is the first and/or last request.
   *
   * <p>Callers should ensure that {@code serializedRequest} does <em>not</em> contain an XML
   * declaration.
   */
  @VisibleForTesting
  String trimStartEndElements(
      String serializedRequest, boolean isFirstRequest, boolean isLastRequest) {
    int beginIndex = 0;
    int endIndex = serializedRequest.length();
    if (!isFirstRequest) {
      // Move the beginIndex (inclusive) to the character after the first opening tag, which
      // should be a "<mutate>" tag, possibly with namespace declarations.
      beginIndex = serializedRequest.indexOf('>') + 1;
      Preconditions.checkArgument(
          serializedRequest.substring(0, beginIndex - 1).contains("mutate"),
          "Did not find an opening <mutate> element at the beginning of serialized request: %s",
          serializedRequest);
    }
    if (!isLastRequest) {
      // Move the endIndex (exclusive) to the beginning of the first closing tag, which
      // should be a "</mutate>" tag.
      endIndex = serializedRequest.lastIndexOf('<');
      Preconditions.checkArgument(serializedRequest.substring(endIndex).contains("mutate"),
          "Did not find a closing </mutate> element at the end of serialized request: %s",
          serializedRequest);
    }
    return serializedRequest.substring(beginIndex, endIndex);
  }

  /**
   * Constructs the content range header value for the specified arguments.
   * @param requestLength the length of the request that's about to be uploaded
   * @param isLastRequest if the request is the last request for the job
   * @param batchJobUploadStatus the status of the job <em>before</em> this upload
   * @return the content range header value, e.g., {@code bytes 0-99/100},
   * {@code 100-199/*}, etc.
   */
  @VisibleForTesting
  String constructContentRangeHeaderValue(
      long requestLength, boolean isLastRequest, BatchJobUploadStatus batchJobUploadStatus) {
    Preconditions.checkArgument(requestLength > 0, "Request length %s is <= 0", requestLength);
    long previousTotalLength = batchJobUploadStatus.getTotalContentLength();
    long contentLowerBound = previousTotalLength;
    long contentUpperBound = previousTotalLength + requestLength - 1;

    String totalBytesString;
    if (isLastRequest) {
      totalBytesString = String.valueOf(contentUpperBound + 1);
    } else {
      totalBytesString = "*";
    }
    return String.format("bytes %d-%d/%s", contentLowerBound, contentUpperBound, totalBytesString);
  }
}
