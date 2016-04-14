/**
 * ClientCustomerId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;


/**
 * Identifier for a customer in given {@link Product}.
 *                         Used to consolidate logic for picking adwords
 * external customer id, and external entity id for
 *                         cases of provisioning to different customers.
 */
public class ClientCustomerId  implements java.io.Serializable {
    private com.google.api.ads.ddp.axis.v201603.dmp.Product product;

    private java.lang.Long entityId;

    public ClientCustomerId() {
    }

    public ClientCustomerId(
           com.google.api.ads.ddp.axis.v201603.dmp.Product product,
           java.lang.Long entityId) {
           this.product = product;
           this.entityId = entityId;
    }


    /**
     * Gets the product value for this ClientCustomerId.
     * 
     * @return product
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.Product getProduct() {
        return product;
    }


    /**
     * Sets the product value for this ClientCustomerId.
     * 
     * @param product
     */
    public void setProduct(com.google.api.ads.ddp.axis.v201603.dmp.Product product) {
        this.product = product;
    }


    /**
     * Gets the entityId value for this ClientCustomerId.
     * 
     * @return entityId
     */
    public java.lang.Long getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this ClientCustomerId.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.Long entityId) {
        this.entityId = entityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientCustomerId)) return false;
        ClientCustomerId other = (ClientCustomerId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId())));
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientCustomerId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "ClientCustomerId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
