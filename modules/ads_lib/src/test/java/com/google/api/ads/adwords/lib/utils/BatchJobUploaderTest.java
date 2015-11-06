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

package com.google.api.ads.adwords.lib.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

/**
 * Tests for {@link BatchJobUploader}.
 */
@RunWith(JUnit4.class)
public class BatchJobUploaderTest {
  @Mock
  private AdWordsSession adWordsSession;

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @SuppressWarnings("rawtypes")
  private BatchJobUploader uploader;

  @SuppressWarnings("rawtypes")
  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    uploader = new BatchJobUploader(adWordsSession);
  }

  @Test
  public void testConstructContentRangeHeaderValue_notLast_nonZeroLength_zeroPrevious() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0, null);
    long requestLength = 100;
    String expectedContentRange = "bytes 0-99/*";
    assertEquals(
        expectedContentRange,
        uploader.constructContentRangeHeaderValue(requestLength, false, status));
  }

  @Test
  public void testConstructContentRangeHeaderValue_notLast_nonZeroLength_nonZeroPrevious() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(100, null);
    long requestLength = 100;
    String expectedContentRange = "bytes 100-199/*";
    assertEquals(
        expectedContentRange,
        uploader.constructContentRangeHeaderValue(requestLength, false, status));
  }

  @Test
  public void testConstructContentRangeHeaderValue_isLast_nonZeroLength_nonZeroPrevious() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(100, null);
    long requestLength = 100;
    String expectedContentRange = "bytes 100-199/200";
    assertEquals(
        expectedContentRange,
        uploader.constructContentRangeHeaderValue(requestLength, true, status));
  }

  @Test
  public void testConstructContentRangeHeaderValue_isLast_nonZeroLength_zeroPrevious() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0, null);
    long requestLength = 100;
    String expectedContentRange = "bytes 0-99/100";
    assertEquals(
        expectedContentRange,
        uploader.constructContentRangeHeaderValue(requestLength, true, status));
  }

  @Test
  public void testConstructContentRangeHeaderValue_notLast_zeroLength() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(0, null);
    thrown.expect(IllegalArgumentException.class);
    uploader.constructContentRangeHeaderValue(0, false, status);
  }


  @Test
  public void testTrimStartEndElements_isFirst_isLast() {
    List<String> testData = Lists.newArrayList();
    testData.add("<mutate><foo></foo></mutate>");
    testData.add(
        "<ns1:mutate xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v201509\"><foo></foo>"
        + "</ns1:mutate>");
    testData.add("<mutate></mutate>");

    for (String requestXml : testData) {
      String postProcessed = uploader.trimStartEndElements(requestXml, true, true);
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
      String postProcessed = uploader.trimStartEndElements(requestXml, false, true);
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
      String postProcessed = uploader.trimStartEndElements(requestXml, true, false);
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
      String postProcessed = uploader.trimStartEndElements(requestXml, false, false);
      assertEquals(
          "Trimmed result should exclude starting and ending mutate if !isFirst and !isLast",
          testPair.get(1), postProcessed);
    }
  }

  /**
   * Verifies that {@code trimStartEndElements} fails with an {@link IllegalArgumentException} if
   * the request does not contain the expected opening or closing tag.
   */
  @Test
  public void testTrimStartEndElements_missingMutateElements() {
    List<String> testData = Lists.newArrayList();
    testData.add("<bar><foo></foo></bar>");
    testData.add(
        "<ns1:operation xmlns:ns1=\"https://adwords.google.com/api/adwords/cm/v201509\"><foo></foo>"
        + "</ns1:operation>");
    testData.add(
        "<operation xmlns=\"https://adwords.google.com/api/adwords/cm/v201509\"><foo></foo>"
        + "</operation>");

    for (String requestXml : testData) {
      // Not using ExpectedException here because the test needs to continue after each exception
      // is thrown.
      try {
        uploader.trimStartEndElements(requestXml, false, true);
        fail("Should have thrown an IllegalArgumentException for isLast and input: " + requestXml);
      } catch (IllegalArgumentException e) {
        assertTrue("Expected exception", true);
      }
      try {
        uploader.trimStartEndElements(requestXml, true, false);
        fail("Should have thrown an IllegalArgumentException for isFirst and input: " + requestXml);
      } catch (IllegalArgumentException e) {
        assertTrue("Expected exception", true);
      }
    }
  }
}
