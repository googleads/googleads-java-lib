// Copyright 2015 Google Inc. All Rights Reserved.
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

package dfp.axis.v201711.customtargetingservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201711.ApiError;
import com.google.api.ads.dfp.axis.v201711.ApiException;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingKey;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingKeyType;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingValue;
import com.google.api.ads.dfp.axis.v201711.CustomTargetingValueMatchType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates new custom targeting keys and values. To determine which
 * custom targeting keys and values exist, run
 * GetAllCustomTargetingKeysAndValue.java. To target these custom
 * targeting keys and values, run TargetCustomCriteria.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateCustomTargetingKeysAndValues {

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws RemoteException {
    // Get the CustomTargetingService.
    CustomTargetingServiceInterface customTargetingService =
        dfpServices.get(session, CustomTargetingServiceInterface.class);

    // Create predefined key.
    CustomTargetingKey genderKey = new CustomTargetingKey();
    genderKey.setDisplayName("gender");
    genderKey.setName("g" + new Random().nextInt(1000));
    genderKey.setType(CustomTargetingKeyType.PREDEFINED);

    // Create predefined key that may be used for content targeting.
    CustomTargetingKey genreKey = new CustomTargetingKey();
    genreKey.setDisplayName("genre");
    genreKey.setName("genre" + new Random().nextInt(1000));
    genreKey.setType(CustomTargetingKeyType.PREDEFINED);

    // Create free-form key.
    CustomTargetingKey carModelKey = new CustomTargetingKey();
    carModelKey.setDisplayName("car model");
    carModelKey.setName("c" + new Random().nextInt(1000));
    carModelKey.setType(CustomTargetingKeyType.FREEFORM);

    // Create the custom targeting keys on the server.
    CustomTargetingKey[] customTargetingKeys = customTargetingService.createCustomTargetingKeys(
        new CustomTargetingKey[] {genderKey, genreKey, carModelKey});

    for (CustomTargetingKey createdCustomTargetingKey : customTargetingKeys) {
      System.out.printf("A custom targeting key with ID %d, name '%s', and display name "
          + "'%s' was created.%n", createdCustomTargetingKey.getId(),
          createdCustomTargetingKey.getName(), createdCustomTargetingKey.getDisplayName());
    }

    // Set the created custom targeting keys.
    genderKey = customTargetingKeys[0];
    genreKey = customTargetingKeys[1];
    carModelKey = customTargetingKeys[2];

    // Create custom targeting value for the predefined gender key.
    CustomTargetingValue genderMaleValue = new CustomTargetingValue();
    genderMaleValue.setCustomTargetingKeyId(genderKey.getId());
    genderMaleValue.setDisplayName("male");
    // Name is set to 1 so that the actual name can be hidden from website
    // users.
    genderMaleValue.setName("1");
    genderMaleValue.setMatchType(CustomTargetingValueMatchType.EXACT);

    CustomTargetingValue genderFemaleValue = new CustomTargetingValue();
    genderFemaleValue.setCustomTargetingKeyId(genderKey.getId());
    genderFemaleValue.setDisplayName("female");
    // Name is set to 2 so that the actual name can be hidden from website
    // users.
    genderFemaleValue.setName("2");
    genderFemaleValue.setMatchType(CustomTargetingValueMatchType.EXACT);

    // Create custom targeting value for the predefined genre key.
    CustomTargetingValue genreComedyValue = new CustomTargetingValue();
    genreComedyValue.setCustomTargetingKeyId(genreKey.getId());
    genreComedyValue.setDisplayName("comedy");
    genreComedyValue.setName("comedy");
    genreComedyValue.setMatchType(CustomTargetingValueMatchType.EXACT);

    CustomTargetingValue genreDramaValue = new CustomTargetingValue();
    genreDramaValue.setCustomTargetingKeyId(genreKey.getId());
    genreDramaValue.setDisplayName("drama");
    genreDramaValue.setName("drama");
    genreDramaValue.setMatchType(CustomTargetingValueMatchType.EXACT);

    // Create custom targeting value for the free-form car model key. These are
    // values that would be suggested in the UI or can be used when targeting
    // with a FreeFormCustomCriteria.
    CustomTargetingValue carModelHondaValue = new CustomTargetingValue();
    carModelHondaValue.setCustomTargetingKeyId(carModelKey.getId());
    carModelHondaValue.setDisplayName("~honda");
    carModelHondaValue.setName("honda");
    // A match type of broad will match anything including "honda",
    // i.e. "~honda".
    carModelHondaValue.setMatchType(CustomTargetingValueMatchType.BROAD);

    // Create the custom targeting values on the server.
    CustomTargetingValue[] customTargetingValues =
        customTargetingService.createCustomTargetingValues(new CustomTargetingValue[] {
            genderMaleValue, genderFemaleValue, genreComedyValue, genreDramaValue,
            carModelHondaValue});

    for (CustomTargetingValue createdCustomTargetingValue : customTargetingValues) {
      System.out.printf("A custom targeting value with ID %d, belonging to key with ID %d, "
          + "name '%s' and display name '%s' was created.%n",
          createdCustomTargetingValue.getId(),
          createdCustomTargetingValue.getCustomTargetingKeyId(),
          createdCustomTargetingValue.getName(), createdCustomTargetingValue.getDisplayName());
    }
  }

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder().forApi(Api.DFP).fromFile().build().generateCredential();

      // Construct a DfpSession.
      session = new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    DfpServices dfpServices = new DfpServices();

    try {
      runExample(dfpServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the dfp.axis
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
}
