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

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertFalse;

import com.google.api.ads.dfp.lib.DfpModule;
import com.google.inject.Guice;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Verifies that we correctly wire in all properties files to our {@link DfpLibConfiguration}.
 * This test should be run in its own JVM because it makes changes to system properties that could
 * cause issues with other integration tests.
 */
@RunWith(JUnit4.class)
public class DfpLibConfigurationIntegrationTest {

  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  @Test
  public void testPropertyFileIncludedInConfig() throws Exception {
    File adsPropertiesFile = createPropertiesFile();
    System.setProperty("user.home", adsPropertiesFile.getParentFile().getAbsolutePath());
    DfpLibConfiguration config =
        Guice.createInjector(new DfpModule()).getInstance(DfpLibConfiguration.class);
    assertFalse(config.isAutoRefreshOAuth2TokenEnabled());
  }

  /** Creates an ads.properties file. */
  private File createPropertiesFile() throws IOException {
    File tempDir = tempFolder.newFolder();
    File adsPropertiesFile = new File(tempDir, "ads.properties");
    Writer fileWriter = Files.newBufferedWriter(adsPropertiesFile.toPath(), UTF_8);
    fileWriter.write("api.dfp.refreshOAuth2Token=false\n");
    fileWriter.flush();
    fileWriter.close();
    return adsPropertiesFile;
  }
}
