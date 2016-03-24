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

package adwords.axis.v201603.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201603.cm.AdGroupBidModifier;
import com.google.api.ads.adwords.axis.v201603.cm.AdGroupBidModifierOperation;
import com.google.api.ads.adwords.axis.v201603.cm.AdGroupBidModifierReturnValue;
import com.google.api.ads.adwords.axis.v201603.cm.AdGroupBidModifierServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.Operator;
import com.google.api.ads.adwords.axis.v201603.cm.Platform;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to add ad group level mobile bid modifier override for a campaign.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddAdGroupBidModifier {

  private static final double BID_MODIFIER = 1.5;

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

    Long adGroupId = Long.valueOf("INSERT_ADGROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long adGroupId) throws Exception {
    // Get the AdGroupBidModifierService.
    AdGroupBidModifierServiceInterface adGroupBidModifierService =
        adWordsServices.get(session, AdGroupBidModifierServiceInterface.class);

    // Create mobile platform. The ID can be found in the documentation.
    // https://developers.google.com/adwords/api/docs/appendix/platforms
    Platform mobile = new Platform();
    mobile.setId(30001L);

    AdGroupBidModifier adGroupBidModifier = new AdGroupBidModifier();
    adGroupBidModifier.setAdGroupId(adGroupId);
    adGroupBidModifier.setBidModifier(BID_MODIFIER);
    adGroupBidModifier.setCriterion(mobile);

    // Create ADD operation.
    AdGroupBidModifierOperation operation = new AdGroupBidModifierOperation();
    operation.setOperand(adGroupBidModifier);
    // Use 'ADD' to add a new modifier and 'SET' to update an existing one. A
    // modifier can be removed with the 'REMOVE' operator.
    operation.setOperator(Operator.ADD);

    // Update ad group bid modifier.
    AdGroupBidModifierReturnValue result =
        adGroupBidModifierService.mutate(new AdGroupBidModifierOperation[] {operation});
    for (AdGroupBidModifier bidModifierResult : result.getValue()) {
      System.out.printf(
          "Campaign ID %d, ad group ID %d was updated with ad group level modifier: %.4f%n",
          bidModifierResult.getCampaignId(), bidModifierResult.getAdGroupId(),
          bidModifierResult.getBidModifier());
    }
  }
}
