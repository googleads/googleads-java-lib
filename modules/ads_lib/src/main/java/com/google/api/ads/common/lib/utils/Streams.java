// Copyright 2011 Google Inc. All Rights Reserved.
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

import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * Helper class to perform stream operations.
 */
public final class Streams {

  /**
   * Default constructor.
   */
  private Streams() {}

  /**
   * Wraps the provided string into an InputStream in the default charset:
   * Charset.defaultCharset().
   *
   * @param str String to wrap.
   * @return InputStream containing the string argument.
   * @deprecated it is always safer to supply a charset. See
   *             {@link #wrapString(String, Charset)}.
   */
  @Deprecated
  public static InputStream wrapString(String str) {
    return wrapString(str, Charset.defaultCharset());
  }
  
  /**
   * Wraps the provided string into an InputStream.
   *
   * @param str String to wrap.
   * @param charset the chareset encoding of the string
   * @return InputStream containing the string argument.
   */
  public static InputStream wrapString(String str, Charset charset) {   
    return new ByteArrayInputStream(str.getBytes(charset));  
  }

  /**
   * Reads all input into memory, close the steam, and return as a String. Reads
   * the input in the default charset: Charset.defaultCharset().
   *
   * @param inputStream InputStream to read from.
   * @return String contents of the stream.
   * @throws IOException if there is an problem reading from the stream.
   * @deprecated it is always safer to supply a charset. See
   *             {@link #readAll(InputStream, Charset)}.
   */
  @Deprecated
  public static String readAll(final InputStream inputStream) throws IOException {
    return readAll(inputStream, Charset.defaultCharset());
  }
  
  /**
   * Reads all input into memory, close the steam, and return as a String. Reads
   * the input
   *
   * @param inputStream InputStream to read from.
   * @param charset the charset to interpret the input as.
   * @return String contents of the stream.
   * @throws IOException if there is an problem reading from the stream.
   */
  public static String readAll(final InputStream inputStream, Charset charset) throws IOException {
    return new ByteSource() {
      @Override
      public InputStream openStream() {
        return inputStream;
      }
    }.asCharSource(charset).read();
  }

  /**
   * Writes the specified string to stream with buffering and closes the stream.
   * Writes in the default charset: Charset.defaultCharset().
   *
   * @param str String to write.
   * @param outputStream Stream to write to.
   * @throws IOException If there is an exception while writing.
   * @deprecated it is always safer to supply a charset. See
   *             {@link #write(String, OutputStream, Charset)}.
   */
  @Deprecated
  public static void write(String str, final OutputStream outputStream) throws IOException {
    write(str, outputStream, Charset.defaultCharset());
  }

  /**
   * Writes the specified string to stream with buffering and closes the stream.
   *
   * @param str String to write.
   * @param outputStream Stream to write to.
   * @param charset The charset to write in.
   * @throws IOException If there is an exception while writing.
   */
  public static void write(String str, final OutputStream outputStream, Charset charset)
      throws IOException {
    new ByteSink() {
      @Override
      public OutputStream openStream() {
        return outputStream;
      }
    }.asCharSink(charset).write(str);
  }

  /**
   * Copies the {@code inputStream} into the {@code outputSteam} and finally
   * closes the both streams.
   */
  public static void copy(final InputStream inputStream, final OutputStream outputStream)
      throws IOException {
    new ByteSource() {
      @Override
      public InputStream openStream() {
        return inputStream;
      }
    }.copyTo(new ByteSink() {
      @Override
      public OutputStream openStream() {
        return outputStream;
      }
    });
  }
}
