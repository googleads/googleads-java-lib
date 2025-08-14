// Copyright 2025 Google LLC
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
 * Targeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;

public class Targeting  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202508.GeoTargeting geoTargeting;

    private com.google.api.ads.admanager.axis.v202508.InventoryTargeting inventoryTargeting;

    private com.google.api.ads.admanager.axis.v202508.DayPartTargeting dayPartTargeting;

    private com.google.api.ads.admanager.axis.v202508.DateTimeRangeTargeting dateTimeRangeTargeting;

    private com.google.api.ads.admanager.axis.v202508.TechnologyTargeting technologyTargeting;

    private com.google.api.ads.admanager.axis.v202508.CustomCriteriaSet customTargeting;

    private com.google.api.ads.admanager.axis.v202508.UserDomainTargeting userDomainTargeting;

    private com.google.api.ads.admanager.axis.v202508.ContentTargeting contentTargeting;

    private com.google.api.ads.admanager.axis.v202508.VideoPositionTargeting videoPositionTargeting;

    private com.google.api.ads.admanager.axis.v202508.MobileApplicationTargeting mobileApplicationTargeting;

    private com.google.api.ads.admanager.axis.v202508.BuyerUserListTargeting buyerUserListTargeting;

    private com.google.api.ads.admanager.axis.v202508.InventoryUrlTargeting inventoryUrlTargeting;

    private com.google.api.ads.admanager.axis.v202508.VerticalTargeting verticalTargeting;

    private com.google.api.ads.admanager.axis.v202508.ContentLabelTargeting contentLabelTargeting;

    private com.google.api.ads.admanager.axis.v202508.RequestPlatformTargeting requestPlatformTargeting;

    private com.google.api.ads.admanager.axis.v202508.InventorySizeTargeting inventorySizeTargeting;

    public Targeting() {
    }

    public Targeting(
           com.google.api.ads.admanager.axis.v202508.GeoTargeting geoTargeting,
           com.google.api.ads.admanager.axis.v202508.InventoryTargeting inventoryTargeting,
           com.google.api.ads.admanager.axis.v202508.DayPartTargeting dayPartTargeting,
           com.google.api.ads.admanager.axis.v202508.DateTimeRangeTargeting dateTimeRangeTargeting,
           com.google.api.ads.admanager.axis.v202508.TechnologyTargeting technologyTargeting,
           com.google.api.ads.admanager.axis.v202508.CustomCriteriaSet customTargeting,
           com.google.api.ads.admanager.axis.v202508.UserDomainTargeting userDomainTargeting,
           com.google.api.ads.admanager.axis.v202508.ContentTargeting contentTargeting,
           com.google.api.ads.admanager.axis.v202508.VideoPositionTargeting videoPositionTargeting,
           com.google.api.ads.admanager.axis.v202508.MobileApplicationTargeting mobileApplicationTargeting,
           com.google.api.ads.admanager.axis.v202508.BuyerUserListTargeting buyerUserListTargeting,
           com.google.api.ads.admanager.axis.v202508.InventoryUrlTargeting inventoryUrlTargeting,
           com.google.api.ads.admanager.axis.v202508.VerticalTargeting verticalTargeting,
           com.google.api.ads.admanager.axis.v202508.ContentLabelTargeting contentLabelTargeting,
           com.google.api.ads.admanager.axis.v202508.RequestPlatformTargeting requestPlatformTargeting,
           com.google.api.ads.admanager.axis.v202508.InventorySizeTargeting inventorySizeTargeting) {
           this.geoTargeting = geoTargeting;
           this.inventoryTargeting = inventoryTargeting;
           this.dayPartTargeting = dayPartTargeting;
           this.dateTimeRangeTargeting = dateTimeRangeTargeting;
           this.technologyTargeting = technologyTargeting;
           this.customTargeting = customTargeting;
           this.userDomainTargeting = userDomainTargeting;
           this.contentTargeting = contentTargeting;
           this.videoPositionTargeting = videoPositionTargeting;
           this.mobileApplicationTargeting = mobileApplicationTargeting;
           this.buyerUserListTargeting = buyerUserListTargeting;
           this.inventoryUrlTargeting = inventoryUrlTargeting;
           this.verticalTargeting = verticalTargeting;
           this.contentLabelTargeting = contentLabelTargeting;
           this.requestPlatformTargeting = requestPlatformTargeting;
           this.inventorySizeTargeting = inventorySizeTargeting;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("buyerUserListTargeting", getBuyerUserListTargeting())
            .add("contentLabelTargeting", getContentLabelTargeting())
            .add("contentTargeting", getContentTargeting())
            .add("customTargeting", getCustomTargeting())
            .add("dateTimeRangeTargeting", getDateTimeRangeTargeting())
            .add("dayPartTargeting", getDayPartTargeting())
            .add("geoTargeting", getGeoTargeting())
            .add("inventorySizeTargeting", getInventorySizeTargeting())
            .add("inventoryTargeting", getInventoryTargeting())
            .add("inventoryUrlTargeting", getInventoryUrlTargeting())
            .add("mobileApplicationTargeting", getMobileApplicationTargeting())
            .add("requestPlatformTargeting", getRequestPlatformTargeting())
            .add("technologyTargeting", getTechnologyTargeting())
            .add("userDomainTargeting", getUserDomainTargeting())
            .add("verticalTargeting", getVerticalTargeting())
            .add("videoPositionTargeting", getVideoPositionTargeting())
            .toString();
    }

    /**
     * Gets the geoTargeting value for this Targeting.
     * 
     * @return geoTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.GeoTargeting getGeoTargeting() {
        return geoTargeting;
    }


    /**
     * Sets the geoTargeting value for this Targeting.
     * 
     * @param geoTargeting
     */
    public void setGeoTargeting(com.google.api.ads.admanager.axis.v202508.GeoTargeting geoTargeting) {
        this.geoTargeting = geoTargeting;
    }


    /**
     * Gets the inventoryTargeting value for this Targeting.
     * 
     * @return inventoryTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.InventoryTargeting getInventoryTargeting() {
        return inventoryTargeting;
    }


    /**
     * Sets the inventoryTargeting value for this Targeting.
     * 
     * @param inventoryTargeting
     */
    public void setInventoryTargeting(com.google.api.ads.admanager.axis.v202508.InventoryTargeting inventoryTargeting) {
        this.inventoryTargeting = inventoryTargeting;
    }


    /**
     * Gets the dayPartTargeting value for this Targeting.
     * 
     * @return dayPartTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.DayPartTargeting getDayPartTargeting() {
        return dayPartTargeting;
    }


    /**
     * Sets the dayPartTargeting value for this Targeting.
     * 
     * @param dayPartTargeting
     */
    public void setDayPartTargeting(com.google.api.ads.admanager.axis.v202508.DayPartTargeting dayPartTargeting) {
        this.dayPartTargeting = dayPartTargeting;
    }


    /**
     * Gets the dateTimeRangeTargeting value for this Targeting.
     * 
     * @return dateTimeRangeTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.DateTimeRangeTargeting getDateTimeRangeTargeting() {
        return dateTimeRangeTargeting;
    }


    /**
     * Sets the dateTimeRangeTargeting value for this Targeting.
     * 
     * @param dateTimeRangeTargeting
     */
    public void setDateTimeRangeTargeting(com.google.api.ads.admanager.axis.v202508.DateTimeRangeTargeting dateTimeRangeTargeting) {
        this.dateTimeRangeTargeting = dateTimeRangeTargeting;
    }


    /**
     * Gets the technologyTargeting value for this Targeting.
     * 
     * @return technologyTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.TechnologyTargeting getTechnologyTargeting() {
        return technologyTargeting;
    }


    /**
     * Sets the technologyTargeting value for this Targeting.
     * 
     * @param technologyTargeting
     */
    public void setTechnologyTargeting(com.google.api.ads.admanager.axis.v202508.TechnologyTargeting technologyTargeting) {
        this.technologyTargeting = technologyTargeting;
    }


    /**
     * Gets the customTargeting value for this Targeting.
     * 
     * @return customTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.CustomCriteriaSet getCustomTargeting() {
        return customTargeting;
    }


    /**
     * Sets the customTargeting value for this Targeting.
     * 
     * @param customTargeting
     */
    public void setCustomTargeting(com.google.api.ads.admanager.axis.v202508.CustomCriteriaSet customTargeting) {
        this.customTargeting = customTargeting;
    }


    /**
     * Gets the userDomainTargeting value for this Targeting.
     * 
     * @return userDomainTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.UserDomainTargeting getUserDomainTargeting() {
        return userDomainTargeting;
    }


    /**
     * Sets the userDomainTargeting value for this Targeting.
     * 
     * @param userDomainTargeting
     */
    public void setUserDomainTargeting(com.google.api.ads.admanager.axis.v202508.UserDomainTargeting userDomainTargeting) {
        this.userDomainTargeting = userDomainTargeting;
    }


    /**
     * Gets the contentTargeting value for this Targeting.
     * 
     * @return contentTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.ContentTargeting getContentTargeting() {
        return contentTargeting;
    }


    /**
     * Sets the contentTargeting value for this Targeting.
     * 
     * @param contentTargeting
     */
    public void setContentTargeting(com.google.api.ads.admanager.axis.v202508.ContentTargeting contentTargeting) {
        this.contentTargeting = contentTargeting;
    }


    /**
     * Gets the videoPositionTargeting value for this Targeting.
     * 
     * @return videoPositionTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.VideoPositionTargeting getVideoPositionTargeting() {
        return videoPositionTargeting;
    }


    /**
     * Sets the videoPositionTargeting value for this Targeting.
     * 
     * @param videoPositionTargeting
     */
    public void setVideoPositionTargeting(com.google.api.ads.admanager.axis.v202508.VideoPositionTargeting videoPositionTargeting) {
        this.videoPositionTargeting = videoPositionTargeting;
    }


    /**
     * Gets the mobileApplicationTargeting value for this Targeting.
     * 
     * @return mobileApplicationTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.MobileApplicationTargeting getMobileApplicationTargeting() {
        return mobileApplicationTargeting;
    }


    /**
     * Sets the mobileApplicationTargeting value for this Targeting.
     * 
     * @param mobileApplicationTargeting
     */
    public void setMobileApplicationTargeting(com.google.api.ads.admanager.axis.v202508.MobileApplicationTargeting mobileApplicationTargeting) {
        this.mobileApplicationTargeting = mobileApplicationTargeting;
    }


    /**
     * Gets the buyerUserListTargeting value for this Targeting.
     * 
     * @return buyerUserListTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.BuyerUserListTargeting getBuyerUserListTargeting() {
        return buyerUserListTargeting;
    }


    /**
     * Sets the buyerUserListTargeting value for this Targeting.
     * 
     * @param buyerUserListTargeting
     */
    public void setBuyerUserListTargeting(com.google.api.ads.admanager.axis.v202508.BuyerUserListTargeting buyerUserListTargeting) {
        this.buyerUserListTargeting = buyerUserListTargeting;
    }


    /**
     * Gets the inventoryUrlTargeting value for this Targeting.
     * 
     * @return inventoryUrlTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.InventoryUrlTargeting getInventoryUrlTargeting() {
        return inventoryUrlTargeting;
    }


    /**
     * Sets the inventoryUrlTargeting value for this Targeting.
     * 
     * @param inventoryUrlTargeting
     */
    public void setInventoryUrlTargeting(com.google.api.ads.admanager.axis.v202508.InventoryUrlTargeting inventoryUrlTargeting) {
        this.inventoryUrlTargeting = inventoryUrlTargeting;
    }


    /**
     * Gets the verticalTargeting value for this Targeting.
     * 
     * @return verticalTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.VerticalTargeting getVerticalTargeting() {
        return verticalTargeting;
    }


    /**
     * Sets the verticalTargeting value for this Targeting.
     * 
     * @param verticalTargeting
     */
    public void setVerticalTargeting(com.google.api.ads.admanager.axis.v202508.VerticalTargeting verticalTargeting) {
        this.verticalTargeting = verticalTargeting;
    }


    /**
     * Gets the contentLabelTargeting value for this Targeting.
     * 
     * @return contentLabelTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.ContentLabelTargeting getContentLabelTargeting() {
        return contentLabelTargeting;
    }


    /**
     * Sets the contentLabelTargeting value for this Targeting.
     * 
     * @param contentLabelTargeting
     */
    public void setContentLabelTargeting(com.google.api.ads.admanager.axis.v202508.ContentLabelTargeting contentLabelTargeting) {
        this.contentLabelTargeting = contentLabelTargeting;
    }


    /**
     * Gets the requestPlatformTargeting value for this Targeting.
     * 
     * @return requestPlatformTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.RequestPlatformTargeting getRequestPlatformTargeting() {
        return requestPlatformTargeting;
    }


    /**
     * Sets the requestPlatformTargeting value for this Targeting.
     * 
     * @param requestPlatformTargeting
     */
    public void setRequestPlatformTargeting(com.google.api.ads.admanager.axis.v202508.RequestPlatformTargeting requestPlatformTargeting) {
        this.requestPlatformTargeting = requestPlatformTargeting;
    }


    /**
     * Gets the inventorySizeTargeting value for this Targeting.
     * 
     * @return inventorySizeTargeting
     */
    public com.google.api.ads.admanager.axis.v202508.InventorySizeTargeting getInventorySizeTargeting() {
        return inventorySizeTargeting;
    }


    /**
     * Sets the inventorySizeTargeting value for this Targeting.
     * 
     * @param inventorySizeTargeting
     */
    public void setInventorySizeTargeting(com.google.api.ads.admanager.axis.v202508.InventorySizeTargeting inventorySizeTargeting) {
        this.inventorySizeTargeting = inventorySizeTargeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Targeting)) return false;
        Targeting other = (Targeting) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoTargeting==null && other.getGeoTargeting()==null) || 
             (this.geoTargeting!=null &&
              this.geoTargeting.equals(other.getGeoTargeting()))) &&
            ((this.inventoryTargeting==null && other.getInventoryTargeting()==null) || 
             (this.inventoryTargeting!=null &&
              this.inventoryTargeting.equals(other.getInventoryTargeting()))) &&
            ((this.dayPartTargeting==null && other.getDayPartTargeting()==null) || 
             (this.dayPartTargeting!=null &&
              this.dayPartTargeting.equals(other.getDayPartTargeting()))) &&
            ((this.dateTimeRangeTargeting==null && other.getDateTimeRangeTargeting()==null) || 
             (this.dateTimeRangeTargeting!=null &&
              this.dateTimeRangeTargeting.equals(other.getDateTimeRangeTargeting()))) &&
            ((this.technologyTargeting==null && other.getTechnologyTargeting()==null) || 
             (this.technologyTargeting!=null &&
              this.technologyTargeting.equals(other.getTechnologyTargeting()))) &&
            ((this.customTargeting==null && other.getCustomTargeting()==null) || 
             (this.customTargeting!=null &&
              this.customTargeting.equals(other.getCustomTargeting()))) &&
            ((this.userDomainTargeting==null && other.getUserDomainTargeting()==null) || 
             (this.userDomainTargeting!=null &&
              this.userDomainTargeting.equals(other.getUserDomainTargeting()))) &&
            ((this.contentTargeting==null && other.getContentTargeting()==null) || 
             (this.contentTargeting!=null &&
              this.contentTargeting.equals(other.getContentTargeting()))) &&
            ((this.videoPositionTargeting==null && other.getVideoPositionTargeting()==null) || 
             (this.videoPositionTargeting!=null &&
              this.videoPositionTargeting.equals(other.getVideoPositionTargeting()))) &&
            ((this.mobileApplicationTargeting==null && other.getMobileApplicationTargeting()==null) || 
             (this.mobileApplicationTargeting!=null &&
              this.mobileApplicationTargeting.equals(other.getMobileApplicationTargeting()))) &&
            ((this.buyerUserListTargeting==null && other.getBuyerUserListTargeting()==null) || 
             (this.buyerUserListTargeting!=null &&
              this.buyerUserListTargeting.equals(other.getBuyerUserListTargeting()))) &&
            ((this.inventoryUrlTargeting==null && other.getInventoryUrlTargeting()==null) || 
             (this.inventoryUrlTargeting!=null &&
              this.inventoryUrlTargeting.equals(other.getInventoryUrlTargeting()))) &&
            ((this.verticalTargeting==null && other.getVerticalTargeting()==null) || 
             (this.verticalTargeting!=null &&
              this.verticalTargeting.equals(other.getVerticalTargeting()))) &&
            ((this.contentLabelTargeting==null && other.getContentLabelTargeting()==null) || 
             (this.contentLabelTargeting!=null &&
              this.contentLabelTargeting.equals(other.getContentLabelTargeting()))) &&
            ((this.requestPlatformTargeting==null && other.getRequestPlatformTargeting()==null) || 
             (this.requestPlatformTargeting!=null &&
              this.requestPlatformTargeting.equals(other.getRequestPlatformTargeting()))) &&
            ((this.inventorySizeTargeting==null && other.getInventorySizeTargeting()==null) || 
             (this.inventorySizeTargeting!=null &&
              this.inventorySizeTargeting.equals(other.getInventorySizeTargeting())));
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
        if (getGeoTargeting() != null) {
            _hashCode += getGeoTargeting().hashCode();
        }
        if (getInventoryTargeting() != null) {
            _hashCode += getInventoryTargeting().hashCode();
        }
        if (getDayPartTargeting() != null) {
            _hashCode += getDayPartTargeting().hashCode();
        }
        if (getDateTimeRangeTargeting() != null) {
            _hashCode += getDateTimeRangeTargeting().hashCode();
        }
        if (getTechnologyTargeting() != null) {
            _hashCode += getTechnologyTargeting().hashCode();
        }
        if (getCustomTargeting() != null) {
            _hashCode += getCustomTargeting().hashCode();
        }
        if (getUserDomainTargeting() != null) {
            _hashCode += getUserDomainTargeting().hashCode();
        }
        if (getContentTargeting() != null) {
            _hashCode += getContentTargeting().hashCode();
        }
        if (getVideoPositionTargeting() != null) {
            _hashCode += getVideoPositionTargeting().hashCode();
        }
        if (getMobileApplicationTargeting() != null) {
            _hashCode += getMobileApplicationTargeting().hashCode();
        }
        if (getBuyerUserListTargeting() != null) {
            _hashCode += getBuyerUserListTargeting().hashCode();
        }
        if (getInventoryUrlTargeting() != null) {
            _hashCode += getInventoryUrlTargeting().hashCode();
        }
        if (getVerticalTargeting() != null) {
            _hashCode += getVerticalTargeting().hashCode();
        }
        if (getContentLabelTargeting() != null) {
            _hashCode += getContentLabelTargeting().hashCode();
        }
        if (getRequestPlatformTargeting() != null) {
            _hashCode += getRequestPlatformTargeting().hashCode();
        }
        if (getInventorySizeTargeting() != null) {
            _hashCode += getInventorySizeTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Targeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "Targeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "geoTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "GeoTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "inventoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "InventoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayPartTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "dayPartTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "DayPartTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeRangeTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "dateTimeRangeTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "DateTimeRangeTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technologyTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "technologyTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "TechnologyTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "customTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "CustomCriteriaSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDomainTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "userDomainTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "UserDomainTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "contentTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ContentTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPositionTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "videoPositionTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "VideoPositionTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileApplicationTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "mobileApplicationTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "MobileApplicationTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerUserListTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "buyerUserListTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "BuyerUserListTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryUrlTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "inventoryUrlTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "InventoryUrlTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "verticalTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "VerticalTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentLabelTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "contentLabelTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ContentLabelTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPlatformTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "requestPlatformTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "RequestPlatformTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventorySizeTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "inventorySizeTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "InventorySizeTargeting"));
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
