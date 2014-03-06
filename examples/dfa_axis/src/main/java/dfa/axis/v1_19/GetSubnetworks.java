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
import com.google.api.ads.dfa.axis.v1_19.Subnetwork;
import com.google.api.ads.dfa.axis.v1_19.SubnetworkRecordSet;
import com.google.api.ads.dfa.axis.v1_19.SubnetworkRemote;
import com.google.api.ads.dfa.axis.v1_19.SubnetworkSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays subnetwork names, IDs, and subnetwork IDs for a given
 * search string. Results are limited to 10.
 *
 * Note that the permissions assigned to a subnetwork are not returned in a
 * human-readable format with this example. Run GetAvailablePermissions.java to
 * see what permissions are available on a subnetwork.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: subnetwork.getSubnetworks
 *
 * @author Joseph DiLallo
 */
public class GetSubnetworks {

  // Specify the search criteria.
  private static final String SEARCH_STRING = "INSERT_SEARCH_CRITERIA_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String searchString) throws Exception {
    // Request the service.
    SubnetworkRemote service = dfaServices.get(session, SubnetworkRemote.class);

    // Set subnetwork search criteria.
    SubnetworkSearchCriteria searchCriteria = new SubnetworkSearchCriteria();
    searchCriteria.setPageSize(10);
    searchCriteria.setSearchString(searchString);

    // Get subnetworks.
    SubnetworkRecordSet subnetworks = service.getSubnetworks(searchCriteria);

    // Display subnetwork names, IDs, and subnetwork IDs.
    if (subnetworks.getRecords() != null) {
      for (Subnetwork result : subnetworks.getRecords()) {
        System.out.println("Subnetwork with name \"" + result.getName()
            + "\", ID \"" + result.getId()
            + ",\" part of Network ID " + result.getNetworkId()
            + " was found.");
      }
    } else {
      System.out.print("No subnetworks found for your criteria.");
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

    runExample(dfaServices, session, SEARCH_STRING);
  }
}
