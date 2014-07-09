/**
 * PercentCpaBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;


/**
 * Percentage CPA based bidding where user pays a percent of conversions.
 */
public class PercentCpaBid  extends com.google.api.ads.adwords.axis.v201406.cm.Bids  implements java.io.Serializable {
    /* Percent CPA for ad group or criteria. This is used for calculating
     * the bid value. */
    private java.lang.Integer bid;

    /* The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.BidSource percentCpaBidSource;

    public PercentCpaBid() {
    }

    public PercentCpaBid(
           java.lang.String bidsType,
           java.lang.Integer bid,
           com.google.api.ads.adwords.axis.v201406.cm.BidSource percentCpaBidSource) {
        super(
            bidsType);
        this.bid = bid;
        this.percentCpaBidSource = percentCpaBidSource;
    }


    /**
     * Gets the bid value for this PercentCpaBid.
     * 
     * @return bid   * Percent CPA for ad group or criteria. This is used for calculating
     * the bid value.
     */
    public java.lang.Integer getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this PercentCpaBid.
     * 
     * @param bid   * Percent CPA for ad group or criteria. This is used for calculating
     * the bid value.
     */
    public void setBid(java.lang.Integer bid) {
        this.bid = bid;
    }


    /**
     * Gets the percentCpaBidSource value for this PercentCpaBid.
     * 
     * @return percentCpaBidSource   * The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.BidSource getPercentCpaBidSource() {
        return percentCpaBidSource;
    }


    /**
     * Sets the percentCpaBidSource value for this PercentCpaBid.
     * 
     * @param percentCpaBidSource   * The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setPercentCpaBidSource(com.google.api.ads.adwords.axis.v201406.cm.BidSource percentCpaBidSource) {
        this.percentCpaBidSource = percentCpaBidSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PercentCpaBid)) return false;
        PercentCpaBid other = (PercentCpaBid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid()))) &&
            ((this.percentCpaBidSource==null && other.getPercentCpaBidSource()==null) || 
             (this.percentCpaBidSource!=null &&
              this.percentCpaBidSource.equals(other.getPercentCpaBidSource())));
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
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        if (getPercentCpaBidSource() != null) {
            _hashCode += getPercentCpaBidSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PercentCpaBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "PercentCpaBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentCpaBidSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "percentCpaBidSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "BidSource"));
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
