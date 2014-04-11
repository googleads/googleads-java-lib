// Copyright 2013 Google Inc. All Rights Reserved.
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

package adwords.axis.utility.extension.advancedoperations;

import com.google.api.ads.adwords.axis.utility.extension.ExtendedManagedCustomer;
import com.google.api.ads.adwords.axis.v201402.cm.AttributeFieldMapping;
import com.google.api.ads.adwords.axis.v201402.cm.CampaignFeed;
import com.google.api.ads.adwords.axis.v201402.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201402.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201402.cm.Feed;
import com.google.api.ads.adwords.axis.v201402.cm.FeedAttribute;
import com.google.api.ads.adwords.axis.v201402.cm.FeedAttributeType;
import com.google.api.ads.adwords.axis.v201402.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201402.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201402.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201402.cm.FeedOrigin;
import com.google.api.ads.adwords.axis.v201402.cm.Function;
import com.google.api.ads.adwords.axis.v201402.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201402.cm.FunctionOperand;
import com.google.api.ads.adwords.axis.v201402.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201402.cm.RequestContextOperand;
import com.google.api.ads.adwords.axis.v201402.cm.RequestContextOperandContextType;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * This example adds a sitelinks feed and associates it with a campaign.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: CampaignFeedService.mutate, FeedItemService.mutate, FeedMappingService.mutate
 * Tags: FeedService.mutate
 *
 * @author Kevin Winter
 * @author Julian Toledo
 */
public class AddSiteLinks {

  public static void main(String[] args) throws Exception {
    // Creating ExtendedManagedCustomer using OAuth2 credentials form file
    ExtendedManagedCustomer extendedManagedCustomer = ExtendedManagedCustomer.withOAuth2FromFile();

    // Campaign must be enhanced.
    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");
    
    runExample(extendedManagedCustomer, campaignId);
  }

  public static void runExample(
      ExtendedManagedCustomer extendedManagedCustomer, Long campaignId) throws Exception {
    SiteLinksDataHolder siteLinksData = new SiteLinksDataHolder();
    createSiteLinksFeed(extendedManagedCustomer, siteLinksData);
    createSiteLinksFeedItems(extendedManagedCustomer, siteLinksData);
    createSiteLinksFeedMapping(extendedManagedCustomer, siteLinksData);
    createSiteLinksCampaignFeed(extendedManagedCustomer, siteLinksData, campaignId);
  }

  private static void createSiteLinksFeed(
      ExtendedManagedCustomer extendedManagedCustomer, SiteLinksDataHolder siteLinksData)
      throws Exception {

    // Create attributes.
    FeedAttribute textAttribute = new FeedAttribute();
    textAttribute.setType(FeedAttributeType.STRING);
    textAttribute.setName("Link Text");
    FeedAttribute urlAttribute = new FeedAttribute();
    urlAttribute.setType(FeedAttributeType.URL);
    urlAttribute.setName("Link URL");

    // Create the feed.
    Feed siteLinksFeed = new Feed();
    siteLinksFeed.setName("Feed For Site Links");
    siteLinksFeed.setAttributes(new FeedAttribute[] {textAttribute, urlAttribute});
    siteLinksFeed.setOrigin(FeedOrigin.USER);

    Feed savedFeed = extendedManagedCustomer.insertFeed(siteLinksFeed);
    siteLinksData.siteLinksFeedId = savedFeed.getId();
    FeedAttribute[] savedAttributes = savedFeed.getAttributes();
    siteLinksData.linkTextFeedAttributeId = savedAttributes[0].getId();
    siteLinksData.linkUrlFeedAttributeId = savedAttributes[1].getId();
    System.out.printf("Feed with name '%s' and ID '%d' with linkTextAttributeId '%d'"
        + " and linkUrlAttributeId '%s' was created.\n", savedFeed.getName(), savedFeed.getId(),
        savedAttributes[0].getId(), savedAttributes[1].getId());
  }

