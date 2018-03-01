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
 * BatchJobProcessingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class BatchJobProcessingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BatchJobProcessingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _INPUT_FILE_CORRUPTION = "INPUT_FILE_CORRUPTION";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _DEADLINE_EXCEEDED = "DEADLINE_EXCEEDED";
    public static final java.lang.String _FILE_FORMAT_ERROR = "FILE_FORMAT_ERROR";
    public static final BatchJobProcessingErrorReason UNKNOWN = new BatchJobProcessingErrorReason(_UNKNOWN);
    public static final BatchJobProcessingErrorReason INPUT_FILE_CORRUPTION = new BatchJobProcessingErrorReason(_INPUT_FILE_CORRUPTION);
    public static final BatchJobProcessingErrorReason INTERNAL_ERROR = new BatchJobProcessingErrorReason(_INTERNAL_ERROR);
    public static final BatchJobProcessingErrorReason DEADLINE_EXCEEDED = new BatchJobProcessingErrorReason(_DEADLINE_EXCEEDED);
    public static final BatchJobProcessingErrorReason FILE_FORMAT_ERROR = new BatchJobProcessingErrorReason(_FILE_FORMAT_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static BatchJobProcessingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BatchJobProcessingErrorReason enumeration = (BatchJobProcessingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BatchJobProcessingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BatchJobProcessingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BatchJobProcessingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
