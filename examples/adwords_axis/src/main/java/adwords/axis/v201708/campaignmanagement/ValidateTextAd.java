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

package adwords.axis.v201708.campaignmanagement;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201708.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201708.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201708.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.ApiException;
import com.google.api.ads.adwords.axis.v201708.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201708.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example shows how to use the validate only header through the
 * {@link AdWordsSession#setValidateOnly(Boolean)} method. No objects will be
 * created, but exceptions will still be thrown.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class ValidateTextAd {

  private static class ValidateTextAdParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    ValidateTextAdParams params = new ValidateTextAdParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    runExample(adWordsServices, session, params.adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws Exception {
    // Enable validation.
    session.setValidateOnly(true);

    // Get the validation AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdValidationService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    // Create text ad.
    ExpandedTextAd textAd1 = new ExpandedTextAd();
    textAd1.setHeadlinePart1("Luxury Cruise to Mars");
    textAd1.setHeadlinePart2("Visit the Red Planet in style.");
    textAd1.setDescription("Low-gravity fun for everyone!");
    textAd1.setFinalUrls(new String[] {"http://www.example.com"});

    // Create ad group ad.
    AdGroupAd textAdGroupAd1 = new AdGroupAd();
    textAdGroupAd1.setAdGroupId(adGroupId);
    textAdGroupAd1.setAd(textAd1);

    // Create operations.
    AdGroupAdOperation textAdGroupAdOperation1 = new AdGroupAdOperation();
    textAdGroupAdOperation1.setOperand(textAdGroupAd1);
    textAdGroupAdOperation1.setOperator(Operator.ADD);

    AdGroupAdOperation[] operations = new AdGroupAdOperation[] {textAdGroupAdOperation1};

    // Add ads.
    adGroupAdValidationService.mutate(operations);
    
    // No error means the request is valid.

    // Now let's check an invalid ad using a very long line to trigger an error.
    textAd1.setDescription("Low-gravity fun for all astronauts in orbit.");

    try {
      adGroupAdValidationService.mutate(operations);
    } catch (ApiException e) {
      System.err.printf("Validation failed for the following reason: %s%n", e.getMessage());
    }
  }
}
