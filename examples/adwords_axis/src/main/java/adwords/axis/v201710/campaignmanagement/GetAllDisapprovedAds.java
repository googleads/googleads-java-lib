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

package adwords.axis.v201710.campaignmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201710.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdPage;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdPolicySummary;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.PolicyApprovalStatus;
import com.google.api.ads.adwords.axis.v201710.cm.PolicyTopicEntry;
import com.google.api.ads.adwords.axis.v201710.cm.PolicyTopicEvidence;
import com.google.api.ads.adwords.axis.v201710.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201710.cm.AdGroupAdField;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example gets all disapproved ads in an ad group. To get ad groups, run GetAdGroups.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class GetAllDisapprovedAds {

  private static final int PAGE_SIZE = 100;
  
  private static class GetAllDisapprovedAdsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
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

    GetAllDisapprovedAdsParams params = new GetAllDisapprovedAdsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adGroupId);
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
   * @param adGroupId the ID of the ad group to search for disapproved ads.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws RemoteException {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    int offset = 0;

    // Create selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector =
        builder
            .fields(AdGroupAdField.Id, AdGroupAdField.PolicySummary)
            .orderAscBy(AdGroupAdField.Id)
            .equals(AdGroupAdField.AdGroupId, adGroupId.toString())
            .equals(
                AdGroupAdField.CombinedApprovalStatus,
                PolicyApprovalStatus.DISAPPROVED.toString())
            .offset(offset)
            .limit(PAGE_SIZE)
            .build();

    // Get all disapproved ads.
    AdGroupAdPage page = null;
    int disapprovedAdsCount = 0;

    do {
      page = adGroupAdService.get(selector);

      // Display ads.
      for (AdGroupAd adGroupAd : page) {
        disapprovedAdsCount++;
        AdGroupAdPolicySummary policySummary = adGroupAd.getPolicySummary();
        System.out.printf(
            "Ad with ID %d and type '%s' was disapproved with the following "
                + "policy topic entries:%n",
            adGroupAd.getAd().getId(), adGroupAd.getAd().getAdType());
        // Display the policy topic entries related to the ad disapproval.
        for (PolicyTopicEntry policyTopicEntry : policySummary.getPolicyTopicEntries()) {
          System.out.printf(
              "  topic id: %s, topic name: '%s', Help Center URL: %s%n",
              policyTopicEntry.getPolicyTopicId(),
              policyTopicEntry.getPolicyTopicName(),
              policyTopicEntry.getPolicyTopicHelpCenterUrl());
          // Display the attributes and values that triggered the policy topic.
          if (policyTopicEntry.getPolicyTopicEvidences() != null) {
            for (PolicyTopicEvidence evidence : policyTopicEntry.getPolicyTopicEvidences()) {
              System.out.printf("    evidence type: %s%n", evidence.getPolicyTopicEvidenceType());
              if (evidence.getEvidenceTextList() != null) {
                for (int i = 0; i < evidence.getEvidenceTextList().length; i++) {
                  System.out.printf(
                      "      evidence text[%d]: %s%n", i, evidence.getEvidenceTextList(i));
                }
              }
            }
          }
        }
      }
      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
    } while (offset < page.getTotalNumEntries());
    
    System.out.printf("%d disapproved ads were found.%n", disapprovedAdsCount);
  }
}
