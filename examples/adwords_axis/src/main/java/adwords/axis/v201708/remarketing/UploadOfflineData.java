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

package adwords.axis.v201708.remarketing;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201708.cm.ApiError;
import com.google.api.ads.adwords.axis.v201708.cm.Money;
import com.google.api.ads.adwords.axis.v201708.cm.Operator;
import com.google.api.ads.adwords.axis.v201708.rm.MoneyWithCurrency;
import com.google.api.ads.adwords.axis.v201708.rm.OfflineData;
import com.google.api.ads.adwords.axis.v201708.rm.OfflineDataUpload;
import com.google.api.ads.adwords.axis.v201708.rm.OfflineDataUploadOperation;
import com.google.api.ads.adwords.axis.v201708.rm.OfflineDataUploadReturnValue;
import com.google.api.ads.adwords.axis.v201708.rm.OfflineDataUploadServiceInterface;
import com.google.api.ads.adwords.axis.v201708.rm.OfflineDataUploadType;
import com.google.api.ads.adwords.axis.v201708.rm.OfflineDataUploadUserIdentifierType;
import com.google.api.ads.adwords.axis.v201708.rm.StoreSalesTransaction;
import com.google.api.ads.adwords.axis.v201708.rm.ThirdPartyUploadMetadata;
import com.google.api.ads.adwords.axis.v201708.rm.UploadMetadata;
import com.google.api.ads.adwords.axis.v201708.rm.UserIdentifier;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.ImmutableSet;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/**
 * This code example shows how to upload offline data for store sales transactions.
 *
 * <p>
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 * </p>
 */
public class UploadOfflineData {

  /** User identifier types whose values must be hashed. */
  private static final ImmutableSet<OfflineDataUploadUserIdentifierType> HASHED_IDENTIFIER_TYPES =
      ImmutableSet.of(
          OfflineDataUploadUserIdentifierType.HASHED_EMAIL,
          OfflineDataUploadUserIdentifierType.HASHED_FIRST_NAME,
          OfflineDataUploadUserIdentifierType.HASHED_LAST_NAME,
          OfflineDataUploadUserIdentifierType.HASHED_PHONE);

  /** Digest to use for hashing values. */
  private static final MessageDigest digest = getSHA256MessageDigest();

  private static final class UploadOfflineDataParams extends CodeSampleParams {

    /**
     * Email addresses for the transactions. Exactly two addresses required. You can pass these on
     * the command line using either of the following options:
     *
     * <ol>
     *   <li>Separate parameter name/value pairs, e.g., {@code --emailAddress address1
     *       --emailAddress address2}
     *   <li>A single name/value pair where the value is comma-separated, e.g., {@code
     *       --emailAddress address1,address2}
     * </ol>
     */
    @Parameter(
      names = ArgumentNames.EMAIL_ADDRESS,
      description = "Email addresses for the transactions. Exactly two addresses required.",
      required = true
    )
    private List<String> emailAddresses;

    @Parameter(names = ArgumentNames.CONVERSION_NAME, required = true)
    private String conversionName;

    @Parameter(names = ArgumentNames.EXTERNAL_UPLOAD_ID, required = true)
    private Long externalUploadId;

    @Parameter(names = ArgumentNames.UPLOAD_TIME, required = true)
    private String advertiserUploadTime;

    @Parameter(names = ArgumentNames.BRIDGE_MAP_VERSION_ID, required = true)
    private String bridgeMapVersionId;

    @Parameter(names = ArgumentNames.PARTNER_ID, required = true)
    private Integer partnerId;
  }

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

