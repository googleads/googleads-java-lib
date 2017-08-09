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

package dfp.axis.v201705.creativeservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201705.AssetCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201705.BaseCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201705.Creative;
import com.google.api.ads.dfp.axis.v201705.CreativeAsset;
import com.google.api.ads.dfp.axis.v201705.CreativeServiceInterface;
import com.google.api.ads.dfp.axis.v201705.LongCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201705.Size;
import com.google.api.ads.dfp.axis.v201705.StringCreativeTemplateVariableValue;
import com.google.api.ads.dfp.axis.v201705.TemplateCreative;
import com.google.api.ads.dfp.axis.v201705.UrlCreativeTemplateVariableValue;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
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

  private static class CreateCreativesFromTemplatesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ADVERTISER_ID, required = true,
        description = "The ID of the advertiser (company) that all creatives will be assigned"
            + " to.")
    private Long advertiserId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long advertiserId)
      throws Exception {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        dfpServices.get(session, CreativeServiceInterface.class);

    // Create creative size.
    Size size = new Size();
    size.setWidth(600);
    size.setHeight(315);
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
    asset.setAssetByteArray(Media.getMediaDataFromUrl("https://goo.gl/3b9Wfh"));
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

    CreateCreativesFromTemplatesParams params = new CreateCreativesFromTemplatesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.advertiserId = Long.parseLong("INSERT_ADVERTISER_ID_HERE");
    }

    runExample(dfpServices, session, params.advertiserId);
  }
}
