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

package dfp.axis.v201502.contentmetadatakeyhierarchyservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201502.ContentMetadataKeyHierarchy;
import com.google.api.ads.dfp.axis.v201502.ContentMetadataKeyHierarchyLevel;
import com.google.api.ads.dfp.axis.v201502.ContentMetadataKeyHierarchyServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * This example creates content metadata key hierarchies. To determine
 * which content metadata key hierarchies exist, run
 * GetAllContentMetadataKeyHierarchies.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateContentMetadataKeyHierarchies {
  
  // Set the IDs of the custom targeting keys for the hierarchy.
  private static final String HIERARCHY_LEVEL_ONE_KEY_ID =
      "INSERT_LEVEL_ONE_CUSTOM_TARGETING_KEY_ID_HERE";
  private static final String HIERARCHY_LEVEL_TWO_KEY_ID = 
      "INSERT_LEVEL_TWO_CUSTOM_TARGETING_KEY_ID_HERE";
  
  public static void runExample(DfpServices dfpServices, DfpSession session,
      long customTargetingKeyId1, long customTargetingKeyId2) throws Exception {

    // Get the ContentMetadataKeyHierarchy service.
    ContentMetadataKeyHierarchyServiceInterface contentMetadataKeyHierarchyService =
        dfpServices.get(session, ContentMetadataKeyHierarchyServiceInterface.class);

    List<ContentMetadataKeyHierarchyLevel> hierarchyLevels = Lists.newArrayList();
    
    ContentMetadataKeyHierarchyLevel hierarchyLevel1 = new ContentMetadataKeyHierarchyLevel();
    hierarchyLevel1.setCustomTargetingKeyId(customTargetingKeyId1);
    hierarchyLevel1.setHierarchyLevel(1);
    hierarchyLevels.add(hierarchyLevel1);
    
    ContentMetadataKeyHierarchyLevel hierarchyLevel2 = new ContentMetadataKeyHierarchyLevel();
    hierarchyLevel2.setCustomTargetingKeyId(customTargetingKeyId2);
    hierarchyLevel2.setHierarchyLevel(2);
    hierarchyLevels.add(hierarchyLevel2);
    
    ContentMetadataKeyHierarchy contentMetadataKeyHierarchy = new ContentMetadataKeyHierarchy();
    contentMetadataKeyHierarchy.setName("Content hierarchy #" + new Random()
        .nextInt(Integer.MAX_VALUE));
    contentMetadataKeyHierarchy.setHierarchyLevels(
        hierarchyLevels.toArray(new ContentMetadataKeyHierarchyLevel[] {}));
    
    // Create the content metadata key hierarchy on the server.
    ContentMetadataKeyHierarchy[] contentMetadataKeyHierarchies = contentMetadataKeyHierarchyService
        .createContentMetadataKeyHierarchies(new ContentMetadataKeyHierarchy[] {
            contentMetadataKeyHierarchy});
    
    for (ContentMetadataKeyHierarchy createdContentMetadataKeyHierarchy : 
        contentMetadataKeyHierarchies) {
      System.out.printf("A content metadata key hierarchy with ID %d, name '%s', and %d "
          + "levels was created.%n", createdContentMetadataKeyHierarchy.getId(), 
          createdContentMetadataKeyHierarchy.getName(),
          createdContentMetadataKeyHierarchy.getHierarchyLevels().length);
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

    runExample(dfpServices, session, Long.parseLong(HIERARCHY_LEVEL_ONE_KEY_ID), 
        Long.parseLong(HIERARCHY_LEVEL_TWO_KEY_ID));
  }
}
