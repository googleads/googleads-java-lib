/**
 * ProposalLineItemConstraints.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;


/**
 * A {@code PropoalLineItemConstraints} represents all the constraints
 * set for a
 *             {@link ProposalLineItem} and is always readonly. It comes
 * from the {@link Product},
 *             based on which the proposal line item is created.
 */
public class ProposalLineItemConstraints  implements java.io.Serializable {
    /* Allows customization by salespeople of frequency caps when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is read-only. */
    private java.lang.Boolean allowFrequencyCapsCustomization;

    /* The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201502.FrequencyCap[] builtInFrequencyCaps;

    /* The built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201502.ProductTemplateTargeting builtInTargeting;

    public ProposalLineItemConstraints() {
    }

    public ProposalLineItemConstraints(
           java.lang.Boolean allowFrequencyCapsCustomization,
           com.google.api.ads.dfp.axis.v201502.FrequencyCap[] builtInFrequencyCaps,
           com.google.api.ads.dfp.axis.v201502.ProductTemplateTargeting builtInTargeting) {
           this.allowFrequencyCapsCustomization = allowFrequencyCapsCustomization;
           this.builtInFrequencyCaps = builtInFrequencyCaps;
           this.builtInTargeting = builtInTargeting;
    }


    /**
     * Gets the allowFrequencyCapsCustomization value for this ProposalLineItemConstraints.
     * 
     * @return allowFrequencyCapsCustomization   * Allows customization by salespeople of frequency caps when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is read-only.
     */
    public java.lang.Boolean getAllowFrequencyCapsCustomization() {
        return allowFrequencyCapsCustomization;
    }


    /**
     * Sets the allowFrequencyCapsCustomization value for this ProposalLineItemConstraints.
     * 
     * @param allowFrequencyCapsCustomization   * Allows customization by salespeople of frequency caps when
     * creating proposal line items.
     *                 
     *                 <p>This attribute is read-only.
     */
    public void setAllowFrequencyCapsCustomization(java.lang.Boolean allowFrequencyCapsCustomization) {
        this.allowFrequencyCapsCustomization = allowFrequencyCapsCustomization;
    }


    /**
     * Gets the builtInFrequencyCaps value for this ProposalLineItemConstraints.
     * 
     * @return builtInFrequencyCaps   * The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201502.FrequencyCap[] getBuiltInFrequencyCaps() {
        return builtInFrequencyCaps;
    }


    /**
     * Sets the builtInFrequencyCaps value for this ProposalLineItemConstraints.
     * 
     * @param builtInFrequencyCaps   * The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInFrequencyCaps(com.google.api.ads.dfp.axis.v201502.FrequencyCap[] builtInFrequencyCaps) {
        this.builtInFrequencyCaps = builtInFrequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201502.FrequencyCap getBuiltInFrequencyCaps(int i) {
        return this.builtInFrequencyCaps[i];
    }

    public void setBuiltInFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201502.FrequencyCap _value) {
        this.builtInFrequencyCaps[i] = _value;
    }


    /**
     * Gets the builtInTargeting value for this ProposalLineItemConstraints.
     * 
     * @return builtInTargeting   * The built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201502.ProductTemplateTargeting getBuiltInTargeting() {
        return builtInTargeting;
    }


    /**
     * Sets the builtInTargeting value for this ProposalLineItemConstraints.
     * 
     * @param builtInTargeting   * The built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInTargeting(com.google.api.ads.dfp.axis.v201502.ProductTemplateTargeting builtInTargeting) {
        this.builtInTargeting = builtInTargeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLineItemConstraints)) return false;
        ProposalLineItemConstraints other = (ProposalLineItemConstraints) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowFrequencyCapsCustomization==null && other.getAllowFrequencyCapsCustomization()==null) || 
             (this.allowFrequencyCapsCustomization!=null &&
              this.allowFrequencyCapsCustomization.equals(other.getAllowFrequencyCapsCustomization()))) &&
            ((this.builtInFrequencyCaps==null && other.getBuiltInFrequencyCaps()==null) || 
             (this.builtInFrequencyCaps!=null &&
              java.util.Arrays.equals(this.builtInFrequencyCaps, other.getBuiltInFrequencyCaps()))) &&
            ((this.builtInTargeting==null && other.getBuiltInTargeting()==null) || 
             (this.builtInTargeting!=null &&
              this.builtInTargeting.equals(other.getBuiltInTargeting())));
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
        if (getAllowFrequencyCapsCustomization() != null) {
            _hashCode += getAllowFrequencyCapsCustomization().hashCode();
        }
        if (getBuiltInFrequencyCaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuiltInFrequencyCaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuiltInFrequencyCaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuiltInTargeting() != null) {
            _hashCode += getBuiltInTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItemConstraints.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "ProposalLineItemConstraints"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowFrequencyCapsCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "allowFrequencyCapsCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInFrequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "builtInFrequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "builtInTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "ProductTemplateTargeting"));
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
