/**
 * AdGroupAdLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;


/**
 * Manages the labels associated with an AdGroupAd.
 */
public class AdGroupAdLabel  implements java.io.Serializable {
    /* The id of the adgroup containing the ad that the label to be
     * applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span> */
    private java.lang.Long adGroupId;

    /* The id of the ad that the label to be applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span> */
    private java.lang.Long adId;

    /* The id of an existing label to be applied to the adgroup ad.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span> */
    private java.lang.Long labelId;

    public AdGroupAdLabel() {
    }

    public AdGroupAdLabel(
           java.lang.Long adGroupId,
           java.lang.Long adId,
           java.lang.Long labelId) {
           this.adGroupId = adGroupId;
           this.adId = adId;
           this.labelId = labelId;
    }


    /**
     * Gets the adGroupId value for this AdGroupAdLabel.
     * 
     * @return adGroupId   * The id of the adgroup containing the ad that the label to be
     * applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupAdLabel.
     * 
     * @param adGroupId   * The id of the adgroup containing the ad that the label to be
     * applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the adId value for this AdGroupAdLabel.
     * 
     * @return adId   * The id of the ad that the label to be applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public java.lang.Long getAdId() {
        return adId;
    }


    /**
     * Sets the adId value for this AdGroupAdLabel.
     * 
     * @param adId   * The id of the ad that the label to be applied to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, REMOVE.</span>
     */
    public void setAdId(java.lang.Long adId) {
        this.adId = adId;
    }


    /**
     * Gets the labelId value for this AdGroupAdLabel.
     * 
     * @return labelId   * The id of an existing label to be applied to the adgroup ad.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span>
     */
    public java.lang.Long getLabelId() {
        return labelId;
    }


    /**
     * Sets the labelId value for this AdGroupAdLabel.
     * 
     * @param labelId   * The id of an existing label to be applied to the adgroup ad.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, REMOVE.</span>
     */
    public void setLabelId(java.lang.Long labelId) {
        this.labelId = labelId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupAdLabel)) return false;
        AdGroupAdLabel other = (AdGroupAdLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.adId==null && other.getAdId()==null) || 
             (this.adId!=null &&
              this.adId.equals(other.getAdId()))) &&
            ((this.labelId==null && other.getLabelId()==null) || 
             (this.labelId!=null &&
              this.labelId.equals(other.getLabelId())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getAdId() != null) {
            _hashCode += getAdId().hashCode();
        }
        if (getLabelId() != null) {
            _hashCode += getLabelId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupAdLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "AdGroupAdLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "adId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "labelId"));
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
