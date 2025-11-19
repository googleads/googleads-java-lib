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


package com.google.api.ads.admanager.jaxws.v202511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublisherProvidedSignalsTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublisherProvidedSignalsTargetingError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNTARGETABLE_CATEGORY"/&gt;
 *     &lt;enumeration value="TARGETED_CATEGORIES_NOT_EXCLUDABLE"/&gt;
 *     &lt;enumeration value="CATEGORY_NOT_FOUND"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PublisherProvidedSignalsTargetingError.Reason")
@XmlEnum
public enum PublisherProvidedSignalsTargetingErrorReason {


    /**
     * 
     *                 Indicates that the category is not targetable.
     *               
     * 
     */
    UNTARGETABLE_CATEGORY,

    /**
     * 
     *                 A category that is targeted cannot also be excluded.
     *               
     * 
     */
    TARGETED_CATEGORIES_NOT_EXCLUDABLE,

    /**
     * 
     *                 Indicates that the category is sensitive or does not exist.
     *               
     * 
     */
    CATEGORY_NOT_FOUND,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PublisherProvidedSignalsTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
