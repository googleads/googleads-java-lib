// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201406.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201406.cm.Address;
import com.google.api.ads.adwords.axis.v201406.cm.CampaignAdExtension;
import com.google.api.ads.adwords.axis.v201406.cm.CampaignAdExtensionOperation;
import com.google.api.ads.adwords.axis.v201406.cm.CampaignAdExtensionReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.CampaignAdExtensionServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.GeoLocation;
import com.google.api.ads.adwords.axis.v201406.cm.GeoLocationSelector;
import com.google.api.ads.adwords.axis.v201406.cm.GeoLocationServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.LocationExtension;
import com.google.api.ads.adwords.axis.v201406.cm.LocationExtensionSource;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds a location ad extension to a campaign for a location
 * obtained from the GeoLocationService. To get campaigns, run
 * GetCampaigns.java.
 *
 * Tags: GeoLocationService.get
 * Tags: CampaignAdExtensionService.mutate
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 */
public class AddLocationExtension {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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

    long campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws Exception {
    // Get the CampaignAdExtensionService.
    CampaignAdExtensionServiceInterface campaignAdExtensionService =
        adWordsServices.get(session, CampaignAdExtensionServiceInterface.class);

    // Get the GeoLocationService.
    GeoLocationServiceInterface geoLocationService =
        adWordsServices.get(session, GeoLocationServiceInterface.class);

    // Create address.
    Address address = new Address();
    address.setStreetAddress("1600 Amphitheatre Parkway");
    address.setCityName("Mountain View");
    address.setProvinceCode("US-CA");
    address.setPostalCode("94043");
    address.setCountryCode("US");

    // Create geo location selector.
    GeoLocationSelector selector = new GeoLocationSelector();
    selector.setAddresses(new Address[] {address});

    // Get geo location.
    GeoLocation[] geoLocationResult = geoLocationService.get(selector);
    GeoLocation geoLocation = geoLocationResult[0];

    // Create location extension.
    LocationExtension locationExtension = new LocationExtension();
    locationExtension.setAddress(geoLocation.getAddress());
    locationExtension.setGeoPoint(geoLocation.getGeoPoint());
    locationExtension.setEncodedLocation(geoLocation.getEncodedLocation());
    locationExtension.setSource(LocationExtensionSource.ADWORDS_FRONTEND);

    // You can optionally provide these field(s).
    locationExtension.setCompanyName("Google");
    locationExtension.setPhoneNumber("650-253-0000");

    // Create campaign ad extension.
    CampaignAdExtension campaignAdExtension = new CampaignAdExtension();
    campaignAdExtension.setCampaignId(campaignId);
    campaignAdExtension.setAdExtension(locationExtension);

    // Create operations.
    CampaignAdExtensionOperation operation = new CampaignAdExtensionOperation();
    operation.setOperand(campaignAdExtension);
    operation.setOperator(Operator.ADD);

    CampaignAdExtensionOperation[] operations = new CampaignAdExtensionOperation[] {operation};

    // Add campaign ad extension.
    CampaignAdExtensionReturnValue result = campaignAdExtensionService.mutate(operations);

    // Display campaign ad extensions.
    for (CampaignAdExtension campaignAdExtensionResult : result.getValue()) {
      System.out.println("Location campaign ad extension with campaign id \""
          + campaignAdExtensionResult.getCampaignId() + "\", ad extension id \""
          + campaignAdExtensionResult.getAdExtension().getId() + "\", and type \""
          + campaignAdExtensionResult.getAdExtension().getAdExtensionType() + "\" was added.");
    }
  }
}
