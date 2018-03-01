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
 * <p>Java class for CustomerSyncError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerSyncError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CAMPAIGN_ID"/>
 *     &lt;enumeration value="INVALID_FEED_ID"/>
 *     &lt;enumeration value="INVALID_DATE_RANGE"/>
 *     &lt;enumeration value="TOO_MANY_CHANGES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerSyncError.Reason")
@XmlEnum
public enum CustomerSyncErrorReason {


    /**
     * 
     *                 The request attempted to access a campaign that either does not exist or belongs to a
     *                 different account.
     *               
     * 
     */
    INVALID_CAMPAIGN_ID,

    /**
     * 
     *                 The request attempted to access a feed that either does not exist or belongs to a different
     *                 account.
     *               
     * 
     */
    INVALID_FEED_ID,

    /**
     * 
     *                 The request asked for an invalid date range
     *               
     * 
     */
    INVALID_DATE_RANGE,

    /**
     * 
     *                 There have been too many changes to sync the campaign over the requested date/time range. To
     *                 avoid this error, try specifying a smaller date/time range. If this does not work, you should
     *                 assume that everything has changed and retrieve the objects using their respective services.
     *               
     * 
     */
    TOO_MANY_CHANGES;

    public String value() {
        return name();
    }

    public static CustomerSyncErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
