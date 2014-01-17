/**
 * Subnetwork.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class Subnetwork  extends com.google.api.ads.dfa.axis.v1_20.SubnetworkBase  implements java.io.Serializable {
    private long[] availablePermissions;

    private long networkId;

    public Subnetwork() {
    }

    public Subnetwork(
           long id,
           java.lang.String name,
           long[] availablePermissions,
           long networkId) {
        super(
            id,
            name);
        this.availablePermissions = availablePermissions;
        this.networkId = networkId;
    }


    /**
     * Gets the availablePermissions value for this Subnetwork.
     * 
     * @return availablePermissions
     */
    public long[] getAvailablePermissions() {
        return availablePermissions;
    }


    /**
     * Sets the availablePermissions value for this Subnetwork.
     * 
     * @param availablePermissions
     */
    public void setAvailablePermissions(long[] availablePermissions) {
        this.availablePermissions = availablePermissions;
    }


    /**
     * Gets the networkId value for this Subnetwork.
     * 
     * @return networkId
     */
    public long getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this Subnetwork.
     * 
     * @param networkId
     */
    public void setNetworkId(long networkId) {
        this.networkId = networkId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subnetwork)) return false;
        Subnetwork other = (Subnetwork) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availablePermissions==null && other.getAvailablePermissions()==null) || 
             (this.availablePermissions!=null &&
              java.util.Arrays.equals(this.availablePermissions, other.getAvailablePermissions()))) &&
            this.networkId == other.getNetworkId();
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
        if (getAvailablePermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailablePermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailablePermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getNetworkId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subnetwork.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Subnetwork"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availablePermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
