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
 * EntityChildrenLimitReachedErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class EntityChildrenLimitReachedErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntityChildrenLimitReachedErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LINE_ITEM_LIMIT_FOR_ORDER_REACHED = "LINE_ITEM_LIMIT_FOR_ORDER_REACHED";
    public static final java.lang.String _CREATIVE_ASSOCIATION_LIMIT_FOR_LINE_ITEM_REACHED = "CREATIVE_ASSOCIATION_LIMIT_FOR_LINE_ITEM_REACHED";
    public static final java.lang.String _AD_UNIT_LIMIT_FOR_PLACEMENT_REACHED = "AD_UNIT_LIMIT_FOR_PLACEMENT_REACHED";
    public static final java.lang.String _TARGETING_EXPRESSION_LIMIT_FOR_LINE_ITEM_REACHED = "TARGETING_EXPRESSION_LIMIT_FOR_LINE_ITEM_REACHED";
    public static final java.lang.String _CUSTOM_TARGETING_VALUES_FOR_KEY_LIMIT_REACHED = "CUSTOM_TARGETING_VALUES_FOR_KEY_LIMIT_REACHED";
    public static final java.lang.String _TARGETING_EXPRESSION_LIMIT_FOR_CREATIVES_ON_LINE_ITEM_REACHED = "TARGETING_EXPRESSION_LIMIT_FOR_CREATIVES_ON_LINE_ITEM_REACHED";
    public static final java.lang.String _ATTACHMENT_LIMIT_FOR_PROPOSAL_REACHED = "ATTACHMENT_LIMIT_FOR_PROPOSAL_REACHED";
    public static final java.lang.String _PROPOSAL_LINE_ITEM_LIMIT_FOR_PROPOSAL_REACHED = "PROPOSAL_LINE_ITEM_LIMIT_FOR_PROPOSAL_REACHED";
    public static final java.lang.String _PRODUCT_LIMIT_FOR_PRODUCT_PACKAGE_REACHED = "PRODUCT_LIMIT_FOR_PRODUCT_PACKAGE_REACHED";
    public static final java.lang.String _PRODUCT_TEMPLATE_AND_PRODUCT_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED = "PRODUCT_TEMPLATE_AND_PRODUCT_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED";
    public static final java.lang.String _PRODUCT_PACKAGE_ITEM_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED = "PRODUCT_PACKAGE_ITEM_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED";
    public static final java.lang.String _PREMIUM_LIMIT_FOR_RATE_CARD_REACHED = "PREMIUM_LIMIT_FOR_RATE_CARD_REACHED";
    public static final java.lang.String _AD_UNIT_LIMIT_FOR_AD_EXCLUSION_RULE_TARGETING_REACHED = "AD_UNIT_LIMIT_FOR_AD_EXCLUSION_RULE_TARGETING_REACHED";
    public static final java.lang.String _NATIVE_STYLE_LIMIT_FOR_NATIVE_AD_FORMAT_REACHED = "NATIVE_STYLE_LIMIT_FOR_NATIVE_AD_FORMAT_REACHED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final EntityChildrenLimitReachedErrorReason LINE_ITEM_LIMIT_FOR_ORDER_REACHED = new EntityChildrenLimitReachedErrorReason(_LINE_ITEM_LIMIT_FOR_ORDER_REACHED);
    public static final EntityChildrenLimitReachedErrorReason CREATIVE_ASSOCIATION_LIMIT_FOR_LINE_ITEM_REACHED = new EntityChildrenLimitReachedErrorReason(_CREATIVE_ASSOCIATION_LIMIT_FOR_LINE_ITEM_REACHED);
    public static final EntityChildrenLimitReachedErrorReason AD_UNIT_LIMIT_FOR_PLACEMENT_REACHED = new EntityChildrenLimitReachedErrorReason(_AD_UNIT_LIMIT_FOR_PLACEMENT_REACHED);
    public static final EntityChildrenLimitReachedErrorReason TARGETING_EXPRESSION_LIMIT_FOR_LINE_ITEM_REACHED = new EntityChildrenLimitReachedErrorReason(_TARGETING_EXPRESSION_LIMIT_FOR_LINE_ITEM_REACHED);
    public static final EntityChildrenLimitReachedErrorReason CUSTOM_TARGETING_VALUES_FOR_KEY_LIMIT_REACHED = new EntityChildrenLimitReachedErrorReason(_CUSTOM_TARGETING_VALUES_FOR_KEY_LIMIT_REACHED);
    public static final EntityChildrenLimitReachedErrorReason TARGETING_EXPRESSION_LIMIT_FOR_CREATIVES_ON_LINE_ITEM_REACHED = new EntityChildrenLimitReachedErrorReason(_TARGETING_EXPRESSION_LIMIT_FOR_CREATIVES_ON_LINE_ITEM_REACHED);
    public static final EntityChildrenLimitReachedErrorReason ATTACHMENT_LIMIT_FOR_PROPOSAL_REACHED = new EntityChildrenLimitReachedErrorReason(_ATTACHMENT_LIMIT_FOR_PROPOSAL_REACHED);
    public static final EntityChildrenLimitReachedErrorReason PROPOSAL_LINE_ITEM_LIMIT_FOR_PROPOSAL_REACHED = new EntityChildrenLimitReachedErrorReason(_PROPOSAL_LINE_ITEM_LIMIT_FOR_PROPOSAL_REACHED);
    public static final EntityChildrenLimitReachedErrorReason PRODUCT_LIMIT_FOR_PRODUCT_PACKAGE_REACHED = new EntityChildrenLimitReachedErrorReason(_PRODUCT_LIMIT_FOR_PRODUCT_PACKAGE_REACHED);
    public static final EntityChildrenLimitReachedErrorReason PRODUCT_TEMPLATE_AND_PRODUCT_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED = new EntityChildrenLimitReachedErrorReason(_PRODUCT_TEMPLATE_AND_PRODUCT_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED);
    public static final EntityChildrenLimitReachedErrorReason PRODUCT_PACKAGE_ITEM_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED = new EntityChildrenLimitReachedErrorReason(_PRODUCT_PACKAGE_ITEM_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED);
    public static final EntityChildrenLimitReachedErrorReason PREMIUM_LIMIT_FOR_RATE_CARD_REACHED = new EntityChildrenLimitReachedErrorReason(_PREMIUM_LIMIT_FOR_RATE_CARD_REACHED);
    public static final EntityChildrenLimitReachedErrorReason AD_UNIT_LIMIT_FOR_AD_EXCLUSION_RULE_TARGETING_REACHED = new EntityChildrenLimitReachedErrorReason(_AD_UNIT_LIMIT_FOR_AD_EXCLUSION_RULE_TARGETING_REACHED);
    public static final EntityChildrenLimitReachedErrorReason NATIVE_STYLE_LIMIT_FOR_NATIVE_AD_FORMAT_REACHED = new EntityChildrenLimitReachedErrorReason(_NATIVE_STYLE_LIMIT_FOR_NATIVE_AD_FORMAT_REACHED);
    public static final EntityChildrenLimitReachedErrorReason UNKNOWN = new EntityChildrenLimitReachedErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static EntityChildrenLimitReachedErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EntityChildrenLimitReachedErrorReason enumeration = (EntityChildrenLimitReachedErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntityChildrenLimitReachedErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EntityChildrenLimitReachedErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "EntityChildrenLimitReachedError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
