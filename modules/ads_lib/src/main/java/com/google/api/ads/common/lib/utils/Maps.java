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

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A utility class for managing maps as represented in the API.
 *
 * @author Adam Rogal
 */
public final class Maps {

  /**
   * Default constructor.
   */
  private Maps() {}

  /**
   * Generates a map from a list of entries. Entries are defined in the API
   * as a class which consists of a {@code key} and {@code value} with a name
   * typically in the form of {@code Key_ValueMapEntry}, represented here as
   * {@code T}. The generated map must have same type {@code K} as the {@code
   * key} within {@code Key_ValueMapEntry}. The same applies for {@code V} and
   * {@code value} within {@code Key_ValueMapEntry}.
   *
   * @param <K> the type of the entry key
   * @param <V> the type of the entry value
   * @param <T> the map entry type
   * @param entryList the list of entries constituting a map as represented in
   *        the API
   * @return a map of type {@code K} and {@code V} representing the entry array
   * @throws IllegalArgumentException if {@code entryArray} is not compatible
   *         with {@code Map<K, V>} or if {@code entryArray == null}
   */
  @SuppressWarnings("unchecked")
  public static <K, V, T> Map<K, V> toMap(List<T> entryList) throws IllegalArgumentException {
    Preconditions.checkNotNull(entryList, "Entry list cannot be null.");

    Map<K, V> result = com.google.common.collect.Maps.newHashMap();
    for (Object entry : entryList) {
      try {
        Object key = PropertyUtils.getProperty(entry, "key");
        Object value = PropertyUtils.getProperty(entry, "value");

        result.put((K) key, (V) value);
      } catch (InvocationTargetException e) {
        throw new IllegalStateException("Unexpected exception while creating map: "
            + e.getMessage(), e.getTargetException());
      } catch (IllegalAccessException e) {
        throw new IllegalStateException("Unexpected exception while creating map: "
            + e.getMessage(), e);
      } catch (NoSuchMethodException e) {
        throw new IllegalStateException("Unexpected exception while creating map: "
            + e.getMessage(), e);
      }
    }
    return result;
  }

  /**
   * Generates a map from an array an entries. Entries are defined in the API
   * as a class which consists of a {@code key} and {@code value} with a name
   * typically in the form of {@code Key_ValueMapEntry}, represented here as
   * {@code T}. The generated map must have same type {@code K} as the {@code
   * key} within {@code Key_ValueMapEntry}. The same applies for {@code V} and
   * {@code value} within {@code Key_ValueMapEntry}. If
   * {@code entryArray == null}, an emtpy map is returned.
   *
   * @param <K> the type of the entry key
   * @param <V> the type of the entry value
   * @param <T> the map entry type
   * @param entryArray the array of entries constituting a map as represented in
   *     the API
   * @return a map of type {@code K} and {@code V} representing the entry array
   * @throws IllegalArgumentException if {@code entryArray} is not compatible
   *     with {@code Map<K, V>}.
   */
  public static <K, V, T> Map<K, V> toMap(T[] entryArray) throws IllegalArgumentException {
    if (entryArray == null) {
      return com.google.common.collect.Maps.<K, V>newHashMap();
    }
    return toMap(Arrays.asList(entryArray));
  }

  /**
   * Generates an array of entries from a map. Entries are defined in the API as
   * a class which consists of a {@code key} and {@code value} with a name
   * typically in the form of {@code Key_ValueMapEntry}, represented here as
   * {@code T}. The generated array can be used in objects where {@code
   * List<Key_ValueMapEntry>} is taken as a value. The input map must have same type
   * {@code K} as the {@code key} within {@code Key_ValueMapEntry}. The same
   * applies for {@code V} and {@code value} within {@code Key_ValueMapEntry}.
   *
   * @param <K> the type of the entry key
   * @param <V> the type of the entry value
   * @param <T> the map entry type
   * @param map a map of type {@code K} and {@code V} representing the entry
   *     array
   * @param entryArray the entry array that entries will be added into
   * @return an array all map entries contained within the map parameter into
   *     the provided array or a new array if there was not enough room
   */
  public static <K, V, T> T[] toArray(Map<K, V> map, T[] entryArray) {
    return toList(map, entryArray.getClass().getComponentType()).toArray(entryArray);
  }

  /**
   * Generates a list of entries from a map. Entries are defined in the API as
   * a class which consists of a {@code key} and {@code value} with a name
   * typically in the form of {@code Key_ValueMapEntry}, represented here as
   * {@code T}. The generated array can be used in objects where {@code
   * List<Key_ValueMapEntry>} is taken as a value. The input map must have same type
   * {@code K} as the {@code key} within {@code Key_ValueMapEntry}. The same
   * applies for {@code V} and {@code value} within {@code Key_ValueMapEntry}.
   *
   * @param <K> the type of the entry key
   * @param <V> the type of the entry value
   * @param <T> the map entry type
   * @param map a map of type {@code K} and {@code V} representing the entry
   *     array
   * @param entryClass the entry class of type <T>
   * @return a list of all map entries contained within the map parameter
   */
  public static <K, V, T> List<T> toList(Map<K, V> map, Class<T> entryClass) {
    Preconditions.checkNotNull(entryClass, "Entry class cannot be null.");

    List<T> result = Lists.newArrayList();
    for (Entry<K, V> entry : map.entrySet()) {
      try {
        T newEntry = entryClass.newInstance();

        PropertyUtils.setProperty(newEntry, "key", entry.getKey());
        PropertyUtils.setProperty(newEntry, "value", entry.getValue());

        result.add(newEntry);
      } catch (InvocationTargetException e) {
        throw new IllegalStateException("Unexpected exception while creating map entries: "
            + e.getMessage(), e.getTargetException());
      } catch (IllegalAccessException e) {
        throw new IllegalStateException("Unexpected exception while creating map entries: "
            + e.getMessage(), e);
      } catch (InstantiationException e) {
        throw new IllegalStateException("Unexpected exception while creating map entries: "
            + e.getMessage(), e);
      } catch (NoSuchMethodException e) {
        throw new IllegalStateException("Unexpected exception while creating map entries: "
            + e.getMessage(), e);
      }
    }
    return result;
  }
}
