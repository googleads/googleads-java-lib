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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeRotationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeRotationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EVEN"/>
 *     &lt;enumeration value="OPTIMIZED"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="SEQUENTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreativeRotationType")
@XmlEnum
public enum CreativeRotationType {


    /**
     * 
     *                 Creatives are displayed roughly the same number of times over
     *                 the duration of the line item.
     *               
     * 
     */
    EVEN,

    /**
     * 
     *                 Creatives are served roughly proportionally to their performance.
     *               
     * 
     */
    OPTIMIZED,

    /**
     * 
     *                 Creatives are served roughly proportionally to their weights, set on the
     *                 {@link LineItemCreativeAssociation}.
     *               
     * 
     */
    MANUAL,

    /**
     * 
     *                 Creatives are served exactly in sequential order, aka Storyboarding.
     *                 Set on the {@link LineItemCreativeAssociation}.
     *               
     * 
     */
    SEQUENTIAL;

    public String value() {
        return name();
    }

    public static CreativeRotationType fromValue(String v) {
        return valueOf(v);
    }

}
