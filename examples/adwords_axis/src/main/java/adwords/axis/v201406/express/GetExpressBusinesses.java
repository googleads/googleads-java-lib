// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201406.express;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201406.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201406.cm.Address;
import com.google.api.ads.adwords.axis.v201406.cm.GeoPoint;
import com.google.api.ads.adwords.axis.v201406.cm.Selector;
import com.google.api.ads.adwords.axis.v201406.express.ExpressBusiness;
import com.google.api.ads.adwords.axis.v201406.express.ExpressBusinessPage;
import com.google.api.ads.adwords.axis.v201406.express.ExpressBusinessServiceInterface;
import com.google.api.ads.adwords.axis.v201406.express.ExpressBusinessStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example gets all express businesses. To add an express business, run
 * AddExpressBusinesses.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: ExpressBusinessService.get
 *
 * @author Josh Radcliff
 */
public class GetExpressBusinesses {
  private static final int PAGE_SIZE = 100;

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

  public static List<ExpressBusiness> runExample(AdWordsServices adWordsServices,
      AdWordsSession session) throws Exception {
    // Get the ExpressBusinessService.
    ExpressBusinessServiceInterface businessService =
        adWordsServices.get(session, ExpressBusinessServiceInterface.class);

    int offset = 0;

    // To get all express businesses owned by the current customer,
    // simply skip the call to SelectorBuilder.equals below
    Selector selector = new SelectorBuilder()
        .fields("Id", "Name", "Website", "Address", "GeoPoint", "Status")
        .equals("Status", ExpressBusinessStatus.ENABLED.getValue())
        .offset(offset)
        .limit(PAGE_SIZE)
        .build();

    List<ExpressBusiness> businesses = Lists.newArrayList();
    ExpressBusinessPage page;
    do {
      // Get all businesses.
      page = businessService.get(selector);

      // Display businesses.
      if (page.getTotalNumEntries() > 0) {
        for (ExpressBusiness business : page.getEntries()) {
          System.out.printf("Express business found with name '%s' id %d website: %s "
              + "address: %s geo point: %s status: %s%n",
              business.getName(),
              business.getId(),
              business.getWebsite(),
              toString(business.getAddress()),
              toString(business.getGeoPoint()),
              business.getStatus().getValue());
          businesses.add(business);
        }
      } else {
        System.out.println("No express businesses were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());

    System.out.printf("Found %d express businesses in total%n", businesses.size());

    return businesses;
  }

  /**
   * Returns a String representation of the provided Address object, or null if the object is null.
   */
  private static String toString(Address address) {
    return address == null
        ? null
        : String.format("%s,%s,%s,%s,%s",
            address.getStreetAddress(),
            address.getStreetAddress2(),
            address.getCityName(),
            address.getProvinceName(),
            address.getPostalCode());
  }

  /**
   * Returns a String representation of the provided GeoPoint object, or null if the object is null.
   */
  private static String toString(GeoPoint geoPoint) {
    return geoPoint == null 
        ? null
        : String.format("%d,%d", geoPoint.getLatitudeInMicroDegrees(),
            geoPoint.getLongitudeInMicroDegrees());
  }
}
