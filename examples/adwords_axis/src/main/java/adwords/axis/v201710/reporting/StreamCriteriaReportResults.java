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
import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.jaxb.v201710.DownloadFormat;
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
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import com.google.common.primitives.Longs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.SystemUtils;

/**
 * This example streams the results of an ad hoc report, collecting total impressions
 * by campaign from each line. This demonstrates how you can extract data from a large
 * report without holding the entire result set in memory or using files.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class StreamCriteriaReportResults {

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

    try {
      runExample(adWordsServices, session);
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
      // An IOException in this example indicates that the report's contents could not be read from
      // the response.
      System.err.printf(
          "Report was not read due to an IOException: %s%n", ioe);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @throws DetailedReportDownloadResponseException if the report request failed with a detailed
   *     error from the reporting service.
   * @throws ReportDownloadResponseException if the report request failed with a general error from
   *     the reporting service.
   * @throws ReportException if the report request failed due to a transport layer error.
   * @throws IOException if the report's contents could not be read from the response.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws ReportDownloadResponseException, ReportException, IOException  {
    // Create the query.
    String query =
        "SELECT Id, AdNetworkType1, Impressions "
            + "FROM CRITERIA_PERFORMANCE_REPORT "
            + "WHERE Status IN [ENABLED, PAUSED] "
            + "DURING LAST_7_DAYS";

    // Optional: Set the reporting configuration of the session to suppress header, column name, or
    // summary rows in the report output. You can also configure this via your ads.properties
    // configuration file. See AdWordsSession.Builder.from(Configuration) for details.
    // In addition, you can set whether you want to explicitly include or exclude zero impression
    // rows.
    ReportingConfiguration reportingConfiguration =
        new ReportingConfiguration.Builder()
            // Skip all header and summary lines since the loop below expects
            // every field to be present in each line.
            .skipReportHeader(true)
            .skipColumnHeader(true)
            .skipReportSummary(true)
            // Enable to include rows with zero impressions.
            .includeZeroImpressions(false)
            .build();
    session.setReportingConfiguration(reportingConfiguration);

    ReportDownloaderInterface reportDownloader =
        adWordsServices.getUtility(session, ReportDownloaderInterface.class);

    BufferedReader reader = null;
    try {
      // Set the property api.adwords.reportDownloadTimeout or call
      // ReportDownloader.setReportDownloadTimeout to set a timeout (in milliseconds)
      // for CONNECT and READ in report downloads.
      final ReportDownloadResponse response =
          reportDownloader.downloadReport(query, DownloadFormat.CSV);
      
      // Read the response as a BufferedReader.
      reader = new BufferedReader(new InputStreamReader(response.getInputStream(), UTF_8));

      // Map to store total impressions by ad network type 1.
      Map<String, Long> impressionsByAdNetworkType1 = Maps.newTreeMap();

      // Stream the results one line at a time and perform any line-specific processing.
      String line;
      Splitter splitter = Splitter.on(',');
      while ((line = reader.readLine()) != null) {
        System.out.println(line);

        // Split the line into a list of field values.
        List<String> values = splitter.splitToList(line);

        // Update the total impressions for the ad network type 1 value.
        String adNetworkType1 = values.get(1);
        Long impressions = Longs.tryParse(values.get(2));
        if (impressions != null) {
          Long impressionsTotal = impressionsByAdNetworkType1.get(adNetworkType1);
          impressionsTotal = impressionsTotal == null ? 0L : impressionsTotal;
          impressionsByAdNetworkType1.put(adNetworkType1, impressionsTotal + impressions);
        }
      }

      // Print the impressions totals by ad network type 1.
      System.out.println();
      System.out.printf(
          "Total impressions by ad network type 1:%n%s%n",
          Joiner.on(SystemUtils.LINE_SEPARATOR).join(impressionsByAdNetworkType1.entrySet()));
    } finally {
      if (reader != null) {
        reader.close();
      }
    }
  }
}
