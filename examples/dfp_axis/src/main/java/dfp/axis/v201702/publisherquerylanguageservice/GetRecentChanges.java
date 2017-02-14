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

package dfp.axis.v201702.publisherquerylanguageservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.CsvFiles;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201702.DateTimes;
import com.google.api.ads.dfp.axis.utils.v201702.Pql;
import com.google.api.ads.dfp.axis.utils.v201702.StatementBuilder;
import com.google.api.ads.dfp.axis.v201702.PublisherQueryLanguageServiceInterface;
import com.google.api.ads.dfp.axis.v201702.ResultSet;
import com.google.api.ads.dfp.axis.v201702.Row;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.io.File;
import org.joda.time.DateTime;

/**
 * This example gets recent changes in your network using the {@code Change_History} table.
 *
 * A full list of available tables can be found at
 * https://developers.google.com/doubleclick-publishers/docs/reference/latest/PublisherQueryLanguageService
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetRecentChanges {

  public static void runExample(DfpServices dfpServices, DfpSession session, String filePath)
      throws Exception {
    PublisherQueryLanguageServiceInterface pqlService =
        dfpServices.get(session, PublisherQueryLanguageServiceInterface.class);

    // Create statement to select recent changes. Change_History only supports ordering by
    // descending ChangeDateTime. Offset is not supported. To page, use the change ID of
    // the earliest change as a pagination token. A date time range is required
    // when querying this table.
    DateTime endDateTime = DateTime.now();
    DateTime startDateTime = endDateTime.minusDays(1);
    StatementBuilder statementBuilder =
        new StatementBuilder()
            .select("Id, ChangeDateTime, EntityId, EntityType, Operation, UserId")
            .from("Change_History")
            .where("ChangeDateTime < :endDateTime AND ChangeDateTime > :startDateTime")
            .orderBy("ChangeDateTime DESC")
            .withBindVariableValue("startDateTime", DateTimes.toDateTime(startDateTime))
            .withBindVariableValue("endDateTime", DateTimes.toDateTime(endDateTime))
            .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    // Retrieve a small amount of changes at a time, paging through
    // until all changes have been retrieved.
    ResultSet combinedResultSet = null;
    ResultSet resultSet;
    int i = 0;

    do {
      resultSet = pqlService.select(statementBuilder.toStatement());

      // Combine result sets with previous ones.
      combinedResultSet = combinedResultSet == null
          ? resultSet
          : Pql.combineResultSets(combinedResultSet, resultSet);

      if (resultSet.getRows() != null && resultSet.getRows().length > 0) {
        // Get the earliest change ID in the result set.
        int numRows = resultSet.getRows().length;
        Row lastRow = resultSet.getRows(numRows - 1);
        String id = (String) Pql.getNativeValue(lastRow.getValues(0));
        System.out.printf("%d) %d changes prior to ID %s were found.%n", i++,
            numRows, id);

        // Use the earliest change ID in the result set to page.
        statementBuilder
            .where("Id < :id AND ChangeDateTime < :endDateTime AND ChangeDateTime > :startDateTime")
            .withBindVariableValue("id", id);
      }
    } while (resultSet.getRows() != null && resultSet.getRows().length > 0);

    // Write the result set to a CSV.
    CsvFiles.writeCsv(Pql.resultSetToStringArrayList(combinedResultSet), filePath);

    System.out.printf("Recent changes saved to: %s%n", filePath);
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
    // Change to your file path.
    String filePath = File.createTempFile("Change-History", ".csv").toString();
    runExample(dfpServices, session, filePath);
  }
}