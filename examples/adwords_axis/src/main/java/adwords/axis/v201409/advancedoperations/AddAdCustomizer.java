// Copyright 2014 Google Inc. All Rights Reserved.
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

package adwords.axis.v201409.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201409.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.AttributeFieldMapping;
import com.google.api.ads.adwords.axis.v201409.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201409.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201409.cm.CustomerFeed;
import com.google.api.ads.adwords.axis.v201409.cm.CustomerFeedOperation;
import com.google.api.ads.adwords.axis.v201409.cm.CustomerFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.Feed;
import com.google.api.ads.adwords.axis.v201409.cm.FeedAttribute;
import com.google.api.ads.adwords.axis.v201409.cm.FeedAttributeType;
import com.google.api.ads.adwords.axis.v201409.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201409.cm.FeedItemAdGroupTargeting;
import com.google.api.ads.adwords.axis.v201409.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201409.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201409.cm.FeedItemReturnValue;
import com.google.api.ads.adwords.axis.v201409.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201409.cm.FeedMappingOperation;
import com.google.api.ads.adwords.axis.v201409.cm.FeedMappingServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.FeedOperation;
import com.google.api.ads.adwords.axis.v201409.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201409.cm.Function;
import com.google.api.ads.adwords.axis.v201409.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201409.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201409.cm.Operator;
import com.google.api.ads.adwords.axis.v201409.cm.TextAd;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example adds an ad customizer feed and associates it with the customer. Then it adds an ad
 * that uses the feed to populate dynamic data.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: CustomerFeedService.mutate, FeedItemService.mutate, FeedMappingService.mutate
 * Tags: FeedService.mutate, AdGroupAdService.mutate
 *
 * @author Josh Radcliff
 */
public class AddAdCustomizer {

