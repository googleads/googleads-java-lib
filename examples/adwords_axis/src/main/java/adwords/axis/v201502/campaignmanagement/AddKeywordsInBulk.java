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

package adwords.axis.v201502.campaignmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201502.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201502.cm.ApiError;
import com.google.api.ads.adwords.axis.v201502.cm.BasicJobStatus;
import com.google.api.ads.adwords.axis.v201502.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201502.cm.BulkMutateJobPolicy;
import com.google.api.ads.adwords.axis.v201502.cm.BulkMutateJobSelector;
import com.google.api.ads.adwords.axis.v201502.cm.Job;
import com.google.api.ads.adwords.axis.v201502.cm.JobResult;
import com.google.api.ads.adwords.axis.v201502.cm.Keyword;
import com.google.api.ads.adwords.axis.v201502.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201502.cm.MutateJobServiceInterface;
import com.google.api.ads.adwords.axis.v201502.cm.Operand;
import com.google.api.ads.adwords.axis.v201502.cm.Operation;
import com.google.api.ads.adwords.axis.v201502.cm.Operator;
import com.google.api.ads.adwords.axis.v201502.cm.SimpleMutateJob;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This code sample illustrates how to perform asynchronous requests using the
 * MutateJobService.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class AddKeywordsInBulk {

  private static final long RETRY_INTERVAL = 5;
  private static final long RETRIES_COUNT = 12;
  private static final long KEYWORD_NUMBER = 100;
  private static final Pattern INDEX_REGEX = Pattern.compile("operations\\[(\\d+)\\].*");

  private static int getOperationIndex(String fieldPath) {
    Matcher m = INDEX_REGEX.matcher(fieldPath);
    if (!m.matches()) {
      throw new IllegalArgumentException("Invalid fieldPath: " + fieldPath);
    }
    return Integer.valueOf(m.group(1));
  }

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

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, Long adGroupId) throws Exception {
    // Get the MutateJobService.
    MutateJobServiceInterface mutateJobService =
        adWordsServices.get(session, MutateJobServiceInterface.class);

    Random r = new Random();
    List<AdGroupCriterionOperation> operations = new ArrayList<AdGroupCriterionOperation>();

    // Create AdGroupCriterionOperations to add keywords.
    for (int i = 0; i < KEYWORD_NUMBER; i++) {
      // Create Keyword.
      String text = String.format("mars%d", i);

      // Make 10% of keywords invalid to demonstrate error handling.
      if (r.nextInt() % 10 == 0) {
        text = text + "!!!";
      }
      Keyword keyword = new Keyword();
      keyword.setText(text);
      keyword.setMatchType(KeywordMatchType.BROAD);

      // Create BiddableAdGroupCriterion.
      BiddableAdGroupCriterion bagc = new BiddableAdGroupCriterion();
      bagc.setAdGroupId(adGroupId);
      bagc.setCriterion(keyword);

      // Create AdGroupCriterionOperation.
      AdGroupCriterionOperation agco = new AdGroupCriterionOperation();
      agco.setOperand(bagc);
      agco.setOperator(Operator.ADD);

      // Add to list.
      operations.add(agco);
    }

    // You can specify up to 3 job IDs that must successfully complete before
    // this job can be processed.
    BulkMutateJobPolicy policy = new BulkMutateJobPolicy();
    policy.setPrerequisiteJobIds(new long[] {});

    // Call mutate to create a new job.
    SimpleMutateJob response =
        mutateJobService.mutate(operations.toArray(new Operation[operations.size()]), policy);

    long jobId = response.getId();
    System.out.printf("Job with ID %d was successfully created.\n", jobId);

    // Create selector to retrieve job status and wait for it to complete.
    BulkMutateJobSelector selector = new BulkMutateJobSelector();
    selector.setJobIds(new long[] {jobId});

    // Poll for job status until it's finished.
    System.out.println("Retrieving job status...");
    SimpleMutateJob jobStatusResponse = null;
    BasicJobStatus status = null;
    for (int i = 0; i < RETRIES_COUNT; i++) {
      Job[] jobs = mutateJobService.get(selector);
      jobStatusResponse = (SimpleMutateJob) jobs[0];
      status = jobStatusResponse.getStatus();
      if (status == BasicJobStatus.COMPLETED || status == BasicJobStatus.FAILED) {
        break;
      }
      System.out.printf("[%d] Current status is '%s', waiting %d seconds to retry...\n", i,
          status.toString(), RETRY_INTERVAL);
      Thread.sleep(RETRY_INTERVAL * 1000);
    }

    // Handle unsuccessful results.
    if (status == BasicJobStatus.FAILED) {
      throw new IllegalStateException("Job failed with reason: "
          + jobStatusResponse.getFailureReason());
    }
    if (status == BasicJobStatus.PENDING || status == BasicJobStatus.PROCESSING) {
      throw new IllegalAccessException("Job did not complete within "
          + ((RETRIES_COUNT - 1) * RETRY_INTERVAL) + " seconds.");
    }

    // Status must be COMPLETED.
    // Get the job result. Here we re-use the same selector.
    JobResult result = mutateJobService.getResult(selector);

    // Output results.
    int i = 0;
    for (Operand operand : result.getSimpleMutateResult().getResults()) {
      String outcome = operand.getPlaceHolder() == null ? "SUCCESS" : "FAILED";
      System.out.printf("Operation [%d] - %s\n", i++, outcome);
    }

    // Output errors.
    for (ApiError error : result.getSimpleMutateResult().getErrors()) {
      int index = getOperationIndex(error.getFieldPath());
      String reason = error.getErrorString();
      System.out.printf("ERROR - keyword '%s' failed due to '%s'\n",
          ((Keyword) operations.get(index).getOperand().getCriterion()).getText(), reason);
    }
  }
}
