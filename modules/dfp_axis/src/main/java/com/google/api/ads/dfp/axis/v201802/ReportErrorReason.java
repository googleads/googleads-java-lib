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
 * ReportErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ReportErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReportErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEFAULT = "DEFAULT";
    public static final java.lang.String _REPORT_ACCESS_NOT_ALLOWED = "REPORT_ACCESS_NOT_ALLOWED";
    public static final java.lang.String _DIMENSION_VIEW_NOT_ALLOWED = "DIMENSION_VIEW_NOT_ALLOWED";
    public static final java.lang.String _ATTRIBUTE_VIEW_NOT_ALLOWED = "ATTRIBUTE_VIEW_NOT_ALLOWED";
    public static final java.lang.String _COLUMN_VIEW_NOT_ALLOWED = "COLUMN_VIEW_NOT_ALLOWED";
    public static final java.lang.String _TOO_MANY_CONCURRENT_REPORTS = "TOO_MANY_CONCURRENT_REPORTS";
    public static final java.lang.String _REPORT_QUERY_TOO_LONG = "REPORT_QUERY_TOO_LONG";
    public static final java.lang.String _INVALID_OPERATION_FOR_REPORT_STATE = "INVALID_OPERATION_FOR_REPORT_STATE";
    public static final java.lang.String _INVALID_DIMENSIONS = "INVALID_DIMENSIONS";
    public static final java.lang.String _INVALID_ATTRIBUTES = "INVALID_ATTRIBUTES";
    public static final java.lang.String _INVALID_CONTENT_HIERARCHY_DIMENSIONS = "INVALID_CONTENT_HIERARCHY_DIMENSIONS";
    public static final java.lang.String _INVALID_COLUMNS = "INVALID_COLUMNS";
    public static final java.lang.String _INVALID_DIMENSION_FILTERS = "INVALID_DIMENSION_FILTERS";
    public static final java.lang.String _INVALID_DATE = "INVALID_DATE";
    public static final java.lang.String _END_DATE_TIME_NOT_AFTER_START_TIME = "END_DATE_TIME_NOT_AFTER_START_TIME";
    public static final java.lang.String _START_DATE_MORE_THAN_THREE_YEARS_AGO = "START_DATE_MORE_THAN_THREE_YEARS_AGO";
    public static final java.lang.String _NOT_NULL = "NOT_NULL";
    public static final java.lang.String _ATTRIBUTES_NOT_SUPPORTED_FOR_REQUEST = "ATTRIBUTES_NOT_SUPPORTED_FOR_REQUEST";
    public static final java.lang.String _REPORT_CONSTRAINT_VIOLATION = "REPORT_CONSTRAINT_VIOLATION";
    public static final java.lang.String _FAILED_TO_STORE_REPORT = "FAILED_TO_STORE_REPORT";
    public static final java.lang.String _REPORT_NOT_FOUND = "REPORT_NOT_FOUND";
    public static final java.lang.String _SR_CANNOT_RUN_REPORT_IN_ANOTHER_NETWORK = "SR_CANNOT_RUN_REPORT_IN_ANOTHER_NETWORK";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ReportErrorReason DEFAULT = new ReportErrorReason(_DEFAULT);
    public static final ReportErrorReason REPORT_ACCESS_NOT_ALLOWED = new ReportErrorReason(_REPORT_ACCESS_NOT_ALLOWED);
    public static final ReportErrorReason DIMENSION_VIEW_NOT_ALLOWED = new ReportErrorReason(_DIMENSION_VIEW_NOT_ALLOWED);
    public static final ReportErrorReason ATTRIBUTE_VIEW_NOT_ALLOWED = new ReportErrorReason(_ATTRIBUTE_VIEW_NOT_ALLOWED);
    public static final ReportErrorReason COLUMN_VIEW_NOT_ALLOWED = new ReportErrorReason(_COLUMN_VIEW_NOT_ALLOWED);
    public static final ReportErrorReason TOO_MANY_CONCURRENT_REPORTS = new ReportErrorReason(_TOO_MANY_CONCURRENT_REPORTS);
    public static final ReportErrorReason REPORT_QUERY_TOO_LONG = new ReportErrorReason(_REPORT_QUERY_TOO_LONG);
    public static final ReportErrorReason INVALID_OPERATION_FOR_REPORT_STATE = new ReportErrorReason(_INVALID_OPERATION_FOR_REPORT_STATE);
    public static final ReportErrorReason INVALID_DIMENSIONS = new ReportErrorReason(_INVALID_DIMENSIONS);
    public static final ReportErrorReason INVALID_ATTRIBUTES = new ReportErrorReason(_INVALID_ATTRIBUTES);
    public static final ReportErrorReason INVALID_CONTENT_HIERARCHY_DIMENSIONS = new ReportErrorReason(_INVALID_CONTENT_HIERARCHY_DIMENSIONS);
    public static final ReportErrorReason INVALID_COLUMNS = new ReportErrorReason(_INVALID_COLUMNS);
    public static final ReportErrorReason INVALID_DIMENSION_FILTERS = new ReportErrorReason(_INVALID_DIMENSION_FILTERS);
    public static final ReportErrorReason INVALID_DATE = new ReportErrorReason(_INVALID_DATE);
    public static final ReportErrorReason END_DATE_TIME_NOT_AFTER_START_TIME = new ReportErrorReason(_END_DATE_TIME_NOT_AFTER_START_TIME);
    public static final ReportErrorReason START_DATE_MORE_THAN_THREE_YEARS_AGO = new ReportErrorReason(_START_DATE_MORE_THAN_THREE_YEARS_AGO);
    public static final ReportErrorReason NOT_NULL = new ReportErrorReason(_NOT_NULL);
    public static final ReportErrorReason ATTRIBUTES_NOT_SUPPORTED_FOR_REQUEST = new ReportErrorReason(_ATTRIBUTES_NOT_SUPPORTED_FOR_REQUEST);
    public static final ReportErrorReason REPORT_CONSTRAINT_VIOLATION = new ReportErrorReason(_REPORT_CONSTRAINT_VIOLATION);
    public static final ReportErrorReason FAILED_TO_STORE_REPORT = new ReportErrorReason(_FAILED_TO_STORE_REPORT);
    public static final ReportErrorReason REPORT_NOT_FOUND = new ReportErrorReason(_REPORT_NOT_FOUND);
    public static final ReportErrorReason SR_CANNOT_RUN_REPORT_IN_ANOTHER_NETWORK = new ReportErrorReason(_SR_CANNOT_RUN_REPORT_IN_ANOTHER_NETWORK);
    public static final ReportErrorReason UNKNOWN = new ReportErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ReportErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReportErrorReason enumeration = (ReportErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReportErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReportErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ReportError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
