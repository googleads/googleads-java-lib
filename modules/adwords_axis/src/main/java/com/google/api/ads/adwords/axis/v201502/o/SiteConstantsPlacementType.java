/**
 * SiteConstantsPlacementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.o;

public class SiteConstantsPlacementType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SiteConstantsPlacementType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _SITE = "SITE";
    public static final java.lang.String _VIDEO = "VIDEO";
    public static final java.lang.String _FEED = "FEED";
    public static final java.lang.String _GAME = "GAME";
    public static final java.lang.String _MOBILE = "MOBILE";
    public static final SiteConstantsPlacementType UNKNOWN = new SiteConstantsPlacementType(_UNKNOWN);
    public static final SiteConstantsPlacementType SITE = new SiteConstantsPlacementType(_SITE);
    public static final SiteConstantsPlacementType VIDEO = new SiteConstantsPlacementType(_VIDEO);
    public static final SiteConstantsPlacementType FEED = new SiteConstantsPlacementType(_FEED);
    public static final SiteConstantsPlacementType GAME = new SiteConstantsPlacementType(_GAME);
    public static final SiteConstantsPlacementType MOBILE = new SiteConstantsPlacementType(_MOBILE);
    public java.lang.String getValue() { return _value_;}
    public static SiteConstantsPlacementType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SiteConstantsPlacementType enumeration = (SiteConstantsPlacementType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SiteConstantsPlacementType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SiteConstantsPlacementType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201502", "SiteConstants.PlacementType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
