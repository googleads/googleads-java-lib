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
 * BidLandscapeLandscapePoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A set of estimates for a criterion's performance for a specific
 * bid
 *             amount.
 */
public class BidLandscapeLandscapePoint  implements java.io.Serializable {
    /* The bid amount used to estimate this landscape point's data.
     * Only available for ad group bid landscapes and ad group criterion
     * bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Bid".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money bid;

    /* Estimated number of clicks at this bid. For mobile bid modifier
     * landscapes, this is the
     *                 estimated number of clicks for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalClicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long clicks;

    /* Estimated cost at this bid. For mobile bid modifier landscapes,
     * this is the estimated cost
     *                 for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalCost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money cost;

    /* Estimated number of impressions at this bid. For mobile bid
     * modifier landscapes, this is the
     *                 estimated number of impressions for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long impressions;

    /* Estimated number of promoted impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long promotedImpressions;

    /* Required daily budget to achieve the predicted stats at this
     * bid.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "RequiredBudget".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money requiredBudget;

    /* Estimated number of biddable conversions. Only available for
     * ad group bid landscapes and ad
     *                 group criterion bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddableConversions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Double biddableConversions;

    /* Estimated biddable conversions value. Only available for ad
     * group bid landscapes and ad group
     *                 criterion bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddableConversionsValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.Double biddableConversionsValue;

    /* The bid modifier value of this point.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BidModifier".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.Double bidModifier;

    /* Estimated total impressions for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalImpressions".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.Long totalLocalImpressions;

    /* Estimated total clicks for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalClicks".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.Long totalLocalClicks;

    /* Estimated total cost for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalCost".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money totalLocalCost;

    /* Estimated total promoted impressions for all devices in mobile
     * bid modifier landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalPromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long totalLocalPromotedImpressions;

    public BidLandscapeLandscapePoint() {
    }

    public BidLandscapeLandscapePoint(
           com.google.api.ads.adwords.axis.v201802.cm.Money bid,
           java.lang.Long clicks,
           com.google.api.ads.adwords.axis.v201802.cm.Money cost,
           java.lang.Long impressions,
           java.lang.Long promotedImpressions,
           com.google.api.ads.adwords.axis.v201802.cm.Money requiredBudget,
           java.lang.Double biddableConversions,
           java.lang.Double biddableConversionsValue,
           java.lang.Double bidModifier,
           java.lang.Long totalLocalImpressions,
           java.lang.Long totalLocalClicks,
           com.google.api.ads.adwords.axis.v201802.cm.Money totalLocalCost,
           java.lang.Long totalLocalPromotedImpressions) {
           this.bid = bid;
           this.clicks = clicks;
           this.cost = cost;
           this.impressions = impressions;
           this.promotedImpressions = promotedImpressions;
           this.requiredBudget = requiredBudget;
           this.biddableConversions = biddableConversions;
           this.biddableConversionsValue = biddableConversionsValue;
           this.bidModifier = bidModifier;
           this.totalLocalImpressions = totalLocalImpressions;
           this.totalLocalClicks = totalLocalClicks;
           this.totalLocalCost = totalLocalCost;
           this.totalLocalPromotedImpressions = totalLocalPromotedImpressions;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bid", getBid())
            .add("bidModifier", getBidModifier())
            .add("biddableConversions", getBiddableConversions())
            .add("biddableConversionsValue", getBiddableConversionsValue())
            .add("clicks", getClicks())
            .add("cost", getCost())
            .add("impressions", getImpressions())
            .add("promotedImpressions", getPromotedImpressions())
            .add("requiredBudget", getRequiredBudget())
            .add("totalLocalClicks", getTotalLocalClicks())
            .add("totalLocalCost", getTotalLocalCost())
            .add("totalLocalImpressions", getTotalLocalImpressions())
            .add("totalLocalPromotedImpressions", getTotalLocalPromotedImpressions())
            .toString();
    }

    /**
     * Gets the bid value for this BidLandscapeLandscapePoint.
     * 
     * @return bid   * The bid amount used to estimate this landscape point's data.
     * Only available for ad group bid landscapes and ad group criterion
     * bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Bid".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this BidLandscapeLandscapePoint.
     * 
     * @param bid   * The bid amount used to estimate this landscape point's data.
     * Only available for ad group bid landscapes and ad group criterion
     * bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Bid".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setBid(com.google.api.ads.adwords.axis.v201802.cm.Money bid) {
        this.bid = bid;
    }


    /**
     * Gets the clicks value for this BidLandscapeLandscapePoint.
     * 
     * @return clicks   * Estimated number of clicks at this bid. For mobile bid modifier
     * landscapes, this is the
     *                 estimated number of clicks for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalClicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getClicks() {
        return clicks;
    }


    /**
     * Sets the clicks value for this BidLandscapeLandscapePoint.
     * 
     * @param clicks   * Estimated number of clicks at this bid. For mobile bid modifier
     * landscapes, this is the
     *                 estimated number of clicks for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalClicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setClicks(java.lang.Long clicks) {
        this.clicks = clicks;
    }


    /**
     * Gets the cost value for this BidLandscapeLandscapePoint.
     * 
     * @return cost   * Estimated cost at this bid. For mobile bid modifier landscapes,
     * this is the estimated cost
     *                 for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalCost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this BidLandscapeLandscapePoint.
     * 
     * @param cost   * Estimated cost at this bid. For mobile bid modifier landscapes,
     * this is the estimated cost
     *                 for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalCost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCost(com.google.api.ads.adwords.axis.v201802.cm.Money cost) {
        this.cost = cost;
    }


    /**
     * Gets the impressions value for this BidLandscapeLandscapePoint.
     * 
     * @return impressions   * Estimated number of impressions at this bid. For mobile bid
     * modifier landscapes, this is the
     *                 estimated number of impressions for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this BidLandscapeLandscapePoint.
     * 
     * @param impressions   * Estimated number of impressions at this bid. For mobile bid
     * modifier landscapes, this is the
     *                 estimated number of impressions for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }


    /**
     * Gets the promotedImpressions value for this BidLandscapeLandscapePoint.
     * 
     * @return promotedImpressions   * Estimated number of promoted impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getPromotedImpressions() {
        return promotedImpressions;
    }


    /**
     * Sets the promotedImpressions value for this BidLandscapeLandscapePoint.
     * 
     * @param promotedImpressions   * Estimated number of promoted impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setPromotedImpressions(java.lang.Long promotedImpressions) {
        this.promotedImpressions = promotedImpressions;
    }


    /**
     * Gets the requiredBudget value for this BidLandscapeLandscapePoint.
     * 
     * @return requiredBudget   * Required daily budget to achieve the predicted stats at this
     * bid.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "RequiredBudget".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getRequiredBudget() {
        return requiredBudget;
    }


    /**
     * Sets the requiredBudget value for this BidLandscapeLandscapePoint.
     * 
     * @param requiredBudget   * Required daily budget to achieve the predicted stats at this
     * bid.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "RequiredBudget".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setRequiredBudget(com.google.api.ads.adwords.axis.v201802.cm.Money requiredBudget) {
        this.requiredBudget = requiredBudget;
    }


    /**
     * Gets the biddableConversions value for this BidLandscapeLandscapePoint.
     * 
     * @return biddableConversions   * Estimated number of biddable conversions. Only available for
     * ad group bid landscapes and ad
     *                 group criterion bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddableConversions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Double getBiddableConversions() {
        return biddableConversions;
    }


    /**
     * Sets the biddableConversions value for this BidLandscapeLandscapePoint.
     * 
     * @param biddableConversions   * Estimated number of biddable conversions. Only available for
     * ad group bid landscapes and ad
     *                 group criterion bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddableConversions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setBiddableConversions(java.lang.Double biddableConversions) {
        this.biddableConversions = biddableConversions;
    }


    /**
     * Gets the biddableConversionsValue value for this BidLandscapeLandscapePoint.
     * 
     * @return biddableConversionsValue   * Estimated biddable conversions value. Only available for ad
     * group bid landscapes and ad group
     *                 criterion bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddableConversionsValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.Double getBiddableConversionsValue() {
        return biddableConversionsValue;
    }


    /**
     * Sets the biddableConversionsValue value for this BidLandscapeLandscapePoint.
     * 
     * @param biddableConversionsValue   * Estimated biddable conversions value. Only available for ad
     * group bid landscapes and ad group
     *                 criterion bid landscapes.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BiddableConversionsValue".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setBiddableConversionsValue(java.lang.Double biddableConversionsValue) {
        this.biddableConversionsValue = biddableConversionsValue;
    }


    /**
     * Gets the bidModifier value for this BidLandscapeLandscapePoint.
     * 
     * @return bidModifier   * The bid modifier value of this point.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BidModifier".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.Double getBidModifier() {
        return bidModifier;
    }


    /**
     * Sets the bidModifier value for this BidLandscapeLandscapePoint.
     * 
     * @param bidModifier   * The bid modifier value of this point.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "BidModifier".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setBidModifier(java.lang.Double bidModifier) {
        this.bidModifier = bidModifier;
    }


    /**
     * Gets the totalLocalImpressions value for this BidLandscapeLandscapePoint.
     * 
     * @return totalLocalImpressions   * Estimated total impressions for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalImpressions".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.Long getTotalLocalImpressions() {
        return totalLocalImpressions;
    }


    /**
     * Sets the totalLocalImpressions value for this BidLandscapeLandscapePoint.
     * 
     * @param totalLocalImpressions   * Estimated total impressions for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalImpressions".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setTotalLocalImpressions(java.lang.Long totalLocalImpressions) {
        this.totalLocalImpressions = totalLocalImpressions;
    }


    /**
     * Gets the totalLocalClicks value for this BidLandscapeLandscapePoint.
     * 
     * @return totalLocalClicks   * Estimated total clicks for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalClicks".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.Long getTotalLocalClicks() {
        return totalLocalClicks;
    }


    /**
     * Sets the totalLocalClicks value for this BidLandscapeLandscapePoint.
     * 
     * @param totalLocalClicks   * Estimated total clicks for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalClicks".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setTotalLocalClicks(java.lang.Long totalLocalClicks) {
        this.totalLocalClicks = totalLocalClicks;
    }


    /**
     * Gets the totalLocalCost value for this BidLandscapeLandscapePoint.
     * 
     * @return totalLocalCost   * Estimated total cost for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalCost".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getTotalLocalCost() {
        return totalLocalCost;
    }


    /**
     * Sets the totalLocalCost value for this BidLandscapeLandscapePoint.
     * 
     * @param totalLocalCost   * Estimated total cost for all devices in mobile bid modifier
     * landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalCost".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setTotalLocalCost(com.google.api.ads.adwords.axis.v201802.cm.Money totalLocalCost) {
        this.totalLocalCost = totalLocalCost;
    }


    /**
     * Gets the totalLocalPromotedImpressions value for this BidLandscapeLandscapePoint.
     * 
     * @return totalLocalPromotedImpressions   * Estimated total promoted impressions for all devices in mobile
     * bid modifier landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalPromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getTotalLocalPromotedImpressions() {
        return totalLocalPromotedImpressions;
    }


    /**
     * Sets the totalLocalPromotedImpressions value for this BidLandscapeLandscapePoint.
     * 
     * @param totalLocalPromotedImpressions   * Estimated total promoted impressions for all devices in mobile
     * bid modifier landscape.
     *                 Only available for campaign criterion bid landscapes.
     * <span class="constraint Selectable">This field can be selected using
     * the value "TotalLocalPromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setTotalLocalPromotedImpressions(java.lang.Long totalLocalPromotedImpressions) {
        this.totalLocalPromotedImpressions = totalLocalPromotedImpressions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BidLandscapeLandscapePoint)) return false;
        BidLandscapeLandscapePoint other = (BidLandscapeLandscapePoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid()))) &&
            ((this.clicks==null && other.getClicks()==null) || 
             (this.clicks!=null &&
              this.clicks.equals(other.getClicks()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions()))) &&
            ((this.promotedImpressions==null && other.getPromotedImpressions()==null) || 
             (this.promotedImpressions!=null &&
              this.promotedImpressions.equals(other.getPromotedImpressions()))) &&
            ((this.requiredBudget==null && other.getRequiredBudget()==null) || 
             (this.requiredBudget!=null &&
              this.requiredBudget.equals(other.getRequiredBudget()))) &&
            ((this.biddableConversions==null && other.getBiddableConversions()==null) || 
             (this.biddableConversions!=null &&
              this.biddableConversions.equals(other.getBiddableConversions()))) &&
            ((this.biddableConversionsValue==null && other.getBiddableConversionsValue()==null) || 
             (this.biddableConversionsValue!=null &&
              this.biddableConversionsValue.equals(other.getBiddableConversionsValue()))) &&
            ((this.bidModifier==null && other.getBidModifier()==null) || 
             (this.bidModifier!=null &&
              this.bidModifier.equals(other.getBidModifier()))) &&
            ((this.totalLocalImpressions==null && other.getTotalLocalImpressions()==null) || 
             (this.totalLocalImpressions!=null &&
              this.totalLocalImpressions.equals(other.getTotalLocalImpressions()))) &&
            ((this.totalLocalClicks==null && other.getTotalLocalClicks()==null) || 
             (this.totalLocalClicks!=null &&
              this.totalLocalClicks.equals(other.getTotalLocalClicks()))) &&
            ((this.totalLocalCost==null && other.getTotalLocalCost()==null) || 
             (this.totalLocalCost!=null &&
              this.totalLocalCost.equals(other.getTotalLocalCost()))) &&
            ((this.totalLocalPromotedImpressions==null && other.getTotalLocalPromotedImpressions()==null) || 
             (this.totalLocalPromotedImpressions!=null &&
              this.totalLocalPromotedImpressions.equals(other.getTotalLocalPromotedImpressions())));
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
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        if (getClicks() != null) {
            _hashCode += getClicks().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        if (getPromotedImpressions() != null) {
            _hashCode += getPromotedImpressions().hashCode();
        }
        if (getRequiredBudget() != null) {
            _hashCode += getRequiredBudget().hashCode();
        }
        if (getBiddableConversions() != null) {
            _hashCode += getBiddableConversions().hashCode();
        }
        if (getBiddableConversionsValue() != null) {
            _hashCode += getBiddableConversionsValue().hashCode();
        }
        if (getBidModifier() != null) {
            _hashCode += getBidModifier().hashCode();
        }
        if (getTotalLocalImpressions() != null) {
            _hashCode += getTotalLocalImpressions().hashCode();
        }
        if (getTotalLocalClicks() != null) {
            _hashCode += getTotalLocalClicks().hashCode();
        }
        if (getTotalLocalCost() != null) {
            _hashCode += getTotalLocalCost().hashCode();
        }
        if (getTotalLocalPromotedImpressions() != null) {
            _hashCode += getTotalLocalPromotedImpressions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BidLandscapeLandscapePoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BidLandscape.LandscapePoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "clicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "impressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotedImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "promotedImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "requiredBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddableConversions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddableConversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddableConversionsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "biddableConversionsValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalLocalImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "totalLocalImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalLocalClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "totalLocalClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalLocalCost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "totalLocalCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalLocalPromotedImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "totalLocalPromotedImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
