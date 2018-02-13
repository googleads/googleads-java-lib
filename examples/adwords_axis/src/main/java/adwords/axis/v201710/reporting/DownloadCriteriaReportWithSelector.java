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

package adwords.axis.v201710.reporting;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.jaxb.v201710.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201710.ReportDefinition;
import com.google.api.ads.adwords.lib.jaxb.v201710.ReportDefinitionDateRangeType;
import com.google.api.ads.adwords.lib.jaxb.v201710.ReportDefinitionReportType;
import com.google.api.ads.adwords.lib.jaxb.v201710.Selector;
import com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.api.ads.adwords.lib.utils.v201710.ReportDownloaderInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * This example downloads a criteria performance report.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class DownloadCriteriaReportWithSelector {

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    // Location to download report to.
    String reportFile = System.getProperty("user.home") + File.separatorChar + "report.csv";

    try {
      runExample(adWordsServices, session, reportFile);
    } catch (DetailedReportDownloadResponseException dre) {
      // A DetailedReportDownloadResponseException will be thrown if the HTTP status code in the
      // response indicates an error occurred and the response body contains XML with further
      // information, such as the fieldPath and trigger.
      System.err.printf(
          "Report was not downloaded due to a %s with errorText '%s', trigger '%s' and "
              + "field path '%s'%n",
          dre.getClass().getSimpleName(),
          dre.getErrorText(),
          dre.getTrigger(),
          dre.getFieldPath());
    } catch (ReportDownloadResponseException rde) {
      // A ReportDownloadResponseException will be thrown if the HTTP status code in the response
      // indicates an error occurred, but the response did not contain further details.
      System.err.printf("Report was not downloaded due to: %s%n", rde);
    } catch (ReportException re) {
      // A ReportException will be thrown if the download failed due to a transport layer exception.
      System.err.printf("Report was not downloaded due to transport layer exception: %s%n", re);
    } catch (IOException ioe) {
      // An IOException in this example indicates that the report's contents could not be written
      // to the output file.
      System.err.printf(
          "Report was not written to file %s due to an IOException: %s%n", reportFile, ioe);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param reportFile the output file for the report contents.
   * @throws DetailedReportDownloadResponseException if the report request failed with a detailed
   *     error from the reporting service.
   * @throws ReportDownloadResponseException if the report request failed with a general error from
   *     the reporting service.
   * @throws ReportException if the report request failed due to a transport layer error.
   * @throws IOException if the report's contents could not be written to {@code reportFile}.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, String reportFile)
      throws ReportDownloadResponseException, ReportException, IOException {
    // Create selector.
    Selector selector = new Selector();
    selector.getFields().addAll(Arrays.asList("CampaignId",
        "AdGroupId",
        "Id",
        "CriteriaType",
        "Criteria",
        "FinalUrls",
        "Impressions",
        "Clicks",
        "Cost"));

    // Create report definition.
    ReportDefinition reportDefinition = new ReportDefinition();
    reportDefinition.setReportName("Criteria performance report #" + System.currentTimeMillis());
    reportDefinition.setDateRangeType(ReportDefinitionDateRangeType.YESTERDAY);
    reportDefinition.setReportType(ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT);
    reportDefinition.setDownloadFormat(DownloadFormat.CSV);
    
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
    session.setReportingConfiguration(reportingConfiguration);
    
    reportDefinition.setSelector(selector);

    ReportDownloaderInterface reportDownloader =
        adWordsServices.getUtility(session, ReportDownloaderInterface.class);

    // Set the property api.adwords.reportDownloadTimeout or call
    // ReportDownloader.setReportDownloadTimeout to set a timeout (in milliseconds)
    // for CONNECT and READ in report downloads.
    ReportDownloadResponse response = reportDownloader.downloadReport(reportDefinition);
    response.saveToFile(reportFile);

    System.out.printf("Report successfully downloaded to: %s%n", reportFile);
  }
}
