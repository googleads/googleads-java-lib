/**
 * ProductBaseRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


/**
 * A base rate applied to a {@link Product}.
 */
public class ProductBaseRate  extends com.google.api.ads.dfp.axis.v201405.BaseRate  implements java.io.Serializable {
    /* The ID of {@link Product} this base rate is applied to.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation. */
    private java.lang.String productId;

    /* The rate value to override the rate on the product template.
     * 
     *                     This attribute is required. If {@code null}, the
     * product is not associated
     *                     with this rate card.
     *                     The currency code is read-only. */
    private com.google.api.ads.dfp.axis.v201405.Money rate;

    public ProductBaseRate() {
    }

    public ProductBaseRate(
           java.lang.Long rateCardId,
           java.lang.Long id,
           java.lang.String baseRateType,
           java.lang.String productId,
           com.google.api.ads.dfp.axis.v201405.Money rate) {
        super(
            rateCardId,
            id,
            baseRateType);
        this.productId = productId;
        this.rate = rate;
    }


    /**
     * Gets the productId value for this ProductBaseRate.
     * 
     * @return productId   * The ID of {@link Product} this base rate is applied to.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation.
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProductBaseRate.
     * 
     * @param productId   * The ID of {@link Product} this base rate is applied to.
     *                     
     *                     This attribute is required and cannot be changed
     * after creation.
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the rate value for this ProductBaseRate.
     * 
     * @return rate   * The rate value to override the rate on the product template.
     * 
     *                     This attribute is required. If {@code null}, the
     * product is not associated
     *                     with this rate card.
     *                     The currency code is read-only.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this ProductBaseRate.
     * 
     * @param rate   * The rate value to override the rate on the product template.
     * 
     *                     This attribute is required. If {@code null}, the
     * product is not associated
     *                     with this rate card.
     *                     The currency code is read-only.
     */
    public void setRate(com.google.api.ads.dfp.axis.v201405.Money rate) {
        this.rate = rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductBaseRate)) return false;
        ProductBaseRate other = (ProductBaseRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductBaseRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "ProductBaseRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
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
