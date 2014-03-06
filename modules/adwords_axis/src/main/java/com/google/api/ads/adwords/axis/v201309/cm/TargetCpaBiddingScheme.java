/**
 * TargetCpaBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Target Cpa bidding strategy helps you maximize your return on investment
 * (ROI) by automatically getting you the most possible conversions for
 * your budget.
 *             
 *             This is similar to the <code>ConversionOptimizerBiddingScheme<code>
 * but does not
 *             support user-entered AdGroup-level target CPA bids, but
 * rather a strategy-wide
 *             average CPA target.
 *             
 *             <p>Note that campaigns must meet <a
 *             href="//support.google.com/adwords/bin/answer.py?answer=2471188">specific
 * eligibility requirements</a> before they can use the <code>TargetCpaBiddingScheme</code>
 * bidding strategy.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class TargetCpaBiddingScheme  extends com.google.api.ads.adwords.axis.v201309.cm.BiddingScheme  implements java.io.Serializable {
    /* Average CPA target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetCpa".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Money targetCpa;

    public TargetCpaBiddingScheme() {
    }

    public TargetCpaBiddingScheme(
           java.lang.String biddingSchemeType,
           com.google.api.ads.adwords.axis.v201309.cm.Money targetCpa) {
        super(
            biddingSchemeType);
        this.targetCpa = targetCpa;
    }


    /**
     * Gets the targetCpa value for this TargetCpaBiddingScheme.
     * 
     * @return targetCpa   * Average CPA target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetCpa".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Money getTargetCpa() {
        return targetCpa;
    }


    /**
     * Sets the targetCpa value for this TargetCpaBiddingScheme.
     * 
     * @param targetCpa   * Average CPA target.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "TargetCpa".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setTargetCpa(com.google.api.ads.adwords.axis.v201309.cm.Money targetCpa) {
        this.targetCpa = targetCpa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetCpaBiddingScheme)) return false;
        TargetCpaBiddingScheme other = (TargetCpaBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetCpa==null && other.getTargetCpa()==null) || 
             (this.targetCpa!=null &&
              this.targetCpa.equals(other.getTargetCpa())));
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
        if (getTargetCpa() != null) {
            _hashCode += getTargetCpa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetCpaBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "TargetCpaBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetCpa");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "targetCpa"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Money"));
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
