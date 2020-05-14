// Copyright 2020 Google LLC
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
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;


/**
 * Contains targeting criteria for {@link LineItem} objects. See
 *             {@link LineItem#targeting}.
 */
public class Targeting  implements java.io.Serializable {
    /* Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional. */
    private com.google.api.ads.admanager.axis.v202005.GeoTargeting geoTargeting;

    /* Specifies what inventory is targeted by the {@link LineItem}.
     * This attribute is required. The
     *                 line item must target at least one ad unit or placement. */
    private com.google.api.ads.admanager.axis.v202005.InventoryTargeting inventoryTargeting;

    /* Specifies the days of the week and times that are targeted
     * by the
     *                 {@link LineItem}. This attribute is optional. */
    private com.google.api.ads.admanager.axis.v202005.DayPartTargeting dayPartTargeting;

    /* Specifies the dates and time ranges that are targeted by the
     * {@link LineItem}. This attribute
     *                 is optional. */
    private com.google.api.ads.admanager.axis.v202005.DateTimeRangeTargeting dateTimeRangeTargeting;

    /* Specifies the browsing technologies that are targeted by the
     * {@link LineItem}. This attribute is optional. */
    private com.google.api.ads.admanager.axis.v202005.TechnologyTargeting technologyTargeting;

    /* Specifies the collection of custom criteria that is targeted
     * by the
     *                 {@link LineItem}.
     *                 <p>
     *                 Once the {@link LineItem} is updated or modified with
     * custom targeting, the
     *                 server may return a normalized, but equivalent representation
     * of the custom
     *                 targeting expression.
     *                 <p>
     *                 {@code customTargeting} will have up to three levels
     * of expressions
     *                 including itself.
     *                 </p>
     *                 <p>
     *                 The top level {@code CustomCriteriaSet} i.e. the {@code
     * customTargeting}
     *                 object can only contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of
     *                 all its children.
     *                 </p>
     *                 <p>
     *                 The second level of {@code CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If
     *                 a {@link CustomCriteria} is placed on this level,
     * the server will wrap it
     *                 in a {@link CustomCriteriaSet}.
     *                 </p>
     *                 <p>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects.
     *                 </p>
     *                 <p>
     *                 The resulting custom targeting tree would be of the
     * form:
     *                 </p>
     *                 <br/>
     *                 <img src="https://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/> */
    private com.google.api.ads.admanager.axis.v202005.CustomCriteriaSet customTargeting;

    /* Specifies the domains or subdomains that are targeted or excluded
     * by the
     *                 {@link LineItem}. Users visiting from an IP address
     * associated with
     *                 those domains will be targeted or excluded. This attribute
     * is optional. */
    private com.google.api.ads.admanager.axis.v202005.UserDomainTargeting userDomainTargeting;

    /* Specifies the video categories and individual videos targeted
     * by the
     *                 {@link LineItem}. */
    private com.google.api.ads.admanager.axis.v202005.ContentTargeting contentTargeting;

    /* Specifies targeting against video position types. */
    private com.google.api.ads.admanager.axis.v202005.VideoPositionTargeting videoPositionTargeting;

    /* Specifies targeting against mobile applications. */
    private com.google.api.ads.admanager.axis.v202005.MobileApplicationTargeting mobileApplicationTargeting;

    /* Specifies whether buyer user lists are targeted on a programmatic
     * {@link LineItem}
     *                 or {@link ProposalLineItem}. This attribute is readonly
     * and is populated by Google. */
    private com.google.api.ads.admanager.axis.v202005.BuyerUserListTargeting buyerUserListTargeting;

    /* Specifies the request platforms that are targeted by the {@link
     * LineItem}. This attribute is
     *                 required for video line items.
     *                 
     *                 <p>This value is modifiable for video line items,
     * but read-only for non-video line items.
     *                 
     *                 <p>This value is read-only for video line items generated
     * from proposal line items. */
    private com.google.api.ads.admanager.axis.v202005.RequestPlatformTargeting requestPlatformTargeting;

