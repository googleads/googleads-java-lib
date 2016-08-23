// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201607.express;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressBusinessError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpressBusinessError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_WEBSITE"/>
 *     &lt;enumeration value="INVALID_ADDRESS"/>
 *     &lt;enumeration value="INVALID_PHONE_NUMBER"/>
 *     &lt;enumeration value="PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExpressBusinessError.Reason")
@XmlEnum
public enum ExpressBusinessErrorReason {


    /**
     * 
     *                 Website is invalid.
     *               
     * 
     */
    INVALID_WEBSITE,

    /**
     * 
     *                 Address is invalid or cannot be geocoded using the specified geo point.
     *               
     * 
     */
    INVALID_ADDRESS,

    /**
     * 
     *                 Phone number is invalid.
     *               
     * 
     */
    INVALID_PHONE_NUMBER,

    /**
     * 
     *                 Premium rate phone numbers e.g. 1-900 numbers not allowed.
     *               
     * 
     */
    PREMIUM_RATE_PHONE_NUMBER_NOT_ALLOWED,

    /**
     * 
     *                 Default error.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ExpressBusinessErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
