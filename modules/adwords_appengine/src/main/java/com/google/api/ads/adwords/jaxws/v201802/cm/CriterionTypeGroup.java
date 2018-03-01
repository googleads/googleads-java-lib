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
 * <p>Java class for CriterionTypeGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriterionTypeGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="USER_INTEREST_AND_LIST"/>
 *     &lt;enumeration value="VERTICAL"/>
 *     &lt;enumeration value="GENDER"/>
 *     &lt;enumeration value="AGE_RANGE"/>
 *     &lt;enumeration value="PLACEMENT"/>
 *     &lt;enumeration value="PARENT"/>
 *     &lt;enumeration value="INCOME_RANGE"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriterionTypeGroup")
@XmlEnum
public enum CriterionTypeGroup {


    /**
     * 
     *                 Criteria for targeting keywords. e.g. 'mars cruise'
     *                 KEYWORD may be used as a content bid dimension. Keywords are always a targeting dimension,
     *                 so may not be set as a target "ALL" dimension with {@link TargetRestriction}.
     *               
     * 
     */
    KEYWORD,

    /**
     * 
     *                 Criteria for targeting lists of users.  Lists may represent users with particular
     *                 interests, or they may represent users who have interacted with an advertiser's site in
     *                 particular ways.
     *               
     * 
     */
    USER_INTEREST_AND_LIST,

    /**
     * 
     *                 Criteria for targeting similar categories of placements, e.g. 'category::Animals>Pets'
     *                 Used only for content network targeting.
     *               
     * 
     */
    VERTICAL,

    /**
     * 
     *                 Criteria for targeting gender.
     *               
     * 
     */
    GENDER,

    /**
     * 
     *                 Criteria for targeting age ranges.
     *               
     * 
     */
    AGE_RANGE,

    /**
     * 
     *                 Criteria for targeting placements. aka Website. e.g. 'www.flowers4sale.com'
     *                 This group also includes mobile applications and mobile app categories.
     *               
     * 
     */
    PLACEMENT,

    /**
     * 
     *                 Criteria for parental status targeting.
     *               
     * 
     */
    PARENT,

    /**
     * 
     *                 Criteria for income range targeting.
     *               
     * 
     */
    INCOME_RANGE,

    /**
     * 
     *                 Special criteria type group used to reset the existing value of AdGroup's
     *                 contentBidCriterionTypeGroup.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CriterionTypeGroup fromValue(String v) {
        return valueOf(v);
    }

}
