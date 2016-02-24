/**
 * LineItemActivityAssociationErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;

public class LineItemActivityAssociationErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LineItemActivityAssociationErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_ACTIVITY_FOR_ADVERTISER = "INVALID_ACTIVITY_FOR_ADVERTISER";
    public static final java.lang.String _INVALID_COST_TYPE_FOR_ASSOCIATION = "INVALID_COST_TYPE_FOR_ASSOCIATION";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final LineItemActivityAssociationErrorReason INVALID_ACTIVITY_FOR_ADVERTISER = new LineItemActivityAssociationErrorReason(_INVALID_ACTIVITY_FOR_ADVERTISER);
    public static final LineItemActivityAssociationErrorReason INVALID_COST_TYPE_FOR_ASSOCIATION = new LineItemActivityAssociationErrorReason(_INVALID_COST_TYPE_FOR_ASSOCIATION);
    public static final LineItemActivityAssociationErrorReason UNKNOWN = new LineItemActivityAssociationErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static LineItemActivityAssociationErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LineItemActivityAssociationErrorReason enumeration = (LineItemActivityAssociationErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LineItemActivityAssociationErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LineItemActivityAssociationErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "LineItemActivityAssociationError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
