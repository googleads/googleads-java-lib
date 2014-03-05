/**
 * DimensionFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201208;

public class DimensionFilter implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DimensionFilter(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ADVERTISERS = "ADVERTISERS";
    public static final java.lang.String _ACTIVE_ADVERTISERS = "ACTIVE_ADVERTISERS";
    public static final java.lang.String _HOUSE_ADVERTISERS = "HOUSE_ADVERTISERS";
    public static final java.lang.String _NON_HOUSE_ADVERTISERS = "NON_HOUSE_ADVERTISERS";
    public static final java.lang.String _ALL_SALESPEOPLE = "ALL_SALESPEOPLE";
    public static final java.lang.String _WHOLE_NETWORK = "WHOLE_NETWORK";
    public static final java.lang.String _CURRENT_USER_ORDERS = "CURRENT_USER_ORDERS";
    public static final java.lang.String _STARTED_ORDERS = "STARTED_ORDERS";
    public static final java.lang.String _COMPLETED_ORDERS = "COMPLETED_ORDERS";
    public static final java.lang.String _ACTIVE_AD_UNITS = "ACTIVE_AD_UNITS";
    public static final java.lang.String _INACTIVE_AD_UNITS = "INACTIVE_AD_UNITS";
    public static final java.lang.String _ARCHIVED_AD_UNITS = "ARCHIVED_AD_UNITS";
    public static final java.lang.String _ACTIVE_PLACEMENTS = "ACTIVE_PLACEMENTS";
    public static final java.lang.String _INACTIVE_PLACEMENTS = "INACTIVE_PLACEMENTS";
    public static final java.lang.String _ARCHIVED_PLACEMENTS = "ARCHIVED_PLACEMENTS";
    public static final java.lang.String _OPTIMIZABLE_ORDERS = "OPTIMIZABLE_ORDERS";
    public static final DimensionFilter ADVERTISERS = new DimensionFilter(_ADVERTISERS);
    public static final DimensionFilter ACTIVE_ADVERTISERS = new DimensionFilter(_ACTIVE_ADVERTISERS);
    public static final DimensionFilter HOUSE_ADVERTISERS = new DimensionFilter(_HOUSE_ADVERTISERS);
    public static final DimensionFilter NON_HOUSE_ADVERTISERS = new DimensionFilter(_NON_HOUSE_ADVERTISERS);
    public static final DimensionFilter ALL_SALESPEOPLE = new DimensionFilter(_ALL_SALESPEOPLE);
    public static final DimensionFilter WHOLE_NETWORK = new DimensionFilter(_WHOLE_NETWORK);
    public static final DimensionFilter CURRENT_USER_ORDERS = new DimensionFilter(_CURRENT_USER_ORDERS);
    public static final DimensionFilter STARTED_ORDERS = new DimensionFilter(_STARTED_ORDERS);
    public static final DimensionFilter COMPLETED_ORDERS = new DimensionFilter(_COMPLETED_ORDERS);
    public static final DimensionFilter ACTIVE_AD_UNITS = new DimensionFilter(_ACTIVE_AD_UNITS);
    public static final DimensionFilter INACTIVE_AD_UNITS = new DimensionFilter(_INACTIVE_AD_UNITS);
    public static final DimensionFilter ARCHIVED_AD_UNITS = new DimensionFilter(_ARCHIVED_AD_UNITS);
    public static final DimensionFilter ACTIVE_PLACEMENTS = new DimensionFilter(_ACTIVE_PLACEMENTS);
    public static final DimensionFilter INACTIVE_PLACEMENTS = new DimensionFilter(_INACTIVE_PLACEMENTS);
    public static final DimensionFilter ARCHIVED_PLACEMENTS = new DimensionFilter(_ARCHIVED_PLACEMENTS);
    public static final DimensionFilter OPTIMIZABLE_ORDERS = new DimensionFilter(_OPTIMIZABLE_ORDERS);
    public java.lang.String getValue() { return _value_;}
    public static DimensionFilter fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DimensionFilter enumeration = (DimensionFilter)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DimensionFilter fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DimensionFilter.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "DimensionFilter"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
