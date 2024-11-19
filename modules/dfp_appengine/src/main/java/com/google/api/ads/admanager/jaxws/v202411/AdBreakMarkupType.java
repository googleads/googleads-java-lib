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
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdBreakMarkupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdBreakMarkupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AD_BREAK_MARKUP_HLS_EXT_CUE"/&gt;
 *     &lt;enumeration value="AD_BREAK_MARKUP_HLS_PRIMETIME_SPLICE"/&gt;
 *     &lt;enumeration value="AD_BREAK_MARKUP_HLS_DATERANGE_SPLICE"/&gt;
 *     &lt;enumeration value="AD_BREAK_MARKUP_SCTE35_XML_SPLICE_INSERT"/&gt;
 *     &lt;enumeration value="AD_BREAK_MARKUP_SCTE35_BINARY_SPLICE_INSERT"/&gt;
 *     &lt;enumeration value="AD_BREAK_MARKUP_SCTE35_BINARY_PROVIDER_AD_START_END"/&gt;
 *     &lt;enumeration value="AD_BREAK_MARKUP_SCTE35_BINARY_PROVIDER_PLACEMENT_OP_START_END"/&gt;
 *     &lt;enumeration value="AD_BREAK_MARKUP_SCTE35_BINARY_BREAK_START_END"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdBreakMarkupType")
@XmlEnum
public enum AdBreakMarkupType {


    /**
     * 
     *                 The CUE-OUT/CUE-IN ad break marker type. This mark up type is only applicable for HLS live
     *                 streams.
     *               
     * 
     */
    AD_BREAK_MARKUP_HLS_EXT_CUE("AD_BREAK_MARKUP_HLS_EXT_CUE"),

    /**
     * 
     *                 The CUE (Adobe/Azure Prime Time) ad break marker type. This mark up type is only applicable for
     *                 HLS live streams.
     *               
     * 
     */
    AD_BREAK_MARKUP_HLS_PRIMETIME_SPLICE("AD_BREAK_MARKUP_HLS_PRIMETIME_SPLICE"),

    /**
     * 
     *                 The DATERANGE (Anvato) ad break marker type. This mark up type is only applicable for HLS live
     *                 streams.
     *               
     * 
     */
    AD_BREAK_MARKUP_HLS_DATERANGE_SPLICE("AD_BREAK_MARKUP_HLS_DATERANGE_SPLICE"),

    /**
     * 
     *                 The SCTE35 XML Splice In/Out ad break marker type. This markup type is only applicable for DASH
     *                 live streams.
     *               
     * 
     */
    @XmlEnumValue("AD_BREAK_MARKUP_SCTE35_XML_SPLICE_INSERT")
    AD_BREAK_MARKUP_SCTE_35_XML_SPLICE_INSERT("AD_BREAK_MARKUP_SCTE35_XML_SPLICE_INSERT"),

    /**
     * 
     *                 The SCTE35 Binary Splice Insert ad break marker type. This mark up type is only applicable for
     *                 HLS and DASH live streams.
     *               
     * 
     */
    @XmlEnumValue("AD_BREAK_MARKUP_SCTE35_BINARY_SPLICE_INSERT")
    AD_BREAK_MARKUP_SCTE_35_BINARY_SPLICE_INSERT("AD_BREAK_MARKUP_SCTE35_BINARY_SPLICE_INSERT"),

    /**
     * 
     *                 The SCTE35 Binary Time Signal: Provider Ad Start/End ad break marker type. This mark up type is
     *                 only applicable for HLS and DASH live streams.
     *               
     * 
     */
    @XmlEnumValue("AD_BREAK_MARKUP_SCTE35_BINARY_PROVIDER_AD_START_END")
    AD_BREAK_MARKUP_SCTE_35_BINARY_PROVIDER_AD_START_END("AD_BREAK_MARKUP_SCTE35_BINARY_PROVIDER_AD_START_END"),

    /**
     * 
     *                 The SCTE35 Binary Time Signal: Provider Placement Opportunity Start/End ad break marker type.
     *                 This mark up type is only applicable for HLS and DASH live streams.
     *               
     * 
     */
    @XmlEnumValue("AD_BREAK_MARKUP_SCTE35_BINARY_PROVIDER_PLACEMENT_OP_START_END")
    AD_BREAK_MARKUP_SCTE_35_BINARY_PROVIDER_PLACEMENT_OP_START_END("AD_BREAK_MARKUP_SCTE35_BINARY_PROVIDER_PLACEMENT_OP_START_END"),

    /**
     * 
     *                 The SCTE35 Binary Time Signal: Break Start/End ad break marker type. This mark up type is only
     *                 applicable for HLS and DASH live streams.
     *               
     * 
     */
    @XmlEnumValue("AD_BREAK_MARKUP_SCTE35_BINARY_BREAK_START_END")
    AD_BREAK_MARKUP_SCTE_35_BINARY_BREAK_START_END("AD_BREAK_MARKUP_SCTE35_BINARY_BREAK_START_END"),

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    AdBreakMarkupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdBreakMarkupType fromValue(String v) {
        for (AdBreakMarkupType c: AdBreakMarkupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
