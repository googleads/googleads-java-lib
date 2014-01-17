/**
 * RichMediaExpandingAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class RichMediaExpandingAsset  extends com.google.api.ads.dfa.axis.v1_19.RichMediaFlashAsset  implements java.io.Serializable {
    private java.lang.String ZIndex;

    private com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset alternateImage;

    private int bottomOffset;

    private int expandedHeight;

    private int expandedWidth;

    private boolean hideDropDowns;

    private boolean hideFlashObjects;

    private boolean hideIframes;

    private boolean hideJavaApplets;

    private boolean hideScrollBars;

    private int leftOffset;

    private boolean multidirectional;

    private boolean pushDown;

    private double pushdownAnimationTime;

    private int rightOffset;

    private int topOffset;

    public RichMediaExpandingAsset() {
    }

    public RichMediaExpandingAsset(
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
           com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset alternateImage,
           int bottomOffset,
           int expandedHeight,
           int expandedWidth,
           boolean hideDropDowns,
           boolean hideFlashObjects,
           boolean hideIframes,
           boolean hideJavaApplets,
           boolean hideScrollBars,
           int leftOffset,
           boolean multidirectional,
           boolean pushDown,
           double pushdownAnimationTime,
           int rightOffset,
           int topOffset) {
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
        this.alternateImage = alternateImage;
        this.bottomOffset = bottomOffset;
        this.expandedHeight = expandedHeight;
        this.expandedWidth = expandedWidth;
        this.hideDropDowns = hideDropDowns;
        this.hideFlashObjects = hideFlashObjects;
        this.hideIframes = hideIframes;
        this.hideJavaApplets = hideJavaApplets;
        this.hideScrollBars = hideScrollBars;
        this.leftOffset = leftOffset;
        this.multidirectional = multidirectional;
        this.pushDown = pushDown;
        this.pushdownAnimationTime = pushdownAnimationTime;
        this.rightOffset = rightOffset;
        this.topOffset = topOffset;
    }


    /**
     * Gets the ZIndex value for this RichMediaExpandingAsset.
     * 
     * @return ZIndex
     */
    public java.lang.String getZIndex() {
        return ZIndex;
    }


    /**
     * Sets the ZIndex value for this RichMediaExpandingAsset.
     * 
     * @param ZIndex
     */
    public void setZIndex(java.lang.String ZIndex) {
        this.ZIndex = ZIndex;
    }


    /**
     * Gets the alternateImage value for this RichMediaExpandingAsset.
     * 
     * @return alternateImage
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset getAlternateImage() {
        return alternateImage;
    }


    /**
     * Sets the alternateImage value for this RichMediaExpandingAsset.
     * 
     * @param alternateImage
     */
    public void setAlternateImage(com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset alternateImage) {
        this.alternateImage = alternateImage;
    }


    /**
     * Gets the bottomOffset value for this RichMediaExpandingAsset.
     * 
     * @return bottomOffset
     */
    public int getBottomOffset() {
        return bottomOffset;
    }


    /**
     * Sets the bottomOffset value for this RichMediaExpandingAsset.
     * 
     * @param bottomOffset
     */
    public void setBottomOffset(int bottomOffset) {
        this.bottomOffset = bottomOffset;
    }


    /**
     * Gets the expandedHeight value for this RichMediaExpandingAsset.
     * 
     * @return expandedHeight
     */
    public int getExpandedHeight() {
        return expandedHeight;
    }


    /**
     * Sets the expandedHeight value for this RichMediaExpandingAsset.
     * 
     * @param expandedHeight
     */
    public void setExpandedHeight(int expandedHeight) {
        this.expandedHeight = expandedHeight;
    }


    /**
     * Gets the expandedWidth value for this RichMediaExpandingAsset.
     * 
     * @return expandedWidth
     */
    public int getExpandedWidth() {
        return expandedWidth;
    }


    /**
     * Sets the expandedWidth value for this RichMediaExpandingAsset.
     * 
     * @param expandedWidth
     */
    public void setExpandedWidth(int expandedWidth) {
        this.expandedWidth = expandedWidth;
    }


    /**
     * Gets the hideDropDowns value for this RichMediaExpandingAsset.
     * 
     * @return hideDropDowns
     */
    public boolean isHideDropDowns() {
        return hideDropDowns;
    }


    /**
     * Sets the hideDropDowns value for this RichMediaExpandingAsset.
     * 
     * @param hideDropDowns
     */
    public void setHideDropDowns(boolean hideDropDowns) {
        this.hideDropDowns = hideDropDowns;
    }


    /**
     * Gets the hideFlashObjects value for this RichMediaExpandingAsset.
     * 
     * @return hideFlashObjects
     */
    public boolean isHideFlashObjects() {
        return hideFlashObjects;
    }


    /**
     * Sets the hideFlashObjects value for this RichMediaExpandingAsset.
     * 
     * @param hideFlashObjects
     */
    public void setHideFlashObjects(boolean hideFlashObjects) {
        this.hideFlashObjects = hideFlashObjects;
    }


    /**
     * Gets the hideIframes value for this RichMediaExpandingAsset.
     * 
     * @return hideIframes
     */
    public boolean isHideIframes() {
        return hideIframes;
    }


    /**
     * Sets the hideIframes value for this RichMediaExpandingAsset.
     * 
     * @param hideIframes
     */
    public void setHideIframes(boolean hideIframes) {
        this.hideIframes = hideIframes;
    }


    /**
     * Gets the hideJavaApplets value for this RichMediaExpandingAsset.
     * 
     * @return hideJavaApplets
     */
    public boolean isHideJavaApplets() {
        return hideJavaApplets;
    }


    /**
     * Sets the hideJavaApplets value for this RichMediaExpandingAsset.
     * 
     * @param hideJavaApplets
     */
    public void setHideJavaApplets(boolean hideJavaApplets) {
        this.hideJavaApplets = hideJavaApplets;
    }


    /**
     * Gets the hideScrollBars value for this RichMediaExpandingAsset.
     * 
     * @return hideScrollBars
     */
    public boolean isHideScrollBars() {
        return hideScrollBars;
    }


    /**
     * Sets the hideScrollBars value for this RichMediaExpandingAsset.
     * 
     * @param hideScrollBars
     */
    public void setHideScrollBars(boolean hideScrollBars) {
        this.hideScrollBars = hideScrollBars;
    }


    /**
     * Gets the leftOffset value for this RichMediaExpandingAsset.
     * 
     * @return leftOffset
     */
    public int getLeftOffset() {
        return leftOffset;
    }


    /**
     * Sets the leftOffset value for this RichMediaExpandingAsset.
     * 
     * @param leftOffset
     */
    public void setLeftOffset(int leftOffset) {
        this.leftOffset = leftOffset;
    }


    /**
     * Gets the multidirectional value for this RichMediaExpandingAsset.
     * 
     * @return multidirectional
     */
    public boolean isMultidirectional() {
        return multidirectional;
    }


    /**
     * Sets the multidirectional value for this RichMediaExpandingAsset.
     * 
     * @param multidirectional
     */
    public void setMultidirectional(boolean multidirectional) {
        this.multidirectional = multidirectional;
    }


    /**
     * Gets the pushDown value for this RichMediaExpandingAsset.
     * 
     * @return pushDown
     */
    public boolean isPushDown() {
        return pushDown;
    }


    /**
     * Sets the pushDown value for this RichMediaExpandingAsset.
     * 
     * @param pushDown
     */
    public void setPushDown(boolean pushDown) {
        this.pushDown = pushDown;
    }


    /**
     * Gets the pushdownAnimationTime value for this RichMediaExpandingAsset.
     * 
     * @return pushdownAnimationTime
     */
    public double getPushdownAnimationTime() {
        return pushdownAnimationTime;
    }


    /**
     * Sets the pushdownAnimationTime value for this RichMediaExpandingAsset.
     * 
     * @param pushdownAnimationTime
     */
    public void setPushdownAnimationTime(double pushdownAnimationTime) {
        this.pushdownAnimationTime = pushdownAnimationTime;
    }


    /**
     * Gets the rightOffset value for this RichMediaExpandingAsset.
     * 
     * @return rightOffset
     */
    public int getRightOffset() {
        return rightOffset;
    }


    /**
     * Sets the rightOffset value for this RichMediaExpandingAsset.
     * 
     * @param rightOffset
     */
    public void setRightOffset(int rightOffset) {
        this.rightOffset = rightOffset;
    }


    /**
     * Gets the topOffset value for this RichMediaExpandingAsset.
     * 
     * @return topOffset
     */
    public int getTopOffset() {
        return topOffset;
    }


    /**
     * Sets the topOffset value for this RichMediaExpandingAsset.
     * 
     * @param topOffset
     */
    public void setTopOffset(int topOffset) {
        this.topOffset = topOffset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaExpandingAsset)) return false;
        RichMediaExpandingAsset other = (RichMediaExpandingAsset) obj;
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
            ((this.alternateImage==null && other.getAlternateImage()==null) || 
             (this.alternateImage!=null &&
              this.alternateImage.equals(other.getAlternateImage()))) &&
            this.bottomOffset == other.getBottomOffset() &&
            this.expandedHeight == other.getExpandedHeight() &&
            this.expandedWidth == other.getExpandedWidth() &&
            this.hideDropDowns == other.isHideDropDowns() &&
            this.hideFlashObjects == other.isHideFlashObjects() &&
            this.hideIframes == other.isHideIframes() &&
            this.hideJavaApplets == other.isHideJavaApplets() &&
            this.hideScrollBars == other.isHideScrollBars() &&
            this.leftOffset == other.getLeftOffset() &&
            this.multidirectional == other.isMultidirectional() &&
            this.pushDown == other.isPushDown() &&
            this.pushdownAnimationTime == other.getPushdownAnimationTime() &&
            this.rightOffset == other.getRightOffset() &&
            this.topOffset == other.getTopOffset();
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
        if (getAlternateImage() != null) {
            _hashCode += getAlternateImage().hashCode();
        }
        _hashCode += getBottomOffset();
        _hashCode += getExpandedHeight();
        _hashCode += getExpandedWidth();
        _hashCode += (isHideDropDowns() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideFlashObjects() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideIframes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideJavaApplets() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideScrollBars() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLeftOffset();
        _hashCode += (isMultidirectional() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPushDown() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getPushdownAnimationTime()).hashCode();
        _hashCode += getRightOffset();
        _hashCode += getTopOffset();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaExpandingAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaExpandingAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternateImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaImageAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bottomOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bottomOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expandedHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandedWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expandedWidth"));
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
        elemField.setFieldName("leftOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leftOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multidirectional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multidirectional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushDown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushDown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushdownAnimationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushdownAnimationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rightOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topOffset"));
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
