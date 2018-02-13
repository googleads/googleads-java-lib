// Copyright 2015 Google Inc. All Rights Reserved.
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

package dfp.axis.v201802.ratecardservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.PricingModel;
import com.google.api.ads.dfp.axis.v201802.RateCard;
import com.google.api.ads.dfp.axis.v201802.RateCardServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.primitives.Longs;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * This example creates a new rate card. To determine which rate cards exist,
 * run GetAllRateCards.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateRateCards {

  private static class CreateRateCardsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CURRENCY_CODE, required = true,
        description = "The currency code to create the rate card with.")
    private String currencyCode;

    @Parameter(names = ArgumentNames.TEAM_ID, description = "The IDs of the teams this rate"
        + " card should be visible to. You may pass multiple values. This is optional.")
    private List<Long> teamIds;
  }

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @param currencyCode the currency code to create the rate card with.
   * @param teamIds the IDs of the teams this rate card should be visible to. You may pass multiple
   *     values. This is optional.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      DfpServices dfpServices, DfpSession session, String currencyCode, long[] teamIds)
      throws RemoteException {
    // Get the RateCardService.
    RateCardServiceInterface rateCardService =
        dfpServices.get(session, RateCardServiceInterface.class);

    // Create a rate card.
    RateCard rateCard = new RateCard();
    rateCard.setName("RateCard #" + new Random().nextInt(Integer.MAX_VALUE));
    rateCard.setCurrencyCode(currencyCode);
    rateCard.setPricingModel(PricingModel.NET);

    if (teamIds.length != 0) {
      rateCard.setAppliedTeamIds(teamIds);
    }

    // Create the rate card on the server.
    RateCard[] rateCards = rateCardService.createRateCards(new RateCard[] {rateCard});

    for (RateCard createdRateCard : rateCards) {
      System.out.printf("A rate card with ID %d, name '%s', and currency code "
          + "'%s' was created.%n", createdRateCard.getId(), createdRateCard.getName(),
          createdRateCard.getCurrencyCode());
    }
  }

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.DFP)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a DfpSession.
      session =
          new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    DfpServices dfpServices = new DfpServices();

    CreateRateCardsParams params = new CreateRateCardsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.currencyCode = "INSERT_CURRENCY_CODE_HERE";
      params.teamIds = Arrays.asList(
          Long.valueOf("INSERT_TEAM_ID_HERE"),
          Long.valueOf("INSERT_TEAM_ID_HERE"),
          Long.valueOf("INSERT_TEAM_ID_HERE")
      );
    }

    try {
      runExample(dfpServices, session, params.currencyCode, Longs.toArray(params.teamIds));
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the dfp.axis
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
    }
  }
}
