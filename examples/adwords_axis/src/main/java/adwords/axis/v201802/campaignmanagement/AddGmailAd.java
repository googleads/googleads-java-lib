// Copyright 2018 Google Inc. All Rights Reserved.
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

package adwords.axis.v201802.campaignmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.GmailAd;
import com.google.api.ads.adwords.axis.v201802.cm.GmailTeaser;
import com.google.api.ads.adwords.axis.v201802.cm.Image;
import com.google.api.ads.adwords.axis.v201802.cm.Media;
import com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201802.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 * This example adds a Gmail ad to a given ad group. The ad group's campaign needs to have an
 * AdvertisingChannelType of DISPLAY and AdvertisingChannelSubType of DISPLAY_GMAIL_AD. To get ad
 * groups, run GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddGmailAd {

  private static class AddGmailAdParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

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

    AddGmailAdParams params = new AddGmailAdParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adGroupId);
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
   * @param adGroupId the ID of the ad group where the ad will be created.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws IOException if unable to get media data from the URL.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws IOException {
    // This ad format does not allow the creation of an image using the
    // Image.data field. An image must first be created using the MediaService,
    // and Image.mediaId must be populated when creating the ad.
    long logoImageId = uploadImage(adWordsServices, session, "https://goo.gl/mtt54n");
    Image logoImage = new Image();
    logoImage.setMediaId(logoImageId);

    long marketingImageId = uploadImage(adWordsServices, session, "http://goo.gl/3b9Wfh");
    Image adImage = new Image();
    adImage.setMediaId(marketingImageId);

    GmailTeaser teaser = new GmailTeaser();
    teaser.setHeadline("Dream");
    teaser.setDescription("Create your own adventure");
    teaser.setBusinessName("Interplanetary Ships");
    teaser.setLogoImage(logoImage);

    // Create the Gmail ad.
    GmailAd gmailAd = new GmailAd();
    gmailAd.setTeaser(teaser);
    gmailAd.setMarketingImage(adImage);
    gmailAd.setMarketingImageHeadline("Travel");
    gmailAd.setMarketingImageDescription("Take to the skies!");
    gmailAd.setFinalUrls(new String[] {"http://www.example.com"});

    // Create ad group ad for the Gmail ad.
    AdGroupAd adGroupAd = new AdGroupAd();
    adGroupAd.setAdGroupId(adGroupId);
    adGroupAd.setAd(gmailAd);
    // Additional properties (non-required).
    adGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create operation.
    AdGroupAdOperation operation = new AdGroupAdOperation();
    operation.setOperator(Operator.ADD);
    operation.setOperand(adGroupAd);

    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Add Gmail ad.
    AdGroupAdReturnValue returnValue =
        adGroupAdService.mutate(new AdGroupAdOperation[] {operation});

    if (returnValue.getValue() != null) {
      for (AdGroupAd newAdGroupAd : returnValue.getValue()) {
        System.out.printf(
            "New Gmail ad with ID %d and headline '%s' was added.%n",
            newAdGroupAd.getAd().getId(),
            ((GmailAd) newAdGroupAd.getAd()).getTeaser().getHeadline());
      }
    } else {
      System.out.println("No Gmail ads were added.");
    }
  }

  /** Uploads an image. */
  private static long uploadImage(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, String url)
      throws IOException {
    MediaServiceInterface mediaService = adWordsServices.get(session, MediaServiceInterface.class);

    // Create image.
    Image image = new Image();
    image.setData(com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl(url));
    image.setType(MediaMediaType.IMAGE);

    Media[] media = new Media[] {image};

    // Upload image.
    Media[] result = mediaService.upload(media);

    return result[0].getMediaId();
  }
}
