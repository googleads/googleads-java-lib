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

package adwords.axis.v201406.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201406.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201406.cm.AttributeFieldMapping;
import com.google.api.ads.adwords.axis.v201406.cm.Feed;
import com.google.api.ads.adwords.axis.v201406.cm.FeedAttribute;
import com.google.api.ads.adwords.axis.v201406.cm.FeedAttributeType;
import com.google.api.ads.adwords.axis.v201406.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201406.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201406.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201406.cm.FeedItemReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201406.cm.FeedMappingOperation;
import com.google.api.ads.adwords.axis.v201406.cm.FeedMappingReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.FeedMappingServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.FeedOperation;
import com.google.api.ads.adwords.axis.v201406.cm.FeedReturnValue;
import com.google.api.ads.adwords.axis.v201406.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Functions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This example updates an existing sitelinks feed as follows:
 *
 * <ol>
 * <li>Adds FeedItemAttributes for line 1 and line 2 descriptions to the Feed</li>
 * <li>Populates the new FeedItemAttributes on FeedItems in the Feed</li>
 * <li>Replaces the Feed's existing FeedMapping with one that contains the new set of
 * FeedItemAttributes</li>
 * </ol>
 *
 * The end result of this is that any campaign or ad group whose CampaignFeed or AdGroupFeed points
 * to the Feed's ID will now serve line 1 and line 2 descriptions in its sitelinks.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file. See
 * README for more info.
 *
 * Tags: FeedItemService.mutate, FeedMappingService.mutate, FeedService.mutate
 *
 * Category: adx-exclude
 *
 * @author Josh Radcliff
 */
public class UpdateSiteLinks {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder().forApi(Api.ADWORDS).fromFile()
        .build().generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();

    AdWordsServices adWordsServices = new AdWordsServices();

    Long feedId = Long.valueOf("INSERT_FEED_ID_HERE");

    // Populate the map of FeedItem ID to descriptions.
    Map<Long, String[]> feedItemDescriptions = new HashMap<Long, String[]>();
    feedItemDescriptions.put(Long.valueOf("INSERT_FEED_ITEM_A_ID_HERE"),
        new String[] {"INSERT_FEED_ITEM_A_LINE1_DESC_HERE", "INSERT_FEED_ITEM_A_LINE2_DESC_HERE"});
    feedItemDescriptions.put(Long.valueOf("INSERT_FEED_ITEM_B_ID_HERE"),
        new String[] {"INSERT_FEED_ITEM_B_LINE1_DESC_HERE", "INSERT_FEED_ITEM_B_LINE2_DESC_HERE"});

