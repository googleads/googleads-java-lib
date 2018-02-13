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
 * InventoryTargetingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class InventoryTargetingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InventoryTargetingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED = "AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED";
    public static final java.lang.String _INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED = "INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED";
    public static final java.lang.String _INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED = "INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED";
    public static final java.lang.String _INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED = "INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED";
    public static final java.lang.String _INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED = "INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED";
    public static final java.lang.String _EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_TARGETED = "EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_TARGETED";
    public static final java.lang.String _EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_EXCLUDED = "EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_EXCLUDED";
    public static final java.lang.String _SELF_ONLY_INVENTORY_UNIT_NOT_ALLOWED = "SELF_ONLY_INVENTORY_UNIT_NOT_ALLOWED";
    public static final java.lang.String _SELF_ONLY_INVENTORY_UNIT_WITHOUT_DESCENDANTS = "SELF_ONLY_INVENTORY_UNIT_WITHOUT_DESCENDANTS";
    public static final java.lang.String _YOUTUBE_AUDIENCE_SEGMENTS_CAN_ONLY_BE_TARGETED_WITH_YOUTUBE_SHARED_INVENTORY = "YOUTUBE_AUDIENCE_SEGMENTS_CAN_ONLY_BE_TARGETED_WITH_YOUTUBE_SHARED_INVENTORY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final InventoryTargetingErrorReason AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED = new InventoryTargetingErrorReason(_AT_LEAST_ONE_PLACEMENT_OR_INVENTORY_UNIT_REQUIRED);
    public static final InventoryTargetingErrorReason INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED = new InventoryTargetingErrorReason(_INVENTORY_CANNOT_BE_TARGETED_AND_EXCLUDED);
    public static final InventoryTargetingErrorReason INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED = new InventoryTargetingErrorReason(_INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_TARGETED);
    public static final InventoryTargetingErrorReason INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED = new InventoryTargetingErrorReason(_INVENTORY_UNIT_CANNOT_BE_TARGETED_IF_ANCESTOR_IS_EXCLUDED);
    public static final InventoryTargetingErrorReason INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED = new InventoryTargetingErrorReason(_INVENTORY_UNIT_CANNOT_BE_EXCLUDED_IF_ANCESTOR_IS_EXCLUDED);
    public static final InventoryTargetingErrorReason EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_TARGETED = new InventoryTargetingErrorReason(_EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_TARGETED);
    public static final InventoryTargetingErrorReason EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_EXCLUDED = new InventoryTargetingErrorReason(_EXPLICITLY_TARGETED_INVENTORY_UNIT_CANNOT_BE_EXCLUDED);
    public static final InventoryTargetingErrorReason SELF_ONLY_INVENTORY_UNIT_NOT_ALLOWED = new InventoryTargetingErrorReason(_SELF_ONLY_INVENTORY_UNIT_NOT_ALLOWED);
    public static final InventoryTargetingErrorReason SELF_ONLY_INVENTORY_UNIT_WITHOUT_DESCENDANTS = new InventoryTargetingErrorReason(_SELF_ONLY_INVENTORY_UNIT_WITHOUT_DESCENDANTS);
    public static final InventoryTargetingErrorReason YOUTUBE_AUDIENCE_SEGMENTS_CAN_ONLY_BE_TARGETED_WITH_YOUTUBE_SHARED_INVENTORY = new InventoryTargetingErrorReason(_YOUTUBE_AUDIENCE_SEGMENTS_CAN_ONLY_BE_TARGETED_WITH_YOUTUBE_SHARED_INVENTORY);
    public static final InventoryTargetingErrorReason UNKNOWN = new InventoryTargetingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static InventoryTargetingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InventoryTargetingErrorReason enumeration = (InventoryTargetingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InventoryTargetingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InventoryTargetingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "InventoryTargetingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
