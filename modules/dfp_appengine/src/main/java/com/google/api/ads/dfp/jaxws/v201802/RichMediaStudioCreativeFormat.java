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
 * <p>Java class for RichMediaStudioCreativeFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichMediaStudioCreativeFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_PAGE"/>
 *     &lt;enumeration value="EXPANDING"/>
 *     &lt;enumeration value="IM_EXPANDING"/>
 *     &lt;enumeration value="FLOATING"/>
 *     &lt;enumeration value="PEEL_DOWN"/>
 *     &lt;enumeration value="IN_PAGE_WITH_FLOATING"/>
 *     &lt;enumeration value="FLASH_IN_FLASH"/>
 *     &lt;enumeration value="FLASH_IN_FLASH_EXPANDING"/>
 *     &lt;enumeration value="IN_APP"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RichMediaStudioCreativeFormat")
@XmlEnum
public enum RichMediaStudioCreativeFormat {


    /**
     * 
     *                 In-page creatives are served into an ad slot on publishers page.
     *                 In-page implies that they maintain a static size, e.g, 468x60 and
     *                 do not break out of these dimensions.
     *               
     * 
     */
    IN_PAGE,

    /**
     * 
     *                 Expanding creatives expand/collapse on user interaction such as mouse over.
     *                 It consists of an initial, or collapsed and an expanded creative area.
     *               
     * 
     */
    EXPANDING,

    /**
     * 
     *                 Creatives that are served in an instant messenger application such as
     *                 AOL Instant Messanger or Yahoo! Messenger. This can also be used in
     *                 desktop applications such as weatherbug.
     *               
     * 
     */
    IM_EXPANDING,

    /**
     * 
     *                 Floating creatives float on top of publishers page and can be closed with
     *                 a close button.
     *               
     * 
     */
    FLOATING,

    /**
     * 
     *                 Peel-down creatives show a glimpse of your ad in the corner of a web
     *                 page. When the user interacts, the rest of the ad peels down to reveal
     *                 the full message.
     *               
     * 
     */
    PEEL_DOWN,

    /**
     * 
     *                 An In-Page with Floating creative is a dual-asset creative consisting of
     *                 an in-page asset and a floating asset. This creative type lets you deliver
     *                 a static primary ad to a webpage, while inviting a user to find out more
     *                 through a floating asset delivered when the user interacts with the
     *                 creative.
     *               
     * 
     */
    IN_PAGE_WITH_FLOATING,

    /**
     * 
     *                 A Flash ad that renders in a Flash environment.  The adserver will serve
     *                 this using VAST, but it is not a proper VAST XML ad.  It's an amalgamation
     *                 of the proprietary InStream protocol, rendered inside VAST so that we
     *                 can capture some standard behavior such as companions.
     *               
     * 
     */
    FLASH_IN_FLASH,

    /**
     * 
     *                 An expanding flash ad that renders in a Flash environment. The adserver
     *                 will serve this using VAST, but it is not a proper VAST XML ad. It's an
     *                 amalgamation of the proprietary InStream protocol, rendered inside VAST so
     *                 that we can capture some standard behavior such as companions.
     *               
     * 
     */
    FLASH_IN_FLASH_EXPANDING,

    /**
     * 
     *                 In-app creatives are served into an ad slot within a publisher's app.
     *                 In-app implies that they maintain a static size, e.g, 468x60 and
     *                 do not break out of these dimensions.
     *               
     * 
     */
    IN_APP,

    /**
     * 
     *                 The creative format is unknown or not supported in the API version in use.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RichMediaStudioCreativeFormat fromValue(String v) {
        return valueOf(v);
    }

}
