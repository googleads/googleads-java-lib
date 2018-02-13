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

package adwords.axis.v201710.advancedoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.Image;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.TemplateAd;
import com.google.api.ads.adwords.axis.v201710.cm.TemplateElement;
import com.google.api.ads.adwords.axis.v201710.cm.TemplateElementField;
import com.google.api.ads.adwords.axis.v201710.cm.TemplateElementFieldType;
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
 * This example adds a click-to-download templateAd to given ad group. To get
 * adGroupId, run AddAdGroup.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddClickToDownloadAd {

  private static class AddClickToDownloadAdParams extends CodeSampleParams {
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

    AddClickToDownloadAdParams params = new AddClickToDownloadAdParams();
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
    TemplateAd clickToDownloadAppAd = new TemplateAd();
    clickToDownloadAppAd.setName("Ad for jupiter adventure game");
    clickToDownloadAppAd.setTemplateId(353L);

    clickToDownloadAppAd.setFinalUrls(
        new String[] {"http://play.google.com/store/apps/details?id=com.example.jupiteradventure"});
    clickToDownloadAppAd.setDisplayUrl("play.google.com");

    // Create the template elements for the ad. You can refer to
    // https://developers.google.com/adwords/api/docs/appendix/templateads
    // for the list of available template fields.
    TemplateElementField headline = new TemplateElementField();
    headline.setName("headline");
    headline.setFieldText("Enjoy a Jupiter Adventure");
    headline.setType(TemplateElementFieldType.TEXT);

    TemplateElementField description1 = new TemplateElementField();
    description1.setName("description1");
    description1.setFieldText("Realistic physics simulation");
    description1.setType(TemplateElementFieldType.TEXT);

    TemplateElementField description2 = new TemplateElementField();
    description2.setName("description2");
    description2.setFieldText("Race against players online");
    description2.setType(TemplateElementFieldType.TEXT);

    TemplateElementField appId = new TemplateElementField();
    appId.setName("appId");
    appId.setFieldText("com.example.jupiteradventure");
    appId.setType(TemplateElementFieldType.TEXT);

    TemplateElementField appStore = new TemplateElementField();
    appStore.setName("appStore");
    appStore.setFieldText("2");
    appStore.setType(TemplateElementFieldType.ENUM);

    // Optionally specify a landscape image. The image needs to be in a BASE64
    // encoded form. Here we download a demo image and encode it for this ad.
    byte[] imageData =
        com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl("https://goo.gl/9JmyKk");
    Image image = new Image();
    image.setData(imageData);
    TemplateElementField landscapeImage = new TemplateElementField();
    landscapeImage.setName("landscapeImage");
    landscapeImage.setFieldMedia(image);
    landscapeImage.setType(TemplateElementFieldType.IMAGE);

    TemplateElement adData = new TemplateElement();
    adData.setUniqueName("adData");
    adData.setFields(
        new TemplateElementField[] {
          headline, description1, description2, appId, appStore, landscapeImage
        });

    clickToDownloadAppAd.setTemplateElements(new TemplateElement[] {adData});

    // Create the AdGroupAd.
    AdGroupAd clickToDownloadAppAdGroupAd = new AdGroupAd();
    clickToDownloadAppAdGroupAd.setAdGroupId(adGroupId);
    clickToDownloadAppAdGroupAd.setAd(clickToDownloadAppAd);

    // Optional: Set the status.
    clickToDownloadAppAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create the operation.
    AdGroupAdOperation operation = new AdGroupAdOperation();
    operation.setOperator(Operator.ADD);
    operation.setOperand(clickToDownloadAppAdGroupAd);

    // Create the ads.
    AdGroupAdReturnValue result = adGroupAdService.mutate(new AdGroupAdOperation[] {operation});

    for (AdGroupAd adGroupAd : result.getValue()) {
      System.out.printf("New click-to-download ad with ID %d and url %s was created.%n",
          adGroupAd.getAd().getId(), adGroupAd.getAd().getFinalUrls(0));
    }
  }
}
