// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension.util;

import com.google.common.base.Functions;

import java.util.Arrays;
import java.util.List;

/**
 * Utility class for List operations/transformations.
 */
public final class ListUtil {

  private ListUtil() {}

  /**
   * Transform an array T[] into a List of T.
   *
   * @param array the generic T[] to transform
   * @return a converted List of Ts
   */
  public static <T> List<T> asList(T[] array) {
    return array == null ?
        com.google.common.collect.Lists.<T>newArrayList() : Arrays.asList(array);
  }

  /**
   * Transform a List of Ts into a String Array.
   *
   * @param list the generic List of T to transform
   *        mainly used to transform for mixed long, Long and int.
   *        It cannot be null
   * @return a converted String Array
   */
  public static <T> String[] asStringArray(List<T> list) {
    return asStringList(list).toArray(new String[] {});
  }

  /**
   * Transform an Array T[] into a List of T.
   *
   * @param list the generic List of T to transform
   *        mainly used to transform for mixed long, Long and int.
   *        It cannot be null
   * @return a converted List of Strings
   */
  public static <T> List<String> asStringList(List<T> list) {
    return com.google.common.collect.Lists.transform(list, Functions.toStringFunction());
  }
}