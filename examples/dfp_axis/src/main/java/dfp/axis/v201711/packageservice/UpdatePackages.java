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

package dfp.axis.v201711.packageservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201711.StatementBuilder;
import com.google.api.ads.dfp.axis.v201711.Package;
import com.google.api.ads.dfp.axis.v201711.PackagePage;
import com.google.api.ads.dfp.axis.v201711.PackageServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates the comments of a single package.
 * 
 * To create packages, run CreatePackages.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdatePackages {

  private static class UpdatePackagesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PACKAGE_ID, required = true,
        description = "The ID of the package to update.")
    private Long packageId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long packageId) throws Exception {
    // Get the PackageService.
    PackageServiceInterface packageService =
        dfpServices.get(session, PackageServiceInterface.class);

    // Create a statement to select a single package.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", packageId);

    // Get the package.
    PackagePage page = packageService.getPackagesByStatement(statementBuilder.toStatement());

    Package pkg = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the comments of the package.
    pkg.setComments("This package is ready to be made into proposal line items.");

    // Update the package on the server.
    Package[] packages = packageService.updatePackages(new Package[] { pkg });

    for (Package updatedPackage : packages) {
      System.out.printf("Package with ID %d and name '%s' was updated.%n",
          updatedPackage.getId(), updatedPackage.getName());
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

    UpdatePackagesParams params = new UpdatePackagesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.packageId = Long.parseLong("INSERT_PACKAGE_ID_HERE");
    }

    runExample(dfpServices, session, params.packageId);
  }
}
