/**
 * AppConversionAppConversionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public class AppConversionAppConversionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AppConversionAppConversionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _DOWNLOAD = "DOWNLOAD";
    public static final java.lang.String _IN_APP_PURCHASE = "IN_APP_PURCHASE";
    public static final java.lang.String _FIRST_OPEN = "FIRST_OPEN";
    public static final AppConversionAppConversionType NONE = new AppConversionAppConversionType(_NONE);
    public static final AppConversionAppConversionType DOWNLOAD = new AppConversionAppConversionType(_DOWNLOAD);
    public static final AppConversionAppConversionType IN_APP_PURCHASE = new AppConversionAppConversionType(_IN_APP_PURCHASE);
    public static final AppConversionAppConversionType FIRST_OPEN = new AppConversionAppConversionType(_FIRST_OPEN);
    public java.lang.String getValue() { return _value_;}
    public static AppConversionAppConversionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AppConversionAppConversionType enumeration = (AppConversionAppConversionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AppConversionAppConversionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AppConversionAppConversionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AppConversion.AppConversionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
