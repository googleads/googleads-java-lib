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
 * RateCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Defines a collection of rules, including base rates for product
 * templates and products, premiums,
 *             proposal line item level adjustments and proposal level
 * adjustments.
 */
public class RateCard  implements java.io.Serializable {
    /* The ID of the {@code RateCard}.
     *                 This attribute is read-only and is assigned by Google
     * when a rate card is created. */
    private java.lang.Long id;

    /* The name of the {@code RateCard}.
     *                 This attribute is required and has a maximum length
     * of 255 characters.
     *                 This attribute must also be case-insensitive unique. */
    private java.lang.String name;

    /* The ISO currency code for the currency used by the {@code RateCard}.
     * This attribute is optional
     *                 to create a {@code RateCard} and defaults to the {@link
     * Network#currencyCode network's
     *                 currency}. This attribute is read-only if either the
     * {@code RateCard} is for Marketplace or
     *                 once a {@link ProposalLineItem} has been created using
     * this {@code RateCard}. */
    private java.lang.String currencyCode;

    /* The status of the {@code RateCard}.
     *                 This attribute is read-only and is assigned by Google.
     * Rate cards are
     *                 created in the {@link RateCardStatus#INACTIVE} state. */
    private com.google.api.ads.dfp.axis.v201802.RateCardStatus status;

    /* Whether or not the {@code RateCard} can be used for Marketplace
     * {@link Product products}.
     *                 This attribute is read-only and assigned by Google. */
    private java.lang.Boolean forMarketplace;

    /* The {@link PricingModel} of the {@code RateCard}.
     *                 <p>This attribute is required to create a {@code RateCard}.
     * <p>This attribute is read-only if either the {@code RateCard} is for
     * Marketplace or once a
     *                 {@link ProposalLineItem} has been created using this
     * {@code RateCard}. */
    private com.google.api.ads.dfp.axis.v201802.PricingModel pricingModel;

    /* The IDs of all teams this rate card is directly in.
     *                 This attribute is optional. */
    private long[] appliedTeamIds;

    /* The date and time this {@code RateCard} was last modified.
     *                 
     *                 <p>This attribute is readonly and is assigned by Google
     * when a {@code RateCard} is updated. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    public RateCard() {
    }

    public RateCard(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String currencyCode,
           com.google.api.ads.dfp.axis.v201802.RateCardStatus status,
           java.lang.Boolean forMarketplace,
           com.google.api.ads.dfp.axis.v201802.PricingModel pricingModel,
           long[] appliedTeamIds,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
           this.id = id;
           this.name = name;
           this.currencyCode = currencyCode;
           this.status = status;
           this.forMarketplace = forMarketplace;
           this.pricingModel = pricingModel;
           this.appliedTeamIds = appliedTeamIds;
           this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("appliedTeamIds", getAppliedTeamIds())
            .add("currencyCode", getCurrencyCode())
            .add("forMarketplace", getForMarketplace())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("pricingModel", getPricingModel())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this RateCard.
     * 
     * @return id   * The ID of the {@code RateCard}.
     *                 This attribute is read-only and is assigned by Google
     * when a rate card is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this RateCard.
     * 
     * @param id   * The ID of the {@code RateCard}.
     *                 This attribute is read-only and is assigned by Google
     * when a rate card is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this RateCard.
     * 
     * @return name   * The name of the {@code RateCard}.
     *                 This attribute is required and has a maximum length
     * of 255 characters.
     *                 This attribute must also be case-insensitive unique.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RateCard.
     * 
     * @param name   * The name of the {@code RateCard}.
     *                 This attribute is required and has a maximum length
     * of 255 characters.
     *                 This attribute must also be case-insensitive unique.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the currencyCode value for this RateCard.
     * 
     * @return currencyCode   * The ISO currency code for the currency used by the {@code RateCard}.
     * This attribute is optional
     *                 to create a {@code RateCard} and defaults to the {@link
     * Network#currencyCode network's
     *                 currency}. This attribute is read-only if either the
     * {@code RateCard} is for Marketplace or
     *                 once a {@link ProposalLineItem} has been created using
     * this {@code RateCard}.
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this RateCard.
     * 
     * @param currencyCode   * The ISO currency code for the currency used by the {@code RateCard}.
     * This attribute is optional
     *                 to create a {@code RateCard} and defaults to the {@link
     * Network#currencyCode network's
     *                 currency}. This attribute is read-only if either the
     * {@code RateCard} is for Marketplace or
     *                 once a {@link ProposalLineItem} has been created using
     * this {@code RateCard}.
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the status value for this RateCard.
     * 
     * @return status   * The status of the {@code RateCard}.
     *                 This attribute is read-only and is assigned by Google.
     * Rate cards are
     *                 created in the {@link RateCardStatus#INACTIVE} state.
     */
    public com.google.api.ads.dfp.axis.v201802.RateCardStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RateCard.
     * 
     * @param status   * The status of the {@code RateCard}.
     *                 This attribute is read-only and is assigned by Google.
     * Rate cards are
     *                 created in the {@link RateCardStatus#INACTIVE} state.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.RateCardStatus status) {
        this.status = status;
    }


