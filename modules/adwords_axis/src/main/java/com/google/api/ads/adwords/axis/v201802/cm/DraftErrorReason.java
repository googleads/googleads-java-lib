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
 * DraftErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class DraftErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DraftErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_CHANGE_ARCHIVED_DRAFT = "CANNOT_CHANGE_ARCHIVED_DRAFT";
    public static final java.lang.String _CANNOT_CHANGE_PROMOTED_DRAFT = "CANNOT_CHANGE_PROMOTED_DRAFT";
    public static final java.lang.String _CANNOT_CHANGE_PROMOTE_FAILED_DRAFT = "CANNOT_CHANGE_PROMOTE_FAILED_DRAFT";
    public static final java.lang.String _CUSTOMER_CANNOT_CREATE_DRAFT = "CUSTOMER_CANNOT_CREATE_DRAFT";
    public static final java.lang.String _CAMPAIGN_CANNOT_CREATE_DRAFT = "CAMPAIGN_CANNOT_CREATE_DRAFT";
    public static final java.lang.String _DUPLICATE_DRAFT_NAME = "DUPLICATE_DRAFT_NAME";
    public static final java.lang.String _INVALID_DRAFT_CHANGE = "INVALID_DRAFT_CHANGE";
    public static final java.lang.String _INVALID_STATUS_TRANSITION = "INVALID_STATUS_TRANSITION";
    public static final java.lang.String _MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED = "MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED";
    public static final java.lang.String _DRAFT_ERROR = "DRAFT_ERROR";
    public static final DraftErrorReason CANNOT_CHANGE_ARCHIVED_DRAFT = new DraftErrorReason(_CANNOT_CHANGE_ARCHIVED_DRAFT);
    public static final DraftErrorReason CANNOT_CHANGE_PROMOTED_DRAFT = new DraftErrorReason(_CANNOT_CHANGE_PROMOTED_DRAFT);
    public static final DraftErrorReason CANNOT_CHANGE_PROMOTE_FAILED_DRAFT = new DraftErrorReason(_CANNOT_CHANGE_PROMOTE_FAILED_DRAFT);
    public static final DraftErrorReason CUSTOMER_CANNOT_CREATE_DRAFT = new DraftErrorReason(_CUSTOMER_CANNOT_CREATE_DRAFT);
    public static final DraftErrorReason CAMPAIGN_CANNOT_CREATE_DRAFT = new DraftErrorReason(_CAMPAIGN_CANNOT_CREATE_DRAFT);
    public static final DraftErrorReason DUPLICATE_DRAFT_NAME = new DraftErrorReason(_DUPLICATE_DRAFT_NAME);
    public static final DraftErrorReason INVALID_DRAFT_CHANGE = new DraftErrorReason(_INVALID_DRAFT_CHANGE);
    public static final DraftErrorReason INVALID_STATUS_TRANSITION = new DraftErrorReason(_INVALID_STATUS_TRANSITION);
    public static final DraftErrorReason MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED = new DraftErrorReason(_MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED);
    public static final DraftErrorReason DRAFT_ERROR = new DraftErrorReason(_DRAFT_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static DraftErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DraftErrorReason enumeration = (DraftErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DraftErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DraftErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DraftError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
