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

package dfp.axis.v201405.companyservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201405.StatementBuilder;
import com.google.api.ads.dfp.axis.v201405.Company;
import com.google.api.ads.dfp.axis.v201405.CompanyPage;
import com.google.api.ads.dfp.axis.v201405.CompanyServiceInterface;
import com.google.api.ads.dfp.axis.v201405.CompanyType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all companies that are advertisers. To create companies,
 * run CreateCompanies.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CompanyService.getCompaniesByStatement
 *
 * @author Adam Rogal
 */
public class GetAdvertisers {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the CompanyService.
    CompanyServiceInterface companyService =
        dfpServices.get(session, CompanyServiceInterface.class);

    // Create a statement to only select companies that are advertisers.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("type = :type")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("type", CompanyType.ADVERTISER.toString());

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get companies by statement.
      CompanyPage page = companyService.getCompaniesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (Company company : page.getResults()) {
          System.out.printf(
              "%d) Company with ID \"%d\", name \"%s\", and type \"%s\" was found.\n", i++,
              company.getId(), company.getName(), company.getType());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d\n", totalResultSetSize);
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

    runExample(dfpServices, session);
  }
}
