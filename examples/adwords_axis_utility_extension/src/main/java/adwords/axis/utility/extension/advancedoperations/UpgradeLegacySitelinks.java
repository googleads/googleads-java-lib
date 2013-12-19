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
import com.google.api.ads.adwords.axis.v201306.cm.AttributeFieldMapping;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignAdExtension;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignAdExtensionStatus;
import com.google.api.ads.adwords.axis.v201306.cm.CampaignFeed;
import com.google.api.ads.adwords.axis.v201306.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201306.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201306.cm.Feed;
import com.google.api.ads.adwords.axis.v201306.cm.FeedAttribute;
import com.google.api.ads.adwords.axis.v201306.cm.FeedAttributeType;
import com.google.api.ads.adwords.axis.v201306.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201306.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201306.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201306.cm.FeedOrigin;
import com.google.api.ads.adwords.axis.v201306.cm.Function;
import com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201306.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201306.cm.Predicate;
import com.google.api.ads.adwords.axis.v201306.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201306.cm.RequestContextOperand;
import com.google.api.ads.adwords.axis.v201306.cm.RequestContextOperandContextType;
import com.google.api.ads.adwords.axis.v201306.cm.Selector;
import com.google.api.ads.adwords.axis.v201306.cm.Sitelink;
import com.google.api.ads.adwords.axis.v201306.cm.SitelinksExtension;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * This example migrates legacy sitelinks to upgraded sitelinks for a given list
 * of campaigns. The campaigns must be upgraded to enhanced campaigns before you
 * can run this example. To upgrade a campaign to enhanced, run
 * campaignmanagement/SetCampaignEnhanced.java. To get all campaigns, run
 * basicoperations/GetCampaigns.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CampaignAdExtensionService.get, CampaignAdExtensionService.mutate
 * Tags: FeedService.mutate, FeedItemService.mutate, FeedMappingService.mutate
 * Tags: CampaignFeedService.mutate
 *
 * @author Anash P. Oommen
 * @author Julian Toledo
 */
public class UpgradeLegacySitelinks {

  /**
   * Data structure to hold details about a Sitelink feed.
   */
  private static class SiteLinksFeed {
    /**
     * Feed id.
     */
    private Long siteLinksFeedId;

    /**
     * Attribute id for sitelink text.
     */
    private Long linkTextFeedAttributeId;

    /**
     * Attribute id for sitelink url.
     */
    private Long linkUrlFeedAttributeId;
  }

  // See https://developers.google.com/adwords/api/docs/appendix/placeholders
  // for a list of all the placeholder types and fields.
  private static final int PLACEHOLDER_SITELINKS = 1;

  // See https://developers.google.com/adwords/api/docs/appendix/placeholders
  // for a list of all the placeholder types and fields.
  private static final int PLACEHOLDER_FIELD_SITELINK_LINK_TEXT = 1;
  private static final int PLACEHOLDER_FIELD_SITELINK_URL = 2;

  public static void main(String[] args) throws Exception {
    // Creating ExtendedManagedCustomer using OAuth2 credentials form file
    ExtendedManagedCustomer extendedManagedCustomer = ExtendedManagedCustomer.withOAuth2FromFile();

    long[] campaignIds = new long[] {
        Long.parseLong("INSERT_CAMPAIGN_ID_HERE"), Long.parseLong("INSERT_CAMPAIGN_ID_HERE")};

    runExample(extendedManagedCustomer, campaignIds);
  }

  public static void runExample(ExtendedManagedCustomer extendedManagedCustomer,
      long[] campaignIds) throws Exception {

    // Try to retrieve an existing feed that has been mapped for use with
    // sitelinks. if multiple such feeds exist, the first matching feed is
    // retrieved. You could modify this code example to retrieve all the feeds
    // and pick the appropriate feed based on user input.
    SiteLinksFeed siteLinksFeed = getExistingFeed(extendedManagedCustomer);

    if (siteLinksFeed == null) {
      // Create a feed for storing sitelinks.
      siteLinksFeed = createSiteLinksFeed(extendedManagedCustomer);

      // Map the feed for using with sitelinks.
      createSiteLinksFeedMapping(extendedManagedCustomer, siteLinksFeed);
    }

    for (long campaignId : campaignIds) {
      // Get legacy sitelinks for the campaign.
      CampaignAdExtension extension =
          getLegacySitelinksForCampaign(extendedManagedCustomer, campaignId);
      if (extension != null) {
        // Get the sitelinks.
        Sitelink[] legacySitelinks =
            ((SitelinksExtension) extension.getAdExtension()).getSitelinks();

        // Add the sitelinks to the feed.
        List<Long> siteLinkFeedItemIds =
            createSiteLinkFeedItems(extendedManagedCustomer, siteLinksFeed, legacySitelinks);

        // Associate feeditems to the campaign.
        associateSitelinkFeedItemsWithCampaign(
            extendedManagedCustomer, siteLinksFeed, siteLinkFeedItemIds, campaignId);

        // Once the upgraded sitelinks are added to a campaign, the legacy
        // sitelinks will stop serving. You can delete the legacy sitelinks
        // once you have verified that the migration went fine. In case the
        // migration didn't succeed, you can roll back the migration by deleting
        // the CampaignFeed you created in the previous step.
        deleteLegacySitelinks(extendedManagedCustomer, extension);
      }
    }
  }

