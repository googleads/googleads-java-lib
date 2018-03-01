// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201802.migration;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.AttributeFieldMapping;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSetting;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSettingOperation;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSettingServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignFeed;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedOperation;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedPage;
import com.google.api.ads.adwords.axis.v201802.cm.CampaignFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem;
import com.google.api.ads.adwords.axis.v201802.cm.ExtensionSetting;
import com.google.api.ads.adwords.axis.v201802.cm.ExtensionSettingPlatform;
import com.google.api.ads.adwords.axis.v201802.cm.Feed;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemPage;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201802.cm.FeedMappingPage;
import com.google.api.ads.adwords.axis.v201802.cm.FeedMappingServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.FeedPage;
import com.google.api.ads.adwords.axis.v201802.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.FeedType;
import com.google.api.ads.adwords.axis.v201802.cm.Function;
import com.google.api.ads.adwords.axis.v201802.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201802.cm.FunctionOperand;
import com.google.api.ads.adwords.axis.v201802.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
import com.google.api.ads.adwords.axis.v201802.cm.RequestContextOperand;
import com.google.api.ads.adwords.axis.v201802.cm.RequestContextOperandContextType;
import com.google.api.ads.adwords.axis.v201802.cm.SitelinkFeedItem;
import com.google.api.ads.adwords.axis.v201802.cm.UrlList;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This code example migrates your feed based sitelinks at campaign level to use extension settings.
 * To learn more about extensionsettings, see
 * https://developers.google.com/adwords/api/docs/guides/extension-settings. To learn more about
 * migrating Feed based extensions to extension settings, see
 * https://developers.google.com/adwords/api/docs/guides/migrate-to-extension-settings.
 */
public class MigrateToExtensionSettings {

  private static final int PAGE_SIZE = 100;

  // See the Placeholder reference page for a list of all the placeholder types and fields.
  // https://developers.google.com/adwords/api/docs/appendix/placeholders
  private static final int PLACEHOLDER_SITELINKS = 1;

  // See the Placeholder reference page for a list of all the placeholder types and fields.
  // https://developers.google.com/adwords/api/docs/appendix/placeholders
  private static final int PLACEHOLDER_FIELD_SITELINK_LINK_TEXT = 1;
  private static final int PLACEHOLDER_FIELD_SITELINK_URL = 2;
  private static final int PLACEHOLDER_FIELD_LINE_2_TEXT = 3;
  private static final int PLACEHOLDER_FIELD_LINE_3_TEXT = 4;
  private static final int PLACEHOLDER_FIELD_FINAL_URLS = 5;
  private static final int PLACEHOLDER_FIELD_FINAL_MOBILE_URLS = 6;
  private static final int PLACEHOLDER_FIELD_TRACKING_URL_TEMPLATE = 7;

