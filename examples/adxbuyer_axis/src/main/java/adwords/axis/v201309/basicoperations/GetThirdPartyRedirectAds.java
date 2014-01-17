// Copyright 2012 Google Inc. All Rights Reserved.
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

package adwords.axis.v201309.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupAdPage;
import com.google.api.ads.adwords.axis.v201309.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201309.cm.OrderBy;
import com.google.api.ads.adwords.axis.v201309.cm.Paging;
import com.google.api.ads.adwords.axis.v201309.cm.Predicate;
import com.google.api.ads.adwords.axis.v201309.cm.PredicateOperator;
import com.google.api.ads.adwords.axis.v201309.cm.Selector;
import com.google.api.ads.adwords.axis.v201309.cm.SortOrder;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.ClientLoginTokens;

/**
 * This example gets all third party redirect ads for a given ad group. To add
 * an ad, run AddThirdPartyRedirectAd.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupAdService.get
 *
 * @author Kevin Winter
 */
public class GetThirdPartyRedirectAds {

  private static final int PAGE_SIZE = 100;

  public static void main(String[] args) throws Exception {
    // Get a ClientLogin AuthToken.
    String clientLoginToken = new ClientLoginTokens.Builder()
        .forApi(ClientLoginTokens.Api.ADWORDS)
        .fromFile()
        .build()
        .requestToken();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withClientLoginToken(clientLoginToken).build();

    Long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId) throws Exception {
    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    int offset = 0;
    boolean morePages = true;

    // Create selector.
    Selector selector = new Selector();
    selector.setFields(new String[] {"Id", "AdGroupId", "Status"});
    selector.setOrdering(new OrderBy[] {new OrderBy("Id", SortOrder.ASCENDING)});
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    // Create predicates.
    Predicate adGroupIdPredicate =
        new Predicate("AdGroupId", PredicateOperator.IN, new String[] {adGroupId.toString()});
    // By default disabled ads aren't returned by the selector. To return them
    // include the DISABLED status in a predicate.
    Predicate statusPredicate =
        new Predicate("Status", PredicateOperator.IN,
            new String[] {"ENABLED", "PAUSED", "DISABLED"});
    Predicate adTypePredicate =
        new Predicate("AdType", PredicateOperator.EQUALS, new String[] {"THIRD_PARTY_REDIRECT_AD"});
    selector.setPredicates(new Predicate[] {adGroupIdPredicate, statusPredicate, adTypePredicate});

    while (morePages) {
      // Get all ads.
      AdGroupAdPage page = adGroupAdService.get(selector);

      // Display ads.
      if (page.getEntries() != null && page.getEntries().length > 0) {
        for (AdGroupAd adGroupAd : page.getEntries()) {
          System.out.println("Ad with id  \"" + adGroupAd.getAd().getId() + "\"" + " and type \""
              + adGroupAd.getAd().getAdType() + "\" was found.");
        }
      } else {
        System.out.println("No ads were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
      morePages = offset < page.getTotalNumEntries();
    }
  }
}
