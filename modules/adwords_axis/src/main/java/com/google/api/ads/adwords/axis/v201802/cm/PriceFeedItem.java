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
 * PriceFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a price extension.
 */
public class PriceFeedItem  extends com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* Price extension type of this extension. Required. */
    private com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionType priceExtensionType;

    /* Price qualifier for all rows of this price extension. */
    private com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceQualifier priceQualifier;

    /* Tracking URL template for all rows of this price extension.
     * To clear this field, set its value
     *                     to an empty string. */
    private java.lang.String trackingUrlTemplate;

    /* The language the advertiser is using for this price extension.
     * Required.
     *                     Supported language codes:
     *                     <ul>
     *                     <li>de</li>
     *                     <li>en</li>
     *                     <li>es</li>
     *                     <li>es-419</li>
     *                     <li>fr</li>
     *                     <li>it</li>
     *                     <li>ja</li>
     *                     <li>nl</li>
     *                     <li>pl</li>
     *                     <li>pt-BR</li>
     *                     <li>pt-PT</li>
     *                     <li>ru</li>
     *                     <li>sv</li>
     *                     </ul> */
    private java.lang.String language;

    /* The rows in this price extension. Minimum number of items allowed
     * is 3 and the maximum number
     *                     is 8. */
    private com.google.api.ads.adwords.axis.v201802.cm.PriceTableRow[] tableRows;

    public PriceFeedItem() {
    }

    public PriceFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTargeting campaignTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting adGroupTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.Keyword keywordTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.Location geoTargeting,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction geoTargetingRestriction,
           com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData[] policyData,
           java.lang.String extensionFeedItemType,
           com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionType priceExtensionType,
           com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceQualifier priceQualifier,
           java.lang.String trackingUrlTemplate,
           java.lang.String language,
           com.google.api.ads.adwords.axis.v201802.cm.PriceTableRow[] tableRows) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            campaignTargeting,
            adGroupTargeting,
            keywordTargeting,
            geoTargeting,
            geoTargetingRestriction,
            policyData,
            extensionFeedItemType);
        this.priceExtensionType = priceExtensionType;
        this.priceQualifier = priceQualifier;
        this.trackingUrlTemplate = trackingUrlTemplate;
        this.language = language;
        this.tableRows = tableRows;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupTargeting", getAdGroupTargeting())
            .add("campaignTargeting", getCampaignTargeting())
            .add("devicePreference", getDevicePreference())
            .add("endTime", getEndTime())
            .add("extensionFeedItemType", getExtensionFeedItemType())
            .add("feedId", getFeedId())
            .add("feedItemId", getFeedItemId())
            .add("feedType", getFeedType())
            .add("geoTargeting", getGeoTargeting())
            .add("geoTargetingRestriction", getGeoTargetingRestriction())
            .add("keywordTargeting", getKeywordTargeting())
            .add("language", getLanguage())
            .add("policyData", getPolicyData())
            .add("priceExtensionType", getPriceExtensionType())
            .add("priceQualifier", getPriceQualifier())
            .add("scheduling", getScheduling())
            .add("startTime", getStartTime())
            .add("status", getStatus())
            .add("tableRows", getTableRows())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .toString();
    }

    /**
     * Gets the priceExtensionType value for this PriceFeedItem.
     * 
     * @return priceExtensionType   * Price extension type of this extension. Required.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionType getPriceExtensionType() {
        return priceExtensionType;
    }


    /**
     * Sets the priceExtensionType value for this PriceFeedItem.
     * 
     * @param priceExtensionType   * Price extension type of this extension. Required.
     */
    public void setPriceExtensionType(com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionType priceExtensionType) {
        this.priceExtensionType = priceExtensionType;
    }


    /**
     * Gets the priceQualifier value for this PriceFeedItem.
     * 
     * @return priceQualifier   * Price qualifier for all rows of this price extension.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceQualifier getPriceQualifier() {
        return priceQualifier;
    }


    /**
     * Sets the priceQualifier value for this PriceFeedItem.
     * 
     * @param priceQualifier   * Price qualifier for all rows of this price extension.
     */
    public void setPriceQualifier(com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceQualifier priceQualifier) {
        this.priceQualifier = priceQualifier;
    }


    /**
     * Gets the trackingUrlTemplate value for this PriceFeedItem.
     * 
     * @return trackingUrlTemplate   * Tracking URL template for all rows of this price extension.
     * To clear this field, set its value
     *                     to an empty string.
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this PriceFeedItem.
     * 
     * @param trackingUrlTemplate   * Tracking URL template for all rows of this price extension.
     * To clear this field, set its value
     *                     to an empty string.
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the language value for this PriceFeedItem.
     * 
     * @return language   * The language the advertiser is using for this price extension.
     * Required.
     *                     Supported language codes:
     *                     <ul>
     *                     <li>de</li>
     *                     <li>en</li>
     *                     <li>es</li>
     *                     <li>es-419</li>
     *                     <li>fr</li>
     *                     <li>it</li>
     *                     <li>ja</li>
     *                     <li>nl</li>
     *                     <li>pl</li>
     *                     <li>pt-BR</li>
     *                     <li>pt-PT</li>
     *                     <li>ru</li>
     *                     <li>sv</li>
     *                     </ul>
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this PriceFeedItem.
     * 
     * @param language   * The language the advertiser is using for this price extension.
     * Required.
     *                     Supported language codes:
     *                     <ul>
     *                     <li>de</li>
     *                     <li>en</li>
     *                     <li>es</li>
     *                     <li>es-419</li>
     *                     <li>fr</li>
     *                     <li>it</li>
     *                     <li>ja</li>
     *                     <li>nl</li>
     *                     <li>pl</li>
     *                     <li>pt-BR</li>
     *                     <li>pt-PT</li>
     *                     <li>ru</li>
     *                     <li>sv</li>
     *                     </ul>
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the tableRows value for this PriceFeedItem.
     * 
     * @return tableRows   * The rows in this price extension. Minimum number of items allowed
     * is 3 and the maximum number
     *                     is 8.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PriceTableRow[] getTableRows() {
        return tableRows;
    }


    /**
     * Sets the tableRows value for this PriceFeedItem.
     * 
     * @param tableRows   * The rows in this price extension. Minimum number of items allowed
     * is 3 and the maximum number
     *                     is 8.
     */
    public void setTableRows(com.google.api.ads.adwords.axis.v201802.cm.PriceTableRow[] tableRows) {
        this.tableRows = tableRows;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.PriceTableRow getTableRows(int i) {
        return this.tableRows[i];
    }

    public void setTableRows(int i, com.google.api.ads.adwords.axis.v201802.cm.PriceTableRow _value) {
        this.tableRows[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceFeedItem)) return false;
        PriceFeedItem other = (PriceFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.priceExtensionType==null && other.getPriceExtensionType()==null) || 
             (this.priceExtensionType!=null &&
              this.priceExtensionType.equals(other.getPriceExtensionType()))) &&
            ((this.priceQualifier==null && other.getPriceQualifier()==null) || 
             (this.priceQualifier!=null &&
              this.priceQualifier.equals(other.getPriceQualifier()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) || 
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.tableRows==null && other.getTableRows()==null) || 
             (this.tableRows!=null &&
              java.util.Arrays.equals(this.tableRows, other.getTableRows())));
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
        if (getPriceExtensionType() != null) {
            _hashCode += getPriceExtensionType().hashCode();
        }
        if (getPriceQualifier() != null) {
            _hashCode += getPriceQualifier().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getTableRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTableRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTableRows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceExtensionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "priceExtensionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceExtensionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "priceQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceExtensionPriceQualifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "trackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableRows");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "tableRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceTableRow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
