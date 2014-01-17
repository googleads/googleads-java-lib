// Copyright 2012 Google Inc. All Rights Reserved.
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

package dfa.axis.v1_19;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_19.Permission;
import com.google.api.ads.dfa.axis.v1_19.UserRoleRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays all of the available permissions that a user role or
 * subnetwork may be endowed with. To get a subnetwork ID, run
 * GetSubnetworks.java.
 *
 * A user role may not be set with more permissions than the subnetwork it
 * belongs to. You may enter a subnetwork ID to see the maximum permissions a
 * user role belonging to it can have, or enter "0" as the subnetwork ID to see
 * all possible permissions.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: userrole.getAvailablePermissions
 *
 * @author Joseph DiLallo
 */
public class GetAvailablePermissions {

  // Provide the ID of the subnetwork whose permissions will be displayed.
  private static final String SUBNETWORK_ID = "INSERT_SUBNETWORK_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long subnetworkId) throws Exception {
    // Request the service.
    UserRoleRemote service = dfaServices.get(session, UserRoleRemote.class);

    // Get available permissions.
    Permission[] permissions = service.getAvailablePermissions(subnetworkId);

    // Display permission name and its ID.
    for (Permission result : permissions) {
      System.out.println("Permission with name \"" + result.getName()
          + "\" and ID \"" + result.getId() + "\" was found.");
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    long subnetworkId = Long.parseLong(SUBNETWORK_ID);

    runExample(dfaServices, session, subnetworkId);
  }
}
