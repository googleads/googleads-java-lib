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
 * GrpAge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class GrpAge implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GrpAge(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _AGE_UNKNOWN = "AGE_UNKNOWN";
    public static final java.lang.String _AGE_0_TO_17 = "AGE_0_TO_17";
    public static final java.lang.String _AGE_18_TO_24 = "AGE_18_TO_24";
    public static final java.lang.String _AGE_25_TO_34 = "AGE_25_TO_34";
    public static final java.lang.String _AGE_35_TO_44 = "AGE_35_TO_44";
    public static final java.lang.String _AGE_45_TO_54 = "AGE_45_TO_54";
    public static final java.lang.String _AGE_55_TO_64 = "AGE_55_TO_64";
    public static final java.lang.String _AGE_65_PLUS = "AGE_65_PLUS";
    public static final java.lang.String _AGE_18_TO_49 = "AGE_18_TO_49";
    public static final java.lang.String _AGE_21_TO_34 = "AGE_21_TO_34";
    public static final java.lang.String _AGE_21_TO_49 = "AGE_21_TO_49";
    public static final java.lang.String _AGE_21_PLUS = "AGE_21_PLUS";
    public static final java.lang.String _AGE_25_TO_49 = "AGE_25_TO_49";
    public static final java.lang.String _AGE_21_TO_44 = "AGE_21_TO_44";
    public static final java.lang.String _AGE_21_TO_54 = "AGE_21_TO_54";
    public static final java.lang.String _AGE_21_TO_64 = "AGE_21_TO_64";
    public static final java.lang.String _AGE_35_TO_49 = "AGE_35_TO_49";
    public static final GrpAge UNKNOWN = new GrpAge(_UNKNOWN);
    public static final GrpAge AGE_UNKNOWN = new GrpAge(_AGE_UNKNOWN);
    public static final GrpAge AGE_0_TO_17 = new GrpAge(_AGE_0_TO_17);
    public static final GrpAge AGE_18_TO_24 = new GrpAge(_AGE_18_TO_24);
    public static final GrpAge AGE_25_TO_34 = new GrpAge(_AGE_25_TO_34);
    public static final GrpAge AGE_35_TO_44 = new GrpAge(_AGE_35_TO_44);
    public static final GrpAge AGE_45_TO_54 = new GrpAge(_AGE_45_TO_54);
    public static final GrpAge AGE_55_TO_64 = new GrpAge(_AGE_55_TO_64);
    public static final GrpAge AGE_65_PLUS = new GrpAge(_AGE_65_PLUS);
    public static final GrpAge AGE_18_TO_49 = new GrpAge(_AGE_18_TO_49);
    public static final GrpAge AGE_21_TO_34 = new GrpAge(_AGE_21_TO_34);
    public static final GrpAge AGE_21_TO_49 = new GrpAge(_AGE_21_TO_49);
    public static final GrpAge AGE_21_PLUS = new GrpAge(_AGE_21_PLUS);
    public static final GrpAge AGE_25_TO_49 = new GrpAge(_AGE_25_TO_49);
    public static final GrpAge AGE_21_TO_44 = new GrpAge(_AGE_21_TO_44);
    public static final GrpAge AGE_21_TO_54 = new GrpAge(_AGE_21_TO_54);
    public static final GrpAge AGE_21_TO_64 = new GrpAge(_AGE_21_TO_64);
    public static final GrpAge AGE_35_TO_49 = new GrpAge(_AGE_35_TO_49);
    public java.lang.String getValue() { return _value_;}
    public static GrpAge fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GrpAge enumeration = (GrpAge)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GrpAge fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GrpAge.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GrpAge"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
