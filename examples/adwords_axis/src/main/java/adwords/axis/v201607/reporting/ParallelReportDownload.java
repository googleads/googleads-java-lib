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

package adwords.axis.v201607.reporting;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201607.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201607.cm.ApiException;
import com.google.api.ads.adwords.axis.v201607.mcm.ManagedCustomer;
import com.google.api.ads.adwords.axis.v201607.mcm.ManagedCustomerPage;
import com.google.api.ads.adwords.axis.v201607.mcm.ManagedCustomerServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.AdWordsSession.ImmutableAdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.adwords.lib.jaxb.v201607.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201607.ReportDefinition;
import com.google.api.ads.adwords.lib.jaxb.v201607.ReportDefinitionDateRangeType;
import com.google.api.ads.adwords.lib.jaxb.v201607.ReportDefinitionReportType;
import com.google.api.ads.adwords.lib.jaxb.v201607.Selector;
import com.google.api.ads.adwords.lib.selectorfields.v201607.cm.ManagedCustomerField;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.api.ads.adwords.lib.utils.v201607.ReportDownloader;
import com.google.api.ads.adwords.lib.utils.v201607.ReportDownloaderInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.util.BackOff;
import com.google.api.client.util.ExponentialBackOff;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import java.io.File;
import java.rmi.RemoteException;
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

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential =
        new OfflineCredentials.Builder()
            .forApi(Api.ADWORDS)
            .fromFile()
            .build()
            .generateCredential();

    // Construct an AdWordsSession.
    ImmutableAdWordsSession session =
        new AdWordsSession.Builder()
            .fromFile()
            .withOAuth2Credential(oAuth2Credential)
            .buildImmutable();

    AdWordsServices adWordsServices = new AdWordsServices();

    // Adjust these values as needed.
    int numberOfThreads = 5;
    int maxElapsedSecondsPerCustomer = 60 * 5;

    runExample(adWordsServices, session, numberOfThreads, maxElapsedSecondsPerCustomer);
  }

  public static void runExample(
      AdWordsServices adWordsServices,
      ImmutableAdWordsSession session,
      int numberOfThreads,
      int maxElapsedSecondsPerCustomer)
      throws Exception {

    // Retrieve all accounts under the manager account.
    Map<Long, ManagedCustomer> managedCustomers = getAllManagedCustomers(adWordsServices, session);
    System.out.printf("Downloading report for %d managed customers.%n", managedCustomers.size());

    // Create selector for the report definition.
    Selector selector = new Selector();
    selector
        .getFields()
        .addAll(Lists.newArrayList("CampaignId", "AdGroupId", "Impressions", "Clicks", "Cost"));

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
    List<ReportDownloadFutureTask> reportDownloadFutureTasks = Lists.newArrayList();

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
                  reportDefinition,
                  outputFile,
                  backOffBuilder.build()));

      // Ignore the Future returned here. Instead, use the list of ReportDownloadFutureTask objects,
      // which will provide the context (client customer ID) of each completed task.
      threadPool.submit(reportDownloadFutureTask);

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
      } catch (CancellationException e) {
        failedReports.put(clientCustomerId, e);
      } catch (InterruptedException e) {
        failedReports.put(clientCustomerId, e);
      } catch (ExecutionException e) {
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
      AdWordsServices adWordsServices, ImmutableAdWordsSession session)
      throws RemoteException, ApiException {
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

    /**
     * @param callable
     */
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
    private final ReportDefinition reportDefinition;
    private final File reportOutputFile;
    private final ExponentialBackOff backOff;

    private ReportDownloadCallable(
        ImmutableAdWordsSession session,
        ReportDefinition reportDefinition,
        File reportOutputFile,
        ExponentialBackOff backOff) {
      this.session = session;
      this.reportDefinition = reportDefinition;
      this.reportOutputFile = reportOutputFile;
      this.backOff = backOff;
    }

    @Override
    public File call() throws Exception {
      long clientCustomerId = Long.valueOf(session.getClientCustomerId());
      int numberOfAttempts = 0;
      boolean doContinue = true;
      ReportException lastException = null;
      do {
        numberOfAttempts++;
        try {
          // Set the property api.adwords.reportDownloadTimeout or call
          // ReportDownloader.setReportDownloadTimeout to set a timeout (in milliseconds)
          // for CONNECT and READ in report downloads.
          ReportDownloaderInterface reportDownloader = new ReportDownloader(session);
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
