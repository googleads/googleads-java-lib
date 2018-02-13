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
 * TargetingDimension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class TargetingDimension implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TargetingDimension(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CUSTOM_CRITERIA = "CUSTOM_CRITERIA";
    public static final java.lang.String _GEOGRAPHY = "GEOGRAPHY";
    public static final java.lang.String _BROWSER = "BROWSER";
    public static final java.lang.String _BROWSER_LANGUAGE = "BROWSER_LANGUAGE";
    public static final java.lang.String _BANDWIDTH_GROUP = "BANDWIDTH_GROUP";
    public static final java.lang.String _OPERATING_SYSTEM = "OPERATING_SYSTEM";
    public static final java.lang.String _USER_DOMAIN = "USER_DOMAIN";
    public static final java.lang.String _CONTENT = "CONTENT";
    public static final java.lang.String _VIDEO_POSITION = "VIDEO_POSITION";
    public static final java.lang.String _AD_SIZE = "AD_SIZE";
    public static final java.lang.String _AD_UNIT = "AD_UNIT";
    public static final java.lang.String _PLACEMENT = "PLACEMENT";
    public static final java.lang.String _MOBILE_CARRIER = "MOBILE_CARRIER";
    public static final java.lang.String _DEVICE_CAPABILITY = "DEVICE_CAPABILITY";
    public static final java.lang.String _DEVICE_CATEGORY = "DEVICE_CATEGORY";
    public static final java.lang.String _DEVICE_MANUFACTURER = "DEVICE_MANUFACTURER";
    public static final java.lang.String _MOBILE_APPLICATION = "MOBILE_APPLICATION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TargetingDimension CUSTOM_CRITERIA = new TargetingDimension(_CUSTOM_CRITERIA);
    public static final TargetingDimension GEOGRAPHY = new TargetingDimension(_GEOGRAPHY);
    public static final TargetingDimension BROWSER = new TargetingDimension(_BROWSER);
    public static final TargetingDimension BROWSER_LANGUAGE = new TargetingDimension(_BROWSER_LANGUAGE);
    public static final TargetingDimension BANDWIDTH_GROUP = new TargetingDimension(_BANDWIDTH_GROUP);
    public static final TargetingDimension OPERATING_SYSTEM = new TargetingDimension(_OPERATING_SYSTEM);
    public static final TargetingDimension USER_DOMAIN = new TargetingDimension(_USER_DOMAIN);
    public static final TargetingDimension CONTENT = new TargetingDimension(_CONTENT);
    public static final TargetingDimension VIDEO_POSITION = new TargetingDimension(_VIDEO_POSITION);
    public static final TargetingDimension AD_SIZE = new TargetingDimension(_AD_SIZE);
    public static final TargetingDimension AD_UNIT = new TargetingDimension(_AD_UNIT);
    public static final TargetingDimension PLACEMENT = new TargetingDimension(_PLACEMENT);
    public static final TargetingDimension MOBILE_CARRIER = new TargetingDimension(_MOBILE_CARRIER);
    public static final TargetingDimension DEVICE_CAPABILITY = new TargetingDimension(_DEVICE_CAPABILITY);
    public static final TargetingDimension DEVICE_CATEGORY = new TargetingDimension(_DEVICE_CATEGORY);
    public static final TargetingDimension DEVICE_MANUFACTURER = new TargetingDimension(_DEVICE_MANUFACTURER);
    public static final TargetingDimension MOBILE_APPLICATION = new TargetingDimension(_MOBILE_APPLICATION);
    public static final TargetingDimension UNKNOWN = new TargetingDimension(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TargetingDimension fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TargetingDimension enumeration = (TargetingDimension)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TargetingDimension fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TargetingDimension.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TargetingDimension"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
