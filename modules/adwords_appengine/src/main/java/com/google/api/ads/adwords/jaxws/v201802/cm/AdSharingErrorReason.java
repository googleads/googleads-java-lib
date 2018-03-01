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
 * <p>Java class for AdSharingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdSharingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_GROUP_ALREADY_CONTAINS_AD"/>
 *     &lt;enumeration value="INCOMPATIBLE_AD_UNDER_AD_GROUP"/>
 *     &lt;enumeration value="CANNOT_SHARE_INACTIVE_AD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdSharingError.Reason")
@XmlEnum
public enum AdSharingErrorReason {


    /**
     * 
     *                 Error resulting in attempting to add an Ad to an AdGroup that already contains the Ad.
     *               
     * 
     */
    AD_GROUP_ALREADY_CONTAINS_AD,

    /**
     * 
     *                 Ad is not compatible with the AdGroup it is being shared with. For more details, look
     *                 at {@link #sharedAdError}.
     *               
     * 
     */
    INCOMPATIBLE_AD_UNDER_AD_GROUP,

    /**
     * 
     *                 Cannot add AdGroupAd on inactive Ad.
     *               
     * 
     */
    CANNOT_SHARE_INACTIVE_AD;

    public String value() {
        return name();
    }

    public static AdSharingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
