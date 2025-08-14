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

package admanager.axis.v202508.publisherquerylanguageservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202508.Pql;
import com.google.api.ads.admanager.axis.utils.v202508.StatementBuilder;
import com.google.api.ads.admanager.axis.v202508.ApiError;
import com.google.api.ads.admanager.axis.v202508.ApiException;
import com.google.api.ads.admanager.axis.v202508.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.admanager.axis.v202508.ResultSet;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.CsvFiles;
import com.google.api.client.auth.oauth2.Credential;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 * This example gets geographic criteria from the Geo_Target table, such as all cities available to
 * target. Other types include 'Country', 'Region', 'State', 'Postal_Code', and 'DMA_Region' (i.e.
 * Metro).
 *
 * <p>A full list of available geo target types can be found at
 * https://developers.google.com/ad-manager/docs/reference/v202508/PublisherQueryLanguageService
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetGeoTargets {

  // Set the type of geo target.
  private static final String GEO_TARGET_TYPE = "City";

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param type the geo target type.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws IOException if unable to write the response to a file.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, String type)
      throws IOException {
    // Get the PublisherQueryLanguageService.
    PublisherQueryLanguageServiceInterface pqlService =
        adManagerServices.get(session, PublisherQueryLanguageServiceInterface.class);

    // Create statement to select all targetable cities.
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .select("Id, Name, CanonicalParentId, ParentIds, CountryCode")
            .from("Geo_Target")
            .where("Type = :type and Targetable = true")
            .orderBy("CountryCode ASC, Name ASC")
            .offset(0)
            .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
            .withBindVariableValue("type", type);

    // Default for result sets.
    ResultSet combinedResultSet = null;
    ResultSet resultSet;
    int i = 0;

    do {
      // Get all cities.
      resultSet = pqlService.select(statementBuilder.toStatement());

      // Combine result sets with previous ones.
      combinedResultSet =
          combinedResultSet == null
              ? resultSet
              : Pql.combineResultSets(combinedResultSet, resultSet);

      System.out.printf(
          "%d) %d geo targets beginning at offset %d were found.%n",
          i++,
          resultSet.getRows() == null ? 0 : resultSet.getRows().length,
          statementBuilder.getOffset());

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (resultSet.getRows() != null && resultSet.getRows().length > 0);

    // Change to your file location.
    String filePath = File.createTempFile(type + "-", ".csv").toString();

    // Write the result set to a CSV.
    CsvFiles.writeCsv(Pql.resultSetToStringArrayList(combinedResultSet), filePath);

    System.out.printf("Geo targets saved to: %s%n", filePath);
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

    try {
      runExample(adManagerServices, session, GEO_TARGET_TYPE);
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
    }
  }
}
