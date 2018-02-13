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
 * AudienceExtensionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class AudienceExtensionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AudienceExtensionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FREQUENCY_CAPS_NOT_SUPPORTED = "FREQUENCY_CAPS_NOT_SUPPORTED";
    public static final java.lang.String _INVALID_TARGETING = "INVALID_TARGETING";
    public static final java.lang.String _INVENTORY_UNIT_TARGETING_INVALID = "INVENTORY_UNIT_TARGETING_INVALID";
    public static final java.lang.String _INVALID_CREATIVE_ROTATION = "INVALID_CREATIVE_ROTATION";
    public static final java.lang.String _INVALID_EXTERNAL_ENTITY_ID = "INVALID_EXTERNAL_ENTITY_ID";
    public static final java.lang.String _INVALID_LINE_ITEM_TYPE = "INVALID_LINE_ITEM_TYPE";
    public static final java.lang.String _INVALID_MAX_BID = "INVALID_MAX_BID";
    public static final java.lang.String _AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED = "AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED";
    public static final java.lang.String _UNEXPECTED_AUDIENCE_EXTENSION_ERROR = "UNEXPECTED_AUDIENCE_EXTENSION_ERROR";
    public static final java.lang.String _MAX_DAILY_BUDGET_AMOUNT_EXCEEDED = "MAX_DAILY_BUDGET_AMOUNT_EXCEEDED";
    public static final java.lang.String _EXTERNAL_CAMPAIGN_ALREADY_EXISTS = "EXTERNAL_CAMPAIGN_ALREADY_EXISTS";
    public static final java.lang.String _AUDIENCE_EXTENSION_WITHOUT_FEATURE = "AUDIENCE_EXTENSION_WITHOUT_FEATURE";
    public static final java.lang.String _AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT = "AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT";
    public static final java.lang.String _CANNOT_OVERRIDE_CREATIVE_SIZE_WITH_AUDIENCE_EXTENSION = "CANNOT_OVERRIDE_CREATIVE_SIZE_WITH_AUDIENCE_EXTENSION";
    public static final java.lang.String _CANNOT_OVERRIDE_FIELD_WITH_AUDIENCE_EXTENSION = "CANNOT_OVERRIDE_FIELD_WITH_AUDIENCE_EXTENSION";
    public static final java.lang.String _ONLY_ONE_CREATIVE_PLACEHOLDER_ALLOWED = "ONLY_ONE_CREATIVE_PLACEHOLDER_ALLOWED";
    public static final java.lang.String _MULTIPLE_AUDIENCE_EXTENSION_LINE_ITEMS_ON_ORDER = "MULTIPLE_AUDIENCE_EXTENSION_LINE_ITEMS_ON_ORDER";
    public static final java.lang.String _CANNOT_COPY_AUDIENCE_EXTENSION_LINE_ITEMS_AND_CREATIVES_TOGETHER = "CANNOT_COPY_AUDIENCE_EXTENSION_LINE_ITEMS_AND_CREATIVES_TOGETHER";
    public static final java.lang.String _FEATURE_DEPRECATED = "FEATURE_DEPRECATED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AudienceExtensionErrorReason FREQUENCY_CAPS_NOT_SUPPORTED = new AudienceExtensionErrorReason(_FREQUENCY_CAPS_NOT_SUPPORTED);
    public static final AudienceExtensionErrorReason INVALID_TARGETING = new AudienceExtensionErrorReason(_INVALID_TARGETING);
    public static final AudienceExtensionErrorReason INVENTORY_UNIT_TARGETING_INVALID = new AudienceExtensionErrorReason(_INVENTORY_UNIT_TARGETING_INVALID);
    public static final AudienceExtensionErrorReason INVALID_CREATIVE_ROTATION = new AudienceExtensionErrorReason(_INVALID_CREATIVE_ROTATION);
    public static final AudienceExtensionErrorReason INVALID_EXTERNAL_ENTITY_ID = new AudienceExtensionErrorReason(_INVALID_EXTERNAL_ENTITY_ID);
    public static final AudienceExtensionErrorReason INVALID_LINE_ITEM_TYPE = new AudienceExtensionErrorReason(_INVALID_LINE_ITEM_TYPE);
    public static final AudienceExtensionErrorReason INVALID_MAX_BID = new AudienceExtensionErrorReason(_INVALID_MAX_BID);
    public static final AudienceExtensionErrorReason AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED = new AudienceExtensionErrorReason(_AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED);
    public static final AudienceExtensionErrorReason UNEXPECTED_AUDIENCE_EXTENSION_ERROR = new AudienceExtensionErrorReason(_UNEXPECTED_AUDIENCE_EXTENSION_ERROR);
    public static final AudienceExtensionErrorReason MAX_DAILY_BUDGET_AMOUNT_EXCEEDED = new AudienceExtensionErrorReason(_MAX_DAILY_BUDGET_AMOUNT_EXCEEDED);
    public static final AudienceExtensionErrorReason EXTERNAL_CAMPAIGN_ALREADY_EXISTS = new AudienceExtensionErrorReason(_EXTERNAL_CAMPAIGN_ALREADY_EXISTS);
    public static final AudienceExtensionErrorReason AUDIENCE_EXTENSION_WITHOUT_FEATURE = new AudienceExtensionErrorReason(_AUDIENCE_EXTENSION_WITHOUT_FEATURE);
    public static final AudienceExtensionErrorReason AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT = new AudienceExtensionErrorReason(_AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT);
    public static final AudienceExtensionErrorReason CANNOT_OVERRIDE_CREATIVE_SIZE_WITH_AUDIENCE_EXTENSION = new AudienceExtensionErrorReason(_CANNOT_OVERRIDE_CREATIVE_SIZE_WITH_AUDIENCE_EXTENSION);
    public static final AudienceExtensionErrorReason CANNOT_OVERRIDE_FIELD_WITH_AUDIENCE_EXTENSION = new AudienceExtensionErrorReason(_CANNOT_OVERRIDE_FIELD_WITH_AUDIENCE_EXTENSION);
    public static final AudienceExtensionErrorReason ONLY_ONE_CREATIVE_PLACEHOLDER_ALLOWED = new AudienceExtensionErrorReason(_ONLY_ONE_CREATIVE_PLACEHOLDER_ALLOWED);
    public static final AudienceExtensionErrorReason MULTIPLE_AUDIENCE_EXTENSION_LINE_ITEMS_ON_ORDER = new AudienceExtensionErrorReason(_MULTIPLE_AUDIENCE_EXTENSION_LINE_ITEMS_ON_ORDER);
    public static final AudienceExtensionErrorReason CANNOT_COPY_AUDIENCE_EXTENSION_LINE_ITEMS_AND_CREATIVES_TOGETHER = new AudienceExtensionErrorReason(_CANNOT_COPY_AUDIENCE_EXTENSION_LINE_ITEMS_AND_CREATIVES_TOGETHER);
    public static final AudienceExtensionErrorReason FEATURE_DEPRECATED = new AudienceExtensionErrorReason(_FEATURE_DEPRECATED);
    public static final AudienceExtensionErrorReason UNKNOWN = new AudienceExtensionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AudienceExtensionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AudienceExtensionErrorReason enumeration = (AudienceExtensionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AudienceExtensionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AudienceExtensionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AudienceExtensionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
