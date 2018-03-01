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

package adwords.axis.v201802.remarketing;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.AdWordsConversionTracker;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.ConversionTracker;
import com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerCategory;
import com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerOperation;
import com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.ConversionTrackerStatus;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.UploadConversion;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example adds an AdWords conversion and an upload conversion tracker.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddConversionTrackers {

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
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
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
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws RemoteException {
    // Get the ConversionTrackerService.
    ConversionTrackerServiceInterface service =
        adWordsServices.get(session, ConversionTrackerServiceInterface.class);

    List<ConversionTracker> conversionTrackers = new ArrayList<>();

    // Create an AdWords conversion tracker.
    AdWordsConversionTracker adWordsConversionTracker = new AdWordsConversionTracker();
    adWordsConversionTracker.setName("Earth to Mars Cruises Conversion # "
        + System.currentTimeMillis());
    adWordsConversionTracker.setCategory(ConversionTrackerCategory.DEFAULT);

    // You can optionally provide these field(s).
    adWordsConversionTracker.setStatus(ConversionTrackerStatus.ENABLED);
    adWordsConversionTracker.setViewthroughLookbackWindow(15);
    adWordsConversionTracker.setDefaultRevenueValue(1d);
    adWordsConversionTracker.setAlwaysUseDefaultRevenueValue(Boolean.TRUE);
    conversionTrackers.add(adWordsConversionTracker);

    // Create an upload conversion for offline conversion imports.
    UploadConversion uploadConversion = new UploadConversion();
    // Set an appropriate category. This field is optional, and will be set to
    // DEFAULT if not mentioned.
    uploadConversion.setCategory(ConversionTrackerCategory.LEAD);
    uploadConversion.setName("Upload Conversion #" + System.currentTimeMillis());
    uploadConversion.setViewthroughLookbackWindow(30);
    uploadConversion.setCtcLookbackWindow(90);

    // Optional: Set the default currency code to use for conversions
    // that do not specify a conversion currency. This must be an ISO 4217
    // 3-character currency code such as "EUR" or "USD".
    // If this field is not set on this UploadConversion, AdWords will use
    // the account's currency.
    uploadConversion.setDefaultRevenueCurrencyCode("EUR");

    // Optional: Set the default revenue value to use for conversions
    // that do not specify a conversion value. Note that this value
    // should NOT be in micros.
    uploadConversion.setDefaultRevenueValue(2.50);
    // Optional: To upload fractional conversion credits, mark the upload conversion
    // as externally attributed. See
    // https://developers.google.com/adwords/api/docs/guides/conversion-tracking#importing_externally_attributed_conversions
    // to learn more about importing externally attributed conversions.

    // uploadConversion.setIsExternallyAttributed(true);

    conversionTrackers.add(uploadConversion);

    // Create operations.
    List<ConversionTrackerOperation> operations = new ArrayList<>();
    for (ConversionTracker conversionTracker : conversionTrackers) {
      ConversionTrackerOperation operation = new ConversionTrackerOperation();
      operation.setOperator(Operator.ADD);
      operation.setOperand(conversionTracker);
      operations.add(operation);
    }

    // Add the conversions.
    ConversionTrackerReturnValue result =
        service.mutate(operations.toArray(new ConversionTrackerOperation[operations.size()]));

    // Display conversion.
    for (ConversionTracker conversionTracker : result.getValue()) {
      System.out.printf(
          "Conversion with ID %d, name '%s', status '%s', " + "category '%s' was added.%n",
          conversionTracker.getId(),
          conversionTracker.getName(),
          conversionTracker.getStatus(),
          conversionTracker.getCategory());
      if (conversionTracker instanceof AdWordsConversionTracker) {
        System.out.printf(
            "Google global site tag:%n%s%n%n", conversionTracker.getGoogleGlobalSiteTag());
        System.out.printf(
            "Google event snippet:%n%s%n%n", conversionTracker.getGoogleEventSnippet());
      }
    }
  }
}
