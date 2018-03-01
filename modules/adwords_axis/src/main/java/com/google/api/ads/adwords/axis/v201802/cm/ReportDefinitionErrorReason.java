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
 * ReportDefinitionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class ReportDefinitionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportDefinitionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_DATE_RANGE_FOR_REPORT = "INVALID_DATE_RANGE_FOR_REPORT";
    public static final java.lang.String _INVALID_FIELD_NAME_FOR_REPORT = "INVALID_FIELD_NAME_FOR_REPORT";
    public static final java.lang.String _UNABLE_TO_FIND_MAPPING_FOR_THIS_REPORT = "UNABLE_TO_FIND_MAPPING_FOR_THIS_REPORT";
    public static final java.lang.String _INVALID_COLUMN_NAME_FOR_REPORT = "INVALID_COLUMN_NAME_FOR_REPORT";
    public static final java.lang.String _INVALID_REPORT_DEFINITION_ID = "INVALID_REPORT_DEFINITION_ID";
    public static final java.lang.String _REPORT_SELECTOR_CANNOT_BE_NULL = "REPORT_SELECTOR_CANNOT_BE_NULL";
    public static final java.lang.String _NO_ENUMS_FOR_THIS_COLUMN_NAME = "NO_ENUMS_FOR_THIS_COLUMN_NAME";
    public static final java.lang.String _INVALID_VIEW = "INVALID_VIEW";
    public static final java.lang.String _SORTING_NOT_SUPPORTED = "SORTING_NOT_SUPPORTED";
    public static final java.lang.String _PAGING_NOT_SUPPORTED = "PAGING_NOT_SUPPORTED";
    public static final java.lang.String _CUSTOMER_SERVING_TYPE_REPORT_MISMATCH = "CUSTOMER_SERVING_TYPE_REPORT_MISMATCH";
    public static final java.lang.String _CLIENT_SELECTOR_NO_CUSTOMER_IDENTIFIER = "CLIENT_SELECTOR_NO_CUSTOMER_IDENTIFIER";
    public static final java.lang.String _CLIENT_SELECTOR_INVALID_CUSTOMER_ID = "CLIENT_SELECTOR_INVALID_CUSTOMER_ID";
    public static final java.lang.String _REPORT_DEFINITION_ERROR = "REPORT_DEFINITION_ERROR";
    public static final ReportDefinitionErrorReason INVALID_DATE_RANGE_FOR_REPORT = new ReportDefinitionErrorReason(_INVALID_DATE_RANGE_FOR_REPORT);
    public static final ReportDefinitionErrorReason INVALID_FIELD_NAME_FOR_REPORT = new ReportDefinitionErrorReason(_INVALID_FIELD_NAME_FOR_REPORT);
    public static final ReportDefinitionErrorReason UNABLE_TO_FIND_MAPPING_FOR_THIS_REPORT = new ReportDefinitionErrorReason(_UNABLE_TO_FIND_MAPPING_FOR_THIS_REPORT);
    public static final ReportDefinitionErrorReason INVALID_COLUMN_NAME_FOR_REPORT = new ReportDefinitionErrorReason(_INVALID_COLUMN_NAME_FOR_REPORT);
    public static final ReportDefinitionErrorReason INVALID_REPORT_DEFINITION_ID = new ReportDefinitionErrorReason(_INVALID_REPORT_DEFINITION_ID);
    public static final ReportDefinitionErrorReason REPORT_SELECTOR_CANNOT_BE_NULL = new ReportDefinitionErrorReason(_REPORT_SELECTOR_CANNOT_BE_NULL);
    public static final ReportDefinitionErrorReason NO_ENUMS_FOR_THIS_COLUMN_NAME = new ReportDefinitionErrorReason(_NO_ENUMS_FOR_THIS_COLUMN_NAME);
    public static final ReportDefinitionErrorReason INVALID_VIEW = new ReportDefinitionErrorReason(_INVALID_VIEW);
    public static final ReportDefinitionErrorReason SORTING_NOT_SUPPORTED = new ReportDefinitionErrorReason(_SORTING_NOT_SUPPORTED);
    public static final ReportDefinitionErrorReason PAGING_NOT_SUPPORTED = new ReportDefinitionErrorReason(_PAGING_NOT_SUPPORTED);
    public static final ReportDefinitionErrorReason CUSTOMER_SERVING_TYPE_REPORT_MISMATCH = new ReportDefinitionErrorReason(_CUSTOMER_SERVING_TYPE_REPORT_MISMATCH);
    public static final ReportDefinitionErrorReason CLIENT_SELECTOR_NO_CUSTOMER_IDENTIFIER = new ReportDefinitionErrorReason(_CLIENT_SELECTOR_NO_CUSTOMER_IDENTIFIER);
    public static final ReportDefinitionErrorReason CLIENT_SELECTOR_INVALID_CUSTOMER_ID = new ReportDefinitionErrorReason(_CLIENT_SELECTOR_INVALID_CUSTOMER_ID);
    public static final ReportDefinitionErrorReason REPORT_DEFINITION_ERROR = new ReportDefinitionErrorReason(_REPORT_DEFINITION_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ReportDefinitionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportDefinitionErrorReason enumeration = (ReportDefinitionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportDefinitionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReportDefinitionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ReportDefinitionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
