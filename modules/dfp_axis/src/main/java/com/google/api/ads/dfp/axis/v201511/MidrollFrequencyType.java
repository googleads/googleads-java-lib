/**
 * MidrollFrequencyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201511;

public class MidrollFrequencyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MidrollFrequencyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _EVERY_N_SECONDS = "EVERY_N_SECONDS";
    public static final java.lang.String _FIXED_TIME = "FIXED_TIME";
    public static final java.lang.String _EVERY_N_CUEPOINTS = "EVERY_N_CUEPOINTS";
    public static final java.lang.String _FIXED_CUE_POINTS = "FIXED_CUE_POINTS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final MidrollFrequencyType NONE = new MidrollFrequencyType(_NONE);
    public static final MidrollFrequencyType EVERY_N_SECONDS = new MidrollFrequencyType(_EVERY_N_SECONDS);
    public static final MidrollFrequencyType FIXED_TIME = new MidrollFrequencyType(_FIXED_TIME);
    public static final MidrollFrequencyType EVERY_N_CUEPOINTS = new MidrollFrequencyType(_EVERY_N_CUEPOINTS);
    public static final MidrollFrequencyType FIXED_CUE_POINTS = new MidrollFrequencyType(_FIXED_CUE_POINTS);
    public static final MidrollFrequencyType UNKNOWN = new MidrollFrequencyType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static MidrollFrequencyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MidrollFrequencyType enumeration = (MidrollFrequencyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MidrollFrequencyType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MidrollFrequencyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201511", "MidrollFrequencyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
