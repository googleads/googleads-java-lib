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

package adwords.axis.v201802.optimization;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201802.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.BidLandscapeLandscapePoint;
import com.google.api.ads.adwords.axis.v201802.cm.CriterionBidLandscape;
import com.google.api.ads.adwords.axis.v201802.cm.CriterionBidLandscapePage;
import com.google.api.ads.adwords.axis.v201802.cm.DataServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201802.cm.DataField;
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
 * This example gets a bid landscape for an ad group and a criterion. To get ad
 * groups, run GetAdGroups.java. To get criteria, run GetKeywords.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetKeywordBidSimulations {

  private static final int PAGE_SIZE = 100;

  private static class GetKeywordBidSimulationsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.CRITERION_ID, required = true)
    private Long criterionId;
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

    GetKeywordBidSimulationsParams params = new GetKeywordBidSimulationsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.criterionId = Long.parseLong("INSERT_CRITERION_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.adGroupId, params.criterionId);
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
   * @param adGroupId the ID of the ad group.
   * @param criterionId the ID of the criterion.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId,
      Long criterionId) throws RemoteException {
    // Get the DataService.
    DataServiceInterface dataService = adWordsServices.get(session, DataServiceInterface.class);

    // Create selector.
    Selector selector =
        new SelectorBuilder()
            .fields(
                DataField.AdGroupId,
                DataField.CriterionId,
                DataField.StartDate,
                DataField.EndDate,
                DataField.Bid,
                DataField.BiddableConversions,
                DataField.BiddableConversionsValue,
                DataField.LocalClicks,
                DataField.LocalCost,
                DataField.LocalImpressions)
            .equals(DataField.AdGroupId, adGroupId.toString())
            .equals(DataField.CriterionId, criterionId.toString())
            .limit(PAGE_SIZE)
            .build();

    // Display bid landscapes.
    int landscapePointsInPreviousPage = 0;
    int startIndex = 0;
    do {
      // Offset the start index by the number of landscape points in the last retrieved page,
      // NOT the number of entries (bid landscapes) in the page.
      startIndex += landscapePointsInPreviousPage;
      selector.getPaging().setStartIndex(startIndex);

      // Reset the count of landscape points in preparation for processing the next page.
      landscapePointsInPreviousPage = 0;

      // Request the next page of bid landscapes.
      CriterionBidLandscapePage page = dataService.getCriterionBidLandscape(selector);

      if (page.getEntries() != null) {
        for (CriterionBidLandscape criterionBidLandscape : page.getEntries()) {
          System.out.printf(
              "Criterion bid landscape with ad group ID %d, criterion ID %d, "
                  + "start date %s, end date %s, with landscape points:%n",
              criterionBidLandscape.getAdGroupId(),
              criterionBidLandscape.getCriterionId(),
              criterionBidLandscape.getStartDate(),
              criterionBidLandscape.getEndDate());

          for (BidLandscapeLandscapePoint bidLanscapePoint :
              criterionBidLandscape.getLandscapePoints()) {
            landscapePointsInPreviousPage++;
            System.out.printf(
                "\t{bid: %d clicks: %d cost: %d impressions: %d, biddable conversions: %.2f, "
                    + "biddable conversions value: %.2f}%n",
                bidLanscapePoint.getBid().getMicroAmount(),
                bidLanscapePoint.getClicks(),
                bidLanscapePoint.getCost().getMicroAmount(),
                bidLanscapePoint.getImpressions(),
                bidLanscapePoint.getBiddableConversions(),
                bidLanscapePoint.getBiddableConversionsValue());
          }
          System.out.println(" was found.");
        }
      }
    } while (landscapePointsInPreviousPage >= PAGE_SIZE);
  }
}
