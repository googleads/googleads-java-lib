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
 * ReconciliationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ReconciliationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReconciliationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CANNOT_CREATE_RECONCILIATION_REPORT_VERSION = "CANNOT_CREATE_RECONCILIATION_REPORT_VERSION";
    public static final java.lang.String _INVALID_RECONCILIATION_REPORT_STATE_TRANSITION = "INVALID_RECONCILIATION_REPORT_STATE_TRANSITION";
    public static final java.lang.String _INVALID_RECONCILIATION_PROPOSAL_SUBMISSION_SEQUENCE = "INVALID_RECONCILIATION_PROPOSAL_SUBMISSION_SEQUENCE";
    public static final java.lang.String _USER_CANNOT_RECONCILE_RECONCILIATION_REPORT = "USER_CANNOT_RECONCILE_RECONCILIATION_REPORT";
    public static final java.lang.String _CONTRACTED_VOLUME_CANNOT_BE_NULL = "CONTRACTED_VOLUME_CANNOT_BE_NULL";
    public static final java.lang.String _DFP_VOLUME_CANNOT_BE_NULL = "DFP_VOLUME_CANNOT_BE_NULL";
    public static final java.lang.String _MANUAL_VOLUME_CANNOT_BE_NULL = "MANUAL_VOLUME_CANNOT_BE_NULL";
    public static final java.lang.String _THIRD_PARTY_VOLUME_CANNOT_BE_NULL = "THIRD_PARTY_VOLUME_CANNOT_BE_NULL";
    public static final java.lang.String _DUPLICATE_LINE_ITEM_AND_CREATIVE = "DUPLICATE_LINE_ITEM_AND_CREATIVE";
    public static final java.lang.String _CANNOT_RECONCILE_LINE_ITEM_CREATIVE = "CANNOT_RECONCILE_LINE_ITEM_CREATIVE";
    public static final java.lang.String _LINE_ITEM_DAYS_MISMATCH = "LINE_ITEM_DAYS_MISMATCH";
    public static final java.lang.String _LINE_ITEM_BILL_OFF_OF_MISMATCH = "LINE_ITEM_BILL_OFF_OF_MISMATCH";
    public static final java.lang.String _CANNOT_MODIFY_RECONCILED_ORDER = "CANNOT_MODIFY_RECONCILED_ORDER";
    public static final java.lang.String _CANNOT_MODIFY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS = "CANNOT_MODIFY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS";
    public static final java.lang.String _CANNOT_QUERY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS = "CANNOT_QUERY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS";
    public static final java.lang.String _CANNOT_UPDATE_VOLUME_WHEN_BILLABLE_REVENUE_OVERRIDDEN = "CANNOT_UPDATE_VOLUME_WHEN_BILLABLE_REVENUE_OVERRIDDEN";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ReconciliationErrorReason CANNOT_CREATE_RECONCILIATION_REPORT_VERSION = new ReconciliationErrorReason(_CANNOT_CREATE_RECONCILIATION_REPORT_VERSION);
    public static final ReconciliationErrorReason INVALID_RECONCILIATION_REPORT_STATE_TRANSITION = new ReconciliationErrorReason(_INVALID_RECONCILIATION_REPORT_STATE_TRANSITION);
    public static final ReconciliationErrorReason INVALID_RECONCILIATION_PROPOSAL_SUBMISSION_SEQUENCE = new ReconciliationErrorReason(_INVALID_RECONCILIATION_PROPOSAL_SUBMISSION_SEQUENCE);
    public static final ReconciliationErrorReason USER_CANNOT_RECONCILE_RECONCILIATION_REPORT = new ReconciliationErrorReason(_USER_CANNOT_RECONCILE_RECONCILIATION_REPORT);
    public static final ReconciliationErrorReason CONTRACTED_VOLUME_CANNOT_BE_NULL = new ReconciliationErrorReason(_CONTRACTED_VOLUME_CANNOT_BE_NULL);
    public static final ReconciliationErrorReason DFP_VOLUME_CANNOT_BE_NULL = new ReconciliationErrorReason(_DFP_VOLUME_CANNOT_BE_NULL);
    public static final ReconciliationErrorReason MANUAL_VOLUME_CANNOT_BE_NULL = new ReconciliationErrorReason(_MANUAL_VOLUME_CANNOT_BE_NULL);
    public static final ReconciliationErrorReason THIRD_PARTY_VOLUME_CANNOT_BE_NULL = new ReconciliationErrorReason(_THIRD_PARTY_VOLUME_CANNOT_BE_NULL);
    public static final ReconciliationErrorReason DUPLICATE_LINE_ITEM_AND_CREATIVE = new ReconciliationErrorReason(_DUPLICATE_LINE_ITEM_AND_CREATIVE);
    public static final ReconciliationErrorReason CANNOT_RECONCILE_LINE_ITEM_CREATIVE = new ReconciliationErrorReason(_CANNOT_RECONCILE_LINE_ITEM_CREATIVE);
    public static final ReconciliationErrorReason LINE_ITEM_DAYS_MISMATCH = new ReconciliationErrorReason(_LINE_ITEM_DAYS_MISMATCH);
    public static final ReconciliationErrorReason LINE_ITEM_BILL_OFF_OF_MISMATCH = new ReconciliationErrorReason(_LINE_ITEM_BILL_OFF_OF_MISMATCH);
    public static final ReconciliationErrorReason CANNOT_MODIFY_RECONCILED_ORDER = new ReconciliationErrorReason(_CANNOT_MODIFY_RECONCILED_ORDER);
    public static final ReconciliationErrorReason CANNOT_MODIFY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS = new ReconciliationErrorReason(_CANNOT_MODIFY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS);
    public static final ReconciliationErrorReason CANNOT_QUERY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS = new ReconciliationErrorReason(_CANNOT_QUERY_ACROSS_MULTIPLE_RECONCILIATION_REPORTS);
    public static final ReconciliationErrorReason CANNOT_UPDATE_VOLUME_WHEN_BILLABLE_REVENUE_OVERRIDDEN = new ReconciliationErrorReason(_CANNOT_UPDATE_VOLUME_WHEN_BILLABLE_REVENUE_OVERRIDDEN);
    public static final ReconciliationErrorReason UNKNOWN = new ReconciliationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ReconciliationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ReconciliationErrorReason enumeration = (ReconciliationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReconciliationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReconciliationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ReconciliationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
