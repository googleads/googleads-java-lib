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

package adwords.axis.v201502.express;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201502.cm.Operator;
import com.google.api.ads.adwords.axis.v201502.express.ExpressBusiness;
import com.google.api.ads.adwords.axis.v201502.express.ExpressBusinessOperation;
import com.google.api.ads.adwords.axis.v201502.express.ExpressBusinessServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;


/**
 * This example updates an express business. To add an express business, run
 * AddExpressBusinesses.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateExpressBusiness {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    Long businessId = Long.valueOf("INSERT_BUSINESS_ID_HERE");

    runExample(adWordsServices, session, businessId);
  }

  public static ExpressBusiness runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long businessId) throws Exception {
    ExpressBusinessServiceInterface businessService =
        adWordsServices.get(session, ExpressBusinessServiceInterface.class);

    // Update the name and website for the business
    ExpressBusiness business = new ExpressBusiness();
    business.setId(businessId);
    business.setName("Express Interplanetary Cruise #" + System.currentTimeMillis());
    business.setWebsite("http://www.example.com/?myParam=" + System.currentTimeMillis());
    
    ExpressBusinessOperation operation = new ExpressBusinessOperation(Operator.SET, "", business);

    ExpressBusiness[] mutatedBusinesses =
        businessService.mutate(new ExpressBusinessOperation[] {operation});

    ExpressBusiness mutatedBusiness = mutatedBusinesses[0];

    System.out.printf("Express business with ID %d and name '%s' was updated%n",
        mutatedBusiness.getId(), mutatedBusiness.getName());

    return mutatedBusiness;
  }

}
