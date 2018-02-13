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

/**
 * GrpSettingsErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class GrpSettingsErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GrpSettingsErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_AGE_RANGE = "INVALID_AGE_RANGE";
    public static final java.lang.String _LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED = "LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _LINE_ITEM_TYPE_NOT_SUPPORTED = "LINE_ITEM_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE = "CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE";
    public static final java.lang.String _INVALID_MIN_AGE = "INVALID_MIN_AGE";
    public static final java.lang.String _INVALID_MAX_AGE = "INVALID_MAX_AGE";
    public static final java.lang.String _CANNOT_DISABLE_GRP_AFTER_ENABLING = "CANNOT_DISABLE_GRP_AFTER_ENABLING";
    public static final java.lang.String _CANNOT_CHANGE_GRP_PROVIDERS = "CANNOT_CHANGE_GRP_PROVIDERS";
    public static final java.lang.String _CANNOT_CHANGE_GRP_SETTINGS = "CANNOT_CHANGE_GRP_SETTINGS";
    public static final java.lang.String _GRP_AUDIENCE_GOAL_NOT_SUPPORTED = "GRP_AUDIENCE_GOAL_NOT_SUPPORTED";
    public static final java.lang.String _CANNOT_SET_GRP_AUDIENCE_GOAL = "CANNOT_SET_GRP_AUDIENCE_GOAL";
    public static final java.lang.String _CANNOT_REMOVE_GRP_AUDIENCE_GOAL = "CANNOT_REMOVE_GRP_AUDIENCE_GOAL";
    public static final java.lang.String _UNSUPPORTED_GEO_TARGETING = "UNSUPPORTED_GEO_TARGETING";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final GrpSettingsErrorReason INVALID_AGE_RANGE = new GrpSettingsErrorReason(_INVALID_AGE_RANGE);
    public static final GrpSettingsErrorReason LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED = new GrpSettingsErrorReason(_LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED);
    public static final GrpSettingsErrorReason LINE_ITEM_TYPE_NOT_SUPPORTED = new GrpSettingsErrorReason(_LINE_ITEM_TYPE_NOT_SUPPORTED);
    public static final GrpSettingsErrorReason CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE = new GrpSettingsErrorReason(_CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE);
    public static final GrpSettingsErrorReason INVALID_MIN_AGE = new GrpSettingsErrorReason(_INVALID_MIN_AGE);
    public static final GrpSettingsErrorReason INVALID_MAX_AGE = new GrpSettingsErrorReason(_INVALID_MAX_AGE);
    public static final GrpSettingsErrorReason CANNOT_DISABLE_GRP_AFTER_ENABLING = new GrpSettingsErrorReason(_CANNOT_DISABLE_GRP_AFTER_ENABLING);
    public static final GrpSettingsErrorReason CANNOT_CHANGE_GRP_PROVIDERS = new GrpSettingsErrorReason(_CANNOT_CHANGE_GRP_PROVIDERS);
    public static final GrpSettingsErrorReason CANNOT_CHANGE_GRP_SETTINGS = new GrpSettingsErrorReason(_CANNOT_CHANGE_GRP_SETTINGS);
    public static final GrpSettingsErrorReason GRP_AUDIENCE_GOAL_NOT_SUPPORTED = new GrpSettingsErrorReason(_GRP_AUDIENCE_GOAL_NOT_SUPPORTED);
    public static final GrpSettingsErrorReason CANNOT_SET_GRP_AUDIENCE_GOAL = new GrpSettingsErrorReason(_CANNOT_SET_GRP_AUDIENCE_GOAL);
    public static final GrpSettingsErrorReason CANNOT_REMOVE_GRP_AUDIENCE_GOAL = new GrpSettingsErrorReason(_CANNOT_REMOVE_GRP_AUDIENCE_GOAL);
    public static final GrpSettingsErrorReason UNSUPPORTED_GEO_TARGETING = new GrpSettingsErrorReason(_UNSUPPORTED_GEO_TARGETING);
    public static final GrpSettingsErrorReason UNKNOWN = new GrpSettingsErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static GrpSettingsErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GrpSettingsErrorReason enumeration = (GrpSettingsErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GrpSettingsErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GrpSettingsErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GrpSettingsError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
