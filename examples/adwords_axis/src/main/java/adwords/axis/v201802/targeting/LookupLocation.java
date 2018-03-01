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

package adwords.axis.v201802.targeting;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201802.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.ApiException;
import com.google.api.ads.adwords.axis.v201802.cm.Location;
import com.google.api.ads.adwords.axis.v201802.cm.LocationCriterion;
import com.google.api.ads.adwords.axis.v201802.cm.LocationCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201802.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example gets location criteria by name.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class LookupLocation {

  /**
   * Helper function to format a string for parent locations.
   *
   * @param parents List of parent locations.
   * @return Formatted string representing parent locations.
   */
  public static String getParentLocationString(Location[] parents) {
    StringBuilder sb = new StringBuilder();
    if (parents != null) {
      for (Location parent : parents) {
        if (sb.length() > 0) {
          sb.append(", ");
        }
        sb.append(String.format("%s (%s)", parent.getLocationName(), parent.getDisplayType()));
      }
    } else {
      sb.append("N/A");
    }
    return sb.toString();
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

    String[] locationNames = new String[] {"Paris", "Quebec", "Spain", "Deutschland"};

    try {
      runExample(adWordsServices, session, locationNames);
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
   * @param locationNames the location names to use for the lookup.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, String[] locationNames)
      throws RemoteException {
    // Get the LocationCriterionService.
    LocationCriterionServiceInterface locationCriterionService =
        adWordsServices.get(session, LocationCriterionServiceInterface.class);

    Selector selector = new SelectorBuilder()
        .fields(
            "Id",
            "LocationName",
            "CanonicalName",
            "DisplayType",
            "ParentLocations",
            "Reach",
            "TargetingStatus")
        // Location names must match exactly, only EQUALS and IN are supported.
        .in("LocationName", locationNames)
        // Set the locale of the returned location names.
        .equals("Locale", "en")
        .build();

    // Make the get request.
    LocationCriterion[] locationCriteria = locationCriterionService.get(selector);

    // Display the resulting location criteria.
    for (LocationCriterion locationCriterion : locationCriteria) {
      String parentString =
          getParentLocationString(locationCriterion.getLocation().getParentLocations());
      System.out.printf("The search term '%s' returned the location '%s (%d)' of type '%s' "
          + "with parent locations '%s' and reach %d (%s).%n", locationCriterion.getSearchTerm(),
          locationCriterion.getLocation().getLocationName(), locationCriterion.getLocation()
              .getId(), locationCriterion.getLocation().getDisplayType(), parentString,
          locationCriterion.getReach(), locationCriterion.getLocation().getTargetingStatus());
    }
  }
}