  /**
   * Retrieve an existing feed that is mapped to hold sitelinks. The first active sitelinks feed is
   * retrieved by this method.
   *
   * @param extendedManagedCustomer
   * @return A {@link SiteLinksFeed} if a feed is found, or null otherwise.
   * @throws Exception if an error occurs when retrieving an existing feed.
   */
  private static SiteLinksFeed getExistingFeed(ExtendedManagedCustomer extendedManagedCustomer)
      throws Exception {
    Selector selector = new Selector();
    selector.setFields(new String[] {"FeedId", "FeedMappingId", "PlaceholderType", "Status",
        "AttributeFieldMappings"});

    Predicate placeHolderPredicate = new Predicate();
    placeHolderPredicate.setField("PlaceholderType");
    placeHolderPredicate.setOperator(PredicateOperator.EQUALS);
    placeHolderPredicate.setValues(new String[] {Integer.toString(PLACEHOLDER_SITELINKS)});

    Predicate statusPredicate = new Predicate();
    statusPredicate.setField("Status");
    statusPredicate.setOperator(PredicateOperator.EQUALS);
    statusPredicate.setValues(new String[] {"ACTIVE"});

    selector.setPredicates(new Predicate[] {placeHolderPredicate, statusPredicate});

    List<FeedMapping> list =
        extendedManagedCustomer.getDelegateLocator().getFeedMappingDelegate().get(selector);

    if (list != null && list.size() > 0) {
      for (FeedMapping feedMapping : list) {
        Long feedId = feedMapping.getFeedId();
        Long textAttributeId = null;
        Long urlAttributeId = null;
        for (AttributeFieldMapping attributeMapping : feedMapping.getAttributeFieldMappings()) {
          if (attributeMapping.getFieldId().intValue() == PLACEHOLDER_FIELD_SITELINK_LINK_TEXT) {
            textAttributeId = attributeMapping.getFeedAttributeId();
          } else if (attributeMapping.getFieldId().intValue() == PLACEHOLDER_FIELD_SITELINK_URL) {
            urlAttributeId = attributeMapping.getFeedAttributeId();
          }
        }

        if (feedId != null && textAttributeId != null && urlAttributeId != null) {
          SiteLinksFeed siteLinksFeed = new SiteLinksFeed();
          siteLinksFeed.siteLinksFeedId = feedId;
          siteLinksFeed.linkTextFeedAttributeId = textAttributeId;
          siteLinksFeed.linkUrlFeedAttributeId = urlAttributeId;
          return siteLinksFeed;
        }
      }
    }
    return null;
  }

  /**
   * Create a feed for holding upgraded sitelinks.
   *
   * @param extendedManagedCustomer
   * @return A {@link SiteLinksFeed} for holding the sitelinks.
   * @throws Exception if an error occurs when creating the feed.
   */
  private static SiteLinksFeed createSiteLinksFeed(ExtendedManagedCustomer extendedManagedCustomer)
      throws Exception {
    SiteLinksFeed siteLinksData = new SiteLinksFeed();

    // Create attributes.
    FeedAttribute textAttribute = new FeedAttribute();
    textAttribute.setType(FeedAttributeType.STRING);
    textAttribute.setName("Link Text");
    FeedAttribute urlAttribute = new FeedAttribute();
    urlAttribute.setType(FeedAttributeType.URL);
    urlAttribute.setName("Link URL");

    // Create the feed.
    Feed siteLinksFeed = new Feed();
    siteLinksFeed.setName("Feed For Sitelinks");
    siteLinksFeed.setAttributes(new FeedAttribute[] {textAttribute, urlAttribute});
    siteLinksFeed.setOrigin(FeedOrigin.USER);

    // Add the feed.
    Feed savedFeed = extendedManagedCustomer.insertFeed(siteLinksFeed);

    siteLinksData.siteLinksFeedId = savedFeed.getId();
    FeedAttribute[] savedAttributes = savedFeed.getAttributes();
    siteLinksData.linkTextFeedAttributeId = savedAttributes[0].getId();
    siteLinksData.linkUrlFeedAttributeId = savedAttributes[1].getId();
    return siteLinksData;
  }

