/**
 * RichMediaFloatingWithReminderCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaFloatingWithReminderCreative  extends com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.RichMediaFloatingAsset floatingAsset;

    private com.google.api.ads.dfa.axis.v1_20.RichMediaReminderAsset reminderAsset;

    public RichMediaFloatingWithReminderCreative() {
    }

    public RichMediaFloatingWithReminderCreative(
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
           com.google.api.ads.dfa.axis.v1_20.RichMediaFloatingAsset floatingAsset,
           com.google.api.ads.dfa.axis.v1_20.RichMediaReminderAsset reminderAsset) {
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
        this.floatingAsset = floatingAsset;
        this.reminderAsset = reminderAsset;
    }


    /**
     * Gets the floatingAsset value for this RichMediaFloatingWithReminderCreative.
     * 
     * @return floatingAsset
     */
    public com.google.api.ads.dfa.axis.v1_20.RichMediaFloatingAsset getFloatingAsset() {
        return floatingAsset;
    }


    /**
     * Sets the floatingAsset value for this RichMediaFloatingWithReminderCreative.
     * 
     * @param floatingAsset
     */
    public void setFloatingAsset(com.google.api.ads.dfa.axis.v1_20.RichMediaFloatingAsset floatingAsset) {
        this.floatingAsset = floatingAsset;
    }


    /**
     * Gets the reminderAsset value for this RichMediaFloatingWithReminderCreative.
     * 
     * @return reminderAsset
     */
    public com.google.api.ads.dfa.axis.v1_20.RichMediaReminderAsset getReminderAsset() {
        return reminderAsset;
    }


    /**
     * Sets the reminderAsset value for this RichMediaFloatingWithReminderCreative.
     * 
     * @param reminderAsset
     */
    public void setReminderAsset(com.google.api.ads.dfa.axis.v1_20.RichMediaReminderAsset reminderAsset) {
        this.reminderAsset = reminderAsset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaFloatingWithReminderCreative)) return false;
        RichMediaFloatingWithReminderCreative other = (RichMediaFloatingWithReminderCreative) obj;
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
            ((this.reminderAsset==null && other.getReminderAsset()==null) || 
             (this.reminderAsset!=null &&
              this.reminderAsset.equals(other.getReminderAsset())));
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
        if (getReminderAsset() != null) {
            _hashCode += getReminderAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaFloatingWithReminderCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFloatingWithReminderCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floatingAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "floatingAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFloatingAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminderAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaReminderAsset"));
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
