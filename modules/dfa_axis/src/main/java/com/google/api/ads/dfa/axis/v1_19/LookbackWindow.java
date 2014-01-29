/**
 * LookbackWindow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class LookbackWindow  implements java.io.Serializable {
    private int postClickEventLookbackWindow;

    private int postImpressionEventLookbackWindow;

    private int richMediaEventLookbackWindow;

    public LookbackWindow() {
    }

    public LookbackWindow(
           int postClickEventLookbackWindow,
           int postImpressionEventLookbackWindow,
           int richMediaEventLookbackWindow) {
           this.postClickEventLookbackWindow = postClickEventLookbackWindow;
           this.postImpressionEventLookbackWindow = postImpressionEventLookbackWindow;
           this.richMediaEventLookbackWindow = richMediaEventLookbackWindow;
    }


    /**
     * Gets the postClickEventLookbackWindow value for this LookbackWindow.
     * 
     * @return postClickEventLookbackWindow
     */
    public int getPostClickEventLookbackWindow() {
        return postClickEventLookbackWindow;
    }


    /**
     * Sets the postClickEventLookbackWindow value for this LookbackWindow.
     * 
     * @param postClickEventLookbackWindow
     */
    public void setPostClickEventLookbackWindow(int postClickEventLookbackWindow) {
        this.postClickEventLookbackWindow = postClickEventLookbackWindow;
    }


    /**
     * Gets the postImpressionEventLookbackWindow value for this LookbackWindow.
     * 
     * @return postImpressionEventLookbackWindow
     */
    public int getPostImpressionEventLookbackWindow() {
        return postImpressionEventLookbackWindow;
    }


    /**
     * Sets the postImpressionEventLookbackWindow value for this LookbackWindow.
     * 
     * @param postImpressionEventLookbackWindow
     */
    public void setPostImpressionEventLookbackWindow(int postImpressionEventLookbackWindow) {
        this.postImpressionEventLookbackWindow = postImpressionEventLookbackWindow;
    }


    /**
     * Gets the richMediaEventLookbackWindow value for this LookbackWindow.
     * 
     * @return richMediaEventLookbackWindow
     */
    public int getRichMediaEventLookbackWindow() {
        return richMediaEventLookbackWindow;
    }


    /**
     * Sets the richMediaEventLookbackWindow value for this LookbackWindow.
     * 
     * @param richMediaEventLookbackWindow
     */
    public void setRichMediaEventLookbackWindow(int richMediaEventLookbackWindow) {
        this.richMediaEventLookbackWindow = richMediaEventLookbackWindow;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookbackWindow)) return false;
        LookbackWindow other = (LookbackWindow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.postClickEventLookbackWindow == other.getPostClickEventLookbackWindow() &&
            this.postImpressionEventLookbackWindow == other.getPostImpressionEventLookbackWindow() &&
            this.richMediaEventLookbackWindow == other.getRichMediaEventLookbackWindow();
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
        _hashCode += getPostClickEventLookbackWindow();
        _hashCode += getPostImpressionEventLookbackWindow();
        _hashCode += getRichMediaEventLookbackWindow();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookbackWindow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LookbackWindow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postClickEventLookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postClickEventLookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postImpressionEventLookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postImpressionEventLookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richMediaEventLookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "richMediaEventLookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
