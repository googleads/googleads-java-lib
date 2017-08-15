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

package dfp.axis.v201708.contentmetadatakeyhierarchyservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.ContentMetadataKeyHierarchy;
import com.google.api.ads.dfp.axis.v201708.ContentMetadataKeyHierarchyLevel;
import com.google.api.ads.dfp.axis.v201708.ContentMetadataKeyHierarchyPage;
import com.google.api.ads.dfp.axis.v201708.ContentMetadataKeyHierarchyServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
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

  private static class UpdateContentMetadataKeyHierarchiesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CONTENT_METADATA_KEY_HIERARCHY_ID, required = true,
        description = "The ID of the content metadata key hierarchy to update.")
    private Long contentMetadataKeyHierarchyId;

    @Parameter(names = ArgumentNames.TARGETING_KEY_ID, required = true,
        description = "The ID of the custom targeting key to be added as a hierarchy level")
    private Long customTargetingKeyId;
  }

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
      System.out.printf("Content metadata key hierarchy with ID %d, name '%s' was updated.%n",
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

    UpdateContentMetadataKeyHierarchiesParams params =
        new UpdateContentMetadataKeyHierarchiesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.contentMetadataKeyHierarchyId =
          Long.parseLong("INSERT_CONTENT_METADATA_KEY_HIERARCHY_ID_HERE");
      params.customTargetingKeyId = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE");
    }

    runExample(dfpServices, session, params.contentMetadataKeyHierarchyId,
        params.customTargetingKeyId);
  }
}
