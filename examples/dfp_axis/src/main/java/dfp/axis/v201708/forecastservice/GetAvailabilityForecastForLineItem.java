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

package dfp.axis.v201708.forecastservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201708.AvailabilityForecast;
import com.google.api.ads.dfp.axis.v201708.AvailabilityForecastOptions;
import com.google.api.ads.dfp.axis.v201708.ForecastServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets a forecast for an existing line item. To determine which
 * line items exist, run GetAllLineItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAvailabilityForecastForLineItem {

  private static class GetAvailabilityForecastForLineItemParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.LINE_ITEM_ID, required = true,
        description = "The ID of the line item to get a forecast for.")
    private Long lineItemId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long lineItemId)
      throws Exception {
    // Get the ForecastService.
    ForecastServiceInterface forecastService =
        dfpServices.get(session, ForecastServiceInterface.class);

    // Get forecast for line item.
    AvailabilityForecastOptions options = new AvailabilityForecastOptions();
    options.setIncludeContendingLineItems(true);
    options.setIncludeTargetingCriteriaBreakdown(true);
    AvailabilityForecast forecast =
        forecastService.getAvailabilityForecastById(lineItemId, options);

    long matched = forecast.getMatchedUnits();
    double availablePercent = (forecast.getAvailableUnits() / (matched * 1.0)) * 100;
    String unitType = forecast.getUnitType().toString().toLowerCase();

    System.out.printf("%d %s matched.%n", matched, unitType);
    System.out.printf("%.2f%% %s available.%n", availablePercent, unitType);

    if (forecast.getPossibleUnits() != null) {
      double possiblePercent = (forecast.getPossibleUnits() / (matched * 1.0)) * 100;
      System.out.printf("%.2f%% %s possible.%n", possiblePercent, unitType);
    }

    System.out.printf("%d contending line items.%n",
        forecast.getContendingLineItems() == null ? 0 : forecast.getContendingLineItems().length);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
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

    GetAvailabilityForecastForLineItemParams params =
        new GetAvailabilityForecastForLineItemParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
    }

    runExample(dfpServices, session, params.lineItemId);
  }
}
