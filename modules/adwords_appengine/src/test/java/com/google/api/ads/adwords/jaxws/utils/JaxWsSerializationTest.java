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

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertNotNull;

import com.google.api.ads.adwords.jaxws.utils.v201708.batchjob.BatchJobMutateRequest;
import com.google.api.ads.adwords.jaxws.v201708.cm.AdGroup;
import com.google.api.ads.adwords.jaxws.v201708.cm.AdGroupOperation;
import com.google.api.ads.adwords.jaxws.v201708.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.jaxws.v201708.cm.Campaign;
import com.google.api.ads.adwords.jaxws.v201708.cm.CampaignOperation;
import com.google.api.ads.adwords.jaxws.v201708.cm.Operator;
import com.google.api.ads.common.lib.soap.jaxb.JaxBSerializer;
import com.google.api.ads.common.lib.soap.testing.CustomDifferenceListener;
import com.google.common.io.CharStreams;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.xml.namespace.QName;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.DifferenceListener;
import org.custommonkey.xmlunit.XMLAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xml.sax.SAXException;

/** Tests for JAX-WS serialization. */
@RunWith(JUnit4.class)
public class JaxWsSerializationTest {

  @SuppressWarnings("cast")
  @Test
  public void testSerializeBatchJobMutateRequest() throws IOException, SAXException {
    BatchJobMutateRequest request = new BatchJobMutateRequest();

    CampaignOperation campaignOp = new CampaignOperation();
    campaignOp.setOperator(Operator.ADD);
    Campaign campaign = new Campaign();
    campaign.setId(-1L);
    campaign.setName("Test campaign");
    campaign.setAdvertisingChannelType(AdvertisingChannelType.SEARCH);
    campaignOp.setOperand(campaign);

    request.addOperation(campaignOp);

    AdGroupOperation adGroupOp = new AdGroupOperation();
    adGroupOp.setOperator(Operator.ADD);
    AdGroup adGroup = new AdGroup();
    adGroup.setName("Test ad group");
    adGroup.setCampaignId(campaign.getId());
    adGroupOp.setOperand(adGroup);
    request.addOperation(adGroupOp);

    JaxBSerializer<BatchJobMutateRequest> serializer = new JaxBSerializer<BatchJobMutateRequest>(
        BatchJobMutateRequest.class,
        new QName("https://adwords.google.com/api/adwords/cm/v201708", "mutate"));

    String serializedRequest = serializer.serialize(request);

    assertNotNull("Null serialized request returned", serializedRequest);

    String expectedSerializedRequest =
        CharStreams.toString(
            new InputStreamReader(
                JaxWsSerializationTest.class.getResourceAsStream(
                    "resources/BatchJobMutate.request.xml"),
                UTF_8));

    // Perform XML diffs using the custom difference listener that properly handles namespaces
    // and attributes.
    Diff diff = new Diff(expectedSerializedRequest, serializedRequest);
    DifferenceListener diffListener = new CustomDifferenceListener();
    diff.overrideDifferenceListener(diffListener);
    XMLAssert.assertXMLEqual("Serialized request does not match expected value", diff, true);

    // Serialize again, this time without the XML declaration, and confirm the serialized XML
    // matches the expected string.
    serializedRequest = serializer.serialize(request, false);

    expectedSerializedRequest =
        expectedSerializedRequest.replaceFirst(
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");

    diff = new Diff(expectedSerializedRequest, serializedRequest);
    diff.overrideDifferenceListener(diffListener);
    XMLAssert.assertXMLEqual(
        "Serialized request with XML declaration excluded does not match expected value",
        diff,
        true);
  }
}

