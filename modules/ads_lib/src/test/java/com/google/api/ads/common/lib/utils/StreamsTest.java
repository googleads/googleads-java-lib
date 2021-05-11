// Copyright 2012, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.utils;

import static org.apache.commons.lang.CharEncoding.ISO_8859_1;
import static org.apache.commons.lang.CharEncoding.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.io.ByteStreams;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * Tests for {@link Streams}.
 */
@RunWith(JUnit4.class)
public class StreamsTest {

  /**
   * Test method for
   * {@link com.google.api.ads.common.lib.utils.Streams#wrapString(String)}.
   */  
  @SuppressWarnings({"javadoc", "deprecation"})
  @Test
  public void testWrapString() throws Exception {
    String testString = "Testing©ÿ»";
    final InputStream inputStream = Streams.wrapString(testString);
    byte[] stringBytes = testString.getBytes(Charset.defaultCharset());
    stringBytes = Arrays.copyOf(stringBytes, stringBytes.length);

    assertTrue("Streams should be equal",
        Arrays.equals(stringBytes, ByteStreams.toByteArray(inputStream)));
  }
  
  /**
   * Test method for
   * {@link com.google.api.ads.common.lib.utils.Streams#wrapString(String, Charset)}.
   */    
  @Test
  public void testWrapString_wrongCharset() throws Exception {
    String testString = "Testing©ÿ»";
    final InputStream inputStream = Streams.wrapString(testString, Charset.forName(UTF_8));
    byte[] stringBytes = testString.getBytes(Charset.forName(ISO_8859_1));
    stringBytes = Arrays.copyOf(stringBytes, stringBytes.length);

    assertFalse("Streams should not be equal",
        Arrays.equals(stringBytes, ByteStreams.toByteArray(inputStream)));
  }

  /**
   * Test method for
   * {@link com.google.api.ads.common.lib.utils.Streams#wrapString(String, Charset)}.
   */  
  @Test
  public void testWrapString_sameCharset() throws Exception {
    String testString = "Testing©ÿ»";
    final InputStream inputStream = Streams.wrapString(testString, Charset.forName(UTF_8));
    byte[] stringBytes = testString.getBytes(Charset.forName(UTF_8));
    stringBytes = Arrays.copyOf(stringBytes, stringBytes.length);

    assertTrue("Streams should be equal",
        Arrays.equals(stringBytes, ByteStreams.toByteArray(inputStream)));
  }

  /**
   * Test method for
   * {@link com.google.api.ads.common.lib.utils.Streams#readAll(java.io.InputStream)}.
   */
  @SuppressWarnings({"deprecation", "javadoc"})
  @Test
  public void testReadAll() throws Exception {    
    String testString = "Testing©ÿ»";
    String actual =
        Streams.readAll(new ByteArrayInputStream(testString.getBytes(Charset.defaultCharset())));
    String expected =
        new String(testString.getBytes(Charset.defaultCharset()), Charset.defaultCharset());
    assertEquals(expected, actual);
  }
  
  /**
   * Test method for
   * {@link com.google.api.ads.common.lib.utils.Streams#readAll(InputStream, Charset)}.
   */
  @Test
  public void testReadAll_wrongCharset() throws Exception {
    String testString = "Testing©ÿ»";
    String actual = Streams.readAll(
        new ByteArrayInputStream(testString.getBytes(Charset.forName(UTF_8))),
        Charset.forName(ISO_8859_1));
    assertFalse("String should not be equal", testString.equals(actual));
  }
  
  /**
   * Test method for
   * {@link com.google.api.ads.common.lib.utils.Streams#readAll(InputStream, Charset)}.
   */
  @Test
  public void testReadAll_sameCharset() throws Exception {
    String testString = "Testing©ÿ»";
    String actual = Streams.readAll(
        new ByteArrayInputStream(testString.getBytes(Charset.forName(UTF_8))),
        Charset.forName(UTF_8));
    assertEquals(testString, actual);  }

  /**
   * Test method for {@link com.google.api.ads.common.lib.utils.Streams#write(java.lang.String,
   * java.io.OutputStream)}.
   */
  @SuppressWarnings({"javadoc", "deprecation"})
  @Test
  public void testWriteStringOutputStream() throws Exception {
    String testString = "Testing©ÿ»";
    byte[] stringBytes = testString.getBytes();
    stringBytes = Arrays.copyOf(stringBytes, stringBytes.length);
    
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    Streams.write(testString, outputStream);
    outputStream.close();
       
    String expectedTestString = new String(testString.getBytes());
    
    String actual = new String(outputStream.toByteArray());        
    assertEquals(expectedTestString, actual);
    
    byte[] actualBytes = Arrays.copyOf(outputStream.toByteArray(), stringBytes.length);
    
    assertTrue(
        "Byte arrays should be equal", Arrays.equals(stringBytes, actualBytes));    
  }

  /**
   * Test method for {@link com.google.api.ads.common.lib.utils.Streams#write(java.lang.String,
   * java.io.OutputStream, java.nio.charset.Charset)}.
   */
  @Test
  public void testWriteStringOutputStream_wrongCharset() throws Exception {
    String testString = "Testing©ÿ»";
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    Streams.write(testString, outputStream, Charset.forName(UTF_8));
    byte[] stringBytes = testString.getBytes(Charset.forName(ISO_8859_1));
    stringBytes = Arrays.copyOf(stringBytes, stringBytes.length);
    
    assertFalse(
        "Byte arrays should be not equal", Arrays.equals(stringBytes, outputStream.toByteArray()));
    
    String actual = new String(outputStream.toByteArray(), Charset.forName(UTF_8));
    assertEquals(testString, actual);
  }
  
  /**
   * Test method for {@link com.google.api.ads.common.lib.utils.Streams#write(java.lang.String,
   * java.io.OutputStream, java.nio.charset.Charset)}.
   */
  @Test
  public void testWriteStringOutputStream_sameCharset() throws Exception {
    String testString = "Testing©ÿ»";
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    Streams.write(testString, outputStream, Charset.forName(UTF_8));
    byte[] stringBytes = testString.getBytes(Charset.forName(UTF_8));
    stringBytes = Arrays.copyOf(stringBytes, stringBytes.length);
    
    assertTrue(
        "Byte arrays shoud be equal", Arrays.equals(stringBytes, outputStream.toByteArray()));
    
    String actual = new String(outputStream.toByteArray(), Charset.forName(UTF_8));
    assertEquals(testString, actual);
  }

  /**
   * Test method for {@link com.google.api.ads.common.lib.utils.Streams#copy(java.io.InputStream,
   * java.io.OutputStream)}.
   */
  @Test
  public void testCopy() throws Exception {
    String testString = "Testing©ÿ»";
    byte[] stringBytes = testString.getBytes();
    InputStream inputStream =
        new ByteArrayInputStream(Arrays.copyOf(stringBytes, stringBytes.length));
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        
    Streams.copy(inputStream, outputStream);   
    
    assertTrue(
        "Byte arrays should be equal", Arrays.equals(stringBytes, outputStream.toByteArray()));
  }
}
