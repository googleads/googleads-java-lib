// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201603.extensions;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201603.cm.ApiException;
import com.google.api.ads.adwords.axis.v201603.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201603.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201603.cm.CustomerFeed;
import com.google.api.ads.adwords.axis.v201603.cm.CustomerFeedOperation;
import com.google.api.ads.adwords.axis.v201603.cm.CustomerFeedReturnValue;
import com.google.api.ads.adwords.axis.v201603.cm.CustomerFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.Feed;
import com.google.api.ads.adwords.axis.v201603.cm.FeedOperation;
import com.google.api.ads.adwords.axis.v201603.cm.FeedOrigin;
import com.google.api.ads.adwords.axis.v201603.cm.FeedReturnValue;
import com.google.api.ads.adwords.axis.v201603.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201603.cm.Function;
import com.google.api.ads.adwords.axis.v201603.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201603.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201603.cm.OAuthInfo;
import com.google.api.ads.adwords.axis.v201603.cm.Operator;
import com.google.api.ads.adwords.axis.v201603.cm.PlacesLocationFeedData;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import adwords.axis.auth.GetRefreshToken;

import java.rmi.RemoteException;

import javax.annotation.Nullable;

/**
 * This example adds a feed that syncs feed items from a Google
 * My Business (GMB) account and associates the feed with a customer.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from
 * the "ads.properties" file. See README for more info.
 */
public class AddGoogleMyBusinessLocationExtensions {

  /**
   * The placeholder type for location extensions.
   *
   * <p>See the Placeholder reference page for a list of all the placeholder types and fields.
   * https://developers.google.com/adwords/api/docs/appendix/placeholders
   */
  private static final int PLACEHOLDER_LOCATION = 7;

  /**
   * The maximum number of CustomerFeed ADD operation attempts to make before throwing
   * an exception.
   */
  private static final int MAX_CUSTOMER_FEED_ADD_ATTEMPTS = 10;

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

    // The email address of either an owner or a manager of the GMB account.
    String gmbEmailAddress = "INSERT_GMB_EMAIL_ADDRESS_HERE";

    // If the gmbEmailAddress above is the same user you used to generate your AdWords API
    // refresh token, leave the assignment below unchanged.
    // Otherwise, to obtain an access token for your GMB account, run the GetRefreshToken example.
    // Make sure you are logged in as the same user as gmbEmailAddress above when you follow the
    // link provided by the example, then call Credential.getAccessToken() on the generated
    // Credential object and copy and paste the value into the assignment below.
    String gmbAccessToken = oAuth2Credential.getAccessToken();

    // If the gmbEmailAddress above is for a GMB manager instead of the GMB account owner,
    // then set businessAccountIdentifier to the +Page ID of a location for which the
    // manager has access. See the location extensions guide at
    // https://developers.google.com/adwords/api/docs/guides/feed-services-locations
    // for details.
    String businessAccountIdentifier = null;
    
