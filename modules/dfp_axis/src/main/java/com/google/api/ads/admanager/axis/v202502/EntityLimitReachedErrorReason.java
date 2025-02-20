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
 * EntityLimitReachedErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public class EntityLimitReachedErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntityLimitReachedErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CUSTOM_TARGETING_VALUES_LIMIT_REACHED = "CUSTOM_TARGETING_VALUES_LIMIT_REACHED";
    public static final java.lang.String _AD_EXCLUSION_RULES_LIMIT_REACHED = "AD_EXCLUSION_RULES_LIMIT_REACHED";
    public static final java.lang.String _FIRST_PARTY_AUDIENCE_SEGMENTS_LIMIT_REACHED = "FIRST_PARTY_AUDIENCE_SEGMENTS_LIMIT_REACHED";
    public static final java.lang.String _PLACEMENTS_LIMIT_REACHED = "PLACEMENTS_LIMIT_REACHED";
    public static final java.lang.String _LINE_ITEMS_LIMIT_REACHED = "LINE_ITEMS_LIMIT_REACHED";
    public static final java.lang.String _ACTIVE_LINE_ITEMS_LIMIT_REACHED = "ACTIVE_LINE_ITEMS_LIMIT_REACHED";
    public static final java.lang.String _DAI_ENCODING_PROFILES_LIMIT_REACHED = "DAI_ENCODING_PROFILES_LIMIT_REACHED";
    public static final java.lang.String _TRAFFIC_FORECAST_SEGMENTS_LIMIT_REACHED = "TRAFFIC_FORECAST_SEGMENTS_LIMIT_REACHED";
    public static final java.lang.String _FORECAST_ADJUSTMENTS_LIMIT_REACHED = "FORECAST_ADJUSTMENTS_LIMIT_REACHED";
    public static final java.lang.String _ACTIVE_EXPERIMENTS_LIMIT_REACHED = "ACTIVE_EXPERIMENTS_LIMIT_REACHED";
    public static final java.lang.String _SITES_LIMIT_REACHED = "SITES_LIMIT_REACHED";
    public static final java.lang.String _USER_TEAMS_LIMIT_REACHED = "USER_TEAMS_LIMIT_REACHED";
    public static final java.lang.String _ACTIVE_TARGETING_PRESETS_LIMIT_REACHED = "ACTIVE_TARGETING_PRESETS_LIMIT_REACHED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final EntityLimitReachedErrorReason CUSTOM_TARGETING_VALUES_LIMIT_REACHED = new EntityLimitReachedErrorReason(_CUSTOM_TARGETING_VALUES_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason AD_EXCLUSION_RULES_LIMIT_REACHED = new EntityLimitReachedErrorReason(_AD_EXCLUSION_RULES_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason FIRST_PARTY_AUDIENCE_SEGMENTS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_FIRST_PARTY_AUDIENCE_SEGMENTS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason PLACEMENTS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_PLACEMENTS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason LINE_ITEMS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_LINE_ITEMS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason ACTIVE_LINE_ITEMS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_ACTIVE_LINE_ITEMS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason DAI_ENCODING_PROFILES_LIMIT_REACHED = new EntityLimitReachedErrorReason(_DAI_ENCODING_PROFILES_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason TRAFFIC_FORECAST_SEGMENTS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_TRAFFIC_FORECAST_SEGMENTS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason FORECAST_ADJUSTMENTS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_FORECAST_ADJUSTMENTS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason ACTIVE_EXPERIMENTS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_ACTIVE_EXPERIMENTS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason SITES_LIMIT_REACHED = new EntityLimitReachedErrorReason(_SITES_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason USER_TEAMS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_USER_TEAMS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason ACTIVE_TARGETING_PRESETS_LIMIT_REACHED = new EntityLimitReachedErrorReason(_ACTIVE_TARGETING_PRESETS_LIMIT_REACHED);
    public static final EntityLimitReachedErrorReason UNKNOWN = new EntityLimitReachedErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static EntityLimitReachedErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EntityLimitReachedErrorReason enumeration = (EntityLimitReachedErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntityLimitReachedErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EntityLimitReachedErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "EntityLimitReachedError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
