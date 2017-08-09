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

package adwords.axis.v201708.campaignmanagement;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201708.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201708.cm.Campaign;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201708.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.Label;
import com.google.api.ads.adwords.axis.v201708.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201708.cm.CampaignField;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * This example gets all campaigns with a specific label. To add a label to campaigns,
 * run AddCampaignLabels.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetCampaignsByLabel {

  private static final int PAGE_SIZE = 100;

  private static class GetCampaignsByLabelParams extends CodeSampleParams {
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

    
    GetCampaignsByLabelParams params = new GetCampaignsByLabelParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.labelId = Long.parseLong("INSERT_LABEL_ID_HERE");
    }

    runExample(adWordsServices, session, params.labelId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long labelId)
      throws Exception {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    int offset = 0;

    // Create selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector = builder
        .fields(CampaignField.Id, CampaignField.Name, CampaignField.Labels)
        // Labels filtering is performed by ID. You can use containsAny to select campaigns with
        // any of the label IDs, containsAll to select campaigns with all of the label IDs, or
        // containsNone to select campaigns with none of the label IDs.
        .containsAny(CampaignField.Labels, labelId.toString())
        .orderAscBy(CampaignField.Name)
        .offset(offset)
        .limit(PAGE_SIZE)
        .build();

    CampaignPage page = null;
    do {
      // Get all campaigns.
      page = campaignService.get(selector);

      // Display campaigns.
      if (page.getEntries() != null) {
        for (Campaign campaign : page.getEntries()) {
          String labels = Joiner.on(", ").join(Lists.transform(
              Lists.newArrayList(campaign.getLabels()), new Function<Label, String>() {
                @Override
                public String apply(Label label) {
                  return String.format("%d/%s", label.getId(), label.getName());
                }
              }));
          System.out.printf("Campaign found with name '%s' and ID %d and labels: %s.%n",
              campaign.getName(), campaign.getId(), labels);
        }
      } else {
        System.out.println("No campaigns were found.");
      }

      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
    } while (offset < page.getTotalNumEntries());
  }
}
