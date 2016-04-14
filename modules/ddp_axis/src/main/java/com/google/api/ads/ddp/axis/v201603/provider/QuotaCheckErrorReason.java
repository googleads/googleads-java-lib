/**
 * QuotaCheckErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;

public class QuotaCheckErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected QuotaCheckErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_TOKEN_HEADER = "INVALID_TOKEN_HEADER";
    public static final java.lang.String _ACCOUNT_DELINQUENT = "ACCOUNT_DELINQUENT";
    public static final java.lang.String _ACCOUNT_INACCESSIBLE = "ACCOUNT_INACCESSIBLE";
    public static final java.lang.String _ACCOUNT_INACTIVE = "ACCOUNT_INACTIVE";
    public static final java.lang.String _INCOMPLETE_SIGNUP = "INCOMPLETE_SIGNUP";
    public static final java.lang.String _DEVELOPER_TOKEN_NOT_APPROVED = "DEVELOPER_TOKEN_NOT_APPROVED";
    public static final java.lang.String _TERMS_AND_CONDITIONS_NOT_SIGNED = "TERMS_AND_CONDITIONS_NOT_SIGNED";
    public static final java.lang.String _MONTHLY_BUDGET_REACHED = "MONTHLY_BUDGET_REACHED";
    public static final java.lang.String _QUOTA_EXCEEDED = "QUOTA_EXCEEDED";
    public static final QuotaCheckErrorReason INVALID_TOKEN_HEADER = new QuotaCheckErrorReason(_INVALID_TOKEN_HEADER);
    public static final QuotaCheckErrorReason ACCOUNT_DELINQUENT = new QuotaCheckErrorReason(_ACCOUNT_DELINQUENT);
    public static final QuotaCheckErrorReason ACCOUNT_INACCESSIBLE = new QuotaCheckErrorReason(_ACCOUNT_INACCESSIBLE);
    public static final QuotaCheckErrorReason ACCOUNT_INACTIVE = new QuotaCheckErrorReason(_ACCOUNT_INACTIVE);
    public static final QuotaCheckErrorReason INCOMPLETE_SIGNUP = new QuotaCheckErrorReason(_INCOMPLETE_SIGNUP);
    public static final QuotaCheckErrorReason DEVELOPER_TOKEN_NOT_APPROVED = new QuotaCheckErrorReason(_DEVELOPER_TOKEN_NOT_APPROVED);
    public static final QuotaCheckErrorReason TERMS_AND_CONDITIONS_NOT_SIGNED = new QuotaCheckErrorReason(_TERMS_AND_CONDITIONS_NOT_SIGNED);
    public static final QuotaCheckErrorReason MONTHLY_BUDGET_REACHED = new QuotaCheckErrorReason(_MONTHLY_BUDGET_REACHED);
    public static final QuotaCheckErrorReason QUOTA_EXCEEDED = new QuotaCheckErrorReason(_QUOTA_EXCEEDED);
    public java.lang.String getValue() { return _value_;}
    public static QuotaCheckErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        QuotaCheckErrorReason enumeration = (QuotaCheckErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static QuotaCheckErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(QuotaCheckErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "QuotaCheckError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
