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
import static org.junit.Assert.assertEquals;

import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Tests for {@link CsvFiles}.
 */
@RunWith(Parameterized.class)
public class CsvFilesTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  private String csvString = String.format("a,a1,a2,a3%nb,b1,b2%nc,c1%n");

  /** Data list, before any mutations based on {@code headerPresent}. */
  private List<String[]> originalDataList =
      Lists.<String[]>newArrayList(
          new String[] {"a", "a1", "a2", "a3"},
          new String[] {"b", "b1", "b2"},
          new String[] {"c", "c1"});

  /** Data list, modified based on {@code headerPresent}. */
  private List<String[]> dataList = Lists.newArrayList(originalDataList);

  /** File containing {@code csvString} as its contents. */
  private File csvStringFile;

  /** The {@code headerPresent} argument to pass to methods being tested. */
  private final boolean headerPresent;

  public CsvFilesTest(boolean headerPresent) {
    this.headerPresent = headerPresent;
  }

  @Parameters(name = "headerPresent={0}")
  public static List<Object[]> data() {
    List<Object[]> data = Lists.newArrayList();
    data.add(new Object[] {Boolean.FALSE});
    data.add(new Object[] {Boolean.TRUE});
    return data;
  }

  @Before
  public void setUp() throws Exception {
    csvStringFile = tempFolder.newFile();
    Files.write(csvString, csvStringFile, Charsets.UTF_8);
    if (headerPresent) {
      dataList.remove(0);
    }
  }

  @Test
  public void testWriteCsv() throws IOException {
    File csvFile = tempFolder.newFile();
    CsvFiles.writeCsv(dataList, csvFile.getPath());
    List<String> actualLines = Files.readLines(csvFile, Charsets.UTF_8);
    assertEquals(dataList.size(), actualLines.size());
    Splitter splitter = Splitter.on(',').trimResults(CharMatcher.is('"'));
    for (int i = 0; i < dataList.size(); i++) {
      String actualLine = actualLines.get(i);
      String[] actualValues = Iterables.toArray(splitter.split(actualLine), String.class);
      String[] expectedValues = dataList.get(i);
      assertArrayEquals("Row " + i + " does not match", expectedValues, actualValues);
    }
  }

  @Test
  public void testWriteCsv_nullData_fails() throws IOException {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("Null CSV data");
    CsvFiles.writeCsv(null, "/tmp/foobar");
  }

  @Test
  public void testWriteCsv_null_fails() throws IOException {
    thrown.expect(NullPointerException.class);
    thrown.expectMessage("Null file name");
    CsvFiles.writeCsv(dataList, null);
  }

  @Test
  public void testGetCsvDataMap() throws IOException {
    Map<String, String> expectedDataMap = Maps.newHashMap();
    for (String[] data : dataList) {
      expectedDataMap.put(data[0], data[1]);
    }
    Map<String, String> actualDataMap =
        CsvFiles.getCsvDataMap(csvStringFile.getPath(), headerPresent);
    assertEquals(expectedDataMap, actualDataMap);
  }

  @Test
  public void testGetCsvDataMapArray() throws IOException {
    Map<String, String[]> actualDataMapArray =
        CsvFiles.getCsvDataMapArray(csvStringFile.getPath(), headerPresent);
    Map<String, List<String>> actualDataMapList = Maps.newHashMap();
    for (Entry<String, String[]> actualDataMapEntry : actualDataMapArray.entrySet()) {
      actualDataMapList.put(
          actualDataMapEntry.getKey(), Arrays.asList(actualDataMapEntry.getValue()));
    }
    Map<String, List<String>> expectedDataMap = Maps.newHashMap();
    for (String[] rowData : dataList) {
      expectedDataMap.put(
          rowData[0], Arrays.asList(Arrays.copyOfRange(rowData, 1, rowData.length)));
    }
    assertEquals(expectedDataMap, actualDataMapList);
  }

  @Test
  public void testGetCsvDataArray() throws IOException {
    List<String[]> actualDataList =
        CsvFiles.getCsvDataArray(csvStringFile.getPath(), headerPresent);
    assertEquals(dataList.size(), actualDataList.size());
    for (int i = 0; i < actualDataList.size(); i++) {
      assertArrayEquals("Row " + i + " does not match", dataList.get(i), actualDataList.get(i));
    }
  }

  @Test
  public void testGetCsvDataArray_fromReader() throws IOException {
    Reader reader = new FileReader(csvStringFile);
    List<String[]> actualDataArray = CsvFiles.getCsvDataArray(reader, headerPresent);
    assertEquals(dataList.size(), actualDataArray.size());
    for (int i = 0; i < actualDataArray.size(); i++) {
      assertArrayEquals("Row " + i + " does not match", dataList.get(i), actualDataArray.get(i));
    }

    // Reader should be closed (not ready).
    thrown.expect(IOException.class);
    thrown.expectMessage("Stream closed");
    reader.ready();
  }

  @Test
  public void testGetCsvDataListMap() throws IOException {
    // Construct the expected list of row maps.
    List<Map<String, String>> expectedDataListMap = Lists.newArrayList();
    String[] columnHeaders = new String[4];
    if (headerPresent) {
      columnHeaders = originalDataList.get(0);
    } else {
      for (int i = 0; i < columnHeaders.length; i++) {
        columnHeaders[i] = Integer.valueOf(i).toString();
      }
    }
    for (String[] rowData : dataList) {
      Map<String, String> rowMap = Maps.newHashMap();
      for (int i = 0; i < rowData.length; i++) {
        rowMap.put(columnHeaders[i], rowData[i]);
      }
      expectedDataListMap.add(rowMap);
    }

    // Verify CsvFiles.getCsvDataListMap returns the expected list of row maps.
    List<Map<String, String>> actualDataListMap =
        CsvFiles.getCsvDataListMap(csvStringFile.getPath(), headerPresent);
    assertEquals(expectedDataListMap, actualDataListMap);
  }

  @Test
  public void testGetCsvDataByColumn() throws IOException {
    List<List<String>> expectedData = Lists.newArrayList();
    expectedData.add(Lists.newArrayList("a", "b", "c"));
    expectedData.add(Lists.newArrayList("a1", "b1", "c1"));
    for (int column = 0; column < 2; column++) {
      List<String> actualDataByColumn =
          CsvFiles.getCsvDataByColumn(csvStringFile.getPath(), column, headerPresent);
      List<String> expectedDataByColumn = expectedData.get(column);
      if (headerPresent) {
        expectedDataByColumn.remove(0);
      }
      assertEquals(
          "Values for column " + column + " do not match",
          expectedDataByColumn,
          actualDataByColumn);
    }
  }
}
