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

package com.google.api.ads.common.lib.conf;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.common.lib.conf.ConfigurationHelper.ConfigurationInfo;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.configuration.AbstractConfiguration;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.SystemConfiguration;
import org.apache.commons.lang.SystemUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Test for {@link ConfigurationHelper}.
 */
@RunWith(JUnit4.class)
public class ConfigurationHelperTest {

  private ConfigurationHelper configurationHelper;
  private Map<String, String> test1Properties;
  private Map<String, String> test3Properties;
  private String[] allPropertyKeys = {"a.b.c", "a.b.d", "e.f.g", "e.f.h", "i.j.k", "testProperty"};

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  @Before
  public void setUp() {
    AbstractConfiguration.setDefaultListDelimiter(',');
    clearTestSystemProperties();
    this.configurationHelper = new ConfigurationHelper();
    this.test1Properties =
            ImmutableMap.of(
                "a.b.c", "efgh",
                "a.b.d", "1234");

    this.test3Properties =
        ImmutableMap.of(
            "a.b.c", "jklm",
            "e.f.h", "90123",
            "i.j.k", "foo");
  }

  @Test
  public void testUnsupportedConfigurationInfo() {
    thrown.expect(IllegalArgumentException.class);
    new ConfigurationInfo<Long>(1234L, false);
  }

  @Test
  public void testSupportedConfigurationInfo() throws Exception {
    ConfigurationInfo<String> unused1 = new ConfigurationInfo<String>("1234", false);
    ConfigurationInfo<URL> unused2 =
        new ConfigurationInfo<URL>(new URL("http://google.com"), false);
  }

  @Test
  public void testNewConfigurationInfoList_optional() throws Exception {
    List<ConfigurationInfo<URL>> configurationInfos =
        ConfigurationHelper.newList(
            Lists.newArrayList(new URL("http://google.com"), new URL("https://google.com")), true);
    assertEquals(2, configurationInfos.size());
    assertEquals(new URL("http://google.com"), configurationInfos.get(0).getLocation());
    assertTrue(configurationInfos.get(0).isOptional());
    assertEquals(new URL("https://google.com"), configurationInfos.get(1).getLocation());
    assertTrue(configurationInfos.get(1).isOptional());
  }

  @Test
  public void testNewConfigurationInfoList_required() {
    List<ConfigurationInfo<String>> configurationInfos =
        ConfigurationHelper.newList(Lists.newArrayList("1234", "5678"), false);
    assertEquals(2, configurationInfos.size());
    assertEquals("1234", configurationInfos.get(0).getLocation());
    assertFalse(configurationInfos.get(0).isOptional());
    assertEquals("5678", configurationInfos.get(1).getLocation());
    assertFalse(configurationInfos.get(1).isOptional());
  }

  @Test
  public void testNewConfigurationInfoList_null() throws Exception {
    assertNull(ConfigurationHelper.newList(null, true));
  }

  @Test
  public void testNewConfigurationInfoList_nullArguments() throws Exception {
    thrown.expect(IllegalArgumentException.class);
    ConfigurationHelper.newList(true, (Object[]) null);
  }

  @Test
  public void testFromFile_stringExists() throws Exception {
    Configuration configuration =
        configurationHelper.fromFile(createPropertiesFile(test1Properties).toString());
    assertPropertiesEquals(test1Properties, configuration);
  }

  @Test
  public void testFromFile_stringDoesNotExist() throws Exception {
    thrown.expect(ConfigurationLoadException.class);
    configurationHelper.fromFile("/" + System.currentTimeMillis());
  }

  @Test
  public void testFromFile_fileExists() throws Exception {
    Configuration configuration =
        configurationHelper.fromFile(createPropertiesFile(test1Properties));
    assertPropertiesEquals(test1Properties, configuration);
  }

  @Test
  public void testFromFile_urlExists() throws Exception {
    Configuration configuration =
        configurationHelper.fromFile(createPropertiesFile(test1Properties).toURI().toURL());
    assertPropertiesEquals(test1Properties, configuration);
  }

  @Test
  public void testFromFile_urlDoesNotExist() throws Exception {
    thrown.expect(ConfigurationLoadException.class);
    configurationHelper.fromFile(new URL("file:///" + System.currentTimeMillis()));
  }

  @Test
  public void testFromFile_urlClasspathExists() throws Exception {
    Configuration configuration =
        configurationHelper.fromFile(ConfigurationHelperTest.class
            .getResource("props/test1.properties"));
    assertPropertiesEquals(test1Properties, configuration);
  }

  /**
   * Asserts that reading list values from a properties file works properly when the default
   * list delimiter is not modified.
   */
  @Test
  public void testFromFile_listValuesWithDefaultDelimiterUnchanged() throws Exception {
    Configuration configuration = configurationHelper.fromFile(ConfigurationHelperTest.class
        .getResource("props/test3.properties"));
    assertPropertiesEquals(test3Properties, configuration);
    String[] stringArray = configuration.getStringArray("i.j.k");
    assertArrayEquals(new String[]{"foo", "bar"}, stringArray);
  }

