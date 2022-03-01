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

package com.google.api.ads.common.lib.soap.axis.conf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.soap.axis.HttpHandler;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.axis.AxisEngine;
import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.EngineConfigurationFactory;
import org.apache.axis.Handler;
import org.apache.axis.TargetedChain;
import org.apache.axis.client.AxisClient;
import org.apache.axis.configuration.EngineConfigurationFactoryDefault;
import org.apache.axis.configuration.EngineConfigurationFactoryFinder;
import org.apache.axis.server.AxisServer;
import org.apache.axis.transport.java.JavaSender;
import org.apache.axis.transport.local.LocalSender;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link AdsAxisEngineConfigurationFactory}. The key behavior to test is:
 * <ol>
 * <li>The AdsAxisEngineConfigurationFactory should only override the default client configuration
 * if compression is enabled in the AdsLibConfiguration <em>and</em> there is no custom WSDD client
 * config set.</li>
 * <li>The AdsAxisEngineConfigurationFactory should never override the default server configuration.
 * </li>
 * </ol>
 */
@RunWith(JUnit4.class)
public class AdsAxisEngineConfigurationFactoryTest {

  private AdsAxisEngineConfigurationFactory adsAxisConfigFactory;

  private AxisClient defaultAxisClient;
  private AxisServer defaultAxisServer;

  @Mock
  private AdsLibConfiguration adsLibConfiguration;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    adsAxisConfigFactory = new AdsAxisEngineConfigurationFactory(adsLibConfiguration);

    EngineConfigurationFactory defaultAxisConfigFactory =
        EngineConfigurationFactoryFinder.newFactory();
    defaultAxisClient = new AxisClient(defaultAxisConfigFactory.getClientEngineConfig());
    defaultAxisServer = new AxisServer(defaultAxisConfigFactory.getServerEngineConfig());
  }

  /**
   * Tests that the client engine config returned by the factory enabled matches
   * the settings in ads-axis-client.wsdd regardless of compression settings.
   */
  @Test
  public void testGetClientEngineConfig_compressionEnabled() throws Exception {
    List<Boolean> compressionEnabledSettings = Lists.newArrayList(Boolean.TRUE, Boolean.FALSE);

    for (Boolean compressionEnabledSetting : compressionEnabledSettings) {
      when(adsLibConfiguration.isCompressionEnabled()).thenReturn(compressionEnabledSetting);

      assertNull(
          EngineConfigurationFactoryDefault.OPTION_CLIENT_CONFIG_FILE
              + " property is unexpectedly set",
          System.getProperty(EngineConfigurationFactoryDefault.OPTION_CLIENT_CONFIG_FILE));

      EngineConfiguration clientEngineConfig = adsAxisConfigFactory.getClientEngineConfig();
      assertNotNull("No client engine config returned", clientEngineConfig);

      AxisClient axisClient = new AxisClient(clientEngineConfig);

      assertEquals(
          HttpHandler.class, getTransport(axisClient, "http").getPivotHandler().getClass());

      assertEquals(
          LocalSender.class, getTransport(axisClient, "local").getPivotHandler().getClass());

      assertEquals(JavaSender.class, getTransport(axisClient, "java").getPivotHandler().getClass());

      assertTransportConfiguration(
          new AxisServer(adsAxisConfigFactory.getServerEngineConfig()), defaultAxisServer);
    }
  }

  @Test
  public void testGetClientEngineConfig_factoryOverrideSet() throws Exception {

    try {
      // Set the client config file system property to the default client config WSDD in the
      // Axis library and then verify that the axis client's transport is configured according
      // to the default configuration factory, NOT the AdsAxisEngineConfigurationFactory.
      System.setProperty(
          EngineConfigurationFactoryDefault.OPTION_CLIENT_CONFIG_FILE,
          "/org/apache/axis/client/client-config.wsdd");
      EngineConfiguration clientEngineConfig = adsAxisConfigFactory.getClientEngineConfig();
      assertNotNull("No client engine config returned", clientEngineConfig);

      AxisClient axisClient = new AxisClient(clientEngineConfig);

      assertTransportConfiguration(axisClient, defaultAxisClient);

      assertTransportConfiguration(
          new AxisServer(adsAxisConfigFactory.getServerEngineConfig()), defaultAxisServer);
    } finally {
      System.clearProperty(EngineConfigurationFactoryDefault.OPTION_CLIENT_CONFIG_FILE);
    }
  }

  /**
   * Asserts that the axis client's transport configuration matches that of the prototype axis
   * client.
   */
  private void assertTransportConfiguration(AxisClient axisClient, AxisClient prototypeAxisClient)
      throws AxisFault {
    for (String transportName : new String[] {"http", "local", "java"}) {
      assertEquals("Pivot handler is not of the expected type",
          getTransport(prototypeAxisClient, transportName).getPivotHandler().getClass(),
          getTransport(axisClient, transportName).getPivotHandler().getClass());
    }
  }

  /**
   * Asserts that the axis server's transport configuration matches that of the prototype axis
   * server.
   */
  private void assertTransportConfiguration(AxisServer axisServer, AxisServer prototypeAxisServer)
      throws AxisFault {
    assertEquals("Request handler is not of the expected type",
        getTransport(prototypeAxisServer, "http").getRequestHandler().getClass(),
        getTransport(axisServer, "http").getRequestHandler().getClass());

    assertEquals("Response handler is not of the expected type",
        getTransport(prototypeAxisServer, "local").getResponseHandler().getClass(),
        getTransport(axisServer, "local").getResponseHandler().getClass());
  }

  /**
   * Utility method for getting the underlying named transport from an AxisEngine and casting it to
   * a TargetedChain.
   */
  private TargetedChain getTransport(AxisEngine axisEngine, String transportName) throws AxisFault {
    Handler transport = axisEngine.getTransport(transportName);
    assertNotNull("No " + transportName + " transport returned from the configured engine",
        transport);

    assertTrue("The " + transportName + " transport is not of the expected type",
        transport instanceof TargetedChain);
    return (TargetedChain) transport;
  }

}
