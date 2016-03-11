/**
 * ConversionOptimizerBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * This bidding strategy has been deprecated and replaced with
 *             {@linkplain TargetCpaBiddingScheme TargetCpa}. After V201601,
 * we no longer allow
 *             advertisers to opt into this strategy--{@code ConversionOptimizerBiddingScheme}
 * solely exists so that advertisers can access campaigns that had specified
 * this strategy.</p>
 *             
 *             <p>Conversion optimizer bidding strategy helps you maximize
 * your return on investment
 *             (ROI) by automatically getting you the most possible conversions
 * for your budget.
 *             
 *             <p class="warning">{@code pricingMode} currently defaults
 * to {@code CLICKS} and
 *             cannot be changed.</p>
 *             
 *             <p>Note that campaigns must meet <a
 *             href="https://support.google.com/adwords/answer/2471188#CORequirements">
 * specific eligibility requirements</a> before they can use the
 *             <code>ConversionOptimizer</code> bidding strategy.</p>
 * 
 *             <p>For more information on conversion optimizer, visit
 * the
 *             <a href="https://support.google.com/adwords/answer/2390684"
 * >Conversion Optimizer help center</a>.</p>
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class ConversionOptimizerBiddingScheme  extends com.google.api.ads.adwords.axis.v201506.cm.BiddingScheme  implements java.io.Serializable {
    /* <b>Note:</b> The value for this field currently cannot be changed.
     * 
     *                     Pricing model indicates whether it is a pay per
     * clicks or pay per
     *                     conversions campaign. If the pricing model is
     * not specified it
     *                     defaults to Clicks. */
    private com.google.api.ads.adwords.axis.v201506.cm.ConversionOptimizerBiddingSchemePricingMode pricingMode;

    /* Bid type indicates if it is a Target CPA campaign. If the Bid
     * type is
     *                     not specified it defaults to Target CPA. */
    private com.google.api.ads.adwords.axis.v201506.cm.ConversionOptimizerBiddingSchemeBidType bidType;

    public ConversionOptimizerBiddingScheme() {
    }

    public ConversionOptimizerBiddingScheme(
           java.lang.String biddingSchemeType,
           com.google.api.ads.adwords.axis.v201506.cm.ConversionOptimizerBiddingSchemePricingMode pricingMode,
           com.google.api.ads.adwords.axis.v201506.cm.ConversionOptimizerBiddingSchemeBidType bidType) {
        super(
            biddingSchemeType);
        this.pricingMode = pricingMode;
        this.bidType = bidType;
    }


    /**
     * Gets the pricingMode value for this ConversionOptimizerBiddingScheme.
     * 
     * @return pricingMode   * <b>Note:</b> The value for this field currently cannot be changed.
     * 
     *                     Pricing model indicates whether it is a pay per
     * clicks or pay per
     *                     conversions campaign. If the pricing model is
     * not specified it
     *                     defaults to Clicks.
     */
    public com.google.api.ads.adwords.axis.v201506.cm.ConversionOptimizerBiddingSchemePricingMode getPricingMode() {
        return pricingMode;
    }


    /**
     * Sets the pricingMode value for this ConversionOptimizerBiddingScheme.
     * 
     * @param pricingMode   * <b>Note:</b> The value for this field currently cannot be changed.
     * 
     *                     Pricing model indicates whether it is a pay per
     * clicks or pay per
     *                     conversions campaign. If the pricing model is
     * not specified it
     *                     defaults to Clicks.
     */
    public void setPricingMode(com.google.api.ads.adwords.axis.v201506.cm.ConversionOptimizerBiddingSchemePricingMode pricingMode) {
        this.pricingMode = pricingMode;
    }


    /**
     * Gets the bidType value for this ConversionOptimizerBiddingScheme.
     * 
     * @return bidType   * Bid type indicates if it is a Target CPA campaign. If the Bid
     * type is
     *                     not specified it defaults to Target CPA.
     */
    public com.google.api.ads.adwords.axis.v201506.cm.ConversionOptimizerBiddingSchemeBidType getBidType() {
        return bidType;
    }


    /**
     * Sets the bidType value for this ConversionOptimizerBiddingScheme.
     * 
     * @param bidType   * Bid type indicates if it is a Target CPA campaign. If the Bid
     * type is
     *                     not specified it defaults to Target CPA.
     */
    public void setBidType(com.google.api.ads.adwords.axis.v201506.cm.ConversionOptimizerBiddingSchemeBidType bidType) {
        this.bidType = bidType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionOptimizerBiddingScheme)) return false;
        ConversionOptimizerBiddingScheme other = (ConversionOptimizerBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pricingMode==null && other.getPricingMode()==null) || 
             (this.pricingMode!=null &&
              this.pricingMode.equals(other.getPricingMode()))) &&
            ((this.bidType==null && other.getBidType()==null) || 
             (this.bidType!=null &&
              this.bidType.equals(other.getBidType())));
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
        if (getPricingMode() != null) {
            _hashCode += getPricingMode().hashCode();
        }
        if (getBidType() != null) {
            _hashCode += getBidType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionOptimizerBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "ConversionOptimizerBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "pricingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "ConversionOptimizerBiddingScheme.PricingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "bidType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "ConversionOptimizerBiddingScheme.BidType"));
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
