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

package adwords.axis.v201506.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201506.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.Dimensions;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.axis.v201506.cm.RichMediaAdAdAttribute;
import com.google.api.ads.adwords.axis.v201506.cm.RichMediaAdRichMediaAdType;
import com.google.api.ads.adwords.axis.v201506.cm.ThirdPartyRedirectAd;
import com.google.api.ads.adwords.axis.v201506.cm.ThirdPartyRedirectAdExpandingDirection;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds a third party redirect ad to an ad group. To get ad groups,
 * run GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddThirdPartyRedirectAd {

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

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long adGroupId) throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create third party redirect ad.
    ThirdPartyRedirectAd thirdPartyRedirectAd = new ThirdPartyRedirectAd();
    thirdPartyRedirectAd.setName("Example third party ad #" + System.currentTimeMillis());
    thirdPartyRedirectAd.setUrl("http://www.example.com");
    thirdPartyRedirectAd.setDimensions(new Dimensions(300, 250));
    // This field normally contains the javascript ad tag.
    thirdPartyRedirectAd.setSnippet("<img src=\"http://goo.gl/HJM3L\"/>");
    // DoubleClick Rich Media Expandable format ID.
    thirdPartyRedirectAd.setCertifiedVendorFormatId(232L);
    thirdPartyRedirectAd.setIsCookieTargeted(false);
    thirdPartyRedirectAd.setIsUserInterestTargeted(false);
    thirdPartyRedirectAd.setIsTagged(false);

    thirdPartyRedirectAd.setExpandingDirections(new ThirdPartyRedirectAdExpandingDirection[] {
        ThirdPartyRedirectAdExpandingDirection.EXPANDING_UP,
        ThirdPartyRedirectAdExpandingDirection.EXPANDING_DOWN});
    thirdPartyRedirectAd.setAdAttributes(
        new RichMediaAdAdAttribute[] {RichMediaAdAdAttribute.ROLL_OVER_TO_EXPAND});

    // Create ad group ad.
    AdGroupAd adGroupAd1 = new AdGroupAd();
    adGroupAd1.setAdGroupId(adGroupId);
    adGroupAd1.setAd(thirdPartyRedirectAd);

    ThirdPartyRedirectAd inStreamVideo = new ThirdPartyRedirectAd();
    inStreamVideo.setName("Example third party ad #" + System.currentTimeMillis());
    inStreamVideo.setUrl("http://www.example.com");
    inStreamVideo.setAdDuration(15000);
    inStreamVideo.setSourceUrl("http://ad.doubleclick.net/pfadx/N270.126913.6102203221521/"
        + "B3876671.21;dcadv=2215309;sz=0x0;ord=%5btimestamp%5d;dcmt=text/xml");
    inStreamVideo.setCertifiedVendorFormatId(303L);
    inStreamVideo.setRichMediaAdType(RichMediaAdRichMediaAdType.IN_STREAM_VIDEO);

    // Create ad group ad.
    AdGroupAd adGroupAd2 = new AdGroupAd();
    adGroupAd2.setAdGroupId(adGroupId);
    adGroupAd2.setAd(inStreamVideo);

    // Create operations.
    AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
    adGroupAdOperation.setOperand(adGroupAd1);
    adGroupAdOperation.setOperator(Operator.ADD);
    AdGroupAdOperation adGroupAdOperation2 = new AdGroupAdOperation();
    adGroupAdOperation2.setOperand(adGroupAd2);
    adGroupAdOperation2.setOperator(Operator.ADD);

    AdGroupAdOperation[] operations =
        new AdGroupAdOperation[] {adGroupAdOperation, adGroupAdOperation2};

    // Add ads.
    AdGroupAdReturnValue result = adGroupAdService.mutate(operations);

    // Display ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      System.out.println("Ad with id  \"" + adGroupAdResult.getAd().getId() + "\"" + " and type \""
          + adGroupAdResult.getAd().getAdType() + "\" was added.");
    }
  }
}
