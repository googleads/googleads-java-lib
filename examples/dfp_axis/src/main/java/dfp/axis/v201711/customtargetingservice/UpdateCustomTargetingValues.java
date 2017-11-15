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

package dfp.axis.v201711.customtargetingservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingValue;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingValuePage;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example updates a custom targeting value's display name. To determine
 * which custom targeting keys and values exist, run
 * GetAllCustomTargetingValuesAndValue.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateCustomTargetingValues {

  private static class UpdateCustomTargetingValuesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.TARGETING_VALUE_ID, required = true,
        description = "The ID of the custom targeting value to update.")
    private Long customTargetingValueId;
  }

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long customTargetingValueId) throws Exception {
    // Get the CustomTargetingService.
    CustomTargetingServiceInterface customTargetingService =
        dfpServices.get(session, CustomTargetingServiceInterface.class);

    // Create a statement to get custom targeting values.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", customTargetingValueId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get custom targeting values by statement.
      CustomTargetingValuePage page =
          customTargetingService.getCustomTargetingValuesByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        CustomTargetingValue[] customTargetingValues = page.getResults();

        // Update each local custom targeting value object by changing its display
        // name.
        for (CustomTargetingValue customTargetingValue : customTargetingValues) {
          if (customTargetingValue.getDisplayName() == null) {
            customTargetingValue.setDisplayName(customTargetingValue.getName());
          }
          customTargetingValue.setDisplayName(
              customTargetingValue.getDisplayName() + " (Deprecated)");
        }

        // Update the custom targeting values on the server.
        customTargetingValues =
            customTargetingService.updateCustomTargetingValues(customTargetingValues);

        for (CustomTargetingValue updatedCustomTargetingValue : customTargetingValues) {
          System.out.printf("Custom targeting value with ID %d, name '%s', and display name "
              + "'%s' was updated.%n", updatedCustomTargetingValue.getId(),
              updatedCustomTargetingValue.getName(), updatedCustomTargetingValue.getDisplayName());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);
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

    UpdateCustomTargetingValuesParams params = new UpdateCustomTargetingValuesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customTargetingValueId = Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_HERE");
    }

    runExample(dfpServices, session, params.customTargetingValueId);
  }
}
