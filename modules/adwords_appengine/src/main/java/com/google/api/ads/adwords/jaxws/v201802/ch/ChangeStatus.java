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


package com.google.api.ads.adwords.jaxws.v201802.ch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIELDS_UNCHANGED"/>
 *     &lt;enumeration value="FIELDS_CHANGED"/>
 *     &lt;enumeration value="NEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangeStatus")
@XmlEnum
public enum ChangeStatus {


    /**
     * 
     *                 The fields of this entity have not changed, but there may still be changes to its children.
     *               
     * 
     */
    FIELDS_UNCHANGED,

    /**
     * 
     *                 The fields of this entity have changed, for example the name of an adgroup.
     *               
     * 
     */
    FIELDS_CHANGED,

    /**
     * 
     *                 This entity was created during the time frame we're looking at. We will not enumerate all of
     *                 the individual changes to this entity and its children. Instead it should be loaded from the
     *                 appropriate service.
     *               
     * 
     */
    NEW;

    public String value() {
        return name();
    }

    public static ChangeStatus fromValue(String v) {
        return valueOf(v);
    }

}
