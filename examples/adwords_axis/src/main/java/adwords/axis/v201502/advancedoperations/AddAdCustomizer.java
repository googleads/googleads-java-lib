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

package adwords.axis.v201502.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201502.cm.AdCustomizerFeed;
import com.google.api.ads.adwords.axis.v201502.cm.AdCustomizerFeedAttribute;
import com.google.api.ads.adwords.axis.v201502.cm.AdCustomizerFeedAttributeType;
import com.google.api.ads.adwords.axis.v201502.cm.AdCustomizerFeedOperation;
import com.google.api.ads.adwords.axis.v201502.cm.AdCustomizerFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201502.cm.FeedItemAdGroupTargeting;
import com.google.api.ads.adwords.axis.v201502.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201502.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201502.cm.FeedItemReturnValue;
import com.google.api.ads.adwords.axis.v201502.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.Operator;
import com.google.api.ads.adwords.axis.v201502.cm.TextAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import org.joda.time.DateTime;

import java.util.List;

/**
 * This example adds an ad customizer feed and associates it with the customer. Then it adds an ad
 * that uses the feed to populate dynamic data.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddAdCustomizer {

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

    List<Long> adGroupIds = Lists.newArrayList( 
        Long.valueOf("INSERT_ADGROUP_ID_HERE"),
        Long.valueOf("INSERT_ADGROUP_ID_HERE"));
    String feedName = "INSERT_FEED_NAME_HERE";

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupIds, feedName);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      List<Long> adGroupIds, String feedName) throws Exception {
    // Create a customizer feed. One feed per account can be used for all ads.
    AdCustomizerFeed adCustomizerFeed = createCustomizerFeed(adWordsServices, session, feedName);

    // Add feed items containing the values we'd like to place in ads.
    createCustomizerFeedItems(adWordsServices, session, adGroupIds, adCustomizerFeed);

    // All set! We can now create ads with customizations.
    createAdsWithCustomizations(adWordsServices, session, adGroupIds, feedName);
  }

  /**
   * Creates a new AdCustomizerFeed.
   *
   * @param feedName the name of the new AdCustomizerFeed
   * @return The new AdCustomizerFeed
   */
  private static AdCustomizerFeed createCustomizerFeed(AdWordsServices adWordsServices,
      AdWordsSession session, String feedName) throws Exception {
    // Get the AdCustomizerFeedService.
    AdCustomizerFeedServiceInterface adCustomizerFeedService =
        adWordsServices.get(session, AdCustomizerFeedServiceInterface.class);

    AdCustomizerFeed customizerFeed = new AdCustomizerFeed();
    customizerFeed.setFeedName(feedName);

    AdCustomizerFeedAttribute nameAttribute = new AdCustomizerFeedAttribute();
    nameAttribute.setName("Name");
    nameAttribute.setType(AdCustomizerFeedAttributeType.STRING);

    AdCustomizerFeedAttribute priceAttribute = new AdCustomizerFeedAttribute();
    priceAttribute.setName("Price");
    priceAttribute.setType(AdCustomizerFeedAttributeType.STRING);

    AdCustomizerFeedAttribute dateAttribute = new AdCustomizerFeedAttribute();
    dateAttribute.setName("Date");
    dateAttribute.setType(AdCustomizerFeedAttributeType.DATE_TIME);

    customizerFeed.setFeedAttributes(
        new AdCustomizerFeedAttribute[] {nameAttribute, priceAttribute, dateAttribute});

    AdCustomizerFeedOperation feedOperation = new AdCustomizerFeedOperation();
    feedOperation.setOperand(customizerFeed);
    feedOperation.setOperator(Operator.ADD);

    AdCustomizerFeed addedFeed = adCustomizerFeedService.mutate(
        new AdCustomizerFeedOperation[] {feedOperation}).getValue()[0];

    System.out.printf("Created ad customizer feed with ID %d and name '%s'.%n",
        addedFeed.getFeedId(), addedFeed.getFeedName());

    return addedFeed;
  }

  /**
   * Creates FeedItems with the values to use in ad customizations for each ad group in
   * <code>adGroupIds</code>.
   */
  private static void createCustomizerFeedItems(AdWordsServices adWordsServices,
      AdWordsSession session, List<Long> adGroupIds, AdCustomizerFeed adCustomizerFeed)
      throws Exception {
    // Get the FeedItemService.
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);

    List<FeedItemOperation> feedItemOperations = Lists.newArrayList();

    DateTime now = new DateTime();

    DateTime marsDate = new DateTime(now.getYear(), now.getMonthOfYear(), 1, 0, 0);
    feedItemOperations.add(createFeedItemAddOperation("Mars", "$1234.56",
        marsDate.toString("yyyyMMdd HHmmss"), adGroupIds.get(0), adCustomizerFeed));

    DateTime venusDate = new DateTime(now.getYear(), now.getMonthOfYear(), 15, 0, 0);
    feedItemOperations.add(createFeedItemAddOperation("Venus", "$1450.00",
        venusDate.toString("yyyyMMdd HHmmss"), adGroupIds.get(1), adCustomizerFeed));

    FeedItemReturnValue feedItemReturnValue = feedItemService.mutate(
        feedItemOperations.toArray(new FeedItemOperation[feedItemOperations.size()]));

    for (FeedItem addedFeedItem : feedItemReturnValue.getValue()) {
      System.out.printf("Added feed item with ID %d.%n", addedFeedItem.getFeedItemId());
    }
  }

  /**
   * Creates a FeedItemOperation that will create a FeedItem with the specified values and ad group
   * target when sent to FeedItemService.mutate.
   *
   * @param name the value for the name attribute of the FeedItem
   * @param price the value for the price attribute of the FeedItem
   * @param date the value for the date attribute of the FeedItem
   * @param adGroupId the ID of the ad group to target with the FeedItem
   * @param adCustomizerFeed the customizer feed
   * @return a new FeedItemOperation for adding a FeedItem
   */
  private static FeedItemOperation createFeedItemAddOperation(String name, String price,
      String date, Long adGroupId, AdCustomizerFeed adCustomizerFeed) {

    FeedItem feedItem = new FeedItem();
    feedItem.setFeedId(adCustomizerFeed.getFeedId());

    List<FeedItemAttributeValue> attributeValues = Lists.newArrayList();

    // FeedAttributes appear in the same order as they were created - Name, Price, Date.
    // See the createCustomizerFeed method for details.
    FeedItemAttributeValue nameAttributeValue = new FeedItemAttributeValue();
    nameAttributeValue.setFeedAttributeId(adCustomizerFeed.getFeedAttributes(0).getId());
    nameAttributeValue.setStringValue(name);
    attributeValues.add(nameAttributeValue);

    FeedItemAttributeValue priceAttributeValue = new FeedItemAttributeValue();
    priceAttributeValue.setFeedAttributeId(adCustomizerFeed.getFeedAttributes(1).getId());
    priceAttributeValue.setStringValue(price);
    attributeValues.add(priceAttributeValue);

    FeedItemAttributeValue dateAttributeValue = new FeedItemAttributeValue();
    dateAttributeValue.setFeedAttributeId(adCustomizerFeed.getFeedAttributes(2).getId());
    dateAttributeValue.setStringValue(date);
    attributeValues.add(dateAttributeValue);

    feedItem.setAttributeValues(
        attributeValues.toArray(new FeedItemAttributeValue[attributeValues.size()]));

    feedItem.setAdGroupTargeting(new FeedItemAdGroupTargeting(adGroupId));

    FeedItemOperation feedItemOperation = new FeedItemOperation();
    feedItemOperation.setOperand(feedItem);
    feedItemOperation.setOperator(Operator.ADD);

    return feedItemOperation;
  }

  /**
   * Creates text ads that use ad customizations for the specified ad group IDs.
   */
  private static void createAdsWithCustomizations(AdWordsServices adWordsServices,
      AdWordsSession session, List<Long> adGroupIds, String feedName) throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    TextAd textAd = new TextAd();
    textAd.setHeadline(String.format("Luxury Cruise to {=%s.Name}", feedName));
    textAd.setDescription1(String.format("Only {=%s.Price}", feedName));
    textAd.setDescription2(String.format("Offer ends in {=countdown(%s.Date)}!", feedName));
    textAd.setFinalUrls(new String[] {"http://www.example.com"});
    textAd.setDisplayUrl("www.example.com");

    // We add the same ad to both ad groups. When they serve, they will show different values, since
    // they match different feed items.
    List<AdGroupAdOperation> adGroupAdOperations = Lists.newArrayList();
    for (Long adGroupId : adGroupIds) {
      AdGroupAd adGroupAd = new AdGroupAd();
      adGroupAd.setAdGroupId(adGroupId);
      adGroupAd.setAd(textAd);

      AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
      adGroupAdOperation.setOperand(adGroupAd);
      adGroupAdOperation.setOperator(Operator.ADD);

      adGroupAdOperations.add(adGroupAdOperation);
    }

    AdGroupAdReturnValue adGroupAdReturnValue = adGroupAdService.mutate(
        adGroupAdOperations.toArray(new AdGroupAdOperation[adGroupAdOperations.size()]));

    for (AdGroupAd addedAd : adGroupAdReturnValue.getValue()) {
      System.out.printf("Created an ad with ID %d, type '%s' and status '%s'.%n",
          addedAd.getAd().getId(), addedAd.getAd().getAdType(), addedAd.getStatus());
    }
  }
}
