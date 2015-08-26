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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.ContentCategory;
import com.google.api.ads.dfa.axis.v1_20.ContentCategoryRemote;
import com.google.api.ads.dfa.axis.v1_20.ContentCategorySaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a content category with the given name and description.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateContentCategory {

  // Set the name and description for the new content category.
  private static final String CONTENT_CATEGORY_NAME = "INSERT_CONTENT_CATEGORY_NAME_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String contentCategoryName) throws Exception {
    // Request the service.
    ContentCategoryRemote service = dfaServices.get(session, ContentCategoryRemote.class);

    // Create the content category.
    ContentCategory contentCategory = new ContentCategory();
    contentCategory.setId(0);
    contentCategory.setName(contentCategoryName);

    // Save the content category.
    ContentCategorySaveResult contentCategorySaveResult =
        service.saveContentCategory(contentCategory);

    // Display the new content category ID.
    System.out.printf("Content category with ID \"%s\" was created.%n",
        contentCategorySaveResult.getId());
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    runExample(dfaServices, session, CONTENT_CATEGORY_NAME);
  }
}
