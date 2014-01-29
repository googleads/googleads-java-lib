// Copyright 2013 Google Inc. All Rights Reserved.
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

package adwords.axis.v201306.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201306.cm.AttributeFieldMapping;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignFeed;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignFeedOperation;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignFeedReturnValue;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201306.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201306.cm.Feed;
import com.google.api.ads.adwords.axis.v201306.cm.FeedAttribute;
import com.google.api.ads.adwords.axis.v201306.cm.FeedAttributeType;
import com.google.api.ads.adwords.axis.v201306.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201306.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201306.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201306.cm.FeedItemReturnValue;
import com.google.api.ads.adwords.axis.v201306.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201306.cm.FeedMappingOperation;
import com.google.api.ads.adwords.axis.v201306.cm.FeedMappingReturnValue;
import com.google.api.ads.adwords.axis.v201306.cm.FeedMappingServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.FeedOperation;
import com.google.api.ads.adwords.axis.v201306.cm.FeedOrigin;
import com.google.api.ads.adwords.axis.v201306.cm.FeedReturnValue;
import com.google.api.ads.adwords.axis.v201306.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.Function;
import com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201306.cm.FunctionOperand;
import com.google.api.ads.adwords.axis.v201306.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201306.cm.Operator;
import com.google.api.ads.adwords.axis.v201306.cm.RequestContextOperand;
import com.google.api.ads.adwords.axis.v201306.cm.RequestContextOperandContextType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

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
 * Category: adx-exclude
 *
 * @author Kevin Winter
 */
public class AddSiteLinks {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    // Campaign must be enhanced.
    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long campaignId) throws Exception {
    SiteLinksDataHolder siteLinksData = new SiteLinksDataHolder();
    createSiteLinksFeed(adWordsServices, session, siteLinksData);
    createSiteLinksFeedItems(adWordsServices, session, siteLinksData);
    createSiteLinksFeedMapping(adWordsServices, session, siteLinksData);
    createSiteLinksCampaignFeed(adWordsServices, session, siteLinksData, campaignId);
  }

  private static void createSiteLinksFeed(
      AdWordsServices adWordsServices, AdWordsSession session, SiteLinksDataHolder siteLinksData)
      throws Exception {
    // Get the FeedService.
    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);

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

    // Create operation.
    FeedOperation operation = new FeedOperation();
    operation.setOperand(siteLinksFeed);
    operation.setOperator(Operator.ADD);

    // Add the feed.
    FeedReturnValue result = feedService.mutate(new FeedOperation[] {operation});

    Feed savedFeed = result.getValue()[0];
    siteLinksData.siteLinksFeedId = savedFeed.getId();
    FeedAttribute[] savedAttributes = savedFeed.getAttributes();
    siteLinksData.linkTextFeedAttributeId = savedAttributes[0].getId();
    siteLinksData.linkUrlFeedAttributeId = savedAttributes[1].getId();
    System.out.printf("Feed with name %s and ID %d with linkTextAttributeId %d"
        + " and linkUrlAttributeId %s was created.\n", savedFeed.getName(), savedFeed.getId(),
        savedAttributes[0].getId(), savedAttributes[1].getId());
  }

  private static void createSiteLinksFeedItems(
      AdWordsServices adWordsServices, AdWordsSession session, SiteLinksDataHolder siteLinksData)
      throws Exception {
    // Get the FeedItemService.
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);

    // Create operations to add FeedItems.
    FeedItemOperation home =
        newSiteLinkFeedItemAddOperation(siteLinksData, "Home", "http://www.example.com");
    FeedItemOperation stores =
        newSiteLinkFeedItemAddOperation(siteLinksData, "Stores", "http://www.example.com/stores");
    FeedItemOperation onSale =
        newSiteLinkFeedItemAddOperation(siteLinksData, "On Sale", "http://www.example.com/sale");
    FeedItemOperation support =
        newSiteLinkFeedItemAddOperation(siteLinksData, "Support", "http://www.example.com/support");
    FeedItemOperation products =
        newSiteLinkFeedItemAddOperation(siteLinksData, "Products", "http://www.example.com/prods");
    FeedItemOperation aboutUs =
        newSiteLinkFeedItemAddOperation(siteLinksData, "About Us", "http://www.example.com/about");

    FeedItemOperation[] operations =
        new FeedItemOperation[] {home, stores, onSale, support, products, aboutUs};

    FeedItemReturnValue result = feedItemService.mutate(operations);
    for (FeedItem item : result.getValue()) {
      System.out.printf("FeedItem with feedItemId %d was added.\n", item.getFeedItemId());
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
      AdWordsServices adWordsServices, AdWordsSession session, SiteLinksDataHolder siteLinksData)
      throws Exception {
    // Get the FeedItemService.
    FeedMappingServiceInterface feedMappingService =
        adWordsServices.get(session, FeedMappingServiceInterface.class);

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
    FeedMappingOperation operation = new FeedMappingOperation();
    operation.setOperand(feedMapping);
    operation.setOperator(Operator.ADD);

    // Save the field mapping.
    FeedMappingReturnValue result =
        feedMappingService.mutate(new FeedMappingOperation[] {operation});
    for (FeedMapping savedFeedMapping : result.getValue()) {
      System.out.printf(
          "Feed mapping with ID %d and placeholderType %d was saved for feed with ID %d.\n",
          savedFeedMapping.getFeedMappingId(), savedFeedMapping.getPlaceholderType(),
          savedFeedMapping.getFeedId());
    }
  }

  private static void createSiteLinksCampaignFeed(AdWordsServices adWordsServices,
      AdWordsSession session, SiteLinksDataHolder siteLinksData, Long campaignId) throws Exception {
    // Get the CampaignFeedService.
    CampaignFeedServiceInterface campaignFeedService =
        adWordsServices.get(session, CampaignFeedServiceInterface.class);

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

    CampaignFeedOperation operation = new CampaignFeedOperation();
    operation.setOperand(campaignFeed);
    operation.setOperator(Operator.ADD);
    CampaignFeedReturnValue result =
        campaignFeedService.mutate(new CampaignFeedOperation[] {operation});
    for (CampaignFeed savedCampaignFeed : result.getValue()) {
      System.out.printf("Campaign with ID %d was associated with feed with ID %d.\n",
          savedCampaignFeed.getCampaignId(), savedCampaignFeed.getFeedId());
    }
  }

  private static FeedItemOperation newSiteLinkFeedItemAddOperation(
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
    FeedItemOperation operation = new FeedItemOperation();
    operation.setOperand(item);
    operation.setOperator(Operator.ADD);
    return operation;
  }

  private static class SiteLinksDataHolder {
    private Long siteLinksFeedId;
    private Long linkTextFeedAttributeId;
    private Long linkUrlFeedAttributeId;
    private List<Long> siteLinkFeedItemIds = new ArrayList<Long>();
  }
}
