// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201705.campaignmanagement;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignLabel;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignLabelOperation;
import com.google.api.ads.adwords.axis.v201705.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This example adds a label to multiple campaigns.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddCampaignLabels {

  private static class AddCampaignLabelsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private List<Long> campaignIds = new ArrayList<>();

    @Parameter(names = ArgumentNames.LABEL_ID, required = true)
    private Long labelId;
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    AddCampaignLabelsParams params = new AddCampaignLabelsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.campaignIds = Arrays.asList(
          Long.valueOf("INSERT_CAMPAIGN_ID_HERE"),
          Long.valueOf("INSERT_CAMPAIGN_ID_HERE"));
      params.labelId = Long.parseLong("INSERT_LABEL_ID_HERE");
    }

    runExample(adWordsServices, session, params.campaignIds, params.labelId);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      List<Long> campaignIds, Long labelId) throws Exception {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create label operations.
    List<CampaignLabelOperation> operations = new ArrayList<>(
        campaignIds.size());
    for (Long campaignId : campaignIds) {
      CampaignLabel campaignLabel = new CampaignLabel();
      campaignLabel.setCampaignId(campaignId);
      campaignLabel.setLabelId(labelId);
      
      CampaignLabelOperation operation = new CampaignLabelOperation();
      operation.setOperand(campaignLabel);
      operation.setOperator(Operator.ADD);
      
      operations.add(operation);
    }

    // Display campaign labels.
    for (CampaignLabel campaignLabelResult : campaignService.mutateLabel(
        operations.toArray(new CampaignLabelOperation[operations.size()])).getValue()) {
      System.out.printf("Campaign label for campaign ID %d and label ID %d was added.%n",
          campaignLabelResult.getCampaignId(), campaignLabelResult.getLabelId());
    }
  }
}
