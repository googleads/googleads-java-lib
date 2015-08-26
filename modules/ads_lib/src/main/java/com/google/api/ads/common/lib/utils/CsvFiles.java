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

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * A utility class for processing and handling CSV files.
 */
public final class CsvFiles {
  /**
   * {@code CsvFiles} is meant to be used statically.
   */
  private CsvFiles() {}

  /**
   * Returns a {@code Map<String, String>} mapping of the column designated by
   * {@code key} to the column designated by {@code value}. This method also
   * ignores all columns other than the columns specified by {@code key} and
   * {@code value}.
   *
   * @param fileName the CSV file to load
   * @param key the 0-indexed column number to map to the key of the returned
   *     data map
   * @param value the column number to map to the value of the returned data
   *     map
   * @param headerPresent {@code true} if the fist line is the header
   * @return a {@code Map<String, String>} mapping of the columns specified by
   *     {@code key} and {@code value}
   * @throws IOException if there was an error while reading the file
   * @throws IllegalArgumentException if CSV file does not have the
   *     columns specified by {@code key} or {@code value}
   */
  public static Map<String, String> getCsvDataMap(String fileName,
      final int key, final int value, boolean headerPresent) throws IOException {    
    final Map<String, String> result = Maps.newHashMap();
    new CsvReader(fileName, headerPresent).processReader(
        new CsvReader.CsvWorker() {
          @Override
          public void processLine(String[] header, String[] line, int lineNumber) {
            result.put(line[key], line[value]);
          }
        });
    return result;
  }

  /**
   * Returns a {@code Map<String, String>} mapping of the first column to the
   * second column. This method also ignores all columns other than the first
   * two.
   *
   * @param fileName the CSV file to load
   * @param headerPresent {@code true} if the fist line is the header
   * @return a {@code Map<String, String>} mapping of the first to the second
   *     column
   * @throws IOException if there was an exception reading the file
   * @throws IllegalArgumentException if CSV file has fewer than two
   *     columns
   */
  public static Map<String, String> getCsvDataMap(String fileName, boolean headerPresent)
      throws IOException {
    return getCsvDataMap(fileName, 0, 1, headerPresent);
  }

  /**
   * Returns a {@code Map<String, String[]>} mapping of the first column to an
   * array of the rest of the columns.
   *
   * @param fileName the CSV file to load
   * @param headerPresent {@code true} if the fist line is the header
   * @return a {@code Map<String, String[]>} mapping of the first column to an
   *     array of the rest of the columns
   * @throws IllegalArgumentException if there is fewer than 2 columns in
   *     the CSV
   * @throws IOException if there was an exception reading the file
   */
  public static Map<String, String[]> getCsvDataMapArray(String fileName, boolean headerPresent)
      throws IOException {
    final Map<String, String[]> result = Maps.newHashMap();
    new CsvReader(fileName, headerPresent).processReader(
        new CsvReader.CsvWorker() {
          @Override
          public void processLine(String[] header, String[] line, int lineNumber) {
            result.put(line[0],
                Arrays.asList(line)
                    .subList(1, line.length).toArray(new String[line.length - 1]));
          }
        });
    return result;
  }

  /**
   * Returns a {@code List<Map<String, String>>} that contains all rows with
   * a field mapping defined by the header. If no header is present,
   * then each field is the 0-indexed column number.
   *
   * @param fileName the CSV file to load
   * @param headerPresent {@code true} if the first line is the header
   * @return a {@code List<Map<String, String>>} that contains all rows with
   *     with a field mapping defined by the header if present.
   * @throws IOException if there was an exception reading the file
   */
  public static List<Map<String, String>> getCsvDataListMap(String fileName,
      boolean headerPresent) throws IOException {
    final List<Map<String, String>> result = Lists.newArrayList();
    new CsvReader(fileName, headerPresent).processReader(
        new CsvReader.CsvWorker() {
          @Override
          public void processLine(String[] headers, String[] line, int lineNumber) {
            Map<String, String> data = Maps.newHashMap();
            for (int i = 0; i < line.length; i++) {
              if (headers != null) {
                data.put(headers[i], line[i]);
              } else {
                data.put(i + "", line[i]);
              }
            }
            result.add(data);
          }
        });
    return result;
  }

  /**
   * Returns a {@code List<String>} representing a single 0-indexed column.
   *
   * @param fileName the CSV file to load
   * @param column the 0-indexed column to return
   * @param headerPresent {@code true} if the first line is the header
   * @return a {@code List<String>} representing a single column
   * @throws IOException if there was an exception reading the file
   * @throws IllegalArgumentException if the column index does not exist in
   *     the CSV
   */
  public static List<String> getCsvDataByColumn(String fileName, final int column,
      boolean headerPresent) throws IOException {
    final List<String> result = Lists.newArrayList();
    new CsvReader(fileName, headerPresent).processReader(
        new CsvReader.CsvWorker() {
          @Override
          public void processLine(String[] headers, String[] line, int lineNumber) {
            result.add(line[column]);
          }
        });
    return result;
  }


