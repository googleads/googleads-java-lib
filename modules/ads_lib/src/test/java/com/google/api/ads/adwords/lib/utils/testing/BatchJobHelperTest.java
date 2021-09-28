// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.utils.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.verify;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateRequestInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResponseInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResultInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadStatus;
import com.google.api.ads.adwords.lib.utils.BatchJobUploader;
import com.google.api.ads.adwords.lib.utils.logging.BatchJobLogger;
import com.google.api.ads.common.lib.utils.AdsUtilityRegistry;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Base class for tests of {@link BatchJobHelperInterface} implementations.
 *
 * <p>
 * Abstract methods allow subclasses to provide version and SOAP toolkit-specific objects for
 * testing.
 */
@RunWith(JUnit4.class)
public abstract class BatchJobHelperTest<
    OperationT, OperandT, ErrorT, ResultT extends BatchJobMutateResultInterface<OperandT, ErrorT>,
    ResponseT extends BatchJobMutateResponseInterface<OperandT, ErrorT, ResultT>> {

  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  @Mock protected AdWordsSession session;
  protected AdsUtilityRegistry adsUtilityRegistry;
  @Mock protected BatchJobLogger batchJobLogger;
  @Mock private BatchJobUploader uploader;

  private BatchJobHelperInterface<OperationT, OperandT, ErrorT, ResultT, ResponseT> batchJobHelper;
  private ImmutableList<OperationT> operations;

  private static final String UPLOAD_URL = "https://www.example.com/upload";
  private static final Long TEST_CAMPAIGN_ID = 12345L;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    adsUtilityRegistry = AdsUtilityRegistry.getInstance();
    batchJobHelper = createBatchJobHelper(uploader);
    operations = ImmutableList.<OperationT>of(getPauseCampaignOperation(TEST_CAMPAIGN_ID));
  }

  @Test
  public void testDownloadBatchJobMutateResponse() throws BatchJobException, IOException {
    File tempFile = tempFolder.newFile();
    OutputStream responseOutputStream = new FileOutputStream(tempFile);
    Streams.write(getResponseString(), responseOutputStream, StandardCharsets.UTF_8);
    ResponseT downloadResponse =
        batchJobHelper.downloadBatchJobMutateResponse(tempFile.toURI().toURL().toString());
    assertDownloadResponse(downloadResponse);
  }
  
  /**
   * Verifies that the helper handles the case where the response does not contain any results.
   */
  @Test
  public void testDownloadBatchJobMutateResponse_emptyResponse()
      throws BatchJobException, IOException {
    String noResultsResponse = String.format("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
        + "<mutateResponse xmlns=\"https://adwords.google.com/api/adwords/cm/%s\">"
        + "</mutateResponse>", getVersion());
    File tempFile = tempFolder.newFile();
    OutputStream responseOutputStream = new FileOutputStream(tempFile);
    Streams.write(noResultsResponse, responseOutputStream, StandardCharsets.UTF_8);
    ResponseT downloadResponse =
        batchJobHelper.downloadBatchJobMutateResponse(tempFile.toURI().toURL().toString());
    assertNotNull("Download response is null", downloadResponse);
    if (expectNullResultsForEmptyResponse()) {
      assertNull(
          "Mutate results of download response should be null",
          downloadResponse.getMutateResults());
    } else {
      assertNotNull(
          "Mutate results of download response is null", downloadResponse.getMutateResults());
      assertEquals(
          "Size of mutate results of an empty download response != 0",
          0,
          downloadResponse.getMutateResults().length);
    }
  }

  @Test
  public void testUploadBatchJobOperations() throws BatchJobException {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0L, URI.create(UPLOAD_URL));
    batchJobHelper.uploadBatchJobOperations(operations, UPLOAD_URL);
    verify(uploader)
        .uploadIncrementalBatchJobOperations(
            ArgumentMatchers.<BatchJobMutateRequestInterface>any(),
            ArgumentMatchers.eq(true),
            ArgumentMatchers.eq(status));
  }

  @Test
  public void testUploadIncrementalBatchJobOperations() throws BatchJobException {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0L, URI.create(UPLOAD_URL));
    batchJobHelper.uploadIncrementalBatchJobOperations(operations, false, status);
    verify(uploader)
        .uploadIncrementalBatchJobOperations(
            ArgumentMatchers.<BatchJobMutateRequestInterface>any(),
            ArgumentMatchers.eq(false),
            ArgumentMatchers.eq(status));
  }

  @Test
  public void testUploadIncrementalBatchJobOperations_isLastRequest() throws BatchJobException {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0L, URI.create(UPLOAD_URL));
    batchJobHelper.uploadIncrementalBatchJobOperations(operations, true, status);
    verify(uploader)
        .uploadIncrementalBatchJobOperations(
            ArgumentMatchers.<BatchJobMutateRequestInterface>any(),
            ArgumentMatchers.eq(true),
            ArgumentMatchers.eq(status));
  }

  /**
   * Returns the {@link BatchJobHelperInterface} for this test's version and SOAP toolkit.
   */
  protected abstract BatchJobHelperInterface<OperationT, OperandT, ErrorT, ResultT, ResponseT>
      createBatchJobHelper(BatchJobUploader uploader);

  /**
   * Returns a {@code CampaignOperation} that sets the status to {@code PAUSED} for the campaign
   * with the specified {@code campaignId}.
   */
  protected abstract OperationT getPauseCampaignOperation(Long campaignId);

  /**
   * Subclasses should override to confirm that the response contains the deserialized entries from
   * {@link #getResponseString()}.
   */
  protected abstract void assertDownloadResponse(ResponseT downloadResponse);

  /**
   * Returns if the framework is expected to return a response with a {@code null}
   * {@code ResultT} collection if the XML does not contain any result elements.
   */
  protected abstract boolean expectNullResultsForEmptyResponse();
  
  /**
   * Returns the AdWords API version being tested.
   */
  protected abstract String getVersion();

  /**
   * Returns the test download response string after substituting the API version and test campaign
   * ID.
   */
  private String getResponseString() {
    return String.format(
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
            + "<mutateResponse xmlns=\"https://adwords.google.com/api/adwords/cm/%s\">"
            + "  <rval>"
            + "    <result>"
            + "      <Campaign>"
            + "        <id>%d</id>"
            + "        <status>PAUSED</status>"
            + "      </Campaign>"
            + "    </result>"
            + "  </rval>"
            + "</mutateResponse>",
        getVersion(),
        TEST_CAMPAIGN_ID);
  }
}
