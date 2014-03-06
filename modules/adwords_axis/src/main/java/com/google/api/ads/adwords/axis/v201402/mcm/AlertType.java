/**
 * AlertType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.mcm;

public class AlertType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlertType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACCOUNT_ON_TARGET = "ACCOUNT_ON_TARGET";
    public static final java.lang.String _DECLINED_PAYMENT = "DECLINED_PAYMENT";
    public static final java.lang.String _CREDIT_CARD_EXPIRING = "CREDIT_CARD_EXPIRING";
    public static final java.lang.String _ACCOUNT_BUDGET_ENDING = "ACCOUNT_BUDGET_ENDING";
    public static final java.lang.String _CAMPAIGN_ENDING = "CAMPAIGN_ENDING";
    public static final java.lang.String _PAYMENT_NOT_ENTERED = "PAYMENT_NOT_ENTERED";
    public static final java.lang.String _MISSING_BANK_REFERENCE_NUMBER = "MISSING_BANK_REFERENCE_NUMBER";
    public static final java.lang.String _CAMPAIGN_ENDED = "CAMPAIGN_ENDED";
    public static final java.lang.String _ACCOUNT_BUDGET_BURN_RATE = "ACCOUNT_BUDGET_BURN_RATE";
    public static final java.lang.String _USER_INVITE_PENDING = "USER_INVITE_PENDING";
    public static final java.lang.String _USER_INVITE_ACCEPTED = "USER_INVITE_ACCEPTED";
    public static final java.lang.String _MANAGER_LINK_PENDING = "MANAGER_LINK_PENDING";
    public static final java.lang.String _ZERO_DAILY_SPENDING_LIMIT = "ZERO_DAILY_SPENDING_LIMIT";
    public static final java.lang.String _TV_ACCOUNT_ON_TARGET = "TV_ACCOUNT_ON_TARGET";
    public static final java.lang.String _TV_ACCOUNT_BUDGET_ENDING = "TV_ACCOUNT_BUDGET_ENDING";
    public static final java.lang.String _TV_ZERO_DAILY_SPENDING_LIMIT = "TV_ZERO_DAILY_SPENDING_LIMIT";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AlertType ACCOUNT_ON_TARGET = new AlertType(_ACCOUNT_ON_TARGET);
    public static final AlertType DECLINED_PAYMENT = new AlertType(_DECLINED_PAYMENT);
    public static final AlertType CREDIT_CARD_EXPIRING = new AlertType(_CREDIT_CARD_EXPIRING);
    public static final AlertType ACCOUNT_BUDGET_ENDING = new AlertType(_ACCOUNT_BUDGET_ENDING);
    public static final AlertType CAMPAIGN_ENDING = new AlertType(_CAMPAIGN_ENDING);
    public static final AlertType PAYMENT_NOT_ENTERED = new AlertType(_PAYMENT_NOT_ENTERED);
    public static final AlertType MISSING_BANK_REFERENCE_NUMBER = new AlertType(_MISSING_BANK_REFERENCE_NUMBER);
    public static final AlertType CAMPAIGN_ENDED = new AlertType(_CAMPAIGN_ENDED);
    public static final AlertType ACCOUNT_BUDGET_BURN_RATE = new AlertType(_ACCOUNT_BUDGET_BURN_RATE);
    public static final AlertType USER_INVITE_PENDING = new AlertType(_USER_INVITE_PENDING);
    public static final AlertType USER_INVITE_ACCEPTED = new AlertType(_USER_INVITE_ACCEPTED);
    public static final AlertType MANAGER_LINK_PENDING = new AlertType(_MANAGER_LINK_PENDING);
    public static final AlertType ZERO_DAILY_SPENDING_LIMIT = new AlertType(_ZERO_DAILY_SPENDING_LIMIT);
    public static final AlertType TV_ACCOUNT_ON_TARGET = new AlertType(_TV_ACCOUNT_ON_TARGET);
    public static final AlertType TV_ACCOUNT_BUDGET_ENDING = new AlertType(_TV_ACCOUNT_BUDGET_ENDING);
    public static final AlertType TV_ZERO_DAILY_SPENDING_LIMIT = new AlertType(_TV_ZERO_DAILY_SPENDING_LIMIT);
    public static final AlertType UNKNOWN = new AlertType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AlertType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlertType enumeration = (AlertType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlertType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlertType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "AlertType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