  private static void createSiteLinksFeedItems(
      ExtendedManagedCustomer extendedManagedCustomer, SiteLinksDataHolder siteLinksData)
      throws Exception {

    // Create operations to add FeedItems.
    List<FeedItem> feedItems = Lists.newArrayList();
    feedItems.add(newSiteLinkFeedItem(siteLinksData, "Home", "http://www.example.com"));
    feedItems.add(newSiteLinkFeedItem(siteLinksData, "Stores", "http://www.example.com/stores"));
    feedItems.add(newSiteLinkFeedItem(siteLinksData, "On Sale", "http://www.example.com/sale"));
    feedItems.add(newSiteLinkFeedItem(siteLinksData, "Support", "http://www.example.com/support"));
    feedItems.add(newSiteLinkFeedItem(siteLinksData, "Products", "http://www.example.com/prods"));
    feedItems.add(newSiteLinkFeedItem(siteLinksData, "About Us", "http://www.example.com/about"));

    List<FeedItem> savedFeedItems = extendedManagedCustomer.insertFeedItems(feedItems);
    for (FeedItem item : savedFeedItems) {
      System.out.printf("FeedItem with feedItemId '%d' was added.\n", item.getFeedItemId());
      siteLinksData.siteLinkFeedItemIds.add(item.getFeedItemId());
    }
  }

  // See the Placeholder reference page for a list of all the placeholder types and fields.
  // https://developers.google.com/adwords/api/docs/appendix/placeholders
  private static final int PLACEHOLDER_SITELINKS = 1;

  // See the Placeholder reference page for a list of all the placeholder types and fields.
  // https://developers.google.com/adwords/api/docs/appendix/placeholders
  private static final int PLACEHOLDER_FIELD_SITELINK_LINK_TEXT = 1;
  private static final int PLACEHOLDER_FIELD_SITELINK_URL = 2;

  private static void createSiteLinksFeedMapping(
      ExtendedManagedCustomer extendedManagedCustomer, SiteLinksDataHolder siteLinksData)
      throws Exception {

    // Map the FeedAttributeIds to the fieldId constants.
    AttributeFieldMapping linkTextFieldMapping = new AttributeFieldMapping();
    linkTextFieldMapping.setFeedAttributeId(siteLinksData.linkTextFeedAttributeId);
    linkTextFieldMapping.setFieldId(PLACEHOLDER_FIELD_SITELINK_LINK_TEXT);
    AttributeFieldMapping linkUrlFieldMapping = new AttributeFieldMapping();
    linkUrlFieldMapping.setFeedAttributeId(siteLinksData.linkUrlFeedAttributeId);
    linkUrlFieldMapping.setFieldId(PLACEHOLDER_FIELD_SITELINK_URL);

    // Create the FieldMapping and operation.
    FeedMapping feedMapping = new FeedMapping();
    feedMapping.setPlaceholderType(PLACEHOLDER_SITELINKS);
    feedMapping.setFeedId(siteLinksData.siteLinksFeedId);
    feedMapping.setAttributeFieldMappings(
        new AttributeFieldMapping[] {linkTextFieldMapping, linkUrlFieldMapping});

    FeedMapping savedFeedMapping = extendedManagedCustomer.insertFeedMapping(feedMapping);
    System.out.printf(
        "Feed mapping with ID %d and placeholderType '%d' was saved for feed with ID %d.\n",
        savedFeedMapping.getFeedMappingId(), savedFeedMapping.getPlaceholderType(),
        savedFeedMapping.getFeedId());
  }