  /**
   * Asserts that reading list values from a properties file works properly when the default
   * list delimiter is modified.
   */
  @Test
  public void testFromFile_listValuesWithDefaultDelimiterChanged() throws Exception {
    AbstractConfiguration.setDefaultListDelimiter('|');
    Configuration configuration = configurationHelper.fromFile(
        ConfigurationHelperTest.class.getResource("props/test3.properties"));
    assertPropertiesEquals(test3Properties, configuration);
    String[] stringArray = configuration.getStringArray("i.j.k");
    assertArrayEquals(new String[] {"foo", "bar"}, stringArray);
  }

  @Test
  public void testFromSystem() throws Exception {
    test3Properties.forEach(System::setProperty);
    assertContains(test3Properties, configurationHelper.fromSystem());
  }

  @Test
  public void testFromSystem_containsListValues() throws Exception {
    AbstractConfiguration.setDefaultListDelimiter('|');
    Map<String, String> properties = Maps.newHashMap();
    properties.put("testProperty", "b,bee");

    properties.forEach(System::setProperty);

    Splitter splitter = Splitter.on(',');
    Configuration systemConfiguration = configurationHelper.fromSystem();
    for (Entry<String, String> entry : properties.entrySet()) {
      String[] actualValues = systemConfiguration.getStringArray(entry.getKey());
      String[] expectedValues;
      if ("line.separator".equals(entry.getKey())) {
        expectedValues = new String[] {SystemUtils.LINE_SEPARATOR};
      } else {
        expectedValues = splitter.splitToList(entry.getValue()).toArray(new String[0]);
      }
      assertArrayEquals(String.format("Values for key %s do not match", entry.getKey()),
          expectedValues, actualValues);
    }
  }

