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
 * BudgetErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class BudgetErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BudgetErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BUDGET_REMOVED = "BUDGET_REMOVED";
    public static final java.lang.String _BUDGET_ERROR = "BUDGET_ERROR";
    public static final java.lang.String _BUDGET_IN_USE = "BUDGET_IN_USE";
    public static final java.lang.String _BUDGET_PERIOD_NOT_AVAILABLE = "BUDGET_PERIOD_NOT_AVAILABLE";
    public static final java.lang.String _CANNOT_EDIT_SHARED_BUDGET = "CANNOT_EDIT_SHARED_BUDGET";
    public static final java.lang.String _CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_BUDGET = "CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_BUDGET";
    public static final java.lang.String _CANNOT_UPDATE_BUDGET_TO_IMPLICITLY_SHARED = "CANNOT_UPDATE_BUDGET_TO_IMPLICITLY_SHARED";
    public static final java.lang.String _CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME = "CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME";
    public static final java.lang.String _CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED = "CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED";
    public static final java.lang.String _CANNOT_USE_IMPLICITLY_SHARED_BUDGET_WITH_MULTIPLE_CAMPAIGNS = "CANNOT_USE_IMPLICITLY_SHARED_BUDGET_WITH_MULTIPLE_CAMPAIGNS";
    public static final java.lang.String _DUPLICATE_NAME = "DUPLICATE_NAME";
    public static final java.lang.String _MONEY_AMOUNT_IN_WRONG_CURRENCY = "MONEY_AMOUNT_IN_WRONG_CURRENCY";
    public static final java.lang.String _MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC = "MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC";
    public static final java.lang.String _MONEY_AMOUNT_TOO_LARGE = "MONEY_AMOUNT_TOO_LARGE";
    public static final java.lang.String _NEGATIVE_MONEY_AMOUNT = "NEGATIVE_MONEY_AMOUNT";
    public static final java.lang.String _NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT = "NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT";
    public static final BudgetErrorReason BUDGET_REMOVED = new BudgetErrorReason(_BUDGET_REMOVED);
    public static final BudgetErrorReason BUDGET_ERROR = new BudgetErrorReason(_BUDGET_ERROR);
    public static final BudgetErrorReason BUDGET_IN_USE = new BudgetErrorReason(_BUDGET_IN_USE);
    public static final BudgetErrorReason BUDGET_PERIOD_NOT_AVAILABLE = new BudgetErrorReason(_BUDGET_PERIOD_NOT_AVAILABLE);
    public static final BudgetErrorReason CANNOT_EDIT_SHARED_BUDGET = new BudgetErrorReason(_CANNOT_EDIT_SHARED_BUDGET);
    public static final BudgetErrorReason CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_BUDGET = new BudgetErrorReason(_CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_BUDGET);
    public static final BudgetErrorReason CANNOT_UPDATE_BUDGET_TO_IMPLICITLY_SHARED = new BudgetErrorReason(_CANNOT_UPDATE_BUDGET_TO_IMPLICITLY_SHARED);
    public static final BudgetErrorReason CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME = new BudgetErrorReason(_CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME);
    public static final BudgetErrorReason CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED = new BudgetErrorReason(_CANNOT_UPDATE_BUDGET_TO_EXPLICITLY_SHARED);
    public static final BudgetErrorReason CANNOT_USE_IMPLICITLY_SHARED_BUDGET_WITH_MULTIPLE_CAMPAIGNS = new BudgetErrorReason(_CANNOT_USE_IMPLICITLY_SHARED_BUDGET_WITH_MULTIPLE_CAMPAIGNS);
    public static final BudgetErrorReason DUPLICATE_NAME = new BudgetErrorReason(_DUPLICATE_NAME);
    public static final BudgetErrorReason MONEY_AMOUNT_IN_WRONG_CURRENCY = new BudgetErrorReason(_MONEY_AMOUNT_IN_WRONG_CURRENCY);
    public static final BudgetErrorReason MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC = new BudgetErrorReason(_MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC);
    public static final BudgetErrorReason MONEY_AMOUNT_TOO_LARGE = new BudgetErrorReason(_MONEY_AMOUNT_TOO_LARGE);
    public static final BudgetErrorReason NEGATIVE_MONEY_AMOUNT = new BudgetErrorReason(_NEGATIVE_MONEY_AMOUNT);
    public static final BudgetErrorReason NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT = new BudgetErrorReason(_NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT);
    public java.lang.String getValue() { return _value_;}
    public static BudgetErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BudgetErrorReason enumeration = (BudgetErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BudgetErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BudgetErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BudgetError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
