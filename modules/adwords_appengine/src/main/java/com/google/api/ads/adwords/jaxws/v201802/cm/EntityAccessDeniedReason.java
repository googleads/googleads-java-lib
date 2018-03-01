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
 * <p>Java class for EntityAccessDenied.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityAccessDenied.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="READ_ACCESS_DENIED"/>
 *     &lt;enumeration value="WRITE_ACCESS_DENIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityAccessDenied.Reason")
@XmlEnum
public enum EntityAccessDeniedReason {


    /**
     * 
     *                 User did not have read access.
     *               
     * 
     */
    READ_ACCESS_DENIED,

    /**
     * 
     *                 User did not have write access.
     *               
     * 
     */
    WRITE_ACCESS_DENIED;

    public String value() {
        return name();
    }

    public static EntityAccessDeniedReason fromValue(String v) {
        return valueOf(v);
    }

}