  /**
   * Map the feed for use with Sitelinks.
   *
   * @param extendedManagedCustomer
   * @param siteLinksFeed The feed for holding sitelinks.
   * @throws Exception if an error occurs when mapping the feed for sitelinks.
   */
  private static void createSiteLinksFeedMapping(ExtendedManagedCustomer extendedManagedCustomer,
      SiteLinksFeed siteLinksFeed) throws Exception {
    // Map the FeedAttributeIds to the fieldId constants.
    AttributeFieldMapping linkTextFieldMapping = new AttributeFieldMapping();
    linkTextFieldMapping.setFeedAttributeId(siteLinksFeed.linkTextFeedAttributeId);
    linkTextFieldMapping.setFieldId(PLACEHOLDER_FIELD_SITELINK_LINK_TEXT);
    AttributeFieldMapping linkUrlFieldMapping = new AttributeFieldMapping();
    linkUrlFieldMapping.setFeedAttributeId(siteLinksFeed.linkUrlFeedAttributeId);
    linkUrlFieldMapping.setFieldId(PLACEHOLDER_FIELD_SITELINK_URL);

    // Create the FieldMapping and operation.
    FeedMapping feedMapping = new FeedMapping();
    feedMapping.setPlaceholderType(PLACEHOLDER_SITELINKS);
    feedMapping.setFeedId(siteLinksFeed.siteLinksFeedId);
    feedMapping.setAttributeFieldMappings(
        new AttributeFieldMapping[] {linkTextFieldMapping, linkUrlFieldMapping});

    // Save the field mapping.
    extendedManagedCustomer.insertFeedMapping(feedMapping);
  }

  /**
   * Get legacy sitelinks for a campaign
   *
   * @param extendedManagedCustomer
   * @param campaignId ID of the campaign for which legacy sitelinks are retrieved.
   * @return The {@link CampaignAdExtension} that contains the legacy sitelinks, or null if there
   *         are no legacy sitelinks in this campaign.
   * @throws Exception if an error occurs while retrieving the sitelinks.
   */
  private static CampaignAdExtension getLegacySitelinksForCampaign(
      ExtendedManagedCustomer extendedManagedCustomer, long campaignId)
      throws Exception {
    // Create the selector.
    Selector selector = new Selector();
    selector.setFields(new String[] {"CampaignId", "AdExtensionId", "Status", "DisplayText",
        "DestinationUrl"});

    // Filter the results for specified campaign id.
    Predicate campaignPredicate = new Predicate();
    campaignPredicate.setOperator(PredicateOperator.EQUALS);
    campaignPredicate.setField("CampaignId");
    campaignPredicate.setValues(new String[] {Long.toString(campaignId)});

    // Filter the results for active campaign ad extensions. You may add
    // additional filtering conditions here as required.
    Predicate statusPredicate = new Predicate();
    statusPredicate.setOperator(PredicateOperator.EQUALS);
    statusPredicate.setField("Status");
    statusPredicate.setValues(new String[] {CampaignAdExtensionStatus.ACTIVE.getValue()});

    // Filter for sitelinks ad extension type.
    Predicate typePredicate = new Predicate();
    typePredicate.setOperator(PredicateOperator.EQUALS);
    typePredicate.setField("AdExtensionType");
    typePredicate.setValues(new String[] {"SITELINKS_EXTENSION"});

    selector.setPredicates(new Predicate[] {campaignPredicate, statusPredicate, typePredicate});

    List<CampaignAdExtension> list = extendedManagedCustomer.getDelegateLocator()
        .getCampaignAdExtensionDelegate().get(selector);
    
    if (list != null && list.size() > 0) {
      return list.get(0);
    } else {
      return null;
    }
  }

  /**
   * Add legacy sitelinks to the sitelinks feed.
   *
   * @param extendedManagedCustomer
   * @param siteLinksFeed The feed for adding sitelinks.
   * @param sitelinks The list of legacy sitelinks to be added to the feed.
   * @return The list of feeditems that were added to the feed.
   * @throws Exception if an error occurred while adding feed items to the sitelinks feed.
   */
  private static List<Long> createSiteLinkFeedItems(ExtendedManagedCustomer extendedManagedCustomer,
      SiteLinksFeed siteLinksFeed, Sitelink[] sitelinks) throws Exception {
    List<Long> siteLinkFeedItemIds = new ArrayList<Long>();

    List<FeedItem> feedItemList = Lists.newArrayList();
    for (Sitelink sitelink : sitelinks) {
      feedItemList.add(newSiteLinkFeedItemAddOperation(
          siteLinksFeed, sitelink.getDisplayText(), sitelink.getDestinationUrl()));
    }

    feedItemList = extendedManagedCustomer.insertFeedItems(feedItemList);

    // Retrieve the feed item ids.
    for (FeedItem item : feedItemList) {
      siteLinkFeedItemIds.add(item.getFeedItemId());
    }
    return siteLinkFeedItemIds;
  }

