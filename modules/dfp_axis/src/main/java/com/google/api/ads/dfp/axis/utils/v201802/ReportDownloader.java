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

package com.google.api.ads.dfp.axis.utils.v201802;

import static org.apache.commons.lang.CharEncoding.UTF_8;

import com.google.api.ads.dfp.axis.v201802.ExportFormat;
import com.google.api.ads.dfp.axis.v201802.ReportDownloadOptions;
import com.google.api.ads.dfp.axis.v201802.ReportJobStatus;
import com.google.api.ads.dfp.axis.v201802.ReportServiceInterface;
import com.google.api.ads.dfp.lib.utils.ReportCallback;
import com.google.api.client.util.Sleeper;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import com.google.common.io.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.rmi.RemoteException;
import java.util.zip.GZIPInputStream;

/**
 * Retrieves reports using a {@link ReportServiceInterface}.
 * <p>
 * There are two main functions of this class:
 * <ul>
 * <li>To download a report in Gzip format to a file or any {@code OutputStream}
 * </li>
 * <li>To get the report and perform a number of tasks on it</li>
 * </ul>
 * <p>
 * {@code ReportUtils} also provides the method
 * {@link #whenReportReady(ReportCallback)} to wait for a scheduled report to
 * finish processing before taking an action on the report through the supplied
 * {@link ReportCallback}.
 */
public class ReportDownloader {

  public static final Charset REPORT_CHARSET = Charset.forName(UTF_8);

  /** The time to sleep before each request to the service. */
  public static final int SLEEP_TIMER = 30000;

  private final ReportServiceInterface reportService;
  private final long reportJobId;
  private final Sleeper sleeper;
  
  private static final ImmutableSet<ExportFormat> SUPPORTED_CHARSOURCE_EXPORT_FORMATS =
      ImmutableSet.of(ExportFormat.CSV_DUMP, ExportFormat.TSV, ExportFormat.XML);
  
  private static class GZippedByteSource extends ByteSource {

    private ByteSource containedByteSource;

    public GZippedByteSource(ByteSource zippedByteSource) {
      containedByteSource = zippedByteSource;
    }

    @Override
    public InputStream openStream() throws IOException {
      return new GZIPInputStream(containedByteSource.openStream());
    }
  }
  
  /**
   * Constructs a {@code ReportDownloader} object for a
   * {@link ReportServiceInterface} and a report job id that the the class works
   * on.
   *
   * @param reportService the ReportService stub to make calls to
   * @param reportJobId the report job ID
   */
  public ReportDownloader(ReportServiceInterface reportService, long reportJobId) {
    this(reportService, reportJobId, Sleeper.DEFAULT);
  }
  
  @VisibleForTesting
  ReportDownloader(ReportServiceInterface reportService, long reportJobId,
      Sleeper sleeper) {
    this.reportJobId = reportJobId;
    this.reportService = reportService;
    this.sleeper = sleeper;
  }

  /**
   * Waits for the report to be ready and then calls:
   * <ul>
   * <li>{@link ReportCallback#onSuccess()} for a successful scheduling</li>
   * <li>{@link ReportCallback#onFailure()} for a failed scheduling due to a
   * {@link ReportJobStatus#FAILED}</li>
   * <li>{@link ReportCallback#onInterruption()} if the wait thread is
   * interrupted</li>
   * <li>{@link ReportCallback#onException(Exception)} if there was an exception
   * while waiting for the report to finish</li>
   * </ul>
   *
   * @param callback the {@code ReportCallback} to call when the job has
   *     finished, successfully or otherwise
   * @throws IllegalArgumentException if {@code callback == null}
   * @return the thread created that handles waiting for the report.
   *     {@link Thread#interrupt()} can be called on the returned thread to
   *     interrupt it.
   */
  public Thread whenReportReady(final ReportCallback callback) {
    Preconditions.checkNotNull(callback, "Report callback cannot be null.");

    Thread waitThread = new Thread("ReportUtils.whenReportReady " + reportJobId) {
      @Override
      public void run() {
        try {
          if (waitForReportReady()) {
            callback.onSuccess();
          } else {
            callback.onFailure();
          }
        } catch (RemoteException e) {
          callback.onException(e);
        } catch (InterruptedException e) {
          callback.onInterruption();
        } catch (RuntimeException e) {
          callback.onException(e);
        }
      }
    };
    waitThread.start();
    return waitThread;
  }

  /**
   * Blocks and waits for a report to be ready. When a {@link ReportJobStatus}
   * is received that is not {@code ReportJobStatus#Pending} or {@code
   * ReportJobStatus#InProgress}, the report is considered finished, and the
   * method is returned with a {@code true} if the report was successful, or an
   * {@code false} if not.
   *
   * @return {@code true} if the report was successful, {@code false} otherwise
   * @throws RemoteException if there was an error performing one of the SOAP
   *     calls
   * @throws InterruptedException if the thread was interrupted
   */
  public boolean waitForReportReady() throws RemoteException, InterruptedException {
    ReportJobStatus status = reportService.getReportJobStatus(reportJobId);
    while (status == ReportJobStatus.IN_PROGRESS) {
      sleeper.sleep(SLEEP_TIMER);
      status = reportService.getReportJobStatus(reportJobId);
    }

    return status == ReportJobStatus.COMPLETED;
  }

  /**
   * Gets the download URL for a GZip or plain-text format report. If you requested
   * a compressed report, you may want to save your file with a gz or zip extension.
   * 
   * <pre><code>
   *  URL url = reportDownloader.getDownloadUrl(options);
   *  Resources.asByteSource(url).copyTo(Files.asByteSink(file));
   * </code></pre>
   *
   * @param options the options to download the report with
   * @return the URL for the report download
   * @throws RemoteException if there was an error performing any Axis call
   * @throws MalformedURLException if there is an error forming the download URL
   * @throws IllegalStateException if the report is not ready to be downloaded
   */
  public URL getDownloadUrl(ReportDownloadOptions options) throws RemoteException,
      MalformedURLException {
    ReportJobStatus status = reportService.getReportJobStatus(reportJobId);
    Preconditions.checkState(status == ReportJobStatus.COMPLETED, "Report " + reportJobId
        + " must be completed before downloading. It is currently: " + status);
    return new URL(reportService.getReportDownloadUrlWithOptions(reportJobId, options));
  }
  
  /**
   * Returns a CharSource of report contents with {@code ReportDownloadOptions}. The ExportFormat
   * must be string-based, such as
   * {@link com.google.api.ads.dfp.axis.v201802.ExportFormat#CSV_DUMP}.
   *
   * @param options the options to download the report with
   * @return a new CharSource of report results
   * @throws IOException if there was an error performing any I/O action, including any SOAP calls
   * @throws IllegalStateException if the report is not ready to be downloaded
   * @throws IllegalArgumentException if the {@link ExportFormat} is not a string-based format
   */
  public CharSource getReportAsCharSource(ReportDownloadOptions options) throws IOException {
    Preconditions.checkArgument(
        SUPPORTED_CHARSOURCE_EXPORT_FORMATS.contains(options.getExportFormat()),
        "ExportFormat " + options.getExportFormat() + " cannot be used with CharSource");
    ByteSource byteSource = Resources.asByteSource(getDownloadUrl(options));
    return (options.getUseGzipCompression() ? new GZippedByteSource(byteSource) : byteSource)
        .asCharSource(REPORT_CHARSET);
  }

}