  @Test
  public void testCreateCombinedConfiguration_justSystem() throws Exception {
    SystemConfiguration systemConfig = new SystemConfiguration();
    systemConfig.setTrimmingDisabled(true);
    assertContains(systemConfig,
        configurationHelper.createCombinedConfiguration(null, null));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredUrlOverride() throws Exception {
    test1Properties.forEach(System::setProperty);

    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(null,
        Lists.<ConfigurationInfo<URL>>newArrayList(new ConfigurationInfo<URL>(
            ConfigurationHelperTest.class.getResource("props/test3.properties"), true)));

    assertEquals("efgh", configuration.getString("a.b.c"));
    assertEquals("1234", configuration.getString("a.b.d"));
    assertEquals("testValue", configuration.getString("testProperty"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredUrlNoOverride() throws Exception {
    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(null,
        Lists.<ConfigurationInfo<URL>>newArrayList(new ConfigurationInfo<URL>(
            ConfigurationHelperTest.class.getResource("props/test3.properties"), true)));

    assertEquals("jklm", configuration.getString("a.b.c"));
    assertEquals("testValue", configuration.getString("testProperty"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_optionalUrlOverride() throws Exception {
    test1Properties.forEach(System::setProperty);

    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(null,
        Lists.<ConfigurationInfo<URL>>newArrayList(new ConfigurationInfo<URL>(
            ConfigurationHelperTest.class.getResource("props/test3.properties"), true)));

    assertEquals("efgh", configuration.getString("a.b.c"));
    assertEquals("1234", configuration.getString("a.b.d"));
    assertEquals("testValue", configuration.getString("testProperty"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_optionalUrlNotFound() throws Exception {
    test1Properties.forEach(System::setProperty);

    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(null,
        Lists.<ConfigurationInfo<URL>>newArrayList(new ConfigurationInfo<URL>(
            new URL("file:///does/not/exist" + System.currentTimeMillis()), true)));

    assertEquals("efgh", configuration.getString("a.b.c"));
    assertEquals("1234", configuration.getString("a.b.d"));
    assertEquals("testValue", configuration.getString("testProperty"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredUrlNotFound() throws Exception {
    test1Properties.forEach(System::setProperty);

    System.setProperty("testProperty", "testValue");

    thrown.expect(ConfigurationLoadException.class);
    configurationHelper.createCombinedConfiguration(null,
        Lists.<ConfigurationInfo<URL>>newArrayList(new ConfigurationInfo<URL>(
            new URL("file:///does/not/exist" + System.currentTimeMillis()), false)));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredUrlOptionalPathOverride() throws Exception {
    System.setProperty("e.f.h", "5678");

    Configuration configuration = configurationHelper.createCombinedConfiguration(
        Lists.<ConfigurationInfo<String>>newArrayList(
            new ConfigurationInfo<String>(
                createPropertiesFile(test3Properties).toString(), false)),
        Lists.<ConfigurationInfo<URL>>newArrayList(
            new ConfigurationInfo<URL>(
                ConfigurationHelperTest.class.getResource("props/test1.properties"), true)));

    assertEquals("jklm", configuration.getString("a.b.c"));
    assertEquals("1234", configuration.getString("a.b.d"));
    assertEquals("5678", configuration.getString("e.f.h"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredUrlrequiredPathNoOverride() throws Exception {
    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(
        Lists.<ConfigurationInfo<String>>newArrayList(
            new ConfigurationInfo<String>(
                createPropertiesFile(test1Properties).toString(), false)),
        Lists.<ConfigurationInfo<URL>>newArrayList(
            new ConfigurationInfo<URL>(
                ConfigurationHelperTest.class.getResource("props/test2.properties"), false)));

    assertEquals("testValue", configuration.getString("testProperty"));
    assertEquals("efgh", configuration.getString("a.b.c"));
    assertEquals("1234", configuration.getString("a.b.d"));
    assertEquals("xyz", configuration.getString("e.f.g"));
    assertEquals("5678", configuration.getString("e.f.h"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredUrlrequiredPathOptionalNotExist()
      throws Exception {
    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(
        Lists.<ConfigurationInfo<String>>newArrayList(
            new ConfigurationInfo<String>("test4.properties", true)),
        Lists.<ConfigurationInfo<URL>>newArrayList(
            new ConfigurationInfo<URL>(
                ConfigurationHelperTest.class.getResource("props/test2.properties"), false)));

    assertEquals("testValue", configuration.getString("testProperty"));
    assertEquals("xyz", configuration.getString("e.f.g"));
    assertEquals("5678", configuration.getString("e.f.h"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredPathsOverride()
      throws Exception {
    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(
        Lists.<ConfigurationInfo<String>>newArrayList(
            new ConfigurationInfo<String>(
                createPropertiesFile(test3Properties).toString(), false),
            new ConfigurationInfo<String>(
                createPropertiesFile(test1Properties).toString(), false)), null);

    assertEquals("testValue", configuration.getString("testProperty"));
    assertEquals("jklm", configuration.getString("a.b.c"));
    assertEquals("1234", configuration.getString("a.b.d"));
    assertEquals("90123", configuration.getString("e.f.h"));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredPathsOverrideUrl()
      throws Exception {
    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(
        Lists.<ConfigurationInfo<String>>newArrayList(
            new ConfigurationInfo<String>(
                createPropertiesFile(test3Properties).toString(), false),
            new ConfigurationInfo<String>(
                createPropertiesFile(test1Properties).toString(), false)),
        Lists.<ConfigurationInfo<URL>>newArrayList(
            new ConfigurationInfo<URL>(
                ConfigurationHelperTest.class.getResource("props/test2.properties"), false)));

    assertEquals("testValue", configuration.getString("testProperty"));
    assertEquals("jklm", configuration.getString("a.b.c"));
    assertEquals("1234", configuration.getString("a.b.d"));
    assertEquals("90123", configuration.getString("e.f.h"));
    assertEquals("xyz", configuration.getString("e.f.g"));
  }

  /**
   * Creates a properties file from the map.
   */
  private File createPropertiesFile(Map<String, String> properties) throws IOException {
    File file = tempFolder.newFile();
    Writer fileWriter = Files.newBufferedWriter(file.toPath(), UTF_8);
    for (Map.Entry<String, String> entry : properties.entrySet()) {
      fileWriter.write(String.format("%s=%s\n", entry.getKey(), entry.getValue()));
    }
    fileWriter.flush();
    fileWriter.close();
    return file;
  }

  /**
   * Asserts that the configuration matches the properties and that they have
   * the same number of entries. If the value for a key contains the list delimiter
   * then this method will only confirm that the <em>first</em> value in the delimited
   * list matches the key's value in <code>properties</code>.
   */
  private static void assertPropertiesEquals(Map<String, String> properties,
      Configuration configuration) {
    int count = 0;
    @SuppressWarnings("rawtypes")
    Iterator keys = configuration.getKeys();
    while (keys.hasNext()) {
      String key = (String) keys.next();
      assertPropertyEquals(key, properties.get(key), configuration.getString(key));
      count++;
    }
    assertEquals("Configuration does not have the same number of properties",
        properties.size(), count);
  }

  /**
   * Asserts that the actual configuration contains the expected ones.
   */
  private static void assertContains(Configuration expected, Configuration actual) {
    @SuppressWarnings("rawtypes")
    Iterator keys = expected.getKeys();
    while (keys.hasNext()) {
      String key = (String) keys.next();
      assertPropertyEquals(key, expected.getString(key), actual.getString(key));
    }
  }

  /**
   * Asserts that the configuration contains the properties.
   */
  private static void assertContains(Map<String, String> properties, Configuration configuration) {
    properties.forEach(
        (key, value) ->
            assertPropertyEquals(key, properties.get(key), configuration.getString(key)));
  }

  private static void assertPropertyEquals(String key, Object expectedValue,
      Object actualValue) {
    assertEquals(String.format("Unexpected value for key: %s", key),
        expectedValue, actualValue);
  }

  /**
   * Clears the tested properties from the System.
   */
  private void clearTestSystemProperties() {
    Arrays.stream(allPropertyKeys).forEach(System::clearProperty);
  }
}
