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

package dfp.axis.v201705.labelservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201705.StatementBuilder;
import com.google.api.ads.dfp.axis.v201705.Label;
import com.google.api.ads.dfp.axis.v201705.LabelPage;
import com.google.api.ads.dfp.axis.v201705.LabelServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a label's description. To determine which labels
 * exist, run GetAllLabels.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateLabels {

  private static class UpdateLabelsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.LABEL_ID, required = true,
        description = "The ID of the label to update.")
    private Long labelId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long labelId)
      throws Exception {
    // Get the LabelService.
    LabelServiceInterface labelService =
        dfpServices.get(session, LabelServiceInterface.class);

    // Create a statement to only select a single label by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", labelId);

    // Get the label.
    LabelPage page =
        labelService.getLabelsByStatement(statementBuilder.toStatement());

    Label label = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the label description.
    label.setDescription("New label description");

    // Update the label on the server.
    Label[] labels =
        labelService.updateLabels(new Label[] {label});

    for (Label updatedLabel : labels) {
      System.out.printf("Label with ID %d and name '%s' was updated.%n", updatedLabel.getId(),
          updatedLabel.getName());
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

    UpdateLabelsParams params = new UpdateLabelsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.labelId = Long.parseLong("INSERT_LABEL_ID_HERE");
    }

    runExample(dfpServices, session, params.labelId);
  }
}
