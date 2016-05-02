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

import com.google.common.collect.Lists;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.util.List;

/**
 * Tests for {@link CsvFiles}.
 */
@RunWith(JUnit4.class)
public class CsvFilesTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  private List<String[]> csvData = Lists.<String[]>newArrayList(
      new String[]{"a", "b"});
  
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
    CsvFiles.writeCsv(csvData, null);
  }
}

