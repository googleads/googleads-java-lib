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

package dfp.axis.v201411.contentmetadatakeyhierarchyservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201411.StatementBuilder;
import com.google.api.ads.dfp.axis.v201411.ContentMetadataKeyHierarchy;
import com.google.api.ads.dfp.axis.v201411.ContentMetadataKeyHierarchyLevel;
import com.google.api.ads.dfp.axis.v201411.ContentMetadataKeyHierarchyPage;
import com.google.api.ads.dfp.axis.v201411.ContentMetadataKeyHierarchyServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import com.google.common.collect.ObjectArrays;

import java.util.Arrays;
/**
 * This example updates a content metadata key hierarchy by adding a hierarchy level. To determine
 * which content metadata key hierarchies exist, run
 * GetAllContentMetadataKeyHierarchies.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateContentMetadataKeyHierarchies {
  
  // Set the ID of the content metadata key hierarchy to update.
  private static final String CONTENT_METADATA_KEY_HIERARCHY_ID = 
      "INSERT_CONTENT_METADATA_KEY_HIERARCHY_ID_HERE";
  
  // Set the ID of the custom targeting key to be added as a hierarchy level
  private static final String CUSTOM_TARGETING_KEY_ID = "INSERT_CUSTOM_TARGETING_KEY_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long contentMetadataKeyHierarchyId, long customTargetingKeyId) throws Exception {
    // Get the ContentMetadataKeyHierarchy service.
    ContentMetadataKeyHierarchyServiceInterface contentMetadataKeyHierarchyService =
        dfpServices.get(session, ContentMetadataKeyHierarchyServiceInterface.class);

    // Create a statement to get content metadata key hierarchies.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", contentMetadataKeyHierarchyId);

    ContentMetadataKeyHierarchyPage page = contentMetadataKeyHierarchyService
        .getContentMetadataKeyHierarchiesByStatement(statementBuilder.toStatement());

    ContentMetadataKeyHierarchy contentMetadataKeyHierarchy = 
        Iterables.getOnlyElement(Arrays.asList(page.getResults()));
    
    // Update the content metadata key hierarchy by adding a hierarchy level.
    ContentMetadataKeyHierarchyLevel[] hierarchyLevels = contentMetadataKeyHierarchy
        .getHierarchyLevels();
    
    ContentMetadataKeyHierarchyLevel hierarchyLevel = new ContentMetadataKeyHierarchyLevel();
    hierarchyLevel.setCustomTargetingKeyId(customTargetingKeyId);
    hierarchyLevel.setHierarchyLevel(hierarchyLevels.length + 1);
    
    contentMetadataKeyHierarchy.setHierarchyLevels(
        ObjectArrays.concat(hierarchyLevels, hierarchyLevel));
    
    // Update the content hierarchy on the server.
    ContentMetadataKeyHierarchy[] contentMetadataKeyHierarchies = contentMetadataKeyHierarchyService
        .updateContentMetadataKeyHierarchies(new ContentMetadataKeyHierarchy[] {
            contentMetadataKeyHierarchy});

    for (ContentMetadataKeyHierarchy updatedContentMetadataKeyHierarchy :
        contentMetadataKeyHierarchies) {
      System.out.printf("Content metadata key hierarchy with ID \"%d\", name \"%s\" was updated.\n",
          updatedContentMetadataKeyHierarchy.getId(), updatedContentMetadataKeyHierarchy.getName());
    }
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

    runExample(dfpServices, session, Long.parseLong(CONTENT_METADATA_KEY_HIERARCHY_ID),
        Long.parseLong(CUSTOM_TARGETING_KEY_ID));
  }
}
