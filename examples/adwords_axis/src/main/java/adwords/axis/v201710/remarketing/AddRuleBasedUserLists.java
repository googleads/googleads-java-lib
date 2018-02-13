// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201710.remarketing;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.rm.AdwordsUserListServiceInterface;
import com.google.api.ads.adwords.axis.v201710.rm.CombinedRuleUserList;
import com.google.api.ads.adwords.axis.v201710.rm.CombinedRuleUserListRuleOperator;
import com.google.api.ads.adwords.axis.v201710.rm.DateKey;
import com.google.api.ads.adwords.axis.v201710.rm.DateRuleItem;
import com.google.api.ads.adwords.axis.v201710.rm.DateRuleItemDateOperator;
import com.google.api.ads.adwords.axis.v201710.rm.DateSpecificRuleUserList;
import com.google.api.ads.adwords.axis.v201710.rm.ExpressionRuleUserList;
import com.google.api.ads.adwords.axis.v201710.rm.NumberKey;
import com.google.api.ads.adwords.axis.v201710.rm.NumberRuleItem;
import com.google.api.ads.adwords.axis.v201710.rm.NumberRuleItemNumberOperator;
import com.google.api.ads.adwords.axis.v201710.rm.Rule;
import com.google.api.ads.adwords.axis.v201710.rm.RuleBasedUserListPrepopulationStatus;
import com.google.api.ads.adwords.axis.v201710.rm.RuleItem;
import com.google.api.ads.adwords.axis.v201710.rm.RuleItemGroup;
import com.google.api.ads.adwords.axis.v201710.rm.StringKey;
import com.google.api.ads.adwords.axis.v201710.rm.StringRuleItem;
import com.google.api.ads.adwords.axis.v201710.rm.StringRuleItemStringOperator;
import com.google.api.ads.adwords.axis.v201710.rm.UserList;
import com.google.api.ads.adwords.axis.v201710.rm.UserListOperation;
import com.google.api.ads.adwords.axis.v201710.rm.UserListReturnValue;
import com.google.api.ads.adwords.axis.v201710.rm.UserListRuleTypeEnumsEnum;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * This example adds two rule-based remarketing user lists: one with no site visit date
 * restrictions, and another that will only include users who visit your site in the
 * next six months.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddRuleBasedUserLists {

  private static final String DATE_FORMAT_STRING = "yyyyMMdd";

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    try {
      runExample(adWordsServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {

    // Get the AdwordsUserListService.
    AdwordsUserListServiceInterface userListService =
        adWordsServices.get(session, AdwordsUserListServiceInterface.class);

    // First rule item group - users who visited the checkout page and had more than one item
    // in their shopping cart.
    StringKey pageTypeKey = new StringKey("ecomm_pagetype");

    StringRuleItem checkoutStringRuleItem = new StringRuleItem();
    checkoutStringRuleItem.setKey(pageTypeKey);
    checkoutStringRuleItem.setOp(StringRuleItemStringOperator.EQUALS);
    checkoutStringRuleItem.setValue("checkout");

    RuleItem checkoutRuleItem = new RuleItem();
    checkoutRuleItem.setStringRuleItem(checkoutStringRuleItem);

    NumberKey cartSizeKey = new NumberKey("cartsize");

    NumberRuleItem cartSizeNumberRuleItem = new NumberRuleItem();
    cartSizeNumberRuleItem.setKey(cartSizeKey);
    cartSizeNumberRuleItem.setOp(NumberRuleItemNumberOperator.GREATER_THAN);
    cartSizeNumberRuleItem.setValue(1.0);

    RuleItem cartSizeRuleItem = new RuleItem();
    cartSizeRuleItem.setNumberRuleItem(cartSizeNumberRuleItem);

    // Combine the two rule items into a RuleItemGroup so AdWords will AND their rules
    // together.
    RuleItemGroup checkoutMultipleItemGroup = new RuleItemGroup();
    checkoutMultipleItemGroup.setItems(new RuleItem[] {checkoutRuleItem, cartSizeRuleItem});

    // Second rule item group - users who checked out within the next 3 months.
    DateKey checkoutDateKey = new DateKey("checkoutdate");

    DateRuleItem startDateDateRuleItem = new DateRuleItem();
    startDateDateRuleItem.setKey(checkoutDateKey);
    startDateDateRuleItem.setOp(DateRuleItemDateOperator.AFTER);
    startDateDateRuleItem.setValue(new DateTime().toString(DATE_FORMAT_STRING));

    RuleItem startDateRuleItem = new RuleItem();
    startDateRuleItem.setDateRuleItem(startDateDateRuleItem);

    DateRuleItem endDateDateRuleItem = new DateRuleItem();
    endDateDateRuleItem.setKey(checkoutDateKey);
    endDateDateRuleItem.setOp(DateRuleItemDateOperator.BEFORE);
    endDateDateRuleItem.setValue(new DateTime().plusMonths(3).toString(DATE_FORMAT_STRING));

    RuleItem endDateRuleItem = new RuleItem();
    endDateRuleItem.setDateRuleItem(endDateDateRuleItem);

    // Combine the date rule items into a RuleItemGroup.
    RuleItemGroup checkedOutNextThreeMonthsItemGroup = new RuleItemGroup();
    checkedOutNextThreeMonthsItemGroup.setItems(
        new RuleItem[] {startDateRuleItem, endDateRuleItem});

    // Combine the rule item groups into a Rule so AdWords knows how to apply the rules.
    Rule rule = new Rule();
    rule.setGroups(
        new RuleItemGroup[] {checkoutMultipleItemGroup, checkedOutNextThreeMonthsItemGroup});
    // ExpressionRuleUserLists can use either CNF or DNF for matching. CNF means 'at least one item
    // in each rule item group must match', and DNF means 'at least one entire rule item group must
    // match'. DateSpecificRuleUserList only supports DNF. You can also omit the rule type
    // altogether to default to DNF.
    rule.setRuleType(UserListRuleTypeEnumsEnum.DNF);

    // Third and fourth rule item groups.
    // Visitors of a page who visited another page.
    StringKey urlStringKey = new StringKey("url__");

    StringRuleItem site1StringRuleItem = new StringRuleItem();
    site1StringRuleItem.setKey(urlStringKey);
    site1StringRuleItem.setOp(StringRuleItemStringOperator.EQUALS);
    site1StringRuleItem.setValue("example.com/example1");
    RuleItem site1RuleItem = new RuleItem();
    site1RuleItem.setStringRuleItem(site1StringRuleItem);

    StringRuleItem site2StringRuleItem = new StringRuleItem();
    site2StringRuleItem.setKey(urlStringKey);
    site2StringRuleItem.setOp(StringRuleItemStringOperator.EQUALS);
    site2StringRuleItem.setValue("example.com/example2");
    RuleItem site2RuleItem = new RuleItem();
    site2RuleItem.setStringRuleItem(site2StringRuleItem);

    // Create two RuleItemGroups to show that a visitor browsed two sites.
    RuleItemGroup site1RuleItemGroup = new RuleItemGroup();
    site1RuleItemGroup.setItems(new RuleItem[]{site1RuleItem});
    RuleItemGroup site2RuleItemGroup = new RuleItemGroup();
    site2RuleItemGroup.setItems(new RuleItem[]{site2RuleItem});

    // Create two rules to show that a visitor browsed two sites.
    Rule userVisitedSite1Rule = new Rule();
    userVisitedSite1Rule.setGroups(new RuleItemGroup[]{site1RuleItemGroup});

    Rule userVisitedSite2Rule = new Rule();
    userVisitedSite2Rule.setGroups(new RuleItemGroup[]{site2RuleItemGroup});

    // Create the user list with no restrictions on site visit date.
    ExpressionRuleUserList expressionUserList = new ExpressionRuleUserList();
    String creationTimeString = new DateTime().toString("yyyyMMdd_HHmmss");
    expressionUserList.setName(
        "Expression based user list created at " + creationTimeString);
    expressionUserList.setDescription(
        "Users who checked out in three month window OR visited the checkout page "
        + "with more than one item in their cart");
    expressionUserList.setRule(rule);

    // Optional: Set the prepopulationStatus to REQUESTED to include past users in the user list.
    expressionUserList.setPrepopulationStatus(RuleBasedUserListPrepopulationStatus.REQUESTED);

    // Create the user list restricted to users who visit your site within the next six months.
    DateTime startDate = new DateTime();
    DateTime endDate = startDate.plusMonths(6);

    DateSpecificRuleUserList dateUserList = new DateSpecificRuleUserList();
    dateUserList.setName(
        "Date rule user list created at " + creationTimeString);
    dateUserList.setDescription(String.format("Users who visited the site between %s and %s and "
        + "checked out in three month window OR visited the checkout page "
        + "with more than one item in their cart", startDate.toString(DATE_FORMAT_STRING),
        endDate.toString(DATE_FORMAT_STRING)));
    dateUserList.setRule(rule);

    // Set the start and end dates of the user list.
    dateUserList.setStartDate(startDate.toString(DATE_FORMAT_STRING));
    dateUserList.setEndDate(endDate.toString(DATE_FORMAT_STRING));

    // Create the user list where "Visitors of a page who did visit another page".
    // To create a user list where "Visitors of a page who did not visit another
    // page", change the ruleOperator from AND to AND_NOT.
    CombinedRuleUserList combinedRuleUserList = new CombinedRuleUserList();
    combinedRuleUserList.setName("Combined rule user list created at " + creationTimeString);
    combinedRuleUserList.setDescription("Users who visited two sites.");
    combinedRuleUserList.setLeftOperand(userVisitedSite1Rule);
    combinedRuleUserList.setRightOperand(userVisitedSite2Rule);
    combinedRuleUserList.setRuleOperator(CombinedRuleUserListRuleOperator.AND);

    // Create operations to add the user lists.
    List<UserListOperation> operations = new ArrayList<>();
    for (UserList userList :
        new UserList[] {expressionUserList, dateUserList, combinedRuleUserList}) {
      UserListOperation operation = new UserListOperation();
      operation.setOperand(userList);
      operation.setOperator(Operator.ADD);
      operations.add(operation);
    }

    // Submit the operations.
    UserListReturnValue result =
        userListService.mutate(operations.toArray(new UserListOperation[operations.size()]));

    // Display the results.
    for (UserList userListResult : result.getValue()) {
      System.out.printf("User list added with ID %d, name '%s', status '%s', list type '%s',"
          + " accountUserListStatus '%s', description '%s'.%n",
          userListResult.getId(),
          userListResult.getName(),
          userListResult.getStatus().getValue(),
          userListResult.getListType() == null ? null : userListResult.getListType().getValue(),
          userListResult.getAccountUserListStatus().getValue(),
          userListResult.getDescription());
    }
  }
}
