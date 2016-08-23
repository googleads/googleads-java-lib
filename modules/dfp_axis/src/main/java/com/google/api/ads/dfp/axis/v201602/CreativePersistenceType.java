// Copyright 2016 Google Inc. All Rights Reserved.
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
 * CreativePersistenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;

public class CreativePersistenceType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CreativePersistenceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_PERSISTENT = "NOT_PERSISTENT";
    public static final java.lang.String _PERSISTENT_AND_EXCLUDE_NONE = "PERSISTENT_AND_EXCLUDE_NONE";
    public static final java.lang.String _PERSISTENT_AND_EXCLUDE_DISPLAY = "PERSISTENT_AND_EXCLUDE_DISPLAY";
    public static final java.lang.String _PERSISTENT_AND_EXCLUDE_VIDEO = "PERSISTENT_AND_EXCLUDE_VIDEO";
    public static final java.lang.String _PERSISTENT_AND_EXCLUDE_ALL = "PERSISTENT_AND_EXCLUDE_ALL";
    public static final CreativePersistenceType NOT_PERSISTENT = new CreativePersistenceType(_NOT_PERSISTENT);
    public static final CreativePersistenceType PERSISTENT_AND_EXCLUDE_NONE = new CreativePersistenceType(_PERSISTENT_AND_EXCLUDE_NONE);
    public static final CreativePersistenceType PERSISTENT_AND_EXCLUDE_DISPLAY = new CreativePersistenceType(_PERSISTENT_AND_EXCLUDE_DISPLAY);
    public static final CreativePersistenceType PERSISTENT_AND_EXCLUDE_VIDEO = new CreativePersistenceType(_PERSISTENT_AND_EXCLUDE_VIDEO);
    public static final CreativePersistenceType PERSISTENT_AND_EXCLUDE_ALL = new CreativePersistenceType(_PERSISTENT_AND_EXCLUDE_ALL);
    public java.lang.String getValue() { return _value_;}
    public static CreativePersistenceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CreativePersistenceType enumeration = (CreativePersistenceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CreativePersistenceType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CreativePersistenceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "CreativePersistenceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