    public Targeting() {
    }

    public Targeting(
           com.google.api.ads.admanager.axis.v202005.GeoTargeting geoTargeting,
           com.google.api.ads.admanager.axis.v202005.InventoryTargeting inventoryTargeting,
           com.google.api.ads.admanager.axis.v202005.DayPartTargeting dayPartTargeting,
           com.google.api.ads.admanager.axis.v202005.DateTimeRangeTargeting dateTimeRangeTargeting,
           com.google.api.ads.admanager.axis.v202005.TechnologyTargeting technologyTargeting,
           com.google.api.ads.admanager.axis.v202005.CustomCriteriaSet customTargeting,
           com.google.api.ads.admanager.axis.v202005.UserDomainTargeting userDomainTargeting,
           com.google.api.ads.admanager.axis.v202005.ContentTargeting contentTargeting,
           com.google.api.ads.admanager.axis.v202005.VideoPositionTargeting videoPositionTargeting,
           com.google.api.ads.admanager.axis.v202005.MobileApplicationTargeting mobileApplicationTargeting,
           com.google.api.ads.admanager.axis.v202005.BuyerUserListTargeting buyerUserListTargeting,
           com.google.api.ads.admanager.axis.v202005.RequestPlatformTargeting requestPlatformTargeting) {
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
           this.requestPlatformTargeting = requestPlatformTargeting;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("buyerUserListTargeting", getBuyerUserListTargeting())
            .add("contentTargeting", getContentTargeting())
            .add("customTargeting", getCustomTargeting())
            .add("dateTimeRangeTargeting", getDateTimeRangeTargeting())
            .add("dayPartTargeting", getDayPartTargeting())
            .add("geoTargeting", getGeoTargeting())
            .add("inventoryTargeting", getInventoryTargeting())
            .add("mobileApplicationTargeting", getMobileApplicationTargeting())
            .add("requestPlatformTargeting", getRequestPlatformTargeting())
            .add("technologyTargeting", getTechnologyTargeting())
            .add("userDomainTargeting", getUserDomainTargeting())
            .add("videoPositionTargeting", getVideoPositionTargeting())
            .toString();
    }

    /**
     * Gets the geoTargeting value for this Targeting.
     * 
     * @return geoTargeting   * Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional.
     */
    public com.google.api.ads.admanager.axis.v202005.GeoTargeting getGeoTargeting() {
        return geoTargeting;
    }


    /**
     * Sets the geoTargeting value for this Targeting.
     * 
     * @param geoTargeting   * Specifies what geographical locations are targeted by the {@link
     * LineItem}.
     *                 This attribute is optional.
     */
    public void setGeoTargeting(com.google.api.ads.admanager.axis.v202005.GeoTargeting geoTargeting) {
        this.geoTargeting = geoTargeting;
    }


    /**
     * Gets the inventoryTargeting value for this Targeting.
     * 
     * @return inventoryTargeting   * Specifies what inventory is targeted by the {@link LineItem}.
     * This attribute is required. The
     *                 line item must target at least one ad unit or placement.
     */
    public com.google.api.ads.admanager.axis.v202005.InventoryTargeting getInventoryTargeting() {
        return inventoryTargeting;
    }


    /**
     * Sets the inventoryTargeting value for this Targeting.
     * 
     * @param inventoryTargeting   * Specifies what inventory is targeted by the {@link LineItem}.
     * This attribute is required. The
     *                 line item must target at least one ad unit or placement.
     */
    public void setInventoryTargeting(com.google.api.ads.admanager.axis.v202005.InventoryTargeting inventoryTargeting) {
        this.inventoryTargeting = inventoryTargeting;
    }


    /**
     * Gets the dayPartTargeting value for this Targeting.
     * 
     * @return dayPartTargeting   * Specifies the days of the week and times that are targeted
     * by the
     *                 {@link LineItem}. This attribute is optional.
     */
    public com.google.api.ads.admanager.axis.v202005.DayPartTargeting getDayPartTargeting() {
        return dayPartTargeting;
    }


