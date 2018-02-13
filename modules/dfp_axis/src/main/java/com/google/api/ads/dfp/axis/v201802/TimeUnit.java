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
 * TimeUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class TimeUnit implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TimeUnit(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MINUTE = "MINUTE";
    public static final java.lang.String _HOUR = "HOUR";
    public static final java.lang.String _DAY = "DAY";
    public static final java.lang.String _WEEK = "WEEK";
    public static final java.lang.String _MONTH = "MONTH";
    public static final java.lang.String _LIFETIME = "LIFETIME";
    public static final java.lang.String _POD = "POD";
    public static final java.lang.String _STREAM = "STREAM";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TimeUnit MINUTE = new TimeUnit(_MINUTE);
    public static final TimeUnit HOUR = new TimeUnit(_HOUR);
    public static final TimeUnit DAY = new TimeUnit(_DAY);
    public static final TimeUnit WEEK = new TimeUnit(_WEEK);
    public static final TimeUnit MONTH = new TimeUnit(_MONTH);
    public static final TimeUnit LIFETIME = new TimeUnit(_LIFETIME);
    public static final TimeUnit POD = new TimeUnit(_POD);
    public static final TimeUnit STREAM = new TimeUnit(_STREAM);
    public static final TimeUnit UNKNOWN = new TimeUnit(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TimeUnit fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TimeUnit enumeration = (TimeUnit)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TimeUnit fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TimeUnit.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TimeUnit"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
