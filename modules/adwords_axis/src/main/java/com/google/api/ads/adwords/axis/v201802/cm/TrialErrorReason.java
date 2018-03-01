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
 * TrialErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class TrialErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrialErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _INVALID_STATUS_TRANSITION = "INVALID_STATUS_TRANSITION";
    public static final java.lang.String _CANNOT_USE_TRIAL_WITH_SHARED_BUDGET = "CANNOT_USE_TRIAL_WITH_SHARED_BUDGET";
    public static final java.lang.String _CANNOT_CREATE_TRIAL_WHEN_CAMPAIGN_HAS_ACTIVE_EXPERIMENTS = "CANNOT_CREATE_TRIAL_WHEN_CAMPAIGN_HAS_ACTIVE_EXPERIMENTS";
    public static final java.lang.String _CANNOT_CREATE_TRIAL_FOR_DELETED_BASE_CAMPAIGN = "CANNOT_CREATE_TRIAL_FOR_DELETED_BASE_CAMPAIGN";
    public static final java.lang.String _CANNOT_CREATE_TRIAL_FOR_NON_PROPOSED_DRAFT = "CANNOT_CREATE_TRIAL_FOR_NON_PROPOSED_DRAFT";
    public static final java.lang.String _CUSTOMER_CANNOT_CREATE_TRIAL = "CUSTOMER_CANNOT_CREATE_TRIAL";
    public static final java.lang.String _CAMPAIGN_CANNOT_CREATE_TRIAL = "CAMPAIGN_CANNOT_CREATE_TRIAL";
    public static final java.lang.String _NAME_ALREADY_IN_USE = "NAME_ALREADY_IN_USE";
    public static final java.lang.String _TRIAL_DURATIONS_MUST_NOT_OVERLAP = "TRIAL_DURATIONS_MUST_NOT_OVERLAP";
    public static final java.lang.String _TRIAL_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION = "TRIAL_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION";
    public static final TrialErrorReason UNKNOWN = new TrialErrorReason(_UNKNOWN);
    public static final TrialErrorReason INVALID_STATUS_TRANSITION = new TrialErrorReason(_INVALID_STATUS_TRANSITION);
    public static final TrialErrorReason CANNOT_USE_TRIAL_WITH_SHARED_BUDGET = new TrialErrorReason(_CANNOT_USE_TRIAL_WITH_SHARED_BUDGET);
    public static final TrialErrorReason CANNOT_CREATE_TRIAL_WHEN_CAMPAIGN_HAS_ACTIVE_EXPERIMENTS = new TrialErrorReason(_CANNOT_CREATE_TRIAL_WHEN_CAMPAIGN_HAS_ACTIVE_EXPERIMENTS);
    public static final TrialErrorReason CANNOT_CREATE_TRIAL_FOR_DELETED_BASE_CAMPAIGN = new TrialErrorReason(_CANNOT_CREATE_TRIAL_FOR_DELETED_BASE_CAMPAIGN);
    public static final TrialErrorReason CANNOT_CREATE_TRIAL_FOR_NON_PROPOSED_DRAFT = new TrialErrorReason(_CANNOT_CREATE_TRIAL_FOR_NON_PROPOSED_DRAFT);
    public static final TrialErrorReason CUSTOMER_CANNOT_CREATE_TRIAL = new TrialErrorReason(_CUSTOMER_CANNOT_CREATE_TRIAL);
    public static final TrialErrorReason CAMPAIGN_CANNOT_CREATE_TRIAL = new TrialErrorReason(_CAMPAIGN_CANNOT_CREATE_TRIAL);
    public static final TrialErrorReason NAME_ALREADY_IN_USE = new TrialErrorReason(_NAME_ALREADY_IN_USE);
    public static final TrialErrorReason TRIAL_DURATIONS_MUST_NOT_OVERLAP = new TrialErrorReason(_TRIAL_DURATIONS_MUST_NOT_OVERLAP);
    public static final TrialErrorReason TRIAL_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION = new TrialErrorReason(_TRIAL_DURATION_MUST_BE_WITHIN_CAMPAIGN_DURATION);
    public java.lang.String getValue() { return _value_;}
    public static TrialErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TrialErrorReason enumeration = (TrialErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TrialErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TrialErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
