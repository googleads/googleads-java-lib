// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields;

/**
 * This is the base interface that all Enums used on constant fields must implement.
 */
public interface EntityField {

  /**
   * If the field is filterable.
   *
   * @return true for a filterable field, false otherwise.
   */
  boolean isFilterable();

  /**
   * The name of the field. (Same as the Enum {@code name()})
   *
   * @return the name of the field.
   */
  String name();

}
