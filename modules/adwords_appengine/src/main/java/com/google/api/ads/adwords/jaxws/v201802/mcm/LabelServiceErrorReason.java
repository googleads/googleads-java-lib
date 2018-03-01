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


package com.google.api.ads.adwords.jaxws.v201802.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelServiceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelServiceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMPTY_LABEL_NAME"/>
 *     &lt;enumeration value="LABEL_NAME_TOO_LONG"/>
 *     &lt;enumeration value="DUPLICATE_LABEL_NAME"/>
 *     &lt;enumeration value="RESERVED_LABEL_NAME"/>
 *     &lt;enumeration value="CANNOT_BE_DELETED"/>
 *     &lt;enumeration value="TOO_MANY_LABELS"/>
 *     &lt;enumeration value="INVALID_LABEL_ID"/>
 *     &lt;enumeration value="CUSTOMER_CANNOT_CREATE_LABELS"/>
 *     &lt;enumeration value="SERVER_CLIENT_VERSION_MISMATCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LabelServiceError.Reason")
@XmlEnum
public enum LabelServiceErrorReason {


    /**
     * 
     *                 The label name is empty.
     *               
     * 
     */
    EMPTY_LABEL_NAME,

    /**
     * 
     *                 The label name is longer than max allowed size.
     *               
     * 
     */
    LABEL_NAME_TOO_LONG,

    /**
     * 
     *                 The customer already has an active label with the same name.
     *               
     * 
     */
    DUPLICATE_LABEL_NAME,

    /**
     * 
     *                 The label name is reserved by the system.
     *               
     * 
     */
    RESERVED_LABEL_NAME,

    /**
     * 
     *                 The label cannot be deleted
     *               
     * 
     */
    CANNOT_BE_DELETED,

    /**
     * 
     *                 A customer cannot own more than 200 labels.
     *               
     * 
     */
    TOO_MANY_LABELS,

    /**
     * 
     *                 Label id was not found.
     *               
     * 
     */
    INVALID_LABEL_ID,

    /**
     * 
     *                 This customer cannot create labels.  Only manager customers may create labels.
     *               
     * 
     */
    CUSTOMER_CANNOT_CREATE_LABELS,

    /**
     * 
     *                 An unknown enum value has been given for this error reason.
     *               
     * 
     */
    SERVER_CLIENT_VERSION_MISMATCH;

    public String value() {
        return name();
    }

    public static LabelServiceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
