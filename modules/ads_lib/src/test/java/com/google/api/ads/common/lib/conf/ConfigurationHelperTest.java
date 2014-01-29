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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.common.lib.conf.ConfigurationHelper.ConfigurationInfo;
import com.google.common.collect.Lists;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.SystemConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Test for {@link ConfigurationHelper}.

 * @author Adam Rogal
 */
@RunWith(JUnit4.class)
public class ConfigurationHelperTest {

  private ConfigurationHelper configurationHelper;
  private Map<String, String> test1Properties;
  private Map<String, String> test3Properties;
  private String[] allPropertyKeys = {"a.b.c", "a.b.d", "e.f.g", "e.f.h", "testProperty"};

  @Before
  public void setUp() {
    clearSystemProperties();
    this.configurationHelper = new ConfigurationHelper();
    this.test1Properties = new HashMap<String, String>() {{
        this.put("a.b.c", "efgh");
        this.put("a.b.d", "1234");
      }};

    this.test3Properties = new HashMap<String, String>() {{
        this.put("a.b.c", "jklm");
        this.put("e.f.h", "90123");
      }};
  }

  @Test(expected = IllegalArgumentException.class)
  public void testUnsupportedConfigurationInfo() {
    new ConfigurationInfo<Long>(1234L, false);
  }

  @Test
  public void testSupportedConfigurationInfo() throws Exception {
    new ConfigurationInfo<String>("1234", false);
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

  @Test(expected = IllegalArgumentException.class)
  public void testNewConfigurationInfoList_nullArguments() throws Exception {
    ConfigurationHelper.newList(true, (Object[]) null);
  }

  @Test
  public void testFromFile_stringExists() throws Exception {
    Configuration configuration =
        configurationHelper.fromFile(createPropertiesFile(test1Properties).toString());
    assertPropertiesEquals(test1Properties, configuration);
  }

  @Test(expected = ConfigurationLoadException.class)
  public void testFromFile_stringDoesNotExist() throws Exception {
    Configuration configuration =
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

  @Test(expected = ConfigurationLoadException.class)
  public void testFromFile_urlDoesNotExist() throws Exception {
    Configuration configuration =
        configurationHelper.fromFile(new URL("file:///" + System.currentTimeMillis()));
  }

  @Test
  public void testFromFile_urlClasspathExists() throws Exception {
    Configuration configuration =
        configurationHelper.fromFile(ConfigurationHelperTest.class
            .getResource("props/test1.properties"));
    assertPropertiesEquals(test1Properties, configuration);
  }

  @Test
  public void testFromSystem() throws Exception {
    for (Map.Entry<String, String> entry : test1Properties.entrySet()) {
      System.setProperty(entry.getKey(), entry.getValue());
    }
    assertContains(test1Properties, configurationHelper.fromSystem());
  }

  @Test
  public void testCreateCombinedConfiguration_justSystem() throws Exception {
    assertContains(new SystemConfiguration(),
        configurationHelper.createCombinedConfiguration(null, null));
  }

  @Test
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredUrlOverride() throws Exception {
    for (Map.Entry<String, String> entry : test1Properties.entrySet()) {
      System.setProperty(entry.getKey(), entry.getValue());
    }

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
    for (Map.Entry<String, String> entry : test1Properties.entrySet()) {
      System.setProperty(entry.getKey(), entry.getValue());
    }

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
    for (Map.Entry<String, String> entry : test1Properties.entrySet()) {
      System.setProperty(entry.getKey(), entry.getValue());
    }

    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(null,
        Lists.<ConfigurationInfo<URL>>newArrayList(new ConfigurationInfo<URL>(
            new URL("file:///does/not/exist" + System.currentTimeMillis()), true)));

    assertEquals("efgh", configuration.getString("a.b.c"));
    assertEquals("1234", configuration.getString("a.b.d"));
    assertEquals("testValue", configuration.getString("testProperty"));
  }

  @Test(expected = ConfigurationLoadException.class)
  @SuppressWarnings("unchecked")
  public void testCreateCombinedConfiguration_requiredUrlNotFound() throws Exception {
    for (Map.Entry<String, String> entry : test1Properties.entrySet()) {
      System.setProperty(entry.getKey(), entry.getValue());
    }

    System.setProperty("testProperty", "testValue");

    Configuration configuration = configurationHelper.createCombinedConfiguration(null,
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
  private static File createPropertiesFile(Map<String, String> properties) throws IOException {
    File file = File.createTempFile("javalibtest", "properties");
    FileWriter fileWriter = new FileWriter(file);
    for (Map.Entry<String, String> entry : properties.entrySet()) {
      fileWriter.write(String.format("%s=%s\n", entry.getKey(), entry.getValue()));
    }
    fileWriter.flush();
    fileWriter.close();
    return file;
  }

  /**
   * Asserts that the configuration matches the properties and that they have
   * the same number of entries.
   */
  private static void assertPropertiesEquals(Map<String, String> properties,
      Configuration configuration) {
    int count = 0;
    @SuppressWarnings("rawtypes")
    Iterator keys = configuration.getKeys();
    while (keys.hasNext()) {
      String key = (String) keys.next();
      assertEquals(properties.get(key), configuration.getString(key));
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
      assertEquals(expected.getString(key), actual.getString(key));
    }
  }

  /**
   * Asserts that the configuration contains the properties.
   */
  private static void assertContains(Map<String, String> properties, Configuration configuration) {
    for (Map.Entry<String, String> entry : properties.entrySet()) {
      assertEquals(properties.get(entry.getKey()), configuration.getString(entry.getKey()));
    }
  }

  /**
   * Clears the tested properties from the System.
   */
  private void clearSystemProperties() {
    for (String key : allPropertyKeys) {
      System.clearProperty(key);
    }
  }
}
