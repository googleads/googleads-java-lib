/**
 * RichMediaFloatingAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class RichMediaFloatingAsset  extends com.google.api.ads.dfa.axis.v1_19.RichMediaFlashAsset  implements java.io.Serializable {
    private java.lang.String ZIndex;

    private int duration;

    private boolean hideDropDowns;

    private boolean hideFlashObjects;

    private boolean hideIframes;

    private boolean hideJavaApplets;

    private boolean hideScrollBars;

    private int left;

    private boolean leftLockPosition;

    private java.lang.String leftUnit;

    private int startTime;

    private int top;

    private boolean topLockPosition;

    private java.lang.String topUnit;

    public RichMediaFloatingAsset() {
    }

    public RichMediaFloatingAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type,
           java.lang.String creativeFormat,
           int height,
           int width,
           java.lang.String wmode,
           java.lang.String ZIndex,
           int duration,
           boolean hideDropDowns,
           boolean hideFlashObjects,
           boolean hideIframes,
           boolean hideJavaApplets,
           boolean hideScrollBars,
           int left,
           boolean leftLockPosition,
           java.lang.String leftUnit,
           int startTime,
           int top,
           boolean topLockPosition,
           java.lang.String topUnit) {
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
        this.ZIndex = ZIndex;
        this.duration = duration;
        this.hideDropDowns = hideDropDowns;
        this.hideFlashObjects = hideFlashObjects;
        this.hideIframes = hideIframes;
        this.hideJavaApplets = hideJavaApplets;
        this.hideScrollBars = hideScrollBars;
        this.left = left;
        this.leftLockPosition = leftLockPosition;
        this.leftUnit = leftUnit;
        this.startTime = startTime;
        this.top = top;
        this.topLockPosition = topLockPosition;
        this.topUnit = topUnit;
    }


    /**
     * Gets the ZIndex value for this RichMediaFloatingAsset.
     * 
     * @return ZIndex
     */
    public java.lang.String getZIndex() {
        return ZIndex;
    }


    /**
     * Sets the ZIndex value for this RichMediaFloatingAsset.
     * 
     * @param ZIndex
     */
    public void setZIndex(java.lang.String ZIndex) {
        this.ZIndex = ZIndex;
    }


    /**
     * Gets the duration value for this RichMediaFloatingAsset.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this RichMediaFloatingAsset.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the hideDropDowns value for this RichMediaFloatingAsset.
     * 
     * @return hideDropDowns
     */
    public boolean isHideDropDowns() {
        return hideDropDowns;
    }


    /**
     * Sets the hideDropDowns value for this RichMediaFloatingAsset.
     * 
     * @param hideDropDowns
     */
    public void setHideDropDowns(boolean hideDropDowns) {
        this.hideDropDowns = hideDropDowns;
    }


    /**
     * Gets the hideFlashObjects value for this RichMediaFloatingAsset.
     * 
     * @return hideFlashObjects
     */
    public boolean isHideFlashObjects() {
        return hideFlashObjects;
    }


    /**
     * Sets the hideFlashObjects value for this RichMediaFloatingAsset.
     * 
     * @param hideFlashObjects
     */
    public void setHideFlashObjects(boolean hideFlashObjects) {
        this.hideFlashObjects = hideFlashObjects;
    }


    /**
     * Gets the hideIframes value for this RichMediaFloatingAsset.
     * 
     * @return hideIframes
     */
    public boolean isHideIframes() {
        return hideIframes;
    }


    /**
     * Sets the hideIframes value for this RichMediaFloatingAsset.
     * 
     * @param hideIframes
     */
    public void setHideIframes(boolean hideIframes) {
        this.hideIframes = hideIframes;
    }


    /**
     * Gets the hideJavaApplets value for this RichMediaFloatingAsset.
     * 
     * @return hideJavaApplets
     */
    public boolean isHideJavaApplets() {
        return hideJavaApplets;
    }


    /**
     * Sets the hideJavaApplets value for this RichMediaFloatingAsset.
     * 
     * @param hideJavaApplets
     */
    public void setHideJavaApplets(boolean hideJavaApplets) {
        this.hideJavaApplets = hideJavaApplets;
    }


    /**
     * Gets the hideScrollBars value for this RichMediaFloatingAsset.
     * 
     * @return hideScrollBars
     */
    public boolean isHideScrollBars() {
        return hideScrollBars;
    }


    /**
     * Sets the hideScrollBars value for this RichMediaFloatingAsset.
     * 
     * @param hideScrollBars
     */
    public void setHideScrollBars(boolean hideScrollBars) {
        this.hideScrollBars = hideScrollBars;
    }


    /**
     * Gets the left value for this RichMediaFloatingAsset.
     * 
     * @return left
     */
    public int getLeft() {
        return left;
    }


    /**
     * Sets the left value for this RichMediaFloatingAsset.
     * 
     * @param left
     */
    public void setLeft(int left) {
        this.left = left;
    }


    /**
     * Gets the leftLockPosition value for this RichMediaFloatingAsset.
     * 
     * @return leftLockPosition
     */
    public boolean isLeftLockPosition() {
        return leftLockPosition;
    }


    /**
     * Sets the leftLockPosition value for this RichMediaFloatingAsset.
     * 
     * @param leftLockPosition
     */
    public void setLeftLockPosition(boolean leftLockPosition) {
        this.leftLockPosition = leftLockPosition;
    }


    /**
     * Gets the leftUnit value for this RichMediaFloatingAsset.
     * 
     * @return leftUnit
     */
    public java.lang.String getLeftUnit() {
        return leftUnit;
    }


    /**
     * Sets the leftUnit value for this RichMediaFloatingAsset.
     * 
     * @param leftUnit
     */
    public void setLeftUnit(java.lang.String leftUnit) {
        this.leftUnit = leftUnit;
    }


    /**
     * Gets the startTime value for this RichMediaFloatingAsset.
     * 
     * @return startTime
     */
    public int getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this RichMediaFloatingAsset.
     * 
     * @param startTime
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the top value for this RichMediaFloatingAsset.
     * 
     * @return top
     */
    public int getTop() {
        return top;
    }


    /**
     * Sets the top value for this RichMediaFloatingAsset.
     * 
     * @param top
     */
    public void setTop(int top) {
        this.top = top;
    }


    /**
     * Gets the topLockPosition value for this RichMediaFloatingAsset.
     * 
     * @return topLockPosition
     */
    public boolean isTopLockPosition() {
        return topLockPosition;
    }


    /**
     * Sets the topLockPosition value for this RichMediaFloatingAsset.
     * 
     * @param topLockPosition
     */
    public void setTopLockPosition(boolean topLockPosition) {
        this.topLockPosition = topLockPosition;
    }


    /**
     * Gets the topUnit value for this RichMediaFloatingAsset.
     * 
     * @return topUnit
     */
    public java.lang.String getTopUnit() {
        return topUnit;
    }


    /**
     * Sets the topUnit value for this RichMediaFloatingAsset.
     * 
     * @param topUnit
     */
    public void setTopUnit(java.lang.String topUnit) {
        this.topUnit = topUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaFloatingAsset)) return false;
        RichMediaFloatingAsset other = (RichMediaFloatingAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ZIndex==null && other.getZIndex()==null) || 
             (this.ZIndex!=null &&
              this.ZIndex.equals(other.getZIndex()))) &&
            this.duration == other.getDuration() &&
            this.hideDropDowns == other.isHideDropDowns() &&
            this.hideFlashObjects == other.isHideFlashObjects() &&
            this.hideIframes == other.isHideIframes() &&
            this.hideJavaApplets == other.isHideJavaApplets() &&
            this.hideScrollBars == other.isHideScrollBars() &&
            this.left == other.getLeft() &&
            this.leftLockPosition == other.isLeftLockPosition() &&
            ((this.leftUnit==null && other.getLeftUnit()==null) || 
             (this.leftUnit!=null &&
              this.leftUnit.equals(other.getLeftUnit()))) &&
            this.startTime == other.getStartTime() &&
            this.top == other.getTop() &&
            this.topLockPosition == other.isTopLockPosition() &&
            ((this.topUnit==null && other.getTopUnit()==null) || 
             (this.topUnit!=null &&
              this.topUnit.equals(other.getTopUnit())));
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
        if (getZIndex() != null) {
            _hashCode += getZIndex().hashCode();
        }
        _hashCode += getDuration();
        _hashCode += (isHideDropDowns() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideFlashObjects() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideIframes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideJavaApplets() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideScrollBars() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLeft();
        _hashCode += (isLeftLockPosition() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLeftUnit() != null) {
            _hashCode += getLeftUnit().hashCode();
        }
        _hashCode += getStartTime();
        _hashCode += getTop();
        _hashCode += (isTopLockPosition() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTopUnit() != null) {
            _hashCode += getTopUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaFloatingAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaFloatingAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideDropDowns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hideDropDowns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideFlashObjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hideFlashObjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideIframes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hideIframes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideJavaApplets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hideJavaApplets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideScrollBars");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hideScrollBars"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("left");
        elemField.setXmlName(new javax.xml.namespace.QName("", "left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftLockPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftLockPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top");
        elemField.setXmlName(new javax.xml.namespace.QName("", "top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topLockPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topLockPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topUnit"));
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
