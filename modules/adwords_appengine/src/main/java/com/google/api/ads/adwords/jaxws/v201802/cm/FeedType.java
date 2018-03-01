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
 * <p>Java class for Feed.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Feed.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SITELINK"/>
 *     &lt;enumeration value="CALL"/>
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="REVIEW"/>
 *     &lt;enumeration value="AD_CUSTOMIZER"/>
 *     &lt;enumeration value="CALLOUT"/>
 *     &lt;enumeration value="STRUCTURED_SNIPPET"/>
 *     &lt;enumeration value="MESSAGE"/>
 *     &lt;enumeration value="PRICE"/>
 *     &lt;enumeration value="PROMOTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Feed.Type")
@XmlEnum
public enum FeedType {

    NONE,

    /**
     * 
     *                 Sitelink placeholder typed
     *               
     * 
     */
    SITELINK,

    /**
     * 
     *                 Call placeholder typed
     *               
     * 
     */
    CALL,

    /**
     * 
     *                 App placeholder typed
     *               
     * 
     */
    APP,

    /**
     * 
     *                 Review placeholder typed
     *               
     * 
     */
    REVIEW,

    /**
     * 
     *                 AdCustomizer placeholder typed
     *               
     * 
     */
    AD_CUSTOMIZER,

    /**
     * 
     *                 Callout placeholder typed
     *               
     * 
     */
    CALLOUT,

    /**
     * 
     *                 Structured snippets placeholder typed
     *               
     * 
     */
    STRUCTURED_SNIPPET,

    /**
     * 
     *                 Message placeholder typed
     *               
     * 
     */
    MESSAGE,

    /**
     * 
     *                 Price placeholder typed
     *               
     * 
     */
    PRICE,

    /**
     * 
     *                 Promotion placeholder typed
     *               
     * 
     */
    PROMOTION;

    public String value() {
        return name();
    }

    public static FeedType fromValue(String v) {
        return valueOf(v);
    }

}
