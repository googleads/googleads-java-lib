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
 * <p>Java class for WebpageConditionOperand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WebpageConditionOperand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="CATEGORY"/>
 *     &lt;enumeration value="PAGE_TITLE"/>
 *     &lt;enumeration value="PAGE_CONTENT"/>
 *     &lt;enumeration value="CUSTOM_LABEL"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WebpageConditionOperand")
@XmlEnum
public enum WebpageConditionOperand {


    /**
     * 
     *                 Operand denoting a webpage URL targeting condition.
     *                 The operator {@link StringConditionOperator#CONTAINS} will be used for
     *                 such conditions.
     *               
     * 
     */
    URL,

    /**
     * 
     *                 Operand denoting a webpage category targeting condition.
     *                 The operator {@link StringConditionOperator#EQUALS} will be used for
     *                 such conditions.
     *               
     * 
     */
    CATEGORY,

    /**
     * 
     *                 Operand denoting a webpage title targeting condition.
     *                 The operator {@link StringConditionOperator#CONTAINS} will be used for
     *                 such conditions.
     *               
     * 
     */
    PAGE_TITLE,

    /**
     * 
     *                 Operand denoting a webpage content targeting condition.
     *                 The operator {@link StringConditionOperator#CONTAINS} will be used for
     *                 such conditions.
     *               
     * 
     */
    PAGE_CONTENT,

    /**
     * 
     *                 Operand denoting a webpage custom label targeting condition.<br>
     *                 The operator {@link StringConditionOperator#EQUALS} will be used for such conditions.
     *               
     * 
     */
    CUSTOM_LABEL,

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

    public static WebpageConditionOperand fromValue(String v) {
        return valueOf(v);
    }

}
