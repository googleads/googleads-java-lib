// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201802.remarketing;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeed;
import com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedOperation;
import com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedServiceInterface;
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
import java.rmi.RemoteException;

/**
 * This code example imports offline conversion values for specific clicks to
 * your account. To get Google Click ID for a click, run
 * CLICK_PERFORMANCE_REPORT. To set up a conversion tracker, run the
 * AddConversionTrackers.java example.
 */
public class UploadOfflineConversions {

  private static class UploadOfflineConversionsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CONVERSION_NAME, required = true,
        description = "Name of the conversion tracker to upload to.")
    private String conversionName;

    @Parameter(names = ArgumentNames.GCL_ID, required = true,
        description = "Google Click ID should be newer than 30 days.")
    private String gclId;

    @Parameter(names = ArgumentNames.CONVERSION_TIME, required = true,
        description = "Conversion time should be after the click time.")
    private String conversionTime;

    @Parameter(names = ArgumentNames.CONVERSION_VALUE, required = true)
    private Double conversionValue;
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



    UploadOfflineConversionsParams params = new UploadOfflineConversionsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.conversionName = "INSERT_CONVERSION_NAME_HERE";
      params.gclId = "INSERT_GCL_ID_HERE";
      params.conversionTime = "INSERT_CONVERSION_TIME_HERE";
      params.conversionValue = Double.parseDouble("INSERT_CONVERSION_VALUE_HERE");
    }

    try {
      runExample(
          adWordsServices,
          session,
          params.conversionName,
          params.gclId,
          params.conversionTime,
          params.conversionValue);
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
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param conversionName the name of the conversion tracker.
   * @param gClid the GCLID for the conversion.
   * @param conversionTime the date and time of the conversion.
   * @param conversionValue the value of the conversion.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      String conversionName, String gClid, String conversionTime,
      double conversionValue) throws RemoteException {

    // Get the OfflineConversionFeedService.
    OfflineConversionFeedServiceInterface offlineConversionFeedService =
        adWordsServices.get(session, OfflineConversionFeedServiceInterface.class);

    // Associate offline conversions with the existing named conversion tracker. If this tracker
    // was newly created, it may be a few hours before it can accept conversions.
    OfflineConversionFeed feed = new OfflineConversionFeed();
    feed.setConversionName(conversionName);
    feed.setConversionTime(conversionTime);
    feed.setConversionValue(conversionValue);
    feed.setGoogleClickId(gClid);

    OfflineConversionFeedOperation offlineConversionOperation =
        new OfflineConversionFeedOperation();
    offlineConversionOperation.setOperator(Operator.ADD);
    offlineConversionOperation.setOperand(feed);

    OfflineConversionFeedReturnValue offlineConversionReturnValue = offlineConversionFeedService
        .mutate(new OfflineConversionFeedOperation[] {offlineConversionOperation});

    OfflineConversionFeed newFeed = offlineConversionReturnValue.getValue(0);

    System.out.printf(
        "Uploaded offline conversion value of %.4f for Google Click ID '%s' to '%s'.%n",
        newFeed.getConversionValue(), newFeed.getGoogleClickId(), newFeed.getConversionName());
  }
}
