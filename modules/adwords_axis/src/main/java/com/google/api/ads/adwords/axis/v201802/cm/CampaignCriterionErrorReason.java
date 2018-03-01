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
 * CampaignCriterionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class CampaignCriterionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignCriterionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONCRETE_TYPE_REQUIRED = "CONCRETE_TYPE_REQUIRED";
    public static final java.lang.String _INVALID_PLACEMENT_URL = "INVALID_PLACEMENT_URL";
    public static final java.lang.String _CANNOT_EXCLUDE_CRITERIA_TYPE = "CANNOT_EXCLUDE_CRITERIA_TYPE";
    public static final java.lang.String _CANNOT_SET_STATUS_FOR_CRITERIA_TYPE = "CANNOT_SET_STATUS_FOR_CRITERIA_TYPE";
    public static final java.lang.String _CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA = "CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA";
    public static final java.lang.String _CANNOT_TARGET_AND_EXCLUDE = "CANNOT_TARGET_AND_EXCLUDE";
    public static final java.lang.String _TOO_MANY_OPERATIONS = "TOO_MANY_OPERATIONS";
    public static final java.lang.String _OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE = "OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE";
    public static final java.lang.String _SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL = "SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _CANNOT_ADD_EXISTING_FIELD = "CANNOT_ADD_EXISTING_FIELD";
    public static final CampaignCriterionErrorReason CONCRETE_TYPE_REQUIRED = new CampaignCriterionErrorReason(_CONCRETE_TYPE_REQUIRED);
    public static final CampaignCriterionErrorReason INVALID_PLACEMENT_URL = new CampaignCriterionErrorReason(_INVALID_PLACEMENT_URL);
    public static final CampaignCriterionErrorReason CANNOT_EXCLUDE_CRITERIA_TYPE = new CampaignCriterionErrorReason(_CANNOT_EXCLUDE_CRITERIA_TYPE);
    public static final CampaignCriterionErrorReason CANNOT_SET_STATUS_FOR_CRITERIA_TYPE = new CampaignCriterionErrorReason(_CANNOT_SET_STATUS_FOR_CRITERIA_TYPE);
    public static final CampaignCriterionErrorReason CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA = new CampaignCriterionErrorReason(_CANNOT_SET_STATUS_FOR_EXCLUDED_CRITERIA);
    public static final CampaignCriterionErrorReason CANNOT_TARGET_AND_EXCLUDE = new CampaignCriterionErrorReason(_CANNOT_TARGET_AND_EXCLUDE);
    public static final CampaignCriterionErrorReason TOO_MANY_OPERATIONS = new CampaignCriterionErrorReason(_TOO_MANY_OPERATIONS);
    public static final CampaignCriterionErrorReason OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE = new CampaignCriterionErrorReason(_OPERATOR_NOT_SUPPORTED_FOR_CRITERION_TYPE);
    public static final CampaignCriterionErrorReason SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL = new CampaignCriterionErrorReason(_SHOPPING_CAMPAIGN_SALES_COUNTRY_NOT_SUPPORTED_FOR_SALES_CHANNEL);
    public static final CampaignCriterionErrorReason UNKNOWN = new CampaignCriterionErrorReason(_UNKNOWN);
    public static final CampaignCriterionErrorReason CANNOT_ADD_EXISTING_FIELD = new CampaignCriterionErrorReason(_CANNOT_ADD_EXISTING_FIELD);
    public java.lang.String getValue() { return _value_;}
    public static CampaignCriterionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignCriterionErrorReason enumeration = (CampaignCriterionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignCriterionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignCriterionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
