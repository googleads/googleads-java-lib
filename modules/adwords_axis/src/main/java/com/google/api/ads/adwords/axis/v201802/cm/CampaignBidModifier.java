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
 * CampaignBidModifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a bid-modifiable only criterion at the campaign level.
 */
public class CampaignBidModifier  implements java.io.Serializable {
    /* The campaign that the criterion is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long campaignId;

    /* The criterion to which the bid modifier is applied.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion;

    /* The name of the campaign the criterion is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String campaignName;

    /* The advertising channel type of the campaign the criterion
     * is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdvertisingChannelType".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType advertisingChannelType;

    /* The bid modifier for bids when the criterion matches.
     *                 
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BidModifier".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span> */
    private java.lang.Double bidModifier;

    public CampaignBidModifier() {
    }

    public CampaignBidModifier(
           java.lang.Long campaignId,
           com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion,
           java.lang.String campaignName,
           com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType advertisingChannelType,
           java.lang.Double bidModifier) {
           this.campaignId = campaignId;
           this.criterion = criterion;
           this.campaignName = campaignName;
           this.advertisingChannelType = advertisingChannelType;
           this.bidModifier = bidModifier;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertisingChannelType", getAdvertisingChannelType())
            .add("bidModifier", getBidModifier())
            .add("campaignId", getCampaignId())
            .add("campaignName", getCampaignName())
            .add("criterion", getCriterion())
            .toString();
    }

    /**
     * Gets the campaignId value for this CampaignBidModifier.
     * 
     * @return campaignId   * The campaign that the criterion is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignBidModifier.
     * 
     * @param campaignId   * The campaign that the criterion is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the criterion value for this CampaignBidModifier.
     * 
     * @return criterion   * The criterion to which the bid modifier is applied.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Criterion getCriterion() {
        return criterion;
    }


    /**
     * Sets the criterion value for this CampaignBidModifier.
     * 
     * @param criterion   * The criterion to which the bid modifier is applied.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterion(com.google.api.ads.adwords.axis.v201802.cm.Criterion criterion) {
        this.criterion = criterion;
    }


    /**
     * Gets the campaignName value for this CampaignBidModifier.
     * 
     * @return campaignName   * The name of the campaign the criterion is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this CampaignBidModifier.
     * 
     * @param campaignName   * The name of the campaign the criterion is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the advertisingChannelType value for this CampaignBidModifier.
     * 
     * @return advertisingChannelType   * The advertising channel type of the campaign the criterion
     * is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdvertisingChannelType".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType getAdvertisingChannelType() {
        return advertisingChannelType;
    }


    /**
     * Sets the advertisingChannelType value for this CampaignBidModifier.
     * 
     * @param advertisingChannelType   * The advertising channel type of the campaign the criterion
     * is in.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdvertisingChannelType".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setAdvertisingChannelType(com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType advertisingChannelType) {
        this.advertisingChannelType = advertisingChannelType;
    }


    /**
     * Gets the bidModifier value for this CampaignBidModifier.
     * 
     * @return bidModifier   * The bid modifier for bids when the criterion matches.
     *                 
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BidModifier".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public java.lang.Double getBidModifier() {
        return bidModifier;
    }


    /**
     * Sets the bidModifier value for this CampaignBidModifier.
     * 
     * @param bidModifier   * The bid modifier for bids when the criterion matches.
     *                 
     *                 <p>Valid modifier values range from {@code 0.1} to
     * {@code 10.0}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BidModifier".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public void setBidModifier(java.lang.Double bidModifier) {
        this.bidModifier = bidModifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignBidModifier)) return false;
        CampaignBidModifier other = (CampaignBidModifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.criterion==null && other.getCriterion()==null) || 
             (this.criterion!=null &&
              this.criterion.equals(other.getCriterion()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.advertisingChannelType==null && other.getAdvertisingChannelType()==null) || 
             (this.advertisingChannelType!=null &&
              this.advertisingChannelType.equals(other.getAdvertisingChannelType()))) &&
            ((this.bidModifier==null && other.getBidModifier()==null) || 
             (this.bidModifier!=null &&
              this.bidModifier.equals(other.getBidModifier())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCriterion() != null) {
            _hashCode += getCriterion().hashCode();
        }
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getAdvertisingChannelType() != null) {
            _hashCode += getAdvertisingChannelType().hashCode();
        }
        if (getBidModifier() != null) {
            _hashCode += getBidModifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignBidModifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignBidModifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "criterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Criterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertisingChannelType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "advertisingChannelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdvertisingChannelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bidModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
