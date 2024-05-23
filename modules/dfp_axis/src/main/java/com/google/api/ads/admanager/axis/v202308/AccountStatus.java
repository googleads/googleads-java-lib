// Copyright 2023 Google LLC
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
 * AccountStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public class AccountStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccountStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _INVITED = "INVITED";
    public static final java.lang.String _DECLINED = "DECLINED";
    public static final java.lang.String _PENDING_GOOGLE_APPROVAL = "PENDING_GOOGLE_APPROVAL";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _CLOSED_POLICY_VIOLATION = "CLOSED_POLICY_VIOLATION";
    public static final java.lang.String _CLOSED_INVALID_ACTIVITY = "CLOSED_INVALID_ACTIVITY";
    public static final java.lang.String _CLOSED_BY_PUBLISHER = "CLOSED_BY_PUBLISHER";
    public static final java.lang.String _DISAPPROVED_INELIGIBLE = "DISAPPROVED_INELIGIBLE";
    public static final java.lang.String _DISAPPROVED_DUPLICATE_ACCOUNT = "DISAPPROVED_DUPLICATE_ACCOUNT";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _INACTIVE = "INACTIVE";
    public static final java.lang.String _DEACTIVATED_BY_AD_MANAGER = "DEACTIVATED_BY_AD_MANAGER";
    public static final AccountStatus UNKNOWN = new AccountStatus(_UNKNOWN);
    public static final AccountStatus INVITED = new AccountStatus(_INVITED);
    public static final AccountStatus DECLINED = new AccountStatus(_DECLINED);
    public static final AccountStatus PENDING_GOOGLE_APPROVAL = new AccountStatus(_PENDING_GOOGLE_APPROVAL);
    public static final AccountStatus APPROVED = new AccountStatus(_APPROVED);
    public static final AccountStatus CLOSED_POLICY_VIOLATION = new AccountStatus(_CLOSED_POLICY_VIOLATION);
    public static final AccountStatus CLOSED_INVALID_ACTIVITY = new AccountStatus(_CLOSED_INVALID_ACTIVITY);
    public static final AccountStatus CLOSED_BY_PUBLISHER = new AccountStatus(_CLOSED_BY_PUBLISHER);
    public static final AccountStatus DISAPPROVED_INELIGIBLE = new AccountStatus(_DISAPPROVED_INELIGIBLE);
    public static final AccountStatus DISAPPROVED_DUPLICATE_ACCOUNT = new AccountStatus(_DISAPPROVED_DUPLICATE_ACCOUNT);
    public static final AccountStatus EXPIRED = new AccountStatus(_EXPIRED);
    public static final AccountStatus INACTIVE = new AccountStatus(_INACTIVE);
    public static final AccountStatus DEACTIVATED_BY_AD_MANAGER = new AccountStatus(_DEACTIVATED_BY_AD_MANAGER);
    public java.lang.String getValue() { return _value_;}
    public static AccountStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccountStatus enumeration = (AccountStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccountStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccountStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "AccountStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
