// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import com.google.api.ads.adwords.jaxws.utils.v201802.batchjob.BatchJobMutateResponse;
import com.google.api.ads.adwords.jaxws.v201802.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.jaxws.v201802.cm.CriterionError;
import com.google.api.ads.common.lib.soap.jaxb.JaxBDeserializer;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

/**
 * Tests for JAX-WS serialization.
 */
@RunWith(JUnit4.class)
public class JaxWsDeserializationTest {
  private JaxBDeserializer<BatchJobMutateResponse> deserializer =
      new JaxBDeserializer<BatchJobMutateResponse>(BatchJobMutateResponse.class);

  @Test
  public void testDeserializeBatchJobMutateRequest() {
    Source source = new StreamSource(JaxWsDeserializationTest.class.getResourceAsStream(
        "resources/BatchJobMutate.responseWithErrors.xml"));
    BatchJobMutateResponse response = deserializer.deserialize(source);

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

  /**
   * Tests that a response without errors will be properly deserialized.
   */
  @Test
  public void testDeserializeBatchJobResponseWithoutErrors() throws Exception {
    Source source = new StreamSource(JaxWsDeserializationTest.class.getResourceAsStream(
        "resources/BatchJobMutate.responseWithoutErrors.xml"));
    BatchJobMutateResponse response = deserializer.deserialize(source);
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
}
