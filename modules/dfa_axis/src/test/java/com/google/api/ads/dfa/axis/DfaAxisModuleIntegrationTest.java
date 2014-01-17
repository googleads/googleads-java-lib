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

package com.google.api.ads.dfa.axis;

import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.testing.mocks.v1_12.FunRemote;
import com.google.api.ads.dfa.lib.client.DfaSession;

import junit.framework.TestCase;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Ensures that all of the Guice bindings work correctly when a
 * {@link DfaAxisModule} is installed.
 *
 * @author Joseph DiLallo
 */
@RunWith(JUnit4.class)
public class DfaAxisModuleIntegrationTest extends TestCase {

  public DfaAxisModuleIntegrationTest() {}

  /**
   * Test module integration. The factory should be able to instantiate a
   * {@code Stub} without any exceptions.
   */
  @Test
  public void testModuleIntegration() throws Exception {
    PropertiesConfiguration config = new PropertiesConfiguration();
    config.setProperty("api.dfa.username", "email");
    config.setProperty("api.dfa.password", "password");
    config.setProperty("api.dfa.applicationName", "1234567890");
    config.setProperty("api.dfa.environment", "test");

    DfaSession session =
        new DfaSession.Builder().from(config).build();

    DfaServices dfaServices = new DfaServices();
    FunRemote service = dfaServices.get(session, FunRemote.class);
  }
}
