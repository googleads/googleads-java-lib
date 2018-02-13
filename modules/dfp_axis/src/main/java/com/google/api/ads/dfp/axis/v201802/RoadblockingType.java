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
 * RoadblockingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class RoadblockingType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RoadblockingType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ONLY_ONE = "ONLY_ONE";
    public static final java.lang.String _ONE_OR_MORE = "ONE_OR_MORE";
    public static final java.lang.String _AS_MANY_AS_POSSIBLE = "AS_MANY_AS_POSSIBLE";
    public static final java.lang.String _ALL_ROADBLOCK = "ALL_ROADBLOCK";
    public static final java.lang.String _CREATIVE_SET = "CREATIVE_SET";
    public static final RoadblockingType ONLY_ONE = new RoadblockingType(_ONLY_ONE);
    public static final RoadblockingType ONE_OR_MORE = new RoadblockingType(_ONE_OR_MORE);
    public static final RoadblockingType AS_MANY_AS_POSSIBLE = new RoadblockingType(_AS_MANY_AS_POSSIBLE);
    public static final RoadblockingType ALL_ROADBLOCK = new RoadblockingType(_ALL_ROADBLOCK);
    public static final RoadblockingType CREATIVE_SET = new RoadblockingType(_CREATIVE_SET);
    public java.lang.String getValue() { return _value_;}
    public static RoadblockingType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RoadblockingType enumeration = (RoadblockingType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RoadblockingType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RoadblockingType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RoadblockingType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
