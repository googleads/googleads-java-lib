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

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * A utility class for handling choice objects.
 *
 * @author Adam Rogal
 */
public final class Choices {

  /**
   * Default constructor.
   */
  private Choices() {}

  /**
   * Gets the value of the choice object without having to inspect each
   * field. Returns {@code null} if no non-null fields are found.
   *
   * @param obj the choice object to get the value from
   * @return the value of the choice
   * @throws IllegalArgumentException if {@code obj == null}
   */
  public static Object getValue(Object obj)
      throws IllegalArgumentException, IllegalAccessException {
    Preconditions.checkNotNull(obj, "Choice object cannot be null.");

    Field[] fields = obj.getClass().getDeclaredFields();
    for (Field field : fields) {
      if (!(field.getName().equals("typeDesc") || field.getName().startsWith("__"))) {
        try {
          Object value = PropertyUtils.getProperty(obj, field.getName());
          if (value != null) {
            return value;
          }
        } catch (InvocationTargetException e) {
          continue;
        } catch (NoSuchMethodException e) {
          continue;
        }
      }
    }
    return null;
  }
}
