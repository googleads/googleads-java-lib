/**
 * BudgetOptimizerBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;


/**
 * In budget optimizer, Google automatically places bids for the user
 * based on
 *             their daily/monthly budget.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class BudgetOptimizerBiddingScheme  extends com.google.api.ads.adwords.axis.v201402.cm.BiddingScheme  implements java.io.Serializable {
    /* Ceiling on bids placed by the budget optimizer.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BidCeiling".</span> */
    private com.google.api.ads.adwords.axis.v201402.cm.Money bidCeiling;

    /* The enhanced CPC bidding option for the campaign, which enables
     * bids to be enhanced based on conversion optimizer data. For more
     *                     information about enhanced CPC, see the
     *                     <a href="//support.google.com/adwords/bin/answer.py?answer=2464964"
     * >AdWords Help Center</a>.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EnhancedCpcEnabled".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean enhancedCpcEnabled;

    public BudgetOptimizerBiddingScheme() {
    }

    public BudgetOptimizerBiddingScheme(
           java.lang.String biddingSchemeType,
           com.google.api.ads.adwords.axis.v201402.cm.Money bidCeiling,
           java.lang.Boolean enhancedCpcEnabled) {
        super(
            biddingSchemeType);
        this.bidCeiling = bidCeiling;
        this.enhancedCpcEnabled = enhancedCpcEnabled;
    }


    /**
     * Gets the bidCeiling value for this BudgetOptimizerBiddingScheme.
     * 
     * @return bidCeiling   * Ceiling on bids placed by the budget optimizer.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BidCeiling".</span>
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getBidCeiling() {
        return bidCeiling;
    }


    /**
     * Sets the bidCeiling value for this BudgetOptimizerBiddingScheme.
     * 
     * @param bidCeiling   * Ceiling on bids placed by the budget optimizer.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BidCeiling".</span>
     */
    public void setBidCeiling(com.google.api.ads.adwords.axis.v201402.cm.Money bidCeiling) {
        this.bidCeiling = bidCeiling;
    }


    /**
     * Gets the enhancedCpcEnabled value for this BudgetOptimizerBiddingScheme.
     * 
     * @return enhancedCpcEnabled   * The enhanced CPC bidding option for the campaign, which enables
     * bids to be enhanced based on conversion optimizer data. For more
     *                     information about enhanced CPC, see the
     *                     <a href="//support.google.com/adwords/bin/answer.py?answer=2464964"
     * >AdWords Help Center</a>.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EnhancedCpcEnabled".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getEnhancedCpcEnabled() {
        return enhancedCpcEnabled;
    }


    /**
     * Sets the enhancedCpcEnabled value for this BudgetOptimizerBiddingScheme.
     * 
     * @param enhancedCpcEnabled   * The enhanced CPC bidding option for the campaign, which enables
     * bids to be enhanced based on conversion optimizer data. For more
     *                     information about enhanced CPC, see the
     *                     <a href="//support.google.com/adwords/bin/answer.py?answer=2464964"
     * >AdWords Help Center</a>.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EnhancedCpcEnabled".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setEnhancedCpcEnabled(java.lang.Boolean enhancedCpcEnabled) {
        this.enhancedCpcEnabled = enhancedCpcEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetOptimizerBiddingScheme)) return false;
        BudgetOptimizerBiddingScheme other = (BudgetOptimizerBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bidCeiling==null && other.getBidCeiling()==null) || 
             (this.bidCeiling!=null &&
              this.bidCeiling.equals(other.getBidCeiling()))) &&
            ((this.enhancedCpcEnabled==null && other.getEnhancedCpcEnabled()==null) || 
             (this.enhancedCpcEnabled!=null &&
              this.enhancedCpcEnabled.equals(other.getEnhancedCpcEnabled())));
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
        if (getBidCeiling() != null) {
            _hashCode += getBidCeiling().hashCode();
        }
        if (getEnhancedCpcEnabled() != null) {
            _hashCode += getEnhancedCpcEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetOptimizerBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "BudgetOptimizerBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidCeiling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "bidCeiling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedCpcEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "enhancedCpcEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
