// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreativeWrapperError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreativeWrapperError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LABEL_ALREADY_ASSOCIATED_WITH_CREATIVE_WRAPPER"/&gt;
 *     &lt;enumeration value="INVALID_LABEL_TYPE"/&gt;
 *     &lt;enumeration value="UNRECOGNIZED_MACRO"/&gt;
 *     &lt;enumeration value="NEITHER_HEADER_NOR_FOOTER_SPECIFIED"/&gt;
 *     &lt;enumeration value="NEITHER_HEADER_NOR_FOOTER_NOR_VIDEO_TRACKING_URLS_SPECIFIED"/&gt;
 *     &lt;enumeration value="CANNOT_USE_CREATIVE_WRAPPER_TYPE"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE_LABEL_ID"/&gt;
 *     &lt;enumeration value="CANNOT_APPLY_TO_AD_UNIT_WITH_VIDEO_SIZES"/&gt;
 *     &lt;enumeration value="CANNOT_APPLY_TO_AD_UNIT_WITHOUT_VIDEO_SIZES"/&gt;
 *     &lt;enumeration value="CANNOT_APPLY_TO_MOBILE_AD_UNIT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreativeWrapperError.Reason")
@XmlEnum
public enum CreativeWrapperErrorReason {


    /**
     * 
     *                 The label is already associated with a {@link CreativeWrapper}.
     *               
     * 
     */
    LABEL_ALREADY_ASSOCIATED_WITH_CREATIVE_WRAPPER,

    /**
     * 
     *                 The label type of a creative wrapper must be {@link LabelType#CREATIVE_WRAPPER}.
     *               
     * 
     */
    INVALID_LABEL_TYPE,

    /**
     * 
     *                 A macro used inside the snippet is not recognized.
     *               
     * 
     */
    UNRECOGNIZED_MACRO,

    /**
     * 
     *                 When creating a new creative wrapper, either header or footer should exist.
     *               
     * 
     */
    NEITHER_HEADER_NOR_FOOTER_SPECIFIED,

    /**
     * 
     *                 Creative wrapper must have either header and/or footer, or video tracking URLs.
     *               
     * 
     */
    NEITHER_HEADER_NOR_FOOTER_NOR_VIDEO_TRACKING_URLS_SPECIFIED,

    /**
     * 
     *                 The network has not been enabled for creating labels of type
     *                 {@link LabelType#CREATIVE_WRAPPER}.
     *               
     * 
     */
    CANNOT_USE_CREATIVE_WRAPPER_TYPE,

    /**
     * 
     *                 Cannot update {@link CreativeWrapper#labelId}.
     *               
     * 
     */
    CANNOT_UPDATE_LABEL_ID,

    /**
     * 
     *                 Cannot apply {@link LabelType#CREATIVE_WRAPPER} labels to an ad unit
     *                 if it has no descendants with {@link AdUnit#adUnitSizes} of
     *                 {@code AdUnitSize#environmentType}  as
     *                 {@link EnvironmentType#BROWSER}.
     *               
     * 
     */
    CANNOT_APPLY_TO_AD_UNIT_WITH_VIDEO_SIZES,

    /**
     * 
     *                 Cannot apply {@link LabelType#CREATIVE_WRAPPER} labels with a {@link
     *                 CreativeWrapper#VIDEO_TRACKING_URL} type to an ad unit if it has no descendants with {@link
     *                 AdUnit#adUnitSizes} of {@code AdUnitSize#environmentType} as {@link
     *                 EnvironmentType#VIDEO_PLAYER}.
     *               
     * 
     */
    CANNOT_APPLY_TO_AD_UNIT_WITHOUT_VIDEO_SIZES,

    /**
     * 
     *                 Cannot apply {@link LabelType#CREATIVE_WRAPPER} labels to an ad unit
     *                 if {@link AdUnit#targetPlatform} is of type {@code TargetPlatform#MOBILE}
     *               
     * 
     */
    CANNOT_APPLY_TO_MOBILE_AD_UNIT,

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

    public static CreativeWrapperErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