    UploadOfflineDataParams params = new UploadOfflineDataParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.emailAddresses =
          Arrays.asList("INSERT_EMAIL_ADDRESS_1_HERE", "INSERT_EMAIL_ADDRESS_2_HERE");
      params.conversionName = "INSERT_CONVERSION_NAME_HERE";
      params.externalUploadId = Long.valueOf("INSERT_EXTERNAL_UPLOAD_ID_HERE");
      // For times, use the format yyyyMMdd HHmmss tz. For more details on formats, see:
      // https://developers.google.com/adwords/api/docs/appendix/codes-formats#date-and-time-formats
      // For time zones, see:
      // https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids
      params.advertiserUploadTime = "INSERT_ADVERTISER_UPLOAD_TIME";
      params.bridgeMapVersionId = "INSERT_BRIDGE_MAP_VERSION_ID";
      params.partnerId = Integer.valueOf("INSERT_PARTNER_ID");
    }

    runExample(
        adWordsServices,
        session,
        params.conversionName,
        params.externalUploadId,
        params.emailAddresses,
        params.advertiserUploadTime,
        params.bridgeMapVersionId,
        params.partnerId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      String conversionName,
      long externalUploadId,
      List<String> emailAddresses,
      String advertiserUploadTime,
      String bridgeMapVersionId,
      int partnerId)
      throws Exception {
    // This example requires exactly 2 email addresses.
    if (emailAddresses.size() != 2) {
      throw new IllegalArgumentException(
          String.format(
              "%d email addresses specified. Please specify exactly 2 email addresses.",
              emailAddresses.size()));
    }

    // Get the OfflineDataUploadService.
    OfflineDataUploadServiceInterface offlineDataUploadService =
        adWordsServices.get(session, OfflineDataUploadServiceInterface.class);

    List<OfflineData> offlineDataList = new ArrayList<>();

    // Create the first offline data for upload.
    // This transaction occurred 7 days ago with amount of 200 USD.
    DateTime transactionTime1 = DateTime.now().minusDays(7);
    long transactionAmount1 = 200_000_000L;
    List<UserIdentifier> userIdentifiers1 =
        Arrays.asList(
            createUserIdentifier(
                OfflineDataUploadUserIdentifierType.HASHED_EMAIL, emailAddresses.get(0)),
            createUserIdentifier(OfflineDataUploadUserIdentifierType.STATE, "New York"));

    offlineDataList.add(
        createOfflineData(
            transactionTime1, transactionAmount1, "USD", conversionName, userIdentifiers1));

    // Create the second offline data for upload.
    // This transaction occurred 14 days ago with amount of 450 EUR.
    DateTime transactionTime2 = DateTime.now().minusDays(14);
    long transactionAmount2 = 450_000_000L;

    List<UserIdentifier> userIdentifiers2 =
        Arrays.asList(
            createUserIdentifier(
                OfflineDataUploadUserIdentifierType.HASHED_EMAIL, emailAddresses.get(1)),
            createUserIdentifier(OfflineDataUploadUserIdentifierType.STATE, "California"));

    offlineDataList.add(
        createOfflineData(
            transactionTime2, transactionAmount2, "EUR", conversionName, userIdentifiers2));

    // Create offline data upload object.
    OfflineDataUpload offlineDataUpload = new OfflineDataUpload();
    offlineDataUpload.setExternalUploadId(externalUploadId);
    offlineDataUpload.setOfflineDataList(
        offlineDataList.toArray(new OfflineData[offlineDataList.size()]));

    // Set the type and metadata of this upload.
    offlineDataUpload.setUploadType(OfflineDataUploadType.STORE_SALES_UPLOAD_THIRD_PARTY);
    ThirdPartyUploadMetadata thirdPartyUploadMetadata = new ThirdPartyUploadMetadata();
    thirdPartyUploadMetadata.setLoyaltyRate(1.0);
    thirdPartyUploadMetadata.setTransactionUploadRate(1.0);
    thirdPartyUploadMetadata.setAdvertiserUploadTime(advertiserUploadTime);
    thirdPartyUploadMetadata.setValidTransactionRate(1.0);
    thirdPartyUploadMetadata.setPartnerMatchRate(1.0);
    thirdPartyUploadMetadata.setPartnerUploadRate(1.0);
    thirdPartyUploadMetadata.setBridgeMapVersionId(bridgeMapVersionId);
    thirdPartyUploadMetadata.setPartnerId(partnerId);

    UploadMetadata uploadMetadata = new UploadMetadata();
    uploadMetadata.setStoreSalesUploadCommonMetadata(thirdPartyUploadMetadata);
    offlineDataUpload.setUploadMetadata(uploadMetadata);

    // Create an offline data upload operation.
    OfflineDataUploadOperation offlineDataUploadOperation = new OfflineDataUploadOperation();
    offlineDataUploadOperation.setOperator(Operator.ADD);
    offlineDataUploadOperation.setOperand(offlineDataUpload);

    // Upload offline data on the server and print some information.
    OfflineDataUploadReturnValue returnValue =
        offlineDataUploadService.mutate(
            new OfflineDataUploadOperation[] {offlineDataUploadOperation});
    offlineDataUpload = returnValue.getValue(0);
    System.out.printf(
        "Uploaded offline data with external upload ID %d, and upload status %s.%n",
        offlineDataUpload.getExternalUploadId(), offlineDataUpload.getUploadStatus());

    // Print any partial data errors from the response. The order of the partial
    // data errors list is the same as the uploaded offline data list in the
    // request.
    if (offlineDataUpload.getPartialDataErrors() != null) {
      int i = 0;
      for (ApiError apiError : offlineDataUpload.getPartialDataErrors()) {
        if (apiError != null) {
          System.out.printf(
              "Found a partial error for offline data #%d with error string: %s%n",
              i, apiError.getErrorString());
        }
        i++;
      }
    }
  }

  /** Returns a new offline data object with the specified values. */
  private static OfflineData createOfflineData(
      DateTime transactionTime,
      long transactionMicroAmount,
      String transactionCurrency,
      String conversionName,
      List<UserIdentifier> userIdentifiers) {
    StoreSalesTransaction storeSalesTransaction = new StoreSalesTransaction();

    // For times use the format yyyyMMdd HHmmss [tz].
    // For details, see
    // https://developers.google.com/adwords/api/docs/appendix/codes-formats#date-and-time-formats
    storeSalesTransaction.setTransactionTime(transactionTime.toString("yyyyMMdd HHmmss ZZZ"));
    storeSalesTransaction.setConversionName(conversionName);
    storeSalesTransaction.setUserIdentifiers(
        userIdentifiers.toArray(new UserIdentifier[userIdentifiers.size()]));

    Money money = new Money();
    money.setMicroAmount(transactionMicroAmount);

    MoneyWithCurrency moneyWithCurrency = new MoneyWithCurrency();
    moneyWithCurrency.setMoney(money);
    moneyWithCurrency.setCurrencyCode(transactionCurrency);
    storeSalesTransaction.setTransactionAmount(moneyWithCurrency);

    OfflineData offlineData = new OfflineData();
    offlineData.setStoreSalesTransaction(storeSalesTransaction);
    return offlineData;
  }

  /** Returns a new user identifier with the specified type and value. */
  private static UserIdentifier createUserIdentifier(
      OfflineDataUploadUserIdentifierType identifierType, String value)
      throws UnsupportedEncodingException {
    // If the user identifier type is a hashed type, also call hash function
    // on the value.
    if (HASHED_IDENTIFIER_TYPES.contains(identifierType)) {
      value = toSHA256String(value);
    }
    UserIdentifier userIdentifier = new UserIdentifier();
    userIdentifier.setUserIdentifierType(identifierType);
    userIdentifier.setValue(value);
    return userIdentifier;
  }

  /**
   * Hash a string using SHA-256 hashing algorithm.
   *
   * @param str the string to hash.
   * @return the SHA-256 hash string representation.
   * @throws UnsupportedEncodingException If UTF-8 charset is not supported.
   */
  private static String toSHA256String(String str) throws UnsupportedEncodingException {
    // Normalize the string before hashing.
    byte[] hash = digest.digest(toNormalizedString(str).getBytes("UTF-8"));
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