    /**
     * Sets the dayPartTargeting value for this Targeting.
     * 
     * @param dayPartTargeting   * Specifies the days of the week and times that are targeted
     * by the
     *                 {@link LineItem}. This attribute is optional.
     */
    public void setDayPartTargeting(com.google.api.ads.admanager.axis.v202005.DayPartTargeting dayPartTargeting) {
        this.dayPartTargeting = dayPartTargeting;
    }


    /**
     * Gets the dateTimeRangeTargeting value for this Targeting.
     * 
     * @return dateTimeRangeTargeting   * Specifies the dates and time ranges that are targeted by the
     * {@link LineItem}. This attribute
     *                 is optional.
     */
    public com.google.api.ads.admanager.axis.v202005.DateTimeRangeTargeting getDateTimeRangeTargeting() {
        return dateTimeRangeTargeting;
    }


    /**
     * Sets the dateTimeRangeTargeting value for this Targeting.
     * 
     * @param dateTimeRangeTargeting   * Specifies the dates and time ranges that are targeted by the
     * {@link LineItem}. This attribute
     *                 is optional.
     */
    public void setDateTimeRangeTargeting(com.google.api.ads.admanager.axis.v202005.DateTimeRangeTargeting dateTimeRangeTargeting) {
        this.dateTimeRangeTargeting = dateTimeRangeTargeting;
    }


    /**
     * Gets the technologyTargeting value for this Targeting.
     * 
     * @return technologyTargeting   * Specifies the browsing technologies that are targeted by the
     * {@link LineItem}. This attribute is optional.
     */
    public com.google.api.ads.admanager.axis.v202005.TechnologyTargeting getTechnologyTargeting() {
        return technologyTargeting;
    }


    /**
     * Sets the technologyTargeting value for this Targeting.
     * 
     * @param technologyTargeting   * Specifies the browsing technologies that are targeted by the
     * {@link LineItem}. This attribute is optional.
     */
    public void setTechnologyTargeting(com.google.api.ads.admanager.axis.v202005.TechnologyTargeting technologyTargeting) {
        this.technologyTargeting = technologyTargeting;
    }


    /**
     * Gets the customTargeting value for this Targeting.
     * 
     * @return customTargeting   * Specifies the collection of custom criteria that is targeted
     * by the
     *                 {@link LineItem}.
     *                 <p>
     *                 Once the {@link LineItem} is updated or modified with
     * custom targeting, the
     *                 server may return a normalized, but equivalent representation
     * of the custom
     *                 targeting expression.
     *                 <p>
     *                 {@code customTargeting} will have up to three levels
     * of expressions
     *                 including itself.
     *                 </p>
     *                 <p>
     *                 The top level {@code CustomCriteriaSet} i.e. the {@code
     * customTargeting}
     *                 object can only contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of
     *                 all its children.
     *                 </p>
     *                 <p>
     *                 The second level of {@code CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If
     *                 a {@link CustomCriteria} is placed on this level,
     * the server will wrap it
     *                 in a {@link CustomCriteriaSet}.
     *                 </p>
     *                 <p>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects.
     *                 </p>
     *                 <p>
     *                 The resulting custom targeting tree would be of the
     * form:
     *                 </p>
     *                 <br/>
     *                 <img src="https://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/>
     */
    public com.google.api.ads.admanager.axis.v202005.CustomCriteriaSet getCustomTargeting() {
        return customTargeting;
    }


