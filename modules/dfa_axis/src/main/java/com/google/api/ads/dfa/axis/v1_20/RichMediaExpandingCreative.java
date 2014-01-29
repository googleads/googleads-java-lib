/**
 * RichMediaExpandingCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaExpandingCreative  extends com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingAsset expandingAsset;

    private com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingHtmlAsset expandingHtmlAsset;

    public RichMediaExpandingCreative() {
    }

    public RichMediaExpandingCreative(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_20.CreativeFieldAssignment[] creativeFieldAssignments,
           java.util.Calendar modifiedDate,
           long renderingId,
           long sizeId,
           long typeId,
           int version,
           java.lang.String actionScriptVersion,
           java.lang.String adRequestKeys,
           java.lang.String authoringApplication,
           com.google.api.ads.dfa.axis.v1_20.RichMediaAsset[] childAssets,
           java.lang.String comments,
           com.google.api.ads.dfa.axis.v1_20.RichMediaCounterEvent[] counterEvents,
           java.util.Calendar createdDate,
           java.lang.String[] creativeAttributes,
           java.lang.String customKeyValues,
           com.google.api.ads.dfa.axis.v1_20.RichMediaExitEvent[] exitEvents,
           boolean flashInFlash,
           boolean interstitial,
           boolean lidarEnabled,
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
           com.google.api.ads.dfa.axis.v1_20.RichMediaTimerEvent[] timerEvent,
           int totalFileSize,
           java.lang.String type,
           long videoLength,
           com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingAsset expandingAsset,
           com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingHtmlAsset expandingHtmlAsset) {
        super(
            id,
            name,
            active,
            advertiserId,
            archived,
            creativeFieldAssignments,
            modifiedDate,
            renderingId,
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
            lidarEnabled,
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
        this.expandingAsset = expandingAsset;
        this.expandingHtmlAsset = expandingHtmlAsset;
    }


    /**
     * Gets the expandingAsset value for this RichMediaExpandingCreative.
     * 
     * @return expandingAsset
     */
    public com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingAsset getExpandingAsset() {
        return expandingAsset;
    }


    /**
     * Sets the expandingAsset value for this RichMediaExpandingCreative.
     * 
     * @param expandingAsset
     */
    public void setExpandingAsset(com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingAsset expandingAsset) {
        this.expandingAsset = expandingAsset;
    }


    /**
     * Gets the expandingHtmlAsset value for this RichMediaExpandingCreative.
     * 
     * @return expandingHtmlAsset
     */
    public com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingHtmlAsset getExpandingHtmlAsset() {
        return expandingHtmlAsset;
    }


    /**
     * Sets the expandingHtmlAsset value for this RichMediaExpandingCreative.
     * 
     * @param expandingHtmlAsset
     */
    public void setExpandingHtmlAsset(com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingHtmlAsset expandingHtmlAsset) {
        this.expandingHtmlAsset = expandingHtmlAsset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaExpandingCreative)) return false;
        RichMediaExpandingCreative other = (RichMediaExpandingCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expandingAsset==null && other.getExpandingAsset()==null) || 
             (this.expandingAsset!=null &&
              this.expandingAsset.equals(other.getExpandingAsset()))) &&
            ((this.expandingHtmlAsset==null && other.getExpandingHtmlAsset()==null) || 
             (this.expandingHtmlAsset!=null &&
              this.expandingHtmlAsset.equals(other.getExpandingHtmlAsset())));
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
        if (getExpandingAsset() != null) {
            _hashCode += getExpandingAsset().hashCode();
        }
        if (getExpandingHtmlAsset() != null) {
            _hashCode += getExpandingHtmlAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaExpandingCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExpandingCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandingAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expandingAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExpandingAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandingHtmlAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expandingHtmlAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExpandingHtmlAsset"));
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
