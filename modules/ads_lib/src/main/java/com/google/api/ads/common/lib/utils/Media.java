// Copyright 2010 Google Inc. All Rights Reserved.
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

import com.google.common.annotations.VisibleForTesting;
import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * A utility class for retrieving media data.
 */
public final class Media {

  /**
   * Default constructor.
   */
  private Media() {}

  /**
   * Gets the media data {@code byte[]} located in {@code fileName}.
   *
   * @param fileName the media file to load
   * @return the media data {@code byte[]} located in {@code fileName}
   * @throws IOException if the media could not be read
   */
  public static byte[] getMediaDataFromFile(String fileName) throws IOException {
    return getMediaDataFromFile(new File(fileName));
  }

  /**
   * Gets the media data {@code byte[]} located in {@code file}.
   *
   * @param file the media file to load
   * @return the media data {@code byte[]} located in {@code file}
   * @throws IOException if the media could not be read
   */
  public static byte[] getMediaDataFromFile(File file) throws IOException {
    return getByteArrayFromStream(new FileInputStream(file));
  }

  /**
   * Gets the media data {@code byte[]} located at {@code url} or
   * {@code null} if the media could not be loaded.
   *
   * @param url the media URL to load
   * @return the media data {@code byte[]} located at {@code url}
   * @throws IOException if the media could not be read from the URL
   */
  public static byte[] getMediaDataFromUrl(String url) throws IOException {
    return getMediaDataFromUrl(new URL(url));
  }

  /**
   * Gets the media data {@code byte[]} located at {@code url} or
   * {@code null} if the media could not be loaded.
   *
   * @param url the media URL to load
   * @return the media data {@code byte[]} located at {@code url}
   * @throws IOException if the media could not be read from the URL
   */
  public static byte[] getMediaDataFromUrl(URL url) throws IOException {
    return getByteArrayFromStream(url.openStream());
  }

  /**
   * Gets the byte array from the input stream containing the full data from
   * that stream.
   *
   * @param inputStream the {@code InputStream} to get the byte array from
   * @return a byte array containing all data from the input stream
   * @throws IOException if the stream cannot be read
   */
  private static byte[] getByteArrayFromStream(final InputStream inputStream) throws IOException {
    return new ByteSource() {
      @Override
      public InputStream openStream() {
        return inputStream;
      }
    }.read();
  }

  /**
   * Saves media data downloaded from an API in {@code byte[]} format into a
   * file on the file system.
   *
   * @param mediaData the media data {@code byte[]} to store on the file system
   * @param fileName the name of the file on the file system to save the media
   *     data into
   * @throws FileNotFoundException if the file exists but is a directory, does
   *     not exist but cannot be created, or cannot be opened for any reason
   * @throws IOException if the file cannot be written to
   */
  public static void saveMediaDataToFile(byte[] mediaData, String fileName)
      throws FileNotFoundException, IOException {
    saveMediaDataToFile(mediaData, new File(fileName));
  }

  /**
   * Saves media data downloaded from an API in {@code byte[]} format into a
   * file on the file system.
   *
   * @param mediaData the media data {@code byte[]} to store on the file system
   * @param file the file on the file system to save the media data into
   * @throws FileNotFoundException if the file exists but is a directory, does
   *     not exist but cannot be created, or cannot be opened for any reason
   * @throws IOException if the file cannot be written to
   */
  public static void saveMediaDataToFile(byte[] mediaData, File file)
      throws FileNotFoundException, IOException {
    writeBytesToStream(mediaData, new FileOutputStream(file));
  }

  /**
   * Writes the given {@code byte[]} to a stream.
   *
   * @throws IOException if the steam cannot be written to
   */
  @VisibleForTesting
  static void writeBytesToStream(byte[] bytes, final OutputStream outputStream)
      throws IOException {
    new ByteSink() {
      @Override
      public OutputStream openStream() {
        return outputStream;
      }
    }.write(bytes);
  }
}
