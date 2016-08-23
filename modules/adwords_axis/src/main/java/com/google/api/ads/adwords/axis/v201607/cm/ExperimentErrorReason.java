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
 * ExperimentErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;

public class ExperimentErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExperimentErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EXPERIMENT_DELTA_STATUS_NOT_SPECIFIED = "EXPERIMENT_DELTA_STATUS_NOT_SPECIFIED";
    public static final java.lang.String _EXPERIMENT_DELTA_STATUS_NOT_ALLOWED = "EXPERIMENT_DELTA_STATUS_NOT_ALLOWED";
    public static final java.lang.String _EXPERIMENT_STATUS_NOT_ALLOWED = "EXPERIMENT_STATUS_NOT_ALLOWED";
    public static final java.lang.String _EXPERIMENT_NOT_ALLOWED_FOR_BIDDING_STRATEGY = "EXPERIMENT_NOT_ALLOWED_FOR_BIDDING_STRATEGY";
    public static final java.lang.String _EXPERIMENT_NOT_ALLOWED_FOR_CRITERION_TYPE = "EXPERIMENT_NOT_ALLOWED_FOR_CRITERION_TYPE";
    public static final java.lang.String _EXPERIMENT_NOT_ACTIVE = "EXPERIMENT_NOT_ACTIVE";
    public static final java.lang.String _INVALID_EXPERIMENT_ID = "INVALID_EXPERIMENT_ID";
    public static final java.lang.String _EXPERIMENT_ID_NOT_SPECIFIED_WITH_SEGMENTATION_CRITERIA = "EXPERIMENT_ID_NOT_SPECIFIED_WITH_SEGMENTATION_CRITERIA";
    public static final java.lang.String _TOO_MANY_CHANGES_TO_EXPERIMENT = "TOO_MANY_CHANGES_TO_EXPERIMENT";
    public static final java.lang.String _EXPERIMENT_ERROR = "EXPERIMENT_ERROR";
    public static final ExperimentErrorReason EXPERIMENT_DELTA_STATUS_NOT_SPECIFIED = new ExperimentErrorReason(_EXPERIMENT_DELTA_STATUS_NOT_SPECIFIED);
    public static final ExperimentErrorReason EXPERIMENT_DELTA_STATUS_NOT_ALLOWED = new ExperimentErrorReason(_EXPERIMENT_DELTA_STATUS_NOT_ALLOWED);
    public static final ExperimentErrorReason EXPERIMENT_STATUS_NOT_ALLOWED = new ExperimentErrorReason(_EXPERIMENT_STATUS_NOT_ALLOWED);
    public static final ExperimentErrorReason EXPERIMENT_NOT_ALLOWED_FOR_BIDDING_STRATEGY = new ExperimentErrorReason(_EXPERIMENT_NOT_ALLOWED_FOR_BIDDING_STRATEGY);
    public static final ExperimentErrorReason EXPERIMENT_NOT_ALLOWED_FOR_CRITERION_TYPE = new ExperimentErrorReason(_EXPERIMENT_NOT_ALLOWED_FOR_CRITERION_TYPE);
    public static final ExperimentErrorReason EXPERIMENT_NOT_ACTIVE = new ExperimentErrorReason(_EXPERIMENT_NOT_ACTIVE);
    public static final ExperimentErrorReason INVALID_EXPERIMENT_ID = new ExperimentErrorReason(_INVALID_EXPERIMENT_ID);
    public static final ExperimentErrorReason EXPERIMENT_ID_NOT_SPECIFIED_WITH_SEGMENTATION_CRITERIA = new ExperimentErrorReason(_EXPERIMENT_ID_NOT_SPECIFIED_WITH_SEGMENTATION_CRITERIA);
    public static final ExperimentErrorReason TOO_MANY_CHANGES_TO_EXPERIMENT = new ExperimentErrorReason(_TOO_MANY_CHANGES_TO_EXPERIMENT);
    public static final ExperimentErrorReason EXPERIMENT_ERROR = new ExperimentErrorReason(_EXPERIMENT_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static ExperimentErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExperimentErrorReason enumeration = (ExperimentErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExperimentErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExperimentErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "ExperimentError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
