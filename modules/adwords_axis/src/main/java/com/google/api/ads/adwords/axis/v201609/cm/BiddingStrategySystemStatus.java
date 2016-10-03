// Copyright 2016 Google Inc. All Rights Reserved.
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
 * BiddingStrategySystemStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201609.cm;

public class BiddingStrategySystemStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BiddingStrategySystemStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _UNCONSTRAINED = "UNCONSTRAINED";
    public static final java.lang.String _LEARNING_NEW = "LEARNING_NEW";
    public static final java.lang.String _LEARNING_SETTING_CHANGE = "LEARNING_SETTING_CHANGE";
    public static final java.lang.String _LEARNING_BUDGET_CHANGE = "LEARNING_BUDGET_CHANGE";
    public static final java.lang.String _LEARNING_COMPOSITION_CHANGE = "LEARNING_COMPOSITION_CHANGE";
    public static final java.lang.String _LEARNING_CONVERSION_TYPE_CHANGE = "LEARNING_CONVERSION_TYPE_CHANGE";
    public static final java.lang.String _LEARNING_CONVERSION_SETTING_CHANGE = "LEARNING_CONVERSION_SETTING_CHANGE";
    public static final java.lang.String _LIMITED_BY_BID_CONSTRAINTS = "LIMITED_BY_BID_CONSTRAINTS";
    public static final java.lang.String _LIMITED_BY_MAX_BID_LIMIT = "LIMITED_BY_MAX_BID_LIMIT";
    public static final java.lang.String _LIMITED_BY_MIN_BID_LIMIT = "LIMITED_BY_MIN_BID_LIMIT";
    public static final java.lang.String _LIMITED_BY_MIN_ROAS_LIMIT = "LIMITED_BY_MIN_ROAS_LIMIT";
    public static final java.lang.String _LIMITED_BY_DATA = "LIMITED_BY_DATA";
    public static final java.lang.String _LIMITED_BY_BUDGET = "LIMITED_BY_BUDGET";
    public static final java.lang.String _LIMITED_BY_LOW_PRIORITY_SPEND = "LIMITED_BY_LOW_PRIORITY_SPEND";
    public static final java.lang.String _LIMITED_BY_LOW_QUALITY = "LIMITED_BY_LOW_QUALITY";
    public static final java.lang.String _MISCONFIGURED_CONVERSION_TYPES = "MISCONFIGURED_CONVERSION_TYPES";
    public static final java.lang.String _MISCONFIGURED_CONVERSION_SETTINGS = "MISCONFIGURED_CONVERSION_SETTINGS";
    public static final java.lang.String _INACTIVE = "INACTIVE";
    public static final java.lang.String _UNAVAILABLE = "UNAVAILABLE";
    public static final java.lang.String _MULTIPLE_LEARNING = "MULTIPLE_LEARNING";
    public static final java.lang.String _MULTIPLE_LIMITED = "MULTIPLE_LIMITED";
    public static final java.lang.String _MULTIPLE_MISCONFIGURED = "MULTIPLE_MISCONFIGURED";
    public static final java.lang.String _MULTIPLE = "MULTIPLE";
    public static final BiddingStrategySystemStatus UNKNOWN = new BiddingStrategySystemStatus(_UNKNOWN);
    public static final BiddingStrategySystemStatus UNCONSTRAINED = new BiddingStrategySystemStatus(_UNCONSTRAINED);
    public static final BiddingStrategySystemStatus LEARNING_NEW = new BiddingStrategySystemStatus(_LEARNING_NEW);
    public static final BiddingStrategySystemStatus LEARNING_SETTING_CHANGE = new BiddingStrategySystemStatus(_LEARNING_SETTING_CHANGE);
    public static final BiddingStrategySystemStatus LEARNING_BUDGET_CHANGE = new BiddingStrategySystemStatus(_LEARNING_BUDGET_CHANGE);
    public static final BiddingStrategySystemStatus LEARNING_COMPOSITION_CHANGE = new BiddingStrategySystemStatus(_LEARNING_COMPOSITION_CHANGE);
    public static final BiddingStrategySystemStatus LEARNING_CONVERSION_TYPE_CHANGE = new BiddingStrategySystemStatus(_LEARNING_CONVERSION_TYPE_CHANGE);
    public static final BiddingStrategySystemStatus LEARNING_CONVERSION_SETTING_CHANGE = new BiddingStrategySystemStatus(_LEARNING_CONVERSION_SETTING_CHANGE);
    public static final BiddingStrategySystemStatus LIMITED_BY_BID_CONSTRAINTS = new BiddingStrategySystemStatus(_LIMITED_BY_BID_CONSTRAINTS);
    public static final BiddingStrategySystemStatus LIMITED_BY_MAX_BID_LIMIT = new BiddingStrategySystemStatus(_LIMITED_BY_MAX_BID_LIMIT);
    public static final BiddingStrategySystemStatus LIMITED_BY_MIN_BID_LIMIT = new BiddingStrategySystemStatus(_LIMITED_BY_MIN_BID_LIMIT);
    public static final BiddingStrategySystemStatus LIMITED_BY_MIN_ROAS_LIMIT = new BiddingStrategySystemStatus(_LIMITED_BY_MIN_ROAS_LIMIT);
    public static final BiddingStrategySystemStatus LIMITED_BY_DATA = new BiddingStrategySystemStatus(_LIMITED_BY_DATA);
    public static final BiddingStrategySystemStatus LIMITED_BY_BUDGET = new BiddingStrategySystemStatus(_LIMITED_BY_BUDGET);
    public static final BiddingStrategySystemStatus LIMITED_BY_LOW_PRIORITY_SPEND = new BiddingStrategySystemStatus(_LIMITED_BY_LOW_PRIORITY_SPEND);
    public static final BiddingStrategySystemStatus LIMITED_BY_LOW_QUALITY = new BiddingStrategySystemStatus(_LIMITED_BY_LOW_QUALITY);
    public static final BiddingStrategySystemStatus MISCONFIGURED_CONVERSION_TYPES = new BiddingStrategySystemStatus(_MISCONFIGURED_CONVERSION_TYPES);
    public static final BiddingStrategySystemStatus MISCONFIGURED_CONVERSION_SETTINGS = new BiddingStrategySystemStatus(_MISCONFIGURED_CONVERSION_SETTINGS);
    public static final BiddingStrategySystemStatus INACTIVE = new BiddingStrategySystemStatus(_INACTIVE);
    public static final BiddingStrategySystemStatus UNAVAILABLE = new BiddingStrategySystemStatus(_UNAVAILABLE);
    public static final BiddingStrategySystemStatus MULTIPLE_LEARNING = new BiddingStrategySystemStatus(_MULTIPLE_LEARNING);
    public static final BiddingStrategySystemStatus MULTIPLE_LIMITED = new BiddingStrategySystemStatus(_MULTIPLE_LIMITED);
    public static final BiddingStrategySystemStatus MULTIPLE_MISCONFIGURED = new BiddingStrategySystemStatus(_MULTIPLE_MISCONFIGURED);
    public static final BiddingStrategySystemStatus MULTIPLE = new BiddingStrategySystemStatus(_MULTIPLE);
    public java.lang.String getValue() { return _value_;}
    public static BiddingStrategySystemStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BiddingStrategySystemStatus enumeration = (BiddingStrategySystemStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BiddingStrategySystemStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BiddingStrategySystemStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "BiddingStrategySystemStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
