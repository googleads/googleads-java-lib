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

package dfp.axis.v201711.creativewrapperservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.CreativeWrapper;
import com.google.api.ads.dfp.axis.v201711.CreativeWrapperPage;
import com.google.api.ads.dfp.axis.v201711.CreativeWrapperServiceInterface;
import com.google.api.ads.dfp.axis.v201711.CreativeWrapperStatus;
import com.google.api.ads.dfp.axis.v201711.DeactivateCreativeWrappers;
import com.google.api.ads.dfp.axis.v201711.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example deactivates all creative wrappers belonging to a label. To
 * determine which labels exist, run GetAllLabels.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class DeactivateCreativeWrappersForLabel {

  private static class DeactivateCreativeWrappersForLabelParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.LABEL_ID, required = true,
        description = "The ID of the creative wrapper label to deactivate.")
    private Long labelId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long labelId)
      throws Exception {
    // Get the CreativeWrapperService.
    CreativeWrapperServiceInterface creativeWrapperService =
        dfpServices.get(session, CreativeWrapperServiceInterface.class);

    // Create a statement to select the active creative wrappers for the
    // given label.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE status = :status AND labelId = :labelId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("status", CreativeWrapperStatus.ACTIVE.toString())
        .withBindVariableValue("labelId", labelId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get creative wrappers by statement.
      CreativeWrapperPage page =
          creativeWrapperService.getCreativeWrappersByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (CreativeWrapper creativeWrapper : page.getResults()) {
          System.out.printf("%d) Creative wrapper with ID %d applying to label ID"
              + " %d will be deactivated.%n", i++, creativeWrapper.getId(),
              creativeWrapper.getLabelId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of creative wrappers to be deactivated: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      DeactivateCreativeWrappers action = new DeactivateCreativeWrappers();

      // Perform action.
      UpdateResult result = creativeWrapperService.performCreativeWrapperAction(
          action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of creative wrappers deactivated: %d%n", result.getNumChanges());
      } else {
        System.out.println("No creative wrappers were deactivated.");
      }
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

    DeactivateCreativeWrappersForLabelParams params =
        new DeactivateCreativeWrappersForLabelParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.labelId = Long.parseLong("INSERT_LABEL_ID_HERE");
    }

    runExample(dfpServices, session, params.labelId);
  }
}
