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
 * AdSenseAccountErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class AdSenseAccountErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdSenseAccountErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ASSOCIATE_ACCOUNT_API_ERROR = "ASSOCIATE_ACCOUNT_API_ERROR";
    public static final java.lang.String _GET_AD_SLOT_API_ERROR = "GET_AD_SLOT_API_ERROR";
    public static final java.lang.String _GET_CHANNEL_API_ERROR = "GET_CHANNEL_API_ERROR";
    public static final java.lang.String _GET_BULK_ACCOUNT_STATUSES_API_ERROR = "GET_BULK_ACCOUNT_STATUSES_API_ERROR";
    public static final java.lang.String _RESEND_VERIFICATION_EMAIL_ERROR = "RESEND_VERIFICATION_EMAIL_ERROR";
    public static final java.lang.String _UNEXPECTED_API_RESPONSE_ERROR = "UNEXPECTED_API_RESPONSE_ERROR";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdSenseAccountErrorReason ASSOCIATE_ACCOUNT_API_ERROR = new AdSenseAccountErrorReason(_ASSOCIATE_ACCOUNT_API_ERROR);
    public static final AdSenseAccountErrorReason GET_AD_SLOT_API_ERROR = new AdSenseAccountErrorReason(_GET_AD_SLOT_API_ERROR);
    public static final AdSenseAccountErrorReason GET_CHANNEL_API_ERROR = new AdSenseAccountErrorReason(_GET_CHANNEL_API_ERROR);
    public static final AdSenseAccountErrorReason GET_BULK_ACCOUNT_STATUSES_API_ERROR = new AdSenseAccountErrorReason(_GET_BULK_ACCOUNT_STATUSES_API_ERROR);
    public static final AdSenseAccountErrorReason RESEND_VERIFICATION_EMAIL_ERROR = new AdSenseAccountErrorReason(_RESEND_VERIFICATION_EMAIL_ERROR);
    public static final AdSenseAccountErrorReason UNEXPECTED_API_RESPONSE_ERROR = new AdSenseAccountErrorReason(_UNEXPECTED_API_RESPONSE_ERROR);
    public static final AdSenseAccountErrorReason UNKNOWN = new AdSenseAccountErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdSenseAccountErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdSenseAccountErrorReason enumeration = (AdSenseAccountErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdSenseAccountErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdSenseAccountErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdSenseAccountError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
