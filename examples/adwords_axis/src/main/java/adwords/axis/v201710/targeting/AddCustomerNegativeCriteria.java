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

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.ApiError;
import com.google.api.ads.adwords.axis.v201710.cm.ApiException;
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
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
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

    try {
      runExample(adWordsServices, session);
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
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {
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
