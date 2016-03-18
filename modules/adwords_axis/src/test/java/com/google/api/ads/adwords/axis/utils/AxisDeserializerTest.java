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

package com.google.api.ads.adwords.axis.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import com.google.api.ads.adwords.axis.utils.v201509.batchjob.BatchJobMutateResponse;
import com.google.api.ads.adwords.axis.utils.v201509.batchjob.MutateResult;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupCriterionServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201509.cm.AdGroupServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201509.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201509.cm.CampaignServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201509.cm.CriterionError;
import com.google.api.ads.adwords.axis.v201509.cm.Operand;
import com.google.common.collect.Lists;

import org.apache.axis.client.Call;
import org.apache.axis.encoding.TypeMapping;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xml.sax.SAXParseException;

import java.io.File;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.transform.TransformerException;

/**
 * Tests for {@link AxisDeserializer}.
 */
@RunWith(JUnit4.class)
public class AxisDeserializerTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Tests that a response with errors will be properly deserialized.
   */
  @Test
  public void testDeserializeBatchJobResponseWithErrors() throws Exception {
    BatchJobMutateResponse response = testDeserializeBatchJobResponse(
        AxisDeserializerTest.class.getResource("resources/BatchJobMutate.responseWithErrors.xml"));
    assertNotNull(response);
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
    BatchJobMutateResponse response =
        testDeserializeBatchJobResponse(AxisDeserializerTest.class.getResource(
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

  /**
   * Tests that an empty file will fail to parse.
   */
  @Test
  public void testDeserializeEmptyBatchJobResponse() throws Exception {
    File emptyFile = File.createTempFile(AxisDeserializerTest.class.getSimpleName(), "empty.xml");
    thrown.expect(TransformerException.class);
    thrown.expectCause(Matchers.<Exception>instanceOf(SAXParseException.class));
    testDeserializeBatchJobResponse(emptyFile.toURI().toURL());
  }

  private BatchJobMutateResponse testDeserializeBatchJobResponse(URL responseXmlUrl)
      throws Exception {
    QName operandQname = new QName("https://adwords.google.com/api/adwords/cm/v201509", "Operand");
    QName mutateResultQName =
        new QName("https://adwords.google.com/api/adwords/cm/v201509", "MutateResult");

    TypeMapping agcMapping = new AdGroupCriterionServiceSoapBindingStub() {
      @Override
      public Call _createCall() throws ServiceException {
        try {
          return super.createCall();
        } catch (RemoteException e) {
          throw new RuntimeException(e);
        }
      }
    }._createCall().getTypeMapping();

    TypeMapping adGroupMapping = new AdGroupServiceSoapBindingStub() {
      @Override
      public Call _createCall() throws ServiceException {
        try {
          return super.createCall();
        } catch (RemoteException e) {
          throw new RuntimeException(e);
        }
      }
    }._createCall().getTypeMapping();

    TypeMapping campaignMapping = new CampaignServiceSoapBindingStub() {
      @Override
      public Call _createCall() throws ServiceException {
        try {
          return super.createCall();
        } catch (RemoteException e) {
          throw new RuntimeException(e);
        }
      }
    }._createCall().getTypeMapping();

    List<TypeMapping> typeMappings = 
        Lists.newArrayList(campaignMapping, agcMapping, adGroupMapping);

    BatchJobMutateResponse response = new BatchJobMutateResponse();
    List<MutateResult> mutateResults =
        new AxisDeserializer().deserializeBatchJobMutateResults(responseXmlUrl, typeMappings,
            MutateResult.class, mutateResultQName, Operand.class, operandQname);
    response.setMutateResults(mutateResults.toArray(new MutateResult[0]));
    return response;
  }
}
