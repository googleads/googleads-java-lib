// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.utility.extension.basicoperations;

import com.google.api.ads.adwords.axis.utility.extension.ExtendedManagedCustomer;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroup;

import java.util.List;

/**
 * This example gets all ad groups in a campaign. To add an ad group, run
 * AddAdGroup.java. To get campaigns, run GetCampaigns.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupService.get
 *
 * @author Julian Toledo
 */
public class GetAdGroups {

  public static void main(String[] args) throws Exception {
    // Creating ExtendedManagedCustomer using OAuth2 credentials form file
    ExtendedManagedCustomer extendedManagedCustomer = ExtendedManagedCustomer.withOAuth2FromFile();

    Long campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");

    runExample(extendedManagedCustomer, campaignId);
  }

  public static void runExample(
      ExtendedManagedCustomer extendedManagedCustomer, Long campaignId) throws Exception {

    List<AdGroup> adgroups = extendedManagedCustomer.getExtendedCampaign(campaignId).getAdGroups();

    for (AdGroup adGroup : adgroups) {
      System.out.printf("AdGroup with name '%s' and ID '%d' was found.\n",
          adGroup.getName(), adGroup.getId());
    }
  }
}
