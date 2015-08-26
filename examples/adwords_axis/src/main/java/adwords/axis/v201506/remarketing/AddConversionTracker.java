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

package adwords.axis.v201506.remarketing;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.AdWordsConversionTracker;
import com.google.api.ads.adwords.axis.v201506.cm.AdWordsConversionTrackerMarkupLanguage;
import com.google.api.ads.adwords.axis.v201506.cm.AdWordsConversionTrackerTextFormat;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTracker;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerCategory;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerOperation;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerReturnValue;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerStatus;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example adds an AdWords conversion.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddConversionTracker {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
    // Get the ConversionTrackerService.
    ConversionTrackerServiceInterface service =
        adWordsServices.get(session, ConversionTrackerServiceInterface.class);

    // Create AdWords conversion.
    AdWordsConversionTracker adWordsConversionTracker = new AdWordsConversionTracker();
    adWordsConversionTracker.setName("Earth to Mars Cruises Conversion # "
        + System.currentTimeMillis());
    adWordsConversionTracker.setCategory(ConversionTrackerCategory.DEFAULT);
    adWordsConversionTracker.setMarkupLanguage(AdWordsConversionTrackerMarkupLanguage.HTML);
    adWordsConversionTracker.setTextFormat(AdWordsConversionTrackerTextFormat.HIDDEN);

    // You can optionally provide these field(s).
    adWordsConversionTracker.setStatus(ConversionTrackerStatus.ENABLED);
    adWordsConversionTracker.setViewthroughLookbackWindow(15);
    adWordsConversionTracker.setIsProductAdsChargeable(Boolean.TRUE);
    adWordsConversionTracker.setProductAdsChargeableConversionWindow(15);
    adWordsConversionTracker.setConversionPageLanguage("en");
    adWordsConversionTracker.setBackgroundColor("#0000FF");
    adWordsConversionTracker.setDefaultRevenueValue(1d);
    adWordsConversionTracker.setAlwaysUseDefaultRevenueValue(Boolean.TRUE);

    // Create operations.
    ConversionTrackerOperation operation = new ConversionTrackerOperation();
    operation.setOperator(Operator.ADD);
    operation.setOperand(adWordsConversionTracker);

    ConversionTrackerOperation[] operations = new ConversionTrackerOperation[] {operation};

    // Add conversion.
    ConversionTrackerReturnValue result = service.mutate(operations);

    // Display conversion.
    for (ConversionTracker conversionTracker : result.getValue()) {
      if (conversionTracker instanceof AdWordsConversionTracker) {
        AdWordsConversionTracker newAdWordsConversionTracker =
            (AdWordsConversionTracker) conversionTracker;
        System.out.printf("Conversion with id \"%d\", name \"%s\", status \"%s\", "
            + "category \"%s\" and snippet \"%s\" was added.\n",
            newAdWordsConversionTracker.getId(), newAdWordsConversionTracker.getName(),
            newAdWordsConversionTracker.getStatus(), newAdWordsConversionTracker.getCategory(),
            newAdWordsConversionTracker.getSnippet());
      } else {
        System.out.printf("Conversion with id \"%d\", name \"%s\", status \"%s\", "
            + "category \"%s\" was added.\n", conversionTracker.getId(),
            conversionTracker.getName(), conversionTracker.getStatus(),
            conversionTracker.getCategory());
      }
    }
  }
}
