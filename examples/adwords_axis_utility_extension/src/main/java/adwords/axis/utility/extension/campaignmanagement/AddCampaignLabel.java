// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.utility.extension.campaignmanagement;

import com.google.api.ads.adwords.axis.utility.extension.ExtendedManagedCustomer;
import com.google.api.ads.adwords.axis.v201506.cm.CampaignLabel;
import com.google.api.ads.adwords.axis.v201506.cm.TextLabel;

/**
 * This example creates a TextLabel and a Campaign Label.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.</p>
 *
 * <p>Tags: LabelService.mutate</p>
 *
 * @category adx-exclude
 * @author Julian Toledo
 */
public class AddCampaignLabel {

  public static void main(String[] args) throws Exception {
    // Creating ExtendedManagedCustomer using OAuth2 credentials from file
    ExtendedManagedCustomer extendedManagedCustomer = ExtendedManagedCustomer.withOAuth2FromFile();

    long campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");

    runExample(extendedManagedCustomer, campaignId);
  }

  public static void runExample(
      ExtendedManagedCustomer extendedManagedCustomer, Long campaignId) throws Exception {

    // Create TextLabel first at the Account level.
    TextLabel textLabel = new TextLabel();
    textLabel.setName("LabelTest123");
    TextLabel newTextLabel = (TextLabel) extendedManagedCustomer.insertLabel(textLabel);

    // Create the CampaignLabel with the LabelId of the Label generated above.
    CampaignLabel campaignLabel = extendedManagedCustomer.getExtendedCampaign(
      campaignId).insertCampaignLabel(newTextLabel.getId());

    // Display CampaignLabel.
    System.out.printf("CampaignLabel with label id %d, campaign id %d, and name '%s' was "
        + "added to the Campaign.%n", campaignLabel.getLabelId(), campaignLabel.getCampaignId(),
        textLabel.getName());
  }
}
