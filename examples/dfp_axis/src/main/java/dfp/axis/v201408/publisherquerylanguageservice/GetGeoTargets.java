// Copyright 2014 Google Inc. All Rights Reserved.
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

package dfp.axis.v201408.publisherquerylanguageservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.CsvFiles;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201408.Pql;
import com.google.api.ads.dfp.axis.utils.v201408.StatementBuilder;
import com.google.api.ads.dfp.axis.v201408.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.dfp.axis.v201408.ResultSet;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.io.File;

/**
 * This example gets geographic criteria from the Geo_Target table, such as
 * all cities available to target. Other types include 'Country', 'Region',
 * 'State', 'Postal_Code', and 'DMA_Region' (i.e. Metro).
 *
 * A full list of available geo target types can be found at
 * https://developers.google.com/doubleclick-publishers/docs/reference/v201408/PublisherQueryLanguageService
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: PublisherQueryLanguageService.select
 *
 * @author Adam Rogal
 */
public class GetGeoTargets {

  // Set the type of geo target.
  private static final String GEO_TARGET_TYPE = "City";

  public static void runExample(DfpServices dfpServices, DfpSession session, String type)
      throws Exception {
    // Get the PublisherQueryLanguageService.
    PublisherQueryLanguageServiceInterface pqlService =
        dfpServices.get(session, PublisherQueryLanguageServiceInterface.class);

    // Create statement to select all targetable cities.
    StatementBuilder statementBuilder = new StatementBuilder()
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
      combinedResultSet = combinedResultSet == null
          ? resultSet
          : Pql.combineResultSets(combinedResultSet, resultSet);

      System.out.printf("%d) %d geo targets beginning at offset %d were found.\n", i++,
          resultSet.getRows() == null ? 0 : resultSet.getRows().length,
          statementBuilder.getOffset());

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (resultSet.getRows() != null && resultSet.getRows().length > 0);

    // Change to your file location.
    String filePath = File.createTempFile(type + "-", ".csv").toString();

    // Write the result set to a CSV.
    CsvFiles.writeCsv(Pql.resultSetToStringArrayList(combinedResultSet), filePath);

    System.out.printf("Geo targets saved to %s\n", filePath);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, GEO_TARGET_TYPE);
  }
}
