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
 * AdParamErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class AdParamErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdParamErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_PARAM_CANNOT_BE_SPECIFIED_MULTIPLE_TIMES = "AD_PARAM_CANNOT_BE_SPECIFIED_MULTIPLE_TIMES";
    public static final java.lang.String _AD_PARAM_DOES_NOT_EXIST = "AD_PARAM_DOES_NOT_EXIST";
    public static final java.lang.String _CRITERION_SPECIFIED_MUST_BE_KEYWORD = "CRITERION_SPECIFIED_MUST_BE_KEYWORD";
    public static final java.lang.String _INVALID_ADGROUP_CRITERION_SPECIFIED = "INVALID_ADGROUP_CRITERION_SPECIFIED";
    public static final java.lang.String _INVALID_INSERTION_TEXT_FORMAT = "INVALID_INSERTION_TEXT_FORMAT";
    public static final java.lang.String _MUST_SPECIFY_ADGROUP_ID = "MUST_SPECIFY_ADGROUP_ID";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdParamErrorReason AD_PARAM_CANNOT_BE_SPECIFIED_MULTIPLE_TIMES = new AdParamErrorReason(_AD_PARAM_CANNOT_BE_SPECIFIED_MULTIPLE_TIMES);
    public static final AdParamErrorReason AD_PARAM_DOES_NOT_EXIST = new AdParamErrorReason(_AD_PARAM_DOES_NOT_EXIST);
    public static final AdParamErrorReason CRITERION_SPECIFIED_MUST_BE_KEYWORD = new AdParamErrorReason(_CRITERION_SPECIFIED_MUST_BE_KEYWORD);
    public static final AdParamErrorReason INVALID_ADGROUP_CRITERION_SPECIFIED = new AdParamErrorReason(_INVALID_ADGROUP_CRITERION_SPECIFIED);
    public static final AdParamErrorReason INVALID_INSERTION_TEXT_FORMAT = new AdParamErrorReason(_INVALID_INSERTION_TEXT_FORMAT);
    public static final AdParamErrorReason MUST_SPECIFY_ADGROUP_ID = new AdParamErrorReason(_MUST_SPECIFY_ADGROUP_ID);
    public static final AdParamErrorReason UNKNOWN = new AdParamErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdParamErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdParamErrorReason enumeration = (AdParamErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdParamErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdParamErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdParamError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
