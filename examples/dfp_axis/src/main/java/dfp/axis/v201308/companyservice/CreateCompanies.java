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

package dfp.axis.v201308.companyservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201308.Company;
import com.google.api.ads.dfp.axis.v201308.CompanyServiceInterface;
import com.google.api.ads.dfp.axis.v201308.CompanyType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Random;

/**
 * This example creates new companies. To determine which companies exist, run
 * GetAllCompanies.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CompanyService.createCompanies
 *
 * @author Adam Rogal
 */
public class CreateCompanies {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the CompanyService.
    CompanyServiceInterface companyService =
        dfpServices.get(session, CompanyServiceInterface.class);

    // Create an advertiser.
    Company advertiser = new Company();
    advertiser.setName("Advertiser #" + new Random().nextInt(Integer.MAX_VALUE));
    advertiser.setType(CompanyType.ADVERTISER);

    // Create an agency.
    Company agency = new Company();
    agency.setName("Agency #" + new Random().nextInt(Integer.MAX_VALUE));
    agency.setType(CompanyType.AGENCY);

    // Create the companies on the server.
    Company[] companies = companyService.createCompanies(new Company[] {advertiser, agency});

    for (Company createdCompany : companies) {
      System.out.printf("A company with ID \"%d\", name \"%s\", and type \"%s\" was created.\n",
          createdCompany.getId(), createdCompany.getName(), createdCompany.getType());
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