    runExample(adWordsServices, session, gmbEmailAddress, gmbAccessToken,
        businessAccountIdentifier);
  }

  private static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      String gmbEmailAddress, String gmbAccessToken, @Nullable String businessAccountIdentifier)
      throws ApiException, RemoteException, InterruptedException {

    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);

    // Create a feed that will sync to the Google My Business account specified
    // by gmbEmailAddress. Do not add FeedAttributes to this object,
    // as AdWords will add them automatically because this will be a
    // system generated feed.
    Feed gmbFeed = new Feed();
    gmbFeed.setName("Google My Business feed #" + System.currentTimeMillis());

    PlacesLocationFeedData feedData = new PlacesLocationFeedData();
    feedData.setEmailAddress(gmbEmailAddress);
    feedData.setBusinessAccountIdentifier(businessAccountIdentifier);
    
    // Optional: specify labels to filter Google My Business listings. If
    // specified, only listings that have any of the labels set are
    // synchronized into FeedItems.
    feedData.setLabelFilters(new String[] {"Stores in New York City"});

    OAuthInfo oAuthInfo = new OAuthInfo();
    oAuthInfo.setHttpMethod("GET");
    oAuthInfo.setHttpRequestUrl(GetRefreshToken.ADWORDS_API_SCOPE);
    oAuthInfo.setHttpAuthorizationHeader(String.format("Bearer %s", gmbAccessToken));
    
    feedData.setOAuthInfo(oAuthInfo);

    gmbFeed.setSystemFeedGenerationData(feedData);
    
    // Since this feed's feed items will be managed by AdWords,
    // you must set its origin to ADWORDS.
    gmbFeed.setOrigin(FeedOrigin.ADWORDS);

    // Create an operation to add the feed.
    FeedOperation feedOperation = new FeedOperation();
    feedOperation.setOperand(gmbFeed);
    feedOperation.setOperator(Operator.ADD);

    // Add the feed. Since it is a system generated feed, AdWords will automatically:
    // 1. Set up the FeedAttributes on the feed.
    // 2. Set up a FeedMapping that associates the FeedAttributes of the feed
    // with the placeholder fields of the LOCATION placeholder type.
    FeedReturnValue addFeedResult = feedService.mutate(new FeedOperation[] {feedOperation});
    Feed addedFeed = addFeedResult.getValue(0);
    System.out.printf("Added GMB feed with ID %d%n", addedFeed.getId());

    // Add a CustomerFeed that associates the feed with this customer for
    // the LOCATION placeholder type.
    CustomerFeed customerFeed = new CustomerFeed();
    customerFeed.setFeedId(addedFeed.getId());
    customerFeed.setPlaceholderTypes(new int[] {PLACEHOLDER_LOCATION});

    // Create a matching function that will always evaluate to true.
    Function customerMatchingFunction = new Function();
    ConstantOperand constOperand = new ConstantOperand();
    constOperand.setType(ConstantOperandConstantType.BOOLEAN);
    constOperand.setBooleanValue(true);
    customerMatchingFunction.setLhsOperand(new FunctionArgumentOperand[] {constOperand});
    customerMatchingFunction.setOperator(FunctionOperator.IDENTITY);
    customerFeed.setMatchingFunction(customerMatchingFunction);

    // Create an operation to add the customer feed.
    CustomerFeedOperation customerFeedOperation = new CustomerFeedOperation();
    customerFeedOperation.setOperand(customerFeed);
    customerFeedOperation.setOperator(Operator.ADD);

    CustomerFeedServiceInterface customerFeedService =
        adWordsServices.get(session, CustomerFeedServiceInterface.class);

    // After the completion of the Feed ADD operation above the added feed will not be available
    // for usage in a CustomerFeed until the sync between the AdWords and GMB accounts
    // completes. The loop below will retry adding the CustomerFeed up to ten times with an
    // exponential back-off policy.
    CustomerFeed addedCustomerFeed = null;
    int numberOfAttempts = 0;
    do {
      numberOfAttempts++;
      try {
        CustomerFeedReturnValue customerFeedResult =
            customerFeedService.mutate(new CustomerFeedOperation[] {customerFeedOperation});
        addedCustomerFeed = customerFeedResult.getValue(0);
        System.out.printf("Attempt #%d to add the CustomerFeed was successful%n", numberOfAttempts);
      } catch (Exception e) {
        // Wait using exponential backoff policy
        long sleepSeconds = (long) Math.scalb(5, numberOfAttempts);
        System.out.printf("Attempt #%d to add the CustomerFeed was not successful. "
            + "Waiting %d seconds before trying again.%n", numberOfAttempts, sleepSeconds);
        Thread.sleep(sleepSeconds * 1000);
      }
    } while (numberOfAttempts < MAX_CUSTOMER_FEED_ADD_ATTEMPTS && addedCustomerFeed == null);

    if (addedCustomerFeed == null) {
      throw new RuntimeException("Could not create the CustomerFeed after "
          + MAX_CUSTOMER_FEED_ADD_ATTEMPTS + " attempts. Please retry "
          + "the CustomerFeed ADD operation later.");
    }

    System.out.printf("Added CustomerFeed for feed ID %d and placeholder type %d%n",
        addedCustomerFeed.getFeedId(), addedCustomerFeed.getPlaceholderTypes()[0]);

    // OPTIONAL: Create a CampaignFeed to specify which FeedItems to use at the Campaign
    // level. This will be similar to the CampaignFeed in the AddSiteLinks example, except
    // you can also filter based on the business name and category of each FeedItem
    // by using a FeedAttributeOperand in your matching function.

    // OPTIONAL: Create an AdGroupFeed for even more fine grained control over
    // which feed items are used at the AdGroup level.
  }
}
