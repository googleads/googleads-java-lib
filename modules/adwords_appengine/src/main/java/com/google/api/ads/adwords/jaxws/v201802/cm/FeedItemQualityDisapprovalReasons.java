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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedItemQualityDisapprovalReasons.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeedItemQualityDisapprovalReasons">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="TABLE_REPETITIVE_HEADERS"/>
 *     &lt;enumeration value="TABLE_REPETITIVE_DESCRIPTION"/>
 *     &lt;enumeration value="TABLE_INCONSISTENT_ROWS"/>
 *     &lt;enumeration value="DESCRIPTION_HAS_PRICE_QUALIFIERS"/>
 *     &lt;enumeration value="UNSUPPORTED_LANGUAGE"/>
 *     &lt;enumeration value="TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH"/>
 *     &lt;enumeration value="TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT"/>
 *     &lt;enumeration value="TABLE_ROW_DESCRIPTION_NOT_RELEVANT"/>
 *     &lt;enumeration value="TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT"/>
 *     &lt;enumeration value="TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE"/>
 *     &lt;enumeration value="TABLE_ROW_UNRATEABLE"/>
 *     &lt;enumeration value="TABLE_ROW_PRICE_INVALID"/>
 *     &lt;enumeration value="TABLE_ROW_URL_INVALID"/>
 *     &lt;enumeration value="HEADER_OR_DESCRIPTION_HAS_PRICE"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPETS_REPEATED_VALUES"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeedItemQualityDisapprovalReasons")
@XmlEnum
public enum FeedItemQualityDisapprovalReasons {

    UNKNOWN,

    /**
     * 
     *                 Price contains repetitive headers
     *               
     * 
     */
    TABLE_REPETITIVE_HEADERS,

    /**
     * 
     *                 Price contains repetitive description
     *               
     * 
     */
    TABLE_REPETITIVE_DESCRIPTION,

    /**
     * 
     *                 Price contains inconsistent items
     *               
     * 
     */
    TABLE_INCONSISTENT_ROWS,

    /**
     * 
     *                 Price qualifiers in description
     *               
     * 
     */
    DESCRIPTION_HAS_PRICE_QUALIFIERS,

    /**
     * 
     *                 Unsupported language
     *               
     * 
     */
    UNSUPPORTED_LANGUAGE,

    /**
     * 
     *                 Price item header is not relevant to the price type
     *               
     * 
     */
    TABLE_ROW_HEADER_TABLE_TYPE_MISMATCH,

    /**
     * 
     *                 Price item header has promotional text
     *               
     * 
     */
    TABLE_ROW_HEADER_HAS_PROMOTIONAL_TEXT,

    /**
     * 
     *                 Price item description is not relevant to the item header
     *               
     * 
     */
    TABLE_ROW_DESCRIPTION_NOT_RELEVANT,

    /**
     * 
     *                 Price item description contains promotional text
     *               
     * 
     */
    TABLE_ROW_DESCRIPTION_HAS_PROMOTIONAL_TEXT,

    /**
     * 
     *                 Price item header and description are repetitive
     *               
     * 
     */
    TABLE_ROW_HEADER_DESCRIPTION_REPETITIVE,

    /**
     * 
     *                 Price item is in a foreign language, nonsense, or can't be rated
     *               
     * 
     */
    TABLE_ROW_UNRATEABLE,

    /**
     * 
     *                 Price item price is invalid or inaccurate
     *               
     * 
     */
    TABLE_ROW_PRICE_INVALID,

    /**
     * 
     *                 Price item url is invalid or irrelevant
     *               
     * 
     */
    TABLE_ROW_URL_INVALID,

    /**
     * 
     *                 Header or description has price
     *               
     * 
     */
    HEADER_OR_DESCRIPTION_HAS_PRICE,

    /**
     * 
     *                 Snippet values do not match the header
     *               
     * 
     */
    STRUCTURED_SNIPPETS_HEADER_POLICY_VIOLATED,

    /**
     * 
     *                 Snippet values are repeated
     *               
     * 
     */
    STRUCTURED_SNIPPETS_REPEATED_VALUES,

    /**
     * 
     *                 Snippet values violate editorial guidelines like punctuation
     *               
     * 
     */
    STRUCTURED_SNIPPETS_EDITORIAL_GUIDELINES,

    /**
     * 
     *                 Snippets contain promotional text
     *               
     * 
     */
    STRUCTURED_SNIPPETS_HAS_PROMOTIONAL_TEXT;

    public String value() {
        return name();
    }

    public static FeedItemQualityDisapprovalReasons fromValue(String v) {
        return valueOf(v);
    }

}
