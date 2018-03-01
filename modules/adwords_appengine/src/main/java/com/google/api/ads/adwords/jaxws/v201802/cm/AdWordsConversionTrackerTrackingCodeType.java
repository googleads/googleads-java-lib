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
 * <p>Java class for AdWordsConversionTracker.TrackingCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdWordsConversionTracker.TrackingCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEBPAGE"/>
 *     &lt;enumeration value="WEBPAGE_ONCLICK"/>
 *     &lt;enumeration value="CLICK_TO_CALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdWordsConversionTracker.TrackingCodeType")
@XmlEnum
public enum AdWordsConversionTrackerTrackingCodeType {


    /**
     * 
     *                 The snippet that is fired as a result of a website page loading.
     *               
     * 
     */
    WEBPAGE,

    /**
     * 
     *                 The snippet contains a JavaScript function which fires the tag. This function is typically
     *                 called from an onClick handler added to a link or button element on the page.
     *               
     * 
     */
    WEBPAGE_ONCLICK,

    /**
     * 
     *                 For embedding on a (mobile) webpage. The snippet contains a JavaScript function which fires
     *                 the tag. This function is typically called from an onClick handler added to a link or button
     *                 element on the page that also instructs a mobile device to dial the advertiser's phone
     *                 number.
     *               
     * 
     */
    CLICK_TO_CALL;

    public String value() {
        return name();
    }

    public static AdWordsConversionTrackerTrackingCodeType fromValue(String v) {
        return valueOf(v);
    }

}
