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
 * QueryErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class QueryErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QueryErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PARSING_FAILED = "PARSING_FAILED";
    public static final java.lang.String _MISSING_QUERY = "MISSING_QUERY";
    public static final java.lang.String _MISSING_SELECT_CLAUSE = "MISSING_SELECT_CLAUSE";
    public static final java.lang.String _MISSING_FROM_CLAUSE = "MISSING_FROM_CLAUSE";
    public static final java.lang.String _INVALID_SELECT_CLAUSE = "INVALID_SELECT_CLAUSE";
    public static final java.lang.String _INVALID_FROM_CLAUSE = "INVALID_FROM_CLAUSE";
    public static final java.lang.String _INVALID_WHERE_CLAUSE = "INVALID_WHERE_CLAUSE";
    public static final java.lang.String _INVALID_ORDER_BY_CLAUSE = "INVALID_ORDER_BY_CLAUSE";
    public static final java.lang.String _INVALID_LIMIT_CLAUSE = "INVALID_LIMIT_CLAUSE";
    public static final java.lang.String _INVALID_START_INDEX_IN_LIMIT_CLAUSE = "INVALID_START_INDEX_IN_LIMIT_CLAUSE";
    public static final java.lang.String _INVALID_PAGE_SIZE_IN_LIMIT_CLAUSE = "INVALID_PAGE_SIZE_IN_LIMIT_CLAUSE";
    public static final java.lang.String _INVALID_DURING_CLAUSE = "INVALID_DURING_CLAUSE";
    public static final java.lang.String _INVALID_MIN_DATE_IN_DURING_CLAUSE = "INVALID_MIN_DATE_IN_DURING_CLAUSE";
    public static final java.lang.String _INVALID_MAX_DATE_IN_DURING_CLAUSE = "INVALID_MAX_DATE_IN_DURING_CLAUSE";
    public static final java.lang.String _MAX_LESS_THAN_MIN_IN_DURING_CLAUSE = "MAX_LESS_THAN_MIN_IN_DURING_CLAUSE";
    public static final java.lang.String _VALIDATION_FAILED = "VALIDATION_FAILED";
    public static final QueryErrorReason PARSING_FAILED = new QueryErrorReason(_PARSING_FAILED);
    public static final QueryErrorReason MISSING_QUERY = new QueryErrorReason(_MISSING_QUERY);
    public static final QueryErrorReason MISSING_SELECT_CLAUSE = new QueryErrorReason(_MISSING_SELECT_CLAUSE);
    public static final QueryErrorReason MISSING_FROM_CLAUSE = new QueryErrorReason(_MISSING_FROM_CLAUSE);
    public static final QueryErrorReason INVALID_SELECT_CLAUSE = new QueryErrorReason(_INVALID_SELECT_CLAUSE);
    public static final QueryErrorReason INVALID_FROM_CLAUSE = new QueryErrorReason(_INVALID_FROM_CLAUSE);
    public static final QueryErrorReason INVALID_WHERE_CLAUSE = new QueryErrorReason(_INVALID_WHERE_CLAUSE);
    public static final QueryErrorReason INVALID_ORDER_BY_CLAUSE = new QueryErrorReason(_INVALID_ORDER_BY_CLAUSE);
    public static final QueryErrorReason INVALID_LIMIT_CLAUSE = new QueryErrorReason(_INVALID_LIMIT_CLAUSE);
    public static final QueryErrorReason INVALID_START_INDEX_IN_LIMIT_CLAUSE = new QueryErrorReason(_INVALID_START_INDEX_IN_LIMIT_CLAUSE);
    public static final QueryErrorReason INVALID_PAGE_SIZE_IN_LIMIT_CLAUSE = new QueryErrorReason(_INVALID_PAGE_SIZE_IN_LIMIT_CLAUSE);
    public static final QueryErrorReason INVALID_DURING_CLAUSE = new QueryErrorReason(_INVALID_DURING_CLAUSE);
    public static final QueryErrorReason INVALID_MIN_DATE_IN_DURING_CLAUSE = new QueryErrorReason(_INVALID_MIN_DATE_IN_DURING_CLAUSE);
    public static final QueryErrorReason INVALID_MAX_DATE_IN_DURING_CLAUSE = new QueryErrorReason(_INVALID_MAX_DATE_IN_DURING_CLAUSE);
    public static final QueryErrorReason MAX_LESS_THAN_MIN_IN_DURING_CLAUSE = new QueryErrorReason(_MAX_LESS_THAN_MIN_IN_DURING_CLAUSE);
    public static final QueryErrorReason VALIDATION_FAILED = new QueryErrorReason(_VALIDATION_FAILED);
    public java.lang.String getValue() { return _value_;}
    public static QueryErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        QueryErrorReason enumeration = (QueryErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static QueryErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(QueryErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "QueryError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
