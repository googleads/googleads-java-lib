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
 * TrialStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class TrialStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrialStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _CREATING = "CREATING";
    public static final java.lang.String _ACTIVE = "ACTIVE";
    public static final java.lang.String _PROMOTING = "PROMOTING";
    public static final java.lang.String _PROMOTED = "PROMOTED";
    public static final java.lang.String _ARCHIVED = "ARCHIVED";
    public static final java.lang.String _CREATION_FAILED = "CREATION_FAILED";
    public static final java.lang.String _PROMOTE_FAILED = "PROMOTE_FAILED";
    public static final java.lang.String _GRADUATED = "GRADUATED";
    public static final java.lang.String _HALTED = "HALTED";
    public static final TrialStatus UNKNOWN = new TrialStatus(_UNKNOWN);
    public static final TrialStatus CREATING = new TrialStatus(_CREATING);
    public static final TrialStatus ACTIVE = new TrialStatus(_ACTIVE);
    public static final TrialStatus PROMOTING = new TrialStatus(_PROMOTING);
    public static final TrialStatus PROMOTED = new TrialStatus(_PROMOTED);
    public static final TrialStatus ARCHIVED = new TrialStatus(_ARCHIVED);
    public static final TrialStatus CREATION_FAILED = new TrialStatus(_CREATION_FAILED);
    public static final TrialStatus PROMOTE_FAILED = new TrialStatus(_PROMOTE_FAILED);
    public static final TrialStatus GRADUATED = new TrialStatus(_GRADUATED);
    public static final TrialStatus HALTED = new TrialStatus(_HALTED);
    public java.lang.String getValue() { return _value_;}
    public static TrialStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TrialStatus enumeration = (TrialStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TrialStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TrialStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
