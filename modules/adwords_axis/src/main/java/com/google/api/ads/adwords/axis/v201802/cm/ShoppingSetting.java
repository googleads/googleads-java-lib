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
 * ShoppingSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Setting for shopping campaigns. Defines the universe of products
 * covered by the campaign.
 *             Encapsulates a merchant ID, sales country, and campaign
 * priority.
 */
public class ShoppingSetting  extends com.google.api.ads.adwords.axis.v201802.cm.Setting  implements java.io.Serializable {
    /* ID of the Merchant Center account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Long merchantId;

    /* Sales country of products to include in the campaign.
     *                     This must be set to 'ZZ' for Campaigns of types
     * other than
     *                     {@link AdvertisingChannelType#SHOPPING}
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String salesCountry;

    /* Priority of the campaign. Campaigns with numerically higher
     * priorities take precedence over
     *                     those with lower priorities.
     *                     <span class="constraint CampaignType">This field
     * may only be set to 3 for campaign channel type SHOPPING with campaign
     * channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 2, inclusive.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Integer campaignPriority;

    /* Enable local inventory ads.
     *                     <span class="constraint CampaignType">This field
     * may only be set to false for campaign channel type SHOPPING with campaign
     * channel subtype SHOPPING_UNIVERSAL_ADS.</span> */
    private java.lang.Boolean enableLocal;

