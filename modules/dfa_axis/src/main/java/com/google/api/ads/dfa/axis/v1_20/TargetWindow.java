/**
 * TargetWindow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class TargetWindow  implements java.io.Serializable {
    private java.lang.String option;

    private java.lang.String otherValue;

    public TargetWindow() {
    }

    public TargetWindow(
           java.lang.String option,
           java.lang.String otherValue) {
           this.option = option;
           this.otherValue = otherValue;
    }


    /**
     * Gets the option value for this TargetWindow.
     * 
     * @return option
     */
    public java.lang.String getOption() {
        return option;
    }


    /**
     * Sets the option value for this TargetWindow.
     * 
     * @param option
     */
    public void setOption(java.lang.String option) {
        this.option = option;
    }


    /**
     * Gets the otherValue value for this TargetWindow.
     * 
     * @return otherValue
     */
    public java.lang.String getOtherValue() {
        return otherValue;
    }


    /**
     * Sets the otherValue value for this TargetWindow.
     * 
     * @param otherValue
     */
    public void setOtherValue(java.lang.String otherValue) {
        this.otherValue = otherValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetWindow)) return false;
        TargetWindow other = (TargetWindow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              this.option.equals(other.getOption()))) &&
            ((this.otherValue==null && other.getOtherValue()==null) || 
             (this.otherValue!=null &&
              this.otherValue.equals(other.getOtherValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOption() != null) {
            _hashCode += getOption().hashCode();
        }
        if (getOtherValue() != null) {
            _hashCode += getOtherValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetWindow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TargetWindow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
