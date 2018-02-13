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

package adwords.axis.v201710.basicoperations;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;
import static java.nio.charset.StandardCharsets.UTF_8;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
import com.google.api.ads.adwords.axis.v201710.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201710.cm.Bids;
import com.google.api.ads.adwords.axis.v201710.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201710.cm.Keyword;
import com.google.api.ads.adwords.axis.v201710.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201710.cm.Money;
import com.google.api.ads.adwords.axis.v201710.cm.NegativeAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.UrlList;
import com.google.api.ads.adwords.axis.v201710.cm.UserStatus;
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
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.rmi.RemoteException;

/**
 * This example adds keywords to an ad group. To get ad groups, run
 * AddAdGroup.java
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddKeywords {

  private static class AddKeywordsParams extends CodeSampleParams {
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

    AddKeywordsParams params = new AddKeywordsParams();
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
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (UnsupportedEncodingException ue) {
      System.err.printf("Example failed due to encoding exception: %s%n", ue);
    }
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the services factory.
   * @param session the session.
   * @param adGroupId the ID of the ad group where the keywords will be created.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws UnsupportedEncodingException if encoding the final URL failed.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, long adGroupId)
      throws RemoteException, UnsupportedEncodingException {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // Create keywords.
    Keyword keyword1 = new Keyword();
    keyword1.setText("mars cruise");
    keyword1.setMatchType(KeywordMatchType.BROAD);
    Keyword keyword2 = new Keyword();
    keyword2.setText("space hotel");
    keyword2.setMatchType(KeywordMatchType.EXACT);

    // Create biddable ad group criterion.
    BiddableAdGroupCriterion keywordBiddableAdGroupCriterion1 = new BiddableAdGroupCriterion();
    keywordBiddableAdGroupCriterion1.setAdGroupId(adGroupId);
    keywordBiddableAdGroupCriterion1.setCriterion(keyword1);

    // You can optionally provide these field(s).
    keywordBiddableAdGroupCriterion1.setUserStatus(UserStatus.PAUSED);

    String encodedFinalUrl = String.format("http://example.com/mars/cruise/?kw=%s",
        URLEncoder.encode(keyword1.getText(), UTF_8.name()));
    keywordBiddableAdGroupCriterion1.setFinalUrls(new UrlList(new String[] {encodedFinalUrl}));
    
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    CpcBid bid = new CpcBid();
    bid.setBid(new Money(null, 10000000L));
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    keywordBiddableAdGroupCriterion1.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    NegativeAdGroupCriterion keywordNegativeAdGroupCriterion2 = new NegativeAdGroupCriterion();
    keywordNegativeAdGroupCriterion2.setAdGroupId(adGroupId);
    keywordNegativeAdGroupCriterion2.setCriterion(keyword2);

    // Create operations.
    AdGroupCriterionOperation keywordAdGroupCriterionOperation1 = new AdGroupCriterionOperation();
    keywordAdGroupCriterionOperation1.setOperand(keywordBiddableAdGroupCriterion1);
    keywordAdGroupCriterionOperation1.setOperator(Operator.ADD);
    AdGroupCriterionOperation keywordAdGroupCriterionOperation2 = new AdGroupCriterionOperation();
    keywordAdGroupCriterionOperation2.setOperand(keywordNegativeAdGroupCriterion2);
    keywordAdGroupCriterionOperation2.setOperator(Operator.ADD);

    AdGroupCriterionOperation[] operations =
        new AdGroupCriterionOperation[] {keywordAdGroupCriterionOperation1,
            keywordAdGroupCriterionOperation2};

    // Add keywords.
    AdGroupCriterionReturnValue result = adGroupCriterionService.mutate(operations);

    // Display results.
    for (AdGroupCriterion adGroupCriterionResult : result.getValue()) {
      System.out.printf("Keyword ad group criterion with ad group ID %d, criterion ID %d, "
          + "text '%s', and match type '%s' was added.%n", adGroupCriterionResult.getAdGroupId(),
          adGroupCriterionResult.getCriterion().getId(),
          ((Keyword) adGroupCriterionResult.getCriterion()).getText(),
          ((Keyword) adGroupCriterionResult.getCriterion()).getMatchType());
    }
  }
}
