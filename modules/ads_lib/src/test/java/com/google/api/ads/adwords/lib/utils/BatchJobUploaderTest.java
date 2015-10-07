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

import com.google.api.ads.adwords.lib.client.AdWordsSession;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
}
