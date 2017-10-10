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

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ContentLabel;
import com.google.api.ads.adwords.axis.v201710.cm.ContentLabelType;
import com.google.api.ads.adwords.axis.v201710.cm.Criterion;
import com.google.api.ads.adwords.axis.v201710.cm.CustomerNegativeCriterion;
import com.google.api.ads.adwords.axis.v201710.cm.CustomerNegativeCriterionOperation;
import com.google.api.ads.adwords.axis.v201710.cm.CustomerNegativeCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201710.cm.CustomerNegativeCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Operator;
import com.google.api.ads.adwords.axis.v201710.cm.Placement;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import java.util.ArrayList;
import java.util.List;

/**
 * This example adds various types of negative criteria to a customer. These criteria will be
 * applied to all campaigns for the customer.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddCustomerNegativeCriteria {

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

    runExample(adWordsServices, session);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws Exception {
    // Get the CustomerNegativeCriterionService.
    CustomerNegativeCriterionServiceInterface customerNegativeCriterionService =
        adWordsServices.get(session, CustomerNegativeCriterionServiceInterface.class);

    List<Criterion> criteria = new ArrayList<>();

    // Exclude tragedy & conflict content.
    ContentLabel tragedyContentLabel = new ContentLabel();
    tragedyContentLabel.setContentLabelType(ContentLabelType.TRAGEDY);
    criteria.add(tragedyContentLabel);

    // Exclude a specific placement.
    Placement placement = new Placement();
    placement.setUrl("http://www.example.com");
    criteria.add(placement);

    // Additional criteria types are available for this service. See the types listed
    // under Criterion here:
    // https://developers.google.com/adwords/api/docs/reference/latest/CustomerNegativeCriterionService.Criterion

    // Create operations to add each of the criteria above.
    List<CustomerNegativeCriterionOperation> operations = new ArrayList<>();
    for (Criterion criterion : criteria) {
      CustomerNegativeCriterion negativeCriterion = new CustomerNegativeCriterion();
      negativeCriterion.setCriterion(criterion);
      CustomerNegativeCriterionOperation operation = new CustomerNegativeCriterionOperation();
      operation.setOperator(Operator.ADD);
      operation.setOperand(negativeCriterion);
      operations.add(operation);
    }

    // Send the request to add the criteria.
    CustomerNegativeCriterionReturnValue result =
        customerNegativeCriterionService.mutate(
            operations.toArray(new CustomerNegativeCriterionOperation[operations.size()]));

    // Display the results.
    for (CustomerNegativeCriterion negativeCriterion : result.getValue()) {
      System.out.printf(
          "Customer negative criterion with criterion ID %d and type '%s' was added.%n",
          negativeCriterion.getCriterion().getId(),
          negativeCriterion.getCriterion().getCriterionType());
    }
  }
}
