// Copyright 2020 Google LLC
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
 * ProposalLineItemMakegoodErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202008;

public class ProposalLineItemMakegoodErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProposalLineItemMakegoodErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ORIGINAL_ALREADY_HAS_MAKEGOOD = "ORIGINAL_ALREADY_HAS_MAKEGOOD";
    public static final java.lang.String _ORIGINAL_IS_MAKEGOOD = "ORIGINAL_IS_MAKEGOOD";
    public static final java.lang.String _ORIGINAL_NOT_YET_SOLD = "ORIGINAL_NOT_YET_SOLD";
    public static final java.lang.String _LINE_ITEM_IS_NOT_STANDARD = "LINE_ITEM_IS_NOT_STANDARD";
    public static final java.lang.String _LINE_ITEM_IS_NOT_CPM = "LINE_ITEM_IS_NOT_CPM";
    public static final java.lang.String _ORIGINAL_TOO_FAR_IN_PAST = "ORIGINAL_TOO_FAR_IN_PAST";
    public static final java.lang.String _RATE_DIFFERENT_THAN_ORIGINAL = "RATE_DIFFERENT_THAN_ORIGINAL";
    public static final java.lang.String _UNITS_MORE_THAN_ORIGINAL = "UNITS_MORE_THAN_ORIGINAL";
    public static final java.lang.String _MAKEGOODS_NOT_SUPPORTED_FOR_NON_DV360_BUYERS = "MAKEGOODS_NOT_SUPPORTED_FOR_NON_DV360_BUYERS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProposalLineItemMakegoodErrorReason ORIGINAL_ALREADY_HAS_MAKEGOOD = new ProposalLineItemMakegoodErrorReason(_ORIGINAL_ALREADY_HAS_MAKEGOOD);
    public static final ProposalLineItemMakegoodErrorReason ORIGINAL_IS_MAKEGOOD = new ProposalLineItemMakegoodErrorReason(_ORIGINAL_IS_MAKEGOOD);
    public static final ProposalLineItemMakegoodErrorReason ORIGINAL_NOT_YET_SOLD = new ProposalLineItemMakegoodErrorReason(_ORIGINAL_NOT_YET_SOLD);
    public static final ProposalLineItemMakegoodErrorReason LINE_ITEM_IS_NOT_STANDARD = new ProposalLineItemMakegoodErrorReason(_LINE_ITEM_IS_NOT_STANDARD);
    public static final ProposalLineItemMakegoodErrorReason LINE_ITEM_IS_NOT_CPM = new ProposalLineItemMakegoodErrorReason(_LINE_ITEM_IS_NOT_CPM);
    public static final ProposalLineItemMakegoodErrorReason ORIGINAL_TOO_FAR_IN_PAST = new ProposalLineItemMakegoodErrorReason(_ORIGINAL_TOO_FAR_IN_PAST);
    public static final ProposalLineItemMakegoodErrorReason RATE_DIFFERENT_THAN_ORIGINAL = new ProposalLineItemMakegoodErrorReason(_RATE_DIFFERENT_THAN_ORIGINAL);
    public static final ProposalLineItemMakegoodErrorReason UNITS_MORE_THAN_ORIGINAL = new ProposalLineItemMakegoodErrorReason(_UNITS_MORE_THAN_ORIGINAL);
    public static final ProposalLineItemMakegoodErrorReason MAKEGOODS_NOT_SUPPORTED_FOR_NON_DV360_BUYERS = new ProposalLineItemMakegoodErrorReason(_MAKEGOODS_NOT_SUPPORTED_FOR_NON_DV360_BUYERS);
    public static final ProposalLineItemMakegoodErrorReason UNKNOWN = new ProposalLineItemMakegoodErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProposalLineItemMakegoodErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProposalLineItemMakegoodErrorReason enumeration = (ProposalLineItemMakegoodErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProposalLineItemMakegoodErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProposalLineItemMakegoodErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202008", "ProposalLineItemMakegoodError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
