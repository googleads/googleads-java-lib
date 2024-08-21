// Copyright 2024 Google LLC
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
 * DaiIngestStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;

public class DaiIngestStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DaiIngestStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SUCCESS = "SUCCESS";
    public static final java.lang.String _WARNING = "WARNING";
    public static final java.lang.String _INGESTED = "INGESTED";
    public static final java.lang.String _INGESTED_WITH_WARNINGS = "INGESTED_WITH_WARNINGS";
    public static final java.lang.String _CONDITIONED = "CONDITIONED";
    public static final java.lang.String _CONDITIONED_WITH_WARNINGS = "CONDITIONED_WITH_WARNINGS";
    public static final java.lang.String _FAILURE = "FAILURE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DaiIngestStatus SUCCESS = new DaiIngestStatus(_SUCCESS);
    public static final DaiIngestStatus WARNING = new DaiIngestStatus(_WARNING);
    public static final DaiIngestStatus INGESTED = new DaiIngestStatus(_INGESTED);
    public static final DaiIngestStatus INGESTED_WITH_WARNINGS = new DaiIngestStatus(_INGESTED_WITH_WARNINGS);
    public static final DaiIngestStatus CONDITIONED = new DaiIngestStatus(_CONDITIONED);
    public static final DaiIngestStatus CONDITIONED_WITH_WARNINGS = new DaiIngestStatus(_CONDITIONED_WITH_WARNINGS);
    public static final DaiIngestStatus FAILURE = new DaiIngestStatus(_FAILURE);
    public static final DaiIngestStatus UNKNOWN = new DaiIngestStatus(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DaiIngestStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DaiIngestStatus enumeration = (DaiIngestStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DaiIngestStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DaiIngestStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "DaiIngestStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
