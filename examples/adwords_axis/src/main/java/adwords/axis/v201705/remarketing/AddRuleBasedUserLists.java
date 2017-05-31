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

package adwords.axis.v201705.remarketing;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201705.cm.Operator;
import com.google.api.ads.adwords.axis.v201705.rm.AdwordsUserListServiceInterface;
import com.google.api.ads.adwords.axis.v201705.rm.DateKey;
import com.google.api.ads.adwords.axis.v201705.rm.DateRuleItem;
import com.google.api.ads.adwords.axis.v201705.rm.DateRuleItemDateOperator;
import com.google.api.ads.adwords.axis.v201705.rm.DateSpecificRuleUserList;
import com.google.api.ads.adwords.axis.v201705.rm.ExpressionRuleUserList;
import com.google.api.ads.adwords.axis.v201705.rm.NumberKey;
import com.google.api.ads.adwords.axis.v201705.rm.NumberRuleItem;
import com.google.api.ads.adwords.axis.v201705.rm.NumberRuleItemNumberOperator;
import com.google.api.ads.adwords.axis.v201705.rm.Rule;
import com.google.api.ads.adwords.axis.v201705.rm.RuleBasedUserListPrepopulationStatus;
import com.google.api.ads.adwords.axis.v201705.rm.RuleItem;
import com.google.api.ads.adwords.axis.v201705.rm.RuleItemGroup;
import com.google.api.ads.adwords.axis.v201705.rm.StringKey;
import com.google.api.ads.adwords.axis.v201705.rm.StringRuleItem;
import com.google.api.ads.adwords.axis.v201705.rm.StringRuleItemStringOperator;
import com.google.api.ads.adwords.axis.v201705.rm.UserList;
import com.google.api.ads.adwords.axis.v201705.rm.UserListOperation;
import com.google.api.ads.adwords.axis.v201705.rm.UserListReturnValue;
import com.google.api.ads.adwords.axis.v201705.rm.UserListRuleTypeEnumsEnum;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    runExample(adWordsServices, session);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws Exception {
    
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
    
    // Create the user list with no restrictions on site visit date.
    ExpressionRuleUserList expressionUserList = new ExpressionRuleUserList();
    expressionUserList.setName(
        "Expression based user list created at " + new DateTime().toString("yyyyMMdd_HHmmss"));
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
        "Date rule user list created at " + new DateTime().toString("yyyyMMdd_HHmmss"));
    dateUserList.setDescription(String.format("Users who visited the site between %s and %s and "
        + "checked out in three month window OR visited the checkout page "
        + "with more than one item in their cart", startDate.toString(DATE_FORMAT_STRING),
        endDate.toString(DATE_FORMAT_STRING)));
    dateUserList.setRule(rule);

    // Set the start and end dates of the user list.
    dateUserList.setStartDate(startDate.toString(DATE_FORMAT_STRING));
    dateUserList.setEndDate(endDate.toString(DATE_FORMAT_STRING));

    // Create operations to add the user lists.
    List<UserListOperation> operations = new ArrayList<>();
    for (UserList userList : new UserList[] {expressionUserList, dateUserList}) {
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
