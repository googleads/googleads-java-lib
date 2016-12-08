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

package dfp.axis.v201611.publisherquerylanguageservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.CsvFiles;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201611.Pql;
import com.google.api.ads.dfp.axis.utils.v201611.StatementBuilder;
import com.google.api.ads.dfp.axis.v201611.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.dfp.axis.v201611.ResultSet;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.io.File;

/**
 * This example gets all programmatic buyers in your network using the Programmatic_Buyer table.
 *
 * <p>A full list of available tables can be found at
 * https://developers.google.com/doubleclick-publishers/docs/reference/v201611/PublisherQueryLanguageService
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAllProgrammaticBuyers {

  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws Exception {
    // Get the PublisherQueryLanguageService.
    PublisherQueryLanguageServiceInterface pqlService =
        dfpServices.get(session, PublisherQueryLanguageServiceInterface.class);

    // Create statement to select all programmatic buyers.
    StatementBuilder statementBuilder = new StatementBuilder()
        .select("BuyerAccountId, Name")
        .from("Programmatic_Buyer")
        .orderBy("BuyerAccountId ASC")
        .offset(0)
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    // Default for result sets.
    ResultSet combinedResultSet = null;
    ResultSet resultSet;
    int i = 0;

    do {
      // Get all programmatic buyers.
      resultSet = pqlService.select(statementBuilder.toStatement());

      // Combine result sets with previous ones.
      combinedResultSet = combinedResultSet == null
          ? resultSet
          : Pql.combineResultSets(combinedResultSet, resultSet);

      System.out.printf("%d) %d programmatic buyers beginning at offset %d were found.%n", i++,
          resultSet.getRows() == null ? 0 : resultSet.getRows().length,
          statementBuilder.getOffset());

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (resultSet.getRows() != null && resultSet.getRows().length > 0);

    // Change to your file location.
    String filePath = File.createTempFile("Programmatic-Buyers-", ".csv").toString();

    // Write the result set to a CSV.
    CsvFiles.writeCsv(Pql.resultSetToStringArrayList(combinedResultSet), filePath);

    System.out.printf("Programmatic buyers saved to: %s%n", filePath);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
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

    runExample(dfpServices, session);
  }
}
