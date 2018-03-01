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
 * EntityCountLimitExceededReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class EntityCountLimitExceededReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EntityCountLimitExceededReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACCOUNT_LIMIT = "ACCOUNT_LIMIT";
    public static final java.lang.String _CAMPAIGN_LIMIT = "CAMPAIGN_LIMIT";
    public static final java.lang.String _ADGROUP_LIMIT = "ADGROUP_LIMIT";
    public static final java.lang.String _AD_GROUP_AD_LIMIT = "AD_GROUP_AD_LIMIT";
    public static final java.lang.String _AD_GROUP_CRITERION_LIMIT = "AD_GROUP_CRITERION_LIMIT";
    public static final java.lang.String _SHARED_SET_LIMIT = "SHARED_SET_LIMIT";
    public static final java.lang.String _MATCHING_FUNCTION_LIMIT = "MATCHING_FUNCTION_LIMIT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final EntityCountLimitExceededReason ACCOUNT_LIMIT = new EntityCountLimitExceededReason(_ACCOUNT_LIMIT);
    public static final EntityCountLimitExceededReason CAMPAIGN_LIMIT = new EntityCountLimitExceededReason(_CAMPAIGN_LIMIT);
    public static final EntityCountLimitExceededReason ADGROUP_LIMIT = new EntityCountLimitExceededReason(_ADGROUP_LIMIT);
    public static final EntityCountLimitExceededReason AD_GROUP_AD_LIMIT = new EntityCountLimitExceededReason(_AD_GROUP_AD_LIMIT);
    public static final EntityCountLimitExceededReason AD_GROUP_CRITERION_LIMIT = new EntityCountLimitExceededReason(_AD_GROUP_CRITERION_LIMIT);
    public static final EntityCountLimitExceededReason SHARED_SET_LIMIT = new EntityCountLimitExceededReason(_SHARED_SET_LIMIT);
    public static final EntityCountLimitExceededReason MATCHING_FUNCTION_LIMIT = new EntityCountLimitExceededReason(_MATCHING_FUNCTION_LIMIT);
    public static final EntityCountLimitExceededReason UNKNOWN = new EntityCountLimitExceededReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static EntityCountLimitExceededReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EntityCountLimitExceededReason enumeration = (EntityCountLimitExceededReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EntityCountLimitExceededReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EntityCountLimitExceededReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityCountLimitExceeded.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
