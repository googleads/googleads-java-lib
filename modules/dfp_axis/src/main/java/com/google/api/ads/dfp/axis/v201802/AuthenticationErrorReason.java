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
 * AuthenticationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class AuthenticationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuthenticationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AMBIGUOUS_SOAP_REQUEST_HEADER = "AMBIGUOUS_SOAP_REQUEST_HEADER";
    public static final java.lang.String _INVALID_EMAIL = "INVALID_EMAIL";
    public static final java.lang.String _AUTHENTICATION_FAILED = "AUTHENTICATION_FAILED";
    public static final java.lang.String _INVALID_OAUTH_SIGNATURE = "INVALID_OAUTH_SIGNATURE";
    public static final java.lang.String _INVALID_SERVICE = "INVALID_SERVICE";
    public static final java.lang.String _MISSING_SOAP_REQUEST_HEADER = "MISSING_SOAP_REQUEST_HEADER";
    public static final java.lang.String _MISSING_AUTHENTICATION_HTTP_HEADER = "MISSING_AUTHENTICATION_HTTP_HEADER";
    public static final java.lang.String _MISSING_AUTHENTICATION = "MISSING_AUTHENTICATION";
    public static final java.lang.String _NOT_WHITELISTED_FOR_API_ACCESS = "NOT_WHITELISTED_FOR_API_ACCESS";
    public static final java.lang.String _NO_NETWORKS_TO_ACCESS = "NO_NETWORKS_TO_ACCESS";
    public static final java.lang.String _NETWORK_NOT_FOUND = "NETWORK_NOT_FOUND";
    public static final java.lang.String _NETWORK_CODE_REQUIRED = "NETWORK_CODE_REQUIRED";
    public static final java.lang.String _CONNECTION_ERROR = "CONNECTION_ERROR";
    public static final java.lang.String _GOOGLE_ACCOUNT_ALREADY_ASSOCIATED_WITH_NETWORK = "GOOGLE_ACCOUNT_ALREADY_ASSOCIATED_WITH_NETWORK";
    public static final java.lang.String _UNDER_INVESTIGATION = "UNDER_INVESTIGATION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AuthenticationErrorReason AMBIGUOUS_SOAP_REQUEST_HEADER = new AuthenticationErrorReason(_AMBIGUOUS_SOAP_REQUEST_HEADER);
    public static final AuthenticationErrorReason INVALID_EMAIL = new AuthenticationErrorReason(_INVALID_EMAIL);
    public static final AuthenticationErrorReason AUTHENTICATION_FAILED = new AuthenticationErrorReason(_AUTHENTICATION_FAILED);
    public static final AuthenticationErrorReason INVALID_OAUTH_SIGNATURE = new AuthenticationErrorReason(_INVALID_OAUTH_SIGNATURE);
    public static final AuthenticationErrorReason INVALID_SERVICE = new AuthenticationErrorReason(_INVALID_SERVICE);
    public static final AuthenticationErrorReason MISSING_SOAP_REQUEST_HEADER = new AuthenticationErrorReason(_MISSING_SOAP_REQUEST_HEADER);
    public static final AuthenticationErrorReason MISSING_AUTHENTICATION_HTTP_HEADER = new AuthenticationErrorReason(_MISSING_AUTHENTICATION_HTTP_HEADER);
    public static final AuthenticationErrorReason MISSING_AUTHENTICATION = new AuthenticationErrorReason(_MISSING_AUTHENTICATION);
    public static final AuthenticationErrorReason NOT_WHITELISTED_FOR_API_ACCESS = new AuthenticationErrorReason(_NOT_WHITELISTED_FOR_API_ACCESS);
    public static final AuthenticationErrorReason NO_NETWORKS_TO_ACCESS = new AuthenticationErrorReason(_NO_NETWORKS_TO_ACCESS);
    public static final AuthenticationErrorReason NETWORK_NOT_FOUND = new AuthenticationErrorReason(_NETWORK_NOT_FOUND);
    public static final AuthenticationErrorReason NETWORK_CODE_REQUIRED = new AuthenticationErrorReason(_NETWORK_CODE_REQUIRED);
    public static final AuthenticationErrorReason CONNECTION_ERROR = new AuthenticationErrorReason(_CONNECTION_ERROR);
    public static final AuthenticationErrorReason GOOGLE_ACCOUNT_ALREADY_ASSOCIATED_WITH_NETWORK = new AuthenticationErrorReason(_GOOGLE_ACCOUNT_ALREADY_ASSOCIATED_WITH_NETWORK);
    public static final AuthenticationErrorReason UNDER_INVESTIGATION = new AuthenticationErrorReason(_UNDER_INVESTIGATION);
    public static final AuthenticationErrorReason UNKNOWN = new AuthenticationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AuthenticationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuthenticationErrorReason enumeration = (AuthenticationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuthenticationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AuthenticationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AuthenticationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
