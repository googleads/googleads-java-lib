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
import com.google.api.ads.dfa.axis.v1_19.UserRoleRemote;
import com.google.api.ads.dfa.axis.v1_19.UserRoleSaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a user role in a given DFA subnetwork. To get the
 * subnetwork ID, run GetSubnetworks.java. To get the available permissions, run
 * GetAvailablePermissions.java. To get the parent user role ID, run
 * GetUserRoles.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: userrole.saveUserRole
 *
 * @author Joseph DiLallo
 */
public class CreateUserRole {

  private static final String USER_ROLE_NAME = "INSERT_USER_ROLE_NAME_HERE";
  private static final String SUBNETWORK_ID = "INSERT_SUBNETWORK_ID_HERE";
  private static final String PARENT_USER_ROLE_ID = "INSERT_PARENT_USER_ROLE_ID_HERE";
  private static final String PERMISSION_ID_ONE = "INSERT_FIRST_PERMISSION_ID_HERE";
  private static final String PERMISSION_ID_TWO = "INSERT_SECOND_PERMISSION_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, String userRoleName, long subnetworkId,
      long parentUserRoleId, long permission1Id, long permission2Id) throws Exception {
    // Request the service.
    UserRoleRemote service = dfaServices.get(session, UserRoleRemote.class);

    // Create user role structure.
    UserRole userRole = new UserRole();
    userRole.setId(0);
    userRole.setName(userRoleName);
    userRole.setSubnetworkId(subnetworkId);
    userRole.setParentUserRoleId(parentUserRoleId);

    // Create a permission object to represent each permission this user role
    // has.
    Permission permission1 = new Permission();
    permission1.setId(permission1Id);
    Permission permission2 = new Permission();
    permission2.setId(permission2Id);
    Permission[] permissions = new Permission[] {permission1, permission2};

    // Add the permissions to the user role.
    userRole.setPermissions(permissions);

    // Create user role.
    UserRoleSaveResult userRoleSaveResult = service.saveUserRole(userRole);

    // Display user role ID.
    System.out.println("User role with ID \"" + userRoleSaveResult.getId()
        +  "\" was created.");
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
    long parentUserRoleId = Long.parseLong(PARENT_USER_ROLE_ID);
    long permission1Id = Long.parseLong(PERMISSION_ID_ONE);
    long permission2Id = Long.parseLong(PERMISSION_ID_TWO);

    runExample(dfaServices, session, USER_ROLE_NAME, subnetworkId, parentUserRoleId,
        permission1Id, permission2Id);
  }
}
