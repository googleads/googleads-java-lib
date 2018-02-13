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

package dfp.axis.v201802.contentmetadatakeyhierarchyservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchy;
import com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyLevel;
import com.google.api.ads.dfp.axis.v201802.ContentMetadataKeyHierarchyServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.ArrayList;
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

  private static class CreateContentMetadataKeyHierarchiesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.HIERARCHY_LEVEL_ONE_KEY_ID, required = true,
        description = "The ID of the custom targeting key for the first level.")
    private Long hierarchyLevelOneKeyId;

    @Parameter(names = ArgumentNames.HIERARCHY_LEVEL_TWO_KEY_ID, required = true,
        description = "The ID of the custom targeting key for the second level.")
    private Long hierarchyLevelTwoKeyId;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param customTargetingKeyId1 the ID of the custom targeting key for the first level.
   * @param customTargetingKeyId2 the ID of the custom targeting key for the second level.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      DfpServices dfpServices,
      DfpSession session,
      long customTargetingKeyId1,
      long customTargetingKeyId2)
      throws RemoteException {

    // Get the ContentMetadataKeyHierarchy service.
    ContentMetadataKeyHierarchyServiceInterface contentMetadataKeyHierarchyService =
        dfpServices.get(session, ContentMetadataKeyHierarchyServiceInterface.class);

    List<ContentMetadataKeyHierarchyLevel> hierarchyLevels = new ArrayList<>();
    
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

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder().forApi(Api.DFP).fromFile().build().generateCredential();

      // Construct a DfpSession.
      session = new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    DfpServices dfpServices = new DfpServices();

    CreateContentMetadataKeyHierarchiesParams params =
        new CreateContentMetadataKeyHierarchiesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.hierarchyLevelOneKeyId = Long.parseLong("INSERT_HIERARCHY_LEVEL_ONE_KEY_ID_HERE");
      params.hierarchyLevelTwoKeyId = Long.parseLong("INSERT_HIERARCHY_LEVEL_TWO_KEY_ID_HERE");
    }

    try {
      runExample(
          dfpServices, session, params.hierarchyLevelOneKeyId, params.hierarchyLevelTwoKeyId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the dfp.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
