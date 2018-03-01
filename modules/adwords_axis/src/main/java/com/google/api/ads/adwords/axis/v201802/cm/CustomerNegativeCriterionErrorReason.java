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
 * CustomerNegativeCriterionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class CustomerNegativeCriterionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerNegativeCriterionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_CRITERION_TYPE = "INVALID_CRITERION_TYPE";
    public static final java.lang.String _SHARED_SET_IS_DELETED = "SHARED_SET_IS_DELETED";
    public static final java.lang.String _INVALID_SHARED_SET_TYPE = "INVALID_SHARED_SET_TYPE";
    public static final java.lang.String _PLACEMENT_LIST_TYPE_ONLY_ALLOWED_FOR_XBID = "PLACEMENT_LIST_TYPE_ONLY_ALLOWED_FOR_XBID";
    public static final java.lang.String _MANAGER_CUSTOMER_CANNOT_ADD = "MANAGER_CUSTOMER_CANNOT_ADD";
    public static final java.lang.String _CUSTOMER_EXCLUSION_CRITERION_ERROR = "CUSTOMER_EXCLUSION_CRITERION_ERROR";
    public static final CustomerNegativeCriterionErrorReason INVALID_CRITERION_TYPE = new CustomerNegativeCriterionErrorReason(_INVALID_CRITERION_TYPE);
    public static final CustomerNegativeCriterionErrorReason SHARED_SET_IS_DELETED = new CustomerNegativeCriterionErrorReason(_SHARED_SET_IS_DELETED);
    public static final CustomerNegativeCriterionErrorReason INVALID_SHARED_SET_TYPE = new CustomerNegativeCriterionErrorReason(_INVALID_SHARED_SET_TYPE);
    public static final CustomerNegativeCriterionErrorReason PLACEMENT_LIST_TYPE_ONLY_ALLOWED_FOR_XBID = new CustomerNegativeCriterionErrorReason(_PLACEMENT_LIST_TYPE_ONLY_ALLOWED_FOR_XBID);
    public static final CustomerNegativeCriterionErrorReason MANAGER_CUSTOMER_CANNOT_ADD = new CustomerNegativeCriterionErrorReason(_MANAGER_CUSTOMER_CANNOT_ADD);
    public static final CustomerNegativeCriterionErrorReason CUSTOMER_EXCLUSION_CRITERION_ERROR = new CustomerNegativeCriterionErrorReason(_CUSTOMER_EXCLUSION_CRITERION_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static CustomerNegativeCriterionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerNegativeCriterionErrorReason enumeration = (CustomerNegativeCriterionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerNegativeCriterionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerNegativeCriterionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CustomerNegativeCriterionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
