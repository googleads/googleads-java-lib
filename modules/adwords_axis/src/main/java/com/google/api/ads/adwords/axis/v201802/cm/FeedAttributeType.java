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
 * FeedAttributeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class FeedAttributeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedAttributeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INT64 = "INT64";
    public static final java.lang.String _FLOAT = "FLOAT";
    public static final java.lang.String _STRING = "STRING";
    public static final java.lang.String _BOOLEAN = "BOOLEAN";
    public static final java.lang.String _URL = "URL";
    public static final java.lang.String _DATE_TIME = "DATE_TIME";
    public static final java.lang.String _INT64_LIST = "INT64_LIST";
    public static final java.lang.String _FLOAT_LIST = "FLOAT_LIST";
    public static final java.lang.String _STRING_LIST = "STRING_LIST";
    public static final java.lang.String _BOOLEAN_LIST = "BOOLEAN_LIST";
    public static final java.lang.String _URL_LIST = "URL_LIST";
    public static final java.lang.String _DATE_TIME_LIST = "DATE_TIME_LIST";
    public static final java.lang.String _PRICE = "PRICE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FeedAttributeType INT64 = new FeedAttributeType(_INT64);
    public static final FeedAttributeType FLOAT = new FeedAttributeType(_FLOAT);
    public static final FeedAttributeType STRING = new FeedAttributeType(_STRING);
    public static final FeedAttributeType BOOLEAN = new FeedAttributeType(_BOOLEAN);
    public static final FeedAttributeType URL = new FeedAttributeType(_URL);
    public static final FeedAttributeType DATE_TIME = new FeedAttributeType(_DATE_TIME);
    public static final FeedAttributeType INT64_LIST = new FeedAttributeType(_INT64_LIST);
    public static final FeedAttributeType FLOAT_LIST = new FeedAttributeType(_FLOAT_LIST);
    public static final FeedAttributeType STRING_LIST = new FeedAttributeType(_STRING_LIST);
    public static final FeedAttributeType BOOLEAN_LIST = new FeedAttributeType(_BOOLEAN_LIST);
    public static final FeedAttributeType URL_LIST = new FeedAttributeType(_URL_LIST);
    public static final FeedAttributeType DATE_TIME_LIST = new FeedAttributeType(_DATE_TIME_LIST);
    public static final FeedAttributeType PRICE = new FeedAttributeType(_PRICE);
    public static final FeedAttributeType UNKNOWN = new FeedAttributeType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FeedAttributeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedAttributeType enumeration = (FeedAttributeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedAttributeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedAttributeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedAttribute.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
