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

package dfp.axis.v201505.companyservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201505.StatementBuilder;
import com.google.api.ads.dfp.axis.v201505.Company;
import com.google.api.ads.dfp.axis.v201505.CompanyPage;
import com.google.api.ads.dfp.axis.v201505.CompanyServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;

import java.util.Arrays;

/**
 * This example updates company comments. To determine which companies exist,
 * run GetAllCompanies.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateCompanies {

  // Set the ID of the company to update.
  private static final String COMPANY_ID = "INSERT_COMPANY_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long companyId)
      throws Exception {
    // Get the CompanyService.
    CompanyServiceInterface companyService =
        dfpServices.get(session, CompanyServiceInterface.class);

    // Create a statement to only select a single company by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", companyId);
    
    // Get the company.
    CompanyPage page =
        companyService.getCompaniesByStatement(statementBuilder.toStatement());
    
    Company company = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the comment.
    company.setComment(company.getComment() + " Updated.");

    // Update the company on the server.
    Company[] companies = companyService.updateCompanies(new Company[] {company});

    for (Company updatedCompany : companies) {
      System.out.printf(
          "Company with ID \"%d\", name \"%s\", and comment \"%s\" was updated.\n",
          updatedCompany.getId(), updatedCompany.getName(), updatedCompany.getComment());
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

    runExample(dfpServices, session, Long.parseLong(COMPANY_ID));
  }
}
