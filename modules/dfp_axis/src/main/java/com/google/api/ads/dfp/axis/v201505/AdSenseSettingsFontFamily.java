/**
 * AdSenseSettingsFontFamily.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;

public class AdSenseSettingsFontFamily implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdSenseSettingsFontFamily(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEFAULT = "DEFAULT";
    public static final java.lang.String _ARIAL = "ARIAL";
    public static final java.lang.String _TAHOMA = "TAHOMA";
    public static final java.lang.String _GEORGIA = "GEORGIA";
    public static final java.lang.String _TIMES = "TIMES";
    public static final java.lang.String _VERDANA = "VERDANA";
    public static final AdSenseSettingsFontFamily DEFAULT = new AdSenseSettingsFontFamily(_DEFAULT);
    public static final AdSenseSettingsFontFamily ARIAL = new AdSenseSettingsFontFamily(_ARIAL);
    public static final AdSenseSettingsFontFamily TAHOMA = new AdSenseSettingsFontFamily(_TAHOMA);
    public static final AdSenseSettingsFontFamily GEORGIA = new AdSenseSettingsFontFamily(_GEORGIA);
    public static final AdSenseSettingsFontFamily TIMES = new AdSenseSettingsFontFamily(_TIMES);
    public static final AdSenseSettingsFontFamily VERDANA = new AdSenseSettingsFontFamily(_VERDANA);
    public java.lang.String getValue() { return _value_;}
    public static AdSenseSettingsFontFamily fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdSenseSettingsFontFamily enumeration = (AdSenseSettingsFontFamily)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdSenseSettingsFontFamily fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdSenseSettingsFontFamily.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "AdSenseSettings.FontFamily"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
