// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.axis.utils.v201711;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.api.ads.dfp.axis.testing.ReportProvider;
import com.google.api.ads.dfp.axis.v201711.ApiException;
import com.google.api.ads.dfp.axis.v201711.ExportFormat;
import com.google.api.ads.dfp.axis.v201711.ReportDownloadOptions;
import com.google.api.ads.dfp.axis.v201711.ReportJobStatus;
import com.google.api.ads.dfp.axis.v201711.ReportServiceInterface;
import com.google.api.ads.dfp.lib.utils.ReportCallback;
import com.google.api.client.util.Sleeper;
import com.google.common.io.CharSource;
import com.google.common.io.Resources;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.rmi.RemoteException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Test for {@link ReportDownloader}.
 */
@RunWith(JUnit4.class)
public class ReportDownloaderTest {

  @Mock private ReportServiceInterface reportService;
  
  public ReportDownloaderTest() {}
  
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }
  
  @Test
  public void testWaitForReportReady_completed() throws ApiException, RemoteException,
      InterruptedException {
    ReportDownloader downloader = new ReportDownloader(reportService, 1);
    when(reportService.getReportJobStatus(Matchers.anyLong()))
      .thenReturn(ReportJobStatus.COMPLETED);
    assertTrue(downloader.waitForReportReady());
  }
  
  @Test
  public void testWaitForReportReady_failed() throws ApiException, RemoteException,
      InterruptedException {
    ReportDownloader downloader = new ReportDownloader(reportService, 1);
    when(reportService.getReportJobStatus(Matchers.anyLong()))
      .thenReturn(ReportJobStatus.FAILED);
    assertFalse(downloader.waitForReportReady());
  }
  
  @Test
  public void testWaitForReportReady_polls() throws ApiException, RemoteException,
      InterruptedException {
    Sleeper sleeper = mock(Sleeper.class);
    ReportDownloader downloader = new ReportDownloader(reportService, 1, sleeper);
    when(reportService.getReportJobStatus(Matchers.anyLong()))
      .thenReturn(ReportJobStatus.IN_PROGRESS, ReportJobStatus.COMPLETED);
    assertTrue(downloader.waitForReportReady());
  }
  
  @Test
  public void testGetReportDownloadUrlWithOptions() throws ApiException, RemoteException,
      MalformedURLException {
    ReportDownloader downloader = new ReportDownloader(reportService, 1);
    when(reportService.getReportJobStatus(Matchers.anyLong()))
      .thenReturn(ReportJobStatus.COMPLETED);
    when(reportService.getReportDownloadUrlWithOptions(Matchers.anyLong(),
        Matchers.any(ReportDownloadOptions.class)))
        .thenReturn("https://www.google.com/");
    URL downloadUrl = downloader.getDownloadUrl(new ReportDownloadOptions());
    assertEquals("https://www.google.com/", downloadUrl.toString());
  }
  
  @Test
  public void testGetReportAsCharSource() throws IOException {
    ReportDownloader downloader = new ReportDownloader(reportService, 1);
    URL resourceUrl = ReportProvider.TEST_REPORT_RESOURCE;
    String report = Resources.toString(resourceUrl, Charset.forName("UTF-8"));
    when(reportService.getReportJobStatus(Matchers.anyLong()))
      .thenReturn(ReportJobStatus.COMPLETED);
    when(reportService.getReportDownloadUrlWithOptions(Matchers.anyLong(),
        Matchers.any(ReportDownloadOptions.class)))
        .thenReturn(resourceUrl.toString());
    
    ReportDownloadOptions options = new ReportDownloadOptions();
    options.setExportFormat(ExportFormat.CSV_DUMP);
    options.setUseGzipCompression(false);
    CharSource reportCharSource = downloader.getReportAsCharSource(options);
    assertEquals(report, reportCharSource.read());
  } 
  
  @Test
  public void testWhenReportReady_complete() throws IOException, InterruptedException {
    ReportDownloader downloader = new ReportDownloader(reportService, 1);
    when(reportService.getReportJobStatus(Matchers.anyLong()))
      .thenReturn(ReportJobStatus.COMPLETED);
    
    ReportCallback callback = mock(ReportCallback.class);
    downloader.whenReportReady(callback).join();
    Mockito.verify(callback).onSuccess();
  }
  
  @Test
  public void testWhenReportReady_failed() throws IOException, InterruptedException {
    ReportDownloader downloader = new ReportDownloader(reportService, 1);
    when(reportService.getReportJobStatus(Matchers.anyLong()))
      .thenReturn(ReportJobStatus.FAILED);
    
    ReportCallback callback = mock(ReportCallback.class);
    downloader.whenReportReady(callback).join();
    Mockito.verify(callback).onFailure();
  }
  
  @Test
  public void testWhenReportReady_remote() throws IOException, InterruptedException {
    ReportDownloader downloader = new ReportDownloader(reportService, 1);
    RemoteException e = new RemoteException();
    when(reportService.getReportJobStatus(Matchers.anyLong())).thenThrow(e);
    
    ReportCallback callback = mock(ReportCallback.class);
    downloader.whenReportReady(callback).join();
    Mockito.verify(callback).onException(e);
  } 
}
