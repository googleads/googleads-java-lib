// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemCreativeAssociation.Status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemCreativeAssociation.Status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="NOT_SERVING"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemCreativeAssociation.Status")
@XmlEnum
public enum LineItemCreativeAssociationStatus {


    /**
     * 
     *                 The association is active and the associated {@link Creative} can be
     *                 served.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 The association is active but the associated {@link Creative} may not be
     *                 served, because its size is not targeted by the line item.
     *               
     * 
     */
    NOT_SERVING,

    /**
     * 
     *                 The association is inactive and the associated {@link Creative} is
     *                 ineligible for being served.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API
     *                 version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LineItemCreativeAssociationStatus fromValue(String v) {
        return valueOf(v);
    }

}
