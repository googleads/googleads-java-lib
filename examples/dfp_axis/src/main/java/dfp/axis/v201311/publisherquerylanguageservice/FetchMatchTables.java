// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfp.axis.v201311.publisherquerylanguageservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.CsvFiles;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201311.Pql;
import com.google.api.ads.dfp.axis.utils.v201311.StatementBuilder;
import com.google.api.ads.dfp.axis.v201311.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.dfp.axis.v201311.ResultSet;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.io.File;

/**
 * This example fetches and creates match table files from the Line_Item and
 * Ad_Unit tables. This example may take a while to run.
 *
 * A full list of available tables can be found at
 * https://developers.google.com/doubleclick-publishers/docs/reference/v201311/PublisherQueryLanguageService
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: PublisherQueryLanguageService.select
 *
 * @author Nicholas Chen
 */
public class FetchMatchTables {

  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws Exception {
    // Get the PublisherQueryLanguageService.
    PublisherQueryLanguageServiceInterface pqlService =
        dfpServices.get(session, PublisherQueryLanguageServiceInterface.class);

    // Create statement to select all line items.
    StatementBuilder lineItemStatementBuilder = new StatementBuilder()
        .select("Id, Name, Status")
        .from("Line_Item")
        .orderBy("Id ASC")
        .offset(0)
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    
    // Create statement to select all ad units.
    StatementBuilder adUnitStatementBuilder = new StatementBuilder()
        .select("Id, Name")
        .from("Ad_Unit")
        .orderBy("Id ASC")
        .offset(0)
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    String lineItemFilePath = fetchMatchTable(
        lineItemStatementBuilder, pqlService, "Line-Item-Matchtable");
    String adUnitFilePath = fetchMatchTable(
        adUnitStatementBuilder, pqlService, "Ad-Unit-Matchtable");

    System.out.printf("Ad units saved to %s\n", adUnitFilePath);
    System.out.printf("Line items saved to %s\n", lineItemFilePath);
  }
  
  /**
   * Fetches a match table from a PQL statement and writes it to a file.
   */
  public static String fetchMatchTable(
      StatementBuilder pqlStatementBuilder,
      PublisherQueryLanguageServiceInterface pqlService,
      String fileName) throws Exception {
    // Default for result sets.
    ResultSet combinedResultSet = null;
    ResultSet resultSet;
    
    do {
      resultSet = pqlService.select(pqlStatementBuilder.toStatement());

      // Combine result sets with previous ones.
      combinedResultSet = combinedResultSet == null
          ? resultSet
          : Pql.combineResultSets(combinedResultSet, resultSet);

      pqlStatementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (resultSet.getRows() != null && resultSet.getRows().length > 0);

    // Change to your file location.
    String filePath = File.createTempFile(fileName, ".csv").toString();

    // Write the result set to a CSV.
    CsvFiles.writeCsv(Pql.resultSetToStringArrayList(combinedResultSet), filePath);
    
    return filePath;
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

    runExample(dfpServices, session);
  }
}
