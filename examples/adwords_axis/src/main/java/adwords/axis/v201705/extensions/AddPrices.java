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

package adwords.axis.v201705.extensions;

import adwords.axis.v201705.basicoperations.AddCampaigns;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201705.cm.ApiException;
import com.google.api.ads.adwords.axis.v201705.cm.CustomerExtensionSetting;
import com.google.api.ads.adwords.axis.v201705.cm.CustomerExtensionSettingOperation;
import com.google.api.ads.adwords.axis.v201705.cm.CustomerExtensionSettingReturnValue;
import com.google.api.ads.adwords.axis.v201705.cm.CustomerExtensionSettingServiceInterface;
import com.google.api.ads.adwords.axis.v201705.cm.DayOfWeek;
import com.google.api.ads.adwords.axis.v201705.cm.ExtensionFeedItem;
import com.google.api.ads.adwords.axis.v201705.cm.ExtensionSetting;
import com.google.api.ads.adwords.axis.v201705.cm.FeedItemCampaignTargeting;
import com.google.api.ads.adwords.axis.v201705.cm.FeedItemSchedule;
import com.google.api.ads.adwords.axis.v201705.cm.FeedItemScheduling;
import com.google.api.ads.adwords.axis.v201705.cm.FeedType;
import com.google.api.ads.adwords.axis.v201705.cm.MinuteOfHour;
import com.google.api.ads.adwords.axis.v201705.cm.Money;
import com.google.api.ads.adwords.axis.v201705.cm.MoneyWithCurrency;
import com.google.api.ads.adwords.axis.v201705.cm.Operator;
import com.google.api.ads.adwords.axis.v201705.cm.PriceExtensionPriceQualifier;
import com.google.api.ads.adwords.axis.v201705.cm.PriceExtensionPriceUnit;
import com.google.api.ads.adwords.axis.v201705.cm.PriceExtensionType;
import com.google.api.ads.adwords.axis.v201705.cm.PriceFeedItem;
import com.google.api.ads.adwords.axis.v201705.cm.PriceTableRow;
import com.google.api.ads.adwords.axis.v201705.cm.UrlList;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example adds a price extension and associates it with an account. Campaign targeting is
 * also set using the specified campaign ID.
 *
 * <p>To get campaigns, run {@link AddCampaigns}.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddPrices {

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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long campaignId)
      throws ApiException, RemoteException {
    // Get the CustomerExtensionSettingService.
    CustomerExtensionSettingServiceInterface customerExtensionSettingService =
        adWordsServices.get(session, CustomerExtensionSettingServiceInterface.class);

    // Create the price extension feed item.
    PriceFeedItem priceFeedItem = new PriceFeedItem();
    priceFeedItem.setPriceExtensionType(PriceExtensionType.SERVICES);

    // Price qualifier is optional.
    priceFeedItem.setPriceQualifier(PriceExtensionPriceQualifier.FROM);
    priceFeedItem.setTrackingUrlTemplate("http://tracker.example.com/?u={lpurl}");
    priceFeedItem.setLanguage("en");
    FeedItemCampaignTargeting campaignTargeting = new FeedItemCampaignTargeting();
    campaignTargeting.setTargetingCampaignId(campaignId);
    priceFeedItem.setCampaignTargeting(campaignTargeting);
    priceFeedItem.setScheduling(
        new FeedItemScheduling(
            new FeedItemSchedule[] {
              new FeedItemSchedule(DayOfWeek.SUNDAY, 10, MinuteOfHour.ZERO, 18, MinuteOfHour.ZERO),
              new FeedItemSchedule(DayOfWeek.SATURDAY, 10, MinuteOfHour.ZERO, 22, MinuteOfHour.ZERO)
            }));

    // To create a price extension, at least three table rows are needed.
    List<PriceTableRow> priceTableRows = new ArrayList<>();
    String currencyCode = "USD";
    priceTableRows.add(
        createPriceTableRow(
            "Scrubs",
            "Body Scrub, Salt Scrub",
            "http://www.example.com/scrubs",
            "http://m.example.com/scrubs",
            60000000,
            currencyCode,
            PriceExtensionPriceUnit.PER_HOUR));
    priceTableRows.add(
        createPriceTableRow(
            "Hair Cuts",
            "Once a month",
            "http://www.example.com/haircuts",
            "http://m.example.com/haircuts",
            75000000,
            currencyCode,
            PriceExtensionPriceUnit.PER_MONTH));
    priceTableRows.add(
        createPriceTableRow(
            "Skin Care Package",
            "Four times a month",
            "http://www.example.com/skincarepackage",
            null,
            250000000,
            currencyCode,
            PriceExtensionPriceUnit.PER_MONTH));
    priceFeedItem.setTableRows(priceTableRows.toArray(new PriceTableRow[priceTableRows.size()]));

    // Create your campaign extension settings. This associates the sitelinks
    // to your campaign.
    CustomerExtensionSetting customerExtensionSetting = new CustomerExtensionSetting();
    customerExtensionSetting.setExtensionType(FeedType.PRICE);
    ExtensionSetting extensionSetting = new ExtensionSetting();
    extensionSetting.setExtensions(new ExtensionFeedItem[] {priceFeedItem});
    customerExtensionSetting.setExtensionSetting(extensionSetting);

    CustomerExtensionSettingOperation operation = new CustomerExtensionSettingOperation();
    operation.setOperand(customerExtensionSetting);
    operation.setOperator(Operator.ADD);

    // Add the extensions.
    CustomerExtensionSettingReturnValue returnValue =
        customerExtensionSettingService.mutate(new CustomerExtensionSettingOperation[] {operation});
    if (returnValue.getValue() != null && returnValue.getValue().length > 0) {
      CustomerExtensionSetting newExtensionSetting = returnValue.getValue(0);
      System.out.printf(
          "Extension setting with type '%s' was added.%n",
          newExtensionSetting.getExtensionType().getValue());
    } else {
      System.out.println("No extension settings were created.");
    }
  }

  /**
   * Creates a new {@link PriceTableRow} with the specified attributes.
   *
   * @param header the header for the row
   * @param description the description for the row
   * @param finalUrl the final URL for the row
   * @param finalMobileUrl the final mobile URL for the row, or null if this field should not be set
   * @param priceInMicros the price for the row, in micros
   * @param currencyCode the currency for the row
   * @param priceUnit the price unit for the row
   * @return a new {@link PriceTableRow}
   */
  private static PriceTableRow createPriceTableRow(
      String header,
      String description,
      String finalUrl,
      String finalMobileUrl,
      long priceInMicros,
      String currencyCode,
      PriceExtensionPriceUnit priceUnit) {
    PriceTableRow priceTableRow = new PriceTableRow();
    priceTableRow.setHeader(header);
    priceTableRow.setDescription(description);

    UrlList finalUrls = new UrlList();
    finalUrls.setUrls(new String[] {finalUrl});
    priceTableRow.setFinalUrls(finalUrls);

    if (finalMobileUrl != null) {
      UrlList finalMobileUrls = new UrlList();
      finalMobileUrls.setUrls(new String[] {finalMobileUrl});
      priceTableRow.setFinalMobileUrls(finalMobileUrls);
    }

    MoneyWithCurrency price = new MoneyWithCurrency();
    Money priceMoney = new Money();
    price.setCurrencyCode(currencyCode);
    priceMoney.setMicroAmount(priceInMicros);
    price.setMoney(priceMoney);
    priceTableRow.setPrice(price);
    priceTableRow.setPriceUnit(priceUnit);

    return priceTableRow;
  }

}
