// Copyright 2014 Google Inc. All Rights Reserved.
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

import static org.junit.Assert.assertEquals;

import com.google.api.ads.common.lib.utils.Streams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

/**
 * Tests for {@link ReportDownloadResponse}.
 *
 * @author Josh Radcliff
 */
@RunWith(JUnit4.class)
public class ReportDownloadResponseTest {
  /**
   * Test method for
   * {@link com.google.api.ads.adwords.lib.utils.ReportDownloadResponse#getInputStream()}.
   */
  @Test
  public void testGetInputStream() throws IOException {
    String expectedContents = "a,b,c\nd,e,f\n";
    InputStream inputStream = new ByteArrayInputStream(expectedContents.getBytes());
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(HttpURLConnection.HTTP_OK,
        inputStream, StandardCharsets.UTF_8, "CSV");
    ReportDownloadResponse response = new ReportDownloadResponse(rawResponse);
    String actualContents = Streams.readAll(response.getInputStream(), StandardCharsets.UTF_8);
    assertEquals("input stream contents are incorrect", expectedContents, actualContents);
  }

  /**
   * Test method for
   * {@link com.google.api.ads.adwords.lib.utils.ReportDownloadResponse#getAsString()}.
   */
  @Test
  public void testGetAsString() throws IOException {
    String expectedContents = "a,b,c\nd,e,f\n";
    InputStream inputStream = new ByteArrayInputStream(expectedContents.getBytes());
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(HttpURLConnection.HTTP_OK,
        inputStream, StandardCharsets.UTF_8, "CSV");
    ReportDownloadResponse response = new ReportDownloadResponse(rawResponse);
    assertEquals("contents as string are incorrect", expectedContents, response.getAsString());
  }

  /**
   * Test method for
   * {@link com.google.api.ads.adwords.lib.utils.ReportDownloadResponse#getAsString()}
   * when response data is compressed.
   */
  @Test
  public void testGetAsString_gzippedCSV() throws IOException {
    String expectedContents = "a,b,c\nd,e,f\n";

    ByteArrayOutputStream zippedBytesOut = new ByteArrayOutputStream();
    Streams.copy(new ByteArrayInputStream(expectedContents.getBytes()),
        new GZIPOutputStream(zippedBytesOut));

    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(HttpURLConnection.HTTP_OK,
        new ByteArrayInputStream(zippedBytesOut.toByteArray()), StandardCharsets.UTF_8,
        "GZIPPED_CSV");
    ReportDownloadResponse response = new ReportDownloadResponse(rawResponse);
    assertEquals("contents as string are incorrect for gzipped format", expectedContents,
        response.getAsString());
  }

  /**
   * Test method for
   * {@link com.google.api.ads.adwords.lib.utils.ReportDownloadResponse#saveToFile(String)}
   */
  @Test
  public void testSaveToFile() throws IOException {
    File outputFile = File.createTempFile("ReportOutput", ".csv");
    String expectedContents = "a,b,c\nd,e,f\n";
    InputStream inputStream = new ByteArrayInputStream(expectedContents.getBytes());
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(HttpURLConnection.HTTP_OK,
        inputStream, StandardCharsets.UTF_8, "CSV");
    ReportDownloadResponse response = new ReportDownloadResponse(rawResponse);
    response.saveToFile(outputFile.getPath());

    assertEquals("contents saved to file are incorrect", expectedContents,
        Streams.readAll(new FileInputStream(outputFile), StandardCharsets.UTF_8));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFailedResponse_fails() {
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(
        HttpURLConnection.HTTP_BAD_REQUEST, new ByteArrayInputStream("failed".getBytes()),
        StandardCharsets.UTF_8, "CSV");
    new ReportDownloadResponse(rawResponse);
  }
}