  /**
   * Returns a {@code List<String[]>} that contains all rows of the CSV file.
   * The header will be removed, if present.
   *
   * @param fileName the CSV file to load
   * @param headerPresent {@code true} if the first line is the header
   * @return a {@code List<String[]>} that contains all rows of the CSV file
   * @throws IOException if there was an exception reading the file
   */
  public static List<String[]> getCsvDataArray(String fileName, boolean headerPresent)
      throws IOException {
    final List<String[]> result = Lists.newArrayList();
    new CsvReader(fileName, headerPresent).processReader(
        new CsvReader.CsvWorker() {
          @Override
          public void processLine(String[] headers, String[] line, int lineNumber) {
            result.add(line);
          }
        });
    return result;
  }

  /**
   * Returns a {@code List<String[]>} that contains all rows of the CSV file.
   * The header will be removed, if present.
   *
   * @param csvReader reader used to read the csv
   * @param headerPresent {@code true} if the first line is the header
   * @return a {@code List<String[]>} that contains all rows of the CSV file
   * @throws IOException if there was an exception reading the file
   */
  public static List<String[]> getCsvDataArray(Reader csvReader, boolean headerPresent)
      throws IOException {
    final List<String[]> result = Lists.newArrayList();
    new CsvReader(new CSVReader(csvReader), headerPresent).processReader(
        new CsvReader.CsvWorker() {
          @Override
          public void processLine(String[] headers, String[] line, int lineNumber) {
            result.add(line);
          }
        });
    return result;
  }
  /**
   * Writes the CSV data located in {@code csvData} to the file located at
   * {@code fileName}.
   *
   * @param csvData the CSV data including the header
   * @param fileName the file to write the CSV data to
   * @throws IOException if there was an error writing to the file
   * @throws IllegalArgumentException if {@code csvData == null}
   */
  public static void writeCsv(List<String[]> csvData, String fileName) throws IOException {
    Preconditions.checkNotNull(csvData, "Cannot write null CSV data to file.");

    CSVWriter writer = null;
    try {
      writer = new CSVWriter(new FileWriter(fileName));
      for (String[] line : csvData) {
        writer.writeNext(line);
      }
    } finally {
      if (writer != null) {
        writer.close();
      }
    }
  }

  /**
   * Iterates through and processes each line of a CSV file. This is done by
   * passing a {@link CsvWorker} object into the
   * {@link CsvReader#processReader(CsvWorker)} method, which in turn, calls the
   * {@link CsvWorker#processLine(String[], String[], int)} method for each line
   * of the CSV.
   */
  private static class CsvReader {
    private final String fileName;
    private final boolean headerPresent;
    private CSVReader reader;
    private String[] header;
    private int lineNumber;

    /**
     * Constructs a {@link CsvReader} object which will load the file located
     * at {@code fileName}.
     *
     * @param fileName the file name of the CSV file to load
     * @param headerPresent {@code true} if the file's first line is the
     *     header for each column
     */
    public CsvReader(String fileName, boolean headerPresent) {
      this.fileName = fileName;
      this.headerPresent = headerPresent;
    }

    /**
     * Constructs a {@link CsvReader} object which uses the supplied reader.
     *
     * @param reader the {@link CSVReader} to use
     * @param headerPresent {@code true} if the file's first line is the
     *     header for each column
     */
    public CsvReader(CSVReader reader, boolean headerPresent) {
      this.fileName = null;
      this.reader = reader;
      this.headerPresent = headerPresent;
    }

    /**
     * Creates a {@link CSVReader} for the file and sets the {@code header}
     * if present. After this method is called,
     * {@link #processReader(CsvWorker)} may be called.
     *
     * @throws IOException if the CSV file cannot be read
     */
    private void createCsvReader() throws IOException {
      lineNumber = 1;
      if (reader == null) {
        reader = new CSVReader(new FileReader(fileName));
      }
      if (headerPresent) {
        header = reader.readNext();
        lineNumber++;
      }
    }

    /**
     * Performs the {@link CsvWorker#processLine(String[], String[], int)}
     * method of the {@code worker} parameter for each link in the CSV.
     *
     * @param worker the {@code CsvWorker} that performs work on each line
     * @throws IOException if the CSV file cannot be read
     */
    public void processReader(CsvWorker worker) throws IOException {
      createCsvReader();
      try {
        String[] line;
        while ((line = reader.readNext()) != null) {
          worker.processLine(header, line, lineNumber);
          lineNumber++;
        }
      } finally {
        reader.close();
      }
    }

    /**
     * A worker that is called within {@link CsvReader} on each line of the CSV
     * via the {@link #processLine(String[], String[], int)} method.
     */
    private interface CsvWorker {
      /**
       * Processes the current line of the CSV.
       *
       * @param headers the headers usually represented by the first line of the
       *     CSV. If the original file did not contain headers, then
       *     this field may be {@code null}.
       * @param currentLine the current line of the CSV that work will be done on
       * @param currentLineNumber the current one-indexed line number of the CSV
       * @throws IllegalArgumentException if the current line or headers is not
       *     valid to have work performed on
       */
      void processLine(String[] headers, String[] currentLine, int currentLineNumber);
    }
  }
}
