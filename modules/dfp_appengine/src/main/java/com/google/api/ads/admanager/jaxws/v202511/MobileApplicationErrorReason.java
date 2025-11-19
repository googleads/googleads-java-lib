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
 * <p>Java class for MobileApplicationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileApplicationError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_APP_ID"/&gt;
 *     &lt;enumeration value="INVALID_EXCHANGE_PARTNER_SETTINGS"/&gt;
 *     &lt;enumeration value="INTERNAL"/&gt;
 *     &lt;enumeration value="NAME_OR_STORE_ID_MUST_BE_SET"/&gt;
 *     &lt;enumeration value="PUBLISHER_HAS_TOO_MANY_ACTIVE_APPS"/&gt;
 *     &lt;enumeration value="LINKED_APPLICATION_STORE_ID_TOO_LONG"/&gt;
 *     &lt;enumeration value="MANUAL_APP_NAME_TOO_LONG"/&gt;
 *     &lt;enumeration value="MANUAL_APP_NAME_EMPTY"/&gt;
 *     &lt;enumeration value="INVALID_COMBINED_PRODUCT_KEY"/&gt;
 *     &lt;enumeration value="LINKED_APP_SKIPPING_ID_VERIFICATION_MUST_BE_ANDROID_APP"/&gt;
 *     &lt;enumeration value="MISSING_APP_STORE_ENTRY"/&gt;
 *     &lt;enumeration value="CANNOT_SET_STORE_ID_MISSING_STORE_ENTRY"/&gt;
 *     &lt;enumeration value="CANNOT_SET_STORE_ID_INVALID_APP_STORE"/&gt;
 *     &lt;enumeration value="CANNOT_SET_STORE_ID_INVALID_STORE_ID"/&gt;
 *     &lt;enumeration value="CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID"/&gt;
 *     &lt;enumeration value="CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID_WITHIN_PLATFORM"/&gt;
 *     &lt;enumeration value="CANNOT_SET_STORE_ID_INVALID_ANDROID_PACKAGE_NAME"/&gt;
 *     &lt;enumeration value="INCOMPATIBLE_APP_STORE_LIST"/&gt;
 *     &lt;enumeration value="APP_STORE_LIST_CANNOT_HAVE_UNKNOWN_APP_STORE"/&gt;
 *     &lt;enumeration value="APP_STORE_LIST_CANNOT_REMOVE_FIRST_PARTY_APP_STORE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MobileApplicationError.Reason")
@XmlEnum
public enum MobileApplicationErrorReason {


    /**
     * 
     *                 Could not find the ID of the app being claimed in any app stores.
     *               
     * 
     */
    INVALID_APP_ID,

    /**
     * 
     *                 Exchange partner settings were invalid.
     *               
     * 
     */
    INVALID_EXCHANGE_PARTNER_SETTINGS,

    /**
     * 
     *                 API encountered an unexpected internal error.
     *               
     * 
     */
    INTERNAL,

    /**
     * 
     *                 At least one of app name or app store id must be set.
     *               
     * 
     */
    NAME_OR_STORE_ID_MUST_BE_SET,

    /**
     * 
     *                 The number of active applications exceeds the max number allowed in the network.
     *               
     * 
     */
    PUBLISHER_HAS_TOO_MANY_ACTIVE_APPS,

    /**
     * 
     *                 Application store id fetched from the internal application catalog is too long.
     *               
     * 
     */
    LINKED_APPLICATION_STORE_ID_TOO_LONG,

    /**
     * 
     *                 Manually entered app name cannot be longer than 80 characters.
     *               
     * 
     */
    MANUAL_APP_NAME_TOO_LONG,

    /**
     * 
     *                 Manually entered app name cannot be empty.
     *               
     * 
     */
    MANUAL_APP_NAME_EMPTY,

    /**
     * 
     *                 Invalid combined product key from app store and store id combinations.
     *               
     * 
     */
    INVALID_COMBINED_PRODUCT_KEY,

    /**
     * 
     *                 Only Android apps are eligible to skip for store id verification.
     *               
     * 
     */
    LINKED_APP_SKIPPING_ID_VERIFICATION_MUST_BE_ANDROID_APP,

    /**
     * 
     *                 Linked app cannot be found.
     *               
     * 
     */
    MISSING_APP_STORE_ENTRY,

    /**
     * 
     *                 Missing store entry.
     *               
     * 
     */
    CANNOT_SET_STORE_ID_MISSING_STORE_ENTRY,

    /**
     * 
     *                 Store entry has an unspecified app store.
     *               
     * 
     */
    CANNOT_SET_STORE_ID_INVALID_APP_STORE,

    /**
     * 
     *                 Store entry has an empty store id.
     *               
     * 
     */
    CANNOT_SET_STORE_ID_INVALID_STORE_ID,

    /**
     * 
     *                 Store entry is not unique among publisher's active apps.
     *               
     * 
     */
    CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID,

    /**
     * 
     *                 App store id is not unique among publisher's active apps of the same platform.
     *               
     * 
     */
    CANNOT_SET_STORE_ID_NON_UNIQUE_STORE_ID_WITHIN_PLATFORM,

    /**
     * 
     *                 The Android package name format is invalid.
     *               
     * 
     */
    CANNOT_SET_STORE_ID_INVALID_ANDROID_PACKAGE_NAME,

    /**
     * 
     *                 App store list should contain app stores from same platform.
     *               
     * 
     */
    INCOMPATIBLE_APP_STORE_LIST,

    /**
     * 
     *                 App store list should not contain UNKNOWN app store.
     *               
     * 
     */
    APP_STORE_LIST_CANNOT_HAVE_UNKNOWN_APP_STORE,

    /**
     * 
     *                 App store list should contain existing first party stores.
     *               
     * 
     */
    APP_STORE_LIST_CANNOT_REMOVE_FIRST_PARTY_APP_STORE,

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

    public static MobileApplicationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
