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
 * <p>Java class for AdParamError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdParamError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_PARAM_CANNOT_BE_SPECIFIED_MULTIPLE_TIMES"/>
 *     &lt;enumeration value="AD_PARAM_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="CRITERION_SPECIFIED_MUST_BE_KEYWORD"/>
 *     &lt;enumeration value="INVALID_ADGROUP_CRITERION_SPECIFIED"/>
 *     &lt;enumeration value="INVALID_INSERTION_TEXT_FORMAT"/>
 *     &lt;enumeration value="MUST_SPECIFY_ADGROUP_ID"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdParamError.Reason")
@XmlEnum
public enum AdParamErrorReason {


    /**
     * 
     *                 The same ad param cannot be specified in multiple operations
     *               
     * 
     */
    AD_PARAM_CANNOT_BE_SPECIFIED_MULTIPLE_TIMES,

    /**
     * 
     *                 Specified AdParam does not exist
     *               
     * 
     */
    AD_PARAM_DOES_NOT_EXIST,

    /**
     * 
     *                 Specified criterion is not a keyword
     *               
     * 
     */
    CRITERION_SPECIFIED_MUST_BE_KEYWORD,

    /**
     * 
     *                 The (AdGroupId,CriterionId) is invalid
     *               
     * 
     */
    INVALID_ADGROUP_CRITERION_SPECIFIED,

    /**
     * 
     *                 The insertion text is invalid
     *               
     * 
     */
    INVALID_INSERTION_TEXT_FORMAT,

    /**
     * 
     *                 Must specify AdGroupId in selector
     *               
     * 
     */
    MUST_SPECIFY_ADGROUP_ID,

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

    public static AdParamErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
