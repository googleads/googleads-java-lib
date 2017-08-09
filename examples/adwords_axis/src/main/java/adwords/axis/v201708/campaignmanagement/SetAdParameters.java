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

package adwords.axis.v201708.campaignmanagement;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201708.cm.AdParam;
import com.google.api.ads.adwords.axis.v201708.cm.AdParamOperation;
import com.google.api.ads.adwords.axis.v201708.cm.AdParamServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example sets ad parameters for a keyword ad group criterion. To get ad
 * group criteria, run GetKeywords.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class SetAdParameters {

  private static class SetAdParametersParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.KEYWORD_ID, required = true)
    private Long keywordId;
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

    SetAdParametersParams params = new SetAdParametersParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.keywordId = Long.parseLong("INSERT_KEYWORD_ID_HERE");
    }

    runExample(adWordsServices, session, params.adGroupId, params.keywordId);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      Long adGroupId,
      Long keywordId)
      throws Exception {
    // Get the AdParamService.
    AdParamServiceInterface adParamService =
        adWordsServices.get(session, AdParamServiceInterface.class);

    // Create ad params.
    AdParam adParam1 = new AdParam();
    adParam1.setAdGroupId(adGroupId);
    adParam1.setCriterionId(keywordId);
    adParam1.setInsertionText("100");
    adParam1.setParamIndex(1);

    AdParam adParam2 = new AdParam();
    adParam2.setAdGroupId(adGroupId);
    adParam2.setCriterionId(keywordId);
    adParam2.setInsertionText("$40");
    adParam2.setParamIndex(2);

    // Create operations.
    AdParamOperation adParamOperation1 = new AdParamOperation();
    adParamOperation1.setOperand(adParam1);
    adParamOperation1.setOperator(Operator.SET);

    AdParamOperation adParamOperation2 = new AdParamOperation();
    adParamOperation2.setOperand(adParam2);
    adParamOperation2.setOperator(Operator.SET);

    AdParamOperation[] operations = new AdParamOperation[] {adParamOperation1, adParamOperation2};

    // Set ad parameters.
    AdParam[] adParams = adParamService.mutate(operations);

    // Display ad parameters.
    for (AdParam adParam : adParams) {
      System.out.printf("Ad parameter with ad group ID %d, criterion ID %d, insertion text "
          + "'%s', and parameter index %d was set.%n", adParam.getAdGroupId(), 
          adParam.getCriterionId(), adParam.getInsertionText(), adParam.getParamIndex());
    }
  }
}
