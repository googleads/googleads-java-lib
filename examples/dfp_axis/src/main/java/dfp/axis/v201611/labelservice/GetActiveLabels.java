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

package dfp.axis.v201611.labelservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201611.StatementBuilder;
import com.google.api.ads.dfp.axis.v201611.Label;
import com.google.api.ads.dfp.axis.v201611.LabelPage;
import com.google.api.ads.dfp.axis.v201611.LabelServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all active labels.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetActiveLabels {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    LabelServiceInterface labelService =
        dfpServices.get(session, LabelServiceInterface.class);

    // Create a statement to select labels.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("isActive = :isActive")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("isActive", true);

    // Retrieve a small amount of labels at a time, paging through
    // until all labels have been retrieved.
    int totalResultSetSize = 0;
    do {
      LabelPage page =
          labelService.getLabelsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each label.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Label label : page.getResults()) {
          System.out.printf(
              "%d) Label with ID %d and name '%s' was found.%n",
              i++,
              label.getId(),
              label.getName()
          );
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential for authentication.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an API session configured from a properties file and the OAuth2
    // credentials above.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
