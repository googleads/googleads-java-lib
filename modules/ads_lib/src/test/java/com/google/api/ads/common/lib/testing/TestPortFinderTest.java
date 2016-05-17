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

package com.google.api.ads.common.lib.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Joiner;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.NoSuchElementException;
import java.util.Properties;

/**
 * Tests for {@link TestPortFinder}.
 */
@RunWith(JUnit4.class)
public class TestPortFinderTest {

  /**
   * The override of unused ports from system properties. If set to {@code null}, then
   * either the system property was not set or was set to the empty string.
   */
  private String unusedPortsSystemPropertyValue;
  
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  @Before
  public void setUp() {
    unusedPortsSystemPropertyValue = System.getProperty(TestPortFinder.UNUSED_PORTS_PROPERTY_KEY);
    if (unusedPortsSystemPropertyValue != null) {
      assertFalse(
          "Override of unused ports is the empty string. Set to a valid list of integers instead.",
          unusedPortsSystemPropertyValue.isEmpty());
    }
  }
  
  /**
   * Tests that the port picker is able to check out and release unused ports if no
   * overrides are specified.
   */
  @Test
  public void test_noOverrides() {
    Properties properties = new Properties();
    if (unusedPortsSystemPropertyValue != null) {
      // If port overrides were specified in system properties, then that's an indication
      // that the environment does not support dynamic discovery of open ports, so include
      // the port overrides in the Properties object sent to the constructor. 
      properties.setProperty(TestPortFinder.UNUSED_PORTS_PROPERTY_KEY,
          unusedPortsSystemPropertyValue);
    }
    
    TestPortFinder portFinder = new TestPortFinder(properties);
    
    // Make sure at least one port can be retrieved.
    int port = portFinder.checkOutUnusedPort();
    assertTrue(port > 0);
    portFinder.releaseUnusedPort(port);
  }
  
  /**
   * Tests that the port picker is able to check out and release unused ports if
   * overrides are specified.
   */
  @Test
  public void test_overridesPresent() {
    Properties properties = new Properties();
    Integer[] expectedPorts = new Integer[] {9990, 9991, 9992, 9993, 9994};
    properties.setProperty(TestPortFinder.UNUSED_PORTS_PROPERTY_KEY,
        Joiner.on(',').join(expectedPorts));
    
    TestPortFinder portFinder = new TestPortFinder(properties);
    for (Integer expectedPort : expectedPorts) {
      Integer actualPort = portFinder.checkOutUnusedPort();
      assertEquals(expectedPort, actualPort);
    }
    
    // Release the checked out ports.
    for (Integer expectedPort : expectedPorts) {
      portFinder.releaseUnusedPort(expectedPort);
    }
  }
  
  /**
   * Tests that the port picker constructor will fail if override value is an empty string
   * instead of a comma-separated list of valid integers.
   */
  @Test
  public void test_overridesPresent_butEmpty_fails() {
    Properties properties = new Properties();
    properties.setProperty(TestPortFinder.UNUSED_PORTS_PROPERTY_KEY, "");

    thrown.expect(NumberFormatException.class);
    new TestPortFinder(properties);
  }
  
  /**
   * Tests that when overrides are specified, {@link TestPortFinder#checkOutUnusedPort()}
   * will fail if all available ports are checked out.
   */
  @Test
  public void test_overridesPresent_exceedAvailable_fails() {
    Properties properties = new Properties();
    Integer[] expectedPorts = new Integer[] {9990, 9991, 9992, 9993, 9994};
    properties.setProperty(TestPortFinder.UNUSED_PORTS_PROPERTY_KEY,
        Joiner.on(',').join(expectedPorts));
    
    TestPortFinder portFinder = new TestPortFinder(properties);
    for (Integer expectedPort : expectedPorts) {
      Integer actualPort = portFinder.checkOutUnusedPort();
      assertEquals(expectedPort, actualPort);
    }
    
    thrown.expect(NoSuchElementException.class);
    portFinder.checkOutUnusedPort();
  }
  
  /**
   * Tests that the port picker constructor will fail if overrides contain non-integer values.
   */
  @Test
  public void test_overridesPresent_butInvalid_fails() {
    Properties properties = new Properties();
    properties.setProperty(TestPortFinder.UNUSED_PORTS_PROPERTY_KEY,
        "9990,999abc");
    
    thrown.expect(NumberFormatException.class);
    new TestPortFinder(properties);
  }
}

