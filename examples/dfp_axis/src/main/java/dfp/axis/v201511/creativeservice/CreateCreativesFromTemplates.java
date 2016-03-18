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

package dfp.axis.v201511.creativeservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201511.AssetCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201511.BaseCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201511.Creative;
import com.google.api.ads.dfp.axis.v201511.CreativeAsset;
import com.google.api.ads.dfp.axis.v201511.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201511.LongCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201511.Size;
import com.google.api.ads.dfp.axis.v201511.StringCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201511.TemplateCreative;
import com.google.api.ads.dfp.axis.v201511.UrlCreativeTemplateVariableValue;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates a new template creative for a given advertiser. To
 * determine which creatives already exist, run GetAllCreatives.java. To
 * determine which creative templates exist, run GetAllCreativeTemplates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateCreativesFromTemplates {

  // Set the ID of the advertiser (company) that all creatives will be assigned
  // to.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_COMPANY_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long advertiserId)
      throws Exception {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        dfpServices.get(session, CreativeServiceInterface.class);

    // Create creative size.
    Size size = new Size();
    size.setWidth(300);
    size.setHeight(250);
    size.setIsAspectRatio(false);

    // Use the image banner with optional third party tracking template.
    // To determine what other creative templates exist,
    // run GetAllCreativeTemplates.java.
    long creativeTemplateId = 10000680L;

    // Create a template creative.
    TemplateCreative templateCreative = new TemplateCreative();
    templateCreative.setName("Template creative #" + new Random().nextInt(Integer.MAX_VALUE));
    templateCreative.setAdvertiserId(advertiserId);
    templateCreative.setCreativeTemplateId(creativeTemplateId);
    templateCreative.setSize(size);

    // Create the asset variable value.
    AssetCreativeTemplateVariableValue assetVariableValue =
        new AssetCreativeTemplateVariableValue();
    assetVariableValue.setUniqueName("Imagefile");
    
    CreativeAsset asset = new CreativeAsset();
    asset.setAssetByteArray(Media.getMediaDataFromUrl(
        "http://www.google.com/intl/en/adwords/select/images/samples/inline.jpg"));
    // Filenames must be unique.
    asset.setFileName(
        String.format("image%s.jpg", new Random().nextInt(Integer.MAX_VALUE)));
    assetVariableValue.setAsset(asset);

    // Create the image width variable value.
    LongCreativeTemplateVariableValue imageWidthVariableValue =
        new LongCreativeTemplateVariableValue();
    imageWidthVariableValue.setUniqueName("Imagewidth");
    imageWidthVariableValue.setValue(300L);

    // Create the image height variable value.
    LongCreativeTemplateVariableValue imageHeightVariableValue =
        new LongCreativeTemplateVariableValue();
    imageHeightVariableValue.setUniqueName("Imageheight");
    imageHeightVariableValue.setValue(250L);

    // Create the URL variable value.
    UrlCreativeTemplateVariableValue urlVariableValue =
        new UrlCreativeTemplateVariableValue();
    urlVariableValue.setUniqueName("ClickthroughURL");
    urlVariableValue.setValue("www.google.com");

    // Create the target window variable value.
    StringCreativeTemplateVariableValue targetWindowVariableValue =
        new StringCreativeTemplateVariableValue();
    targetWindowVariableValue.setUniqueName("Targetwindow");
    targetWindowVariableValue.setValue("__blank");

    // Set the creative template variables.
    templateCreative.setCreativeTemplateVariableValues(new BaseCreativeTemplateVariableValue[] {
        assetVariableValue, imageWidthVariableValue, imageHeightVariableValue, urlVariableValue,
        targetWindowVariableValue});

    // Create the creative on the server.
    Creative[] creatives =
        creativeService.createCreatives(new Creative[] {templateCreative});

    for (Creative createdCreative : creatives) {
      System.out.printf("A creative with ID %d, name '%s', and type '%s'"
          + " was created and can be previewed at: %s%n", createdCreative.getId(),
          createdCreative.getName(), createdCreative.getClass().getSimpleName(),
          createdCreative.getPreviewUrl());
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