    /**
     * Sets the customTargeting value for this Targeting.
     * 
     * @param customTargeting   * Specifies the collection of custom criteria that is targeted
     * by the
     *                 {@link LineItem}.
     *                 <p>
     *                 Once the {@link LineItem} is updated or modified with
     * custom targeting, the
     *                 server may return a normalized, but equivalent representation
     * of the custom
     *                 targeting expression.
     *                 <p>
     *                 {@code customTargeting} will have up to three levels
     * of expressions
     *                 including itself.
     *                 </p>
     *                 <p>
     *                 The top level {@code CustomCriteriaSet} i.e. the {@code
     * customTargeting}
     *                 object can only contain a {@link CustomCriteriaSet.LogicalOperator#OR}
     * of
     *                 all its children.
     *                 </p>
     *                 <p>
     *                 The second level of {@code CustomCriteriaSet} objects
     * can only contain
     *                 {@link CustomCriteriaSet.LogicalOperator#AND} of all
     * their children. If
     *                 a {@link CustomCriteria} is placed on this level,
     * the server will wrap it
     *                 in a {@link CustomCriteriaSet}.
     *                 </p>
     *                 <p>
     *                 The third level can only comprise of {@link CustomCriteria}
     * objects.
     *                 </p>
     *                 <p>
     *                 The resulting custom targeting tree would be of the
     * form:
     *                 </p>
     *                 <br/>
     *                 <img src="https://chart.apis.google.com/chart?cht=gv&chl=digraph{customTargeting_LogicalOperator_OR-%3ECustomCriteriaSet_LogicalOperator_AND_1-%3ECustomCriteria_1;CustomCriteriaSet_LogicalOperator_AND_1-%3Eellipsis1;customTargeting_LogicalOperator_OR-%3Eellipsis2;ellipsis1[label=%22...%22,shape=none,fontsize=32];ellipsis2[label=%22...%22,shape=none,fontsize=32]}&chs=450x200"/>
     */
    public void setCustomTargeting(com.google.api.ads.admanager.axis.v202005.CustomCriteriaSet customTargeting) {
        this.customTargeting = customTargeting;
    }


    /**
     * Gets the userDomainTargeting value for this Targeting.
     * 
     * @return userDomainTargeting   * Specifies the domains or subdomains that are targeted or excluded
     * by the
     *                 {@link LineItem}. Users visiting from an IP address
     * associated with
     *                 those domains will be targeted or excluded. This attribute
     * is optional.
     */
    public com.google.api.ads.admanager.axis.v202005.UserDomainTargeting getUserDomainTargeting() {
        return userDomainTargeting;
    }


    /**
     * Sets the userDomainTargeting value for this Targeting.
     * 
     * @param userDomainTargeting   * Specifies the domains or subdomains that are targeted or excluded
     * by the
     *                 {@link LineItem}. Users visiting from an IP address
     * associated with
     *                 those domains will be targeted or excluded. This attribute
     * is optional.
     */
    public void setUserDomainTargeting(com.google.api.ads.admanager.axis.v202005.UserDomainTargeting userDomainTargeting) {
        this.userDomainTargeting = userDomainTargeting;
    }


    /**
     * Gets the contentTargeting value for this Targeting.
     * 
     * @return contentTargeting   * Specifies the video categories and individual videos targeted
     * by the
     *                 {@link LineItem}.
     */
    public com.google.api.ads.admanager.axis.v202005.ContentTargeting getContentTargeting() {
        return contentTargeting;
    }


    /**
     * Sets the contentTargeting value for this Targeting.
     * 
     * @param contentTargeting   * Specifies the video categories and individual videos targeted
     * by the
     *                 {@link LineItem}.
     */
    public void setContentTargeting(com.google.api.ads.admanager.axis.v202005.ContentTargeting contentTargeting) {
        this.contentTargeting = contentTargeting;
    }


    /**
     * Gets the videoPositionTargeting value for this Targeting.
     * 
     * @return videoPositionTargeting   * Specifies targeting against video position types.
     */
    public com.google.api.ads.admanager.axis.v202005.VideoPositionTargeting getVideoPositionTargeting() {
        return videoPositionTargeting;
    }


    /**
     * Sets the videoPositionTargeting value for this Targeting.
     * 
     * @param videoPositionTargeting   * Specifies targeting against video position types.
     */
    public void setVideoPositionTargeting(com.google.api.ads.admanager.axis.v202005.VideoPositionTargeting videoPositionTargeting) {
        this.videoPositionTargeting = videoPositionTargeting;
    }


