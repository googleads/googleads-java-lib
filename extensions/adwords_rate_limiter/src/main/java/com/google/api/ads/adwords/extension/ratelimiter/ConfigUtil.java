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

package com.google.api.ads.adwords.extension.ratelimiter;

/**
 * Utility class for reading configurations.
 */
public class ConfigUtil {
  /**
   * Gets the specified system property's value as an integer. If the value is missing, cannot be
   * parsed as an integer or is negative, returns {@code defaultValue}.
   *
   * @param propertyName the name of the system property.
   * @param defaultValue the default value for the system property.
   * @return the value of the system property as an int, if it's available and valid, else the
   *     {@code defaultValue}
   */
  public static int getIntConfigValue(String propertyName, int defaultValue) {
    String propertyValueStr = System.getProperty(propertyName, String.valueOf(defaultValue));
    int propertyValue = defaultValue;
    try {
      propertyValue = Integer.parseInt(propertyValueStr);
    } catch (NumberFormatException e) {
      // Just swallow it, and propertyValue is still default.
    }

    return propertyValue >= 0 ? propertyValue : defaultValue;
  }
}
