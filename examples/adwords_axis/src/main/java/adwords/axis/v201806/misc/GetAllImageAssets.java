// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201806.misc;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201806.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201806.cm.ApiError;
import com.google.api.ads.adwords.axis.v201806.cm.ApiException;
import com.google.api.ads.adwords.axis.v201806.cm.Asset;
import com.google.api.ads.adwords.axis.v201806.cm.AssetPage;
import com.google.api.ads.adwords.axis.v201806.cm.AssetServiceInterface;
import com.google.api.ads.adwords.axis.v201806.cm.AssetType;
import com.google.api.ads.adwords.axis.v201806.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201806.cm.AssetField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/** This code example gets all image assets. To upload an image asset, run UploadImageAsset.java. */
public class GetAllImageAssets {

  private static final int PAGE_SIZE = 100;

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    try {
      runExample(adWordsServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
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
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {
    // Get the AdGroupAdService.
    AssetServiceInterface assetService = adWordsServices.get(session, AssetServiceInterface.class);

    int offset = 0;
    boolean morePages = true;

    // Create the selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector =
        builder
            .fields(
                AssetField.AssetName,
                AssetField.AssetStatus,
                AssetField.ImageFileSize,
                AssetField.ImageWidth,
                AssetField.ImageHeight,
                AssetField.ImageFullSizeUrl)
            .offset(offset)
            .limit(PAGE_SIZE)
            // Filter for image assets only.
            .equals(AssetField.AssetSubtype, AssetType.IMAGE.getValue())
            .build();

    int totalEntries = 0;
    while (morePages) {
      // Get the image assets.
      AssetPage page = assetService.get(selector);

      // Display the results.
      if (page.getEntries() != null && page.getEntries().length > 0) {
        totalEntries = page.getTotalNumEntries();
        int i = selector.getPaging().getStartIndex();
        for (Asset asset : page.getEntries()) {
          System.out.printf(
              "%d) Image asset with ID %d, name '%s', and status '%s' was found.%n",
              i, asset.getAssetId(), asset.getAssetName(), asset.getAssetStatus());
        }
      }

      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
      morePages = offset < page.getTotalNumEntries();
    }

    System.out.printf("Found %d image assets.%n", totalEntries);
  }
}
