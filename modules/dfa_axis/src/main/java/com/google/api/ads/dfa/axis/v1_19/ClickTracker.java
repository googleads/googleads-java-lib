/**
 * ClickTracker.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class ClickTracker  extends com.google.api.ads.dfa.axis.v1_19.AdBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.ClickThroughUrl clickThroughUrl;

    private com.google.api.ads.dfa.axis.v1_19.CreativeGroupAssignment creativeGroupAssignment;

    public ClickTracker() {
    }

    public ClickTracker(
           long id,
           java.lang.String name,
           boolean active,
           boolean archived,
           long campaignId,
           java.lang.String comments,
           java.util.Calendar endTime,
           com.google.api.ads.dfa.axis.v1_19.PlacementAssignment[] placementAssignments,
           long sizeId,
           java.util.Calendar startTime,
           long typeId,
           com.google.api.ads.dfa.axis.v1_19.ClickThroughUrl clickThroughUrl,
           com.google.api.ads.dfa.axis.v1_19.CreativeGroupAssignment creativeGroupAssignment) {
        super(
            id,
            name,
            active,
            archived,
            campaignId,
            comments,
            endTime,
            placementAssignments,
            sizeId,
            startTime,
            typeId);
        this.clickThroughUrl = clickThroughUrl;
        this.creativeGroupAssignment = creativeGroupAssignment;
    }


    /**
     * Gets the clickThroughUrl value for this ClickTracker.
     * 
     * @return clickThroughUrl
     */
    public com.google.api.ads.dfa.axis.v1_19.ClickThroughUrl getClickThroughUrl() {
        return clickThroughUrl;
    }


    /**
     * Sets the clickThroughUrl value for this ClickTracker.
     * 
     * @param clickThroughUrl
     */
    public void setClickThroughUrl(com.google.api.ads.dfa.axis.v1_19.ClickThroughUrl clickThroughUrl) {
        this.clickThroughUrl = clickThroughUrl;
    }


    /**
     * Gets the creativeGroupAssignment value for this ClickTracker.
     * 
     * @return creativeGroupAssignment
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeGroupAssignment getCreativeGroupAssignment() {
        return creativeGroupAssignment;
    }


    /**
     * Sets the creativeGroupAssignment value for this ClickTracker.
     * 
     * @param creativeGroupAssignment
     */
    public void setCreativeGroupAssignment(com.google.api.ads.dfa.axis.v1_19.CreativeGroupAssignment creativeGroupAssignment) {
        this.creativeGroupAssignment = creativeGroupAssignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClickTracker)) return false;
        ClickTracker other = (ClickTracker) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.clickThroughUrl==null && other.getClickThroughUrl()==null) || 
             (this.clickThroughUrl!=null &&
              this.clickThroughUrl.equals(other.getClickThroughUrl()))) &&
            ((this.creativeGroupAssignment==null && other.getCreativeGroupAssignment()==null) || 
             (this.creativeGroupAssignment!=null &&
              this.creativeGroupAssignment.equals(other.getCreativeGroupAssignment())));
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
        if (getClickThroughUrl() != null) {
            _hashCode += getClickThroughUrl().hashCode();
        }
        if (getCreativeGroupAssignment() != null) {
            _hashCode += getCreativeGroupAssignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClickTracker.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ClickTracker"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ClickThroughUrl"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeGroupAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeGroupAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeGroupAssignment"));
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
