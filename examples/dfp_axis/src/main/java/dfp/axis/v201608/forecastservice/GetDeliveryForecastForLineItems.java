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

package dfp.axis.v201608.forecastservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201608.DeliveryForecast;
import com.google.api.ads.dfp.axis.v201608.DeliveryForecastOptions;
import com.google.api.ads.dfp.axis.v201608.ForecastServiceInterface;
import com.google.api.ads.dfp.axis.v201608.LineItemDeliveryForecast;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets a delivery forecast for existing line items. To determine
 * which line items exist, run GetAllLineItems.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetDeliveryForecastForLineItems {

  //Set the IDs of the line items to get a forecast for.
  private static final String LINE_ITEM_ID_1 = "INSERT_LINE_ITEM_ID_HERE";
  private static final String LINE_ITEM_ID_2 = "INSERT_LINE_ITEM_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long lineItemId1, long lineItemId2) throws Exception {
    // Get the ForecastService.
    ForecastServiceInterface forecastService =
        dfpServices.get(session, ForecastServiceInterface.class);

    DeliveryForecastOptions options = new DeliveryForecastOptions();

    DeliveryForecast forecast = forecastService.getDeliveryForecastByIds(
        new long[] {lineItemId1, lineItemId2}, options);

    for (LineItemDeliveryForecast lineItemForecast : forecast.getLineItemDeliveryForecasts()) {
      String unitType = lineItemForecast.getUnitType().toString().toLowerCase();
      System.out.printf("Forecast for line item %d:%n", lineItemForecast.getLineItemId());
      System.out.printf("\t%d %s matched%n", lineItemForecast.getMatchedUnits(), unitType);
      System.out.printf("\t%d %s delivered%n", lineItemForecast.getDeliveredUnits(), unitType);
      System.out.printf("\t%d %s predicted%n",
          lineItemForecast.getPredictedDeliveryUnits(), unitType);
    }
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

    runExample(dfpServices, session, Long.parseLong(LINE_ITEM_ID_1),
        Long.parseLong(LINE_ITEM_ID_2));
  }
}