  private static void createSiteLinksCampaignFeed(ExtendedManagedCustomer extendedManagedCustomer,
      SiteLinksDataHolder siteLinksData, Long campaignId) throws Exception {

    RequestContextOperand requestContextOperand = new RequestContextOperand();
    requestContextOperand.setContextType(RequestContextOperandContextType.FEED_ITEM_ID);

    Function feedItemFunction = new Function();
    feedItemFunction.setLhsOperand(new FunctionArgumentOperand[] {requestContextOperand});
    feedItemFunction.setOperator(FunctionOperator.IN);

    List<FunctionArgumentOperand> operands = new ArrayList<FunctionArgumentOperand>();
    for (long feedItemId : siteLinksData.siteLinkFeedItemIds) {
      ConstantOperand constantOperand = new ConstantOperand();
      constantOperand.setLongValue(feedItemId);
      constantOperand.setType(ConstantOperandConstantType.LONG);
      operands.add(constantOperand);
    }
    feedItemFunction.setRhsOperand(operands.toArray(new FunctionArgumentOperand[operands.size()]));

    // Optional: to target to a platform, define a function and 'AND' it with
    // the feed item ID link:
    RequestContextOperand platformRequestContextOperand = new RequestContextOperand();
    platformRequestContextOperand.setContextType(RequestContextOperandContextType.DEVICE_PLATFORM);

    ConstantOperand platformOperand = new ConstantOperand();
    platformOperand.setStringValue("Mobile");
    platformOperand.setType(ConstantOperandConstantType.STRING);

    Function platformFunction = new Function();
    platformFunction.setLhsOperand(new FunctionArgumentOperand[] {platformRequestContextOperand});
    platformFunction.setOperator(FunctionOperator.EQUALS);
    platformFunction.setRhsOperand(new FunctionArgumentOperand[] {platformOperand});

    // Combine the two functions using an AND operation.
    FunctionOperand feedItemFunctionOperand = new FunctionOperand();
    feedItemFunctionOperand.setValue(feedItemFunction);

    FunctionOperand platformFunctionOperand = new FunctionOperand();
    platformFunctionOperand.setValue(platformFunction);

    Function combinedFunction = new Function();
    combinedFunction.setOperator(FunctionOperator.AND);
    combinedFunction.setLhsOperand(new FunctionArgumentOperand[] {
        feedItemFunctionOperand, platformFunctionOperand});

    CampaignFeed campaignFeed = new CampaignFeed();
    campaignFeed.setFeedId(siteLinksData.siteLinksFeedId);
    campaignFeed.setCampaignId(campaignId);
    campaignFeed.setMatchingFunction(combinedFunction);
    // Specifying placeholder types on the CampaignFeed allows the same feed
    // to be used for different placeholders in different Campaigns.
    campaignFeed.setPlaceholderTypes(new int[] {PLACEHOLDER_SITELINKS});

    CampaignFeed savedCampaignFeed = extendedManagedCustomer.insertCampaignFeed(campaignFeed);
    System.out.printf("Campaign with ID '%d' was associated with feed with ID '%d'.\n",
        savedCampaignFeed.getCampaignId(), savedCampaignFeed.getFeedId());
  }

  private static FeedItem newSiteLinkFeedItem(
      SiteLinksDataHolder siteLinksData, String text, String url) {
    // Create the FeedItemAttributeValues for our text values.
    FeedItemAttributeValue linkTextAttributeValue = new FeedItemAttributeValue();
    linkTextAttributeValue.setFeedAttributeId(siteLinksData.linkTextFeedAttributeId);
    linkTextAttributeValue.setStringValue(text);
    FeedItemAttributeValue linkUrlAttributeValue = new FeedItemAttributeValue();
    linkUrlAttributeValue.setFeedAttributeId(siteLinksData.linkUrlFeedAttributeId);
    linkUrlAttributeValue.setStringValue(url);

    // Create the feed item and operation.
    FeedItem item = new FeedItem();
    item.setFeedId(siteLinksData.siteLinksFeedId);
    item.setAttributeValues(
        new FeedItemAttributeValue[] {linkTextAttributeValue, linkUrlAttributeValue});
    return item;
  }

  private static class SiteLinksDataHolder {
    private Long siteLinksFeedId;
    private Long linkTextFeedAttributeId;
    private Long linkUrlFeedAttributeId;
    private List<Long> siteLinkFeedItemIds = new ArrayList<Long>();
  }
}
