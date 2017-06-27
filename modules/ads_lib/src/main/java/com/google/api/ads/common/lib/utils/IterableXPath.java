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

import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import javax.annotation.Nullable;

/**
 * Wrapper around an XPath string that allows for iteration over the elements of the XPath.
 *
 * <p>For example, if {@code xPath = "Header/Request/SomeValue"}, then iterators returned by {@link
 * #iterator()} will return {@code "Header"}, {@code "Request"}, and {@code "SomeValue"}, in that
 * order.
 */
public class IterableXPath implements Iterable<String> {

  private final String xPath;
  private final ImmutableList<String> xPathElements;

  public IterableXPath(@Nullable String xPath) {
    this.xPath = xPath;
    this.xPathElements =
        ImmutableList.<String>copyOf(
            Splitter.on('/').omitEmptyStrings().splitToList(Strings.nullToEmpty(xPath)));
  }

  public String getXPath() {
    return xPath;
  }

  /**
   * Returns an iterator over the elements of {@link #getXPath()}. If {@link #getXPath()} is {@code
   * null} or empty, the returned iterator will be empty.
   */
  @Override
  public Iterator<String> iterator() {
    return xPathElements.iterator();
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("xPath", xPath)
        .add("xPathElements", xPathElements)
        .toString();
  }
}
