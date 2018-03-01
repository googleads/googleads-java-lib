// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * CpcBid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Manual click based bids.
 */
public class CpcBid  extends com.google.api.ads.adwords.axis.v201802.cm.Bids  implements java.io.Serializable {
    /* Max CPC (cost per click) bid.
     *                     At the ad group level, this represents the default
     * bid applicable for
     *                     <ul><li>keyword targeting on search network.</li>
     * <li>keywords & placements for content targeting.</li></ul>
     *                     At the ad group criteria level, this is the max
     * cpc bid. */
    private com.google.api.ads.adwords.axis.v201802.cm.Money bid;

    /* The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BidSource cpcBidSource;

    public CpcBid() {
    }

    public CpcBid(
           java.lang.String bidsType,
           com.google.api.ads.adwords.axis.v201802.cm.Money bid,
           com.google.api.ads.adwords.axis.v201802.cm.BidSource cpcBidSource) {
        super(
            bidsType);
        this.bid = bid;
        this.cpcBidSource = cpcBidSource;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bid", getBid())
            .add("bidsType", getBidsType())
            .add("cpcBidSource", getCpcBidSource())
            .toString();
    }

    /**
     * Gets the bid value for this CpcBid.
     * 
     * @return bid   * Max CPC (cost per click) bid.
     *                     At the ad group level, this represents the default
     * bid applicable for
     *                     <ul><li>keyword targeting on search network.</li>
     * <li>keywords & placements for content targeting.</li></ul>
     *                     At the ad group criteria level, this is the max
     * cpc bid.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this CpcBid.
     * 
     * @param bid   * Max CPC (cost per click) bid.
     *                     At the ad group level, this represents the default
     * bid applicable for
     *                     <ul><li>keyword targeting on search network.</li>
     * <li>keywords & placements for content targeting.</li></ul>
     *                     At the ad group criteria level, this is the max
     * cpc bid.
     */
    public void setBid(com.google.api.ads.adwords.axis.v201802.cm.Money bid) {
        this.bid = bid;
    }


    /**
     * Gets the cpcBidSource value for this CpcBid.
     * 
     * @return cpcBidSource   * The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BidSource getCpcBidSource() {
        return cpcBidSource;
    }


    /**
     * Sets the cpcBidSource value for this CpcBid.
     * 
     * @param cpcBidSource   * The level (ad group or criterion) at which the bid was set.
     * This is applicable
     *                     only at the criteria level.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setCpcBidSource(com.google.api.ads.adwords.axis.v201802.cm.BidSource cpcBidSource) {
        this.cpcBidSource = cpcBidSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpcBid)) return false;
        CpcBid other = (CpcBid) obj;
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
            ((this.cpcBidSource==null && other.getCpcBidSource()==null) || 
             (this.cpcBidSource!=null &&
              this.cpcBidSource.equals(other.getCpcBidSource())));
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
        if (getCpcBidSource() != null) {
            _hashCode += getCpcBidSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpcBid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CpcBid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpcBidSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "cpcBidSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BidSource"));
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
