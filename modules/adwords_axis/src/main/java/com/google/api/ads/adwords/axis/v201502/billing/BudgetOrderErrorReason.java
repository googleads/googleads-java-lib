/**
 * BudgetOrderErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.billing;

public class BudgetOrderErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BudgetOrderErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BUDGET_APPROVAL_IN_PROGRESS = "BUDGET_APPROVAL_IN_PROGRESS";
    public static final java.lang.String _SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE";
    public static final java.lang.String _FIELD_NOT_ELIGIBLE_FOR_CURRENT_BILLING = "FIELD_NOT_ELIGIBLE_FOR_CURRENT_BILLING";
    public static final java.lang.String _INVALID_BILLING_ACCOUNT = "INVALID_BILLING_ACCOUNT";
    public static final java.lang.String _GENERIC_BILLING_ERROR = "GENERIC_BILLING_ERROR";
    public static final java.lang.String _INVALID_BILLING_ACCOUNT_ID_FORMAT = "INVALID_BILLING_ACCOUNT_ID_FORMAT";
    public static final java.lang.String _INVALID_BUDGET_DATE_RANGE = "INVALID_BUDGET_DATE_RANGE";
    public static final java.lang.String _INCOMPATIBLE_CURRENCY = "INCOMPATIBLE_CURRENCY";
    public static final java.lang.String _BUDGET_UPDATE_DENIED = "BUDGET_UPDATE_DENIED";
    public static final java.lang.String _BUDGET_ALREADY_STARTED = "BUDGET_ALREADY_STARTED";
    public static final java.lang.String _BUDGET_ALREADY_ENDED = "BUDGET_ALREADY_ENDED";
    public static final java.lang.String _INVALID_CONSTRAINT = "INVALID_CONSTRAINT";
    public static final java.lang.String _INVALID_BID_TOO_LARGE = "INVALID_BID_TOO_LARGE";
    public static final java.lang.String _NO_SUCH_BUDGET_FOUND = "NO_SUCH_BUDGET_FOUND";
    public static final java.lang.String _INVALID_BUDGET_ALREADY_SPENT = "INVALID_BUDGET_ALREADY_SPENT";
    public static final java.lang.String _INVALID_TIMEZONE_IN_DATE = "INVALID_TIMEZONE_IN_DATE";
    public static final java.lang.String _ACCOUNT_BUDGET_ID_SET_IN_ADD = "ACCOUNT_BUDGET_ID_SET_IN_ADD";
    public static final java.lang.String _MORE_THAN_ONE_OPERATIONS = "MORE_THAN_ONE_OPERATIONS";
    public static final java.lang.String _MCC_HIERARCHY_SIZE_TOO_LARGE = "MCC_HIERARCHY_SIZE_TOO_LARGE";
    public static final java.lang.String _INVALID_MCC_HIERARCHY = "INVALID_MCC_HIERARCHY";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BudgetOrderErrorReason BUDGET_APPROVAL_IN_PROGRESS = new BudgetOrderErrorReason(_BUDGET_APPROVAL_IN_PROGRESS);
    public static final BudgetOrderErrorReason SERVICE_UNAVAILABLE = new BudgetOrderErrorReason(_SERVICE_UNAVAILABLE);
    public static final BudgetOrderErrorReason FIELD_NOT_ELIGIBLE_FOR_CURRENT_BILLING = new BudgetOrderErrorReason(_FIELD_NOT_ELIGIBLE_FOR_CURRENT_BILLING);
    public static final BudgetOrderErrorReason INVALID_BILLING_ACCOUNT = new BudgetOrderErrorReason(_INVALID_BILLING_ACCOUNT);
    public static final BudgetOrderErrorReason GENERIC_BILLING_ERROR = new BudgetOrderErrorReason(_GENERIC_BILLING_ERROR);
    public static final BudgetOrderErrorReason INVALID_BILLING_ACCOUNT_ID_FORMAT = new BudgetOrderErrorReason(_INVALID_BILLING_ACCOUNT_ID_FORMAT);
    public static final BudgetOrderErrorReason INVALID_BUDGET_DATE_RANGE = new BudgetOrderErrorReason(_INVALID_BUDGET_DATE_RANGE);
    public static final BudgetOrderErrorReason INCOMPATIBLE_CURRENCY = new BudgetOrderErrorReason(_INCOMPATIBLE_CURRENCY);
    public static final BudgetOrderErrorReason BUDGET_UPDATE_DENIED = new BudgetOrderErrorReason(_BUDGET_UPDATE_DENIED);
    public static final BudgetOrderErrorReason BUDGET_ALREADY_STARTED = new BudgetOrderErrorReason(_BUDGET_ALREADY_STARTED);
    public static final BudgetOrderErrorReason BUDGET_ALREADY_ENDED = new BudgetOrderErrorReason(_BUDGET_ALREADY_ENDED);
    public static final BudgetOrderErrorReason INVALID_CONSTRAINT = new BudgetOrderErrorReason(_INVALID_CONSTRAINT);
    public static final BudgetOrderErrorReason INVALID_BID_TOO_LARGE = new BudgetOrderErrorReason(_INVALID_BID_TOO_LARGE);
    public static final BudgetOrderErrorReason NO_SUCH_BUDGET_FOUND = new BudgetOrderErrorReason(_NO_SUCH_BUDGET_FOUND);
    public static final BudgetOrderErrorReason INVALID_BUDGET_ALREADY_SPENT = new BudgetOrderErrorReason(_INVALID_BUDGET_ALREADY_SPENT);
    public static final BudgetOrderErrorReason INVALID_TIMEZONE_IN_DATE = new BudgetOrderErrorReason(_INVALID_TIMEZONE_IN_DATE);
    public static final BudgetOrderErrorReason ACCOUNT_BUDGET_ID_SET_IN_ADD = new BudgetOrderErrorReason(_ACCOUNT_BUDGET_ID_SET_IN_ADD);
    public static final BudgetOrderErrorReason MORE_THAN_ONE_OPERATIONS = new BudgetOrderErrorReason(_MORE_THAN_ONE_OPERATIONS);
    public static final BudgetOrderErrorReason MCC_HIERARCHY_SIZE_TOO_LARGE = new BudgetOrderErrorReason(_MCC_HIERARCHY_SIZE_TOO_LARGE);
    public static final BudgetOrderErrorReason INVALID_MCC_HIERARCHY = new BudgetOrderErrorReason(_INVALID_MCC_HIERARCHY);
    public static final BudgetOrderErrorReason UNKNOWN = new BudgetOrderErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BudgetOrderErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BudgetOrderErrorReason enumeration = (BudgetOrderErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BudgetOrderErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BudgetOrderErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201502", "BudgetOrderError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
