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

package dfp.axis.v201611.creativeservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201611.AssetCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201611.BaseCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201611.Creative;
import com.google.api.ads.dfp.axis.v201611.CreativeAsset;
import com.google.api.ads.dfp.axis.v201611.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201611.Size;
import com.google.api.ads.dfp.axis.v201611.StringCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201611.TemplateCreative;
import com.google.api.ads.dfp.axis.v201611.UrlCreativeTemplateVariableValue;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

/**
 * This example creates a new native creative. To determine which creatives exist, run
 * GetAllCreatives.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateNativeCreatives {

  // Set the ID of the advertiser (company) that all creatives will be assigned to.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long advertiserId)
      throws Exception {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        dfpServices.get(session, CreativeServiceInterface.class);

    // Use the system defined native app install creative template.
    long nativeAppInstallTemplateId = 10004400L;
    
    // Use 1x1 as the size for native creatives.
    Size size = new Size();
    size.setWidth(1);
    size.setHeight(1);
    size.setIsAspectRatio(false);

    // Create a native app install creative for the Pie Noon app.
    TemplateCreative nativeAppInstallCreative = new TemplateCreative();
    nativeAppInstallCreative.setName("Native creative #" + new Random().nextInt(Integer.MAX_VALUE));
    nativeAppInstallCreative.setAdvertiserId(advertiserId);
    nativeAppInstallCreative.setDestinationUrl(
        "https://play.google.com/store/apps/details?id=com.google.fpl.pie_noon");
    nativeAppInstallCreative.setCreativeTemplateId(nativeAppInstallTemplateId);
    nativeAppInstallCreative.setSize(size);

    List<BaseCreativeTemplateVariableValue> templateVariables = Lists.newArrayList();
    
    // Set the headline.
    StringCreativeTemplateVariableValue headlineVariableValue =
        new StringCreativeTemplateVariableValue();
    headlineVariableValue.setUniqueName("Headline");
    headlineVariableValue.setValue("Pie Noon");
    templateVariables.add(headlineVariableValue);
    
    // Set the body text.
    StringCreativeTemplateVariableValue bodyVariableValue =
        new StringCreativeTemplateVariableValue();
    bodyVariableValue.setUniqueName("Body");
    bodyVariableValue.setValue("Try multi-screen mode!");
    templateVariables.add(bodyVariableValue);
    
    // Set the image asset.
    AssetCreativeTemplateVariableValue imageVariableValue = 
        new AssetCreativeTemplateVariableValue();
    imageVariableValue.setUniqueName("Image");
    CreativeAsset imageAsset = new CreativeAsset();
    imageAsset.setFileName("image" + new Random().nextInt(Integer.MAX_VALUE) + ".png");
    imageAsset.setAssetByteArray(Media.getMediaDataFromUrl("https://lh4.ggpht.com/"
        + "GIGNKdGHMEHFDw6TM2bgAUDKPQQRIReKZPqEpMeEhZOPYnTdOQGaSpGSEZflIFs0iw=h300")); 
    imageVariableValue.setAsset(imageAsset);
    templateVariables.add(imageVariableValue);
    
    // Set the price.
    StringCreativeTemplateVariableValue priceVariableValue =
        new StringCreativeTemplateVariableValue();
    priceVariableValue.setUniqueName("Price");
    priceVariableValue.setValue("Free");
    templateVariables.add(priceVariableValue);
    
    // Set app icon image asset.
    AssetCreativeTemplateVariableValue appIconVariableValue = 
        new AssetCreativeTemplateVariableValue();
    appIconVariableValue.setUniqueName("Appicon");
    CreativeAsset appIconAsset = new CreativeAsset();
    appIconAsset.setFileName("icon" + new Random().nextInt(Integer.MAX_VALUE) + ".png");   
    appIconAsset.setAssetByteArray(Media.getMediaDataFromUrl("https://lh6.ggpht.com/"
        + "Jzvjne5CLs6fJ1MHF-XeuUfpABzl0YNMlp4RpHnvPRCIj4--eTDwtyouwUDzVVekXw=w300"));
    appIconVariableValue.setAsset(appIconAsset);
    templateVariables.add(appIconVariableValue);
    
    // Set the call to action text.
    StringCreativeTemplateVariableValue callToActionVariableValue =
        new StringCreativeTemplateVariableValue();
    callToActionVariableValue.setUniqueName("Calltoaction");
    callToActionVariableValue.setValue("Install");
    templateVariables.add(callToActionVariableValue);
    
    // Set the star rating.
    StringCreativeTemplateVariableValue starRatingVariableValue =
        new StringCreativeTemplateVariableValue();
    starRatingVariableValue.setUniqueName("Starrating");
    starRatingVariableValue.setValue("4");
    templateVariables.add(starRatingVariableValue);
    
    // Set the store type.
    StringCreativeTemplateVariableValue storeVariableValue =
        new StringCreativeTemplateVariableValue();
    storeVariableValue.setUniqueName("Store");
    storeVariableValue.setValue("Google Play");
    templateVariables.add(storeVariableValue);
    
    // Set the deep link URL.
    UrlCreativeTemplateVariableValue deepLinkVariableValue = 
        new UrlCreativeTemplateVariableValue();
    deepLinkVariableValue.setUniqueName("DeeplinkclickactionURL");
    deepLinkVariableValue.setValue("market://details?id=com.google.fpl.pie_noon");
    templateVariables.add(deepLinkVariableValue);
    
    nativeAppInstallCreative.setCreativeTemplateVariableValues(
        templateVariables.toArray(new BaseCreativeTemplateVariableValue[templateVariables.size()]));
    
    // Create the creative on the server.
    Creative[] creatives =
        creativeService.createCreatives(new Creative[] {nativeAppInstallCreative});

    for (Creative createdCreative : creatives) {
      System.out.printf("A native creative with ID %d and name '%s' was"
          + " created and can be previewed at: %s%n", createdCreative.getId(),
          createdCreative.getName(), createdCreative.getPreviewUrl());
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

    runExample(dfpServices, session, Long.parseLong(ADVERTISER_ID));
  }
}
