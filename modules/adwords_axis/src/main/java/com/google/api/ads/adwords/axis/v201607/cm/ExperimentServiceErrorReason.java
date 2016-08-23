// Copyright 2016 Google Inc. All Rights Reserved.
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
 * ExperimentServiceErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;

public class ExperimentServiceErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExperimentServiceErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AFTER_MAXIMUM_ALLOWABLE_DATE = "AFTER_MAXIMUM_ALLOWABLE_DATE";
    public static final java.lang.String _AOL_PARTNER_CAMPAIGNS_CANT_RUN_EXPERIMENTS = "AOL_PARTNER_CAMPAIGNS_CANT_RUN_EXPERIMENTS";
    public static final java.lang.String _CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY = "CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY";
    public static final java.lang.String _CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY_FEATURE = "CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY_FEATURE";
    public static final java.lang.String _CANNOT_SET_DATE_TO_PAST = "CANNOT_SET_DATE_TO_PAST";
    public static final java.lang.String _CANNOT_SET_END_DATE_WITHOUT_SETTING_START_DATE = "CANNOT_SET_END_DATE_WITHOUT_SETTING_START_DATE";
    public static final java.lang.String _CANNOT_USE_EXPERIMENT_WITH_SHARED_BUDGET = "CANNOT_USE_EXPERIMENT_WITH_SHARED_BUDGET";
    public static final java.lang.String _DATE_OUTSIDE_CAMPAIGN_DATE_RANGE = "DATE_OUTSIDE_CAMPAIGN_DATE_RANGE";
    public static final java.lang.String _EXPERIMENT_ALREADY_STARTED = "EXPERIMENT_ALREADY_STARTED";
    public static final java.lang.String _EXPERIMENT_ENDED = "EXPERIMENT_ENDED";
    public static final java.lang.String _EXPERIMENT_LIMIT_EXCEEDED = "EXPERIMENT_LIMIT_EXCEEDED";
    public static final java.lang.String _INVALID_EXPERIMENT_NAME = "INVALID_EXPERIMENT_NAME";
    public static final java.lang.String _INVALID_QUERY_PERCENTAGE = "INVALID_QUERY_PERCENTAGE";
    public static final java.lang.String _CANNOT_CHANGE_QUERY_PERCENTAGE_AFTER_EXPERIMENT_HAS_STARTED = "CANNOT_CHANGE_QUERY_PERCENTAGE_AFTER_EXPERIMENT_HAS_STARTED";
    public static final java.lang.String _INVALID_STATUS_UPDATE = "INVALID_STATUS_UPDATE";
    public static final java.lang.String _START_DATE_AFTER_END_DATE = "START_DATE_AFTER_END_DATE";
    public static final java.lang.String _NO_VALID_BUDGET = "NO_VALID_BUDGET";
    public static final java.lang.String _EXPERIMENT_NOT_ACTIVE = "EXPERIMENT_NOT_ACTIVE";
    public static final java.lang.String _EXPERIMENT_SERVICE_ERROR = "EXPERIMENT_SERVICE_ERROR";
    public static final ExperimentServiceErrorReason AFTER_MAXIMUM_ALLOWABLE_DATE = new ExperimentServiceErrorReason(_AFTER_MAXIMUM_ALLOWABLE_DATE);
    public static final ExperimentServiceErrorReason AOL_PARTNER_CAMPAIGNS_CANT_RUN_EXPERIMENTS = new ExperimentServiceErrorReason(_AOL_PARTNER_CAMPAIGNS_CANT_RUN_EXPERIMENTS);
    public static final ExperimentServiceErrorReason CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY = new ExperimentServiceErrorReason(_CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY);
    public static final ExperimentServiceErrorReason CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY_FEATURE = new ExperimentServiceErrorReason(_CANNOT_CREATE_EXPERIMENT_FOR_BIDDING_STRATEGY_FEATURE);
    public static final ExperimentServiceErrorReason CANNOT_SET_DATE_TO_PAST = new ExperimentServiceErrorReason(_CANNOT_SET_DATE_TO_PAST);
    public static final ExperimentServiceErrorReason CANNOT_SET_END_DATE_WITHOUT_SETTING_START_DATE = new ExperimentServiceErrorReason(_CANNOT_SET_END_DATE_WITHOUT_SETTING_START_DATE);
    public static final ExperimentServiceErrorReason CANNOT_USE_EXPERIMENT_WITH_SHARED_BUDGET = new ExperimentServiceErrorReason(_CANNOT_USE_EXPERIMENT_WITH_SHARED_BUDGET);
    public static final ExperimentServiceErrorReason DATE_OUTSIDE_CAMPAIGN_DATE_RANGE = new ExperimentServiceErrorReason(_DATE_OUTSIDE_CAMPAIGN_DATE_RANGE);
    public static final ExperimentServiceErrorReason EXPERIMENT_ALREADY_STARTED = new ExperimentServiceErrorReason(_EXPERIMENT_ALREADY_STARTED);
    public static final ExperimentServiceErrorReason EXPERIMENT_ENDED = new ExperimentServiceErrorReason(_EXPERIMENT_ENDED);
    public static final ExperimentServiceErrorReason EXPERIMENT_LIMIT_EXCEEDED = new ExperimentServiceErrorReason(_EXPERIMENT_LIMIT_EXCEEDED);
    public static final ExperimentServiceErrorReason INVALID_EXPERIMENT_NAME = new ExperimentServiceErrorReason(_INVALID_EXPERIMENT_NAME);
    public static final ExperimentServiceErrorReason INVALID_QUERY_PERCENTAGE = new ExperimentServiceErrorReason(_INVALID_QUERY_PERCENTAGE);
    public static final ExperimentServiceErrorReason CANNOT_CHANGE_QUERY_PERCENTAGE_AFTER_EXPERIMENT_HAS_STARTED = new ExperimentServiceErrorReason(_CANNOT_CHANGE_QUERY_PERCENTAGE_AFTER_EXPERIMENT_HAS_STARTED);
    public static final ExperimentServiceErrorReason INVALID_STATUS_UPDATE = new ExperimentServiceErrorReason(_INVALID_STATUS_UPDATE);
    public static final ExperimentServiceErrorReason START_DATE_AFTER_END_DATE = new ExperimentServiceErrorReason(_START_DATE_AFTER_END_DATE);
    public static final ExperimentServiceErrorReason NO_VALID_BUDGET = new ExperimentServiceErrorReason(_NO_VALID_BUDGET);
    public static final ExperimentServiceErrorReason EXPERIMENT_NOT_ACTIVE = new ExperimentServiceErrorReason(_EXPERIMENT_NOT_ACTIVE);
    public static final ExperimentServiceErrorReason EXPERIMENT_SERVICE_ERROR = new ExperimentServiceErrorReason(_EXPERIMENT_SERVICE_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ExperimentServiceErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExperimentServiceErrorReason enumeration = (ExperimentServiceErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExperimentServiceErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExperimentServiceErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "ExperimentServiceError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
