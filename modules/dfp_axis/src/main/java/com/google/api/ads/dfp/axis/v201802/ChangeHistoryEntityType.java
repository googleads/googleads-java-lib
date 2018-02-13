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
 * ChangeHistoryEntityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class ChangeHistoryEntityType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ChangeHistoryEntityType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _BASE_RATE = "BASE_RATE";
    public static final java.lang.String _COMPANY = "COMPANY";
    public static final java.lang.String _CONTACT = "CONTACT";
    public static final java.lang.String _CREATIVE = "CREATIVE";
    public static final java.lang.String _CREATIVE_SET = "CREATIVE_SET";
    public static final java.lang.String _CUSTOM_FIELD = "CUSTOM_FIELD";
    public static final java.lang.String _CUSTOM_KEY = "CUSTOM_KEY";
    public static final java.lang.String _CUSTOM_VALUE = "CUSTOM_VALUE";
    public static final java.lang.String _PLACEMENT = "PLACEMENT";
    public static final java.lang.String _AD_UNIT = "AD_UNIT";
    public static final java.lang.String _LABEL = "LABEL";
    public static final java.lang.String _LINE_ITEM = "LINE_ITEM";
    public static final java.lang.String _NETWORK = "NETWORK";
    public static final java.lang.String _ORDER = "ORDER";
    public static final java.lang.String _PREMIUM_RATE = "PREMIUM_RATE";
    public static final java.lang.String _PRODUCT = "PRODUCT";
    public static final java.lang.String _PRODUCT_PACKAGE = "PRODUCT_PACKAGE";
    public static final java.lang.String _PRODUCT_PACKAGE_ITEM = "PRODUCT_PACKAGE_ITEM";
    public static final java.lang.String _PRODUCT_TEMPLATE = "PRODUCT_TEMPLATE";
    public static final java.lang.String _PROPOSAL = "PROPOSAL";
    public static final java.lang.String _PROPOSAL_LINK = "PROPOSAL_LINK";
    public static final java.lang.String _PROPOSAL_LINE_ITEM = "PROPOSAL_LINE_ITEM";
    public static final java.lang.String _PACKAGE = "PACKAGE";
    public static final java.lang.String _RATE_CARD = "RATE_CARD";
    public static final java.lang.String _ROLE = "ROLE";
    public static final java.lang.String _TEAM = "TEAM";
    public static final java.lang.String _USER = "USER";
    public static final java.lang.String _WORKFLOW = "WORKFLOW";
    public static final ChangeHistoryEntityType UNKNOWN = new ChangeHistoryEntityType(_UNKNOWN);
    public static final ChangeHistoryEntityType BASE_RATE = new ChangeHistoryEntityType(_BASE_RATE);
    public static final ChangeHistoryEntityType COMPANY = new ChangeHistoryEntityType(_COMPANY);
    public static final ChangeHistoryEntityType CONTACT = new ChangeHistoryEntityType(_CONTACT);
    public static final ChangeHistoryEntityType CREATIVE = new ChangeHistoryEntityType(_CREATIVE);
    public static final ChangeHistoryEntityType CREATIVE_SET = new ChangeHistoryEntityType(_CREATIVE_SET);
    public static final ChangeHistoryEntityType CUSTOM_FIELD = new ChangeHistoryEntityType(_CUSTOM_FIELD);
    public static final ChangeHistoryEntityType CUSTOM_KEY = new ChangeHistoryEntityType(_CUSTOM_KEY);
    public static final ChangeHistoryEntityType CUSTOM_VALUE = new ChangeHistoryEntityType(_CUSTOM_VALUE);
    public static final ChangeHistoryEntityType PLACEMENT = new ChangeHistoryEntityType(_PLACEMENT);
    public static final ChangeHistoryEntityType AD_UNIT = new ChangeHistoryEntityType(_AD_UNIT);
    public static final ChangeHistoryEntityType LABEL = new ChangeHistoryEntityType(_LABEL);
    public static final ChangeHistoryEntityType LINE_ITEM = new ChangeHistoryEntityType(_LINE_ITEM);
    public static final ChangeHistoryEntityType NETWORK = new ChangeHistoryEntityType(_NETWORK);
    public static final ChangeHistoryEntityType ORDER = new ChangeHistoryEntityType(_ORDER);
    public static final ChangeHistoryEntityType PREMIUM_RATE = new ChangeHistoryEntityType(_PREMIUM_RATE);
    public static final ChangeHistoryEntityType PRODUCT = new ChangeHistoryEntityType(_PRODUCT);
    public static final ChangeHistoryEntityType PRODUCT_PACKAGE = new ChangeHistoryEntityType(_PRODUCT_PACKAGE);
    public static final ChangeHistoryEntityType PRODUCT_PACKAGE_ITEM = new ChangeHistoryEntityType(_PRODUCT_PACKAGE_ITEM);
    public static final ChangeHistoryEntityType PRODUCT_TEMPLATE = new ChangeHistoryEntityType(_PRODUCT_TEMPLATE);
    public static final ChangeHistoryEntityType PROPOSAL = new ChangeHistoryEntityType(_PROPOSAL);
    public static final ChangeHistoryEntityType PROPOSAL_LINK = new ChangeHistoryEntityType(_PROPOSAL_LINK);
    public static final ChangeHistoryEntityType PROPOSAL_LINE_ITEM = new ChangeHistoryEntityType(_PROPOSAL_LINE_ITEM);
    public static final ChangeHistoryEntityType PACKAGE = new ChangeHistoryEntityType(_PACKAGE);
    public static final ChangeHistoryEntityType RATE_CARD = new ChangeHistoryEntityType(_RATE_CARD);
    public static final ChangeHistoryEntityType ROLE = new ChangeHistoryEntityType(_ROLE);
    public static final ChangeHistoryEntityType TEAM = new ChangeHistoryEntityType(_TEAM);
    public static final ChangeHistoryEntityType USER = new ChangeHistoryEntityType(_USER);
    public static final ChangeHistoryEntityType WORKFLOW = new ChangeHistoryEntityType(_WORKFLOW);
    public java.lang.String getValue() { return _value_;}
    public static ChangeHistoryEntityType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ChangeHistoryEntityType enumeration = (ChangeHistoryEntityType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ChangeHistoryEntityType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ChangeHistoryEntityType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ChangeHistoryEntityType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
