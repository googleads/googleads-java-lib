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

package adwords.axis.v201802.advancedoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeed;
import com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedAttribute;
import com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedAttributeType;
import com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItem;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemOperation;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemReturnValue;
import com.google.api.ads.adwords.axis.v201802.cm.FeedItemServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.Operator;
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
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/**
 * This example adds an ad customizer feed and associates it with the customer. Then it adds an ad
 * that uses the feed to populate dynamic data.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddAdCustomizer {

  private static class AddAdCustomizerParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private List<Long> adGroupIds = new ArrayList<>();

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

    AddAdCustomizerParams params = new AddAdCustomizerParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupIds = Arrays.asList(
          Long.valueOf("INSERT_AD_GROUP_ID_HERE"),
          Long.valueOf("INSERT_AD_GROUP_ID_HERE"));
      params.feedName = "INSERT_FEED_NAME_HERE";
    }

    try {
      runExample(adWordsServices, session, params.adGroupIds, params.feedName);
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
   * @param adGroupIds IDs of the ad groups for which ad customizers will be created.
   * @param feedName the name of the ad customizer feed to create.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      List<Long> adGroupIds, String feedName) throws RemoteException {
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
  private static AdCustomizerFeed createCustomizerFeed(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, String feedName) throws RemoteException {
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

    System.out.printf(
        "Created ad customizer feed with ID %d, name '%s' and attributes:%n",
        addedFeed.getFeedId(), addedFeed.getFeedName());
    for (AdCustomizerFeedAttribute feedAttribute : addedFeed.getFeedAttributes()) {
      System.out.printf(
          "  ID: %d, name: '%s', type: %s%n",
          feedAttribute.getId(), feedAttribute.getName(), feedAttribute.getType());
    }
    return addedFeed;
  }

  /**
   * Creates FeedItems with the values to use in ad customizations for each ad group in
   * <code>adGroupIds</code>.
   */
  private static void createCustomizerFeedItems(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, List<Long> adGroupIds, AdCustomizerFeed adCustomizerFeed)
      throws RemoteException {
    // Get the FeedItemService.
    FeedItemServiceInterface feedItemService =
        adWordsServices.get(session, FeedItemServiceInterface.class);

    List<FeedItemOperation> feedItemOperations = new ArrayList<>();

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

    List<FeedItemAttributeValue> attributeValues = new ArrayList<>();

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
   * Creates expanded text ads that use ad customizations for the specified ad group IDs.
   */
  private static void createAdsWithCustomizations(AdWordsServicesInterface adWordsServices,
      AdWordsSession session, List<Long> adGroupIds, String feedName) throws RemoteException {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    ExpandedTextAd textAd = new ExpandedTextAd();
    textAd.setHeadlinePart1(String.format("Luxury Cruise to {=%s.Name}", feedName));
    textAd.setHeadlinePart2(String.format("Only {=%s.Price}", feedName));
    textAd.setDescription(String.format("Offer ends in {=countdown(%s.Date)}!", feedName));
    textAd.setFinalUrls(new String[] {"http://www.example.com"});

    // We add the same ad to both ad groups. When they serve, they will show different values, since
    // they match different feed items.
    List<AdGroupAdOperation> adGroupAdOperations = new ArrayList<>();
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