    runExample(adWordsServices, session, feedId, feedItemDescriptions);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long feedId, Map<Long, String[]> feedItemDescriptions) throws Exception {
    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);

    Selector selector = new SelectorBuilder()
        .fields("Id", "Attributes")
        .equalsId(feedId)
        .build();
    Feed feed = feedService.get(selector).getEntries()[0];

    // Add new attributes to the feed.
    FeedAttribute[] newAttributes = addLine1And2FeedAttributes(adWordsServices, session, feed);
    FeedAttribute line1Attribute = newAttributes[0];
    FeedAttribute line2Attribute = newAttributes[1];

    // Update feed items.
    updateFeedItems(adWordsServices, session, feedId, line1Attribute, line2Attribute,
        feedItemDescriptions);

    // Update field mappings.
    updateFeedMapping(adWordsServices, session, feedId, line1Attribute, line2Attribute);
  }

  /**
   * Adds a FeedAttribute for line 1 and line 2 descriptions to the Feed.
   *
   * @param adWordsServices service locator for AdWords services
   * @param session the AdWords session to use for service calls
   * @param feed the Feed to mutate. This must have its FeedAttributes populated with the existing
   *        attributes
   * @return a two element array containing the new FeedAttributes for line 1 and line 2
   *         descriptions
   * @throws Exception
   */
  private static FeedAttribute[] addLine1And2FeedAttributes(AdWordsServices adWordsServices,
      AdWordsSession session, Feed feed) throws Exception {
    // This will be the starting index for the new attributes created below.
    int nextAttributeIndex = feed.getAttributes().length;

    FeedAttribute line1Attribute = new FeedAttribute();
    FeedAttribute line2Attribute = new FeedAttribute();
    line1Attribute.setType(FeedAttributeType.STRING);
    line1Attribute.setName("Line 1 Description");
    line2Attribute.setType(FeedAttributeType.STRING);
    line2Attribute.setName("Line 2 Description");
    
    // Only include NEW attributes when adding attributes to a feed.
    feed.setAttributes(new FeedAttribute[] {line1Attribute, line2Attribute});

    FeedOperation feedOperation = new FeedOperation();
    feedOperation.setOperand(feed);
    feedOperation.setOperator(Operator.SET);

    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);
    FeedReturnValue mutateFeedResult = feedService.mutate(new FeedOperation[] {feedOperation});

    // Get the new attributes from the mutated feed.
    Feed mutatedFeed = mutateFeedResult.getValue()[0];
    line1Attribute = mutatedFeed.getAttributes(nextAttributeIndex);
    line2Attribute = mutatedFeed.getAttributes(nextAttributeIndex + 1);
    return new FeedAttribute[] {line1Attribute, line2Attribute};
  }

  /**
   * Updates FeedItems for the Feed, setting line 1 description and line 2 description from the
   * contents of the feedItemDescriptions map.
   *
   * @param adWordsServices service locator for AdWords services
   * @param session the AdWords session to use for service calls
   * @param feedId the ID of the feed to update
   * @param line1Attribute the FeedAttribute for line 1 description
   * @param line2Attribute the FeedAttribute for line 2 description
   * @param feedItemDescriptions a map from feedItemId to a two-element array where item 0 is the
   *        line 1 description and item 1 is the line 2 description
   * @throws Exception
   */
  private static void updateFeedItems(AdWordsServices adWordsServices, AdWordsSession session,
      Long feedId, FeedAttribute line1Attribute, FeedAttribute line2Attribute,
      Map<Long, String[]> feedItemDescriptions) throws Exception {
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);

    List<String> feedItemIds = Lists.newArrayList(
        Iterables.transform(feedItemDescriptions.keySet(), Functions.toStringFunction()));
    Selector itemSelector = new SelectorBuilder()
        .fields("FeedId", "FeedItemId", "AttributeValues")
        // Limit FeedItems to the feed.
        .equalsId(feedId)
        // Limit FeedItems to the items in the feedItemDescriptions map.
        .in("FeedItemId", feedItemIds.toArray(new String[0])).build();

    FeedItem[] feedItems = feedItemService.get(itemSelector).getEntries();

    List<FeedItemOperation> itemOperations = Lists.newArrayListWithCapacity(feedItems.length);
    for (FeedItem feedItem : feedItems) {
      // Construct a FeedItemOperation that will set the line 1 and line 2
      // attribute values for this FeedItem.
      FeedItemAttributeValue[] itemAttributeValues = new FeedItemAttributeValue[2];

      FeedItemAttributeValue line1AttributeValue = new FeedItemAttributeValue();
      line1AttributeValue.setFeedAttributeId(line1Attribute.getId());
      line1AttributeValue.setStringValue(feedItemDescriptions.get(feedItem.getFeedItemId())[0]);
      itemAttributeValues[0] = line1AttributeValue;

      FeedItemAttributeValue line2AttributeValue = new FeedItemAttributeValue();
      line2AttributeValue.setFeedAttributeId(line2Attribute.getId());
      line2AttributeValue.setStringValue(feedItemDescriptions.get(feedItem.getFeedItemId())[1]);

      itemAttributeValues[1] = line2AttributeValue;
      feedItem.setAttributeValues(itemAttributeValues);

      FeedItemOperation operation = new FeedItemOperation();
      operation.setOperator(Operator.SET);
      operation.setOperand(feedItem);
      itemOperations.add(operation);
    }
    FeedItemReturnValue itemsUpdateReturnValue =
        feedItemService.mutate(itemOperations.toArray(new FeedItemOperation[0]));
    System.out.printf("Updated %d items%n", itemsUpdateReturnValue.getValue().length);
  }

  // See the Placeholder reference page for a list of all the placeholder types
  // and fields:
  //
  //    https://developers.google.com/adwords/api/docs/appendix/placeholders
  private static final int PLACEHOLDER_FIELD_LINE_1_TEXT = 3;
  private static final int PLACEHOLDER_FIELD_LINE_2_TEXT = 4;

  /**
   * Updates the FeedMapping for the Feed to include AttributeFieldMappings for the new line 1 and
   * line 2 FeedAttributes.
   *
   * @param adWordsServices service locator for AdWords services
   * @param session the AdWords session to use for service calls
   * @param feedId the ID of the Feed to associate with the updated FeedMapping
   * @param line1FeedAttribute the FeedAttribute for line 1 description
   * @param line2FeedAttribute the FeedAttribute for line 2 description
   * @throws Exception
   */
  private static void updateFeedMapping(AdWordsServices adWordsServices, AdWordsSession session,
      Long feedId, FeedAttribute line1FeedAttribute, FeedAttribute line2FeedAttribute)
      throws Exception {
    FeedMappingServiceInterface mappingService =
        adWordsServices.get(session, FeedMappingServiceInterface.class);
    Selector selector = new SelectorBuilder()
        .fields("FeedId", "FeedMappingId", "PlaceholderType", "AttributeFieldMappings")
        .equalsId(feedId)
        .build();

    FeedMapping feedMapping = mappingService.get(selector).getEntries()[0];

    // Remove the existing mapping (FeedMapping is immutable).
    feedMapping = mappingService.mutate(new FeedMappingOperation[] {
        new FeedMappingOperation(Operator.REMOVE, null, feedMapping)}).getValue(0);

    // Create line 1 and line 2 attribute field mappings.
    AttributeFieldMapping line1FieldMapping = new AttributeFieldMapping();
    line1FieldMapping.setFeedAttributeId(line1FeedAttribute.getId());
    line1FieldMapping.setFieldId(PLACEHOLDER_FIELD_LINE_1_TEXT);

    AttributeFieldMapping line2FieldMapping = new AttributeFieldMapping();
    line2FieldMapping.setFeedAttributeId(line2FeedAttribute.getId());
    line2FieldMapping.setFieldId(PLACEHOLDER_FIELD_LINE_2_TEXT);

    // Combine the existing field mappings with the new mappings.
    List<AttributeFieldMapping> allFieldMappings = new ArrayList<AttributeFieldMapping>();

    // Include existing mappings.
    allFieldMappings.addAll(Arrays.asList(feedMapping.getAttributeFieldMappings()));
    // Add the new mappings for line 1 and line 2.
    allFieldMappings.add(line1FieldMapping);
    allFieldMappings.add(line2FieldMapping);

    feedMapping.setAttributeFieldMappings(allFieldMappings.toArray(new AttributeFieldMapping[0]));

    FeedMappingReturnValue mappingReturnValue = mappingService.mutate(
        new FeedMappingOperation[] {new FeedMappingOperation(Operator.ADD, null, feedMapping)});

    FeedMapping mutatedMapping = mappingReturnValue.getValue()[0];

    System.out.printf("Updated field mappings for feedId %d and feedMappingId %d to:%n",
        mutatedMapping.getFeedId(), mutatedMapping.getFeedMappingId());
    for (AttributeFieldMapping fieldMapping : mutatedMapping.getAttributeFieldMappings()) {
      System.out.printf("  feedAttributeId %d --> fieldId %d%n", fieldMapping.getFeedAttributeId(),
          fieldMapping.getFieldId());
    }
  }
}
