// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfp.axis.v201405.customtargetingservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201405.CustomTargetingKey;
import com.google.api.ads.dfp.axis.v201405.CustomTargetingKeyType;
import com.google.api.ads.dfp.axis.v201405.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.axis.v201405.CustomTargetingValue;
import com.google.api.ads.dfp.axis.v201405.CustomTargetingValueMatchType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates new custom targeting keys and values. To determine which
 * custom targeting keys and values exist, run
 * GetAllCustomTargetingKeysAndValue.java. To target these custom
 * targeting keys and values, run TargetCustomCriteria.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CustomTargetingService.createCustomTargetingKeys
 * Tags: CustomTargetingService.createCustomTargetingValues
 *
 * @author Adam Rogal
 */
public class CreateCustomTargetingKeysAndValues {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
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
      System.out.printf("A custom targeting key with ID \"%d\", name \"%s\", and display name "
          + "\"%s\" was created.\n", createdCustomTargetingKey.getId(),
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
      System.out.printf("A custom targeting value with ID \"%d\", belonging to key with ID \"%d\", "
          + "with name \"%s\" and display name \"%s\" was created.\n",
          createdCustomTargetingValue.getId(),
          createdCustomTargetingValue.getCustomTargetingKeyId(),
          createdCustomTargetingValue.getName(), createdCustomTargetingValue.getDisplayName());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session);
  }
}
