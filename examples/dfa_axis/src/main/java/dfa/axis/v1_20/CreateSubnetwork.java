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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.Subnetwork;
import com.google.api.ads.dfa.axis.v1_20.SubnetworkRemote;
import com.google.api.ads.dfa.axis.v1_20.SubnetworkSaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a subnetwork in a given DFA network. To get your network
 * ID, run Authenticate.java. To get the available permissions, run
 * GetAvailablePermissions.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: subnetwork.saveSubnetwork
 *
 * @author Joseph DiLallo
 */
public class CreateSubnetwork {

  private static final String SUBNETWORK_NAME = "INSERT_SUBNETWORK_NAME_HERE";
  private static final String NETWORK_ID = "INSERT_NETWORK_ID_HERE";
  private static final String PERMISSION_ONE = "INSERT_FIRST_PERMISSION_ID_HERE";
  private static final String PERMISSION_TWO = "INSERT_SECOND_PERMISSION_ID_HERE";

  public static void runExample(DfaServices dfaServices, DfaSession session, String subnetworkName,
      long networkId, long permissionOneId, long permissionTwoId) throws Exception {
    // Request the service.
    SubnetworkRemote service = dfaServices.get(session, SubnetworkRemote.class);

    // Create subnetwork structure.
    Subnetwork subnetwork = new Subnetwork();
    subnetwork.setId(0);
    subnetwork.setName(subnetworkName);
    subnetwork.setNetworkId(networkId);

    // Create an array of all permissions assigned to this subnetwork and add
    // it to the subnetwork structure. To get list of available permissions,
    // run GetAvailablePermissions.java.
    long[] permissions = new long[] {permissionOneId, permissionTwoId};
    subnetwork.setAvailablePermissions(permissions);

    // Create subnetwork.
    SubnetworkSaveResult subnetworkSaveResult = service.saveSubnetwork(subnetwork);

    // Display subnetwork ID.
    System.out.printf("Subnetwork with ID \"%s\" was created.%n", subnetworkSaveResult.getId());
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

    long networkId = Long.parseLong(NETWORK_ID);
    long permissionOneId = Long.parseLong(PERMISSION_ONE);
    long permissionTwoId = Long.parseLong(PERMISSION_TWO);

    runExample(dfaServices, session, SUBNETWORK_NAME, networkId, permissionOneId, permissionTwoId);
  }
}
