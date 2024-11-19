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

package admanager.axis.v202411.reportservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202411.ReportDownloader;
import com.google.api.ads.admanager.axis.utils.v202411.StatementBuilder;
import com.google.api.ads.admanager.axis.v202411.ApiError;
import com.google.api.ads.admanager.axis.v202411.ApiException;
import com.google.api.ads.admanager.axis.v202411.ExportFormat;
import com.google.api.ads.admanager.axis.v202411.ReportDownloadOptions;
import com.google.api.ads.admanager.axis.v202411.ReportJob;
import com.google.api.ads.admanager.axis.v202411.ReportQuery;
import com.google.api.ads.admanager.axis.v202411.ReportQueryAdUnitView;
import com.google.api.ads.admanager.axis.v202411.ReportServiceInterface;
import com.google.api.ads.admanager.axis.v202411.SavedQuery;
import com.google.api.ads.admanager.axis.v202411.SavedQueryPage;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;

/**
 * This example runs a report from a saved query.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class RunSavedQuery {

  private static class RunSavedQueryParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.SAVED_QUERY_ID,
        required = true,
        description =
            "The ID of the saved query to run. This ID is part of the URL in the"
                + " Ad Manager UI.")
    private Long savedQueryId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param savedQueryId the ID of the saved query to run. This ID is part of the URL in the Ad
   *     Manager UI.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws IOException if unable to write the response to a file.
   * @throws InterruptedException if the thread is interrupted while waiting for the report to
   *     complete.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long savedQueryId)
      throws IOException, InterruptedException {
    // Get the ReportService.
    ReportServiceInterface reportService =
        adManagerServices.get(session, ReportServiceInterface.class);

    // Create statement to retrieve the saved query.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .where("id = :id")
            .orderBy("id ASC")
            .limit(1)
            .withBindVariableValue("id", savedQueryId);

    SavedQueryPage page = reportService.getSavedQueriesByStatement(statementBuilder.toStatement());
    SavedQuery savedQuery = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    if (!savedQuery.getIsCompatibleWithApiVersion()) {
      throw new IllegalStateException("The saved query is not compatible with this API version.");
    }

    // Optionally modify the query.
    ReportQuery reportQuery = savedQuery.getReportQuery();
    reportQuery.setAdUnitView(ReportQueryAdUnitView.HIERARCHICAL);

    // Create report job using the saved query.
    ReportJob reportJob = new ReportJob();
    reportJob.setReportQuery(reportQuery);

    // Run report job.
    reportJob = reportService.runReportJob(reportJob);

    // Create report downloader.
    ReportDownloader reportDownloader = new ReportDownloader(reportService, reportJob.getId());

    // Wait for the report to be ready.
    if (reportDownloader.waitForReportReady()) {
      // Change to your file location.
      File file = File.createTempFile("inventory-report-", ".csv.gz");

      System.out.printf("Downloading report to %s ...", file.toString());

      // Download the report.
      ReportDownloadOptions options = new ReportDownloadOptions();
      options.setExportFormat(ExportFormat.CSV_DUMP);
      options.setUseGzipCompression(true);
      URL url = reportDownloader.getDownloadUrl(options);
      Resources.asByteSource(url).copyTo(Files.asByteSink(file));

      System.out.println("done.");
    } else {
      System.out.printf("Report job %d failed.%n", reportJob.getId());
    }
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

    RunSavedQueryParams params = new RunSavedQueryParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.savedQueryId = Long.parseLong("INSERT_SAVED_QUERY_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.savedQueryId);
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
