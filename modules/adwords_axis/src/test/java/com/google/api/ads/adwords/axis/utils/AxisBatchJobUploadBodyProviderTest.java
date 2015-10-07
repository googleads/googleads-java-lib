// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.Lists;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

/**
 * Tests for {@link AxisBatchJobUploadBodyProvider}.
 */
@RunWith(JUnit4.class)
public class AxisBatchJobUploadBodyProviderTest {
  private final AxisBatchJobUploadBodyProvider bodyProvider = new AxisBatchJobUploadBodyProvider();

  @Test
  public void testTrimStartEndElements_isFirst_isLast() {
    List<String> testData = Lists.newArrayList();
    testData.add("<mutate><foo></foo></mutate>");
    testData.add(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v201509\"><foo></foo>"
        + "</ns1:mutate>");
    testData.add("<mutate></mutate>");

    for (String requestXml : testData) {
      String postProcessed = bodyProvider.trimStartEndElements(requestXml, true, true);
      assertEquals(
          "Trimmed result should not change if isFirst and isLast", requestXml, postProcessed);
    }
  }

  @Test
  public void testTrimStartEndElements_notFirst_isLast() {
    List<List<String>> testData = Lists.newArrayList();
    testData.add(Lists.newArrayList("<mutate><foo></foo></mutate>", "<foo></foo></mutate>"));
    testData.add(Lists.newArrayList(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v201509\"><foo></foo>"
        + "</ns1:mutate>",
        "<foo></foo></ns1:mutate>"));
    testData.add(Lists.newArrayList("<mutate></mutate>", "</mutate>"));

    for (List<String> testPair : testData) {
      String requestXml = testPair.get(0);
      String postProcessed = bodyProvider.trimStartEndElements(requestXml, false, true);
      assertEquals("Trimmed result should exclude starting mutate if !isFirst and isLast",
          testPair.get(1), postProcessed);
    }
  }

  @Test
  public void testTrimStartEndElements_isFirst_notLast() {
    List<List<String>> testData = Lists.newArrayList();
    testData.add(Lists.newArrayList("<mutate><foo></foo></mutate>", "<mutate><foo></foo>"));
    testData.add(Lists.newArrayList(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v201509\"><foo></foo>"
        + "</ns1:mutate>",
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v201509\"><foo></foo>"));
    testData.add(Lists.newArrayList("<mutate></mutate>", "<mutate>"));

    for (List<String> testPair : testData) {
      String requestXml = testPair.get(0);
      String postProcessed = bodyProvider.trimStartEndElements(requestXml, true, false);
      assertEquals("Trimmed result should exclude ending mutate if isFirst and !isLast",
          testPair.get(1), postProcessed);
    }
  }

  @Test
  public void testTrimStartEndElements_notFirst_notLast() {
    List<List<String>> testData = Lists.newArrayList();
    testData.add(Lists.newArrayList("<mutate><foo></foo></mutate>", "<foo></foo>"));
    testData.add(Lists.newArrayList(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v201509\"><foo></foo>"
        + "</ns1:mutate>",
        "<foo></foo>"));
    testData.add(Lists.newArrayList("<mutate></mutate>", ""));

    for (List<String> testPair : testData) {
      String requestXml = testPair.get(0);
      String postProcessed = bodyProvider.trimStartEndElements(requestXml, false, false);
      assertEquals(
          "Trimmed result should exclude starting and ending mutate if !isFirst and !isLast",
          testPair.get(1), postProcessed);
    }
  }
}
