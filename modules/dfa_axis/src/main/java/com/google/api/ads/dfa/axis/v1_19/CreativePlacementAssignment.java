/**
 * CreativePlacementAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativePlacementAssignment  implements java.io.Serializable {
    private java.lang.String adName;

    private long creativeId;

    private long placementId;

    private long[] placementIds;

    public CreativePlacementAssignment() {
    }

    public CreativePlacementAssignment(
           java.lang.String adName,
           long creativeId,
           long placementId,
           long[] placementIds) {
           this.adName = adName;
           this.creativeId = creativeId;
           this.placementId = placementId;
           this.placementIds = placementIds;
    }


    /**
     * Gets the adName value for this CreativePlacementAssignment.
     * 
     * @return adName
     */
    public java.lang.String getAdName() {
        return adName;
    }


    /**
     * Sets the adName value for this CreativePlacementAssignment.
     * 
     * @param adName
     */
    public void setAdName(java.lang.String adName) {
        this.adName = adName;
    }


    /**
     * Gets the creativeId value for this CreativePlacementAssignment.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativePlacementAssignment.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the placementId value for this CreativePlacementAssignment.
     * 
     * @return placementId
     */
    public long getPlacementId() {
        return placementId;
    }


    /**
     * Sets the placementId value for this CreativePlacementAssignment.
     * 
     * @param placementId
     */
    public void setPlacementId(long placementId) {
        this.placementId = placementId;
    }


    /**
     * Gets the placementIds value for this CreativePlacementAssignment.
     * 
     * @return placementIds
     */
    public long[] getPlacementIds() {
        return placementIds;
    }


    /**
     * Sets the placementIds value for this CreativePlacementAssignment.
     * 
     * @param placementIds
     */
    public void setPlacementIds(long[] placementIds) {
        this.placementIds = placementIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativePlacementAssignment)) return false;
        CreativePlacementAssignment other = (CreativePlacementAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adName==null && other.getAdName()==null) || 
             (this.adName!=null &&
              this.adName.equals(other.getAdName()))) &&
            this.creativeId == other.getCreativeId() &&
            this.placementId == other.getPlacementId() &&
            ((this.placementIds==null && other.getPlacementIds()==null) || 
             (this.placementIds!=null &&
              java.util.Arrays.equals(this.placementIds, other.getPlacementIds())));
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
        if (getAdName() != null) {
            _hashCode += getAdName().hashCode();
        }
        _hashCode += new Long(getCreativeId()).hashCode();
        _hashCode += new Long(getPlacementId()).hashCode();
        if (getPlacementIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementIds(), i);
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
        new org.apache.axis.description.TypeDesc(CreativePlacementAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativePlacementAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementIds"));
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
