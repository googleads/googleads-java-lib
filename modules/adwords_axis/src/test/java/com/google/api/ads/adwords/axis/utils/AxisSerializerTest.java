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

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.google.api.ads.adwords.axis.utils.v201809.batchjob.BatchJobMutateRequest;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201809.cm.Campaign;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201809.cm.Operation;
import com.google.api.ads.adwords.axis.v201809.cm.Operator;
import com.google.common.collect.Lists;
import com.google.common.io.CharStreams;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.List;
import org.apache.axis.encoding.SerializationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xml.sax.SAXException;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

/** Tests for {@link AxisSerializer}. */
@RunWith(JUnit4.class)
public class AxisSerializerTest {
  @Test
  public void testSerialize() throws SAXException, IOException {
    BatchJobMutateRequest mutate = new BatchJobMutateRequest();

    List<Operation> ops = Lists.newArrayList();
    Campaign campaign = new Campaign();
    campaign.setId(-1L);
    campaign.setName("Test campaign");
    campaign.setAdvertisingChannelType(AdvertisingChannelType.SEARCH);
    ops.add(new CampaignOperation(Operator.ADD, "ADD", campaign));

    AdGroup adGroup = new AdGroup();
    adGroup.setName("Test ad group");
    adGroup.setCampaignId(campaign.getId());

    ops.add(new AdGroupOperation(Operator.ADD, "ADD", adGroup));

    mutate.setOperations(ops.toArray(new Operation[0]));
    AxisSerializer serializer = new AxisSerializer();
    StringWriter writer = new StringWriter();
    SerializationContext context = new SerializationContext(writer);
    context.setSendDecl(true);
    context.setPretty(true);
    serializer.serialize(mutate, context);

    String serializedRequest = writer.toString();
    assertNotNull("Serialized request is null", serializedRequest);

    String expectedSerializedRequest =
        CharStreams.toString(
            new InputStreamReader(
                AxisSerializerTest.class.getResourceAsStream(
                    "resources/BatchJobMutate.request.xml"),
                UTF_8));
    Diff diff =
        DiffBuilder.compare(expectedSerializedRequest)
            .withTest(serializedRequest)
            .checkForSimilar()
            .build();
    assertFalse("Serialized request does not match expected XML", diff.hasDifferences());
  }
}
