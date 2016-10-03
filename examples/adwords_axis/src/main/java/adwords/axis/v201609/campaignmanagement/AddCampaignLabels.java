// Copyright 2016 Google Inc. All Rights Reserved.
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

package adwords.axis.v201609.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignLabel;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignLabelOperation;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This example adds a label to multiple campaigns.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddCampaignLabels {

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

    List<Long> campaignIds = Lists.newArrayList( 
        Long.valueOf("INSERT_CAMPAIGN_ID_1_HERE"),
        Long.valueOf("INSERT_CAMPAIGN_ID_2_HERE"));
    Long labelId = Long.valueOf("INSERT_LABEL_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignIds, labelId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      List<Long> campaignIds, Long labelId) throws Exception {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create label operations.
    List<CampaignLabelOperation> operations = Lists.newArrayListWithCapacity(
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
