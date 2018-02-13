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

package adwords.axis.v201710.remarketing;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.OfflineCallConversionFeed;
import com.google.api.ads.adwords.axis.v201710.cm.OfflineCallConversionFeedOperation;
import com.google.api.ads.adwords.axis.v201710.cm.OfflineCallConversionFeedReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.OfflineCallConversionFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example imports offline call conversion values for calls related to the ads in your account.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class UploadOfflineCallConversions {

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

    // Replace with valid values of your account.
    String callerId = "INSERT_CALLER_ID_HERE";

    // For times, use the format yyyyMMdd HHmmss tz. For more details on formats, see:
    // https://developers.google.com/adwords/api/docs/appendix/codes-formats#date-and-time-formats
    // For time zones, see:
    // https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids
    String callStartTime = "INSERT_CALL_START_TIME_HERE";

    // Name of the conversion tracker to upload to.
    String conversionName = "INSERT_CONVERSION_NAME_HERE";

    String conversionTime = "INSERT_CONVERSION_TIME_HERE";
    Double conversionValue = Double.valueOf("INSERT_CONVERSION_VALUE_HERE");

    try {
      runExample(
          adWordsServices,
          session,
          callerId,
          callStartTime,
          conversionName,
          conversionTime,
          conversionValue);
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
   * @param callerId the caller ID of the call.
   * @param callStartTime the call start time of the call.
   * @param conversionName the name of the conversion tracker.
   * @param conversionTime the date and time of the conversion.
   * @param conversionValue the value of the conversion.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      String callerId,
      String callStartTime,
      String conversionName,
      String conversionTime,
      double conversionValue)
      throws RemoteException {

    // Get the OfflineCallConversionFeedService.
    OfflineCallConversionFeedServiceInterface offlineCallConversionFeedService =
        adWordsServices.get(session, OfflineCallConversionFeedServiceInterface.class);

    // Associate offline call conversions with the existing named conversion tracker. If this
    // tracker was newly created, it may be a few hours before it can accept conversions.
    OfflineCallConversionFeed feed = new OfflineCallConversionFeed();
    feed.setCallerId(callerId);
    feed.setCallStartTime(callStartTime);
    feed.setConversionName(conversionName);
    feed.setConversionTime(conversionTime);
    feed.setConversionValue(conversionValue);

    OfflineCallConversionFeedOperation offlineCallConversionOperation =
        new OfflineCallConversionFeedOperation();
    offlineCallConversionOperation.setOperator(Operator.ADD);
    offlineCallConversionOperation.setOperand(feed);

    // This example uploads only one call conversion, but you can upload multiple call conversions
    // by passing additional operations.
    OfflineCallConversionFeedReturnValue offlineCallConversionReturnValue =
        offlineCallConversionFeedService.mutate(
            new OfflineCallConversionFeedOperation[] {offlineCallConversionOperation});

    // Display results.
    for (OfflineCallConversionFeed feedResult : offlineCallConversionReturnValue.getValue()) {
      System.out.printf(
          "Uploaded offline conversion value of %.4f for caller ID '%s'.%n",
          feedResult.getConversionValue(), feedResult.getCallerId());
    }
  }
}
