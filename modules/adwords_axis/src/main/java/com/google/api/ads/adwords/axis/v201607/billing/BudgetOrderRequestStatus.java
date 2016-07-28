/**
 * BudgetOrderRequestStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.billing;

public class BudgetOrderRequestStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BudgetOrderRequestStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNDER_REVIEW = "UNDER_REVIEW";
    public static final java.lang.String _APPROVED = "APPROVED";
    public static final java.lang.String _REJECTED = "REJECTED";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final BudgetOrderRequestStatus UNDER_REVIEW = new BudgetOrderRequestStatus(_UNDER_REVIEW);
    public static final BudgetOrderRequestStatus APPROVED = new BudgetOrderRequestStatus(_APPROVED);
    public static final BudgetOrderRequestStatus REJECTED = new BudgetOrderRequestStatus(_REJECTED);
    public static final BudgetOrderRequestStatus CANCELLED = new BudgetOrderRequestStatus(_CANCELLED);
    public static final BudgetOrderRequestStatus UNKNOWN = new BudgetOrderRequestStatus(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static BudgetOrderRequestStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BudgetOrderRequestStatus enumeration = (BudgetOrderRequestStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BudgetOrderRequestStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BudgetOrderRequestStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201607", "BudgetOrderRequest.Status"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
