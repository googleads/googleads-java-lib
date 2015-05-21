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

package dfp.axis.v201408.contentservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201408.StatementBuilder;
import com.google.api.ads.dfp.axis.v201408.Content;
import com.google.api.ads.dfp.axis.v201408.ContentPage;
import com.google.api.ads.dfp.axis.v201408.ContentServiceInterface;
import com.google.api.ads.dfp.axis.v201408.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.axis.v201408.CustomTargetingValuePage;
import com.google.api.ads.dfp.axis.v201408.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201408.Statement;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all active content categorized as "comedy" using the
 * network's content browse custom targeting key. This feature is only available
 * to DFP video publishers.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: NetworkService.getCurrentNetwork
 * Tags: CustomTargetingService.getCustomTargetingValuesByStatement
 * Tags: ContentService.getContentByStatementAndCustomTargetingValue
 *
 * @author Adam Rogal
 */
public class GetComedyContent {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the ContentService.
    ContentServiceInterface contentService =
        dfpServices.get(session, ContentServiceInterface.class);

    // Get the CustomTargetingService.
    CustomTargetingServiceInterface customTargetingService =
        dfpServices.get(session, CustomTargetingServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Get content browse custom targeting key ID.
    long contentBrowseCustomTargetingKeyId =
        networkService.getCurrentNetwork().getContentBrowseCustomTargetingKeyId();

    if (contentBrowseCustomTargetingKeyId == 0) {
      throw new RuntimeException("Your network does not have content categories enabled.");      
    }

    // Create a statement to select the categories matching the name comedy.
    Statement categoryFilterStatement = new StatementBuilder()
        .where("customTargetingKeyId = :contentBrowseCustomTargetingKeyId and name = :category")
        .limit(1)
        .withBindVariableValue(
            "contentBrowseCustomTargetingKeyId", contentBrowseCustomTargetingKeyId)
        .withBindVariableValue("category", "comedy").toStatement();

    // Get categories matching the filter statement.
    CustomTargetingValuePage customTargetingValuePage =
        customTargetingService.getCustomTargetingValuesByStatement(categoryFilterStatement);

    // Get the custom targeting value ID for the comedy category.
    long categoryCustomTargetingValueId = customTargetingValuePage.getResults()[0].getId();

    // Create a statement to select all content.
    StatementBuilder statementBuilder = new StatementBuilder()
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get content by statement.
      ContentPage page = contentService.getContentByStatementAndCustomTargetingValue(
          statementBuilder.toStatement(), categoryCustomTargetingValueId);

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Content content : page.getResults()) {
          System.out.printf(
              "%d) Content with ID \"%d\" and name \"%s\" was found.\n", i++,
              content.getId(), content.getName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d\n", totalResultSetSize);
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
