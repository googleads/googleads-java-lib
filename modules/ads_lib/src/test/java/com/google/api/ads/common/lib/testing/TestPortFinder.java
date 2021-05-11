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

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.openqa.selenium.net.PortProber;

import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Properties;

/**
 * Registry of available ports for tests. If the test environment does not support dynamic
 * discovery of available ports, you can override the list of available ports by setting
 * the {@link #UNUSED_PORTS_PROPERTY_KEY} system property to a comma-separated list of integers.
 */
public class TestPortFinder {

  /** System property key for overriding the comma-separated list of available unused ports. */
  public static final String UNUSED_PORTS_PROPERTY_KEY =
      "com.google.api.ads.common.lib.testing.TestPortFinder.unusedPorts";
  
  private static final TestPortFinder INSTANCE = new TestPortFinder(System.getProperties());
  
  /**
   * The registry of available ports from the {@link #UNUSED_PORTS_PROPERTY_KEY} system property,
   * if specified. If the system property is not set, this will be {@code null}. 
   */
  private final Deque<Integer> availablePorts;
  
  @VisibleForTesting
  TestPortFinder(Properties properties) {
    String availablePortsString = properties.getProperty(UNUSED_PORTS_PROPERTY_KEY);
    if (availablePortsString == null) {
      availablePorts = null;
    } else {
      availablePorts = Lists.newLinkedList();
      for (String availablePortString : Splitter.on(',').split(availablePortsString)) {
        availablePorts.add(Integer.valueOf(availablePortString));
      }
    }
  }
  
  /**
   * Returns the singleton of this class.
   */
  public static TestPortFinder getInstance() {
    return INSTANCE;
  }

  /**
   * Checks out the next available unused port. Callers should send the returned port
   * back to {@link #releaseUnusedPort(int)} when it's no longer being used.
   * 
   * @throws NoSuchElementException if no unused port is available.
   */
  public synchronized int checkOutUnusedPort() {
    if (availablePorts == null) {
      return PortProber.findFreePort();
    } else if (availablePorts.isEmpty()) {
      // All available ports are checked out.
      throw new NoSuchElementException("No unused ports are available");
    }
    return availablePorts.pop();
  }

  /**
   * Returns the specified unused port to the list of available ports.
   */
  public synchronized void releaseUnusedPort(int unusedPort) {
    if (availablePorts == null) {
      // Nothing to do in this case.
      return;
    }
    availablePorts.addLast(unusedPort);
  }
}

