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
 * McmErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;

public class McmErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected McmErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _REVENUE_SHARE_PERCENT_OUTSIDE_RANGE = "REVENUE_SHARE_PERCENT_OUTSIDE_RANGE";
    public static final java.lang.String _RESELLER_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT = "RESELLER_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT";
    public static final java.lang.String _MI_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT = "MI_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT";
    public static final java.lang.String _DUPLICATE_CHILD_PUBLISHER_NETWORK_CODE = "DUPLICATE_CHILD_PUBLISHER_NETWORK_CODE";
    public static final java.lang.String _DUPLICATE_CHILD_PUBLISHER_ACTIVE_EMAIL = "DUPLICATE_CHILD_PUBLISHER_ACTIVE_EMAIL";
    public static final java.lang.String _CHILD_NETWORK_DISAPPROVED = "CHILD_NETWORK_DISAPPROVED";
    public static final java.lang.String _MANAGE_INVENTORY_UNSUPPORTED_IN_RESELLER_NETWORK = "MANAGE_INVENTORY_UNSUPPORTED_IN_RESELLER_NETWORK";
    public static final java.lang.String _CANNOT_SEND_INVITATION_TO_MCM_PARENT = "CANNOT_SEND_INVITATION_TO_MCM_PARENT";
    public static final java.lang.String _CANNOT_SEND_INVITATION_TO_NETWORK_WITH_RESELLER_PARENT = "CANNOT_SEND_INVITATION_TO_NETWORK_WITH_RESELLER_PARENT";
    public static final java.lang.String _CANNOT_SEND_INVITATION_TO_SELF = "CANNOT_SEND_INVITATION_TO_SELF";
    public static final java.lang.String _CANNOT_CLOSE_MCM_WITH_ACTIVE_CHILDREN = "CANNOT_CLOSE_MCM_WITH_ACTIVE_CHILDREN";
    public static final java.lang.String _CANNOT_TURN_CHILD_INTO_PARENT_WITH_ACTIVE_INVITATION = "CANNOT_TURN_CHILD_INTO_PARENT_WITH_ACTIVE_INVITATION";
    public static final java.lang.String _MISSING_NETWORK_EXCHANGE_ACCOUNT = "MISSING_NETWORK_EXCHANGE_ACCOUNT";
    public static final java.lang.String _OPERATION_UNSUPPORTED_INITIAL_STATUS = "OPERATION_UNSUPPORTED_INITIAL_STATUS";
    public static final McmErrorReason UNKNOWN = new McmErrorReason(_UNKNOWN);
    public static final McmErrorReason REVENUE_SHARE_PERCENT_OUTSIDE_RANGE = new McmErrorReason(_REVENUE_SHARE_PERCENT_OUTSIDE_RANGE);
    public static final McmErrorReason RESELLER_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT = new McmErrorReason(_RESELLER_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT);
    public static final McmErrorReason MI_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT = new McmErrorReason(_MI_PARENT_REVENUE_SHARE_IS_NOT_100_PERCENT);
    public static final McmErrorReason DUPLICATE_CHILD_PUBLISHER_NETWORK_CODE = new McmErrorReason(_DUPLICATE_CHILD_PUBLISHER_NETWORK_CODE);
    public static final McmErrorReason DUPLICATE_CHILD_PUBLISHER_ACTIVE_EMAIL = new McmErrorReason(_DUPLICATE_CHILD_PUBLISHER_ACTIVE_EMAIL);
    public static final McmErrorReason CHILD_NETWORK_DISAPPROVED = new McmErrorReason(_CHILD_NETWORK_DISAPPROVED);
    public static final McmErrorReason MANAGE_INVENTORY_UNSUPPORTED_IN_RESELLER_NETWORK = new McmErrorReason(_MANAGE_INVENTORY_UNSUPPORTED_IN_RESELLER_NETWORK);
    public static final McmErrorReason CANNOT_SEND_INVITATION_TO_MCM_PARENT = new McmErrorReason(_CANNOT_SEND_INVITATION_TO_MCM_PARENT);
    public static final McmErrorReason CANNOT_SEND_INVITATION_TO_NETWORK_WITH_RESELLER_PARENT = new McmErrorReason(_CANNOT_SEND_INVITATION_TO_NETWORK_WITH_RESELLER_PARENT);
    public static final McmErrorReason CANNOT_SEND_INVITATION_TO_SELF = new McmErrorReason(_CANNOT_SEND_INVITATION_TO_SELF);
    public static final McmErrorReason CANNOT_CLOSE_MCM_WITH_ACTIVE_CHILDREN = new McmErrorReason(_CANNOT_CLOSE_MCM_WITH_ACTIVE_CHILDREN);
    public static final McmErrorReason CANNOT_TURN_CHILD_INTO_PARENT_WITH_ACTIVE_INVITATION = new McmErrorReason(_CANNOT_TURN_CHILD_INTO_PARENT_WITH_ACTIVE_INVITATION);
    public static final McmErrorReason MISSING_NETWORK_EXCHANGE_ACCOUNT = new McmErrorReason(_MISSING_NETWORK_EXCHANGE_ACCOUNT);
    public static final McmErrorReason OPERATION_UNSUPPORTED_INITIAL_STATUS = new McmErrorReason(_OPERATION_UNSUPPORTED_INITIAL_STATUS);
    public java.lang.String getValue() { return _value_;}
    public static McmErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        McmErrorReason enumeration = (McmErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static McmErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(McmErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "McmError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
