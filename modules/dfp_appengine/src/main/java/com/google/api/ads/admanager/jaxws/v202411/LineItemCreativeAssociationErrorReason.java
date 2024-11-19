// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemCreativeAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemCreativeAssociationError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY"/&gt;
 *     &lt;enumeration value="INVALID_LINEITEM_CREATIVE_PAIRING"/&gt;
 *     &lt;enumeration value="STARTDATE_BEFORE_LINEITEM_STARTDATE"/&gt;
 *     &lt;enumeration value="STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE"/&gt;
 *     &lt;enumeration value="ENDDATE_AFTER_LINEITEM_ENDDATE"/&gt;
 *     &lt;enumeration value="ENDDATE_NOT_AFTER_LINEITEM_STARTDATE"/&gt;
 *     &lt;enumeration value="ENDDATE_NOT_AFTER_STARTDATE"/&gt;
 *     &lt;enumeration value="ENDDATE_IN_THE_PAST"/&gt;
 *     &lt;enumeration value="CANNOT_COPY_WITHIN_SAME_LINE_ITEM"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_CREATIVE_VAST_REDIRECT_TYPE"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_YOUTUBE_HOSTED_CREATIVE"/&gt;
 *     &lt;enumeration value="PROGRAMMATIC_CREATIVES_CAN_ONLY_BE_ASSIGNED_TO_ONE_LINE_ITEM"/&gt;
 *     &lt;enumeration value="CANNOT_ACTIVATE_ASSOCIATION_WITH_INACTIVE_CREATIVE"/&gt;
 *     &lt;enumeration value="CANNOT_CREATE_PROGRAMMATIC_CREATIVES"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE_PROGRAMMATIC_CREATIVES"/&gt;
 *     &lt;enumeration value="CREATIVE_AND_LINE_ITEM_MUST_BOTH_BE_SET_TOP_BOX_ENABLED"/&gt;
 *     &lt;enumeration value="CANNOT_DELETE_SET_TOP_BOX_ENABLED_ASSOCIATIONS"/&gt;
 *     &lt;enumeration value="SET_TOP_BOX_CREATIVE_ROTATION_WEIGHT_MUST_BE_INTEGER"/&gt;
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION_TYPE_FOR_MANUAL_WEIGHT"/&gt;
 *     &lt;enumeration value="CLICK_MACROS_REQUIRED"/&gt;
 *     &lt;enumeration value="VIEW_MACROS_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineItemCreativeAssociationError.Reason")
@XmlEnum
public enum LineItemCreativeAssociationErrorReason {


    /**
     * 
     *                 Cannot associate a creative to the wrong advertiser
     *               
     * 
     */
    CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY,

    /**
     * 
     *                 The creative type being associated is a invalid for the line item type.
     *               
     * 
     */
    INVALID_LINEITEM_CREATIVE_PAIRING,

    /**
     * 
     *                 Association start date cannot be before line item start date
     *               
     * 
     */
    STARTDATE_BEFORE_LINEITEM_STARTDATE,

    /**
     * 
     *                 Association start date cannot be same as or after line item end date
     *               
     * 
     */
    STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE,

    /**
     * 
     *                 Association end date cannot be after line item end date
     *               
     * 
     */
    ENDDATE_AFTER_LINEITEM_ENDDATE,

    /**
     * 
     *                 Association end date cannot be same as or before line item start date
     *               
     * 
     */
    ENDDATE_NOT_AFTER_LINEITEM_STARTDATE,

    /**
     * 
     *                 Association end date cannot be same as or before its start date
     *               
     * 
     */
    ENDDATE_NOT_AFTER_STARTDATE,

    /**
     * 
     *                 Association end date cannot be in the past.
     *               
     * 
     */
    ENDDATE_IN_THE_PAST,

    /**
     * 
     *                 Cannot copy an association to the same line item without
     *                 creating new creative
     *               
     * 
     */
    CANNOT_COPY_WITHIN_SAME_LINE_ITEM,

    /**
     * 
     *                 Programmatic only supports the "Video" redirect type.
     *               
     * 
     */
    UNSUPPORTED_CREATIVE_VAST_REDIRECT_TYPE,

    /**
     * 
     *                 Programmatic does not support YouTube hosted creatives.
     *               
     * 
     */
    UNSUPPORTED_YOUTUBE_HOSTED_CREATIVE,

    /**
     * 
     *                 Programmatic creatives can only be assigned to one line item.
     *               
     * 
     */
    PROGRAMMATIC_CREATIVES_CAN_ONLY_BE_ASSIGNED_TO_ONE_LINE_ITEM,

    /**
     * 
     *                 Cannot activate a line item creative association if the associated creative is inactive.
     *               
     * 
     */
    CANNOT_ACTIVATE_ASSOCIATION_WITH_INACTIVE_CREATIVE,

    /**
     * 
     *                 Cannot create programmatic creatives.
     *               
     * 
     */
    CANNOT_CREATE_PROGRAMMATIC_CREATIVES,

    /**
     * 
     *                 Cannot update programmatic creatives.
     *               
     * 
     */
    CANNOT_UPDATE_PROGRAMMATIC_CREATIVES,

    /**
     * 
     *                 Cannot associate a creative with a line item if only one of them is set-top box enabled.
     *               
     * 
     */
    CREATIVE_AND_LINE_ITEM_MUST_BOTH_BE_SET_TOP_BOX_ENABLED,

    /**
     * 
     *                 Cannot delete associations between set-top box enabled line items and set-top box enabled
     *                 creatives.
     *               
     * 
     */
    CANNOT_DELETE_SET_TOP_BOX_ENABLED_ASSOCIATIONS,

    /**
     * 
     *                 Creative rotation weights must be integers.
     *               
     * 
     */
    SET_TOP_BOX_CREATIVE_ROTATION_WEIGHT_MUST_BE_INTEGER,

    /**
     * 
     *                 Creative rotation weights are only valid when creative rotation type is set to
     *                 {@link CreativeRotationType#MANUAL}.
     *               
     * 
     */
    INVALID_CREATIVE_ROTATION_TYPE_FOR_MANUAL_WEIGHT,

    /**
     * 
     *                 The code snippet of a creative must contain a click macro
     *                 (%%CLICK_URL_ESC%% or %%CLICK_URL_UNESC%%).
     *               
     * 
     */
    CLICK_MACROS_REQUIRED,

    /**
     * 
     *                 The code snippet of a creative must not contain a view macro
     *                 (%%VIEW_URL_ESC%% or %%VIEW_URL_UNESC%%).
     *               
     * 
     */
    VIEW_MACROS_NOT_ALLOWED,

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

    public static LineItemCreativeAssociationErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
