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

package adwords.axis.v201802.advancedoperations;

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
import com.google.api.ads.adwords.axis.v201802.cm.Dimensions;
import com.google.api.ads.adwords.axis.v201802.cm.MediaBundle;
import com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.TemplateAd;
import com.google.api.ads.adwords.axis.v201802.cm.TemplateElement;
import com.google.api.ads.adwords.axis.v201802.cm.TemplateElementField;
import com.google.api.ads.adwords.axis.v201802.cm.TemplateElementFieldType;
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
 * This example adds an HTML5 ad to given ad group. To get
 * ad groups, run GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddHtml5Ad {

  private static class AddHtml5AdParams extends CodeSampleParams {
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

    AddHtml5AdParams params = new AddHtml5AdParams();
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
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create the template ad.
    TemplateAd html5Ad = new TemplateAd();
    html5Ad.setName("Ad for HTML5");
    html5Ad.setTemplateId(419L);
    html5Ad.setFinalUrls(new String[] {"http://example.com/html5"});
    html5Ad.setDisplayUrl("example.com/html5");

    Dimensions dimensions = new Dimensions();
    dimensions.setWidth(300);
    dimensions.setHeight(250);
    html5Ad.setDimensions(dimensions);

    // The HTML5 zip file contains all the HTML, CSS, and images needed for the
    // HTML5 ad. For help on creating an HTML5 zip file, check out Google Web
    // Designer (https://www.google.com/webdesigner/).
    byte[] html5Zip =
        com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl("https://goo.gl/9Y7qI2");

    // Create a media bundle containing the zip file with all the HTML5 components.
    // NOTE: You may also upload an HTML5 zip using MediaService.upload()
    // and simply set the mediaId field below. See UploadMediaBundle.java for an example.
    MediaBundle mediaBundle = new MediaBundle();
    mediaBundle.setData(html5Zip);
    mediaBundle.setEntryPoint("carousel/index.html");
    mediaBundle.setType(MediaMediaType.MEDIA_BUNDLE);

    // Create the template elements for the ad. You can refer to
    // https://developers.google.com/adwords/api/docs/appendix/templateads
    // for the list of available template fields.
    TemplateElementField media = new TemplateElementField();
    media.setName("Custom_layout");
    media.setFieldMedia(mediaBundle);
    media.setType(TemplateElementFieldType.MEDIA_BUNDLE);

    TemplateElementField layout = new TemplateElementField();
    layout.setName("layout");
    layout.setFieldText("Custom");
    layout.setType(TemplateElementFieldType.ENUM);

    TemplateElement adData = new TemplateElement();
    adData.setUniqueName("adData");
    adData.setFields(new TemplateElementField[] {media, layout});

    html5Ad.setTemplateElements(new TemplateElement[] {adData});

    // Create the AdGroupAd.
    AdGroupAd html5AdGroupAd = new AdGroupAd();
    html5AdGroupAd.setAdGroupId(adGroupId);
    html5AdGroupAd.setAd(html5Ad);

    // Optional: Set the status.
    html5AdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create the operation.
    AdGroupAdOperation operation = new AdGroupAdOperation();
    operation.setOperator(Operator.ADD);
    operation.setOperand(html5AdGroupAd);

    // Create the ads.
    AdGroupAdReturnValue result = adGroupAdService.mutate(new AdGroupAdOperation[] {operation});

    for (AdGroupAd adGroupAd : result.getValue()) {
      System.out.printf("New HTML5 ad with ID %d and display url '%s' was created.%n",
          adGroupAd.getAd().getId(), adGroupAd.getAd().getDisplayUrl());
    }
  }
}
