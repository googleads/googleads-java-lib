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
 * UrlErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class UrlErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UrlErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_TRACKING_URL_TEMPLATE = "INVALID_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _INVALID_TAG_IN_TRACKING_URL_TEMPLATE = "INVALID_TAG_IN_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _MISSING_TRACKING_URL_TEMPLATE_TAG = "MISSING_TRACKING_URL_TEMPLATE_TAG";
    public static final java.lang.String _MISSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE = "MISSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _INVALID_PROTOCOL_IN_TRACKING_URL_TEMPLATE = "INVALID_PROTOCOL_IN_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _MALFORMED_TRACKING_URL_TEMPLATE = "MALFORMED_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _MISSING_HOST_IN_TRACKING_URL_TEMPLATE = "MISSING_HOST_IN_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _INVALID_TLD_IN_TRACKING_URL_TEMPLATE = "INVALID_TLD_IN_TRACKING_URL_TEMPLATE";
    public static final java.lang.String _REDUNDANT_NESTED_TRACKING_URL_TEMPLATE_TAG = "REDUNDANT_NESTED_TRACKING_URL_TEMPLATE_TAG";
    public static final java.lang.String _INVALID_FINAL_URL = "INVALID_FINAL_URL";
    public static final java.lang.String _INVALID_TAG_IN_FINAL_URL = "INVALID_TAG_IN_FINAL_URL";
    public static final java.lang.String _REDUNDANT_NESTED_FINAL_URL_TAG = "REDUNDANT_NESTED_FINAL_URL_TAG";
    public static final java.lang.String _MISSING_PROTOCOL_IN_FINAL_URL = "MISSING_PROTOCOL_IN_FINAL_URL";
    public static final java.lang.String _INVALID_PROTOCOL_IN_FINAL_URL = "INVALID_PROTOCOL_IN_FINAL_URL";
    public static final java.lang.String _MALFORMED_FINAL_URL = "MALFORMED_FINAL_URL";
    public static final java.lang.String _MISSING_HOST_IN_FINAL_URL = "MISSING_HOST_IN_FINAL_URL";
    public static final java.lang.String _INVALID_TLD_IN_FINAL_URL = "INVALID_TLD_IN_FINAL_URL";
    public static final java.lang.String _INVALID_FINAL_MOBILE_URL = "INVALID_FINAL_MOBILE_URL";
    public static final java.lang.String _INVALID_TAG_IN_FINAL_MOBILE_URL = "INVALID_TAG_IN_FINAL_MOBILE_URL";
    public static final java.lang.String _REDUNDANT_NESTED_FINAL_MOBILE_URL_TAG = "REDUNDANT_NESTED_FINAL_MOBILE_URL_TAG";
    public static final java.lang.String _MISSING_PROTOCOL_IN_FINAL_MOBILE_URL = "MISSING_PROTOCOL_IN_FINAL_MOBILE_URL";
    public static final java.lang.String _INVALID_PROTOCOL_IN_FINAL_MOBILE_URL = "INVALID_PROTOCOL_IN_FINAL_MOBILE_URL";
    public static final java.lang.String _MALFORMED_FINAL_MOBILE_URL = "MALFORMED_FINAL_MOBILE_URL";
    public static final java.lang.String _MISSING_HOST_IN_FINAL_MOBILE_URL = "MISSING_HOST_IN_FINAL_MOBILE_URL";
    public static final java.lang.String _INVALID_TLD_IN_FINAL_MOBILE_URL = "INVALID_TLD_IN_FINAL_MOBILE_URL";
    public static final java.lang.String _INVALID_FINAL_APP_URL = "INVALID_FINAL_APP_URL";
    public static final java.lang.String _INVALID_TAG_IN_FINAL_APP_URL = "INVALID_TAG_IN_FINAL_APP_URL";
    public static final java.lang.String _REDUNDANT_NESTED_FINAL_APP_URL_TAG = "REDUNDANT_NESTED_FINAL_APP_URL_TAG";
    public static final java.lang.String _MULTIPLE_APP_URLS_FOR_OSTYPE = "MULTIPLE_APP_URLS_FOR_OSTYPE";
    public static final java.lang.String _INVALID_OSTYPE = "INVALID_OSTYPE";
    public static final java.lang.String _INVALID_PROTOCOL_FOR_APP_URL = "INVALID_PROTOCOL_FOR_APP_URL";
    public static final java.lang.String _INVALID_PACKAGE_ID_FOR_APP_URL = "INVALID_PACKAGE_ID_FOR_APP_URL";
    public static final java.lang.String _URL_CUSTOM_PARAMETERS_COUNT_EXCEEDS_LIMIT = "URL_CUSTOM_PARAMETERS_COUNT_EXCEEDS_LIMIT";
    public static final java.lang.String _URL_CUSTOM_PARAMETER_REMOVAL_WITH_NON_NULL_VALUE = "URL_CUSTOM_PARAMETER_REMOVAL_WITH_NON_NULL_VALUE";
    public static final java.lang.String _CANNOT_REMOVE_URL_CUSTOM_PARAMETER_IN_ADD_OPERATION = "CANNOT_REMOVE_URL_CUSTOM_PARAMETER_IN_ADD_OPERATION";
    public static final java.lang.String _CANNOT_REMOVE_URL_CUSTOM_PARAMETER_DURING_FULL_REPLACEMENT = "CANNOT_REMOVE_URL_CUSTOM_PARAMETER_DURING_FULL_REPLACEMENT";
    public static final java.lang.String _NULL_CUSTOM_PARAMETER_VALUE_DURING_ADD_OR_FULL_REPLACEMENT = "NULL_CUSTOM_PARAMETER_VALUE_DURING_ADD_OR_FULL_REPLACEMENT";
    public static final java.lang.String _INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_KEY = "INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_KEY";
    public static final java.lang.String _INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_VALUE = "INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_VALUE";
    public static final java.lang.String _INVALID_TAG_IN_URL_CUSTOM_PARAMETER_VALUE = "INVALID_TAG_IN_URL_CUSTOM_PARAMETER_VALUE";
    public static final java.lang.String _REDUNDANT_NESTED_URL_CUSTOM_PARAMETER_TAG = "REDUNDANT_NESTED_URL_CUSTOM_PARAMETER_TAG";
    public static final java.lang.String _MISSING_PROTOCOL = "MISSING_PROTOCOL";
    public static final java.lang.String _INVALID_URL = "INVALID_URL";
    public static final java.lang.String _DESTINATION_URL_DEPRECATED = "DESTINATION_URL_DEPRECATED";
    public static final java.lang.String _INVALID_TAG_IN_URL = "INVALID_TAG_IN_URL";
    public static final java.lang.String _MISSING_URL_TAG = "MISSING_URL_TAG";
    public static final java.lang.String _DUPLICATE_URL_ID = "DUPLICATE_URL_ID";
    public static final java.lang.String _INVALID_URL_ID = "INVALID_URL_ID";
    public static final java.lang.String _URL_ERROR = "URL_ERROR";
    public static final UrlErrorReason INVALID_TRACKING_URL_TEMPLATE = new UrlErrorReason(_INVALID_TRACKING_URL_TEMPLATE);
    public static final UrlErrorReason INVALID_TAG_IN_TRACKING_URL_TEMPLATE = new UrlErrorReason(_INVALID_TAG_IN_TRACKING_URL_TEMPLATE);
    public static final UrlErrorReason MISSING_TRACKING_URL_TEMPLATE_TAG = new UrlErrorReason(_MISSING_TRACKING_URL_TEMPLATE_TAG);
    public static final UrlErrorReason MISSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE = new UrlErrorReason(_MISSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE);
    public static final UrlErrorReason INVALID_PROTOCOL_IN_TRACKING_URL_TEMPLATE = new UrlErrorReason(_INVALID_PROTOCOL_IN_TRACKING_URL_TEMPLATE);
    public static final UrlErrorReason MALFORMED_TRACKING_URL_TEMPLATE = new UrlErrorReason(_MALFORMED_TRACKING_URL_TEMPLATE);
    public static final UrlErrorReason MISSING_HOST_IN_TRACKING_URL_TEMPLATE = new UrlErrorReason(_MISSING_HOST_IN_TRACKING_URL_TEMPLATE);
    public static final UrlErrorReason INVALID_TLD_IN_TRACKING_URL_TEMPLATE = new UrlErrorReason(_INVALID_TLD_IN_TRACKING_URL_TEMPLATE);
    public static final UrlErrorReason REDUNDANT_NESTED_TRACKING_URL_TEMPLATE_TAG = new UrlErrorReason(_REDUNDANT_NESTED_TRACKING_URL_TEMPLATE_TAG);
    public static final UrlErrorReason INVALID_FINAL_URL = new UrlErrorReason(_INVALID_FINAL_URL);
    public static final UrlErrorReason INVALID_TAG_IN_FINAL_URL = new UrlErrorReason(_INVALID_TAG_IN_FINAL_URL);
    public static final UrlErrorReason REDUNDANT_NESTED_FINAL_URL_TAG = new UrlErrorReason(_REDUNDANT_NESTED_FINAL_URL_TAG);
    public static final UrlErrorReason MISSING_PROTOCOL_IN_FINAL_URL = new UrlErrorReason(_MISSING_PROTOCOL_IN_FINAL_URL);
    public static final UrlErrorReason INVALID_PROTOCOL_IN_FINAL_URL = new UrlErrorReason(_INVALID_PROTOCOL_IN_FINAL_URL);
    public static final UrlErrorReason MALFORMED_FINAL_URL = new UrlErrorReason(_MALFORMED_FINAL_URL);
    public static final UrlErrorReason MISSING_HOST_IN_FINAL_URL = new UrlErrorReason(_MISSING_HOST_IN_FINAL_URL);
    public static final UrlErrorReason INVALID_TLD_IN_FINAL_URL = new UrlErrorReason(_INVALID_TLD_IN_FINAL_URL);
    public static final UrlErrorReason INVALID_FINAL_MOBILE_URL = new UrlErrorReason(_INVALID_FINAL_MOBILE_URL);
    public static final UrlErrorReason INVALID_TAG_IN_FINAL_MOBILE_URL = new UrlErrorReason(_INVALID_TAG_IN_FINAL_MOBILE_URL);
    public static final UrlErrorReason REDUNDANT_NESTED_FINAL_MOBILE_URL_TAG = new UrlErrorReason(_REDUNDANT_NESTED_FINAL_MOBILE_URL_TAG);
    public static final UrlErrorReason MISSING_PROTOCOL_IN_FINAL_MOBILE_URL = new UrlErrorReason(_MISSING_PROTOCOL_IN_FINAL_MOBILE_URL);
    public static final UrlErrorReason INVALID_PROTOCOL_IN_FINAL_MOBILE_URL = new UrlErrorReason(_INVALID_PROTOCOL_IN_FINAL_MOBILE_URL);
    public static final UrlErrorReason MALFORMED_FINAL_MOBILE_URL = new UrlErrorReason(_MALFORMED_FINAL_MOBILE_URL);
    public static final UrlErrorReason MISSING_HOST_IN_FINAL_MOBILE_URL = new UrlErrorReason(_MISSING_HOST_IN_FINAL_MOBILE_URL);
    public static final UrlErrorReason INVALID_TLD_IN_FINAL_MOBILE_URL = new UrlErrorReason(_INVALID_TLD_IN_FINAL_MOBILE_URL);
    public static final UrlErrorReason INVALID_FINAL_APP_URL = new UrlErrorReason(_INVALID_FINAL_APP_URL);
    public static final UrlErrorReason INVALID_TAG_IN_FINAL_APP_URL = new UrlErrorReason(_INVALID_TAG_IN_FINAL_APP_URL);
    public static final UrlErrorReason REDUNDANT_NESTED_FINAL_APP_URL_TAG = new UrlErrorReason(_REDUNDANT_NESTED_FINAL_APP_URL_TAG);
    public static final UrlErrorReason MULTIPLE_APP_URLS_FOR_OSTYPE = new UrlErrorReason(_MULTIPLE_APP_URLS_FOR_OSTYPE);
    public static final UrlErrorReason INVALID_OSTYPE = new UrlErrorReason(_INVALID_OSTYPE);
    public static final UrlErrorReason INVALID_PROTOCOL_FOR_APP_URL = new UrlErrorReason(_INVALID_PROTOCOL_FOR_APP_URL);
    public static final UrlErrorReason INVALID_PACKAGE_ID_FOR_APP_URL = new UrlErrorReason(_INVALID_PACKAGE_ID_FOR_APP_URL);
    public static final UrlErrorReason URL_CUSTOM_PARAMETERS_COUNT_EXCEEDS_LIMIT = new UrlErrorReason(_URL_CUSTOM_PARAMETERS_COUNT_EXCEEDS_LIMIT);
    public static final UrlErrorReason URL_CUSTOM_PARAMETER_REMOVAL_WITH_NON_NULL_VALUE = new UrlErrorReason(_URL_CUSTOM_PARAMETER_REMOVAL_WITH_NON_NULL_VALUE);
    public static final UrlErrorReason CANNOT_REMOVE_URL_CUSTOM_PARAMETER_IN_ADD_OPERATION = new UrlErrorReason(_CANNOT_REMOVE_URL_CUSTOM_PARAMETER_IN_ADD_OPERATION);
    public static final UrlErrorReason CANNOT_REMOVE_URL_CUSTOM_PARAMETER_DURING_FULL_REPLACEMENT = new UrlErrorReason(_CANNOT_REMOVE_URL_CUSTOM_PARAMETER_DURING_FULL_REPLACEMENT);
    public static final UrlErrorReason NULL_CUSTOM_PARAMETER_VALUE_DURING_ADD_OR_FULL_REPLACEMENT = new UrlErrorReason(_NULL_CUSTOM_PARAMETER_VALUE_DURING_ADD_OR_FULL_REPLACEMENT);
    public static final UrlErrorReason INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_KEY = new UrlErrorReason(_INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_KEY);
    public static final UrlErrorReason INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_VALUE = new UrlErrorReason(_INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_VALUE);
    public static final UrlErrorReason INVALID_TAG_IN_URL_CUSTOM_PARAMETER_VALUE = new UrlErrorReason(_INVALID_TAG_IN_URL_CUSTOM_PARAMETER_VALUE);
    public static final UrlErrorReason REDUNDANT_NESTED_URL_CUSTOM_PARAMETER_TAG = new UrlErrorReason(_REDUNDANT_NESTED_URL_CUSTOM_PARAMETER_TAG);
    public static final UrlErrorReason MISSING_PROTOCOL = new UrlErrorReason(_MISSING_PROTOCOL);
    public static final UrlErrorReason INVALID_URL = new UrlErrorReason(_INVALID_URL);
    public static final UrlErrorReason DESTINATION_URL_DEPRECATED = new UrlErrorReason(_DESTINATION_URL_DEPRECATED);
    public static final UrlErrorReason INVALID_TAG_IN_URL = new UrlErrorReason(_INVALID_TAG_IN_URL);
    public static final UrlErrorReason MISSING_URL_TAG = new UrlErrorReason(_MISSING_URL_TAG);
    public static final UrlErrorReason DUPLICATE_URL_ID = new UrlErrorReason(_DUPLICATE_URL_ID);
    public static final UrlErrorReason INVALID_URL_ID = new UrlErrorReason(_INVALID_URL_ID);
    public static final UrlErrorReason URL_ERROR = new UrlErrorReason(_URL_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static UrlErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UrlErrorReason enumeration = (UrlErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UrlErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UrlErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
