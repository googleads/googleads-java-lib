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
 * OfflineDataUploadUserIdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;

public class OfflineDataUploadUserIdentifierType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OfflineDataUploadUserIdentifierType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _HASHED_EMAIL = "HASHED_EMAIL";
    public static final java.lang.String _HASHED_PHONE = "HASHED_PHONE";
    public static final java.lang.String _HASHED_LAST_NAME = "HASHED_LAST_NAME";
    public static final java.lang.String _HASHED_FIRST_NAME = "HASHED_FIRST_NAME";
    public static final java.lang.String _CITY = "CITY";
    public static final java.lang.String _STATE = "STATE";
    public static final java.lang.String _ZIPCODE = "ZIPCODE";
    public static final java.lang.String _COUNTRY_CODE = "COUNTRY_CODE";
    public static final java.lang.String _EXTERNAL_USER_ID = "EXTERNAL_USER_ID";
    public static final OfflineDataUploadUserIdentifierType UNKNOWN = new OfflineDataUploadUserIdentifierType(_UNKNOWN);
    public static final OfflineDataUploadUserIdentifierType HASHED_EMAIL = new OfflineDataUploadUserIdentifierType(_HASHED_EMAIL);
    public static final OfflineDataUploadUserIdentifierType HASHED_PHONE = new OfflineDataUploadUserIdentifierType(_HASHED_PHONE);
    public static final OfflineDataUploadUserIdentifierType HASHED_LAST_NAME = new OfflineDataUploadUserIdentifierType(_HASHED_LAST_NAME);
    public static final OfflineDataUploadUserIdentifierType HASHED_FIRST_NAME = new OfflineDataUploadUserIdentifierType(_HASHED_FIRST_NAME);
    public static final OfflineDataUploadUserIdentifierType CITY = new OfflineDataUploadUserIdentifierType(_CITY);
    public static final OfflineDataUploadUserIdentifierType STATE = new OfflineDataUploadUserIdentifierType(_STATE);
    public static final OfflineDataUploadUserIdentifierType ZIPCODE = new OfflineDataUploadUserIdentifierType(_ZIPCODE);
    public static final OfflineDataUploadUserIdentifierType COUNTRY_CODE = new OfflineDataUploadUserIdentifierType(_COUNTRY_CODE);
    public static final OfflineDataUploadUserIdentifierType EXTERNAL_USER_ID = new OfflineDataUploadUserIdentifierType(_EXTERNAL_USER_ID);
    public java.lang.String getValue() { return _value_;}
    public static OfflineDataUploadUserIdentifierType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OfflineDataUploadUserIdentifierType enumeration = (OfflineDataUploadUserIdentifierType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OfflineDataUploadUserIdentifierType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OfflineDataUploadUserIdentifierType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUploadUserIdentifierType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
