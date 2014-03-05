/**
 * SpotlightActivityImageTagsSaveRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class SpotlightActivityImageTagsSaveRequest  implements java.io.Serializable {
    private long[] activityIds;

    private boolean status;

    public SpotlightActivityImageTagsSaveRequest() {
    }

    public SpotlightActivityImageTagsSaveRequest(
           long[] activityIds,
           boolean status) {
           this.activityIds = activityIds;
           this.status = status;
    }


    /**
     * Gets the activityIds value for this SpotlightActivityImageTagsSaveRequest.
     * 
     * @return activityIds
     */
    public long[] getActivityIds() {
        return activityIds;
    }


    /**
     * Sets the activityIds value for this SpotlightActivityImageTagsSaveRequest.
     * 
     * @param activityIds
     */
    public void setActivityIds(long[] activityIds) {
        this.activityIds = activityIds;
    }


    /**
     * Gets the status value for this SpotlightActivityImageTagsSaveRequest.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this SpotlightActivityImageTagsSaveRequest.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpotlightActivityImageTagsSaveRequest)) return false;
        SpotlightActivityImageTagsSaveRequest other = (SpotlightActivityImageTagsSaveRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityIds==null && other.getActivityIds()==null) || 
             (this.activityIds!=null &&
              java.util.Arrays.equals(this.activityIds, other.getActivityIds()))) &&
            this.status == other.isStatus();
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
        if (getActivityIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivityIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivityIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpotlightActivityImageTagsSaveRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SpotlightActivityImageTagsSaveRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
