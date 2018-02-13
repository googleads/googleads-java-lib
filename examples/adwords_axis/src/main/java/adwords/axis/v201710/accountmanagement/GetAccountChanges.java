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

package adwords.axis.v201710.accountmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201710.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201710.ch.AdGroupChangeData;
import com.google.api.ads.adwords.axis.v201710.ch.CampaignChangeData;
import com.google.api.ads.adwords.axis.v201710.ch.ChangeStatus;
import com.google.api.ads.adwords.axis.v201710.ch.CustomerChangeData;
import com.google.api.ads.adwords.axis.v201710.ch.CustomerSyncSelector;
import com.google.api.ads.adwords.axis.v201710.ch.CustomerSyncServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.Campaign;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.DateTimeRange;
import com.google.api.ads.adwords.axis.v201710.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201710.cm.CampaignField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * This example gets the changes in the account during the last 24 hours.
 */
public class GetAccountChanges {

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
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Get the CustomerSyncService.
    CustomerSyncServiceInterface customerSyncService =
        adWordsServices.get(session, CustomerSyncServiceInterface.class);

    // Get a list of all campaign IDs.
    List<Long> campaignIds = new ArrayList<Long>();
    Selector selector = new SelectorBuilder()
        .fields(CampaignField.Id)
        .build();
    CampaignPage campaigns = campaignService.get(selector);
    if (campaigns.getEntries() != null) {
      for (Campaign campaign : campaigns.getEntries()) {
        campaignIds.add(campaign.getId());
      }
    }

    // Create date time range for the past 24 hours.
    DateTimeRange dateTimeRange = new DateTimeRange();
    dateTimeRange.setMin(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date(System
        .currentTimeMillis() - 1000L * 60 * 60 * 24)));
    dateTimeRange.setMax(new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date()));

    // Create selector.
    CustomerSyncSelector customerSyncSelector = new CustomerSyncSelector();
    customerSyncSelector.setDateTimeRange(dateTimeRange);
    customerSyncSelector
        .setCampaignIds(ArrayUtils.toPrimitive(campaignIds.toArray(new Long[] {})));

    // Get all account changes for campaign.
    CustomerChangeData accountChanges = customerSyncService.get(customerSyncSelector);

    // Display changes.
    if (accountChanges != null && accountChanges.getChangedCampaigns() != null) {
      System.out.printf("Most recent change: %s%n", accountChanges.getLastChangeTimestamp());
      for (CampaignChangeData campaignChanges : accountChanges.getChangedCampaigns()) {
        System.out.printf("Campaign with ID %d was changed:%n", campaignChanges.getCampaignId());
        System.out.printf("\tCampaign changed status: '%s'%n", 
            campaignChanges.getCampaignChangeStatus());
        if (!ChangeStatus.NEW.equals(campaignChanges.getCampaignChangeStatus())) {
          System.out.printf("\tAdded campaign criteria: %s%n",
              getFormattedList(campaignChanges.getAddedCampaignCriteria()));
          System.out.printf("\tRemoved campaign criteria: %s%n",
              getFormattedList(campaignChanges.getRemovedCampaignCriteria()));

          if (campaignChanges.getChangedAdGroups() != null) {
            for (AdGroupChangeData adGroupChanges : campaignChanges.getChangedAdGroups()) {
              System.out.printf("\tAd group with ID %d was changed:%n",
                  adGroupChanges.getAdGroupId());
              System.out.printf("\t\tAd group changed status: %s%n",
                  adGroupChanges.getAdGroupChangeStatus());
              if (!ChangeStatus.NEW.equals(adGroupChanges.getAdGroupChangeStatus())) {
                System.out.printf("\t\tAds changed: %s%n",
                    getFormattedList(adGroupChanges.getChangedAds()));
                System.out.printf("\t\tCriteria changed: %s%n",
                    getFormattedList(adGroupChanges.getChangedCriteria()));
                System.out.printf("\t\tCriteria removed: %s%n",
                    getFormattedList(adGroupChanges.getRemovedCriteria()));
              }
            }
          }
        }
        System.out.println("");
      }
    } else {
      System.out.println("No account changes were found.");
    }
  }

  /**
   * Gets a formatted list of a long array in the form {1,2,3}.
   * @param idList the long array
   * @return the formatted list
   */
  private static String getFormattedList(long[] idList) {
    if (idList == null) {
      idList = new long[]{};
    }
    return new StringBuilder().append("{")
        .append(StringUtils.join(ArrayUtils.toObject(idList), ','))
        .append("}").toString();
  }
}
