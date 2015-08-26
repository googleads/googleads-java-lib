/**
 * TrackingAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class TrackingAd  extends com.google.api.ads.dfa.axis.v1_20.AdBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.CreativeAssignment[] creativeAssignments;

    public TrackingAd() {
    }

    public TrackingAd(
           long id,
           java.lang.String name,
           boolean active,
           boolean archived,
           long campaignId,
           java.lang.String comments,
           java.util.Calendar endTime,
           com.google.api.ads.dfa.axis.v1_20.PlacementAssignment[] placementAssignments,
           long sizeId,
           java.util.Calendar startTime,
           long typeId,
           com.google.api.ads.dfa.axis.v1_20.CreativeAssignment[] creativeAssignments) {
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
        this.creativeAssignments = creativeAssignments;
    }


    /**
     * Gets the creativeAssignments value for this TrackingAd.
     * 
     * @return creativeAssignments
     */
    public com.google.api.ads.dfa.axis.v1_20.CreativeAssignment[] getCreativeAssignments() {
        return creativeAssignments;
    }


    /**
     * Sets the creativeAssignments value for this TrackingAd.
     * 
     * @param creativeAssignments
     */
    public void setCreativeAssignments(com.google.api.ads.dfa.axis.v1_20.CreativeAssignment[] creativeAssignments) {
        this.creativeAssignments = creativeAssignments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackingAd)) return false;
        TrackingAd other = (TrackingAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creativeAssignments==null && other.getCreativeAssignments()==null) || 
             (this.creativeAssignments!=null &&
              java.util.Arrays.equals(this.creativeAssignments, other.getCreativeAssignments())));
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
        if (getCreativeAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeAssignments(), i);
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
        new org.apache.axis.description.TypeDesc(TrackingAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TrackingAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssignment"));
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
