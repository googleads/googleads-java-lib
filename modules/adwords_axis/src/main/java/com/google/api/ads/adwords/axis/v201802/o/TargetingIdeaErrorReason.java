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
 * TargetingIdeaErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;

public class TargetingIdeaErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TargetingIdeaErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DUPLICATE_SEARCH_FILTER_TYPES_PRESENT = "DUPLICATE_SEARCH_FILTER_TYPES_PRESENT";
    public static final java.lang.String _INSUFFICIENT_SEARCH_PARAMETERS = "INSUFFICIENT_SEARCH_PARAMETERS";
    public static final java.lang.String _INVALID_ATTRIBUTE_TYPE = "INVALID_ATTRIBUTE_TYPE";
    public static final java.lang.String _INVALID_SEARCH_PARAMETERS = "INVALID_SEARCH_PARAMETERS";
    public static final java.lang.String _INVALID_DOMAIN_SUFFIX = "INVALID_DOMAIN_SUFFIX";
    public static final java.lang.String _MUTUALLY_EXCLUSIVE_SEARCH_PARAMETERS_IN_QUERY = "MUTUALLY_EXCLUSIVE_SEARCH_PARAMETERS_IN_QUERY";
    public static final java.lang.String _SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE";
    public static final java.lang.String _INVALID_URL_IN_SEARCH_PARAMETER = "INVALID_URL_IN_SEARCH_PARAMETER";
    public static final java.lang.String _TOO_MANY_RESULTS_REQUESTED = "TOO_MANY_RESULTS_REQUESTED";
    public static final java.lang.String _NO_PAGING_IN_SELECTOR = "NO_PAGING_IN_SELECTOR";
    public static final java.lang.String _INVALID_INCLUDED_EXCLUDED_KEYWORDS = "INVALID_INCLUDED_EXCLUDED_KEYWORDS";
    public static final TargetingIdeaErrorReason DUPLICATE_SEARCH_FILTER_TYPES_PRESENT = new TargetingIdeaErrorReason(_DUPLICATE_SEARCH_FILTER_TYPES_PRESENT);
    public static final TargetingIdeaErrorReason INSUFFICIENT_SEARCH_PARAMETERS = new TargetingIdeaErrorReason(_INSUFFICIENT_SEARCH_PARAMETERS);
    public static final TargetingIdeaErrorReason INVALID_ATTRIBUTE_TYPE = new TargetingIdeaErrorReason(_INVALID_ATTRIBUTE_TYPE);
    public static final TargetingIdeaErrorReason INVALID_SEARCH_PARAMETERS = new TargetingIdeaErrorReason(_INVALID_SEARCH_PARAMETERS);
    public static final TargetingIdeaErrorReason INVALID_DOMAIN_SUFFIX = new TargetingIdeaErrorReason(_INVALID_DOMAIN_SUFFIX);
    public static final TargetingIdeaErrorReason MUTUALLY_EXCLUSIVE_SEARCH_PARAMETERS_IN_QUERY = new TargetingIdeaErrorReason(_MUTUALLY_EXCLUSIVE_SEARCH_PARAMETERS_IN_QUERY);
    public static final TargetingIdeaErrorReason SERVICE_UNAVAILABLE = new TargetingIdeaErrorReason(_SERVICE_UNAVAILABLE);
    public static final TargetingIdeaErrorReason INVALID_URL_IN_SEARCH_PARAMETER = new TargetingIdeaErrorReason(_INVALID_URL_IN_SEARCH_PARAMETER);
    public static final TargetingIdeaErrorReason TOO_MANY_RESULTS_REQUESTED = new TargetingIdeaErrorReason(_TOO_MANY_RESULTS_REQUESTED);
    public static final TargetingIdeaErrorReason NO_PAGING_IN_SELECTOR = new TargetingIdeaErrorReason(_NO_PAGING_IN_SELECTOR);
    public static final TargetingIdeaErrorReason INVALID_INCLUDED_EXCLUDED_KEYWORDS = new TargetingIdeaErrorReason(_INVALID_INCLUDED_EXCLUDED_KEYWORDS);
    public java.lang.String getValue() { return _value_;}
    public static TargetingIdeaErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TargetingIdeaErrorReason enumeration = (TargetingIdeaErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TargetingIdeaErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TargetingIdeaErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "TargetingIdeaError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
