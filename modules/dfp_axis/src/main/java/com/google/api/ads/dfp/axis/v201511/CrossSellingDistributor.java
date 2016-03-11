/**
 * CrossSellingDistributor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201511;


/**
 * Encapsulation of data describing a distributor network that has
 * shared an ad unit with a
 *             content provider network.
 */
public class CrossSellingDistributor  implements java.io.Serializable {
    /* The name of the distributor network sharing its ad unit with
     * the active content provider
     *                 network. */
    private java.lang.String networkName;

    public CrossSellingDistributor() {
    }

    public CrossSellingDistributor(
           java.lang.String networkName) {
           this.networkName = networkName;
    }


    /**
     * Gets the networkName value for this CrossSellingDistributor.
     * 
     * @return networkName   * The name of the distributor network sharing its ad unit with
     * the active content provider
     *                 network.
     */
    public java.lang.String getNetworkName() {
        return networkName;
    }


    /**
     * Sets the networkName value for this CrossSellingDistributor.
     * 
     * @param networkName   * The name of the distributor network sharing its ad unit with
     * the active content provider
     *                 network.
     */
    public void setNetworkName(java.lang.String networkName) {
        this.networkName = networkName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrossSellingDistributor)) return false;
        CrossSellingDistributor other = (CrossSellingDistributor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkName==null && other.getNetworkName()==null) || 
             (this.networkName!=null &&
              this.networkName.equals(other.getNetworkName())));
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
        if (getNetworkName() != null) {
            _hashCode += getNetworkName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrossSellingDistributor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201511", "CrossSellingDistributor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201511", "networkName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
