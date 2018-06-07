// Copyright 2018 Google LLC
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
 * CustomAffinityErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.rm;

public class CustomAffinityErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomAffinityErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NAME_ALREADY_USED = "NAME_ALREADY_USED";
    public static final java.lang.String _CUSTOM_AFFINITY_TOKEN_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE = "CUSTOM_AFFINITY_TOKEN_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE";
    public static final java.lang.String _TYPE_AND_PARAMETER_NOT_FOUND = "TYPE_AND_PARAMETER_NOT_FOUND";
    public static final java.lang.String _TYPE_AND_PARAMETER_ALREADY_EXISTED = "TYPE_AND_PARAMETER_ALREADY_EXISTED";
    public static final java.lang.String _INVALID_CUSTOM_AFFINITY_TOKEN_TYPE = "INVALID_CUSTOM_AFFINITY_TOKEN_TYPE";
    public static final java.lang.String _CANNOT_REMOVE_WHILE_IN_USE = "CANNOT_REMOVE_WHILE_IN_USE";
    public static final java.lang.String _FIELD_MUTATE_OPERATOR_FOR_TOKENS_IS_NOT_SUPPORTED = "FIELD_MUTATE_OPERATOR_FOR_TOKENS_IS_NOT_SUPPORTED";
    public static final java.lang.String _READ_ONLY_ENTITY = "READ_ONLY_ENTITY";
    public static final java.lang.String _CANNOT_CHANGE_TYPE = "CANNOT_CHANGE_TYPE";
    public static final java.lang.String _CUSTOM_AFFINITY_SERVICE_ERROR = "CUSTOM_AFFINITY_SERVICE_ERROR";
    public static final CustomAffinityErrorReason NAME_ALREADY_USED = new CustomAffinityErrorReason(_NAME_ALREADY_USED);
    public static final CustomAffinityErrorReason CUSTOM_AFFINITY_TOKEN_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE = new CustomAffinityErrorReason(_CUSTOM_AFFINITY_TOKEN_ID_AND_TYPE_PARAMETER_NOT_PRESENT_IN_REMOVE);
    public static final CustomAffinityErrorReason TYPE_AND_PARAMETER_NOT_FOUND = new CustomAffinityErrorReason(_TYPE_AND_PARAMETER_NOT_FOUND);
    public static final CustomAffinityErrorReason TYPE_AND_PARAMETER_ALREADY_EXISTED = new CustomAffinityErrorReason(_TYPE_AND_PARAMETER_ALREADY_EXISTED);
    public static final CustomAffinityErrorReason INVALID_CUSTOM_AFFINITY_TOKEN_TYPE = new CustomAffinityErrorReason(_INVALID_CUSTOM_AFFINITY_TOKEN_TYPE);
    public static final CustomAffinityErrorReason CANNOT_REMOVE_WHILE_IN_USE = new CustomAffinityErrorReason(_CANNOT_REMOVE_WHILE_IN_USE);
    public static final CustomAffinityErrorReason FIELD_MUTATE_OPERATOR_FOR_TOKENS_IS_NOT_SUPPORTED = new CustomAffinityErrorReason(_FIELD_MUTATE_OPERATOR_FOR_TOKENS_IS_NOT_SUPPORTED);
    public static final CustomAffinityErrorReason READ_ONLY_ENTITY = new CustomAffinityErrorReason(_READ_ONLY_ENTITY);
    public static final CustomAffinityErrorReason CANNOT_CHANGE_TYPE = new CustomAffinityErrorReason(_CANNOT_CHANGE_TYPE);
    public static final CustomAffinityErrorReason CUSTOM_AFFINITY_SERVICE_ERROR = new CustomAffinityErrorReason(_CUSTOM_AFFINITY_SERVICE_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static CustomAffinityErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomAffinityErrorReason enumeration = (CustomAffinityErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomAffinityErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomAffinityErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201806", "CustomAffinityError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
