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

import com.google.api.ads.adwords.axis.v201806.cm.AdGroupCriterionServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201806.cm.AdGroupServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201806.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201806.cm.CampaignServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201806.cm.CriterionError;
import com.google.api.ads.adwords.axis.v201806.cm.MutateResult;
import com.google.common.collect.Lists;
import java.io.File;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.stream.XMLStreamException;
import org.apache.axis.client.Call;
import org.apache.axis.encoding.TypeMapping;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for {@link AxisDeserializer}. */
@RunWith(JUnit4.class)
public class AxisDeserializerTest {
  @Rule public ExpectedException thrown = ExpectedException.none();
  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  /** Tests that a response with errors will be properly deserialized. */
  @Test
  public void testDeserializeBatchJobResponseWithErrors() throws Exception {
    List<MutateResult> mutateResults =
        testDeserializeBatchJobResponse(
            AxisDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithErrors.xml"));
    assertNotNull(mutateResults);
    // Expect: Campaign, AdGroup, BiddableAdGroupCriterion, BiddableAdGroupCriterion,
    // CriterionError, CriterionError, CriterionError
    assertEquals(7, mutateResults.size());
    assertNotNull(mutateResults.get(0).getResult().getCampaign());
    assertNotNull(mutateResults.get(1).getResult().getAdGroup());
    assertNotNull(mutateResults.get(2).getResult().getAdGroupCriterion());
    assertThat(
        mutateResults.get(2).getResult().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
    assertNotNull(mutateResults.get(3).getResult().getAdGroupCriterion());
    assertThat(
        mutateResults.get(3).getResult().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
    assertThat(
        mutateResults.get(4).getErrorList().getErrors()[0],
        Matchers.instanceOf(CriterionError.class));
    assertThat(
        mutateResults.get(5).getErrorList().getErrors()[0],
        Matchers.instanceOf(CriterionError.class));
    assertThat(
        mutateResults.get(6).getErrorList().getErrors()[0],
        Matchers.instanceOf(CriterionError.class));
  }

  /** Tests that a response without errors will be properly deserialized. */
  @Test
  public void testDeserializeBatchJobResponseWithoutErrors() throws Exception {
    List<MutateResult> mutateResults =
        testDeserializeBatchJobResponse(
            AxisDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"));
    assertNotNull(mutateResults);
    // Expect: Campaign, AdGroup, BiddableAdGroupCriterion, BiddableAdGroupCriterion
    assertEquals(4, mutateResults.size());
    assertNotNull(mutateResults.get(0).getResult().getCampaign());
    assertNotNull(mutateResults.get(1).getResult().getAdGroup());
    assertNotNull(mutateResults.get(2).getResult().getAdGroupCriterion());
    assertThat(
        mutateResults.get(3).getResult().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
    assertNotNull(mutateResults.get(3).getResult().getAdGroupCriterion());
    assertThat(
        mutateResults.get(3).getResult().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
  }

  /** Tests that an empty file will fail to parse. */
  @Test
  public void testDeserializeEmptyBatchJobResponse() throws Exception {
    File emptyFile = tempFolder.newFile("empty.xml");
    thrown.expect(XMLStreamException.class);
    testDeserializeBatchJobResponse(emptyFile.toURI().toURL());
  }

  /** Tests that a response with errors will be properly deserialized in paging. */
  @Test
  public void testDeserializeBatchJobResponsePagingWithErrors() throws Exception {
    List<MutateResult> mutateResults =
        testDeserializeBatchJobResponse(
            AxisDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithErrors.xml"),
            2,
            4);
    assertNotNull(mutateResults);
    // Expect: BiddableAdGroupCriterion, BiddableAdGroupCriterion, CriterionError, CriterionError
    assertEquals(4, mutateResults.size());
    assertEquals(2, mutateResults.get(0).getIndex().longValue());
    assertNotNull(mutateResults.get(0).getResult().getAdGroupCriterion());
    assertThat(
        mutateResults.get(0).getResult().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
    assertNotNull(mutateResults.get(1).getResult().getAdGroupCriterion());
    assertThat(
        mutateResults.get(1).getResult().getAdGroupCriterion(),
        Matchers.instanceOf(BiddableAdGroupCriterion.class));
    assertThat(
        mutateResults.get(2).getErrorList().getErrors()[0],
        Matchers.instanceOf(CriterionError.class));
    assertThat(
        mutateResults.get(3).getErrorList().getErrors()[0],
        Matchers.instanceOf(CriterionError.class));
  }

  /** Tests that a response without errors will be properly deserialized in paging. */
  @Test
  public void testDeserializeBatchJobResponsePagingWithoutErrors() throws Exception {
    List<MutateResult> mutateResults =
        testDeserializeBatchJobResponse(
            AxisDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"),
            0,
            3);
    assertNotNull(mutateResults);
    assertEquals(3, mutateResults.size());

    // Expect: Campaign, AdGroup, BiddableAdGroupCriterion
    assertNotNull(mutateResults.get(0).getResult().getCampaign());
    assertEquals(0, mutateResults.get(0).getIndex().longValue());
    assertNotNull(mutateResults.get(1).getResult().getAdGroup());
    assertNotNull(mutateResults.get(2).getResult().getAdGroupCriterion());

    mutateResults =
        testDeserializeBatchJobResponse(
            AxisDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"),
            2,
            2);
    assertNotNull(mutateResults);
    assertEquals(2, mutateResults.size());
    assertEquals(2, mutateResults.get(0).getIndex().longValue());

    mutateResults =
        testDeserializeBatchJobResponse(
            AxisDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"),
            0,
            10);
    assertNotNull(mutateResults);
    assertEquals(4, mutateResults.size());
    assertEquals(0, mutateResults.get(0).getIndex().longValue());

    mutateResults =
        testDeserializeBatchJobResponse(
            AxisDeserializerTest.class.getResource(
                "resources/BatchJobMutate.responseWithoutErrors.xml"),
            5,
            5);
    assertNotNull(mutateResults);
    assertEquals(0, mutateResults.size());
  }

  private List<MutateResult> testDeserializeBatchJobResponse(URL responseXmlUrl) throws Exception {
    return testDeserializeBatchJobResponse(responseXmlUrl, 0, Integer.MAX_VALUE);
  }

  private List<MutateResult> testDeserializeBatchJobResponse(
      URL responseXmlUrl, int startIndex, int numberResults) throws Exception {
    QName mutateResultQName =
        new QName("https://adwords.google.com/api/adwords/cm/v201806", "MutateResult");

    TypeMapping agcMapping =
        new AdGroupCriterionServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping();

    TypeMapping adGroupMapping =
        new AdGroupServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping();

    TypeMapping campaignMapping =
        new CampaignServiceSoapBindingStub() {
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

    List<MutateResult> mutateResults =
        new AxisDeserializer()
            .deserializeBatchJobMutateResults(
                responseXmlUrl,
                typeMappings,
                MutateResult.class,
                mutateResultQName,
                startIndex,
                numberResults);
    return mutateResults;
  }
}
