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

package adwords.axis.v201710.extensions;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import adwords.axis.v201710.basicoperations.AddCampaigns;
import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.AttributeFieldMapping;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignFeed;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignFeedOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignFeedReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Feed;
import com.google.api.ads.adwords.axis.v201710.cm.FeedAttribute;
import com.google.api.ads.adwords.axis.v201710.cm.FeedAttributeType;
import com.google.api.ads.adwords.axis.v201710.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201710.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201710.cm.FeedItemGeoRestriction;
import com.google.api.ads.adwords.axis.v201710.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201710.cm.FeedItemReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.FeedMapping;
import com.google.api.ads.adwords.axis.v201710.cm.FeedMappingOperation;
import com.google.api.ads.adwords.axis.v201710.cm.FeedMappingReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.FeedMappingServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.FeedOperation;
import com.google.api.ads.adwords.axis.v201710.cm.FeedOrigin;
import com.google.api.ads.adwords.axis.v201710.cm.FeedReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.FeedServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Function;
import com.google.api.ads.adwords.axis.v201710.cm.GeoRestriction;
import com.google.api.ads.adwords.axis.v201710.cm.Location;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Joiner;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example adds a sitelinks feed and associates it with a campaign. To create a campaign,
 * run {@link AddCampaigns}. To add sitelinks using the simpler ExtensionSetting services, see
 * {@link AddSiteLinks}.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddSiteLinksUsingFeeds {

  private static class AddSiteLinksUsingFeedsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.FEED_NAME, required = true)
    private String feedName;
  }

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

    AddSiteLinksUsingFeedsParams params = new AddSiteLinksUsingFeedsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.feedName = "INSERT_FEED_NAME_HERE";
    }

    try {
      runExample(adWordsServices, session, params.campaignId, params.feedName);
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
   * @param campaignId the ID of the campaign where sitelinks will be added.
   * @param feedName the name of the new sitelinks feed.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      Long campaignId, String feedName) throws RemoteException {
    SiteLinksDataHolder siteLinksData = new SiteLinksDataHolder();
    createSiteLinksFeed(adWordsServices, session, siteLinksData, feedName);
    createSiteLinksFeedItems(adWordsServices, session, siteLinksData);
    createSiteLinksFeedMapping(adWordsServices, session, siteLinksData);
    createSiteLinksCampaignFeed(adWordsServices, session, siteLinksData, campaignId);
  }

  private static void createSiteLinksFeed(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      SiteLinksDataHolder siteLinksData,
      String feedName)
      throws RemoteException {
    // Get the FeedService.
    FeedServiceInterface feedService = adWordsServices.get(session, FeedServiceInterface.class);

    // Create attributes.
    FeedAttribute textAttribute = new FeedAttribute();
    textAttribute.setType(FeedAttributeType.STRING);
    textAttribute.setName("Link Text");
    FeedAttribute finalUrlAttribute = new FeedAttribute();
    finalUrlAttribute.setType(FeedAttributeType.URL_LIST);
    finalUrlAttribute.setName("Link Final URLs");
    FeedAttribute line2Attribute = new FeedAttribute();
    line2Attribute.setType(FeedAttributeType.STRING);
    line2Attribute.setName("Line 2");
    FeedAttribute line3Attribute = new FeedAttribute();
    line3Attribute.setType(FeedAttributeType.STRING);
    line3Attribute.setName("Line 3");

    // Create the feed.
    Feed siteLinksFeed = new Feed();
    siteLinksFeed.setName(feedName);
    siteLinksFeed.setAttributes(
        new FeedAttribute[] {textAttribute, finalUrlAttribute, line2Attribute, line3Attribute});
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
    siteLinksData.linkFinalUrlFeedAttributeId = savedAttributes[1].getId();
    siteLinksData.line2FeedAttributeId = savedAttributes[2].getId();
    siteLinksData.line3FeedAttributeId = savedAttributes[3].getId();
    System.out.printf("Feed with name '%s' and ID %d with linkTextAttributeId %d"
        + " and linkFinalUrlAttributeId %d and line2AttributeId %d"
        + " and line3AttributeId %d was created.%n",
        savedFeed.getName(),
        savedFeed.getId(),
        savedAttributes[0].getId(),
        savedAttributes[1].getId(),
        savedAttributes[2].getId(),
        savedAttributes[3].getId());
  }

  private static void createSiteLinksFeedItems(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, SiteLinksDataHolder siteLinksData) throws RemoteException {
    // Get the FeedItemService.
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);

    // Create operations to add FeedItems.
    FeedItemOperation home = newSiteLinkFeedItemAddOperation(siteLinksData, "Home",
        "http://www.example.com", "Home line 2", "Home line 3");
    FeedItemOperation stores = newSiteLinkFeedItemAddOperation(siteLinksData, "Stores",
        "http://www.example.com/stores", "Stores line 2", "Stores line 3");
    FeedItemOperation onSale = newSiteLinkFeedItemAddOperation(siteLinksData, "On Sale",
        "http://www.example.com/sale", "On Sale line 2", "On Sale line 3");
    FeedItemOperation support = newSiteLinkFeedItemAddOperation(siteLinksData, "Support",
        "http://www.example.com/support", "Support line 2", "Support line 3");
    FeedItemOperation products = newSiteLinkFeedItemAddOperation(siteLinksData, "Products",
        "http://www.example.com/prods", "Products line 2", "Products line 3");
    // This site link is using geographical targeting by specifying the
    // criterion ID for California.
    FeedItemOperation aboutUs = newSiteLinkFeedItemAddOperation(siteLinksData, "About Us",
        "http://www.example.com/about", "About Us line 2", "About Us line 3", 21137L);

    FeedItemOperation[] operations =
        new FeedItemOperation[] {home, stores, onSale, support, products, aboutUs};

    FeedItemReturnValue result = feedItemService.mutate(operations);
    for (FeedItem item : result.getValue()) {
      System.out.printf("FeedItem with feedItemId %d was added.%n", item.getFeedItemId());
      siteLinksData.siteLinkFeedItemIds.add(item.getFeedItemId());
    }
  }


  // See the Placeholder reference page for a list of all the placeholder types and fields.
  // https://developers.google.com/adwords/api/docs/appendix/placeholders
  private static final int PLACEHOLDER_SITELINKS = 1;

  // See the Placeholder reference page for a list of all the placeholder types and fields.
  // https://developers.google.com/adwords/api/docs/appendix/placeholders
  private static final int PLACEHOLDER_FIELD_SITELINK_LINK_TEXT = 1;
  private static final int PLACEHOLDER_FIELD_SITELINK_FINAL_URL = 5;
  private static final int PLACEHOLDER_FIELD_LINE_2_TEXT = 3;
  private static final int PLACEHOLDER_FIELD_LINE_3_TEXT = 4;

  private static void createSiteLinksFeedMapping(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, SiteLinksDataHolder siteLinksData) throws RemoteException {
    // Get the FeedItemService.
    FeedMappingServiceInterface feedMappingService =
        adWordsServices.get(session, FeedMappingServiceInterface.class);

    // Map the FeedAttributeIds to the fieldId constants.
    AttributeFieldMapping linkTextFieldMapping = new AttributeFieldMapping();
    linkTextFieldMapping.setFeedAttributeId(siteLinksData.linkTextFeedAttributeId);
    linkTextFieldMapping.setFieldId(PLACEHOLDER_FIELD_SITELINK_LINK_TEXT);
    AttributeFieldMapping linkFinalUrlFieldMapping = new AttributeFieldMapping();
    linkFinalUrlFieldMapping.setFeedAttributeId(siteLinksData.linkFinalUrlFeedAttributeId);
    linkFinalUrlFieldMapping.setFieldId(PLACEHOLDER_FIELD_SITELINK_FINAL_URL);
    AttributeFieldMapping line2FieldMapping = new AttributeFieldMapping();
    line2FieldMapping.setFeedAttributeId(siteLinksData.line2FeedAttributeId);
    line2FieldMapping.setFieldId(PLACEHOLDER_FIELD_LINE_2_TEXT);
    AttributeFieldMapping line3FieldMapping = new AttributeFieldMapping();
    line3FieldMapping.setFeedAttributeId(siteLinksData.line3FeedAttributeId);
    line3FieldMapping.setFieldId(PLACEHOLDER_FIELD_LINE_3_TEXT);


    // Create the FeedMapping and operation.
    FeedMapping feedMapping = new FeedMapping();
    feedMapping.setPlaceholderType(PLACEHOLDER_SITELINKS);
    feedMapping.setFeedId(siteLinksData.siteLinksFeedId);
    feedMapping.setAttributeFieldMappings(new AttributeFieldMapping[] {linkTextFieldMapping,
        linkFinalUrlFieldMapping, line2FieldMapping, line3FieldMapping});
    FeedMappingOperation operation = new FeedMappingOperation();
    operation.setOperand(feedMapping);
    operation.setOperator(Operator.ADD);

    // Save the field mapping.
    FeedMappingReturnValue result =
        feedMappingService.mutate(new FeedMappingOperation[] {operation});
    for (FeedMapping savedFeedMapping : result.getValue()) {
      System.out.printf(
          "Feed mapping with ID %d and placeholderType %d was saved for feed with ID %d.%n",
          savedFeedMapping.getFeedMappingId(), savedFeedMapping.getPlaceholderType(),
          savedFeedMapping.getFeedId());
    }
  }

  private static void createSiteLinksCampaignFeed(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      SiteLinksDataHolder siteLinksData,
      Long campaignId)
      throws RemoteException {
    // Get the CampaignFeedService.
    CampaignFeedServiceInterface campaignFeedService =
        adWordsServices.get(session, CampaignFeedServiceInterface.class);

    // Construct a matching function that associates the sitelink feed items to the campaign, and
    // sets the device preference to mobile. See the matching function guide at
    // https://developers.google.com/adwords/api/docs/guides/feed-matching-functions
    // for more details.
    String matchingFunctionString = String.format(
        "AND( IN(FEED_ITEM_ID, {%s}), EQUALS(CONTEXT.DEVICE, 'Mobile') )",
        Joiner.on(',').join(siteLinksData.siteLinkFeedItemIds));

    CampaignFeed campaignFeed = new CampaignFeed();
    campaignFeed.setFeedId(siteLinksData.siteLinksFeedId);
    campaignFeed.setCampaignId(campaignId);

    Function matchingFunction = new Function();
    matchingFunction.setFunctionString(matchingFunctionString);

    campaignFeed.setMatchingFunction(matchingFunction);
    // Specifying placeholder types on the CampaignFeed allows the same feed
    // to be used for different placeholders in different Campaigns.
    campaignFeed.setPlaceholderTypes(new int[] {PLACEHOLDER_SITELINKS});

    CampaignFeedOperation operation = new CampaignFeedOperation();
    operation.setOperand(campaignFeed);
    operation.setOperator(Operator.ADD);
    CampaignFeedReturnValue result =
        campaignFeedService.mutate(new CampaignFeedOperation[] {operation});
    for (CampaignFeed savedCampaignFeed : result.getValue()) {
      System.out.printf("Campaign with ID %d was associated with feed with ID %d.%n",
          savedCampaignFeed.getCampaignId(), savedCampaignFeed.getFeedId());
    }
  }

  private static FeedItemOperation newSiteLinkFeedItemAddOperation(
      SiteLinksDataHolder siteLinksData, String text, String finalUrl, String line2, String line3) {
    return newSiteLinkFeedItemAddOperation(siteLinksData, text, finalUrl, line2, line3, null);
  }

  private static FeedItemOperation newSiteLinkFeedItemAddOperation(
      SiteLinksDataHolder siteLinksData, String text, String finalUrl, String line2, String line3,
      Long locationId) {
    // Create the FeedItemAttributeValues for our text values.
    FeedItemAttributeValue linkTextAttributeValue = new FeedItemAttributeValue();
    linkTextAttributeValue.setFeedAttributeId(siteLinksData.linkTextFeedAttributeId);
    linkTextAttributeValue.setStringValue(text);
    FeedItemAttributeValue linkFinalUrlAttributeValue = new FeedItemAttributeValue();
    linkFinalUrlAttributeValue.setFeedAttributeId(siteLinksData.linkFinalUrlFeedAttributeId);
    linkFinalUrlAttributeValue.setStringValues(new String[] {finalUrl});
    FeedItemAttributeValue line2TextAttributeValue = new FeedItemAttributeValue();
    line2TextAttributeValue.setFeedAttributeId(siteLinksData.line2FeedAttributeId);
    line2TextAttributeValue.setStringValue(line2);
    FeedItemAttributeValue line3TextAttributeValue = new FeedItemAttributeValue();
    line3TextAttributeValue.setFeedAttributeId(siteLinksData.line3FeedAttributeId);
    line3TextAttributeValue.setStringValue(line3);

    // Create the feed item and operation.
    FeedItem item = new FeedItem();
    item.setFeedId(siteLinksData.siteLinksFeedId);
    item.setAttributeValues(new FeedItemAttributeValue[] {linkTextAttributeValue,
        linkFinalUrlAttributeValue, line2TextAttributeValue, line3TextAttributeValue});

    // OPTIONAL: Use geographical targeting on a feed item.
    // IDs can be found in the documentation or retrieved with the
    // LocationCriterionService.
    if (locationId != null) {
      Location location = new Location();
      location.setId(locationId);
      item.setGeoTargeting(location);
      // OPTIONAL: Restrict targeting only to people physically within the location.
      FeedItemGeoRestriction geoTargetingRestriction = new FeedItemGeoRestriction();
      geoTargetingRestriction.setGeoRestriction(GeoRestriction.LOCATION_OF_PRESENCE);
      item.setGeoTargetingRestriction(geoTargetingRestriction);
    }

    // Optional: use item.setStartTime() and item.setEndTime() to specify the
    // time period for the feed to deliver.  The example below will make the feed
    // start now and stop in one month.
    // Make sure you specify the DateTime in the customer's time zone.  You can
    // retrieve this from customer.getDateTimeZone().
    //   item.setStartTime(new DateTime(customerTimeZone).toString("yyyyMMdd HHmmss"));
    //   item.setEndTime(new DateTime(customerTimeZone).plusMonths(1).toString("yyyyMMdd HHmmss"));

    // Optional: use item.setScheduling() to specify time and days of the week for feed to deliver.
    FeedItemOperation operation = new FeedItemOperation();
    operation.setOperand(item);
    operation.setOperator(Operator.ADD);
    return operation;
  }

  private static class SiteLinksDataHolder {
    private Long siteLinksFeedId;
    private Long linkTextFeedAttributeId;
    private Long linkFinalUrlFeedAttributeId;
    private Long line2FeedAttributeId;
    private Long line3FeedAttributeId;
    private List<Long> siteLinkFeedItemIds = new ArrayList<Long>();
  }
}
