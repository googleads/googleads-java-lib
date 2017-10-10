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

package adwords.axis.v201710.optimization;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.Language;
import com.google.api.ads.adwords.axis.v201710.cm.Money;
import com.google.api.ads.adwords.axis.v201710.cm.NetworkSetting;
import com.google.api.ads.adwords.axis.v201710.cm.Paging;
import com.google.api.ads.adwords.axis.v201710.o.Attribute;
import com.google.api.ads.adwords.axis.v201710.o.AttributeType;
import com.google.api.ads.adwords.axis.v201710.o.DoubleAttribute;
import com.google.api.ads.adwords.axis.v201710.o.IdeaType;
import com.google.api.ads.adwords.axis.v201710.o.IntegerSetAttribute;
import com.google.api.ads.adwords.axis.v201710.o.LanguageSearchParameter;
import com.google.api.ads.adwords.axis.v201710.o.LongAttribute;
import com.google.api.ads.adwords.axis.v201710.o.MoneyAttribute;
import com.google.api.ads.adwords.axis.v201710.o.NetworkSearchParameter;
import com.google.api.ads.adwords.axis.v201710.o.RelatedToQuerySearchParameter;
import com.google.api.ads.adwords.axis.v201710.o.RequestType;
import com.google.api.ads.adwords.axis.v201710.o.SearchParameter;
import com.google.api.ads.adwords.axis.v201710.o.SeedAdGroupIdSearchParameter;
import com.google.api.ads.adwords.axis.v201710.o.StringAttribute;
import com.google.api.ads.adwords.axis.v201710.o.TargetingIdea;
import com.google.api.ads.adwords.axis.v201710.o.TargetingIdeaPage;
import com.google.api.ads.adwords.axis.v201710.o.TargetingIdeaSelector;
import com.google.api.ads.adwords.axis.v201710.o.TargetingIdeaServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Maps;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This example gets keywords related to a seed keyword.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetKeywordIdeas {

  private static class GetKeywordIdeasParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID)
    private Long adGroupId;
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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    GetKeywordIdeasParams params = new GetKeywordIdeasParams();
    if (!params.parseArguments(args)) {
      // Either pass the parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      // If you do not want to use an existing ad group to seed your request, you can
      // leave this set to null.
      params.adGroupId = null;
    }
    runExample(adWordsServices, session, params.adGroupId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Long adGroupId)
      throws Exception {
    // Get the TargetingIdeaService.
    TargetingIdeaServiceInterface targetingIdeaService =
        adWordsServices.get(session, TargetingIdeaServiceInterface.class);

    // Create selector.
    TargetingIdeaSelector selector = new TargetingIdeaSelector();
    selector.setRequestType(RequestType.IDEAS);
    selector.setIdeaType(IdeaType.KEYWORD);
    selector.setRequestedAttributeTypes(new AttributeType[] {
        AttributeType.KEYWORD_TEXT,
        AttributeType.SEARCH_VOLUME,
        AttributeType.AVERAGE_CPC,
        AttributeType.COMPETITION,
        AttributeType.CATEGORY_PRODUCTS_AND_SERVICES});

    // Set selector paging (required for targeting idea service).
    Paging paging = new Paging();
    paging.setStartIndex(0);
    paging.setNumberResults(10);
    selector.setPaging(paging);

    List<SearchParameter> searchParameters = new ArrayList<>();
    // Create related to query search parameter.
    RelatedToQuerySearchParameter relatedToQuerySearchParameter =
        new RelatedToQuerySearchParameter();
    relatedToQuerySearchParameter.setQueries(new String[] {"bakery", "pastries", "birthday cake"});
    searchParameters.add(relatedToQuerySearchParameter);

    // Language setting (optional).
    // The ID can be found in the documentation:
    //   https://developers.google.com/adwords/api/docs/appendix/languagecodes
    // See the documentation for limits on the number of allowed language parameters:
    //   https://developers.google.com/adwords/api/docs/reference/latest/TargetingIdeaService.LanguageSearchParameter
    LanguageSearchParameter languageParameter = new LanguageSearchParameter();
    Language english = new Language();
    english.setId(1000L);
    languageParameter.setLanguages(new Language[] {english});
    searchParameters.add(languageParameter);

    // Create network search parameter (optional).
    NetworkSetting networkSetting = new NetworkSetting();
    networkSetting.setTargetGoogleSearch(true);
    networkSetting.setTargetSearchNetwork(false);
    networkSetting.setTargetContentNetwork(false);
    networkSetting.setTargetPartnerSearchNetwork(false);

    NetworkSearchParameter networkSearchParameter = new NetworkSearchParameter();
    networkSearchParameter.setNetworkSetting(networkSetting);
    searchParameters.add(networkSearchParameter);

    // Optional: Use an existing ad group to generate ideas.
    if (adGroupId != null) {
      SeedAdGroupIdSearchParameter seedAdGroupIdSearchParameter =
          new SeedAdGroupIdSearchParameter();
      seedAdGroupIdSearchParameter.setAdGroupId(adGroupId);
      searchParameters.add(seedAdGroupIdSearchParameter);
    }
    selector.setSearchParameters(
        searchParameters.toArray(new SearchParameter[searchParameters.size()]));

    // Get keyword ideas.
    TargetingIdeaPage page = targetingIdeaService.get(selector);

    // Display keyword ideas.
    for (TargetingIdea targetingIdea : page.getEntries()) {
      Map<AttributeType, Attribute> data = Maps.toMap(targetingIdea.getData());
      StringAttribute keyword = (StringAttribute) data.get(AttributeType.KEYWORD_TEXT);

      IntegerSetAttribute categories =
          (IntegerSetAttribute) data.get(AttributeType.CATEGORY_PRODUCTS_AND_SERVICES);
      String categoriesString = "(none)";
      if (categories != null && categories.getValue() != null) {
        categoriesString = Joiner.on(", ").join(Ints.asList(categories.getValue()));
      }
      Long averageMonthlySearches =
          ((LongAttribute) data.get(AttributeType.SEARCH_VOLUME))
              .getValue();
      Money averageCpc =
          ((MoneyAttribute) data.get(AttributeType.AVERAGE_CPC)).getValue();
      Double competition =
          ((DoubleAttribute) data.get(AttributeType.COMPETITION)).getValue();
      System.out.printf("Keyword with text '%s', average monthly search volume %d, "
          + "average CPC %d, and competition %.2f "
          + "was found with categories: %s%n", keyword.getValue(), averageMonthlySearches,
          averageCpc.getMicroAmount(), competition,
          categoriesString);
    }

    if (page.getEntries() == null) {
      System.out.println("No related keywords were found.");
    }
  }
}
