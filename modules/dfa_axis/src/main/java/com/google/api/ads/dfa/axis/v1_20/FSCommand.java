/**
 * FSCommand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class FSCommand  implements java.io.Serializable {
    private int left;

    private java.lang.String option;

    private int top;

    private com.google.api.ads.dfa.axis.v1_20.Dimensions windowDimensions;

    public FSCommand() {
    }

    public FSCommand(
           int left,
           java.lang.String option,
           int top,
           com.google.api.ads.dfa.axis.v1_20.Dimensions windowDimensions) {
           this.left = left;
           this.option = option;
           this.top = top;
           this.windowDimensions = windowDimensions;
    }


    /**
     * Gets the left value for this FSCommand.
     * 
     * @return left
     */
    public int getLeft() {
        return left;
    }


    /**
     * Sets the left value for this FSCommand.
     * 
     * @param left
     */
    public void setLeft(int left) {
        this.left = left;
    }


    /**
     * Gets the option value for this FSCommand.
     * 
     * @return option
     */
    public java.lang.String getOption() {
        return option;
    }


    /**
     * Sets the option value for this FSCommand.
     * 
     * @param option
     */
    public void setOption(java.lang.String option) {
        this.option = option;
    }


    /**
     * Gets the top value for this FSCommand.
     * 
     * @return top
     */
    public int getTop() {
        return top;
    }


    /**
     * Sets the top value for this FSCommand.
     * 
     * @param top
     */
    public void setTop(int top) {
        this.top = top;
    }


    /**
     * Gets the windowDimensions value for this FSCommand.
     * 
     * @return windowDimensions
     */
    public com.google.api.ads.dfa.axis.v1_20.Dimensions getWindowDimensions() {
        return windowDimensions;
    }


    /**
     * Sets the windowDimensions value for this FSCommand.
     * 
     * @param windowDimensions
     */
    public void setWindowDimensions(com.google.api.ads.dfa.axis.v1_20.Dimensions windowDimensions) {
        this.windowDimensions = windowDimensions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FSCommand)) return false;
        FSCommand other = (FSCommand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.left == other.getLeft() &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              this.option.equals(other.getOption()))) &&
            this.top == other.getTop() &&
            ((this.windowDimensions==null && other.getWindowDimensions()==null) || 
             (this.windowDimensions!=null &&
              this.windowDimensions.equals(other.getWindowDimensions())));
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
        _hashCode += getLeft();
        if (getOption() != null) {
            _hashCode += getOption().hashCode();
        }
        _hashCode += getTop();
        if (getWindowDimensions() != null) {
            _hashCode += getWindowDimensions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FSCommand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FSCommand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("left");
        elemField.setXmlName(new javax.xml.namespace.QName("", "left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top");
        elemField.setXmlName(new javax.xml.namespace.QName("", "top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "windowDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Dimensions"));
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
