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

package adwords.axis.v201710.targeting;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignCriterionOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.ConstantOperand;
import com.google.api.ads.adwords.axis.v201710.cm.ConstantOperandConstantType;
import com.google.api.ads.adwords.axis.v201710.cm.ConstantOperandUnit;
import com.google.api.ads.adwords.axis.v201710.cm.Criterion;
import com.google.api.ads.adwords.axis.v201710.cm.Function;
import com.google.api.ads.adwords.axis.v201710.cm.FunctionArgumentOperand;
import com.google.api.ads.adwords.axis.v201710.cm.FunctionOperator;
import com.google.api.ads.adwords.axis.v201710.cm.Keyword;
import com.google.api.ads.adwords.axis.v201710.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201710.cm.Language;
import com.google.api.ads.adwords.axis.v201710.cm.Location;
import com.google.api.ads.adwords.axis.v201710.cm.LocationExtensionOperand;
import com.google.api.ads.adwords.axis.v201710.cm.LocationGroups;
import com.google.api.ads.adwords.axis.v201710.cm.NegativeCampaignCriterion;
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
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This example adds various types of targeting criteria to a campaign. To get
 * campaigns, run GetCampaigns.java
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddCampaignTargetingCriteria {

  private static class AddCampaignTargetingCriteriaParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.LOCATION_FEED_ID,
        description = "The ID of a feed that has been configured for location targeting, meaning it"
            + " has an ENABLED FeedMapping with criterionType of 77. Feeds linked to a GMB account"
            + " automatically have this FeedMapping. If you don't have such a feed, this argument"
            + " is unnecessary.")
    private Long locationFeedId;
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

    AddCampaignTargetingCriteriaParams params = new AddCampaignTargetingCriteriaParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.locationFeedId = Long.parseLong("INSERT_LOCATION_FEED_ID_HERE");
    }

    try {
      runExample(adWordsServices, session, params.campaignId, params.locationFeedId);
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
   * @param campaignId the ID of the campaign where targeting criteria will be added.
   * @param locationFeedId optional ID of a location targeting feed.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session,
      Long campaignId, @Nullable Long locationFeedId) throws RemoteException {
    // Get the CampaignService.
    CampaignCriterionServiceInterface campaignCriterionService =
        adWordsServices.get(session, CampaignCriterionServiceInterface.class);

    // Create locations. The IDs can be found in the documentation or
    // retrieved with the LocationCriterionService.
    Location california = new Location();
    california.setId(21137L);
    Location mexico = new Location();
    mexico.setId(2484L);

    // Create languages. The IDs can be found in the documentation or
    // retrieved with the ConstantDataService.
    Language english = new Language();
    english.setId(1000L);
    Language spanish = new Language();
    spanish.setId(1003L);

    List<Criterion> criteria = new ArrayList<>(Arrays.asList(california, mexico, english, spanish));
    
    // Distance targeting. Area of 10 miles around the locations in the location feed.
    if (locationFeedId != null) {
      LocationGroups radiusLocationGroup = new LocationGroups();
      radiusLocationGroup.setFeedId(locationFeedId);
      ConstantOperand radius = new ConstantOperand();
      radius.setType(ConstantOperandConstantType.DOUBLE);
      radius.setUnit(ConstantOperandUnit.MILES);
      radius.setDoubleValue(10d);
      LocationExtensionOperand distance = new LocationExtensionOperand();
      distance.setRadius(radius);

      Function radiusMatchingFunction = new Function();
      radiusMatchingFunction.setOperator(FunctionOperator.IDENTITY);
      radiusMatchingFunction.setLhsOperand(new FunctionArgumentOperand[] {distance});
      radiusLocationGroup.setMatchingFunction(radiusMatchingFunction);
      
      criteria.add(radiusLocationGroup);
    }

    // Create operations to add each of the criteria above.
    List<CampaignCriterionOperation> operations = new ArrayList<CampaignCriterionOperation>();
    for (Criterion criterion : criteria) {
      CampaignCriterionOperation operation = new CampaignCriterionOperation();
      CampaignCriterion campaignCriterion = new CampaignCriterion();
      campaignCriterion.setCampaignId(campaignId);
      campaignCriterion.setCriterion(criterion);
      operation.setOperand(campaignCriterion);
      operation.setOperator(Operator.ADD);
      operations.add(operation);
    }
    
    // Add a negative campaign criterion.
    Keyword negativeKeyword = new Keyword();
    negativeKeyword.setText("jupiter cruise");
    negativeKeyword.setMatchType(KeywordMatchType.BROAD);
    CampaignCriterion negativeCriterion = new NegativeCampaignCriterion();
    negativeCriterion.setCampaignId(campaignId);
    negativeCriterion.setCriterion(negativeKeyword);

    CampaignCriterionOperation operation = new CampaignCriterionOperation();
    operation.setOperand(negativeCriterion);
    operation.setOperator(Operator.ADD);
    operations.add(operation);

    CampaignCriterionReturnValue result =
        campaignCriterionService.mutate(operations
            .toArray(new CampaignCriterionOperation[operations.size()]));

    // Display campaigns.
    for (CampaignCriterion campaignCriterion : result.getValue()) {
      System.out.printf("Campaign criterion with campaign ID %d, criterion ID %d, "
          + "and type '%s' was added.%n", campaignCriterion.getCampaignId(), campaignCriterion
          .getCriterion().getId(), campaignCriterion.getCriterion().getCriterionType());
    }
  }
}
