// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201802.misc;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.Dimensions;
import com.google.api.ads.adwords.axis.v201802.cm.Media;
import com.google.api.ads.adwords.axis.v201802.cm.MediaBundle;
import com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201802.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.MediaSize;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.Maps;
import com.google.api.client.auth.oauth2.Credential;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Map;

/**
 * This example uploads an HTML5 zip file as a MediaBundle.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UploadMediaBundle {

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
    // Get the MediaService.
    MediaServiceInterface mediaService = adWordsServices.get(session, MediaServiceInterface.class);

    // Create HTML5 media.
    byte[] html5Zip =
        com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl("https://goo.gl/9Y7qI2");

    // Create a media bundle containing the zip file with all the HTML5 components.
    MediaBundle mediaBundle = new MediaBundle();
    mediaBundle.setData(html5Zip);
    mediaBundle.setType(MediaMediaType.MEDIA_BUNDLE);

    // Upload HTML5 zip.
    mediaBundle = (MediaBundle) mediaService.upload(new Media[] {mediaBundle})[0];

    // Display HTML5 zip.
    Map<MediaSize, Dimensions> dimensions = Maps.toMap(mediaBundle.getDimensions());
    System.out.printf(
        "HTML5 media with ID %d, dimensions '%dx%d', and MIME type '%s' "
        + "was uploaded.%n",
        mediaBundle.getMediaId(), dimensions.get(MediaSize.FULL).getWidth(),
        dimensions.get(MediaSize.FULL).getHeight(), mediaBundle.getMimeType());
  }
}
