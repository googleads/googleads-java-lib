// Copyright 2011, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfa.lib.client;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.dfa.lib.testing.mocks.axis.v1_12.MockServiceRemote;
import com.google.api.ads.dfa.lib.testing.mocks.axis.v1_12.MockServiceRemoteServiceLocator;
import com.google.common.base.Joiner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test for the {@link DfaServiceDescriptor} class.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class DfaServiceDescriptorTest {

  private DfaServiceDescriptor dfaServiceDescriptor;

  private static final Class<?> INTERFACE_CLASS = MockServiceRemote.class;
  private static final String VERSION = "v1.12";

  public DfaServiceDescriptorTest() {}

  @Before
  public void setUp() {
    dfaServiceDescriptor = new DfaServiceDescriptor(INTERFACE_CLASS, VERSION);
  }

  @Test
  public void testGetLocatorClass() throws Exception {
    assertEquals(MockServiceRemoteServiceLocator.class, dfaServiceDescriptor.getLocatorClass());
  }

  @Test
  public void testGetServiceName() {
    assertEquals("mockservice", dfaServiceDescriptor.getServiceName());
  }

  @Test
  public void testGetServiceName_placementStrategy() {
    DfaServiceDescriptor strategyServiceDescriptor =
        new DfaServiceDescriptor(PlacementStrategyRemote.class, VERSION);
    assertEquals("strategy", strategyServiceDescriptor.getServiceName());
  }

  @Test
  public void testGetEndpointAddress() {
    String endpointServer = "endpointServer";
    assertEquals(Joiner.on("/").join(endpointServer, VERSION, "api", "dfa-api", "mockservice"),
        dfaServiceDescriptor.getEndpointAddress(endpointServer));
  }

  /**
   * Used to test special behavior on {@code Class} objects with this name.
   */
  private interface PlacementStrategyRemote {}
}
