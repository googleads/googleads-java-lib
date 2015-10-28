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

package adwords.axis.v201506.remarketing;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.AdWordsConversionTracker;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTracker;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerPage;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.axis.v201506.cm.Predicate;
import com.google.api.ads.adwords.axis.v201506.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201506.cm.Selector;
import com.google.api.ads.adwords.axis.v201506.rm.AdwordsUserListServiceInterface;
import com.google.api.ads.adwords.axis.v201506.rm.BasicUserList;
import com.google.api.ads.adwords.axis.v201506.rm.UserList;
import com.google.api.ads.adwords.axis.v201506.rm.UserListConversionType;
import com.google.api.ads.adwords.axis.v201506.rm.UserListMembershipStatus;
import com.google.api.ads.adwords.axis.v201506.rm.UserListOperation;
import com.google.api.ads.adwords.axis.v201506.rm.UserListReturnValue;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This example adds a remarketing user list (a.k.a. audience).
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddAudience {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
    // Get the UserListService.
    AdwordsUserListServiceInterface userListService =
        adWordsServices.get(session, AdwordsUserListServiceInterface.class);

    // Get the ConversionTrackerService.
    ConversionTrackerServiceInterface conversionTrackerService =
        adWordsServices.get(session, ConversionTrackerServiceInterface.class);

    // Create conversion type (tag).
    UserListConversionType conversionType = new UserListConversionType();
    conversionType.setName("Mars cruise customers #" + System.currentTimeMillis());

    // Create remarketing user list.
    BasicUserList userList = new BasicUserList();
    userList.setName("Mars cruise customers #" + System.currentTimeMillis());
    userList.setDescription("A list of mars cruise customers in the last year");
    userList.setMembershipLifeSpan(365L);
    userList.setConversionTypes(new UserListConversionType[] {conversionType});

    // You can optionally provide these field(s).
    userList.setStatus(UserListMembershipStatus.OPEN);

    // Create operations.
    UserListOperation operation = new UserListOperation();
    operation.setOperand(userList);
    operation.setOperator(Operator.ADD);

    UserListOperation[] operations = new UserListOperation[] {operation};

    // Add user list.
    UserListReturnValue result = userListService.mutate(operations);

    // Display results.
    // Capture the ID(s) of the conversion.
    List<String> conversionIds = new ArrayList<String>();
    for (UserList userListResult : result.getValue()) {
      if (userListResult instanceof BasicUserList) {
        BasicUserList remarketingUserList = (BasicUserList) userListResult;
        for (UserListConversionType userListConversionType : remarketingUserList
            .getConversionTypes()) {
          conversionIds.add(userListConversionType.getId().toString());
        }
      }
    }

    // Create predicate and selector.
    Predicate predicate = new Predicate();
    predicate.setField("Id");
    predicate.setOperator(PredicateOperator.IN);
    predicate.setValues(conversionIds.toArray(new String[0]));
    Selector selector = new Selector();
    selector.setFields(new String[] {"Id"});
    selector.setPredicates(new Predicate[] {predicate});

    // Get all conversion trackers.
    Map<Long, AdWordsConversionTracker> conversionTrackers =
        new HashMap<Long, AdWordsConversionTracker>();
    ConversionTrackerPage page = conversionTrackerService.get(selector);
    if (page != null && page.getEntries() != null) {
      for (ConversionTracker conversionTracker : page.getEntries()) {
        conversionTrackers.put(conversionTracker.getId(),
            (AdWordsConversionTracker) conversionTracker);
      }
    }

    // Display user lists.
    for (UserList userListResult : result.getValue()) {
      System.out.printf("User list with name '%s' and id '%d' was added.\n",
          userListResult.getName(), userListResult.getId());

      // Display user list associated conversion code snippets.
      if (userListResult instanceof BasicUserList) {
        BasicUserList remarketingUserList = (BasicUserList) userListResult;
        for (UserListConversionType userListConversionType : remarketingUserList
            .getConversionTypes()) {
          System.out.printf("Conversion type code snippet associated to the list:\n%s\n",
              conversionTrackers.get(userListConversionType.getId()).getSnippet());
        }
      }
    }
  }
}
