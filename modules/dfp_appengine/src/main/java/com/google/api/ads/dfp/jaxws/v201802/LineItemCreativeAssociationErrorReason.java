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
 * <p>Java class for LineItemCreativeAssociationError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemCreativeAssociationError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATIVE_IN_WRONG_ADVERTISERS_LIBRARY"/>
 *     &lt;enumeration value="INVALID_LINEITEM_CREATIVE_PAIRING"/>
 *     &lt;enumeration value="STARTDATE_BEFORE_LINEITEM_STARTDATE"/>
 *     &lt;enumeration value="STARTDATE_NOT_BEFORE_LINEITEM_ENDDATE"/>
 *     &lt;enumeration value="ENDDATE_AFTER_LINEITEM_ENDDATE"/>
 *     &lt;enumeration value="ENDDATE_NOT_AFTER_LINEITEM_STARTDATE"/>
 *     &lt;enumeration value="ENDDATE_NOT_AFTER_STARTDATE"/>
 *     &lt;enumeration value="ENDDATE_IN_THE_PAST"/>
 *     &lt;enumeration value="CANNOT_COPY_WITHIN_SAME_LINE_ITEM"/>
 *     &lt;enumeration value="PROGRAMMATIC_CREATIVES_CAN_ONLY_BE_ASSIGNED_TO_ONE_LINE_ITEM"/>
 *     &lt;enumeration value="CANNOT_CREATE_PROGRAMMATIC_CREATIVES"/>
 *     &lt;enumeration value="CANNOT_UPDATE_PROGRAMMATIC_CREATIVES"/>
 *     &lt;enumeration value="CREATIVE_AND_LINE_ITEM_MUST_BOTH_BE_SET_TOP_BOX_ENABLED"/>
 *     &lt;enumeration value="CANNOT_DELETE_SET_TOP_BOX_ENABLED_ASSOCIATIONS"/>
 *     &lt;enumeration value="SET_TOP_BOX_CREATIVE_ROTATION_WEIGHT_MUST_BE_INTEGER"/>
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION_TYPE_FOR_MANUAL_WEIGHT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
     *                 Programmatic creatives can only be assigned to one line item.
     *               
     * 
     */
    PROGRAMMATIC_CREATIVES_CAN_ONLY_BE_ASSIGNED_TO_ONE_LINE_ITEM,

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
