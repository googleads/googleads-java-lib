/**
 * CreativeRenderingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeRenderingRequest  implements java.io.Serializable {
    private long[] creativeIds;

    public CreativeRenderingRequest() {
    }

    public CreativeRenderingRequest(
           long[] creativeIds) {
           this.creativeIds = creativeIds;
    }


    /**
     * Gets the creativeIds value for this CreativeRenderingRequest.
     * 
     * @return creativeIds
     */
    public long[] getCreativeIds() {
        return creativeIds;
    }


    /**
     * Sets the creativeIds value for this CreativeRenderingRequest.
     * 
     * @param creativeIds
     */
    public void setCreativeIds(long[] creativeIds) {
        this.creativeIds = creativeIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeRenderingRequest)) return false;
        CreativeRenderingRequest other = (CreativeRenderingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creativeIds==null && other.getCreativeIds()==null) || 
             (this.creativeIds!=null &&
              java.util.Arrays.equals(this.creativeIds, other.getCreativeIds())));
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
        if (getCreativeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeIds(), i);
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
        new org.apache.axis.description.TypeDesc(CreativeRenderingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeRenderingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
