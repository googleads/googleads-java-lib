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
 * ForecastErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ForecastErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ForecastErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SERVER_NOT_AVAILABLE = "SERVER_NOT_AVAILABLE";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _NO_FORECAST_YET = "NO_FORECAST_YET";
    public static final java.lang.String _NOT_ENOUGH_INVENTORY = "NOT_ENOUGH_INVENTORY";
    public static final java.lang.String _SUCCESS = "SUCCESS";
    public static final java.lang.String _ZERO_LENGTH_RESERVATION = "ZERO_LENGTH_RESERVATION";
    public static final java.lang.String _EXCEEDED_QUOTA = "EXCEEDED_QUOTA";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ForecastErrorReason SERVER_NOT_AVAILABLE = new ForecastErrorReason(_SERVER_NOT_AVAILABLE);
    public static final ForecastErrorReason INTERNAL_ERROR = new ForecastErrorReason(_INTERNAL_ERROR);
    public static final ForecastErrorReason NO_FORECAST_YET = new ForecastErrorReason(_NO_FORECAST_YET);
    public static final ForecastErrorReason NOT_ENOUGH_INVENTORY = new ForecastErrorReason(_NOT_ENOUGH_INVENTORY);
    public static final ForecastErrorReason SUCCESS = new ForecastErrorReason(_SUCCESS);
    public static final ForecastErrorReason ZERO_LENGTH_RESERVATION = new ForecastErrorReason(_ZERO_LENGTH_RESERVATION);
    public static final ForecastErrorReason EXCEEDED_QUOTA = new ForecastErrorReason(_EXCEEDED_QUOTA);
    public static final ForecastErrorReason UNKNOWN = new ForecastErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ForecastErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ForecastErrorReason enumeration = (ForecastErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ForecastErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ForecastErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ForecastError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