  public static void main(String[] args) {
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Construct an AdWordsSession.
      session =
          new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    try {
      runExample(adWordsServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the adwords.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf(
          "Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {
    // Get all of the feeds for the session's account.
    List<Feed> feeds = getFeeds(adWordsServices, session);

    for (Feed feed : feeds) {
      // Retrieve all the sitelinks from the current feed.
      Map<Long, SiteLinkFromFeed> feedItems = getSiteLinksFromFeed(adWordsServices, session, feed);

      // Get all the instances where a sitelink from this feed has been added to a campaign.
      List<CampaignFeed> campaignFeeds =
          getCampaignFeeds(adWordsServices, session, feed, PLACEHOLDER_SITELINKS);

      Set<Long> allFeedItemsToDelete = Sets.newHashSet();
      for (CampaignFeed campaignFeed : campaignFeeds) {
        // Retrieve the sitelinks that have been associated with this campaign.
        Set<Long> feedItemIds = getFeedItemIdsForCampaign(campaignFeed);

        ExtensionSettingPlatform platformRestrictions =
            getPlatformRestictionsForCampaign(campaignFeed);

        if (feedItemIds.isEmpty()) {
          System.out.printf("Migration skipped for campaign feed with campaign ID %d "
              + "and feed ID %d because no mapped feed item IDs were found in the "
              + "campaign feed's matching function.%n", campaignFeed.getCampaignId(),
              campaignFeed.getFeedId());
        } else {
          // Delete the campaign feed that associates the sitelinks from the feed to the campaign.
          deleteCampaignFeed(adWordsServices, session, campaignFeed);

          // Create extension settings instead of sitelinks.
          createExtensionSetting(adWordsServices,
              session,
              feedItems,
              campaignFeed,
              feedItemIds,
              platformRestrictions);

          // Mark the sitelinks from the feed for deletion.
          allFeedItemsToDelete.addAll(feedItemIds);
        }
      }

      // Delete all the sitelinks from the feed.
      deleteOldFeedItems(adWordsServices, session, allFeedItemsToDelete, feed);
    }
  }

  /**
   * Gets the site links from a feed.
   *
   * @return a map of feed item ID to SiteLinkFromFeed
   */
  private static Map<Long, SiteLinkFromFeed> getSiteLinksFromFeed(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Feed feed)
      throws RemoteException {
    // Retrieve the feed's attribute mapping.
    Multimap<Long, Integer> feedMappings =
        getFeedMapping(adWordsServices, session, feed, PLACEHOLDER_SITELINKS);

    Map<Long, SiteLinkFromFeed> feedItems = Maps.newHashMap();

    for (FeedItem feedItem : getFeedItems(adWordsServices, session, feed)) {
      SiteLinkFromFeed siteLinkFromFeed = new SiteLinkFromFeed();

      for (FeedItemAttributeValue attributeValue : feedItem.getAttributeValues()) {
        // Skip this attribute if it hasn't been mapped to a field.
        if (!feedMappings.containsKey(attributeValue.getFeedAttributeId())) {
          continue;
        }

        for (Integer fieldId : feedMappings.get(attributeValue.getFeedAttributeId())) {
          switch (fieldId) {
            case PLACEHOLDER_FIELD_SITELINK_LINK_TEXT:
              siteLinkFromFeed.text = attributeValue.getStringValue();
              break;
            case PLACEHOLDER_FIELD_SITELINK_URL:
              siteLinkFromFeed.url = attributeValue.getStringValue();
              break;
            case PLACEHOLDER_FIELD_FINAL_URLS:
              siteLinkFromFeed.finalUrls = attributeValue.getStringValues();
              break;
            case PLACEHOLDER_FIELD_FINAL_MOBILE_URLS:
              siteLinkFromFeed.finalMobileUrls = attributeValue.getStringValues();
              break;
            case PLACEHOLDER_FIELD_TRACKING_URL_TEMPLATE:
              siteLinkFromFeed.trackingUrlTemplate = attributeValue.getStringValue();
              break;
            case PLACEHOLDER_FIELD_LINE_2_TEXT:
              siteLinkFromFeed.line2 = attributeValue.getStringValue();
              break;
            case PLACEHOLDER_FIELD_LINE_3_TEXT:
              siteLinkFromFeed.line3 = attributeValue.getStringValue();
              break;
            default:
              // Ignore attributes that do not map to a predefined placeholder field.
              break;
          }
        }
      }
      siteLinkFromFeed.scheduling = feedItem.getScheduling();

      feedItems.put(feedItem.getFeedItemId(), siteLinkFromFeed);
    }

    return feedItems;
  }

  /**
   * Gets the feed mapping for a feed.
   *
   * @return a multimap from feed attribute ID to the set of field IDs mapped to the attribute
   */
  private static Multimap<Long, Integer> getFeedMapping(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, Feed feed, long placeholderType) throws RemoteException {
    // Get the FeedMappingService.
    FeedMappingServiceInterface feedMappingService =
        adWordsServices.get(session, FeedMappingServiceInterface.class);
    String query = String.format(
        "SELECT FeedMappingId, AttributeFieldMappings WHERE FeedId = %d and PlaceholderType = %d "
        + "AND Status = 'ENABLED'", feed.getId(), placeholderType);

    Multimap<Long, Integer> attributeMappings = HashMultimap.create();
    int offset = 0;
    FeedMappingPage feedMappingPage;

    do {
      String pageQuery = String.format(query + " LIMIT %d, %d", offset, PAGE_SIZE);
      feedMappingPage = feedMappingService.query(pageQuery);
      if (feedMappingPage.getEntries() != null) {
        // Normally, a feed attribute is mapped only to one field. However, you may map it to more
        // than one field if needed.
        for (FeedMapping feedMapping : feedMappingPage.getEntries()) {
          for (AttributeFieldMapping attributeMapping : feedMapping.getAttributeFieldMappings()) {
            attributeMappings.put(attributeMapping.getFeedAttributeId(),
                attributeMapping.getFieldId());
          }
        }
      }
      offset += PAGE_SIZE;
    } while (offset < feedMappingPage.getTotalNumEntries());

    return attributeMappings;
  }

  /** Returns a list of all enabled feeds. */
  private static List<Feed> getFeeds(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws RemoteException {
    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);
    String query = "SELECT Id, Name, Attributes WHERE Origin = 'USER' AND FeedStatus = 'ENABLED'";

    List<Feed> feeds = new ArrayList<>();
    int offset = 0;
    FeedPage feedPage;

    do {
      String pageQuery = String.format(query + " LIMIT %d, %d", offset, PAGE_SIZE);
      feedPage = feedService.query(pageQuery);
      if (feedPage.getEntries() != null) {
        feeds.addAll(Arrays.asList(feedPage.getEntries()));
      }
      offset += PAGE_SIZE;
    } while (offset < feedPage.getTotalNumEntries());

    return feeds;
  }

  /**
   * Returns the feed items for a feed.
   */
  private static List<FeedItem> getFeedItems(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, Feed feed) throws RemoteException {
    // Get the FeedItemService.
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);
    String query = String.format(
        "SELECT FeedItemId, AttributeValues, Scheduling WHERE Status = 'ENABLED' AND FeedId = %d",
        feed.getId());

    List<FeedItem> feedItems = new ArrayList<>();
    int offset = 0;
    FeedItemPage feedItemPage;

    do {
      String pageQuery = String.format(query + " LIMIT %d, %d", offset, PAGE_SIZE);
      feedItemPage = feedItemService.query(pageQuery);
      if (feedItemPage.getEntries() != null) {
        feedItems.addAll(Arrays.asList(feedItemPage.getEntries()));
      }
      offset += PAGE_SIZE;
    } while (offset < feedItemPage.getTotalNumEntries());

    return feedItems;
  }

  /** Deletes the old feed items for which extension settings have been created. */
  private static void deleteOldFeedItems(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Set<Long> feedItemIds,
      Feed feed)
      throws RemoteException {
    // Get the FeedItemService.
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);

    if (feedItemIds.isEmpty()) {
      return;
    }

    List<FeedItemOperation> operations = new ArrayList<>();
    for (Long feedItemId : feedItemIds) {
      FeedItemOperation operation = new FeedItemOperation();

      FeedItem feedItem = new FeedItem();
      feedItem.setFeedId(feed.getId());
      feedItem.setFeedItemId(feedItemId);

      operation.setOperand(feedItem);
      operation.setOperator(Operator.REMOVE);

      operations.add(operation);
    }

    feedItemService.mutate(operations.toArray(new FeedItemOperation[operations.size()]));
  }

  /**
   * Creates the extension setting for a list of feed items.
   *
   * @param adWordsServices the AdWordsServices
   * @param session the AdWordsSession
   * @param feedItems the list of all feed items
   * @param campaignFeed the original campaign feed
   * @param feedItemIds IDs of the feed items for which extension settings should be created
   * @param platformRestrictions the platform restrictions for the new campaign extension setting
   */
  private static void createExtensionSetting(AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Map<Long, SiteLinkFromFeed> feedItems,
      CampaignFeed campaignFeed,
      Set<Long> feedItemIds,
      ExtensionSettingPlatform platformRestrictions) throws RemoteException {
    // Get the CampaignExtensionSettingService.
    CampaignExtensionSettingServiceInterface campaignExtensionSettingService =
        adWordsServices.get(session, CampaignExtensionSettingServiceInterface.class);

    CampaignExtensionSetting campaignExtensionSetting = new CampaignExtensionSetting();
    campaignExtensionSetting.setCampaignId(campaignFeed.getCampaignId());
    campaignExtensionSetting.setExtensionType(FeedType.SITELINK);

    ExtensionSetting extensionSetting = new ExtensionSetting();

    List<ExtensionFeedItem> extensionFeedItems = new ArrayList<>();

    for (Long feedItemId : feedItemIds) {
      SiteLinkFromFeed siteLinkFromFeed = feedItems.get(feedItemId);
      SitelinkFeedItem siteLinkFeedItem = new SitelinkFeedItem();
      siteLinkFeedItem.setSitelinkText(siteLinkFromFeed.text);

      if (siteLinkFromFeed.finalUrls != null && siteLinkFromFeed.finalUrls.length > 0) {
        siteLinkFeedItem.setSitelinkFinalUrls(new UrlList(siteLinkFromFeed.finalUrls));
        if (siteLinkFromFeed.finalMobileUrls != null
            && siteLinkFromFeed.finalMobileUrls.length > 0) {
          siteLinkFeedItem.setSitelinkFinalMobileUrls(
              new UrlList(siteLinkFromFeed.finalMobileUrls));
        }
        siteLinkFeedItem.setSitelinkTrackingUrlTemplate(siteLinkFromFeed.trackingUrlTemplate);
      } else {
        siteLinkFeedItem.setSitelinkUrl(siteLinkFromFeed.url);
      }

      siteLinkFeedItem.setSitelinkLine2(siteLinkFromFeed.line2);
      siteLinkFeedItem.setSitelinkLine3(siteLinkFromFeed.line3);
      siteLinkFeedItem.setScheduling(siteLinkFromFeed.scheduling);

      extensionFeedItems.add(siteLinkFeedItem);
    }

    extensionSetting.setExtensions(
        extensionFeedItems.toArray(new ExtensionFeedItem[extensionFeedItems.size()]));

    extensionSetting.setPlatformRestrictions(platformRestrictions);

    campaignExtensionSetting.setExtensionSetting(extensionSetting);

    CampaignExtensionSettingOperation operation = new CampaignExtensionSettingOperation();
    operation.setOperand(campaignExtensionSetting);
    operation.setOperator(Operator.ADD);

    campaignExtensionSettingService.mutate(new CampaignExtensionSettingOperation[] {operation});
  }

  /**
   * Deletes a campaign feed.
   */
  private static CampaignFeed deleteCampaignFeed(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, CampaignFeed campaignFeed) throws RemoteException {
    // Get the CampaignFeedService.
    CampaignFeedServiceInterface campaignFeedService =
        adWordsServices.get(session, CampaignFeedServiceInterface.class);

    CampaignFeedOperation operation = new CampaignFeedOperation();
    operation.setOperand(campaignFeed);
    operation.setOperator(Operator.REMOVE);

    return campaignFeedService.mutate(new CampaignFeedOperation[] {operation}).getValue(0);
  }

  /**
   * Gets the platform restrictions for sitelinks in a campaign.
   */
  private static ExtensionSettingPlatform getPlatformRestictionsForCampaign(
      CampaignFeed campaignFeed) {
    String platformRestrictions = ExtensionSettingPlatform.NONE.getValue();

    if (FunctionOperator.AND.equals(campaignFeed.getMatchingFunction().getOperator())) {
      for (FunctionArgumentOperand argument : campaignFeed.getMatchingFunction().getLhsOperand()) {
        if (argument instanceof FunctionOperand) {
          FunctionOperand operand = (FunctionOperand) argument;
          if (FunctionOperator.EQUALS.equals(operand.getValue().getOperator())
              && (operand.getValue().getLhsOperand(0) instanceof RequestContextOperand)) {
            RequestContextOperand requestContextOperand =
                (RequestContextOperand) operand.getValue().getLhsOperand(0);
            if (RequestContextOperandContextType.DEVICE_PLATFORM.equals(
                requestContextOperand.getContextType())) {
              platformRestrictions =
                  ((ConstantOperand) operand.getValue().getRhsOperand(0)).getStringValue();
            }
          }
        }
      }
    }
    return ExtensionSettingPlatform.fromString(platformRestrictions.toUpperCase());
  }

  /**
   * Returns the list of feed item IDs that are used by a campaign through a given campaign feed.
   */
  private static Set<Long> getFeedItemIdsForCampaign(CampaignFeed campaignFeed)
      throws RemoteException {
    Set<Long> feedItemIds = Sets.newHashSet();

    FunctionOperator functionOperator = campaignFeed.getMatchingFunction().getOperator();

    if (FunctionOperator.IN.equals(functionOperator)) {
      // Check if matchingFunction is of the form IN(FEED_ITEM_ID,{xxx,xxx}).
      // Extract feed items if applicable.
      feedItemIds.addAll(getFeedItemIdsFromArgument(campaignFeed.getMatchingFunction()));
    } else if (FunctionOperator.AND.equals(functionOperator)) {
      for (FunctionArgumentOperand argument : campaignFeed.getMatchingFunction().getLhsOperand()) {
        // Check if matchingFunction is of the form IN(FEED_ITEM_ID,{xxx,xxx}).
        // Extract feed items if applicable.
        if (argument instanceof FunctionOperand) {
          FunctionOperand operand = (FunctionOperand) argument;
          if (FunctionOperator.IN.equals(operand.getValue().getOperator())) {
            feedItemIds.addAll(getFeedItemIdsFromArgument(operand.getValue()));
          }
        }
      }
    } else {
      // There are no other matching functions involving feed item IDs.
    }

    return feedItemIds;
  }

  /**
   * Gets the set of feed item IDs from the function if it is of the form:
   * <code>IN(FEED_ITEM_ID,{xxx,xxx})</code>. Otherwise, returns an empty set.
   */
  private static Set<Long> getFeedItemIdsFromArgument(Function function) {
    Set<Long> feedItemIds = Sets.newHashSet();

    if (function.getLhsOperand().length == 1
        && function.getLhsOperand(0) instanceof RequestContextOperand) {
      RequestContextOperand requestContextOperand =
          (RequestContextOperand) function.getLhsOperand(0);
      if (RequestContextOperandContextType.FEED_ITEM_ID.equals(
          requestContextOperand.getContextType())
          && FunctionOperator.IN.equals(function.getOperator())) {
        for (FunctionArgumentOperand argument : function.getRhsOperand()) {
          if (argument instanceof ConstantOperand) {
            feedItemIds.add(((ConstantOperand) argument).getLongValue());
          }
        }
      }
    }

    return feedItemIds;
  }

  /**
   * Returns the campaign feeds that use a particular feed for a particular placeholder type.
   */
  private static List<CampaignFeed> getCampaignFeeds(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, Feed feed, int placeholderType) throws RemoteException {
    // Get the CampaignFeedService.
    CampaignFeedServiceInterface campaignFeedService =
        adWordsServices.get(session, CampaignFeedServiceInterface.class);

    String query = String.format(
        "SELECT CampaignId, MatchingFunction, PlaceholderTypes WHERE Status = 'ENABLED' "
        + "AND FeedId = %d AND PlaceholderTypes CONTAINS_ANY [%d]", feed.getId(), placeholderType);

    List<CampaignFeed> campaignFeeds = new ArrayList<>();
    int offset = 0;
    CampaignFeedPage campaignFeedPage;

    do {
      String pageQuery = String.format(query + " LIMIT %d, %d", offset, PAGE_SIZE);
      campaignFeedPage = campaignFeedService.query(pageQuery);
      if (campaignFeedPage.getEntries() != null) {
        campaignFeeds.addAll(Arrays.asList(campaignFeedPage.getEntries()));
      }
      offset += PAGE_SIZE;
    } while (offset < campaignFeedPage.getTotalNumEntries());

    return campaignFeeds;
  }

  /**
   * A sitelink object read from a feed item.
   */
  private static class SiteLinkFromFeed {
    private String text;
    private String url;
    private String[] finalUrls;
    private String[] finalMobileUrls;
    private String trackingUrlTemplate;
    private String line2;
    private String line3;
    private FeedItemScheduling scheduling;
  }
}
