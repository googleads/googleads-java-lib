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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;
import java.util.Map;

/**
 * Tests for {@link Maps}.
 */
@RunWith(JUnit4.class)
public class MapsTest {

  private String[] entry1Pair = new String[] {"One", "1"};
  private String[] entry2Pair = new String[] {"Two", "2"};

  private Entry entry1 = new Entry(entry1Pair[0], entry1Pair[1]);
  private Entry entry2 = new Entry(entry2Pair[0], entry2Pair[1]);

  private List<Entry> entriesList = Lists.newArrayList(entry1, entry2);

  /**
   * Map of test entries. Uses a LinkedHashMap to ensure that insertion order is preserved.
   */
  private Map<String, String> entriesMap = com.google.common.collect.Maps.newLinkedHashMap();

  @Before
  public void setUp() throws Exception {
    entriesMap.put(entry1Pair[0], entry1Pair[1]);
    entriesMap.put(entry2Pair[0], entry2Pair[1]);
  }

  @Test
  public void testToMap_list() {
    Map<String, String> map = Maps.<String, String, Entry>toMap(entriesList);
    assertEquals(entriesMap, map);
  }

  @Test
  public void testToMap_array() {
    Map<String, String> map =
        Maps.<String, String, Entry>toMap(entriesList.toArray(new Entry[entriesList.size()]));
    assertEquals(entriesMap, map);
  }

  /**
   * Tests {@link Maps#toArray(Map, Object[])} when the input array is large enough to hold all
   * entries in the supplied map.
   */
  @Test
  public void testToArray_sufficientSize() {
    Entry[] arrayToFill = new Entry[entriesList.size()];
    Entry[] expectedArray = entriesList.toArray(arrayToFill);
    Entry[] actualArray = Maps.<String, String, Entry>toArray(entriesMap, arrayToFill);
    assertArrayEquals(expectedArray, actualArray);
    assertSame(
        "toArray should not have created a new array since the input array was large enough",
        arrayToFill,
        actualArray);
  }

  /**
   * Tests {@link Maps#toArray(Map, Object[])} when the input array is not large enough to hold all
   * entries in the supplied map.
   */
  @Test
  public void testToArray_insufficientSize() {
    // Intentionally make the input array too small to fit all entries in the map.
    Entry[] arrayToFill = new Entry[0];
    Entry[] expectedArray = entriesList.toArray(arrayToFill);
    Entry[] actualArray = Maps.<String, String, Entry>toArray(entriesMap, arrayToFill);
    assertArrayEquals(expectedArray, actualArray);
    assertNotSame(
        "toArray should have created a new array since the input array was not large enough",
        arrayToFill,
        actualArray);
  }

  @Test
  public void testToList() {
    List<Entry> actualList = Maps.toList(entriesMap, Entry.class);
    assertEquals(entriesList, actualList);
  }

  /**
   * Simple entry class that has {@code key} and {@code value} properties, a zero-arg constructor,
   * and comparison methods. This conforms to the class requirements specified in
   * {@link Maps#toMap(List)} (and other {@link Maps} methods).
   */
  public static class Entry {

    private String key;
    private String value;

    public Entry() {
      // Required by Maps for reflection.
    }

    public Entry(String key, String value) {
      this.key = key;
      this.value = value;
    }

    public String getKey() {
      return key;
    }

    public String getValue() {
      return value;
    }

    public void setKey(String key) {
      this.key = key;
    }

    public void setValue(String value) {
      this.value = value;
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(key);
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Entry)) {
        return false;
      }
      return Objects.equal(key, ((Entry) obj).key);
    }

    @Override
    public String toString() {
      return MoreObjects.toStringHelper(getClass()).toString();
    }
  }
}
