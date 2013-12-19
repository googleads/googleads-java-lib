/**
 * AudienceSegmentGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class AudienceSegmentGroup  extends com.google.api.ads.dfa.axis.v1_19.Base  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.AudienceSegment[] audienceSegments;

    public AudienceSegmentGroup() {
    }

    public AudienceSegmentGroup(
           long id,
           java.lang.String name,
           com.google.api.ads.dfa.axis.v1_19.AudienceSegment[] audienceSegments) {
        super(
            id,
            name);
        this.audienceSegments = audienceSegments;
    }


    /**
     * Gets the audienceSegments value for this AudienceSegmentGroup.
     * 
     * @return audienceSegments
     */
    public com.google.api.ads.dfa.axis.v1_19.AudienceSegment[] getAudienceSegments() {
        return audienceSegments;
    }


    /**
     * Sets the audienceSegments value for this AudienceSegmentGroup.
     * 
     * @param audienceSegments
     */
    public void setAudienceSegments(com.google.api.ads.dfa.axis.v1_19.AudienceSegment[] audienceSegments) {
        this.audienceSegments = audienceSegments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceSegmentGroup)) return false;
        AudienceSegmentGroup other = (AudienceSegmentGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audienceSegments==null && other.getAudienceSegments()==null) || 
             (this.audienceSegments!=null &&
              java.util.Arrays.equals(this.audienceSegments, other.getAudienceSegments())));
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
        if (getAudienceSegments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudienceSegments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudienceSegments(), i);
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
        new org.apache.axis.description.TypeDesc(AudienceSegmentGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AudienceSegmentGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceSegments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audienceSegments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AudienceSegment"));
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
