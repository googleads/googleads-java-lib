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
 * <p>Java class for SwiffyConversionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SwiffyConversionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SERVER_ERROR"/>
 *     &lt;enumeration value="INVALID_FLASH_FILE"/>
 *     &lt;enumeration value="UNSUPPORTED_FLASH"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SwiffyConversionError.Reason")
@XmlEnum
public enum SwiffyConversionErrorReason {


    /**
     * 
     *                 Indicates the Swiffy service has an internal error that prevents the flash
     *                 asset being converted.
     *               
     * 
     */
    SERVER_ERROR,

    /**
     * 
     *                 Indicates the uploaded flash asset is not a valid flash file.
     *               
     * 
     */
    INVALID_FLASH_FILE,

    /**
     * 
     *                 Indicates the Swiffy service currently does not support converting this
     *                 flash asset.
     *               
     * 
     */
    UNSUPPORTED_FLASH,

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

    public static SwiffyConversionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
