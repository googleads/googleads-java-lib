/**
 * ManualCPCAdGroupCriterionExperimentBidMultiplier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * AdGroupCriterion level bid multiplier used in manual CPC bidding
 * strategies.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class ManualCPCAdGroupCriterionExperimentBidMultiplier  extends com.google.api.ads.adwords.axis.v201306.cm.AdGroupCriterionExperimentBidMultiplier  implements java.io.Serializable {
    /* Multiplier used for adjusting bids in manual maximum CPC bidding
     * strategies.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MaxCpcMultiplier".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.BidMultiplier maxCpcMultiplier;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "MultiplierSource".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.MultiplierSource multiplierSource;

    public ManualCPCAdGroupCriterionExperimentBidMultiplier() {
    }

    public ManualCPCAdGroupCriterionExperimentBidMultiplier(
           java.lang.String adGroupCriterionExperimentBidMultiplierType,
           com.google.api.ads.adwords.axis.v201306.cm.BidMultiplier maxCpcMultiplier,
           com.google.api.ads.adwords.axis.v201306.cm.MultiplierSource multiplierSource) {
        super(
            adGroupCriterionExperimentBidMultiplierType);
        this.maxCpcMultiplier = maxCpcMultiplier;
        this.multiplierSource = multiplierSource;
    }


    /**
     * Gets the maxCpcMultiplier value for this ManualCPCAdGroupCriterionExperimentBidMultiplier.
     * 
     * @return maxCpcMultiplier   * Multiplier used for adjusting bids in manual maximum CPC bidding
     * strategies.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MaxCpcMultiplier".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.BidMultiplier getMaxCpcMultiplier() {
        return maxCpcMultiplier;
    }


    /**
     * Sets the maxCpcMultiplier value for this ManualCPCAdGroupCriterionExperimentBidMultiplier.
     * 
     * @param maxCpcMultiplier   * Multiplier used for adjusting bids in manual maximum CPC bidding
     * strategies.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MaxCpcMultiplier".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setMaxCpcMultiplier(com.google.api.ads.adwords.axis.v201306.cm.BidMultiplier maxCpcMultiplier) {
        this.maxCpcMultiplier = maxCpcMultiplier;
    }


    /**
     * Gets the multiplierSource value for this ManualCPCAdGroupCriterionExperimentBidMultiplier.
     * 
     * @return multiplierSource   * <span class="constraint Selectable">This field can be selected
     * using the value "MultiplierSource".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.MultiplierSource getMultiplierSource() {
        return multiplierSource;
    }


    /**
     * Sets the multiplierSource value for this ManualCPCAdGroupCriterionExperimentBidMultiplier.
     * 
     * @param multiplierSource   * <span class="constraint Selectable">This field can be selected
     * using the value "MultiplierSource".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setMultiplierSource(com.google.api.ads.adwords.axis.v201306.cm.MultiplierSource multiplierSource) {
        this.multiplierSource = multiplierSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManualCPCAdGroupCriterionExperimentBidMultiplier)) return false;
        ManualCPCAdGroupCriterionExperimentBidMultiplier other = (ManualCPCAdGroupCriterionExperimentBidMultiplier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maxCpcMultiplier==null && other.getMaxCpcMultiplier()==null) || 
             (this.maxCpcMultiplier!=null &&
              this.maxCpcMultiplier.equals(other.getMaxCpcMultiplier()))) &&
            ((this.multiplierSource==null && other.getMultiplierSource()==null) || 
             (this.multiplierSource!=null &&
              this.multiplierSource.equals(other.getMultiplierSource())));
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
        if (getMaxCpcMultiplier() != null) {
            _hashCode += getMaxCpcMultiplier().hashCode();
        }
        if (getMultiplierSource() != null) {
            _hashCode += getMultiplierSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManualCPCAdGroupCriterionExperimentBidMultiplier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "ManualCPCAdGroupCriterionExperimentBidMultiplier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCpcMultiplier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "maxCpcMultiplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "BidMultiplier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiplierSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "multiplierSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "MultiplierSource"));
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
