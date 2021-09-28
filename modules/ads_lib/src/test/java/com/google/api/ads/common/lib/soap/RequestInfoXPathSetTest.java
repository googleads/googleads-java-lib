// Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.soap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.RequestInfo.Builder;
import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.api.ads.common.lib.utils.NodeExtractor;
import com.google.common.base.Supplier;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

/** Tests for {@link RequestInfoXPathSet}. */
@RunWith(JUnit4.class)
public class RequestInfoXPathSetTest {

  @Mock private AdsApiConfiguration apiConfig;
  @Mock private NodeExtractor nodeExtractor;
  @Mock private Supplier<Transformer> transformerSupplier;
  @Mock private Transformer transformer;
  @Mock private Logger logger;
  private RequestInfoXPathSet xPathSet;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    when(apiConfig.getRequestContextXPath()).thenReturn("/foo/bar");
    xPathSet = new RequestInfoXPathSet(apiConfig, nodeExtractor, transformerSupplier, logger);
  }

  @Test
  public void testGettersWithNullConfigXPaths() {
    when(apiConfig.getRequestContextXPath()).thenReturn(null);
    xPathSet = new RequestInfoXPathSet(apiConfig, nodeExtractor, transformerSupplier, logger);
    assertNull(
        "getContextName should have returned null when no context XPath was supplied",
        xPathSet.getContextName());
    assertFalse(
        "getContextXPath should have returned an empty iterator when no context XPath was supplied",
        xPathSet.getContextXPath().iterator().hasNext());
  }

  @Test
  public void testGettersWithConfigXPaths() {
    assertArrayEquals(
        new String[] {"foo", "bar"}, Iterables.toArray(xPathSet.getContextXPath(), String.class));
    assertEquals(
        "getContextName should return the last element of the context XPath",
        "bar",
        xPathSet.getContextName());
  }

  @Test
  public void testParseWithNullBuilder_fails() {
    thrown.expect(NullPointerException.class);
    xPathSet.parseMessage((Builder) null, Mockito.mock(SOAPMessage.class));
  }

  @Test
  public void testParseWithNullMessage() {
    Builder builder = Mockito.mock(Builder.class);
    assertSame(
        "parseMessage should return the same builder passed in",
        builder,
        xPathSet.parseMessage(builder, null));
    // Message was null, so no methods should have been called on the builder.
    verifyNoMoreInteractions(builder);
  }

  @Test
  public void testParseWithNullSoapPart() {
    Builder builder = Mockito.mock(Builder.class);
    SOAPMessage message = Mockito.mock(SOAPMessage.class);
    when(message.getSOAPPart()).thenReturn(null);
    assertSame(
        "parseMessage should return the same builder passed in",
        builder,
        xPathSet.parseMessage(builder, message));
    // SOAPPart was null, so no methods should have been called on the builder.
    verifyNoMoreInteractions(builder);
  }

  @Test
  public void testParseTransformException() throws  TransformerException {
    Builder builder = Mockito.mock(Builder.class);
    SOAPMessage message = Mockito.mock(SOAPMessage.class);
    doThrow(TransformerException.class)
        .when(transformer).transform(any(Source.class), any(Result.class));
    assertSame(
        "parseMessage should return the same builder passed in",
        builder,
        xPathSet.parseMessage(builder, message)
    );
  }

  @Test
  public void testParseWithNullTransformer() {
    Builder builder = Mockito.mock(Builder.class);
    when(transformerSupplier.get()).thenReturn(null);
    SOAPMessage message = Mockito.mock(SOAPMessage.class);
    when(message.getSOAPPart()).thenReturn(Mockito.mock(SOAPPart.class));
    assertSame(
        "parseMessage should return the same builder passed in",
        builder,
        xPathSet.parseMessage(builder, message));
    // Transformer was null, so no methods should have been called on the builder.
    verifyNoMoreInteractions(builder);
  }

  @Test
  public void testParseActualMessage() throws SOAPException, IOException, TransformerException {
    Builder builder = new Builder();
    SOAPMessage message = Mockito.mock(SOAPMessage.class);
    SOAPHeader header = Mockito.mock(SOAPHeader.class);
    SOAPPart soapPart = Mockito.mock(SOAPPart.class);
    when(message.getSOAPHeader()).thenReturn(header);
    when(message.getSOAPPart()).thenReturn(soapPart);
    final String payload = "<foo><bar>MyBar</bar></foo>";
    when(transformerSupplier.get()).thenReturn(transformer);
    doAnswer(
            invocation -> {
              StreamResult streamResult = (StreamResult) invocation.getArguments()[1];
              streamResult.getOutputStream().write(payload.getBytes(StandardCharsets.UTF_8));
              return null;
            })
        .when(transformer)
        .transform(any(), any());
    assertSame(
        "parseMessage should return the same builder passed in",
        builder,
        xPathSet.parseMessage(builder, message));
    RequestInfo requestInfo = builder.build();
    assertEquals("Payload doesn't match", payload, requestInfo.getPayload());
    assertEquals("Context name doesn't match", "bar", requestInfo.getContextName());
  }

  @Test
  public void testToString() {
    when(apiConfig.getRequestContextXPath()).thenReturn("/foo/bar");
    String toString = xPathSet.toString();
    assertThat(
        "Missing label for context XPath", toString, Matchers.containsString("contextXPath"));
    assertThat(
        "toString should contain all of the context XPath elements",
        toString,
        Matchers.stringContainsInOrder(Arrays.asList("foo", "bar")));
    assertThat("Missing label for context name", toString, Matchers.containsString("contextName"));
  }
}
