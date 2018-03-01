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
 * CriterionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class CriterionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CriterionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONTENT_LABEL = "CONTENT_LABEL";
    public static final java.lang.String _KEYWORD = "KEYWORD";
    public static final java.lang.String _PLACEMENT = "PLACEMENT";
    public static final java.lang.String _VERTICAL = "VERTICAL";
    public static final java.lang.String _USER_LIST = "USER_LIST";
    public static final java.lang.String _USER_INTEREST = "USER_INTEREST";
    public static final java.lang.String _MOBILE_APPLICATION = "MOBILE_APPLICATION";
    public static final java.lang.String _MOBILE_APP_CATEGORY = "MOBILE_APP_CATEGORY";
    public static final java.lang.String _PRODUCT_PARTITION = "PRODUCT_PARTITION";
    public static final java.lang.String _IP_BLOCK = "IP_BLOCK";
    public static final java.lang.String _WEBPAGE = "WEBPAGE";
    public static final java.lang.String _LANGUAGE = "LANGUAGE";
    public static final java.lang.String _LOCATION = "LOCATION";
    public static final java.lang.String _AGE_RANGE = "AGE_RANGE";
    public static final java.lang.String _CARRIER = "CARRIER";
    public static final java.lang.String _OPERATING_SYSTEM_VERSION = "OPERATING_SYSTEM_VERSION";
    public static final java.lang.String _MOBILE_DEVICE = "MOBILE_DEVICE";
    public static final java.lang.String _GENDER = "GENDER";
    public static final java.lang.String _PARENT = "PARENT";
    public static final java.lang.String _PROXIMITY = "PROXIMITY";
    public static final java.lang.String _PLATFORM = "PLATFORM";
    public static final java.lang.String _PREFERRED_CONTENT = "PREFERRED_CONTENT";
    public static final java.lang.String _AD_SCHEDULE = "AD_SCHEDULE";
    public static final java.lang.String _LOCATION_GROUPS = "LOCATION_GROUPS";
    public static final java.lang.String _PRODUCT_SCOPE = "PRODUCT_SCOPE";
    public static final java.lang.String _YOUTUBE_VIDEO = "YOUTUBE_VIDEO";
    public static final java.lang.String _YOUTUBE_CHANNEL = "YOUTUBE_CHANNEL";
    public static final java.lang.String _APP_PAYMENT_MODEL = "APP_PAYMENT_MODEL";
    public static final java.lang.String _INCOME_RANGE = "INCOME_RANGE";
    public static final java.lang.String _INTERACTION_TYPE = "INTERACTION_TYPE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CriterionType CONTENT_LABEL = new CriterionType(_CONTENT_LABEL);
    public static final CriterionType KEYWORD = new CriterionType(_KEYWORD);
    public static final CriterionType PLACEMENT = new CriterionType(_PLACEMENT);
    public static final CriterionType VERTICAL = new CriterionType(_VERTICAL);
    public static final CriterionType USER_LIST = new CriterionType(_USER_LIST);
    public static final CriterionType USER_INTEREST = new CriterionType(_USER_INTEREST);
    public static final CriterionType MOBILE_APPLICATION = new CriterionType(_MOBILE_APPLICATION);
    public static final CriterionType MOBILE_APP_CATEGORY = new CriterionType(_MOBILE_APP_CATEGORY);
    public static final CriterionType PRODUCT_PARTITION = new CriterionType(_PRODUCT_PARTITION);
    public static final CriterionType IP_BLOCK = new CriterionType(_IP_BLOCK);
    public static final CriterionType WEBPAGE = new CriterionType(_WEBPAGE);
    public static final CriterionType LANGUAGE = new CriterionType(_LANGUAGE);
    public static final CriterionType LOCATION = new CriterionType(_LOCATION);
    public static final CriterionType AGE_RANGE = new CriterionType(_AGE_RANGE);
    public static final CriterionType CARRIER = new CriterionType(_CARRIER);
    public static final CriterionType OPERATING_SYSTEM_VERSION = new CriterionType(_OPERATING_SYSTEM_VERSION);
    public static final CriterionType MOBILE_DEVICE = new CriterionType(_MOBILE_DEVICE);
    public static final CriterionType GENDER = new CriterionType(_GENDER);
    public static final CriterionType PARENT = new CriterionType(_PARENT);
    public static final CriterionType PROXIMITY = new CriterionType(_PROXIMITY);
    public static final CriterionType PLATFORM = new CriterionType(_PLATFORM);
    public static final CriterionType PREFERRED_CONTENT = new CriterionType(_PREFERRED_CONTENT);
    public static final CriterionType AD_SCHEDULE = new CriterionType(_AD_SCHEDULE);
    public static final CriterionType LOCATION_GROUPS = new CriterionType(_LOCATION_GROUPS);
    public static final CriterionType PRODUCT_SCOPE = new CriterionType(_PRODUCT_SCOPE);
    public static final CriterionType YOUTUBE_VIDEO = new CriterionType(_YOUTUBE_VIDEO);
    public static final CriterionType YOUTUBE_CHANNEL = new CriterionType(_YOUTUBE_CHANNEL);
    public static final CriterionType APP_PAYMENT_MODEL = new CriterionType(_APP_PAYMENT_MODEL);
    public static final CriterionType INCOME_RANGE = new CriterionType(_INCOME_RANGE);
    public static final CriterionType INTERACTION_TYPE = new CriterionType(_INTERACTION_TYPE);
    public static final CriterionType UNKNOWN = new CriterionType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CriterionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CriterionType enumeration = (CriterionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CriterionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CriterionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Criterion.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
