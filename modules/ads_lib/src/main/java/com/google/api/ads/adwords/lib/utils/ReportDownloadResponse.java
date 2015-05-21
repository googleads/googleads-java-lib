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

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.common.lib.utils.Streams;
import com.google.common.base.Preconditions;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

import javax.annotation.Nullable;

/**
 * Holder class for http status and response body for a <em>successful</em> request.
 *
 * @author Kevin Winter
 */
public class ReportDownloadResponse {

  private static final String HTTP_SUCCESS_MESSAGE = "SUCCESS";

  private final RawReportDownloadResponse rawResponse;

  /**
   * Constructs a new instance from a successful raw response.
   *
   * @throws NullPointerException if {@code rawResponse} is null.
   * @throws IllegalArgumentException if {@code rawResponse} does not have a successful HTTP status.
   */
  public ReportDownloadResponse(RawReportDownloadResponse rawResponse) {
    this.rawResponse = Preconditions.checkNotNull(rawResponse, "Null raw response");
    Preconditions.checkArgument(rawResponse.getHttpStatus() == HttpURLConnection.HTTP_OK,
        "Expected a successful raw response but raw response status is: %s",
        rawResponse.getHttpStatus());
  }

  public int getHttpStatus() {
    return rawResponse.getHttpStatus();
  }

  public String getHttpResponseMessage() {
    return HTTP_SUCCESS_MESSAGE;
  }

  @Nullable
  public InputStream getInputStream() {
    return rawResponse.getInputStream();
  }
  
  /**
   * Returns the contents of the response as a String. Inflates the response if it is in one of the
   * gzip formats.
   *
   * @throws IOException if unable to read the response contents
   */
  public String getAsString() throws IOException {
    InputStream inputStream = isGzipped()
        ? new GZIPInputStream(getInputStream())
        : getInputStream();
    return Streams.readAll(inputStream, rawResponse.getCharset());
  }
  
  /**
   * Writes the contents of the response to the specified File.
   *
   * @param outputFile the output file to write to
   * @throws FileNotFoundException if unable to write to {@code outputFile}
   * @throws IOException if unable to read the response contents
   */
  public void saveToFile(String outputFile) throws FileNotFoundException, IOException {
    Streams.copy(getInputStream(), new BufferedOutputStream(new FileOutputStream(outputFile)));
  }
  
  private boolean isGzipped() {
    return rawResponse.getDownloadFormat().startsWith("GZIPPED");
  }
}
