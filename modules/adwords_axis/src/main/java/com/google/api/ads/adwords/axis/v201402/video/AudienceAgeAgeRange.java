/**
 * AudienceAgeAgeRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class AudienceAgeAgeRange implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AudienceAgeAgeRange(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AGE_RANGE_18_24 = "AGE_RANGE_18_24";
    public static final java.lang.String _AGE_RANGE_25_34 = "AGE_RANGE_25_34";
    public static final java.lang.String _AGE_RANGE_35_44 = "AGE_RANGE_35_44";
    public static final java.lang.String _AGE_RANGE_45_54 = "AGE_RANGE_45_54";
    public static final java.lang.String _AGE_RANGE_55_64 = "AGE_RANGE_55_64";
    public static final java.lang.String _AGE_RANGE_65_UP = "AGE_RANGE_65_UP";
    public static final java.lang.String _AGE_RANGE_UNDETERMINED = "AGE_RANGE_UNDETERMINED";
    public static final AudienceAgeAgeRange AGE_RANGE_18_24 = new AudienceAgeAgeRange(_AGE_RANGE_18_24);
    public static final AudienceAgeAgeRange AGE_RANGE_25_34 = new AudienceAgeAgeRange(_AGE_RANGE_25_34);
    public static final AudienceAgeAgeRange AGE_RANGE_35_44 = new AudienceAgeAgeRange(_AGE_RANGE_35_44);
    public static final AudienceAgeAgeRange AGE_RANGE_45_54 = new AudienceAgeAgeRange(_AGE_RANGE_45_54);
    public static final AudienceAgeAgeRange AGE_RANGE_55_64 = new AudienceAgeAgeRange(_AGE_RANGE_55_64);
    public static final AudienceAgeAgeRange AGE_RANGE_65_UP = new AudienceAgeAgeRange(_AGE_RANGE_65_UP);
    public static final AudienceAgeAgeRange AGE_RANGE_UNDETERMINED = new AudienceAgeAgeRange(_AGE_RANGE_UNDETERMINED);
    public java.lang.String getValue() { return _value_;}
    public static AudienceAgeAgeRange fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AudienceAgeAgeRange enumeration = (AudienceAgeAgeRange)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AudienceAgeAgeRange fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AudienceAgeAgeRange.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "AudienceAge.AgeRange"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
