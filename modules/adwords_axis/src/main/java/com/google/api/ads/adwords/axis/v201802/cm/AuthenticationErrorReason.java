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

package com.google.api.ads.adwords.axis.v201802.cm;

public class AuthenticationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuthenticationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUTHENTICATION_FAILED = "AUTHENTICATION_FAILED";
    public static final java.lang.String _CLIENT_CUSTOMER_ID_IS_REQUIRED = "CLIENT_CUSTOMER_ID_IS_REQUIRED";
    public static final java.lang.String _CLIENT_EMAIL_REQUIRED = "CLIENT_EMAIL_REQUIRED";
    public static final java.lang.String _CLIENT_CUSTOMER_ID_INVALID = "CLIENT_CUSTOMER_ID_INVALID";
    public static final java.lang.String _CLIENT_EMAIL_INVALID = "CLIENT_EMAIL_INVALID";
    public static final java.lang.String _CLIENT_EMAIL_FAILED_TO_AUTHENTICATE = "CLIENT_EMAIL_FAILED_TO_AUTHENTICATE";
    public static final java.lang.String _CUSTOMER_NOT_FOUND = "CUSTOMER_NOT_FOUND";
    public static final java.lang.String _GOOGLE_ACCOUNT_DELETED = "GOOGLE_ACCOUNT_DELETED";
    public static final java.lang.String _GOOGLE_ACCOUNT_COOKIE_INVALID = "GOOGLE_ACCOUNT_COOKIE_INVALID";
    public static final java.lang.String _FAILED_TO_AUTHENTICATE_GOOGLE_ACCOUNT = "FAILED_TO_AUTHENTICATE_GOOGLE_ACCOUNT";
    public static final java.lang.String _GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH = "GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH";
    public static final java.lang.String _LOGIN_COOKIE_REQUIRED = "LOGIN_COOKIE_REQUIRED";
    public static final java.lang.String _NOT_ADS_USER = "NOT_ADS_USER";
    public static final java.lang.String _OAUTH_TOKEN_INVALID = "OAUTH_TOKEN_INVALID";
    public static final java.lang.String _OAUTH_TOKEN_EXPIRED = "OAUTH_TOKEN_EXPIRED";
    public static final java.lang.String _OAUTH_TOKEN_DISABLED = "OAUTH_TOKEN_DISABLED";
    public static final java.lang.String _OAUTH_TOKEN_REVOKED = "OAUTH_TOKEN_REVOKED";
    public static final java.lang.String _OAUTH_TOKEN_HEADER_INVALID = "OAUTH_TOKEN_HEADER_INVALID";
    public static final java.lang.String _LOGIN_COOKIE_INVALID = "LOGIN_COOKIE_INVALID";
    public static final java.lang.String _FAILED_TO_RETRIEVE_LOGIN_COOKIE = "FAILED_TO_RETRIEVE_LOGIN_COOKIE";
    public static final java.lang.String _USER_ID_INVALID = "USER_ID_INVALID";
    public static final AuthenticationErrorReason AUTHENTICATION_FAILED = new AuthenticationErrorReason(_AUTHENTICATION_FAILED);
    public static final AuthenticationErrorReason CLIENT_CUSTOMER_ID_IS_REQUIRED = new AuthenticationErrorReason(_CLIENT_CUSTOMER_ID_IS_REQUIRED);
    public static final AuthenticationErrorReason CLIENT_EMAIL_REQUIRED = new AuthenticationErrorReason(_CLIENT_EMAIL_REQUIRED);
    public static final AuthenticationErrorReason CLIENT_CUSTOMER_ID_INVALID = new AuthenticationErrorReason(_CLIENT_CUSTOMER_ID_INVALID);
    public static final AuthenticationErrorReason CLIENT_EMAIL_INVALID = new AuthenticationErrorReason(_CLIENT_EMAIL_INVALID);
    public static final AuthenticationErrorReason CLIENT_EMAIL_FAILED_TO_AUTHENTICATE = new AuthenticationErrorReason(_CLIENT_EMAIL_FAILED_TO_AUTHENTICATE);
    public static final AuthenticationErrorReason CUSTOMER_NOT_FOUND = new AuthenticationErrorReason(_CUSTOMER_NOT_FOUND);
    public static final AuthenticationErrorReason GOOGLE_ACCOUNT_DELETED = new AuthenticationErrorReason(_GOOGLE_ACCOUNT_DELETED);
    public static final AuthenticationErrorReason GOOGLE_ACCOUNT_COOKIE_INVALID = new AuthenticationErrorReason(_GOOGLE_ACCOUNT_COOKIE_INVALID);
    public static final AuthenticationErrorReason FAILED_TO_AUTHENTICATE_GOOGLE_ACCOUNT = new AuthenticationErrorReason(_FAILED_TO_AUTHENTICATE_GOOGLE_ACCOUNT);
    public static final AuthenticationErrorReason GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH = new AuthenticationErrorReason(_GOOGLE_ACCOUNT_USER_AND_ADS_USER_MISMATCH);
    public static final AuthenticationErrorReason LOGIN_COOKIE_REQUIRED = new AuthenticationErrorReason(_LOGIN_COOKIE_REQUIRED);
    public static final AuthenticationErrorReason NOT_ADS_USER = new AuthenticationErrorReason(_NOT_ADS_USER);
    public static final AuthenticationErrorReason OAUTH_TOKEN_INVALID = new AuthenticationErrorReason(_OAUTH_TOKEN_INVALID);
    public static final AuthenticationErrorReason OAUTH_TOKEN_EXPIRED = new AuthenticationErrorReason(_OAUTH_TOKEN_EXPIRED);
    public static final AuthenticationErrorReason OAUTH_TOKEN_DISABLED = new AuthenticationErrorReason(_OAUTH_TOKEN_DISABLED);
    public static final AuthenticationErrorReason OAUTH_TOKEN_REVOKED = new AuthenticationErrorReason(_OAUTH_TOKEN_REVOKED);
    public static final AuthenticationErrorReason OAUTH_TOKEN_HEADER_INVALID = new AuthenticationErrorReason(_OAUTH_TOKEN_HEADER_INVALID);
    public static final AuthenticationErrorReason LOGIN_COOKIE_INVALID = new AuthenticationErrorReason(_LOGIN_COOKIE_INVALID);
    public static final AuthenticationErrorReason FAILED_TO_RETRIEVE_LOGIN_COOKIE = new AuthenticationErrorReason(_FAILED_TO_RETRIEVE_LOGIN_COOKIE);
    public static final AuthenticationErrorReason USER_ID_INVALID = new AuthenticationErrorReason(_USER_ID_INVALID);
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AuthenticationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
