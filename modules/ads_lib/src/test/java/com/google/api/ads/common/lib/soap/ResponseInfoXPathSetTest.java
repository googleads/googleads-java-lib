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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.client.ResponseInfo.Builder;
import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.api.ads.common.lib.utils.NodeExtractor;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
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
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/** Tests for {@link ResponseInfoXPathSet}. */
@RunWith(JUnit4.class)
public class ResponseInfoXPathSetTest {

  @Mock private AdsApiConfiguration apiConfig;
  @Mock private NodeExtractor nodeExtractor;
  private ResponseInfoXPathSet xPathSet;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    when(apiConfig.getResponseOperationsCountXPath()).thenReturn("/foo/bar/operations");
    xPathSet = new ResponseInfoXPathSet(apiConfig, nodeExtractor);
  }

  @Test
  public void testGettersWithNullConfigXPaths() {
    apiConfig = Mockito.mock(AdsApiConfiguration.class);
    xPathSet = new ResponseInfoXPathSet(apiConfig, nodeExtractor);
    assertFalse(
        "getOperationsXPath should have returned an empty iterator",
        xPathSet.getOperationsCountXPath().iterator().hasNext());
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
        xPathSet.parseMessage(builder, (SOAPMessage) null));
    // Message was null, so no methods should have been called on the builder.
    verifyZeroInteractions(builder);
  }

  @Test
  public void testParseActualMessage() throws SOAPException, IOException {
    Builder builder = new Builder();
    SOAPMessage message = Mockito.mock(SOAPMessage.class);
    SOAPHeader header = Mockito.mock(SOAPHeader.class);
    when(message.getSOAPHeader()).thenReturn(header);
    final String payload = "<foo><bar>MyBar</bar></foo>";
    doAnswer(
            new Answer<Void>() {
              @Override
              public Void answer(InvocationOnMock invocation) throws Throwable {
                OutputStream outputStream = (OutputStream) invocation.getArguments()[0];
                outputStream.write(payload.getBytes(StandardCharsets.UTF_8));
                return null;
              }
            })
        .when(message)
        .writeTo(org.mockito.Matchers.any(OutputStream.class));
    assertSame(
        "parseMessage should return the same builder passed in",
        builder,
        xPathSet.parseMessage(builder, message));
    ResponseInfo responseInfo = builder.build();
    assertEquals("Payload doesn't match", payload, responseInfo.getPayload());
  }

  @Test
  public void testToString() {
    String toString = xPathSet.toString();
    assertThat(
        "Missing label for request ID XPath", toString, Matchers.containsString("requestIdXPath"));
    assertThat(
        "Missing label for response time XPath",
        toString,
        Matchers.containsString("responseTimeXPath"));
    assertThat(
        "Missing label for operations count XPath",
        toString,
        Matchers.containsString("operationsCountXPath"));
    assertThat(
        "toString should contain all of the operations XPath elements",
        toString,
        Matchers.stringContainsInOrder(Arrays.asList("foo", "bar", "operations")));
  }
}
