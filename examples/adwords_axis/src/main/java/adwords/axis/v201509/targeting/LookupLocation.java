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

package adwords.axis.v201509.targeting;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201509.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201509.cm.Location;
import com.google.api.ads.adwords.axis.v201509.cm.LocationCriterion;
import com.google.api.ads.adwords.axis.v201509.cm.LocationCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

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

    String[] locationNames = new String[] {"Paris", "Quebec", "Spain", "Deutschland"};

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, locationNames);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, String[] locationNames)
      throws Exception {
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
