// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.utils;

import static org.junit.Assert.assertArrayEquals;

import com.google.common.io.ByteStreams;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Tests for {@link Media}.
 */
@RunWith(JUnit4.class)
public class MediaTest {

  private File inputFile;
  private static final byte[] TEST_DATA = new byte[] {1, 2, 3, 4, 5};

  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  @Before
  public void setUp() throws Exception {
    inputFile = tempFolder.newFile();
    OutputStream outputStream = new FileOutputStream(inputFile);
    try {
      outputStream.write(TEST_DATA);
    } finally {
      outputStream.close();
    }
  }

  @Test
  public void testGetMediaDataFromFile_fileArg() throws IOException {
    assertArrayEquals(TEST_DATA, Media.getMediaDataFromFile(inputFile));
  }

  @Test
  public void testGetMediaDataFromFile_stringArg() throws IOException {
    assertArrayEquals(TEST_DATA, Media.getMediaDataFromFile(inputFile.getPath()));
  }

  @Test
  public void testGetMediaDataFromUrl_stringArg() throws IOException {
    assertArrayEquals(TEST_DATA, Media.getMediaDataFromUrl(inputFile.toURI().toString()));
  }

  @Test
  public void testGetMediaDataFromUrl_urlArg() throws IOException {
    assertArrayEquals(TEST_DATA, Media.getMediaDataFromUrl(inputFile.toURI().toURL()));
  }
  
  @Test
  public void testSaveMediaDataToFile_stringArg() throws IOException {
    File outputFile = tempFolder.newFile();
    Media.saveMediaDataToFile(TEST_DATA, outputFile.getPath());
    
    FileInputStream inputStream = new FileInputStream(outputFile);
    byte[] actualBytes;
    try {
      actualBytes = ByteStreams.toByteArray(inputStream);
    } finally {
      inputStream.close();
    }
    assertArrayEquals(TEST_DATA, actualBytes);
  }
  
  @Test
  public void testSaveMediaDataToFile_fileArg() throws IOException {
    File outputFile = tempFolder.newFile();
    Media.saveMediaDataToFile(TEST_DATA, outputFile);
    
    FileInputStream inputStream = new FileInputStream(outputFile);
    byte[] actualBytes;
    try {
      actualBytes = ByteStreams.toByteArray(inputStream);
    } finally {
      inputStream.close();
    }
    assertArrayEquals(TEST_DATA, actualBytes);
  }
}
