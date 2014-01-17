/**
 * RichMediaImageWithFloatingCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class RichMediaImageWithFloatingCreative  extends com.google.api.ads.dfa.axis.v1_19.RichMediaCreativeBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.RichMediaFloatingAsset floatingAsset;

    private com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset imageAsset;

    public RichMediaImageWithFloatingCreative() {
    }

    public RichMediaImageWithFloatingCreative(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_19.CreativeFieldAssignment[] creativeFieldAssignments,
           long sizeId,
           long typeId,
           int version,
           java.lang.String actionScriptVersion,
           java.lang.String adRequestKeys,
           java.lang.String authoringApplication,
           com.google.api.ads.dfa.axis.v1_19.RichMediaAsset[] childAssets,
           java.lang.String comments,
           com.google.api.ads.dfa.axis.v1_19.RichMediaCounterEvent[] counterEvents,
           java.util.Calendar createdDate,
           java.lang.String[] creativeAttributes,
           java.lang.String customKeyValues,
           com.google.api.ads.dfa.axis.v1_19.RichMediaExitEvent[] exitEvents,
           boolean flashInFlash,
           boolean interstitial,
           java.lang.String metaData,
           java.lang.String mode,
           int placementHeight,
           int placementWidth,
           java.lang.String requiredFlashPlayerVersion,
           java.lang.String surveyUrl,
           java.lang.String thirdPartyBackupImageImpressionUrl,
           java.lang.String thirdPartyClickUrl,
           java.lang.String thirdPartyFlashImpressionUrl,
           java.lang.String thirdPartyImpressionUrl,
           com.google.api.ads.dfa.axis.v1_19.RichMediaTimerEvent[] timerEvent,
           int totalFileSize,
           java.lang.String type,
           long videoLength,
           com.google.api.ads.dfa.axis.v1_19.RichMediaFloatingAsset floatingAsset,
           com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset imageAsset) {
        super(
            id,
            name,
            active,
            advertiserId,
            archived,
            creativeFieldAssignments,
            sizeId,
            typeId,
            version,
            actionScriptVersion,
            adRequestKeys,
            authoringApplication,
            childAssets,
            comments,
            counterEvents,
            createdDate,
            creativeAttributes,
            customKeyValues,
            exitEvents,
            flashInFlash,
            interstitial,
            metaData,
            mode,
            placementHeight,
            placementWidth,
            requiredFlashPlayerVersion,
            surveyUrl,
            thirdPartyBackupImageImpressionUrl,
            thirdPartyClickUrl,
            thirdPartyFlashImpressionUrl,
            thirdPartyImpressionUrl,
            timerEvent,
            totalFileSize,
            type,
            videoLength);
        this.floatingAsset = floatingAsset;
        this.imageAsset = imageAsset;
    }


    /**
     * Gets the floatingAsset value for this RichMediaImageWithFloatingCreative.
     * 
     * @return floatingAsset
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaFloatingAsset getFloatingAsset() {
        return floatingAsset;
    }


    /**
     * Sets the floatingAsset value for this RichMediaImageWithFloatingCreative.
     * 
     * @param floatingAsset
     */
    public void setFloatingAsset(com.google.api.ads.dfa.axis.v1_19.RichMediaFloatingAsset floatingAsset) {
        this.floatingAsset = floatingAsset;
    }


    /**
     * Gets the imageAsset value for this RichMediaImageWithFloatingCreative.
     * 
     * @return imageAsset
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset getImageAsset() {
        return imageAsset;
    }


    /**
     * Sets the imageAsset value for this RichMediaImageWithFloatingCreative.
     * 
     * @param imageAsset
     */
    public void setImageAsset(com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset imageAsset) {
        this.imageAsset = imageAsset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaImageWithFloatingCreative)) return false;
        RichMediaImageWithFloatingCreative other = (RichMediaImageWithFloatingCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.floatingAsset==null && other.getFloatingAsset()==null) || 
             (this.floatingAsset!=null &&
              this.floatingAsset.equals(other.getFloatingAsset()))) &&
            ((this.imageAsset==null && other.getImageAsset()==null) || 
             (this.imageAsset!=null &&
              this.imageAsset.equals(other.getImageAsset())));
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
        if (getFloatingAsset() != null) {
            _hashCode += getFloatingAsset().hashCode();
        }
        if (getImageAsset() != null) {
            _hashCode += getImageAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaImageWithFloatingCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaImageWithFloatingCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floatingAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "floatingAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaFloatingAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaImageAsset"));
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
