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

package admanager.axis.v202411.creativeservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202411.ApiError;
import com.google.api.ads.admanager.axis.v202411.ApiException;
import com.google.api.ads.admanager.axis.v202411.AssetCreativeTemplateVariableValue;
import com.google.api.ads.admanager.axis.v202411.BaseCreativeTemplateVariableValue;
import com.google.api.ads.admanager.axis.v202411.Creative;
import com.google.api.ads.admanager.axis.v202411.CreativeAsset;
import com.google.api.ads.admanager.axis.v202411.CreativeServiceInterface;
import com.google.api.ads.admanager.axis.v202411.LongCreativeTemplateVariableValue;
import com.google.api.ads.admanager.axis.v202411.Size;
import com.google.api.ads.admanager.axis.v202411.StringCreativeTemplateVariableValue;
import com.google.api.ads.admanager.axis.v202411.TemplateCreative;
import com.google.api.ads.admanager.axis.v202411.UrlCreativeTemplateVariableValue;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.admanager.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.Media;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates a new template creative for a given advertiser. To determine which creatives
 * already exist, run GetAllCreatives.java. To determine which creative templates exist, run
 * GetAllCreativeTemplates.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateCreativesFromTemplates {

  private static class CreateCreativesFromTemplatesParams extends CodeSampleParams {
    @Parameter(
        names = ArgumentNames.ADVERTISER_ID,
        required = true,
        description =
            "The ID of the advertiser (company) that all creatives will be assigned" + " to.")
    private Long advertiserId;
  }

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @param advertiserId the ID of the advertiser (company) that all creatives will be assigned to.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws IOException if unable to get media data from the URL.
   */
  public static void runExample(
      AdManagerServices adManagerServices, AdManagerSession session, long advertiserId)
      throws IOException {
    // Get the CreativeService.
    CreativeServiceInterface creativeService =
        adManagerServices.get(session, CreativeServiceInterface.class);

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
    asset.setFileName(String.format("image%s.jpg", new Random().nextInt(Integer.MAX_VALUE)));
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
    UrlCreativeTemplateVariableValue urlVariableValue = new UrlCreativeTemplateVariableValue();
    urlVariableValue.setUniqueName("ClickthroughURL");
    urlVariableValue.setValue("www.google.com");

    // Create the target window variable value.
    StringCreativeTemplateVariableValue targetWindowVariableValue =
        new StringCreativeTemplateVariableValue();
    targetWindowVariableValue.setUniqueName("Targetwindow");
    targetWindowVariableValue.setValue("__blank");

    // Set the creative template variables.
    templateCreative.setCreativeTemplateVariableValues(
        new BaseCreativeTemplateVariableValue[] {
          assetVariableValue,
          imageWidthVariableValue,
          imageHeightVariableValue,
          urlVariableValue,
          targetWindowVariableValue
        });

    // Create the creative on the server.
    Creative[] creatives = creativeService.createCreatives(new Creative[] {templateCreative});

    for (Creative createdCreative : creatives) {
      System.out.printf(
          "A creative with ID %d, name '%s', and type '%s'"
              + " was created and can be previewed at: %s%n",
          createdCreative.getId(),
          createdCreative.getName(),
          createdCreative.getClass().getSimpleName(),
          createdCreative.getPreviewUrl());
    }
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdManagerServices adManagerServices = new AdManagerServices();

    CreateCreativesFromTemplatesParams params = new CreateCreativesFromTemplatesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.advertiserId = Long.parseLong("INSERT_ADVERTISER_ID_HERE");
    }

    try {
      runExample(adManagerServices, session, params.advertiserId);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (IOException ioe) {
      System.err.printf("Example failed due to IOException: %s%n", ioe);
    }
  }
}
