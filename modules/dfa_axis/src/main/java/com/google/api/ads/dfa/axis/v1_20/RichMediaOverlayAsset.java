/**
 * RichMediaOverlayAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaOverlayAsset  extends com.google.api.ads.dfa.axis.v1_20.RichMediaFlashAsset  implements java.io.Serializable {
    private boolean addressBar;

    private int duration;

    private int left;

    private java.lang.String leftUnit;

    private boolean menuBar;

    private boolean overlay;

    private int startTime;

    private boolean statusBar;

    private boolean toolBar;

    private int top;

    private java.lang.String topUnit;

    private java.lang.String windowTitle;

    public RichMediaOverlayAsset() {
    }

    public RichMediaOverlayAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type,
           java.lang.String creativeFormat,
           int height,
           int width,
           java.lang.String wmode,
           boolean addressBar,
           int duration,
           int left,
           java.lang.String leftUnit,
           boolean menuBar,
           boolean overlay,
           int startTime,
           boolean statusBar,
           boolean toolBar,
           int top,
           java.lang.String topUnit,
           java.lang.String windowTitle) {
        super(
            fileName,
            fileSize,
            id,
            parentAssetId,
            type,
            creativeFormat,
            height,
            width,
            wmode);
        this.addressBar = addressBar;
        this.duration = duration;
        this.left = left;
        this.leftUnit = leftUnit;
        this.menuBar = menuBar;
        this.overlay = overlay;
        this.startTime = startTime;
        this.statusBar = statusBar;
        this.toolBar = toolBar;
        this.top = top;
        this.topUnit = topUnit;
        this.windowTitle = windowTitle;
    }


    /**
     * Gets the addressBar value for this RichMediaOverlayAsset.
     * 
     * @return addressBar
     */
    public boolean isAddressBar() {
        return addressBar;
    }


    /**
     * Sets the addressBar value for this RichMediaOverlayAsset.
     * 
     * @param addressBar
     */
    public void setAddressBar(boolean addressBar) {
        this.addressBar = addressBar;
    }


    /**
     * Gets the duration value for this RichMediaOverlayAsset.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this RichMediaOverlayAsset.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the left value for this RichMediaOverlayAsset.
     * 
     * @return left
     */
    public int getLeft() {
        return left;
    }


    /**
     * Sets the left value for this RichMediaOverlayAsset.
     * 
     * @param left
     */
    public void setLeft(int left) {
        this.left = left;
    }


    /**
     * Gets the leftUnit value for this RichMediaOverlayAsset.
     * 
     * @return leftUnit
     */
    public java.lang.String getLeftUnit() {
        return leftUnit;
    }


    /**
     * Sets the leftUnit value for this RichMediaOverlayAsset.
     * 
     * @param leftUnit
     */
    public void setLeftUnit(java.lang.String leftUnit) {
        this.leftUnit = leftUnit;
    }


    /**
     * Gets the menuBar value for this RichMediaOverlayAsset.
     * 
     * @return menuBar
     */
    public boolean isMenuBar() {
        return menuBar;
    }


    /**
     * Sets the menuBar value for this RichMediaOverlayAsset.
     * 
     * @param menuBar
     */
    public void setMenuBar(boolean menuBar) {
        this.menuBar = menuBar;
    }


    /**
     * Gets the overlay value for this RichMediaOverlayAsset.
     * 
     * @return overlay
     */
    public boolean isOverlay() {
        return overlay;
    }


    /**
     * Sets the overlay value for this RichMediaOverlayAsset.
     * 
     * @param overlay
     */
    public void setOverlay(boolean overlay) {
        this.overlay = overlay;
    }


    /**
     * Gets the startTime value for this RichMediaOverlayAsset.
     * 
     * @return startTime
     */
    public int getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this RichMediaOverlayAsset.
     * 
     * @param startTime
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the statusBar value for this RichMediaOverlayAsset.
     * 
     * @return statusBar
     */
    public boolean isStatusBar() {
        return statusBar;
    }


    /**
     * Sets the statusBar value for this RichMediaOverlayAsset.
     * 
     * @param statusBar
     */
    public void setStatusBar(boolean statusBar) {
        this.statusBar = statusBar;
    }


    /**
     * Gets the toolBar value for this RichMediaOverlayAsset.
     * 
     * @return toolBar
     */
    public boolean isToolBar() {
        return toolBar;
    }


    /**
     * Sets the toolBar value for this RichMediaOverlayAsset.
     * 
     * @param toolBar
     */
    public void setToolBar(boolean toolBar) {
        this.toolBar = toolBar;
    }


    /**
     * Gets the top value for this RichMediaOverlayAsset.
     * 
     * @return top
     */
    public int getTop() {
        return top;
    }


    /**
     * Sets the top value for this RichMediaOverlayAsset.
     * 
     * @param top
     */
    public void setTop(int top) {
        this.top = top;
    }


    /**
     * Gets the topUnit value for this RichMediaOverlayAsset.
     * 
     * @return topUnit
     */
    public java.lang.String getTopUnit() {
        return topUnit;
    }


    /**
     * Sets the topUnit value for this RichMediaOverlayAsset.
     * 
     * @param topUnit
     */
    public void setTopUnit(java.lang.String topUnit) {
        this.topUnit = topUnit;
    }


    /**
     * Gets the windowTitle value for this RichMediaOverlayAsset.
     * 
     * @return windowTitle
     */
    public java.lang.String getWindowTitle() {
        return windowTitle;
    }


    /**
     * Sets the windowTitle value for this RichMediaOverlayAsset.
     * 
     * @param windowTitle
     */
    public void setWindowTitle(java.lang.String windowTitle) {
        this.windowTitle = windowTitle;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaOverlayAsset)) return false;
        RichMediaOverlayAsset other = (RichMediaOverlayAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.addressBar == other.isAddressBar() &&
            this.duration == other.getDuration() &&
            this.left == other.getLeft() &&
            ((this.leftUnit==null && other.getLeftUnit()==null) || 
             (this.leftUnit!=null &&
              this.leftUnit.equals(other.getLeftUnit()))) &&
            this.menuBar == other.isMenuBar() &&
            this.overlay == other.isOverlay() &&
            this.startTime == other.getStartTime() &&
            this.statusBar == other.isStatusBar() &&
            this.toolBar == other.isToolBar() &&
            this.top == other.getTop() &&
            ((this.topUnit==null && other.getTopUnit()==null) || 
             (this.topUnit!=null &&
              this.topUnit.equals(other.getTopUnit()))) &&
            ((this.windowTitle==null && other.getWindowTitle()==null) || 
             (this.windowTitle!=null &&
              this.windowTitle.equals(other.getWindowTitle())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isAddressBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDuration();
        _hashCode += getLeft();
        if (getLeftUnit() != null) {
            _hashCode += getLeftUnit().hashCode();
        }
        _hashCode += (isMenuBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOverlay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getStartTime();
        _hashCode += (isStatusBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToolBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getTop();
        if (getTopUnit() != null) {
            _hashCode += getTopUnit().hashCode();
        }
        if (getWindowTitle() != null) {
            _hashCode += getWindowTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaOverlayAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaOverlayAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressBar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressBar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
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
        elemField.setFieldName("leftUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuBar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menuBar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overlay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overlay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("topUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "windowTitle"));
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
