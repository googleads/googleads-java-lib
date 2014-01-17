// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.lib.conf;

import static org.junit.Assert.assertEquals;

import com.google.api.ads.dfp.lib.DfpModule;
import com.google.inject.Guice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Verifies that we correctly wire in all properties files to our
 * {@link DfpApiConfiguration}.
 * 
 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class DfpApiConfigurationIntegrationTest {

  @Test
  public void testJarApiPropertiesFileIncludedInConfig() throws Exception {
    DfpApiConfiguration config = Guice.createInjector(
        new DfpModule()).getInstance(DfpApiConfiguration.class);
    assertEquals("https://www.google.com/apis/ads/publisher", config.getNamespacePrefix());
  }
}