    /**
     * Gets the mobileApplicationTargeting value for this Targeting.
     * 
     * @return mobileApplicationTargeting   * Specifies targeting against mobile applications.
     */
    public com.google.api.ads.admanager.axis.v202005.MobileApplicationTargeting getMobileApplicationTargeting() {
        return mobileApplicationTargeting;
    }


    /**
     * Sets the mobileApplicationTargeting value for this Targeting.
     * 
     * @param mobileApplicationTargeting   * Specifies targeting against mobile applications.
     */
    public void setMobileApplicationTargeting(com.google.api.ads.admanager.axis.v202005.MobileApplicationTargeting mobileApplicationTargeting) {
        this.mobileApplicationTargeting = mobileApplicationTargeting;
    }


    /**
     * Gets the buyerUserListTargeting value for this Targeting.
     * 
     * @return buyerUserListTargeting   * Specifies whether buyer user lists are targeted on a programmatic
     * {@link LineItem}
     *                 or {@link ProposalLineItem}. This attribute is readonly
     * and is populated by Google.
     */
    public com.google.api.ads.admanager.axis.v202005.BuyerUserListTargeting getBuyerUserListTargeting() {
        return buyerUserListTargeting;
    }


    /**
     * Sets the buyerUserListTargeting value for this Targeting.
     * 
     * @param buyerUserListTargeting   * Specifies whether buyer user lists are targeted on a programmatic
     * {@link LineItem}
     *                 or {@link ProposalLineItem}. This attribute is readonly
     * and is populated by Google.
     */
    public void setBuyerUserListTargeting(com.google.api.ads.admanager.axis.v202005.BuyerUserListTargeting buyerUserListTargeting) {
        this.buyerUserListTargeting = buyerUserListTargeting;
    }


    /**
     * Gets the requestPlatformTargeting value for this Targeting.
     * 
     * @return requestPlatformTargeting   * Specifies the request platforms that are targeted by the {@link
     * LineItem}. This attribute is
     *                 required for video line items.
     *                 
     *                 <p>This value is modifiable for video line items,
     * but read-only for non-video line items.
     *                 
     *                 <p>This value is read-only for video line items generated
     * from proposal line items.
     */
    public com.google.api.ads.admanager.axis.v202005.RequestPlatformTargeting getRequestPlatformTargeting() {
        return requestPlatformTargeting;
    }


    /**
     * Sets the requestPlatformTargeting value for this Targeting.
     * 
     * @param requestPlatformTargeting   * Specifies the request platforms that are targeted by the {@link
     * LineItem}. This attribute is
     *                 required for video line items.
     *                 
     *                 <p>This value is modifiable for video line items,
     * but read-only for non-video line items.
     *                 
     *                 <p>This value is read-only for video line items generated
     * from proposal line items.
     */
    public void setRequestPlatformTargeting(com.google.api.ads.admanager.axis.v202005.RequestPlatformTargeting requestPlatformTargeting) {
        this.requestPlatformTargeting = requestPlatformTargeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Targeting)) return false;
        Targeting other = (Targeting) obj;
        if (obj == null) return false;
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
            ((this.requestPlatformTargeting==null && other.getRequestPlatformTargeting()==null) || 
             (this.requestPlatformTargeting!=null &&
              this.requestPlatformTargeting.equals(other.getRequestPlatformTargeting())));
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
        if (getRequestPlatformTargeting() != null) {
            _hashCode += getRequestPlatformTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Targeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "Targeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "geoTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "GeoTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "inventoryTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "InventoryTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayPartTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "dayPartTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "DayPartTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeRangeTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "dateTimeRangeTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "DateTimeRangeTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technologyTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "technologyTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "TechnologyTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "customTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "CustomCriteriaSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDomainTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "userDomainTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "UserDomainTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "contentTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "ContentTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPositionTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "videoPositionTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "VideoPositionTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileApplicationTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "mobileApplicationTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "MobileApplicationTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerUserListTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "buyerUserListTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "BuyerUserListTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPlatformTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "requestPlatformTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "RequestPlatformTargeting"));
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
