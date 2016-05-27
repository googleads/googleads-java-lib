/**
 * AdGroupExperimentBidMultipliers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * Bid multiplier used to modify the bid of an adgroup while running
 * an experiment.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public abstract class AdGroupExperimentBidMultipliers  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of AdGroupExperimentBidMultipliers.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String adGroupExperimentBidMultipliersType;

    public AdGroupExperimentBidMultipliers() {
    }

    public AdGroupExperimentBidMultipliers(
           java.lang.String adGroupExperimentBidMultipliersType) {
           this.adGroupExperimentBidMultipliersType = adGroupExperimentBidMultipliersType;
    }


    /**
     * Gets the adGroupExperimentBidMultipliersType value for this AdGroupExperimentBidMultipliers.
     * 
     * @return adGroupExperimentBidMultipliersType   * Indicates that this instance is a subtype of AdGroupExperimentBidMultipliers.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getAdGroupExperimentBidMultipliersType() {
        return adGroupExperimentBidMultipliersType;
    }


    /**
     * Sets the adGroupExperimentBidMultipliersType value for this AdGroupExperimentBidMultipliers.
     * 
     * @param adGroupExperimentBidMultipliersType   * Indicates that this instance is a subtype of AdGroupExperimentBidMultipliers.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setAdGroupExperimentBidMultipliersType(java.lang.String adGroupExperimentBidMultipliersType) {
        this.adGroupExperimentBidMultipliersType = adGroupExperimentBidMultipliersType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupExperimentBidMultipliers)) return false;
        AdGroupExperimentBidMultipliers other = (AdGroupExperimentBidMultipliers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupExperimentBidMultipliersType==null && other.getAdGroupExperimentBidMultipliersType()==null) || 
             (this.adGroupExperimentBidMultipliersType!=null &&
              this.adGroupExperimentBidMultipliersType.equals(other.getAdGroupExperimentBidMultipliersType())));
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
        if (getAdGroupExperimentBidMultipliersType() != null) {
            _hashCode += getAdGroupExperimentBidMultipliersType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupExperimentBidMultipliers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "AdGroupExperimentBidMultipliers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupExperimentBidMultipliersType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "AdGroupExperimentBidMultipliers.Type"));
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
