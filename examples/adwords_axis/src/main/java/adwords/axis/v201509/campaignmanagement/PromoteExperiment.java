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

package adwords.axis.v201509.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201509.cm.Experiment;
import com.google.api.ads.adwords.axis.v201509.cm.ExperimentOperation;
import com.google.api.ads.adwords.axis.v201509.cm.ExperimentReturnValue;
import com.google.api.ads.adwords.axis.v201509.cm.ExperimentServiceInterface;
import com.google.api.ads.adwords.axis.v201509.cm.ExperimentStatus;
import com.google.api.ads.adwords.axis.v201509.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example promotes an experiment, which permanently applies all the
 * experimental changes made to its related ad groups, criteria and ads. To get
 * experiments, run AddExperiment.java. To add an experiment, run
 * AddExperiment.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class PromoteExperiment {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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

    long experimentId = Long.parseLong("INSERT_EXPERIMENT_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, experimentId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long experimentId) throws Exception {
    // Get the ExperimentService.
    ExperimentServiceInterface experimentService =
        adWordsServices.get(session, ExperimentServiceInterface.class);

    // Create experiment with PROMOTED status.
    Experiment experiment = new Experiment();
    experiment.setId(experimentId);
    experiment.setStatus(ExperimentStatus.PROMOTED);

    // Create operation.
    ExperimentOperation operation = new ExperimentOperation();
    operation.setOperand(experiment);
    operation.setOperator(Operator.SET);

    ExperimentOperation[] operations = new ExperimentOperation[] {operation};

    // Promote experiment.
    ExperimentReturnValue result = experimentService.mutate(operations);

    // Display experiments.
    for (Experiment experimentResult : result.getValue()) {
      System.out.println("Experiment with name \"" + experimentResult.getName() + "\" and id \""
          + experimentResult.getId() + "\" was promoted.");
    }
  }
}
