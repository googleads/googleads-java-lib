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
 * FeedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class FeedType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _SITELINK = "SITELINK";
    public static final java.lang.String _CALL = "CALL";
    public static final java.lang.String _APP = "APP";
    public static final java.lang.String _REVIEW = "REVIEW";
    public static final java.lang.String _AD_CUSTOMIZER = "AD_CUSTOMIZER";
    public static final java.lang.String _CALLOUT = "CALLOUT";
    public static final java.lang.String _STRUCTURED_SNIPPET = "STRUCTURED_SNIPPET";
    public static final java.lang.String _MESSAGE = "MESSAGE";
    public static final java.lang.String _PRICE = "PRICE";
    public static final java.lang.String _PROMOTION = "PROMOTION";
    public static final FeedType NONE = new FeedType(_NONE);
    public static final FeedType SITELINK = new FeedType(_SITELINK);
    public static final FeedType CALL = new FeedType(_CALL);
    public static final FeedType APP = new FeedType(_APP);
    public static final FeedType REVIEW = new FeedType(_REVIEW);
    public static final FeedType AD_CUSTOMIZER = new FeedType(_AD_CUSTOMIZER);
    public static final FeedType CALLOUT = new FeedType(_CALLOUT);
    public static final FeedType STRUCTURED_SNIPPET = new FeedType(_STRUCTURED_SNIPPET);
    public static final FeedType MESSAGE = new FeedType(_MESSAGE);
    public static final FeedType PRICE = new FeedType(_PRICE);
    public static final FeedType PROMOTION = new FeedType(_PROMOTION);
    public java.lang.String getValue() { return _value_;}
    public static FeedType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedType enumeration = (FeedType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Feed.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
