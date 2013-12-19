/**
 * RichMediaExitWindowProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaExitWindowProperties  implements java.io.Serializable {
    private int height;

    private int left;

    private boolean locationBar;

    private boolean menuBar;

    private boolean resizable;

    private boolean scrollBars;

    private boolean statusBar;

    private boolean toolBar;

    private int top;

    private int width;

    public RichMediaExitWindowProperties() {
    }

    public RichMediaExitWindowProperties(
           int height,
           int left,
           boolean locationBar,
           boolean menuBar,
           boolean resizable,
           boolean scrollBars,
           boolean statusBar,
           boolean toolBar,
           int top,
           int width) {
           this.height = height;
           this.left = left;
           this.locationBar = locationBar;
           this.menuBar = menuBar;
           this.resizable = resizable;
           this.scrollBars = scrollBars;
           this.statusBar = statusBar;
           this.toolBar = toolBar;
           this.top = top;
           this.width = width;
    }


    /**
     * Gets the height value for this RichMediaExitWindowProperties.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this RichMediaExitWindowProperties.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the left value for this RichMediaExitWindowProperties.
     * 
     * @return left
     */
    public int getLeft() {
        return left;
    }


    /**
     * Sets the left value for this RichMediaExitWindowProperties.
     * 
     * @param left
     */
    public void setLeft(int left) {
        this.left = left;
    }


    /**
     * Gets the locationBar value for this RichMediaExitWindowProperties.
     * 
     * @return locationBar
     */
    public boolean isLocationBar() {
        return locationBar;
    }


    /**
     * Sets the locationBar value for this RichMediaExitWindowProperties.
     * 
     * @param locationBar
     */
    public void setLocationBar(boolean locationBar) {
        this.locationBar = locationBar;
    }


    /**
     * Gets the menuBar value for this RichMediaExitWindowProperties.
     * 
     * @return menuBar
     */
    public boolean isMenuBar() {
        return menuBar;
    }


    /**
     * Sets the menuBar value for this RichMediaExitWindowProperties.
     * 
     * @param menuBar
     */
    public void setMenuBar(boolean menuBar) {
        this.menuBar = menuBar;
    }


    /**
     * Gets the resizable value for this RichMediaExitWindowProperties.
     * 
     * @return resizable
     */
    public boolean isResizable() {
        return resizable;
    }


    /**
     * Sets the resizable value for this RichMediaExitWindowProperties.
     * 
     * @param resizable
     */
    public void setResizable(boolean resizable) {
        this.resizable = resizable;
    }


    /**
     * Gets the scrollBars value for this RichMediaExitWindowProperties.
     * 
     * @return scrollBars
     */
    public boolean isScrollBars() {
        return scrollBars;
    }


    /**
     * Sets the scrollBars value for this RichMediaExitWindowProperties.
     * 
     * @param scrollBars
     */
    public void setScrollBars(boolean scrollBars) {
        this.scrollBars = scrollBars;
    }


    /**
     * Gets the statusBar value for this RichMediaExitWindowProperties.
     * 
     * @return statusBar
     */
    public boolean isStatusBar() {
        return statusBar;
    }


    /**
     * Sets the statusBar value for this RichMediaExitWindowProperties.
     * 
     * @param statusBar
     */
    public void setStatusBar(boolean statusBar) {
        this.statusBar = statusBar;
    }


    /**
     * Gets the toolBar value for this RichMediaExitWindowProperties.
     * 
     * @return toolBar
     */
    public boolean isToolBar() {
        return toolBar;
    }


    /**
     * Sets the toolBar value for this RichMediaExitWindowProperties.
     * 
     * @param toolBar
     */
    public void setToolBar(boolean toolBar) {
        this.toolBar = toolBar;
    }


    /**
     * Gets the top value for this RichMediaExitWindowProperties.
     * 
     * @return top
     */
    public int getTop() {
        return top;
    }


    /**
     * Sets the top value for this RichMediaExitWindowProperties.
     * 
     * @param top
     */
    public void setTop(int top) {
        this.top = top;
    }


    /**
     * Gets the width value for this RichMediaExitWindowProperties.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this RichMediaExitWindowProperties.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaExitWindowProperties)) return false;
        RichMediaExitWindowProperties other = (RichMediaExitWindowProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.height == other.getHeight() &&
            this.left == other.getLeft() &&
            this.locationBar == other.isLocationBar() &&
            this.menuBar == other.isMenuBar() &&
            this.resizable == other.isResizable() &&
            this.scrollBars == other.isScrollBars() &&
            this.statusBar == other.isStatusBar() &&
            this.toolBar == other.isToolBar() &&
            this.top == other.getTop() &&
            this.width == other.getWidth();
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
        _hashCode += getHeight();
        _hashCode += getLeft();
        _hashCode += (isLocationBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMenuBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isResizable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isScrollBars() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStatusBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToolBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getTop();
        _hashCode += getWidth();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaExitWindowProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExitWindowProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("left");
        elemField.setXmlName(new javax.xml.namespace.QName("", "left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationBar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationBar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuBar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menuBar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resizable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resizable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scrollBars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scrollBars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusBar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusBar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolBar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toolBar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top");
        elemField.setXmlName(new javax.xml.namespace.QName("", "top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "width"));
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
