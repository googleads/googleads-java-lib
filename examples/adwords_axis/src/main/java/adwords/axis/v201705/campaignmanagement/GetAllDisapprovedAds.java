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
import com.google.api.ads.adwords.axis.utils.v201705.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdPage;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdPolicySummary;
import com.google.api.ads.adwords.axis.v201705.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.PolicyApprovalStatus;
import com.google.api.ads.adwords.axis.v201705.cm.PolicyTopicEntry;
import com.google.api.ads.adwords.axis.v201705.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201705.cm.AdGroupAdField;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all disapproved ads in an ad group. To get ad groups, run GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetAllDisapprovedAds {

  private static final int PAGE_SIZE = 100;
  
  private static class GetAllDisapprovedAdsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
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

    GetAllDisapprovedAdsParams params = new GetAllDisapprovedAdsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    runExample(adWordsServices, session, params.adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    int offset = 0;

    // Create selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector =
        builder
            .fields(AdGroupAdField.Id, AdGroupAdField.PolicySummary)
            .orderAscBy(AdGroupAdField.Id)
            .equals(AdGroupAdField.AdGroupId, adGroupId.toString())
            .equals(
                AdGroupAdField.CombinedApprovalStatus,
                PolicyApprovalStatus.DISAPPROVED.toString())
            .offset(offset)
            .limit(PAGE_SIZE)
            .build();

    // Get all disapproved ads.
    AdGroupAdPage page = null;
    int disapprovedAdsCount = 0;

    do {
      page = adGroupAdService.get(selector);

      // Display ads.
      for (AdGroupAd adGroupAd : page) {
        disapprovedAdsCount++;
        AdGroupAdPolicySummary policySummary = adGroupAd.getPolicySummary();
        System.out.printf(
            "Ad with ID %d and type '%s' was disapproved with the following "
                + "policy topic entries:%n",
            adGroupAd.getAd().getId(), adGroupAd.getAd().getAdType());
        for (PolicyTopicEntry policyTopicEntry : policySummary.getPolicyTopicEntries()) {
          System.out.printf(
              "  topic id: %s, topic name: '%s'%n",
              policyTopicEntry.getPolicyTopicId(), policyTopicEntry.getPolicyTopicName());
        }
      }
      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
    } while (offset < page.getTotalNumEntries());
    
    System.out.printf("%d disapproved ads were found.%n", disapprovedAdsCount);
  }
}
