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
 * <p>Java class for AdCustomizerError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdCustomizerError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COUNTDOWN_INVALID_DATE_FORMAT"/>
 *     &lt;enumeration value="COUNTDOWN_DATE_IN_PAST"/>
 *     &lt;enumeration value="COUNTDOWN_INVALID_LOCALE"/>
 *     &lt;enumeration value="COUNTDOWN_INVALID_START_DAYS_BEFORE"/>
 *     &lt;enumeration value="UNKNOWN_USER_LIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdCustomizerError.Reason")
@XmlEnum
public enum AdCustomizerErrorReason {


    /**
     * 
     *                 Invalid date argument in countdown function.
     *               
     * 
     */
    COUNTDOWN_INVALID_DATE_FORMAT,

    /**
     * 
     *                 Countdown end date is in the past.
     *               
     * 
     */
    COUNTDOWN_DATE_IN_PAST,

    /**
     * 
     *                 Invalid locale string in countdown function.
     *               
     * 
     */
    COUNTDOWN_INVALID_LOCALE,

    /**
     * 
     *                 Days-before argument to countdown function is not positive.
     *               
     * 
     */
    COUNTDOWN_INVALID_START_DAYS_BEFORE,

    /**
     * 
     *                 A user list referenced in an IF function does not exist.
     *               
     * 
     */
    UNKNOWN_USER_LIST;

    public String value() {
        return name();
    }

    public static AdCustomizerErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
