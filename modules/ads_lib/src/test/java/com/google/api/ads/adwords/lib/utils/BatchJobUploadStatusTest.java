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

package com.google.api.ads.adwords.lib.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;

/**
 * Tests for {@link BatchJobUploadStatus}.
 */
@RunWith(JUnit4.class)
public class BatchJobUploadStatusTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test that verifies that {@link BatchJobUploadStatus} instances are serializable.
   */
  @Test
  public void testSerializable() throws IOException, ClassNotFoundException {
    BatchJobUploadStatus status =
        new BatchJobUploadStatus(500L, URI.create("http://www.example.com/upload"));
    ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
    ObjectOutputStream outputStream = new ObjectOutputStream(byteOutputStream);
    outputStream.writeObject(status);
    outputStream.close();

    ObjectInputStream inputStream =
        new ObjectInputStream(new ByteArrayInputStream(byteOutputStream.toByteArray()));
    Object deserializedObject = inputStream.readObject();
    assertTrue(
        "Deserialized status should be a BatchJobUploadStatus",
        deserializedObject instanceof BatchJobUploadStatus);
    BatchJobUploadStatus deserializedStatus = (BatchJobUploadStatus) deserializedObject;
    assertEquals("Deserialized status upload URI does not match original",
        status.getResumableUploadUri(), deserializedStatus.getResumableUploadUri());
    assertEquals("Deserialized status total content length does not match original",
        status.getTotalContentLength(), deserializedStatus.getTotalContentLength());
  }

  /**
   * Test that verifies that a negative total content length is not permitted.
   */
  @Test
  public void testInvalidContentLength_fails() {
    thrown.expect(IllegalArgumentException.class);
    new BatchJobUploadStatus(-1L, URI.create("http://www.example.com"));
  }

  /**
   * Test that verifies that a null resumable upload URI is permitted.
   */
  @Test
  public void testNullResumableUploadURI_succeeds() {
    BatchJobUploadStatus status = new BatchJobUploadStatus(100L, null);
    assertNotNull(status);
  }
}
