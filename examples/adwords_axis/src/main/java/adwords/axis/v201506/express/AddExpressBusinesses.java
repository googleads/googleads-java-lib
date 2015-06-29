// Copyright 2015 Google Inc. All Rights Reserved.
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

package adwords.axis.v201506.express;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.Address;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.axis.v201506.express.ExpressBusiness;
import com.google.api.ads.adwords.axis.v201506.express.ExpressBusinessOperation;
import com.google.api.ads.adwords.axis.v201506.express.ExpressBusinessServiceInterface;
import com.google.api.ads.adwords.axis.v201506.express.ExpressBusinessStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example adds express businesses. To get express businesses, run GetExpressBusinesses.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: ExpressBusinessService.mutate
 *
 * @author Josh Radcliff
 */
public class AddExpressBusinesses {

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

    ExpressBusiness business1 = new ExpressBusiness();
    business1.setStatus(ExpressBusinessStatus.ENABLED);
    business1.setName("Express Interplanetary Cruise #" + System.currentTimeMillis());
    business1.setAddress(
        new Address("1600 Amphitheatre Pkwy", null, "Mountain View", "CA", null, null, "US"));
    business1.setWebsite("http://www.example.com/cruise1");

    ExpressBusiness business2 = new ExpressBusiness();
    business2.setStatus(ExpressBusinessStatus.ENABLED);
    business2.setName("Express Interplanetary Cruise #" + System.currentTimeMillis());
    business2.setAddress(
        new Address("1600 Amphitheatre Pkwy", null, "Mountain View", "CA", null, null, "US"));
    business2.setWebsite("http://www.example.com/cruise2");

    ExpressBusiness[] addedBusinesses = businessService.mutate(new ExpressBusinessOperation[] {
        new ExpressBusinessOperation(Operator.ADD, null, business1),
        new ExpressBusinessOperation(Operator.ADD, null, business2)});

    System.out.printf("Added %d express businesses%n", addedBusinesses.length);
    for (ExpressBusiness addedBusiness : addedBusinesses) {
      System.out.printf("Added express business with ID %d and name '%s'%n", addedBusiness.getId(),
          addedBusiness.getName());
    }

    return Lists.newArrayList(addedBusinesses);
  }

}
