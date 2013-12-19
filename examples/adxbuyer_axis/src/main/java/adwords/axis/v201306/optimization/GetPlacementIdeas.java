// Copyright 2012, Google Inc. All Rights Reserved.
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

package adwords.axis.v201306.optimization;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201306.cm.Paging;
import com.google.api.ads.adwords.axis.v201306.cm.Placement;
import com.google.api.ads.adwords.axis.v201306.o.Attribute;
import com.google.api.ads.adwords.axis.v201306.o.AttributeType;
import com.google.api.ads.adwords.axis.v201306.o.CriterionAttribute;
import com.google.api.ads.adwords.axis.v201306.o.IdeaType;
import com.google.api.ads.adwords.axis.v201306.o.PlacementTypeAttribute;
import com.google.api.ads.adwords.axis.v201306.o.RelatedToUrlSearchParameter;
import com.google.api.ads.adwords.axis.v201306.o.RequestType;
import com.google.api.ads.adwords.axis.v201306.o.SearchParameter;
import com.google.api.ads.adwords.axis.v201306.o.SiteConstantsPlacementType;
import com.google.api.ads.adwords.axis.v201306.o.TargetingIdea;
import com.google.api.ads.adwords.axis.v201306.o.TargetingIdeaPage;
import com.google.api.ads.adwords.axis.v201306.o.TargetingIdeaSelector;
import com.google.api.ads.adwords.axis.v201306.o.TargetingIdeaServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.ClientLoginTokens;
import com.google.api.ads.common.lib.utils.Maps;

import java.util.Map;

/**
 * This example obtains placement ideas related to a given website.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: TargetingIdeaService.get
 *
 * @author Kevin Winter
 */
public class GetPlacementIdeas {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
    // Get the TargetingIdeaService.
    TargetingIdeaServiceInterface targetingIdeaService =
        adWordsServices.get(session, TargetingIdeaServiceInterface.class);

    // Create seed URL.
    String url = "mars.google.com";

    // Create selector.
    TargetingIdeaSelector selector = new TargetingIdeaSelector();
    selector.setRequestType(RequestType.IDEAS);
    selector.setIdeaType(IdeaType.PLACEMENT);
    selector.setRequestedAttributeTypes(new AttributeType[] {AttributeType.CRITERION,
        AttributeType.PLACEMENT_TYPE});

    // Set selector paging (required for targeting idea service).
    Paging paging = new Paging();
    paging.setStartIndex(0);
    paging.setNumberResults(10);
    selector.setPaging(paging);

    // Create related to URL search parameter.
    RelatedToUrlSearchParameter relatedToUrlSearchParameter = new RelatedToUrlSearchParameter();
    relatedToUrlSearchParameter.setUrls(new String[] {url});
    relatedToUrlSearchParameter.setIncludeSubUrls(false);
    selector.setSearchParameters(new SearchParameter[] {relatedToUrlSearchParameter});

    // Get related placements.
    TargetingIdeaPage page = targetingIdeaService.get(selector);

    // Display related placements.
    if (page.getEntries() != null && page.getEntries().length > 0) {
      for (TargetingIdea targetingIdea : page.getEntries()) {
        Map<AttributeType, Attribute> data = Maps.toMap(targetingIdea.getData());
        Placement placement =
            (Placement) ((CriterionAttribute) data.get(AttributeType.CRITERION)).getValue();
        SiteConstantsPlacementType placementType =
            ((PlacementTypeAttribute) data.get(AttributeType.PLACEMENT_TYPE)).getValue();
        System.out.println("Placement with url '" + placement.getUrl() + "' and type '"
            + placementType + "' was found.");
      }
    } else {
      System.out.println("No related placements were found.");
    }
  }
}
