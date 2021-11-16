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

package admanager.axis.v202111.reportservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202111.ReportDownloader;
import com.google.api.ads.admanager.axis.v202111.ApiError;
import com.google.api.ads.admanager.axis.v202111.ApiException;
import com.google.api.ads.admanager.axis.v202111.Column;
import com.google.api.ads.admanager.axis.v202111.DateRangeType;
import com.google.api.ads.admanager.axis.v202111.Dimension;
import com.google.api.ads.admanager.axis.v202111.ExportFormat;
import com.google.api.ads.admanager.axis.v202111.ReportDownloadOptions;
import com.google.api.ads.admanager.axis.v202111.ReportJob;
import com.google.api.ads.admanager.axis.v202111.ReportQuery;
import com.google.api.ads.admanager.axis.v202111.ReportServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * This example runs a report that includes a custom field. To determine which custom fields exist,
 * run GetAllCustomFields.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class RunReportWithCustomFields {

  private static class RunReportWithCustomFieldsParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.CUSTOM_FIELD_ID,
        required = true,
        description = "The ID of the custom field to include in the report.")
    private Long customFieldId;

    @Parameter(
        names = ArgumentNames.CUSTOM_DIMENSION_KEY_ID,
        required = true,
        description = "The ID of the custom key field to include as a Dimension in the report.")
    private Long customDimensionKeyId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param customFieldId the ID of the custom field to include in the report.
   * @param customDimensionKeyId the ID of the custom key to include as a dimension in the report.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws IOException if unable to write the response to a file.
   * @throws InterruptedException if the thread is interrupted while waiting for the report to
   *     complete.
   */
  public static void runExample(
      AdManagerServices adManagerServices,
      AdManagerSession session,
      long customFieldId,
      long customDimensionKeyId)
      throws IOException, InterruptedException {
    // Get the ReportService.
    ReportServiceInterface reportService =
        adManagerServices.get(session, ReportServiceInterface.class);

    // Create report query.
    ReportQuery reportQuery = new ReportQuery();
    reportQuery.setDimensions(
        new Dimension[] {Dimension.DATE, Dimension.CUSTOM_DIMENSION, Dimension.LINE_ITEM_ID});
    reportQuery.setColumns(new Column[] {Column.AD_SERVER_IMPRESSIONS});

    // Set the dynamic date range type or a custom start and end date.
    reportQuery.setDateRangeType(DateRangeType.LAST_MONTH);

    // Set the custom field IDs.
    reportQuery.setCustomFieldIds(new long[] {customFieldId});

    // Set the custom dimension IDs.
    reportQuery.setCustomDimensionKeyIds(new long[] {customDimensionKeyId});

    // Create report job.
    ReportJob reportJob = new ReportJob();
    reportJob.setReportQuery(reportQuery);

    // Run report job.
    reportJob = reportService.runReportJob(reportJob);

    // Create report downloader.
    ReportDownloader reportDownloader = new ReportDownloader(reportService, reportJob.getId());

    // Wait for the report to be ready.
    reportDownloader.waitForReportReady();

    // Change to your file location.
    File file = File.createTempFile("custom-field-report-", ".csv.gz");

    System.out.printf("Downloading report to %s ...", file.toString());

    // Download the report.
    ReportDownloadOptions options = new ReportDownloadOptions();
    options.setExportFormat(ExportFormat.CSV_DUMP);
    options.setUseGzipCompression(true);
    URL url = reportDownloader.getDownloadUrl(options);
    Resources.asByteSource(url).copyTo(Files.asByteSink(file));

    System.out.println("done.");
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdManagerServices adManagerServices = new AdManagerServices();

    RunReportWithCustomFieldsParams params = new RunReportWithCustomFieldsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customFieldId = Long.parseLong("INSERT_CUSTOM_FIELD_ID_HERE");
      params.customDimensionKeyId = Long.parseLong("INSERT_CUSTOM_DIMENSION_KEY_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.customFieldId, params.customDimensionKeyId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (IOException ioe) {
      System.err.printf("Example failed due to IOException: %s%n", ioe);
    } catch (InterruptedException ie) {
      System.err.printf("Thread was interrupted: %s%n", ie);
    }
  }
}
