// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.jaxws.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import com.google.api.ads.adwords.jaxws.AdWordsJaxWsModule;
import com.google.api.ads.adwords.jaxws.utils.v201809.batchjob.BatchJobMutateResponse;
import com.google.api.ads.adwords.jaxws.utils.v201809.batchjob.MutateResult;
import com.google.api.ads.adwords.jaxws.v201809.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.jaxws.v201809.cm.CriterionError;
import com.google.inject.Guice;
import com.google.inject.Inject;
import java.net.URL;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for JAX-WS BatchJob Response dSserialization. */
@RunWith(JUnit4.class)
public class JaxWsBatchJobResponseDeserializerTest {
  @Rule public ExpectedException thrown = ExpectedException.none();
  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  @Inject private JaxWsBatchJobResponseDeserializer deserializer;

  @Before
  public void setUp() {
    Guice.createInjector(new AdWordsJaxWsModule()).injectMembers(this);
  }

  @Test
  public void testDeserializeBatchJobMutateResponseWithErrors() throws Exception {
    BatchJobMutateResponse response =
        deserializer.deserializeBatchJobMutateResults(
            BatchJobMutateResponse.class,
            JaxWsBatchJobResponseDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithErrors.xml"));

    assertNotNull("Null deserialized request returned", response);

    // Expect: Campaign, AdGroup, BiddableAdGroupCriterion, BiddableAdGroupCriterion,
    // CriterionError, CriterionError, CriterionError
    assertEquals(7, response.getMutateResults().length);
    assertNotNull(response.getMutateResults()[0].getOperand().getCampaign());
    assertNotNull(response.getMutateResults()[1].getOperand().getAdGroup());
    assertNotNull(response.getMutateResults()[2].getOperand().getAdGroupCriterion());
    assertThat(
        response.getMutateResults()[2].getOperand().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
    assertNotNull(response.getMutateResults()[3].getOperand().getAdGroupCriterion());
    assertThat(
        response.getMutateResults()[3].getOperand().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
    assertThat(
        response.getMutateResults()[4].getErrorList().getErrors()[0],
        Matchers.instanceOf(CriterionError.class));
    assertThat(
        response.getMutateResults()[5].getErrorList().getErrors()[0],
        Matchers.instanceOf(CriterionError.class));
    assertThat(
        response.getMutateResults()[6].getErrorList().getErrors()[0],
        Matchers.instanceOf(CriterionError.class));
  }

  /** Tests that a response without errors will be properly deserialized. */
  @Test
  public void testDeserializeBatchJobResponseWithoutErrors() throws Exception {
    BatchJobMutateResponse response =
        deserializer.deserializeBatchJobMutateResults(
            BatchJobMutateResponse.class,
            JaxWsBatchJobResponseDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"));
    assertNotNull(response);
    // Expect: Campaign, AdGroup, BiddableAdGroupCriterion, BiddableAdGroupCriterion
    assertEquals(4, response.getMutateResults().length);
    assertNotNull(response.getMutateResults()[0].getOperand().getCampaign());
    assertNotNull(response.getMutateResults()[1].getOperand().getAdGroup());
    assertNotNull(response.getMutateResults()[2].getOperand().getAdGroupCriterion());
    assertThat(
        response.getMutateResults()[3].getOperand().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
    assertNotNull(response.getMutateResults()[3].getOperand().getAdGroupCriterion());
    assertThat(
        response.getMutateResults()[3].getOperand().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
  }

  // /** Tests that an empty file will fail to parse. */
  // @Test
  // public void testDeserializeEmptyBatchJobResponse() throws Exception {
  //   File emptyFile = tempFolder.newFile("empty.xml");
  //   thrown.expect(XMLStreamException.class);
  //   testDeserializeBatchJobResponse(emptyFile.toURI().toURL());
  // }

  /** Tests that a response with errors will be properly deserialized in paging. */
  @Test
  public void testDeserializeBatchJobResponsePagingWithErrors() throws Exception {
    MutateResult[] mutateResults =
        testDeserializeBatchJobResponse(
            JaxWsBatchJobResponseDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithErrors.xml"),
            2,
            4);

    assertNotNull(mutateResults);
    // Expect: BiddableAdGroupCriterion, BiddableAdGroupCriterion, CriterionError, CriterionError
    assertEquals(4, mutateResults.length);
    assertEquals(2, mutateResults[0].getIndex().longValue());
    assertNotNull(mutateResults[0].getOperand().getAdGroupCriterion());
    assertThat(
        mutateResults[0].getOperand().getAdGroupCriterion(),
        Matchers.instanceOf(
            com.google.api.ads.adwords.jaxws.v201809.cm.BiddableAdGroupCriterion.class));
    assertNotNull(mutateResults[1].getOperand().getAdGroupCriterion());
    assertThat(
        mutateResults[1].getOperand().getAdGroupCriterion(),
        Matchers.instanceOf(
            com.google.api.ads.adwords.jaxws.v201809.cm.BiddableAdGroupCriterion.class));
    assertThat(
        mutateResults[2].getErrorList().getErrors()[0],
        Matchers.instanceOf(com.google.api.ads.adwords.jaxws.v201809.cm.CriterionError.class));
    assertThat(
        mutateResults[3].getErrorList().getErrors()[0],
        Matchers.instanceOf(com.google.api.ads.adwords.jaxws.v201809.cm.CriterionError.class));
  }

  /** Tests that a response without errors will be properly deserialized in paging. */
  @Test
  public void testDeserializeBatchJobResponsePagingWithoutErrors() throws Exception {
    MutateResult[] mutateResults =
        testDeserializeBatchJobResponse(
            JaxWsBatchJobResponseDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"),
            0,
            3);

    assertNotNull(mutateResults);
    assertEquals(3, mutateResults.length);

    // Expect: Campaign, AdGroup, BiddableAdGroupCriterion
    assertNotNull(mutateResults[0].getOperand().getCampaign());
    assertEquals(0, mutateResults[0].getIndex().longValue());
    assertNotNull(mutateResults[1].getOperand().getAdGroup());
    assertNotNull(mutateResults[2].getOperand().getAdGroupCriterion());

    mutateResults =
        testDeserializeBatchJobResponse(
            JaxWsBatchJobResponseDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"),
            2,
            2);
    assertNotNull(mutateResults);
    assertEquals(2, mutateResults.length);
    assertEquals(2, mutateResults[0].getIndex().longValue());

    mutateResults =
        testDeserializeBatchJobResponse(
            JaxWsBatchJobResponseDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"),
            0,
            10);
    assertNotNull(mutateResults);
    assertEquals(4, mutateResults.length);
    assertEquals(0, mutateResults[0].getIndex().longValue());

    mutateResults =
        testDeserializeBatchJobResponse(
            JaxWsBatchJobResponseDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"),
            5,
            5);
    assertNull(mutateResults);
  }

  private MutateResult[] testDeserializeBatchJobResponse(
      URL responseXmlUrl, int startIndex, int numberResults) throws Exception {

    return deserializer
        .deserializeBatchJobMutateResults(
            BatchJobMutateResponse.class, responseXmlUrl, startIndex, numberResults)
        .getMutateResults();
  }
}
