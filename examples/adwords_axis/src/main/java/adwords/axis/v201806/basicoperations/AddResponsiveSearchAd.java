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

package adwords.axis.v201806.basicoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201806.cm.ApiError;
import com.google.api.ads.adwords.axis.v201806.cm.ApiException;
import com.google.api.ads.adwords.axis.v201806.cm.AssetLink;
import com.google.api.ads.adwords.axis.v201806.cm.Operator;
import com.google.api.ads.adwords.axis.v201806.cm.ResponsiveSearchAd;
import com.google.api.ads.adwords.axis.v201806.cm.ServedAssetFieldType;
import com.google.api.ads.adwords.axis.v201806.cm.TextAsset;
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
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example adds a responsive search ad to a given ad group. To get ad groups, run
 * GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class AddResponsiveSearchAd {

  private static class AddResponsiveSearchAdParams extends CodeSampleParams {
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

    AddResponsiveSearchAdParams params = new AddResponsiveSearchAdParams();
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
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws RemoteException {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    List<AdGroupAdOperation> operations = new ArrayList<>();

    ResponsiveSearchAd responsiveSearchAd = new ResponsiveSearchAd();
    List<AssetLink> headlines = new ArrayList<>();
    AssetLink pinnedHeadline =
        createAssetLinkForText("Cruise to Mars #" + System.currentTimeMillis());
    // Set a pinning to always choose this asset for HEADLINE_1. Pinning is optional; if no pinning
    // is set, then headlines and descriptions will be rotated and the ones that perform best will
    // be used more often.
    pinnedHeadline.setPinnedField(ServedAssetFieldType.HEADLINE_1);
    headlines.add(pinnedHeadline);
    headlines.add(createAssetLinkForText("Best Space Cruise Line"));
    headlines.add(createAssetLinkForText("Experience the Stars"));
    responsiveSearchAd.setHeadlines(headlines.toArray(new AssetLink[0]));

    List<AssetLink> descriptions = new ArrayList<>();
    descriptions.add(createAssetLinkForText("Buy your tickets now"));
    descriptions.add(createAssetLinkForText("Visit the Red Planet"));
    responsiveSearchAd.setDescriptions(descriptions.toArray(new AssetLink[0]));

    responsiveSearchAd.setFinalUrls(new String[] {"http://www.example.com/cruise"});
    responsiveSearchAd.setPath1("all-inclusive");
    responsiveSearchAd.setPath2("deals");

    // Create ad group ad.
    AdGroupAd responsiveSearchAdGroupAd = new AdGroupAd();
    responsiveSearchAdGroupAd.setAdGroupId(adGroupId);
    responsiveSearchAdGroupAd.setAd(responsiveSearchAd);

    // Optional: set the status.
    responsiveSearchAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

    // Create the operation.
    AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
    adGroupAdOperation.setOperand(responsiveSearchAdGroupAd);
    adGroupAdOperation.setOperator(Operator.ADD);

    operations.add(adGroupAdOperation);

    // Add ad.
    AdGroupAdReturnValue result =
        adGroupAdService.mutate(operations.toArray(new AdGroupAdOperation[0]));

    for (AdGroupAd adGroupAdResult : result.getValue()) {
      ResponsiveSearchAd newAd = (ResponsiveSearchAd) adGroupAdResult.getAd();
      System.out.printf(
          "New responsive search ad with ID %d was added.%n", adGroupAdResult.getAd().getId());
      System.out.println("Headlines:");
      for (AssetLink headline : newAd.getHeadlines()) {
        ServedAssetFieldType pinning = headline.getPinnedField();
        System.out.printf("    %s%n", ((TextAsset) headline.getAsset()).getAssetText());
        if (pinning != null) {
          System.out.printf("    (pinned to %s)%n", pinning);
        }
      }
      System.out.println("Descriptions:");
      for (AssetLink description : newAd.getDescriptions()) {
        ServedAssetFieldType pinning = description.getPinnedField();
        System.out.printf("    %s%n", ((TextAsset) description.getAsset()).getAssetText());
        if (pinning != null) {
          System.out.printf("    (pinned to %s)%n", pinning);
        }
      }
    }
  }

  /**
   * Creates an {@link AssetLink} containing a {@link TextAsset} with the specified string.
   *
   * @param text the text for the text asset.
   * @return a new {@link AssetLink}
   */
  private static AssetLink createAssetLinkForText(String text) {
    AssetLink assetLink = new AssetLink();
    TextAsset textAsset = new TextAsset();
    textAsset.setAssetText(text);
    assetLink.setAsset(textAsset);
    return assetLink;
  }
}
