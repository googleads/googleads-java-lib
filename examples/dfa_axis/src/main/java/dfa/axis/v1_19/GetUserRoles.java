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
import com.google.api.ads.dfa.axis.v1_19.UserRole;
import com.google.api.ads.dfa.axis.v1_19.UserRoleRecordSet;
import com.google.api.ads.dfa.axis.v1_19.UserRoleRemote;
import com.google.api.ads.dfa.axis.v1_19.UserRoleSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example displays user role name, ID, subnetwork ID, number of assigned
 * users, and assigned permissions for the given search criteria. Results are
 * limited to the first 10 records.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: userrole.getUserRoles
 *
 * @author Joseph DiLallo
 */
public class GetUserRoles {

  // Specify the search criteria.
  private static final String SEARCH_STRING = "INSERT_SEARCH_CRITERIA_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String searchString) throws Exception {
    // Request the user role service.
    UserRoleRemote userRoleService = dfaServices.get(session, UserRoleRemote.class);

    // Get user roles that match the search criteria.
    UserRoleSearchCriteria userRoleSearchCriteria = new UserRoleSearchCriteria();
    userRoleSearchCriteria.setSearchString(searchString);
    userRoleSearchCriteria.setPageSize(10);
    UserRoleRecordSet userRoleRecordSet = userRoleService.getUserRoles(userRoleSearchCriteria);

    // Display user role names, IDs, subnetwork IDs, number of assigned users, and
    // assigned permissions.
    if (userRoleRecordSet.getUserRoles().length > 0) {
      for (UserRole userRole: userRoleRecordSet.getUserRoles()) {
        System.out.printf("User role with name \"%s\", ID \"%s\", subnetwork ID \"%s\", and " +
            "assigned to \"%s\" users was found.%n", userRole.getName(), userRole.getId(),
            userRole.getSubnetworkId(), userRole.getTotalAssignedUsers());
        if (userRole.getPermissions().length > 0) {
          System.out.printf("/tThe above user role has the following permissions:%n");
          for (Permission permission: userRole.getPermissions()) {
            System.out.printf("/t/tPermission with name \"%s\" and ID \"%s\".%n",
                permission.getName(), permission.getId());
          }
        } else {
          System.out.printf("/tThe above user role has no permissions assigned.%n");
        }
      }
    } else {
      System.out.println("No user roles found for your criteria.");
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
