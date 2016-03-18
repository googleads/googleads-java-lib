/**
 * ManualCPMAdGroupExperimentBidMultipliers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;


/**
 * Adgroup level bid multipliers used in manual CPM bidding strategy.
 * <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 */
public class ManualCPMAdGroupExperimentBidMultipliers  extends com.google.api.ads.adwords.axis.v201509.cm.AdGroupExperimentBidMultipliers  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201509.cm.BidMultiplier maxCpmMultiplier;

    public ManualCPMAdGroupExperimentBidMultipliers() {
    }

    public ManualCPMAdGroupExperimentBidMultipliers(
           java.lang.String adGroupExperimentBidMultipliersType,
           com.google.api.ads.adwords.axis.v201509.cm.BidMultiplier maxCpmMultiplier) {
        super(
            adGroupExperimentBidMultipliersType);
        this.maxCpmMultiplier = maxCpmMultiplier;
    }


    /**
     * Gets the maxCpmMultiplier value for this ManualCPMAdGroupExperimentBidMultipliers.
     * 
     * @return maxCpmMultiplier
     */
    public com.google.api.ads.adwords.axis.v201509.cm.BidMultiplier getMaxCpmMultiplier() {
        return maxCpmMultiplier;
    }


    /**
     * Sets the maxCpmMultiplier value for this ManualCPMAdGroupExperimentBidMultipliers.
     * 
     * @param maxCpmMultiplier
     */
    public void setMaxCpmMultiplier(com.google.api.ads.adwords.axis.v201509.cm.BidMultiplier maxCpmMultiplier) {
        this.maxCpmMultiplier = maxCpmMultiplier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManualCPMAdGroupExperimentBidMultipliers)) return false;
        ManualCPMAdGroupExperimentBidMultipliers other = (ManualCPMAdGroupExperimentBidMultipliers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxCpmMultiplier==null && other.getMaxCpmMultiplier()==null) || 
             (this.maxCpmMultiplier!=null &&
              this.maxCpmMultiplier.equals(other.getMaxCpmMultiplier())));
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
        if (getMaxCpmMultiplier() != null) {
            _hashCode += getMaxCpmMultiplier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManualCPMAdGroupExperimentBidMultipliers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "ManualCPMAdGroupExperimentBidMultipliers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCpmMultiplier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "maxCpmMultiplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "BidMultiplier"));
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
