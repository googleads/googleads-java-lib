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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SizeRange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SizeRange">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LESS_THAN_FIVE_HUNDRED"/>
 *     &lt;enumeration value="LESS_THAN_ONE_THOUSAND"/>
 *     &lt;enumeration value="ONE_THOUSAND_TO_TEN_THOUSAND"/>
 *     &lt;enumeration value="TEN_THOUSAND_TO_FIFTY_THOUSAND"/>
 *     &lt;enumeration value="FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND"/>
 *     &lt;enumeration value="ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND"/>
 *     &lt;enumeration value="THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND"/>
 *     &lt;enumeration value="FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION"/>
 *     &lt;enumeration value="ONE_MILLION_TO_TWO_MILLION"/>
 *     &lt;enumeration value="TWO_MILLION_TO_THREE_MILLION"/>
 *     &lt;enumeration value="THREE_MILLION_TO_FIVE_MILLION"/>
 *     &lt;enumeration value="FIVE_MILLION_TO_TEN_MILLION"/>
 *     &lt;enumeration value="TEN_MILLION_TO_TWENTY_MILLION"/>
 *     &lt;enumeration value="TWENTY_MILLION_TO_THIRTY_MILLION"/>
 *     &lt;enumeration value="THIRTY_MILLION_TO_FIFTY_MILLION"/>
 *     &lt;enumeration value="OVER_FIFTY_MILLION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SizeRange")
@XmlEnum
public enum SizeRange {

    LESS_THAN_FIVE_HUNDRED,
    LESS_THAN_ONE_THOUSAND,
    ONE_THOUSAND_TO_TEN_THOUSAND,
    TEN_THOUSAND_TO_FIFTY_THOUSAND,
    FIFTY_THOUSAND_TO_ONE_HUNDRED_THOUSAND,
    ONE_HUNDRED_THOUSAND_TO_THREE_HUNDRED_THOUSAND,
    THREE_HUNDRED_THOUSAND_TO_FIVE_HUNDRED_THOUSAND,
    FIVE_HUNDRED_THOUSAND_TO_ONE_MILLION,
    ONE_MILLION_TO_TWO_MILLION,
    TWO_MILLION_TO_THREE_MILLION,
    THREE_MILLION_TO_FIVE_MILLION,
    FIVE_MILLION_TO_TEN_MILLION,
    TEN_MILLION_TO_TWENTY_MILLION,
    TWENTY_MILLION_TO_THIRTY_MILLION,
    THIRTY_MILLION_TO_FIFTY_MILLION,
    OVER_FIFTY_MILLION;

    public String value() {
        return name();
    }

    public static SizeRange fromValue(String v) {
        return valueOf(v);
    }

}
