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


package com.google.api.ads.adwords.jaxws.v201802.o;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="CATEGORY_PRODUCTS_AND_SERVICES"/>
 *     &lt;enumeration value="COMPETITION"/>
 *     &lt;enumeration value="EXTRACTED_FROM_WEBPAGE"/>
 *     &lt;enumeration value="IDEA_TYPE"/>
 *     &lt;enumeration value="KEYWORD_TEXT"/>
 *     &lt;enumeration value="SEARCH_VOLUME"/>
 *     &lt;enumeration value="AVERAGE_CPC"/>
 *     &lt;enumeration value="TARGETED_MONTHLY_SEARCHES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttributeType")
@XmlEnum
public enum AttributeType {


    /**
     * 
     *                 Value substituted in when the actual value is not available in the Web API
     *                 version being used.  (Please upgrade to the latest published WSDL.)
     *                 <p>This element is not supported directly by any {@link IdeaType}.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Represents a category ID in the "Products and Services" taxonomy.
     *                 
     *                 <p>Resulting attribute is {@link IntegerSetAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    CATEGORY_PRODUCTS_AND_SERVICES,

    /**
     * 
     *                 Represents the relative amount of competition associated with the given keyword idea,
     *                 relative to other keywords. This value will be between 0 and 1 (inclusive).
     *                 
     *                 <p>Resulting attribute is {@link DoubleAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    COMPETITION,

    /**
     * 
     *                 Represents the webpage from which this keyword idea was extracted (if applicable.)
     *                 
     *                 <p>Resulting attribute is {@link WebpageDescriptorAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    EXTRACTED_FROM_WEBPAGE,

    /**
     * 
     *                 Represents the type of the given idea.
     *                 
     *                 <p>Resulting attribute is {@link IdeaTypeAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    IDEA_TYPE,

    /**
     * 
     *                 Represents the keyword text for the given keyword idea.
     *                 
     *                 <p>Resulting attribute is {@link StringAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    KEYWORD_TEXT,

    /**
     * 
     *                 Represents either the (approximate) number of searches for the given keyword idea on google.com
     *                 or google.com and partners, depending on the user's targeting.
     *                 
     *                 <p>Resulting attribute is {@link LongAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    SEARCH_VOLUME,

    /**
     * 
     *                 Represents the average cost per click historically paid for the keyword.
     *                 
     *                 <p>Resulting attribute is {@link MoneyAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    AVERAGE_CPC,

    /**
     * 
     *                 Represents the (approximated) number of searches on this keyword idea (as available for the
     *                 past twelve months), targeted to the specified geographies.
     *                 
     *                 <p>Resulting attribute is {@link MonthlySearchVolumeAttribute}.
     *                 <p>This element is supported by following {@link IdeaType}s: KEYWORD.
     *               
     * 
     */
    TARGETED_MONTHLY_SEARCHES;

    public String value() {
        return name();
    }

    public static AttributeType fromValue(String v) {
        return valueOf(v);
    }

}
