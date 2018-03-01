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
 * AdGroupAdErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class AdGroupAdErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdGroupAdErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_GROUP_AD_LABEL_DOES_NOT_EXIST = "AD_GROUP_AD_LABEL_DOES_NOT_EXIST";
    public static final java.lang.String _AD_GROUP_AD_LABEL_ALREADY_EXISTS = "AD_GROUP_AD_LABEL_ALREADY_EXISTS";
    public static final java.lang.String _AD_NOT_UNDER_ADGROUP = "AD_NOT_UNDER_ADGROUP";
    public static final java.lang.String _CANNOT_OPERATE_ON_REMOVED_ADGROUPAD = "CANNOT_OPERATE_ON_REMOVED_ADGROUPAD";
    public static final java.lang.String _CANNOT_CREATE_DEPRECATED_ADS = "CANNOT_CREATE_DEPRECATED_ADS";
    public static final java.lang.String _CANNOT_CREATE_TEXT_ADS = "CANNOT_CREATE_TEXT_ADS";
    public static final java.lang.String _EMPTY_FIELD = "EMPTY_FIELD";
    public static final java.lang.String _ENTITY_REFERENCED_IN_MULTIPLE_OPS = "ENTITY_REFERENCED_IN_MULTIPLE_OPS";
    public static final java.lang.String _UNSUPPORTED_OPERATION = "UNSUPPORTED_OPERATION";
    public static final AdGroupAdErrorReason AD_GROUP_AD_LABEL_DOES_NOT_EXIST = new AdGroupAdErrorReason(_AD_GROUP_AD_LABEL_DOES_NOT_EXIST);
    public static final AdGroupAdErrorReason AD_GROUP_AD_LABEL_ALREADY_EXISTS = new AdGroupAdErrorReason(_AD_GROUP_AD_LABEL_ALREADY_EXISTS);
    public static final AdGroupAdErrorReason AD_NOT_UNDER_ADGROUP = new AdGroupAdErrorReason(_AD_NOT_UNDER_ADGROUP);
    public static final AdGroupAdErrorReason CANNOT_OPERATE_ON_REMOVED_ADGROUPAD = new AdGroupAdErrorReason(_CANNOT_OPERATE_ON_REMOVED_ADGROUPAD);
    public static final AdGroupAdErrorReason CANNOT_CREATE_DEPRECATED_ADS = new AdGroupAdErrorReason(_CANNOT_CREATE_DEPRECATED_ADS);
    public static final AdGroupAdErrorReason CANNOT_CREATE_TEXT_ADS = new AdGroupAdErrorReason(_CANNOT_CREATE_TEXT_ADS);
    public static final AdGroupAdErrorReason EMPTY_FIELD = new AdGroupAdErrorReason(_EMPTY_FIELD);
    public static final AdGroupAdErrorReason ENTITY_REFERENCED_IN_MULTIPLE_OPS = new AdGroupAdErrorReason(_ENTITY_REFERENCED_IN_MULTIPLE_OPS);
    public static final AdGroupAdErrorReason UNSUPPORTED_OPERATION = new AdGroupAdErrorReason(_UNSUPPORTED_OPERATION);
    public java.lang.String getValue() { return _value_;}
    public static AdGroupAdErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdGroupAdErrorReason enumeration = (AdGroupAdErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdGroupAdErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdGroupAdErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