  /**
   * Creates a new operation for adding a feed item.
   *
   * @param siteLinksFeed The sitelinks feed.
   * @param text The sitelink text.
   * @param url The sitelink url.
   * @return A {@link FeedItemOperation} for adding the feed item.
   */
  private static FeedItem newSiteLinkFeedItemAddOperation(
      SiteLinksFeed siteLinksFeed, String text, String url) {
    // Create the FeedItemAttributeValues for our text values.
    FeedItemAttributeValue linkTextAttributeValue = new FeedItemAttributeValue();
    linkTextAttributeValue.setFeedAttributeId(siteLinksFeed.linkTextFeedAttributeId);
    linkTextAttributeValue.setStringValue(text);
    FeedItemAttributeValue linkUrlAttributeValue = new FeedItemAttributeValue();
    linkUrlAttributeValue.setFeedAttributeId(siteLinksFeed.linkUrlFeedAttributeId);
    linkUrlAttributeValue.setStringValue(url);

    // Create the feed item and operation.
    FeedItem item = new FeedItem();
    item.setFeedId(siteLinksFeed.siteLinksFeedId);
    item.setAttributeValues(
        new FeedItemAttributeValue[] {linkTextAttributeValue, linkUrlAttributeValue});
    return item;
  }

  /**
   * Delete legacy sitelinks from a campaign.
   *
   * @param extendedManagedCustomer
   * @param extensionToDelete The {@link CampaignAdExtension} that holds legacy sitelinks.
   * @throws Exception if an error occurs when deleting the sitelinks.
   */
  private static void deleteLegacySitelinks(
      ExtendedManagedCustomer extendedManagedCustomer,
      CampaignAdExtension extensionToDelete) throws Exception {

    extendedManagedCustomer.getDelegateLocator()
        .getCampaignAdExtensionDelegate().remove(extensionToDelete);
  }

  /**
   * Associates sitelink feed items with a campaign.
   *
   * @param extendedManagedCustomer
   * @param siteLinksFeed The feed for holding the sitelinks.
   * @param siteLinkFeedItemIds The list of feed item ids to be associated with a campaign as
   *        sitelinks.
   * @param campaignId The campaign id to which upgraded sitelinks are added.
   * @throws Exception if an error occurs when adding upgraded sitelinks to the campaign.
   */
  private static void associateSitelinkFeedItemsWithCampaign(
      ExtendedManagedCustomer extendedManagedCustomer, SiteLinksFeed siteLinksFeed,
      List<Long> siteLinkFeedItemIds, Long campaignId) throws Exception {
    // Create a custom matching function that matches the given feed items to
    // the campaign.
    RequestContextOperand requestContextOperand = new RequestContextOperand();
    requestContextOperand.setContextType(RequestContextOperandContextType.FEED_ITEM_ID);

    Function function = new Function();
    function.setLhsOperand(new FunctionArgumentOperand[] {requestContextOperand});
    function.setOperator(FunctionOperator.IN);

    List<FunctionArgumentOperand> operands = new ArrayList<FunctionArgumentOperand>();
    for (long feedItemId : siteLinkFeedItemIds) {
      ConstantOperand constantOperand = new ConstantOperand();
      constantOperand.setLongValue(feedItemId);
      constantOperand.setType(ConstantOperandConstantType.LONG);
      operands.add(constantOperand);
    }
    function.setRhsOperand(operands.toArray(new FunctionArgumentOperand[operands.size()]));

    // Create upgraded sitelinks for the campaign. Use the sitelinks feed we
    // created, and restrict feed items by matching function.
    CampaignFeed campaignFeed = new CampaignFeed();
    campaignFeed.setFeedId(siteLinksFeed.siteLinksFeedId);
    campaignFeed.setCampaignId(campaignId);
    campaignFeed.setMatchingFunction(function);
    campaignFeed.setPlaceholderTypes(new int[] {PLACEHOLDER_SITELINKS});

    extendedManagedCustomer.insertCampaignFeed(campaignFeed);
  }
}
