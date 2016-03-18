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

package com.google.api.ads.adwords.lib.conf;

import static org.junit.Assert.assertFalse;

import com.google.api.ads.adwords.lib.AdWordsModule;
import com.google.common.io.Files;
import com.google.inject.Guice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Verifies that we correctly wire in all properties files to our
 * {@link AdWordsLibConfiguration}.
 */
@RunWith(JUnit4.class)
public class AdWordsLibConfigurationIntegrationTest {

  @Test
  public void testPropertyFileIncludedInConfig() throws Exception {
    File adsPropertiesFile = createPropertiesFile(); 
    System.setProperty("user.home", adsPropertiesFile.getParentFile().getAbsolutePath());
    AdWordsLibConfiguration config = Guice.createInjector(
        new AdWordsModule()).getInstance(AdWordsLibConfiguration.class);
    assertFalse(config.isAutoRefreshOAuth2TokenEnabled());
  }
  
  /**
   * Creates an ads.properties file.
   */
  private static File createPropertiesFile() throws IOException {
    File tempDir = Files.createTempDir();
    File adsPropertiesFile = new File(tempDir, "ads.properties");
    FileWriter fileWriter = new FileWriter(adsPropertiesFile);
    fileWriter.write("api.adwords.refreshOAuth2Token=false\n");
    fileWriter.flush();
    fileWriter.close();
    return adsPropertiesFile;
  }
}