    /**
     * Gets the forMarketplace value for this RateCard.
     * 
     * @return forMarketplace   * Whether or not the {@code RateCard} can be used for Marketplace
     * {@link Product products}.
     *                 This attribute is read-only and assigned by Google.
     */
    public java.lang.Boolean getForMarketplace() {
        return forMarketplace;
    }


    /**
     * Sets the forMarketplace value for this RateCard.
     * 
     * @param forMarketplace   * Whether or not the {@code RateCard} can be used for Marketplace
     * {@link Product products}.
     *                 This attribute is read-only and assigned by Google.
     */
    public void setForMarketplace(java.lang.Boolean forMarketplace) {
        this.forMarketplace = forMarketplace;
    }


    /**
     * Gets the pricingModel value for this RateCard.
     * 
     * @return pricingModel   * The {@link PricingModel} of the {@code RateCard}.
     *                 <p>This attribute is required to create a {@code RateCard}.
     * <p>This attribute is read-only if either the {@code RateCard} is for
     * Marketplace or once a
     *                 {@link ProposalLineItem} has been created using this
     * {@code RateCard}.
     */
    public com.google.api.ads.dfp.axis.v201802.PricingModel getPricingModel() {
        return pricingModel;
    }


    /**
     * Sets the pricingModel value for this RateCard.
     * 
     * @param pricingModel   * The {@link PricingModel} of the {@code RateCard}.
     *                 <p>This attribute is required to create a {@code RateCard}.
     * <p>This attribute is read-only if either the {@code RateCard} is for
     * Marketplace or once a
     *                 {@link ProposalLineItem} has been created using this
     * {@code RateCard}.
     */
    public void setPricingModel(com.google.api.ads.dfp.axis.v201802.PricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }


    /**
     * Gets the appliedTeamIds value for this RateCard.
     * 
     * @return appliedTeamIds   * The IDs of all teams this rate card is directly in.
     *                 This attribute is optional.
     */
    public long[] getAppliedTeamIds() {
        return appliedTeamIds;
    }


    /**
     * Sets the appliedTeamIds value for this RateCard.
     * 
     * @param appliedTeamIds   * The IDs of all teams this rate card is directly in.
     *                 This attribute is optional.
     */
    public void setAppliedTeamIds(long[] appliedTeamIds) {
        this.appliedTeamIds = appliedTeamIds;
    }

    public long getAppliedTeamIds(int i) {
        return this.appliedTeamIds[i];
    }

    public void setAppliedTeamIds(int i, long _value) {
        this.appliedTeamIds[i] = _value;
    }


    /**
     * Gets the lastModifiedDateTime value for this RateCard.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code RateCard} was last modified.
     *                 
     *                 <p>This attribute is readonly and is assigned by Google
     * when a {@code RateCard} is updated.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this RateCard.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code RateCard} was last modified.
     *                 
     *                 <p>This attribute is readonly and is assigned by Google
     * when a {@code RateCard} is updated.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateCard)) return false;
        RateCard other = (RateCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.forMarketplace==null && other.getForMarketplace()==null) || 
             (this.forMarketplace!=null &&
              this.forMarketplace.equals(other.getForMarketplace()))) &&
            ((this.pricingModel==null && other.getPricingModel()==null) || 
             (this.pricingModel!=null &&
              this.pricingModel.equals(other.getPricingModel()))) &&
            ((this.appliedTeamIds==null && other.getAppliedTeamIds()==null) || 
             (this.appliedTeamIds!=null &&
              java.util.Arrays.equals(this.appliedTeamIds, other.getAppliedTeamIds()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getForMarketplace() != null) {
            _hashCode += getForMarketplace().hashCode();
        }
        if (getPricingModel() != null) {
            _hashCode += getPricingModel().hashCode();
        }
        if (getAppliedTeamIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedTeamIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedTeamIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RateCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RateCardStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forMarketplace");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "forMarketplace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "pricingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PricingModel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedTeamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "appliedTeamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
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
