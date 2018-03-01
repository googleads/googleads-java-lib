// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201802.reporting;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201802.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer;
import com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerPage;
import com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.AdWordsSession.ImmutableAdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.jaxb.v201802.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201802.ReportDefinition;
import com.google.api.ads.adwords.lib.jaxb.v201802.ReportDefinitionDateRangeType;
import com.google.api.ads.adwords.lib.jaxb.v201802.ReportDefinitionReportType;
import com.google.api.ads.adwords.lib.jaxb.v201802.Selector;
import com.google.api.ads.adwords.lib.selectorfields.v201802.cm.ManagedCustomerField;
import com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.api.ads.adwords.lib.utils.v201802.ReportDownloaderInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.util.BackOff;
import com.google.api.client.util.ExponentialBackOff;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * This example gets and downloads an Ad Hoc report from an XML report definition for all accounts
 * directly under a manager account in multiple parallel threads. This example should be run against
 * an AdWords manager account.
 *
 * <p>
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 */
public class ParallelReportDownload {

  private static final int PAGE_SIZE = 500;

  public static void main(String[] args) {
    ImmutableAdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an ImmutableAdWordsSession to use as a prototype when creating a session for each
      // managed customer.
      session =
          new AdWordsSession.Builder()
              .fromFile()
              .withOAuth2Credential(oAuth2Credential)
              .buildImmutable();
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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    // Adjust these values as needed.
    int numberOfThreads = 5;
    int maxElapsedSecondsPerCustomer = 60 * 5;

    try {
      runExample(adWordsServices, session, numberOfThreads, maxElapsedSecondsPerCustomer);
    } catch (DetailedReportDownloadResponseException dre) {
      // A DetailedReportDownloadResponseException will be thrown if the HTTP status code in the
      // response indicates an error occurred and the response body contains XML with further
      // information, such as the fieldPath and trigger.
      System.err.printf(
          "Report was not downloaded due to a %s with errorText '%s', trigger '%s' and "
              + "field path '%s'%n",
          dre.getClass().getSimpleName(), dre.getErrorText(), dre.getTrigger(), dre.getFieldPath());
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
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
    } catch (ReportDownloadResponseException rde) {
      // A ReportDownloadResponseException will be thrown if the HTTP status code in the response
      // indicates an error occurred, but the response did not contain further details.
      System.err.printf("Report was not downloaded due to: %s%n", rde);
    } catch (ReportException re) {
      // A ReportException will be thrown if the download failed due to a transport layer exception.
      System.err.printf("Report was not downloaded due to transport layer exception: %s%n", re);
    } catch (IOException ioe) {
      // An IOException in this example indicates that the report's contents could not be read from
      // the response.
      System.err.printf("Report was not read due to an IOException: %s%n", ioe);
    } catch (InterruptedException ie) {
      System.err.printf("Thread was interrupted while waiting for reports to complete: %s%n", ie);
    } catch (ValidationException ve) {
      System.err.printf("Failed to create a session for a customer: %s%n", ve);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param numberOfThreads number of threads to use for concurrent report requests.
   * @param maxElapsedSecondsPerCustomer the maximum number of seconds to wait for each report
   *     request to complete.
   * @throws ApiException if the API request to retrieve managed customers failed with one or more
   *     service errors.
   * @throws RemoteException if the API request to retrieve managed customers failed due to other
   *     errors.
   * @throws DetailedReportDownloadResponseException if the report request failed with a detailed
   *     error from the reporting service.
   * @throws ReportDownloadResponseException if the report request failed with a general error from
   *     the reporting service.
   * @throws ReportException if the report request failed due to a transport layer error.
   * @throws IOException if the report's contents could not be read from the response.
   * @throws ValidationException if creation of an ImmutableAdWordsSession for a customer failed due
   *     to validation issues.
   * @throws InterruptedException if the thread was interrupted while waiting for all report
   *     downloads to complete.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      ImmutableAdWordsSession session,
      int numberOfThreads,
      int maxElapsedSecondsPerCustomer)
      throws ReportDownloadResponseException, ReportException, IOException, ValidationException,
          InterruptedException {

    // Retrieve all accounts under the manager account.
    Map<Long, ManagedCustomer> managedCustomers = getAllManagedCustomers(adWordsServices, session);
    System.out.printf("Downloading report for %d managed customers.%n", managedCustomers.size());

    // Create selector for the report definition.
    Selector selector = new Selector();
    selector
        .getFields()
        .addAll(Arrays.asList("CampaignId", "AdGroupId", "Impressions", "Clicks", "Cost"));

    // Create report definition.
    ReportDefinition reportDefinition = new ReportDefinition();
    reportDefinition.setReportName("Custom ADGROUP_PERFORMANCE_REPORT");
    reportDefinition.setDateRangeType(ReportDefinitionDateRangeType.LAST_7_DAYS);
    reportDefinition.setReportType(ReportDefinitionReportType.ADGROUP_PERFORMANCE_REPORT);
    reportDefinition.setDownloadFormat(DownloadFormat.CSV);
    reportDefinition.setSelector(selector);

    // Optional: Set the reporting configuration of the session to suppress header, column name, or
    // summary rows in the report output. You can also configure this via your ads.properties
    // configuration file. See AdWordsSession.Builder.from(Configuration) for details.
    // In addition, you can set whether you want to explicitly include or exclude zero impression
    // rows.
    ReportingConfiguration reportingConfiguration =
        new ReportingConfiguration.Builder()
            .skipReportHeader(false)
            .skipColumnHeader(false)
            .skipReportSummary(false)
            // Enable to allow rows with zero impressions to show.
            .includeZeroImpressions(false)
            .build();

    // Create a thread pool for submitting report requests.
    ExecutorService threadPool = Executors.newFixedThreadPool(numberOfThreads);

    // Customize this builder if you want to change the backoff policy on retryable report
    // failures.
    ExponentialBackOff.Builder backOffBuilder = new ExponentialBackOff.Builder()
        .setMaxElapsedTimeMillis(maxElapsedSecondsPerCustomer * 1000);

    File reportDirectory = Files.createTempDir();

    // List to keep track of the progress of each customer's report download task.
    List<ReportDownloadFutureTask> reportDownloadFutureTasks = new ArrayList<>();

    for (ManagedCustomer managedCustomer : managedCustomers.values()) {
      File outputFile =
          new File(
              reportDirectory, String.format("adgroup_%010d.csv", managedCustomer.getCustomerId()));
      ImmutableAdWordsSession sessionForCustomer =
          session
              .newBuilder()
              .withClientCustomerId(Long.toString(managedCustomer.getCustomerId()))
              .withReportingConfiguration(reportingConfiguration)
              .buildImmutable();
      ReportDownloadFutureTask reportDownloadFutureTask =
          new ReportDownloadFutureTask(
              new ReportDownloadCallable(
                  sessionForCustomer,
                  adWordsServices,
                  reportDefinition,
                  outputFile,
                  backOffBuilder.build()));

      // Use execute instead of submit since there is no need to get a Future for a FutureTask.
      // Instead, store this ReportDownloadFutureTask in the list so that it can be used later
      // to check the result and determine the task context (client customer ID).
      threadPool.execute(reportDownloadFutureTask);

      reportDownloadFutureTasks.add(reportDownloadFutureTask);
    }

    // All callables have been submitted. Shut down the thread pool.
    threadPool.shutdown();

    // Wait for the thread pool to terminate.
    threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

    System.out.println();
    System.out.println("All downloads completed. Results:");

    Map<String, File> successfulReports = Maps.newHashMap();
    Map<String, Exception> failedReports = Maps.newHashMap();
    for (ReportDownloadFutureTask reportDownloadFutureTask : reportDownloadFutureTasks) {
      String clientCustomerId = reportDownloadFutureTask.getClientCustomerId();
      try {
        File reportFile = reportDownloadFutureTask.get();
        successfulReports.put(clientCustomerId, reportFile);
      } catch (CancellationException | InterruptedException | ExecutionException e) {
        failedReports.put(clientCustomerId, e);
      }
    }

    System.out.println("Successful reports:");
    for (Entry<String, File> successfulReportEntry : successfulReports.entrySet()) {
      String clientCustomerId = successfulReportEntry.getKey();
      File reportFile = successfulReportEntry.getValue();
      System.out.printf("\tClient ID %s => '%s'%n", clientCustomerId, reportFile);
    }

    System.out.println("Failed reports:");
    for (Entry<String, Exception> failedReportEntry : failedReports.entrySet()) {
      Exception exception = failedReportEntry.getValue();
      System.out.printf("\tClient ID %s => Exception: %s%n", failedReportEntry.getKey(), exception);
    }

    System.out.println("End of results.");
  }

  /**
   * Retrieves all managed customers under the manager account identified by
   * {@link AdWordsSession#getClientCustomerId()}.
   */
  private static Map<Long, ManagedCustomer> getAllManagedCustomers(
      AdWordsServicesInterface adWordsServices, ImmutableAdWordsSession session)
      throws RemoteException {
    // Get the ManagedCustomerService.
    ManagedCustomerServiceInterface managedCustomerService =
        adWordsServices.get(session, ManagedCustomerServiceInterface.class);

    SelectorBuilder selectorBuilder =
        new SelectorBuilder()
            .fields(ManagedCustomerField.CustomerId)
            .equals(ManagedCustomerField.CanManageClients, "false")
            .limit(PAGE_SIZE)
            .offset(0);

    ManagedCustomerPage managedCustomerPage;
    int offset = 0;
    Map<Long, ManagedCustomer> managedCustomers = Maps.newHashMap();
    do {
      selectorBuilder.offset(offset);
      managedCustomerPage = managedCustomerService.get(selectorBuilder.build());
      if (managedCustomerPage.getEntries() != null) {
        for (ManagedCustomer managedCustomer : managedCustomerPage.getEntries()) {
          managedCustomers.put(managedCustomer.getCustomerId(), managedCustomer);
        }
      }
      offset += PAGE_SIZE;
    } while (offset < managedCustomerPage.getTotalNumEntries());

    return managedCustomers;
  }

  /**
   * Extension of {@link FutureTask} that provides the context (client customer ID) for the task.
   */
  private static class ReportDownloadFutureTask extends FutureTask<File> {

    private final String clientCustomerId;

    public ReportDownloadFutureTask(ReportDownloadCallable callable) {
      super(callable);
      this.clientCustomerId = callable.session.getClientCustomerId();
    }

    String getClientCustomerId() {
      return clientCustomerId;
    }
  }

  /**
   * Callable for the download attempts of a single report for a single customer.
   */
  private static class ReportDownloadCallable implements Callable<File> {

    private final ImmutableAdWordsSession session;
    private final AdWordsServicesInterface adWordsServices;
    private final ReportDefinition reportDefinition;
    private final File reportOutputFile;
    private final ExponentialBackOff backOff;

    private ReportDownloadCallable(
        ImmutableAdWordsSession session,
        AdWordsServicesInterface adWordsServices,
        ReportDefinition reportDefinition,
        File reportOutputFile,
        ExponentialBackOff backOff) {
      this.session = session;
      this.adWordsServices = adWordsServices;
      this.reportDefinition = reportDefinition;
      this.reportOutputFile = reportOutputFile;
      this.backOff = backOff;
    }

    /**
     * Downloads the report for a specific customer account. On request failure, retries the request
     * using an exponential backoff strategy. If all attempts fail, throws the exception from the
     * last attempt.
     *
     * @return the output file containing the report results.
     * @throws DetailedReportDownloadResponseException if the report request failed with a detailed
     *     error from the reporting service.
     * @throws ReportDownloadResponseException if the report request failed with a general error
     *     from the reporting service.
     * @throws ReportException if the report request failed due to a transport layer error.
     * @throws IOException if the report's contents could not be written to {@code reportFile}.
     * @throws InterruptedException if the thread was interrupted while waiting between retries.
     */
    @Override
    public File call()
        throws ReportException, ReportDownloadResponseException, IOException, InterruptedException {
      long clientCustomerId = Long.valueOf(session.getClientCustomerId());
      int numberOfAttempts = 0;
      boolean doContinue = true;
      ReportException lastException = null;
      ReportDownloaderInterface reportDownloader =
          adWordsServices.getUtility(session, ReportDownloaderInterface.class);
      do {
        numberOfAttempts++;
        try {
          // Set the property api.adwords.reportDownloadTimeout or call
          // ReportDownloader.setReportDownloadTimeout to set a timeout (in milliseconds)
          // for CONNECT and READ in report downloads.
          ReportDownloadResponse response = reportDownloader.downloadReport(reportDefinition);
          response.saveToFile(reportOutputFile.getPath());

          System.out.printf(
              "Report for client customer ID %s successfully downloaded to: %s%n",
              clientCustomerId,
              reportOutputFile);
          return reportOutputFile;
        } catch (ReportException e) {
          lastException = e;
          // ReportException represents a potentially retryable error, so apply the backoff
          // policy if the max elapsed time per customer has not passed. All other exceptions
          // will be thrown.
          System.err.printf(
              "Report attempt #%d for client customer ID %s was not downloaded due to: %s%n",
              numberOfAttempts,
              session.getClientCustomerId(),
              e);
          long sleepMillis = backOff.nextBackOffMillis();
          if (sleepMillis == BackOff.STOP) {
            doContinue = false;
            lastException = new ReportException(
                "Report request failed after maximum elapsed millis: "
                    + backOff.getMaxElapsedTimeMillis(),
                e);
          } else {
            System.out.printf(
                "Sleeping %d milliseconds before retrying report for client customer ID %s.%n",
                sleepMillis,
                session.getClientCustomerId());
            Thread.sleep(sleepMillis);
          }
        }
      } while (doContinue);

      // Throw the last exception. This is only reachable if the do/while loop was unable
      // to retrieve the report within the backoff policy's max elapsed time.
      throw lastException;
    }
  }
}
