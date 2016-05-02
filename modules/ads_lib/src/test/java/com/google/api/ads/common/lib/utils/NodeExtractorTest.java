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

package com.google.api.ads.common.lib.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.common.collect.Lists;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.nio.charset.StandardCharsets;

import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Tests for {@link NodeExtractor}.
 */
@RunWith(JUnit4.class)
public class NodeExtractorTest {

  private final NodeExtractor nodeExtractor = new NodeExtractor();

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testNullXPaths_fails() {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("xpath");
    nodeExtractor.extractNode(null, null);
  }

  @Test
  public void testNullParentNode() {
    Node node = nodeExtractor.extractNode(null, Lists.newArrayList("Foo"));
    assertNull("Given a null parent node, should return null", node);
  }

  @Test
  public void testXPathExistsWithoutNamespaces() throws Exception {
    String xml = "<Header><requestId>123456</requestId></Header>";
    Document document =
        DocumentBuilderFactory.newInstance()
            .newDocumentBuilder()
            .parse(Streams.wrapString(xml, StandardCharsets.UTF_8));
    Node node = nodeExtractor.extractNode(document, Lists.newArrayList("Header", "requestId"));
    assertEquals(
        "Given an xpath in the XML, should return its node",
        "123456",
        node.getFirstChild().getNodeValue());
  }

  @Test
  public void testXPathExistsMultipleTimesWithoutNamespaces() throws Exception {
    String xml = "<Header><requestId>123456</requestId><requestId>78910</requestId></Header>";
    Document document =
        DocumentBuilderFactory.newInstance()
            .newDocumentBuilder()
            .parse(Streams.wrapString(xml, StandardCharsets.UTF_8));
    Node node = nodeExtractor.extractNode(document, Lists.newArrayList("Header", "requestId"));
    assertEquals(
        "Given an xpath in the XML, should return its node",
        "123456",
        node.getFirstChild().getNodeValue());
  }

  @Test
  public void testXPathExistsWithNamespaces() throws Exception {
    String xml =
        "<?xml version='1.0' encoding='UTF-8'?>"
            + "<soap:Envelope xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'>"
            + "    <soap:Header>"
            + "        <ResponseHeader xmlns='https://adwords.google.com/api/adwords/cm/v209901'>"
            + "            <requestId>123456</requestId>"
            + "            <serviceName>BatchJobService</serviceName>"
            + "            <methodName>mutate</methodName>"
            + "            <operations>1</operations>"
            + "            <responseTime>247</responseTime>"
            + "        </ResponseHeader>"
            + "    </soap:Header>"
            + "</soap:Envelope>";
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    documentBuilderFactory.setNamespaceAware(true);
    Document document =
        documentBuilderFactory
            .newDocumentBuilder()
            .parse(Streams.wrapString(xml, StandardCharsets.UTF_8));
    Node node =
        nodeExtractor.extractNode(
            document, Lists.newArrayList("Envelope", "Header", "ResponseHeader", "requestId"));
    assertNotNull(node);
    assertEquals(
        "Given an xpath in the XML, should return its node",
        "123456",
        node.getFirstChild().getNodeValue());
  }

  @Test
  public void testXPathDoesNotExist() throws Exception {
    String xml = "<Header><requestId>123456</requestId></Header>";
    Document document =
        DocumentBuilderFactory.newInstance()
            .newDocumentBuilder()
            .parse(Streams.wrapString(xml, StandardCharsets.UTF_8));
    Node node = nodeExtractor.extractNode(document, Lists.newArrayList("Foo"));
    assertNull("Given an xpath not in the XML, should return null", node);
  }
}
