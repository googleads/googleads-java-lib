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
 * <p>Java class for AppPostbackUrlError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppPostbackUrlError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_URL_FORMAT"/>
 *     &lt;enumeration value="INVALID_DOMAIN"/>
 *     &lt;enumeration value="REQUIRED_MACRO_NOT_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppPostbackUrlError.Reason")
@XmlEnum
public enum AppPostbackUrlErrorReason {


    /**
     * 
     *                 Invalid Url format.
     *               
     * 
     */
    INVALID_URL_FORMAT,

    /**
     * 
     *                 Invalid domain.
     *               
     * 
     */
    INVALID_DOMAIN,

    /**
     * 
     *                 Some of the required macros were not found.
     *               
     * 
     */
    REQUIRED_MACRO_NOT_FOUND;

    public String value() {
        return name();
    }

    public static AppPostbackUrlErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
