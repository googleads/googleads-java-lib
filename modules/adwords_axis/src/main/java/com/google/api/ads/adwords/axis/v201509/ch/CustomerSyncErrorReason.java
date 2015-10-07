/**
 * CustomerSyncErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.ch;

public class CustomerSyncErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomerSyncErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_CAMPAIGN_ID = "INVALID_CAMPAIGN_ID";
    public static final java.lang.String _INVALID_FEED_ID = "INVALID_FEED_ID";
    public static final java.lang.String _INVALID_DATE_RANGE = "INVALID_DATE_RANGE";
    public static final java.lang.String _TOO_MANY_CHANGES = "TOO_MANY_CHANGES";
    public static final CustomerSyncErrorReason INVALID_CAMPAIGN_ID = new CustomerSyncErrorReason(_INVALID_CAMPAIGN_ID);
    public static final CustomerSyncErrorReason INVALID_FEED_ID = new CustomerSyncErrorReason(_INVALID_FEED_ID);
    public static final CustomerSyncErrorReason INVALID_DATE_RANGE = new CustomerSyncErrorReason(_INVALID_DATE_RANGE);
    public static final CustomerSyncErrorReason TOO_MANY_CHANGES = new CustomerSyncErrorReason(_TOO_MANY_CHANGES);
    public java.lang.String getValue() { return _value_;}
    public static CustomerSyncErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomerSyncErrorReason enumeration = (CustomerSyncErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomerSyncErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomerSyncErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201509", "CustomerSyncError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