    /* The platform on which a shopping product can be purchased.
     *                     
     *                     The merchantId must also be provided if changing
     * purchase platform to
     *                     GOOGLE or MERCHANT_AND_GOOGLE.
     *                     <span class="constraint CampaignType">This field
     * may only be set to MERCHANT for campaign channel type SHOPPING with
     * campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ShoppingPurchasePlatform purchasePlatform;

    public ShoppingSetting() {
    }

    public ShoppingSetting(
           java.lang.String settingType,
           java.lang.Long merchantId,
           java.lang.String salesCountry,
           java.lang.Integer campaignPriority,
           java.lang.Boolean enableLocal,
           com.google.api.ads.adwords.axis.v201802.cm.ShoppingPurchasePlatform purchasePlatform) {
        super(
            settingType);
        this.merchantId = merchantId;
        this.salesCountry = salesCountry;
        this.campaignPriority = campaignPriority;
        this.enableLocal = enableLocal;
        this.purchasePlatform = purchasePlatform;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("campaignPriority", getCampaignPriority())
            .add("enableLocal", getEnableLocal())
            .add("merchantId", getMerchantId())
            .add("purchasePlatform", getPurchasePlatform())
            .add("salesCountry", getSalesCountry())
            .add("settingType", getSettingType())
            .toString();
    }

    /**
     * Gets the merchantId value for this ShoppingSetting.
     * 
     * @return merchantId   * ID of the Merchant Center account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Long getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this ShoppingSetting.
     * 
     * @param merchantId   * ID of the Merchant Center account.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMerchantId(java.lang.Long merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the salesCountry value for this ShoppingSetting.
     * 
     * @return salesCountry   * Sales country of products to include in the campaign.
     *                     This must be set to 'ZZ' for Campaigns of types
     * other than
     *                     {@link AdvertisingChannelType#SHOPPING}
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getSalesCountry() {
        return salesCountry;
    }


    /**
     * Sets the salesCountry value for this ShoppingSetting.
     * 
     * @param salesCountry   * Sales country of products to include in the campaign.
     *                     This must be set to 'ZZ' for Campaigns of types
     * other than
     *                     {@link AdvertisingChannelType#SHOPPING}
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setSalesCountry(java.lang.String salesCountry) {
        this.salesCountry = salesCountry;
    }


    /**
     * Gets the campaignPriority value for this ShoppingSetting.
     * 
     * @return campaignPriority   * Priority of the campaign. Campaigns with numerically higher
     * priorities take precedence over
     *                     those with lower priorities.
     *                     <span class="constraint CampaignType">This field
     * may only be set to 3 for campaign channel type SHOPPING with campaign
     * channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 2, inclusive.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Integer getCampaignPriority() {
        return campaignPriority;
    }


    /**
     * Sets the campaignPriority value for this ShoppingSetting.
     * 
     * @param campaignPriority   * Priority of the campaign. Campaigns with numerically higher
     * priorities take precedence over
     *                     those with lower priorities.
     *                     <span class="constraint CampaignType">This field
     * may only be set to 3 for campaign channel type SHOPPING with campaign
     * channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 2, inclusive.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setCampaignPriority(java.lang.Integer campaignPriority) {
        this.campaignPriority = campaignPriority;
    }


    /**
     * Gets the enableLocal value for this ShoppingSetting.
     * 
     * @return enableLocal   * Enable local inventory ads.
     *                     <span class="constraint CampaignType">This field
     * may only be set to false for campaign channel type SHOPPING with campaign
     * channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public java.lang.Boolean getEnableLocal() {
        return enableLocal;
    }


    /**
     * Sets the enableLocal value for this ShoppingSetting.
     * 
     * @param enableLocal   * Enable local inventory ads.
     *                     <span class="constraint CampaignType">This field
     * may only be set to false for campaign channel type SHOPPING with campaign
     * channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public void setEnableLocal(java.lang.Boolean enableLocal) {
        this.enableLocal = enableLocal;
    }


    /**
     * Gets the purchasePlatform value for this ShoppingSetting.
     * 
     * @return purchasePlatform   * The platform on which a shopping product can be purchased.
     *                     
     *                     The merchantId must also be provided if changing
     * purchase platform to
     *                     GOOGLE or MERCHANT_AND_GOOGLE.
     *                     <span class="constraint CampaignType">This field
     * may only be set to MERCHANT for campaign channel type SHOPPING with
     * campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ShoppingPurchasePlatform getPurchasePlatform() {
        return purchasePlatform;
    }


    /**
     * Sets the purchasePlatform value for this ShoppingSetting.
     * 
     * @param purchasePlatform   * The platform on which a shopping product can be purchased.
     *                     
     *                     The merchantId must also be provided if changing
     * purchase platform to
     *                     GOOGLE or MERCHANT_AND_GOOGLE.
     *                     <span class="constraint CampaignType">This field
     * may only be set to MERCHANT for campaign channel type SHOPPING with
     * campaign channel subtype SHOPPING_UNIVERSAL_ADS.</span>
     */
    public void setPurchasePlatform(com.google.api.ads.adwords.axis.v201802.cm.ShoppingPurchasePlatform purchasePlatform) {
        this.purchasePlatform = purchasePlatform;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShoppingSetting)) return false;
        ShoppingSetting other = (ShoppingSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.salesCountry==null && other.getSalesCountry()==null) || 
             (this.salesCountry!=null &&
              this.salesCountry.equals(other.getSalesCountry()))) &&
            ((this.campaignPriority==null && other.getCampaignPriority()==null) || 
             (this.campaignPriority!=null &&
              this.campaignPriority.equals(other.getCampaignPriority()))) &&
            ((this.enableLocal==null && other.getEnableLocal()==null) || 
             (this.enableLocal!=null &&
              this.enableLocal.equals(other.getEnableLocal()))) &&
            ((this.purchasePlatform==null && other.getPurchasePlatform()==null) || 
             (this.purchasePlatform!=null &&
              this.purchasePlatform.equals(other.getPurchasePlatform())));
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
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getSalesCountry() != null) {
            _hashCode += getSalesCountry().hashCode();
        }
        if (getCampaignPriority() != null) {
            _hashCode += getCampaignPriority().hashCode();
        }
        if (getEnableLocal() != null) {
            _hashCode += getEnableLocal().hashCode();
        }
        if (getPurchasePlatform() != null) {
            _hashCode += getPurchasePlatform().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShoppingSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShoppingSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "merchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "salesCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "enableLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasePlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "purchasePlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShoppingPurchasePlatform"));
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
