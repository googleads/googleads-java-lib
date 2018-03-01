// Copyright 2018 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields.v201802.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code AdParam}.
 */
public enum AdParamField implements EntityField {

  // Fields constants definitions

  /**
   * ID of the associated ad group.
   * Text ads in this ad group will be candidates for parameterized text replacement.
   */
  @Filterable
  AdGroupId(true),

  /**
   * ID of the associated <code>Keyword</code> criterion.
   * The keyword must be in the same ad group as this <code>AdParam</code>.
   * Text ads triggered by this keyword will have their <code>{param<var>N</var>:<var>default-value</var>}</code> snippet replaced by the contents of {@code #insertionText}.
   */
  @Filterable
  CriterionId(true),

  /**
   * Numeric value to insert into the ad text.
   * The following restrictions apply: <ul> <li>Can use <code><b>,</b></code> or <code><b>.</b></code> as a separator, with an optional <code><b>.</b></code> or <code><b>,</b></code> (respectively) for fractional values.
   * For example, <code>1,000,000.00</code> and <code>2.000.000,10</code> are valid.</li> <li>Can be prepended or appended with a currency symbol.
   * For example, <code>$99.99</code> and <code>200&pound;</code> are valid.</li> <li>Can be prepended or appended with a currency code.
   * For example, <code>99.99USD</code> and <code>EUR200</code> are valid.</li> <li>Can use <code>%</code>.
   * For example, <code>1.0%</code> and <code>1,0%</code> are valid.</li> <li>Can use <code>+</code> or <code>-</code>.
   * For example, <code>-10.99</code> and <code>25+</code> are valid.</li> <li>Can use <code>/</code> between two numbers.
   * For example <code>4/1</code> and <code>0.95/0.45</code> are valid.</li> </ul>
   */
  InsertionText(false),

  /**
   * Defines which parameterized snippet of ad text to replace.
   * For example, a value of <code>1</code> indicates a replacement for the <code>{<b>param1</b>:<var>default-value</var>}</code> token.
   */
  ParamIndex(false),

  ;

  private final boolean isFilterable;

  private AdParamField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
