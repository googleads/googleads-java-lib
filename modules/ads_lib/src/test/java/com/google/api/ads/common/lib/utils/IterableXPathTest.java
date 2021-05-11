// Copyright 2017 Google Inc. All Rights Reserved.
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

import com.google.common.collect.Iterables;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for {@link IterableXPath}. */
@RunWith(JUnit4.class)
public class IterableXPathTest {

  @Test
  public void testValidXPathWithLeadingSlash() {
    String xPath = "/Envelope/RequestHeader/SomeValue";
    IterableXPath iterableXPath = new IterableXPath(xPath);
    assertEquals(xPath, iterableXPath.getXPath());
    String[] expected = new String[] {"Envelope", "RequestHeader", "SomeValue"};
    assertArrayEquals(expected, Iterables.toArray(iterableXPath, String.class));
  }

  @Test
  public void testValidXPathWithoutLeadingSlash() {
    String xPath = "Envelope/RequestHeader/SomeValue";
    IterableXPath iterableXPath = new IterableXPath(xPath);
    assertEquals(xPath, iterableXPath.getXPath());
    String[] expected = new String[] {"Envelope", "RequestHeader", "SomeValue"};
    assertArrayEquals(expected, Iterables.toArray(iterableXPath, String.class));
  }

  @Test
  public void testValidXPathWithTrailingSlash() {
    String xPath = "/Envelope/RequestHeader/SomeValue/";
    IterableXPath iterableXPath = new IterableXPath(xPath);
    assertEquals(xPath, iterableXPath.getXPath());
    String[] expected = new String[] {"Envelope", "RequestHeader", "SomeValue"};
    assertArrayEquals(expected, Iterables.toArray(iterableXPath, String.class));
  }

  @Test
  public void testEmptyXPath() {
    String xPath = "";
    IterableXPath iterableXPath = new IterableXPath(xPath);
    assertEquals(xPath, iterableXPath.getXPath());
    assertArrayEquals(new String[0], Iterables.toArray(iterableXPath, String.class));
  }

  @Test
  public void testNullXPath() {
    String xPath = null;
    IterableXPath iterableXPath = new IterableXPath(xPath);
    assertEquals(xPath, iterableXPath.getXPath());
    assertArrayEquals(new String[0], Iterables.toArray(iterableXPath, String.class));
  }
}
