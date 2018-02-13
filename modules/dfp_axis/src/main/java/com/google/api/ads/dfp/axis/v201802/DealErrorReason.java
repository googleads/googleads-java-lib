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
 * DealErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class DealErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DealErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_ADD_LINE_ITEM_WHEN_SOLD = "CANNOT_ADD_LINE_ITEM_WHEN_SOLD";
    public static final java.lang.String _CANNOT_ARCHIVE_LINE_ITEM_WHEN_SOLD = "CANNOT_ARCHIVE_LINE_ITEM_WHEN_SOLD";
    public static final java.lang.String _CANNOT_ARCHIVE_PROPOSAL_WHEN_SOLD = "CANNOT_ARCHIVE_PROPOSAL_WHEN_SOLD";
    public static final java.lang.String _CANNOT_CHANGE_FIELD_REQUIRING_BUYER_APPROVAL = "CANNOT_CHANGE_FIELD_REQUIRING_BUYER_APPROVAL";
    public static final java.lang.String _CANNOT_GET_SELLER_ID = "CANNOT_GET_SELLER_ID";
    public static final java.lang.String _CAN_ONLY_EXECUTE_IF_LOCAL_EDITS = "CAN_ONLY_EXECUTE_IF_LOCAL_EDITS";
    public static final java.lang.String _MISSING_PROPOSAL_LINE_ITEMS = "MISSING_PROPOSAL_LINE_ITEMS";
    public static final java.lang.String _MISSING_ENVIRONMENT = "MISSING_ENVIRONMENT";
    public static final java.lang.String _MISSING_AD_EXCHANGE_PROPERTY = "MISSING_AD_EXCHANGE_PROPERTY";
    public static final java.lang.String _CANNOT_FIND_PROPOSAL_IN_MARKETPLACE = "CANNOT_FIND_PROPOSAL_IN_MARKETPLACE";
    public static final java.lang.String _CANNOT_GET_PRODUCT = "CANNOT_GET_PRODUCT";
    public static final java.lang.String _NEW_VERSION_FROM_BUYER = "NEW_VERSION_FROM_BUYER";
    public static final java.lang.String _PROPOSAL_OUT_OF_SYNC_WITH_MARKETPLACE = "PROPOSAL_OUT_OF_SYNC_WITH_MARKETPLACE";
    public static final java.lang.String _NO_PROPOSAL_CHANGES_FOUND = "NO_PROPOSAL_CHANGES_FOUND";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DealErrorReason CANNOT_ADD_LINE_ITEM_WHEN_SOLD = new DealErrorReason(_CANNOT_ADD_LINE_ITEM_WHEN_SOLD);
    public static final DealErrorReason CANNOT_ARCHIVE_LINE_ITEM_WHEN_SOLD = new DealErrorReason(_CANNOT_ARCHIVE_LINE_ITEM_WHEN_SOLD);
    public static final DealErrorReason CANNOT_ARCHIVE_PROPOSAL_WHEN_SOLD = new DealErrorReason(_CANNOT_ARCHIVE_PROPOSAL_WHEN_SOLD);
    public static final DealErrorReason CANNOT_CHANGE_FIELD_REQUIRING_BUYER_APPROVAL = new DealErrorReason(_CANNOT_CHANGE_FIELD_REQUIRING_BUYER_APPROVAL);
    public static final DealErrorReason CANNOT_GET_SELLER_ID = new DealErrorReason(_CANNOT_GET_SELLER_ID);
    public static final DealErrorReason CAN_ONLY_EXECUTE_IF_LOCAL_EDITS = new DealErrorReason(_CAN_ONLY_EXECUTE_IF_LOCAL_EDITS);
    public static final DealErrorReason MISSING_PROPOSAL_LINE_ITEMS = new DealErrorReason(_MISSING_PROPOSAL_LINE_ITEMS);
    public static final DealErrorReason MISSING_ENVIRONMENT = new DealErrorReason(_MISSING_ENVIRONMENT);
    public static final DealErrorReason MISSING_AD_EXCHANGE_PROPERTY = new DealErrorReason(_MISSING_AD_EXCHANGE_PROPERTY);
    public static final DealErrorReason CANNOT_FIND_PROPOSAL_IN_MARKETPLACE = new DealErrorReason(_CANNOT_FIND_PROPOSAL_IN_MARKETPLACE);
    public static final DealErrorReason CANNOT_GET_PRODUCT = new DealErrorReason(_CANNOT_GET_PRODUCT);
    public static final DealErrorReason NEW_VERSION_FROM_BUYER = new DealErrorReason(_NEW_VERSION_FROM_BUYER);
    public static final DealErrorReason PROPOSAL_OUT_OF_SYNC_WITH_MARKETPLACE = new DealErrorReason(_PROPOSAL_OUT_OF_SYNC_WITH_MARKETPLACE);
    public static final DealErrorReason NO_PROPOSAL_CHANGES_FOUND = new DealErrorReason(_NO_PROPOSAL_CHANGES_FOUND);
    public static final DealErrorReason UNKNOWN = new DealErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DealErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DealErrorReason enumeration = (DealErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DealErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DealErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DealError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
