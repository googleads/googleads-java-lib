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
 * <p>Java class for RichMediaStudioCreativeBillingAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaStudioCreativeBillingAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_PAGE"/>
 *     &lt;enumeration value="FLOATING_EXPANDING"/>
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="FLASH_IN_FLASH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RichMediaStudioCreativeBillingAttribute")
@XmlEnum
public enum RichMediaStudioCreativeBillingAttribute {


    /**
     * 
     *                 Applies to any {@link RichMediaStudioCreativeFormat#IN_PAGE}, without Video.
     *               
     * 
     */
    IN_PAGE,

    /**
     * 
     *                 Applies to any of these following {@link RichMediaStudioCreativeFormat}, without Video:
     *                 {@link RichMediaStudioCreativeFormat#EXPANDING},
     *                 {@link RichMediaStudioCreativeFormat#IM_EXPANDING},
     *                 {@link RichMediaStudioCreativeFormat#FLOATING},
     *                 {@link RichMediaStudioCreativeFormat#PEEL_DOWN},
     *                 {@link RichMediaStudioCreativeFormat#IN_PAGE_WITH_FLOATING}
     *               
     * 
     */
    FLOATING_EXPANDING,

    /**
     * 
     *                 Applies to any creatives that includes a video.
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 Applies to any {@link RichMediaStudioCreativeFormat#FLASH_IN_FLASH}, without Video.
     *               
     * 
     */
    FLASH_IN_FLASH;

    public String value() {
        return name();
    }

    public static RichMediaStudioCreativeBillingAttribute fromValue(String v) {
        return valueOf(v);
    }

}
