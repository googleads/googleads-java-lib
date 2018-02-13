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
 * AdExclusionRuleErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class AdExclusionRuleErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdExclusionRuleErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BLOCK_ALL_RULE_CANNOT_INCLUDE_ROOT_AD_UNIT = "BLOCK_ALL_RULE_CANNOT_INCLUDE_ROOT_AD_UNIT";
    public static final java.lang.String _BLOCK_ALL_RULE_CANNOT_HAVE_BLOCKED_LABELS = "BLOCK_ALL_RULE_CANNOT_HAVE_BLOCKED_LABELS";
    public static final java.lang.String _BLOCK_ALL_RULE_MUST_CONTAIN_ALLOWED_LABELS = "BLOCK_ALL_RULE_MUST_CONTAIN_ALLOWED_LABELS";
    public static final java.lang.String _RULE_MUST_CONTAIN_BLOCKING = "RULE_MUST_CONTAIN_BLOCKING";
    public static final java.lang.String _BLOCKED_LABEL_ALSO_ALLOWED = "BLOCKED_LABEL_ALSO_ALLOWED";
    public static final java.lang.String _LABELS_MUST_BE_AD_EXCLUSION_TYPE = "LABELS_MUST_BE_AD_EXCLUSION_TYPE";
    public static final java.lang.String _EXCLUDED_AD_UNIT_ALSO_INCLUDED = "EXCLUDED_AD_UNIT_ALSO_INCLUDED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdExclusionRuleErrorReason BLOCK_ALL_RULE_CANNOT_INCLUDE_ROOT_AD_UNIT = new AdExclusionRuleErrorReason(_BLOCK_ALL_RULE_CANNOT_INCLUDE_ROOT_AD_UNIT);
    public static final AdExclusionRuleErrorReason BLOCK_ALL_RULE_CANNOT_HAVE_BLOCKED_LABELS = new AdExclusionRuleErrorReason(_BLOCK_ALL_RULE_CANNOT_HAVE_BLOCKED_LABELS);
    public static final AdExclusionRuleErrorReason BLOCK_ALL_RULE_MUST_CONTAIN_ALLOWED_LABELS = new AdExclusionRuleErrorReason(_BLOCK_ALL_RULE_MUST_CONTAIN_ALLOWED_LABELS);
    public static final AdExclusionRuleErrorReason RULE_MUST_CONTAIN_BLOCKING = new AdExclusionRuleErrorReason(_RULE_MUST_CONTAIN_BLOCKING);
    public static final AdExclusionRuleErrorReason BLOCKED_LABEL_ALSO_ALLOWED = new AdExclusionRuleErrorReason(_BLOCKED_LABEL_ALSO_ALLOWED);
    public static final AdExclusionRuleErrorReason LABELS_MUST_BE_AD_EXCLUSION_TYPE = new AdExclusionRuleErrorReason(_LABELS_MUST_BE_AD_EXCLUSION_TYPE);
    public static final AdExclusionRuleErrorReason EXCLUDED_AD_UNIT_ALSO_INCLUDED = new AdExclusionRuleErrorReason(_EXCLUDED_AD_UNIT_ALSO_INCLUDED);
    public static final AdExclusionRuleErrorReason UNKNOWN = new AdExclusionRuleErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdExclusionRuleErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdExclusionRuleErrorReason enumeration = (AdExclusionRuleErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdExclusionRuleErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdExclusionRuleErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdExclusionRuleError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
