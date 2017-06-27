// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.soap.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.RequestInfoXPathSet;
import com.google.api.ads.common.lib.soap.ResponseInfoXPathSet;
import com.google.api.ads.common.lib.soap.SoapServiceDescriptor;
import com.google.api.ads.common.lib.soap.axis.testing.mocks.v201611.MockAxisCompatibleServiceDescriptor;
import com.google.api.ads.common.lib.soap.axis.testing.mocks.v201611.MockAxisServiceInterface;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import org.apache.axis.EngineConfigurationFactory;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.transport.http.HTTPConstants;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link AxisHandler}.
 */
@RunWith(JUnit4.class)
public class AxisHandlerTest {

  private AxisHandler axisHandler;
  private Stub stub;
  
  @Mock
  private EngineConfigurationFactory engineConfigurationFactory;
  @Mock
  private RequestInfoXPathSet requestInfoXPathSet;
  @Mock
  private ResponseInfoXPathSet responseInfoXPathSet;
  
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    axisHandler =
        new AxisHandler(engineConfigurationFactory, requestInfoXPathSet, responseInfoXPathSet);
    stub = axisHandler.createSoapClient(new MockAxisCompatibleServiceDescriptor());
  }

  @Test
  public void testCreateSoapClient_failNotAxisCompatible() {
    thrown.expect(ServiceException.class);
    axisHandler.createSoapClient(Mockito.mock(SoapServiceDescriptor.class));
  }
  
  @Test
  public void testCreateSoapClient_axisCompatible() {
    assertNotNull("createSoapClient returned a null Stub", stub);
    assertTrue("createSoapClient did not return an implementation of the service interface",
        stub instanceof MockAxisServiceInterface);
    MockAxisServiceInterface mockAxisServiceInterface = (MockAxisServiceInterface) stub;
    assertEquals("getTestMessage did not return the correct message",
        MockAxisServiceInterface.TEST_MESSAGE, mockAxisServiceInterface.getTestMessage());
    String expectedPrefixedMessage = "myPrefix." + MockAxisServiceInterface.TEST_MESSAGE;
    assertEquals("getTestMessageWithPrefix did not return the correct message",
        expectedPrefixedMessage, mockAxisServiceInterface.getTestMessageWithPrefix("myPrefix."));
  }
  
  @Test
  public void testSetAndGetHeader_valid() {
    axisHandler.setHeader(stub, "namespace", "header", "foo");
    SOAPHeaderElement headerElement = (SOAPHeaderElement) axisHandler.getHeader(stub, "header");
    assertNotNull("getHeader did not return the header that was just set", headerElement);
    assertEquals("value of the header did not match the value set", "foo",
        headerElement.getValue());
  }
  
  @Test
  public void testSetChildHeader_failParentMissing() {
    thrown.expect(NullPointerException.class);
    axisHandler.setHeaderChild(stub, "parent", "child", "123");
  }
  
  @Test
  public void testSetChildHeader_valid() {
    Map<String, String> parentValue = Maps.newHashMap();
    axisHandler.setHeader(stub, "namespace", "parent", parentValue);
    String childValue = "123";
    axisHandler.setHeaderChild(stub, "parent", "child", childValue);

    assertEquals("Child was not set to the expected value on the parent header's underlying map",
        childValue, parentValue.get("child"));

    SOAPHeaderElement parentHeaderElement =
        (SOAPHeaderElement) axisHandler.getHeader(stub, "parent");
    @SuppressWarnings("unchecked")
    Map<String, String> actualParentValue =
        (Map<String, String>) parentHeaderElement.getObjectValue();

    String actualChildValue = actualParentValue.get("child");
    assertEquals("Child retrieved by navigating through the parent header does not have the "
        + "expected value", childValue, actualChildValue);

    assertEquals("The only key in the parent header's underlying map should be the child added",
        Sets.newHashSet("child"), parentValue.keySet());
  }

  /**
   * Test that invoking clearHeaders with a handler and stub without any headers set
   * does not fail.
   */
  @Test
  public void testClearHeaders_succeedWhenEmpty() {
    axisHandler.clearHeaders(stub);
    assertEquals("stub.getHeaders is not empty after invoking clearHeaders", 0,
        stub.getHeaders().length);
  }
  
  @Test
  public void testClearHeaders_succeedWhenNotEmpty() {
    axisHandler.setHeader(stub, "namespace", "someHeader", "someValue");
    axisHandler.clearHeaders(stub);
    assertEquals("stub.getHeaders is not empty after invoking clearHeaders", 0,
        stub.getHeaders().length);
    assertNull("getHeader returned a non-null header after invoking clearHeaders",
        axisHandler.getHeader(stub, "someHeader"));
  }
  
  @Test
  public void testSetCompression_true() {
    axisHandler.setCompression(stub, true);
    assertTrue((Boolean) stub._getProperty(HTTPConstants.MC_ACCEPT_GZIP));
    assertTrue((Boolean) stub._getProperty(HTTPConstants.MC_GZIP_REQUEST));
  }

  @Test
  public void testSetCompression_false() {
    axisHandler.setCompression(stub, false);
    assertFalse((Boolean) stub._getProperty(HTTPConstants.MC_ACCEPT_GZIP));
    assertFalse((Boolean) stub._getProperty(HTTPConstants.MC_GZIP_REQUEST));
  }
  
  @Test
  public void testSetRequestTimeout() {
    axisHandler.setRequestTimeout(stub, 12345);
    assertEquals(12345, stub.getTimeout());
  }
}
