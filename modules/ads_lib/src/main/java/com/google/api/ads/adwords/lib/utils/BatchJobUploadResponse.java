// Copyright 2015, Google Inc. All Rights Reserved.
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

import com.google.api.client.http.HttpResponse;
import com.google.common.base.Preconditions;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import javax.annotation.Nullable;

/**
 * Holder class for a successful batch job upload response per the
 * <a href="https://cloud.google.com/storage/docs/concepts-techniques">Google Cloud Storage
 * guidelines</a>.
 */
public class BatchJobUploadResponse {
  private final InputStream responseContent;
  private final BatchJobUploadStatus uploadStatus;
  private final int httpStatus;
  private final String httpResponseMessage;

  /**
   * @param responseContent the contents of the response
   * @param httpStatus the HTTP status code from the response
   * @param httpResponseMessage the HTTP status message from the response
   * @param totalContentLength the total content length for the batch job, including the length
   * from this response's corresponding request
   * @param resumableSessionURI the URI to use for further incremental uploads
   * @throws NullPointerException if {@code responseContent} is null.
   */
  public BatchJobUploadResponse(InputStream responseContent, int httpStatus,
      String httpResponseMessage, long totalContentLength, @Nullable URI resumableSessionURI) {
    this.responseContent = Preconditions.checkNotNull(responseContent, "Null response content");
    this.httpStatus = httpStatus;
    this.httpResponseMessage = httpResponseMessage;
    this.uploadStatus = new BatchJobUploadStatus(totalContentLength, resumableSessionURI);
  }

  /**
   * Constructs a new instance from a {@link HttpResponse}.
   *
   * @param httpResponse the response
   * @param totalContentLength the total content length for the batch job, including the length
   * from this response's corresponding request
   * @param resumableSessionURI the URI to use for further incremental uploads
   * @throws IOException if unable to get attributes of the response
   * @throws NullPointerException is {@code httpResponse} is null.
   */
  public BatchJobUploadResponse(HttpResponse httpResponse, long totalContentLength,
      @Nullable URI resumableSessionURI) throws IOException {
    this(Preconditions.checkNotNull(httpResponse, "Null HTTP response").getContent(),
        httpResponse.getStatusCode(), httpResponse.getStatusMessage(), totalContentLength,
        resumableSessionURI);
  }

  public int getHttpStatus() {
    return httpStatus;
  }

  public String getHttpResponseMessage() {
    return httpResponseMessage;
  }

  /**
   * Returns the HTTP response content.
   */
  public InputStream getResponseContent() {
    return responseContent;
  }

  public BatchJobUploadStatus getBatchJobUploadStatus() {
    return uploadStatus;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("httpStatus", httpStatus)
        .append("httpResponseMessage", httpResponseMessage)
        .append("uploadStatus", uploadStatus)
        .append("hasContent", responseContent != null)
        .toString();
  }
}
