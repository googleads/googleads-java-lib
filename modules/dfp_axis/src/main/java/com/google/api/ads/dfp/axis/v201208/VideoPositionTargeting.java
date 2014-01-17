/**
 * VideoPositionTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201208;


/**
 * Represents positions within and around a video where ads can be
 * targeted to.
 *             <p>
 *             Example positions could be {@code pre-roll} (before the
 * video plays),
 *             {@code post-roll} (after a video has completed playback)
 * and
 *             {@code mid-roll} (during video playback).
 */
public class VideoPositionTargeting  implements java.io.Serializable {
    /* The {@link VideoPositionTargetingType}s being targeted by the
     * video {@link LineItem}.
     *                 
     *                 {@code targetedVideoPositions} is deprecated as of
     * V201203.  Use {@code targetedPositions}
     *                 instead as it provides support for targeting an individual
     * midroll. */
    private com.google.api.ads.dfp.axis.v201208.VideoPositionTargetingType[] targetedVideoPositions;

    public VideoPositionTargeting() {
    }

    public VideoPositionTargeting(
           com.google.api.ads.dfp.axis.v201208.VideoPositionTargetingType[] targetedVideoPositions) {
           this.targetedVideoPositions = targetedVideoPositions;
    }


    /**
     * Gets the targetedVideoPositions value for this VideoPositionTargeting.
     * 
     * @return targetedVideoPositions   * The {@link VideoPositionTargetingType}s being targeted by the
     * video {@link LineItem}.
     *                 
     *                 {@code targetedVideoPositions} is deprecated as of
     * V201203.  Use {@code targetedPositions}
     *                 instead as it provides support for targeting an individual
     * midroll.
     */
    public com.google.api.ads.dfp.axis.v201208.VideoPositionTargetingType[] getTargetedVideoPositions() {
        return targetedVideoPositions;
    }


    /**
     * Sets the targetedVideoPositions value for this VideoPositionTargeting.
     * 
     * @param targetedVideoPositions   * The {@link VideoPositionTargetingType}s being targeted by the
     * video {@link LineItem}.
     *                 
     *                 {@code targetedVideoPositions} is deprecated as of
     * V201203.  Use {@code targetedPositions}
     *                 instead as it provides support for targeting an individual
     * midroll.
     */
    public void setTargetedVideoPositions(com.google.api.ads.dfp.axis.v201208.VideoPositionTargetingType[] targetedVideoPositions) {
        this.targetedVideoPositions = targetedVideoPositions;
    }

    public com.google.api.ads.dfp.axis.v201208.VideoPositionTargetingType getTargetedVideoPositions(int i) {
        return this.targetedVideoPositions[i];
    }

    public void setTargetedVideoPositions(int i, com.google.api.ads.dfp.axis.v201208.VideoPositionTargetingType _value) {
        this.targetedVideoPositions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPositionTargeting)) return false;
        VideoPositionTargeting other = (VideoPositionTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedVideoPositions==null && other.getTargetedVideoPositions()==null) || 
             (this.targetedVideoPositions!=null &&
              java.util.Arrays.equals(this.targetedVideoPositions, other.getTargetedVideoPositions())));
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
        if (getTargetedVideoPositions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedVideoPositions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedVideoPositions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPositionTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "VideoPositionTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedVideoPositions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "targetedVideoPositions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "VideoPositionTargetingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
