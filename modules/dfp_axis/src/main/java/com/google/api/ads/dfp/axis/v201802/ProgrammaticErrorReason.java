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
 * ProgrammaticErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ProgrammaticErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProgrammaticErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUDIENCE_EXTENSION_NOT_SUPPORTED = "AUDIENCE_EXTENSION_NOT_SUPPORTED";
    public static final java.lang.String _AUTO_EXTENSION_DAYS_NOT_SUPPORTED = "AUTO_EXTENSION_DAYS_NOT_SUPPORTED";
    public static final java.lang.String _VIDEO_NOT_SUPPORTED = "VIDEO_NOT_SUPPORTED";
    public static final java.lang.String _ROADBLOCKING_NOT_SUPPORTED = "ROADBLOCKING_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_CREATIVE_ROTATION = "INVALID_CREATIVE_ROTATION";
    public static final java.lang.String _INVALID_LINE_ITEM_TYPE = "INVALID_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_COST_TYPE = "INVALID_COST_TYPE";
    public static final java.lang.String _SIZE_NOT_SUPPORTED = "SIZE_NOT_SUPPORTED";
    public static final java.lang.String _ZERO_COST_PER_UNIT_NOT_SUPPORTED = "ZERO_COST_PER_UNIT_NOT_SUPPORTED";
    public static final java.lang.String _CANNOT_UPDATE_FIELD_FOR_APPROVED_LINE_ITEMS = "CANNOT_UPDATE_FIELD_FOR_APPROVED_LINE_ITEMS";
    public static final java.lang.String _CANNOT_CREATE_LINE_ITEM_FOR_APPROVED_ORDER = "CANNOT_CREATE_LINE_ITEM_FOR_APPROVED_ORDER";
    public static final java.lang.String _CANNOT_UPDATE_BACKFILL_WEB_PROPERTY_FOR_APPROVED_LINE_ITEMS = "CANNOT_UPDATE_BACKFILL_WEB_PROPERTY_FOR_APPROVED_LINE_ITEMS";
    public static final java.lang.String _COST_PER_UNIT_TOO_LOW = "COST_PER_UNIT_TOO_LOW";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProgrammaticErrorReason AUDIENCE_EXTENSION_NOT_SUPPORTED = new ProgrammaticErrorReason(_AUDIENCE_EXTENSION_NOT_SUPPORTED);
    public static final ProgrammaticErrorReason AUTO_EXTENSION_DAYS_NOT_SUPPORTED = new ProgrammaticErrorReason(_AUTO_EXTENSION_DAYS_NOT_SUPPORTED);
    public static final ProgrammaticErrorReason VIDEO_NOT_SUPPORTED = new ProgrammaticErrorReason(_VIDEO_NOT_SUPPORTED);
    public static final ProgrammaticErrorReason ROADBLOCKING_NOT_SUPPORTED = new ProgrammaticErrorReason(_ROADBLOCKING_NOT_SUPPORTED);
    public static final ProgrammaticErrorReason INVALID_CREATIVE_ROTATION = new ProgrammaticErrorReason(_INVALID_CREATIVE_ROTATION);
    public static final ProgrammaticErrorReason INVALID_LINE_ITEM_TYPE = new ProgrammaticErrorReason(_INVALID_LINE_ITEM_TYPE);
    public static final ProgrammaticErrorReason INVALID_COST_TYPE = new ProgrammaticErrorReason(_INVALID_COST_TYPE);
    public static final ProgrammaticErrorReason SIZE_NOT_SUPPORTED = new ProgrammaticErrorReason(_SIZE_NOT_SUPPORTED);
    public static final ProgrammaticErrorReason ZERO_COST_PER_UNIT_NOT_SUPPORTED = new ProgrammaticErrorReason(_ZERO_COST_PER_UNIT_NOT_SUPPORTED);
    public static final ProgrammaticErrorReason CANNOT_UPDATE_FIELD_FOR_APPROVED_LINE_ITEMS = new ProgrammaticErrorReason(_CANNOT_UPDATE_FIELD_FOR_APPROVED_LINE_ITEMS);
    public static final ProgrammaticErrorReason CANNOT_CREATE_LINE_ITEM_FOR_APPROVED_ORDER = new ProgrammaticErrorReason(_CANNOT_CREATE_LINE_ITEM_FOR_APPROVED_ORDER);
    public static final ProgrammaticErrorReason CANNOT_UPDATE_BACKFILL_WEB_PROPERTY_FOR_APPROVED_LINE_ITEMS = new ProgrammaticErrorReason(_CANNOT_UPDATE_BACKFILL_WEB_PROPERTY_FOR_APPROVED_LINE_ITEMS);
    public static final ProgrammaticErrorReason COST_PER_UNIT_TOO_LOW = new ProgrammaticErrorReason(_COST_PER_UNIT_TOO_LOW);
    public static final ProgrammaticErrorReason UNKNOWN = new ProgrammaticErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProgrammaticErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProgrammaticErrorReason enumeration = (ProgrammaticErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProgrammaticErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProgrammaticErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProgrammaticError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