  // See the Placeholder reference page for a list of all the placeholder types and fields.
  // https://developers.google.com/adwords/api/docs/appendix/placeholders
  private static final int PLACEHOLDER_AD_CUSTOMIZER = 10;
  private static final int PLACEHOLDER_FIELD_PRICE = 3;
  private static final int PLACEHOLDER_FIELD_DATE = 4;
  private static final int PLACEHOLDER_FIELD_STRING = 5;

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupIds);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      List<Long> adGroupIds) throws Exception {

    // Create a customizer feed. One feed per account can be used for all ads.
    CustomizersDataHolder dataHolder = createCustomizerFeed(adWordsServices, session);
    
    // Create a feed mapping to map the fields with customizer IDs.
    createFeedMapping(adWordsServices, session, dataHolder);
    
    // Add feed items containing the values we'd like to place in ads.
    createCustomizerFeedItems(adWordsServices, session, adGroupIds, dataHolder);
    
    // Create a customer (account-level) feed with a matching function that determines
    // when to use this feed. For this case we use the "IDENTITY" matching function that is always
    // true just to associate this feed with the customer. The targeting is done within the feed
    // items using the campaignTargeting, adGroupTargeting, or keywordTargeting attributes.
    createCustomerFeed(adWordsServices, session, dataHolder);
    
    // All set! We can now create ads with customizations.
    createAdsWithCustomizations(adWordsServices, session, adGroupIds);
  }

  /**
   * Creates a new Feed for ad customizers.
   *
   * @return A new CustomizersDataHolder, populated with the feed ID and attribute IDs of the new
   *         Feed.
   */
  private static CustomizersDataHolder createCustomizerFeed(AdWordsServices adWordsServices,
      AdWordsSession session) throws Exception {
    // Get the FeedService.
    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);
  
    Feed customizerFeed = new Feed();
    customizerFeed.setName("CustomizerFeed");
  
    FeedAttribute nameAttribute = new FeedAttribute();
    nameAttribute.setName("Name");
    nameAttribute.setType(FeedAttributeType.STRING);
    
    FeedAttribute priceAttribute = new FeedAttribute();
    priceAttribute.setName("Price");
    priceAttribute.setType(FeedAttributeType.STRING);
    
    FeedAttribute dateAttribute = new FeedAttribute();
    dateAttribute.setName("Date");
    dateAttribute.setType(FeedAttributeType.DATE_TIME);
  
    customizerFeed.setAttributes(
        new FeedAttribute[] {nameAttribute, priceAttribute, dateAttribute});
  
    FeedOperation feedOperation = new FeedOperation();
    feedOperation.setOperand(customizerFeed);
    feedOperation.setOperator(Operator.ADD);
  
    Feed addedFeed = feedService.mutate(new FeedOperation[] {feedOperation}).getValue()[0];
  
    CustomizersDataHolder dataHolder = new CustomizersDataHolder();
    dataHolder.customizersFeedId = addedFeed.getId();
    dataHolder.nameFeedAttributeId = addedFeed.getAttributes(0).getId();
    dataHolder.priceFeedAttributeId = addedFeed.getAttributes(1).getId();
    dataHolder.dateFeedAttributeId = addedFeed.getAttributes(2).getId();
  
    System.out.printf("Feed with name '%s' and ID %d was added with:%n", addedFeed.getName(),
        dataHolder.customizersFeedId);
    System.out.printf("  Name attribute ID %d%n", dataHolder.nameFeedAttributeId);
    System.out.printf("  Price attribute ID %d%n", dataHolder.priceFeedAttributeId);
    System.out.printf("  Date attribute ID %d%n", dataHolder.dateFeedAttributeId);
  
    return dataHolder;
  }

  /**
   * Creates a new FeedMapping that indicates how the data holder's feed should be interpreted
   * in the context of ad customizers.
   */
  private static void createFeedMapping(AdWordsServices adWordsServices, AdWordsSession session,
      CustomizersDataHolder dataHolder) throws Exception {
    // Get the FeedMappingService.
    FeedMappingServiceInterface feedMappingService = adWordsServices.get(session, 
        FeedMappingServiceInterface.class);
    
    FeedMapping feedMapping = new FeedMapping();
    feedMapping.setFeedId(dataHolder.customizersFeedId);
    feedMapping.setPlaceholderType(PLACEHOLDER_AD_CUSTOMIZER);
    
    List<AttributeFieldMapping> attributeFieldMappings = Lists.newArrayList();
    attributeFieldMappings.add(
        new AttributeFieldMapping(dataHolder.nameFeedAttributeId, PLACEHOLDER_FIELD_STRING));
    attributeFieldMappings.add(
        new AttributeFieldMapping(dataHolder.priceFeedAttributeId, PLACEHOLDER_FIELD_PRICE));
    attributeFieldMappings.add(
        new AttributeFieldMapping(dataHolder.dateFeedAttributeId, PLACEHOLDER_FIELD_DATE));
    
    feedMapping.setAttributeFieldMappings(
        attributeFieldMappings.toArray(new AttributeFieldMapping[attributeFieldMappings.size()]));
    
    FeedMappingOperation feedMappingOperation = new FeedMappingOperation();
    feedMappingOperation.setOperand(feedMapping);
    feedMappingOperation.setOperator(Operator.ADD);
    
    FeedMapping addedFeedMapping =
        feedMappingService.mutate(new FeedMappingOperation[] {feedMappingOperation}).getValue(0);
    
    System.out.printf(
        "Feed mapping with ID %d and placeholder type %d was added " + "for feed with ID %d.%n",
        addedFeedMapping.getFeedMappingId(), addedFeedMapping.getPlaceholderType(),
        addedFeedMapping.getFeedId());
  }

  /**
   * Creates FeedItems with the values to use in ad customizations for each ad group in
   * <code>adGroupIds</code>.
   */
  private static void createCustomizerFeedItems(AdWordsServices adWordsServices,
      AdWordsSession session, List<Long> adGroupIds, CustomizersDataHolder dataHolder)
      throws Exception {
    // Get the FeedItemService.
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);

    List<FeedItemOperation> feedItemOperations = Lists.newArrayList();
    feedItemOperations.add(createFeedItemAddOperation("Mars", "$1234.56", "20140601 000000",
        adGroupIds.get(0), dataHolder));
    feedItemOperations.add(createFeedItemAddOperation("Venus", "$1450.00", "20140615 120000",
        adGroupIds.get(1), dataHolder));

    FeedItemReturnValue feedItemReturnValue = feedItemService.mutate(
        feedItemOperations.toArray(new FeedItemOperation[feedItemOperations.size()]));

    for (FeedItem addedFeedItem : feedItemReturnValue.getValue()) {
      System.out.printf("Added feed item with ID %d.%n", addedFeedItem.getFeedItemId());
      dataHolder.customizerFeedItemIds.add(addedFeedItem.getFeedItemId());
    }
  }

  /**
   * Creates a FeedItemOperation that will create a FeedItem with the specified values and
   * ad group target when sent to FeedItemService.mutate.
   * 
   * @param name the value for the name attribute of the FeedItem
   * @param price the value for the price attribute of the FeedItem
   * @param date the value for the date attribute of the FeedItem
   * @param adGroupId the ID of the ad group to target with the FeedItem
   * @param dataHolder the data holder that contains metadata about the customizer Feed
   * @return a new FeedItemOperation for adding a FeedItem
   */
  private static FeedItemOperation createFeedItemAddOperation(String name, String price,
      String date, Long adGroupId, CustomizersDataHolder dataHolder) {
    
    FeedItem feedItem = new FeedItem();
    feedItem.setFeedId(dataHolder.customizersFeedId);
    List<FeedItemAttributeValue> attributeValues = Lists.newArrayList();
    
    FeedItemAttributeValue nameAttributeValue = new FeedItemAttributeValue();
    nameAttributeValue.setFeedAttributeId(dataHolder.nameFeedAttributeId);
    nameAttributeValue.setStringValue(name);
    attributeValues.add(nameAttributeValue);
    
    FeedItemAttributeValue priceAttributeValue = new FeedItemAttributeValue();
    priceAttributeValue.setFeedAttributeId(dataHolder.priceFeedAttributeId);
    priceAttributeValue.setStringValue(price);
    attributeValues.add(priceAttributeValue);
    
    FeedItemAttributeValue dateAttributeValue = new FeedItemAttributeValue();
    dateAttributeValue.setFeedAttributeId(dataHolder.dateFeedAttributeId);
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
   * Creates a CustomerFeed that will associate the data holder's Feed with the ad customizers
   * placeholder type.
   */
  private static void createCustomerFeed(AdWordsServices adWordsServices, AdWordsSession session,
      CustomizersDataHolder dataHolder) throws Exception {
    // Get the CustomerFeedService.
    CustomerFeedServiceInterface customerFeedService =
        adWordsServices.get(session, CustomerFeedServiceInterface.class);
    
    CustomerFeed customerFeed = new CustomerFeed();
    customerFeed.setFeedId(dataHolder.customizersFeedId);
    customerFeed.setPlaceholderTypes(new int[] {PLACEHOLDER_AD_CUSTOMIZER});
    
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
  
    CustomerFeed addedCustomerFeed =
        customerFeedService.mutate(new CustomerFeedOperation[] {customerFeedOperation}).getValue(0);
    
    System.out.printf("Customer feed for feed ID %d was added.%n", addedCustomerFeed.getFeedId());
  }

  /**
   * Creates text ads that use ad customizations for the specified ad group IDs.
   */
  private static void createAdsWithCustomizations(AdWordsServices adWordsServices,
      AdWordsSession session, List<Long> adGroupIds) throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    TextAd textAd = new TextAd();
    textAd.setHeadline("Luxury Cruise to {=CustomizerFeed.Name}");
    textAd.setDescription1("Only {=CustomizerFeed.Price}");
    textAd.setDescription2("Offer ends in {=countdown(CustomizerFeed.Date)}!");
    textAd.setUrl("http://www.example.com");
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

  /**
   * A container for metadata related to an ad customizers feed.
   */
  private static class CustomizersDataHolder {
    private Long customizersFeedId;
    private Long nameFeedAttributeId;
    private Long priceFeedAttributeId;
    private Long dateFeedAttributeId;
    private List<Long> customizerFeedItemIds = Lists.newArrayList();
  }
}
