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

package dfp.axis.v201702.packageservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201702.Package;
import com.google.api.ads.dfp.axis.v201702.PackageServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates a package.
 *
 * To determine which packages exist, run GetAllPackages.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreatePackages {

  // Set the ID of the product package to create the package from.
  private static final String PRODUCT_PACKAGE_ID = "INSERT_PRODUCT_PACKAGE_ID";

  // Set the ID of the proposal to create proposal line items under.
  private static final String PROPOSAL_ID = "INSERT_PROPOSAL_ID";

  // Set the ID of the rate card the proposal line items belonging to the product package
  // are priced from.
  private static final String RATE_CARD_ID = "INSERT_RATE_CARD_ID";

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long productPackageId, long proposalId, long rateCardId)
      throws Exception {
    // Get the PackageService.
    PackageServiceInterface packageService =
        dfpServices.get(session, PackageServiceInterface.class);

    // Create a local package.
    Package pkg = new Package();
    pkg.setName("Package #" + new Random().nextInt(Integer.MAX_VALUE));

    // Set the proposal ID for the package.
    pkg.setProposalId(proposalId);

    // Set the product package ID to create the package from.
    pkg.setProductPackageId(productPackageId);

    // Set the rate card ID the proposal line items are priced with.
    pkg.setRateCardId(rateCardId);

    // Create the package on the server.
    Package[] packages = packageService.createPackages(new Package[] { pkg });

    for (Package createdPackage : packages) {
      System.out.printf("A package with ID %d and name '%s' was created.%n",
          createdPackage.getId(), createdPackage.getName());
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

    runExample(dfpServices, session, Long.parseLong(PRODUCT_PACKAGE_ID),
        Long.parseLong(PROPOSAL_ID), Long.parseLong(RATE_CARD_ID));
  }
}
