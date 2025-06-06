// Copyright 2025 Google LLC
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
 * OrderErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public class OrderErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrderErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UPDATE_CANCELED_ORDER_NOT_ALLOWED = "UPDATE_CANCELED_ORDER_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED = "UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_ARCHIVED_ORDER_NOT_ALLOWED = "UPDATE_ARCHIVED_ORDER_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_MODIFY_PROPOSAL_ID = "CANNOT_MODIFY_PROPOSAL_ID";
    public static final java.lang.String _PRIMARY_USER_REQUIRED = "PRIMARY_USER_REQUIRED";
    public static final java.lang.String _PRIMARY_USER_CANNOT_BE_SECONDARY = "PRIMARY_USER_CANNOT_BE_SECONDARY";
    public static final java.lang.String _ORDER_TEAM_NOT_ASSOCIATED_WITH_ADVERTISER = "ORDER_TEAM_NOT_ASSOCIATED_WITH_ADVERTISER";
    public static final java.lang.String _USER_NOT_ON_ORDERS_TEAMS = "USER_NOT_ON_ORDERS_TEAMS";
    public static final java.lang.String _AGENCY_NOT_ON_ORDERS_TEAMS = "AGENCY_NOT_ON_ORDERS_TEAMS";
    public static final java.lang.String _INVALID_FIELDS_SET_FOR_NON_PROGRAMMATIC_ORDER = "INVALID_FIELDS_SET_FOR_NON_PROGRAMMATIC_ORDER";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final OrderErrorReason UPDATE_CANCELED_ORDER_NOT_ALLOWED = new OrderErrorReason(_UPDATE_CANCELED_ORDER_NOT_ALLOWED);
    public static final OrderErrorReason UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED = new OrderErrorReason(_UPDATE_PENDING_APPROVAL_ORDER_NOT_ALLOWED);
    public static final OrderErrorReason UPDATE_ARCHIVED_ORDER_NOT_ALLOWED = new OrderErrorReason(_UPDATE_ARCHIVED_ORDER_NOT_ALLOWED);
    public static final OrderErrorReason CANNOT_MODIFY_PROPOSAL_ID = new OrderErrorReason(_CANNOT_MODIFY_PROPOSAL_ID);
    public static final OrderErrorReason PRIMARY_USER_REQUIRED = new OrderErrorReason(_PRIMARY_USER_REQUIRED);
    public static final OrderErrorReason PRIMARY_USER_CANNOT_BE_SECONDARY = new OrderErrorReason(_PRIMARY_USER_CANNOT_BE_SECONDARY);
    public static final OrderErrorReason ORDER_TEAM_NOT_ASSOCIATED_WITH_ADVERTISER = new OrderErrorReason(_ORDER_TEAM_NOT_ASSOCIATED_WITH_ADVERTISER);
    public static final OrderErrorReason USER_NOT_ON_ORDERS_TEAMS = new OrderErrorReason(_USER_NOT_ON_ORDERS_TEAMS);
    public static final OrderErrorReason AGENCY_NOT_ON_ORDERS_TEAMS = new OrderErrorReason(_AGENCY_NOT_ON_ORDERS_TEAMS);
    public static final OrderErrorReason INVALID_FIELDS_SET_FOR_NON_PROGRAMMATIC_ORDER = new OrderErrorReason(_INVALID_FIELDS_SET_FOR_NON_PROGRAMMATIC_ORDER);
    public static final OrderErrorReason UNKNOWN = new OrderErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static OrderErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OrderErrorReason enumeration = (OrderErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OrderErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OrderErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "OrderError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
