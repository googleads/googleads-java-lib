/**
 * CpmBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Manual impression based bids.
 */
public class CpmBid  extends com.google.api.ads.adwords.axis.v201309.cm.Bids  implements java.io.Serializable {
    /* Max CPM (cost per thousand impressions) bid.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CpmBid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Money bid;

    /* The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CpmBidSource".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.BidSource cpmBidSource;

    public CpmBid() {
    }

    public CpmBid(
           java.lang.String bidsType,
           com.google.api.ads.adwords.axis.v201309.cm.Money bid,
           com.google.api.ads.adwords.axis.v201309.cm.BidSource cpmBidSource) {
        super(
            bidsType);
        this.bid = bid;
        this.cpmBidSource = cpmBidSource;
    }


    /**
     * Gets the bid value for this CpmBid.
     * 
     * @return bid   * Max CPM (cost per thousand impressions) bid.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CpmBid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Money getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this CpmBid.
     * 
     * @param bid   * Max CPM (cost per thousand impressions) bid.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CpmBid".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setBid(com.google.api.ads.adwords.axis.v201309.cm.Money bid) {
        this.bid = bid;
    }


    /**
     * Gets the cpmBidSource value for this CpmBid.
     * 
     * @return cpmBidSource   * The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CpmBidSource".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.BidSource getCpmBidSource() {
        return cpmBidSource;
    }


    /**
     * Sets the cpmBidSource value for this CpmBid.
     * 
     * @param cpmBidSource   * The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CpmBidSource".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setCpmBidSource(com.google.api.ads.adwords.axis.v201309.cm.BidSource cpmBidSource) {
        this.cpmBidSource = cpmBidSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpmBid)) return false;
        CpmBid other = (CpmBid) obj;
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
            ((this.cpmBidSource==null && other.getCpmBidSource()==null) || 
             (this.cpmBidSource!=null &&
              this.cpmBidSource.equals(other.getCpmBidSource())));
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
        if (getCpmBidSource() != null) {
            _hashCode += getCpmBidSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpmBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "CpmBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpmBidSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "cpmBidSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "BidSource"));
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
