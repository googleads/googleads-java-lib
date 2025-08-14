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

/**
 * ProposalLineItemProgrammaticErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;

public class ProposalLineItemProgrammaticErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProposalLineItemProgrammaticErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_PRODUCT_TYPE = "INVALID_PRODUCT_TYPE";
    public static final java.lang.String _VIDEO_NOT_SUPPORTED = "VIDEO_NOT_SUPPORTED";
    public static final java.lang.String _ROADBLOCKING_NOT_SUPPORTED = "ROADBLOCKING_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_CREATIVE_ROTATION = "INVALID_CREATIVE_ROTATION";
    public static final java.lang.String _INVALID_PROPOSAL_LINE_ITEM_TYPE = "INVALID_PROPOSAL_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_RATE_TYPE = "INVALID_RATE_TYPE";
    public static final java.lang.String _ZERO_COST_PER_UNIT_NOT_SUPPORTED = "ZERO_COST_PER_UNIT_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_PROGRAMMATIC_CREATIVE_SOURCE = "INVALID_PROGRAMMATIC_CREATIVE_SOURCE";
    public static final java.lang.String _INVALID_MAX_VIDEO_CREATIVE_DURATION = "INVALID_MAX_VIDEO_CREATIVE_DURATION";
    public static final java.lang.String _CANNOT_UPDATE_PROGRAMMATIC_CREATIVE_SOURCE = "CANNOT_UPDATE_PROGRAMMATIC_CREATIVE_SOURCE";
    public static final java.lang.String _INVALID_NUM_UNITS = "INVALID_NUM_UNITS";
    public static final java.lang.String _MIX_GUARANTEED_AND_PREFERRED_DEAL_NOT_ALLOWED = "MIX_GUARANTEED_AND_PREFERRED_DEAL_NOT_ALLOWED";
    public static final java.lang.String _MIX_NATIVE_AND_BANNER_SIZE_NOT_ALLOWED = "MIX_NATIVE_AND_BANNER_SIZE_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_UPDATE_SIZES = "CANNOT_UPDATE_SIZES";
    public static final java.lang.String _INVALID_SPONSORSHIP_CONTRACTED_UNITS_BOUGHT = "INVALID_SPONSORSHIP_CONTRACTED_UNITS_BOUGHT";
    public static final java.lang.String _INVALID_PROGRAMMATIC_PRICING_MODEL = "INVALID_PROGRAMMATIC_PRICING_MODEL";
    public static final java.lang.String _BUYER_DISABLED_FOR_PG_VIOLATING_SLA = "BUYER_DISABLED_FOR_PG_VIOLATING_SLA";
    public static final java.lang.String _PG_NOT_SUPPORTED_FOR_AGENCY_BUYER = "PG_NOT_SUPPORTED_FOR_AGENCY_BUYER";
    public static final java.lang.String _BUYER_NOT_FOUND = "BUYER_NOT_FOUND";
    public static final java.lang.String _INVALID_ENVIRONMENT_PLATFORM_TYPE_PAIR = "INVALID_ENVIRONMENT_PLATFORM_TYPE_PAIR";
    public static final java.lang.String _CANNOT_MIX_AUDIO_VIDEO_PROGRAMMATIC_LINE_ITEM = "CANNOT_MIX_AUDIO_VIDEO_PROGRAMMATIC_LINE_ITEM";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProposalLineItemProgrammaticErrorReason INVALID_PRODUCT_TYPE = new ProposalLineItemProgrammaticErrorReason(_INVALID_PRODUCT_TYPE);
    public static final ProposalLineItemProgrammaticErrorReason VIDEO_NOT_SUPPORTED = new ProposalLineItemProgrammaticErrorReason(_VIDEO_NOT_SUPPORTED);
    public static final ProposalLineItemProgrammaticErrorReason ROADBLOCKING_NOT_SUPPORTED = new ProposalLineItemProgrammaticErrorReason(_ROADBLOCKING_NOT_SUPPORTED);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_CREATIVE_ROTATION = new ProposalLineItemProgrammaticErrorReason(_INVALID_CREATIVE_ROTATION);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_PROPOSAL_LINE_ITEM_TYPE = new ProposalLineItemProgrammaticErrorReason(_INVALID_PROPOSAL_LINE_ITEM_TYPE);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_RATE_TYPE = new ProposalLineItemProgrammaticErrorReason(_INVALID_RATE_TYPE);
    public static final ProposalLineItemProgrammaticErrorReason ZERO_COST_PER_UNIT_NOT_SUPPORTED = new ProposalLineItemProgrammaticErrorReason(_ZERO_COST_PER_UNIT_NOT_SUPPORTED);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_PROGRAMMATIC_CREATIVE_SOURCE = new ProposalLineItemProgrammaticErrorReason(_INVALID_PROGRAMMATIC_CREATIVE_SOURCE);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_MAX_VIDEO_CREATIVE_DURATION = new ProposalLineItemProgrammaticErrorReason(_INVALID_MAX_VIDEO_CREATIVE_DURATION);
    public static final ProposalLineItemProgrammaticErrorReason CANNOT_UPDATE_PROGRAMMATIC_CREATIVE_SOURCE = new ProposalLineItemProgrammaticErrorReason(_CANNOT_UPDATE_PROGRAMMATIC_CREATIVE_SOURCE);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_NUM_UNITS = new ProposalLineItemProgrammaticErrorReason(_INVALID_NUM_UNITS);
    public static final ProposalLineItemProgrammaticErrorReason MIX_GUARANTEED_AND_PREFERRED_DEAL_NOT_ALLOWED = new ProposalLineItemProgrammaticErrorReason(_MIX_GUARANTEED_AND_PREFERRED_DEAL_NOT_ALLOWED);
    public static final ProposalLineItemProgrammaticErrorReason MIX_NATIVE_AND_BANNER_SIZE_NOT_ALLOWED = new ProposalLineItemProgrammaticErrorReason(_MIX_NATIVE_AND_BANNER_SIZE_NOT_ALLOWED);
    public static final ProposalLineItemProgrammaticErrorReason CANNOT_UPDATE_SIZES = new ProposalLineItemProgrammaticErrorReason(_CANNOT_UPDATE_SIZES);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_SPONSORSHIP_CONTRACTED_UNITS_BOUGHT = new ProposalLineItemProgrammaticErrorReason(_INVALID_SPONSORSHIP_CONTRACTED_UNITS_BOUGHT);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_PROGRAMMATIC_PRICING_MODEL = new ProposalLineItemProgrammaticErrorReason(_INVALID_PROGRAMMATIC_PRICING_MODEL);
    public static final ProposalLineItemProgrammaticErrorReason BUYER_DISABLED_FOR_PG_VIOLATING_SLA = new ProposalLineItemProgrammaticErrorReason(_BUYER_DISABLED_FOR_PG_VIOLATING_SLA);
    public static final ProposalLineItemProgrammaticErrorReason PG_NOT_SUPPORTED_FOR_AGENCY_BUYER = new ProposalLineItemProgrammaticErrorReason(_PG_NOT_SUPPORTED_FOR_AGENCY_BUYER);
    public static final ProposalLineItemProgrammaticErrorReason BUYER_NOT_FOUND = new ProposalLineItemProgrammaticErrorReason(_BUYER_NOT_FOUND);
    public static final ProposalLineItemProgrammaticErrorReason INVALID_ENVIRONMENT_PLATFORM_TYPE_PAIR = new ProposalLineItemProgrammaticErrorReason(_INVALID_ENVIRONMENT_PLATFORM_TYPE_PAIR);
    public static final ProposalLineItemProgrammaticErrorReason CANNOT_MIX_AUDIO_VIDEO_PROGRAMMATIC_LINE_ITEM = new ProposalLineItemProgrammaticErrorReason(_CANNOT_MIX_AUDIO_VIDEO_PROGRAMMATIC_LINE_ITEM);
    public static final ProposalLineItemProgrammaticErrorReason UNKNOWN = new ProposalLineItemProgrammaticErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProposalLineItemProgrammaticErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProposalLineItemProgrammaticErrorReason enumeration = (ProposalLineItemProgrammaticErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProposalLineItemProgrammaticErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItemProgrammaticErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ProposalLineItemProgrammaticError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
