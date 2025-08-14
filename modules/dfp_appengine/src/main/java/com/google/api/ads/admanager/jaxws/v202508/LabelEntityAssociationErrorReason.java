// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LabelEntityAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LabelEntityAssociationError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUPLICATE_ASSOCIATION"/&gt;
 *     &lt;enumeration value="INVALID_ASSOCIATION"/&gt;
 *     &lt;enumeration value="NEGATION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="DUPLICATE_ASSOCIATION_WITH_NEGATION"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LabelEntityAssociationError.Reason")
@XmlEnum
public enum LabelEntityAssociationErrorReason {


    /**
     * 
     *                 The label has already been attached to the entity.
     *               
     * 
     */
    DUPLICATE_ASSOCIATION,

    /**
     * 
     *                 A label is being applied to an entity that does not support that entity
     *                 type.
     *               
     * 
     */
    INVALID_ASSOCIATION,

    /**
     * 
     *                 Label negation cannot be applied to the entity type.
     *               
     * 
     */
    NEGATION_NOT_ALLOWED,

    /**
     * 
     *                 The same label is being applied and negated to the same entity.
     *               
     * 
     */
    DUPLICATE_ASSOCIATION_WITH_NEGATION,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LabelEntityAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
