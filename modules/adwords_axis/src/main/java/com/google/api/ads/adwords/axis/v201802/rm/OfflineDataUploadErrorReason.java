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
 * OfflineDataUploadErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;

public class OfflineDataUploadErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OfflineDataUploadErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _INCOMPATIBLE_USERIDENTIFIER_TYPE = "INCOMPATIBLE_USERIDENTIFIER_TYPE";
    public static final java.lang.String _INVALID_UPLOAD_TYPE = "INVALID_UPLOAD_TYPE";
    public static final java.lang.String _MISSING_UPLOAD_METADATA = "MISSING_UPLOAD_METADATA";
    public static final java.lang.String _INVALID_UPLOAD_METADATA = "INVALID_UPLOAD_METADATA";
    public static final java.lang.String _INVALID_PARTNER_ID = "INVALID_PARTNER_ID";
    public static final java.lang.String _MISSING_TRANSACTION_INFO = "MISSING_TRANSACTION_INFO";
    public static final java.lang.String _INVALID_CONVERSION_TYPE = "INVALID_CONVERSION_TYPE";
    public static final java.lang.String _FUTURE_TRANSACTION_TIME = "FUTURE_TRANSACTION_TIME";
    public static final java.lang.String _NEGATIVE_TRANSACTION_AMOUNT = "NEGATIVE_TRANSACTION_AMOUNT";
    public static final java.lang.String _COUNTRY_CODE_HASHED = "COUNTRY_CODE_HASHED";
    public static final java.lang.String _ZIPCODE_HASHED = "ZIPCODE_HASHED";
    public static final java.lang.String _EMAIL_NOT_HASHED = "EMAIL_NOT_HASHED";
    public static final java.lang.String _FIRST_NAME_NOT_HASHED = "FIRST_NAME_NOT_HASHED";
    public static final java.lang.String _LAST_NAME_NOT_HASHED = "LAST_NAME_NOT_HASHED";
    public static final java.lang.String _PHONE_NOT_HASHED = "PHONE_NOT_HASHED";
    public static final OfflineDataUploadErrorReason UNKNOWN = new OfflineDataUploadErrorReason(_UNKNOWN);
    public static final OfflineDataUploadErrorReason INCOMPATIBLE_USERIDENTIFIER_TYPE = new OfflineDataUploadErrorReason(_INCOMPATIBLE_USERIDENTIFIER_TYPE);
    public static final OfflineDataUploadErrorReason INVALID_UPLOAD_TYPE = new OfflineDataUploadErrorReason(_INVALID_UPLOAD_TYPE);
    public static final OfflineDataUploadErrorReason MISSING_UPLOAD_METADATA = new OfflineDataUploadErrorReason(_MISSING_UPLOAD_METADATA);
    public static final OfflineDataUploadErrorReason INVALID_UPLOAD_METADATA = new OfflineDataUploadErrorReason(_INVALID_UPLOAD_METADATA);
    public static final OfflineDataUploadErrorReason INVALID_PARTNER_ID = new OfflineDataUploadErrorReason(_INVALID_PARTNER_ID);
    public static final OfflineDataUploadErrorReason MISSING_TRANSACTION_INFO = new OfflineDataUploadErrorReason(_MISSING_TRANSACTION_INFO);
    public static final OfflineDataUploadErrorReason INVALID_CONVERSION_TYPE = new OfflineDataUploadErrorReason(_INVALID_CONVERSION_TYPE);
    public static final OfflineDataUploadErrorReason FUTURE_TRANSACTION_TIME = new OfflineDataUploadErrorReason(_FUTURE_TRANSACTION_TIME);
    public static final OfflineDataUploadErrorReason NEGATIVE_TRANSACTION_AMOUNT = new OfflineDataUploadErrorReason(_NEGATIVE_TRANSACTION_AMOUNT);
    public static final OfflineDataUploadErrorReason COUNTRY_CODE_HASHED = new OfflineDataUploadErrorReason(_COUNTRY_CODE_HASHED);
    public static final OfflineDataUploadErrorReason ZIPCODE_HASHED = new OfflineDataUploadErrorReason(_ZIPCODE_HASHED);
    public static final OfflineDataUploadErrorReason EMAIL_NOT_HASHED = new OfflineDataUploadErrorReason(_EMAIL_NOT_HASHED);
    public static final OfflineDataUploadErrorReason FIRST_NAME_NOT_HASHED = new OfflineDataUploadErrorReason(_FIRST_NAME_NOT_HASHED);
    public static final OfflineDataUploadErrorReason LAST_NAME_NOT_HASHED = new OfflineDataUploadErrorReason(_LAST_NAME_NOT_HASHED);
    public static final OfflineDataUploadErrorReason PHONE_NOT_HASHED = new OfflineDataUploadErrorReason(_PHONE_NOT_HASHED);
    public java.lang.String getValue() { return _value_;}
    public static OfflineDataUploadErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OfflineDataUploadErrorReason enumeration = (OfflineDataUploadErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OfflineDataUploadErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OfflineDataUploadErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUploadError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
