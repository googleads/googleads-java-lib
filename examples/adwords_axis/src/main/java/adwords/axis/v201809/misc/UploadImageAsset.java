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

package adwords.axis.v201809.misc;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201809.cm.ApiError;
import com.google.api.ads.adwords.axis.v201809.cm.ApiException;
import com.google.api.ads.adwords.axis.v201809.cm.Asset;
import com.google.api.ads.adwords.axis.v201809.cm.AssetOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AssetReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AssetServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.ImageAsset;
import com.google.api.ads.adwords.axis.v201809.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 * This example uploads an image asset. To get image assets, run GetAllImageAssets.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class UploadImageAsset {

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
    } catch (IOException ioe) {
      System.err.printf("Example failed due to IOException: %s%n", ioe);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws IOException if unable to get media data from the URL.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws IOException {
    // Get the AssetService.
    AssetServiceInterface assetService = adWordsServices.get(session, AssetServiceInterface.class);

    // Create the image asset.
    ImageAsset image = new ImageAsset();
    // Optional: Provide a unique friendly name to identify your asset. If you specify the assetName
    // field, then both the asset name and the image being uploaded should be unique, and should not
    // match another ACTIVE asset in this customer account.
    // image.setAssetName("Jupiter Trip #" + System.currentTimeMillis());
    image.setImageData(
        com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl("https://goo.gl/3b9Wfh"));

    // Create the operation.
    AssetOperation operation = new AssetOperation();
    operation.setOperator(Operator.ADD);
    operation.setOperand(image);

    // Create the asset.
    AssetReturnValue result = assetService.mutate(new AssetOperation[] {operation});

    // Display the results.
    if (result != null && result.getValue() != null && result.getValue().length > 0) {
      Asset newAsset = result.getValue(0);
      System.out.printf(
          "Image asset with ID %d and name '%s' was created.%n",
          newAsset.getAssetId(), newAsset.getAssetName());
    } else {
      System.out.println("No image asset was created.");
    }
  }
}
