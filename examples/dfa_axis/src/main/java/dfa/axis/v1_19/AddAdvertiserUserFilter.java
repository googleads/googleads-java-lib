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
import com.google.api.ads.dfa.axis.v1_19.ObjectFilter;
import com.google.api.ads.dfa.axis.v1_19.User;
import com.google.api.ads.dfa.axis.v1_19.UserFilter;
import com.google.api.ads.dfa.axis.v1_19.UserRemote;
import com.google.api.ads.dfa.axis.v1_19.UserSaveResult;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example locates a user profile by ID number and adds a filter to it,
 * limiting the user profile's access to certain advertisers. To get user IDs,
 * run GetUsers.java. To get advertiser IDs, run GetAdvertisers.java.
 *
 * A similar pattern can be applied to set filters limiting site, user role,
 * and/or campaign access for any user. To get the Filter Criteria Type ID, run
 * GetUserFilterTypes.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: user.getUser, user.saveUser
 *
 * @author Joseph DiLallo
 */
public class AddAdvertiserUserFilter {

  // Set the ID of the user whose advertiser access will be limited.
  private static final String USER_ID = "INSERT_USER_ID_HERE";
  // Set the ID of the advertiser that the user is allowed to see.
  private static final String ADVERTISER_ID = "INSERT_ADVERTISER_ID_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, long userId, long advertiserId)
          throws Exception {
    // Request the user service.
    UserRemote userService = dfaServices.get(session, UserRemote.class);

    // Retrieve the user who is to be modified.
    User user = userService.getUser(userId);

    // Create and configure a user filter.
    UserFilter filterToAdd = new UserFilter();
    // The following field has been filled in to make a filter that allows a
    // user to access only the assigned objects.
    // This value was determined using GetUserFilterCriteriaTypes.java.
    filterToAdd.setUserFilterCriteriaId(2);
    // Because this filter used the criteria type "Assigned" it is necessary
    // to specify what advertisers this user has access to. This next step
    // would be skipped for the criteria types "All" and "None".

    // Create an object filter to represent each object the user has access
    // to. Since this is an advertiser filter, an object filter represents an
    // advertiser. The total of object filter objects will need to match the
    // total of advertisers the user is assigned.
    ObjectFilter allowedObject = new ObjectFilter();
    // Insert the advertiser ID of an advertiser assigned to this user.
    allowedObject.setId(advertiserId);
    // Create any additional object filters that are needed, then create an
    // array of all of the object filters for this filter.
    ObjectFilter[] objectFilters = {allowedObject};
    // Add these settings to the user filter
    filterToAdd.setObjectFilters(objectFilters);

    // Add the filter to the user. The following method is specific to
    // advertiser filters. See the User class documentation for the names of
    // methods for other filters.
    user.setAdvertiserUserFilter(filterToAdd);

    // Save the changes made and display a success message.
    UserSaveResult userSaveResult = userService.saveUser(user);
    System.out.printf("User with ID \"%s\" was modified.", userSaveResult.getId());
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

    long userId = Long.parseLong(USER_ID);
    long advertiserId = Long.parseLong(ADVERTISER_ID);

    runExample(dfaServices, session, userId, advertiserId);
  }
}
