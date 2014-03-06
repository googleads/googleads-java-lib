// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201402.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201402.cm.ApiException;
import com.google.api.ads.adwords.axis.v201402.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201402.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201402.cm.CustomerFeed;
import com.google.api.ads.adwords.axis.v201402.cm.CustomerFeedOperation;
import com.google.api.ads.adwords.axis.v201402.cm.CustomerFeedReturnValue;
import com.google.api.ads.adwords.axis.v201402.cm.CustomerFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201402.cm.Feed;
import com.google.api.ads.adwords.axis.v201402.cm.FeedOperation;
import com.google.api.ads.adwords.axis.v201402.cm.FeedOrigin;
import com.google.api.ads.adwords.axis.v201402.cm.FeedReturnValue;
import com.google.api.ads.adwords.axis.v201402.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201402.cm.Function;
import com.google.api.ads.adwords.axis.v201402.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201402.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201402.cm.OAuthInfo;
import com.google.api.ads.adwords.axis.v201402.cm.Operator;
import com.google.api.ads.adwords.axis.v201402.cm.PlacesLocationFeedData;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.rmi.RemoteException;

/**
 * This example adds a feed that syncs feed items from a Google
 * Places account and associates the feed with a customer.
 *
 * Credentials and properties in {@code fromFile()} are pulled from
 * the "ads.properties" file. See README for more info.
 *
 * Tags: CustomerFeedService.mutate, FeedItemService.mutate, FeedMappingService.mutate
 * Tags: FeedService.mutate
 *
 * Category: adx-exclude
 *
 * @author Josh Radcliff
 */
public class AddPlacesLocationExtensions {

  /**
   * The placeholder type for location extensions.
   * See the Placeholder reference page for a list of all the placeholder types and fields.
   *
   * https://developers.google.com/adwords/api/docs/appendix/placeholders
   */
  private static final int PLACEHOLDER_LOCATION = 7;

  /**
   * The maximum number of CustomerFeed ADD operation attempts to make before throwing
   * an exception.
   */
  private static final int MAX_CUSTOMER_FEED_ADD_ATTEMPTS = 10;

  public static void main(String[] args) throws Exception {

    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // that can be used in place of a service account.
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

    String placesEmailAddress = "INSERT_PLACES_EMAIL_ADDRESS_HERE";

    // To obtain an access token for your Places account, run the GetRefreshToken example with
    // the scope changed to "https://www.google.com/local/add" and capture the Credential's
    // access token.
    String placesAccessToken = "INSERT_PLACES_OAUTH_ACCESS_TOKEN_HERE";

    runExample(adWordsServices, session, placesEmailAddress, placesAccessToken);
  }

  private static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      String placesEmailAddress, String placesAccessToken) throws ApiException,
      RemoteException, InterruptedException {

    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);

    // Create a feed that will sync to the Google Places account specified
    // by placesEmailAddress. Do not add FeedAttributes to this object,
    // as AdWords will add them automatically because this will be a
    // system generated feed.
    Feed placesFeed = new Feed();
    placesFeed.setName("Places feed #" + System.currentTimeMillis());

    PlacesLocationFeedData feedData = new PlacesLocationFeedData();
    feedData.setEmailAddress(placesEmailAddress);
    OAuthInfo oAuthInfo = new OAuthInfo();
    oAuthInfo.setHttpMethod("GET");
    oAuthInfo.setHttpRequestUrl("https://www.google.com/local/add");
    oAuthInfo.setHttpAuthorizationHeader(String.format("Bearer %s", placesAccessToken));
    feedData.setOAuthInfo(oAuthInfo);

    placesFeed.setSystemFeedGenerationData(feedData);
    
    // Since this feed's feed items will be managed by AdWords,
    // you must set its origin to ADWORDS.
    placesFeed.setOrigin(FeedOrigin.ADWORDS);

    // Create an operation to add the feed.
    FeedOperation feedOperation = new FeedOperation();
    feedOperation.setOperand(placesFeed);
    feedOperation.setOperator(Operator.ADD);

    // Add the feed. Since it is a system generated feed, AdWords will automatically:
    // 1. Set up the FeedAttributes on the feed.
    // 2. Set up a FeedMapping that associates the FeedAttributes of the feed
    // with the placeholder fields of the LOCATION placeholder type.
    FeedReturnValue addFeedResult = feedService.mutate(new FeedOperation[] {feedOperation});
    Feed addedFeed = addFeedResult.getValue(0);
    System.out.printf("Added places feed with ID %d%n", addedFeed.getId());

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
    // for usage in a CustomerFeed until the sync between the AdWords and Places accounts
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
