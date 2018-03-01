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
import com.google.api.ads.adwords.axis.v201705.rm.AddressInfo;
import com.google.api.ads.adwords.axis.v201705.rm.AdwordsUserListServiceInterface;
import com.google.api.ads.adwords.axis.v201705.rm.CrmBasedUserList;
import com.google.api.ads.adwords.axis.v201705.rm.Member;
import com.google.api.ads.adwords.axis.v201705.rm.MutateMembersOperand;
import com.google.api.ads.adwords.axis.v201705.rm.MutateMembersOperation;
import com.google.api.ads.adwords.axis.v201705.rm.MutateMembersReturnValue;
import com.google.api.ads.adwords.axis.v201705.rm.UserList;
import com.google.api.ads.adwords.axis.v201705.rm.UserListOperation;
import com.google.api.ads.adwords.axis.v201705.rm.UserListReturnValue;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.ImmutableList;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example adds a user list (a.k.a. audience) and uploads members to populate the list.
 *
 * <p>
 * <em>Note:</em> It may take up to several hours for the list to be populated with members.
 * Email addresses must be associated with a Google account.
 * For privacy purposes, the user list size will show as zero until the list has at least 1,000
 * members. After that, the size will be rounded to the two most significant digits.
 * </p>
 *
 * <p>
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 * </p>
 */
public class AddCrmBasedUserList {

  private static final ImmutableList<String> EMAILS =
      ImmutableList.of("client1@example.com", "client2@example.com", " Client3@example.com ");
  private static final MessageDigest digest = getSHA256MessageDigest();

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
    // Get the UserListService.
    AdwordsUserListServiceInterface userListService =
        adWordsServices.get(session, AdwordsUserListServiceInterface.class);

    // Create a user list.
    CrmBasedUserList userList = new CrmBasedUserList();
    userList.setName("Customer relationship management list #" + System.currentTimeMillis());
    userList.setDescription("A list of customers that originated from email addresses");

    // See limit here: https://support.google.com/adwords/answer/6276125#requirements.
    userList.setMembershipLifeSpan(30L);

    // Create operation.
    UserListOperation operation = new UserListOperation();
    operation.setOperand(userList);
    operation.setOperator(Operator.ADD);

    // Add user list.
    UserListReturnValue result = userListService.mutate(new UserListOperation[] {operation});

    // Display user list.
    UserList userListAdded = result.getValue(0);
    System.out.printf(
        "User list with name '%s' and ID %d was added.%n",
        userListAdded.getName(), userListAdded.getId());

    // Get user list ID.
    Long userListId = userListAdded.getId();

    // Create operation to add members to the user list based on email addresses.
    MutateMembersOperation mutateMembersOperation = new MutateMembersOperation();
    MutateMembersOperand operand = new MutateMembersOperand();
    operand.setUserListId(userListId);

    // Hash normalized email addresses based on SHA-256 hashing algorithm.
    List<Member> members = new ArrayList<>(EMAILS.size());
    for (String email : EMAILS) {
      String normalizedEmail = toNormalizedString(email);
      Member member = new Member();
      member.setHashedEmail(toSHA256String(normalizedEmail));
      members.add(member);
    }

    String firstName = "John";
    String lastName = "Doe";
    String countryCode = "US";
    String zipCode = "10011";

    com.google.api.ads.adwords.axis.v201705.rm.AddressInfo addressInfo = new AddressInfo();
    // First and last name must be normalized and hashed.
    addressInfo.setHashedFirstName(toSHA256String(toNormalizedString(firstName)));
    addressInfo.setHashedLastName(toSHA256String(toNormalizedString(lastName)));
    // Country code and zip code are sent in plaintext.
    addressInfo.setCountryCode(countryCode);
    addressInfo.setZipCode(zipCode);

    Member memberByAddress = new Member();
    memberByAddress.setAddressInfo(addressInfo);
    members.add(memberByAddress);

    operand.setMembersList(members.toArray(new Member[members.size()]));
    mutateMembersOperation.setOperand(operand);
    mutateMembersOperation.setOperator(Operator.ADD);

    // Add members to the user list based on email addresses.
    MutateMembersReturnValue mutateMembersResult =
        userListService.mutateMembers(new MutateMembersOperation[] {mutateMembersOperation});

    // Display results.
    // Reminder: it may take several hours for the list to be populated with members.
    for (UserList userListResult : mutateMembersResult.getUserLists()) {
      System.out.printf(
          "%d email addresses were uploaded to user list with name '%s' and ID %d "
              + "and are scheduled for review.%n",
          EMAILS.size(), userListResult.getName(), userListResult.getId());
    }
  }

  /**
   * Hash a string using SHA-256 hashing algorithm.
   *
   * @param str the string to hash.
   * @return the SHA-256 hash string representation.
   * @throws UnsupportedEncodingException If UTF-8 charset is not supported.
   */
  private static String toSHA256String(String str) throws UnsupportedEncodingException {
    byte[] hash = digest.digest(str.getBytes("UTF-8"));
    StringBuilder result = new StringBuilder();
    for (byte b : hash) {
      result.append(String.format("%02x", b));
    }

    return result.toString();
  }

  /**
   * Removes leading and trailing whitespace and converts all characters to lower case.
   *
   * @param value the string to normalize.
   * @return a normalized copy of the string.
   */
  private static String toNormalizedString(String value) {
    return value.trim().toLowerCase();
  }

  /** Returns SHA-256 hashing algorithm. */
  private static MessageDigest getSHA256MessageDigest() {
    try {
      return MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException("Missing SHA-256 algorithm implementation.", e);
    }
  }
}
