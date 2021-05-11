// Copyright 2018 Google LLC
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
 * AdGroupAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Represents an ad in an ad group.
 */
public class AdGroupAd  implements java.io.Serializable {
    /* The id of the adgroup containing this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.Ad ad;

    /* The status of the ad.
     *                 This field is required and should not be {@code null}
     * when it is contained within
     *                 {@link Operator}s : SET.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdStatus status;

    /* Summary of policy findings for this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PolicySummary".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdPolicySummary policySummary;

    /* Labels that are attached to the AdGroupAd. To associate an
     * existing {@link Label} to an
     *                 existing {@link AdGroupAd}, use {@link AdGroupAdService#mutateLabel}
     * with ADD operator. To
     *                 remove an associated {@link Label} from the {@link
     * AdGroupAd}, use
     *                 {@link AdGroupAdService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Labels".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API for the following {@link Operator}s:
     * REMOVE and SET.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.Label[] labels;

    /* ID of the base campaign from which this draft/trial ad was
     * created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseCampaignId;

    /* ID of the base ad group from which this draft/trial ad was
     * created. For
     *                 base ad groups this is equal to the ad group ID. 
     * If the ad group was created
     *                 in the draft or trial and has no corresponding base
     * ad group, this field is null.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long baseAdGroupId;

    /* This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value. */
    private com.google.api.ads.adwords.axis.v201809.cm.String_StringMapEntry[] forwardCompatibilityMap;

    /* The strength information of the Ad. This contains the overall
     * strength and action items to
     *                 improve the strength.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdStrengthInfo".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AdStrengthInfo adStrengthInfo;

    public AdGroupAd() {
    }

    public AdGroupAd(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201809.cm.Ad ad,
           com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdStatus status,
           com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdPolicySummary policySummary,
           com.google.api.ads.adwords.axis.v201809.cm.Label[] labels,
           java.lang.Long baseCampaignId,
           java.lang.Long baseAdGroupId,
           com.google.api.ads.adwords.axis.v201809.cm.String_StringMapEntry[] forwardCompatibilityMap,
           com.google.api.ads.adwords.axis.v201809.cm.AdStrengthInfo adStrengthInfo) {
           this.adGroupId = adGroupId;
           this.ad = ad;
           this.status = status;
           this.policySummary = policySummary;
           this.labels = labels;
           this.baseCampaignId = baseCampaignId;
           this.baseAdGroupId = baseAdGroupId;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.adStrengthInfo = adStrengthInfo;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("ad", getAd())
            .add("adGroupId", getAdGroupId())
            .add("adStrengthInfo", getAdStrengthInfo())
            .add("baseAdGroupId", getBaseAdGroupId())
            .add("baseCampaignId", getBaseCampaignId())
            .add("forwardCompatibilityMap", getForwardCompatibilityMap())
            .add("labels", getLabels())
            .add("policySummary", getPolicySummary())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the adGroupId value for this AdGroupAd.
     * 
     * @return adGroupId   * The id of the adgroup containing this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupAd.
     * 
     * @param adGroupId   * The id of the adgroup containing this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the ad value for this AdGroupAd.
     * 
     * @return ad   * The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.Ad getAd() {
        return ad;
    }


    /**
     * Sets the ad value for this AdGroupAd.
     * 
     * @param ad   * The contents of the ad itself.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAd(com.google.api.ads.adwords.axis.v201809.cm.Ad ad) {
        this.ad = ad;
    }


    /**
     * Gets the status value for this AdGroupAd.
     * 
     * @return status   * The status of the ad.
     *                 This field is required and should not be {@code null}
     * when it is contained within
     *                 {@link Operator}s : SET.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdGroupAd.
     * 
     * @param status   * The status of the ad.
     *                 This field is required and should not be {@code null}
     * when it is contained within
     *                 {@link Operator}s : SET.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdStatus status) {
        this.status = status;
    }


    /**
     * Gets the policySummary value for this AdGroupAd.
     * 
     * @return policySummary   * Summary of policy findings for this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PolicySummary".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdPolicySummary getPolicySummary() {
        return policySummary;
    }


    /**
     * Sets the policySummary value for this AdGroupAd.
     * 
     * @param policySummary   * Summary of policy findings for this ad.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PolicySummary".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setPolicySummary(com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdPolicySummary policySummary) {
        this.policySummary = policySummary;
    }


    /**
     * Gets the labels value for this AdGroupAd.
     * 
     * @return labels   * Labels that are attached to the AdGroupAd. To associate an
     * existing {@link Label} to an
     *                 existing {@link AdGroupAd}, use {@link AdGroupAdService#mutateLabel}
     * with ADD operator. To
     *                 remove an associated {@link Label} from the {@link
     * AdGroupAd}, use
     *                 {@link AdGroupAdService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Labels".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API for the following {@link Operator}s:
     * REMOVE and SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.Label[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this AdGroupAd.
     * 
     * @param labels   * Labels that are attached to the AdGroupAd. To associate an
     * existing {@link Label} to an
     *                 existing {@link AdGroupAd}, use {@link AdGroupAdService#mutateLabel}
     * with ADD operator. To
     *                 remove an associated {@link Label} from the {@link
     * AdGroupAd}, use
     *                 {@link AdGroupAdService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Labels".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint CampaignType">This field may
     * not be set for campaign channel subtype UNIVERSAL_APP_CAMPAIGN.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API for the following {@link Operator}s:
     * REMOVE and SET.</span>
     */
    public void setLabels(com.google.api.ads.adwords.axis.v201809.cm.Label[] labels) {
        this.labels = labels;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.Label getLabels(int i) {
        return this.labels[i];
    }

    public void setLabels(int i, com.google.api.ads.adwords.axis.v201809.cm.Label _value) {
        this.labels[i] = _value;
    }


    /**
     * Gets the baseCampaignId value for this AdGroupAd.
     * 
     * @return baseCampaignId   * ID of the base campaign from which this draft/trial ad was
     * created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseCampaignId() {
        return baseCampaignId;
    }


    /**
     * Sets the baseCampaignId value for this AdGroupAd.
     * 
     * @param baseCampaignId   * ID of the base campaign from which this draft/trial ad was
     * created.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseCampaignId(java.lang.Long baseCampaignId) {
        this.baseCampaignId = baseCampaignId;
    }


    /**
     * Gets the baseAdGroupId value for this AdGroupAd.
     * 
     * @return baseAdGroupId   * ID of the base ad group from which this draft/trial ad was
     * created. For
     *                 base ad groups this is equal to the ad group ID. 
     * If the ad group was created
     *                 in the draft or trial and has no corresponding base
     * ad group, this field is null.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getBaseAdGroupId() {
        return baseAdGroupId;
    }


    /**
     * Sets the baseAdGroupId value for this AdGroupAd.
     * 
     * @param baseAdGroupId   * ID of the base ad group from which this draft/trial ad was
     * created. For
     *                 base ad groups this is equal to the ad group ID. 
     * If the ad group was created
     *                 in the draft or trial and has no corresponding base
     * ad group, this field is null.
     *                 This field is only returned on get requests.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBaseAdGroupId(java.lang.Long baseAdGroupId) {
        this.baseAdGroupId = baseAdGroupId;
    }


    /**
     * Gets the forwardCompatibilityMap value for this AdGroupAd.
     * 
     * @return forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    /**
     * Sets the forwardCompatibilityMap value for this AdGroupAd.
     * 
     * @param forwardCompatibilityMap   * This Map provides a place to put new features and settings
     * in older versions
     *                 of the AdWords API in the rare instance we need to
     * introduce a new feature in
     *                 an older version.
     *                 
     *                 It is presently unused.  Do not set a value.
     */
    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201809.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201809.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }


    /**
     * Gets the adStrengthInfo value for this AdGroupAd.
     * 
     * @return adStrengthInfo   * The strength information of the Ad. This contains the overall
     * strength and action items to
     *                 improve the strength.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdStrengthInfo".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AdStrengthInfo getAdStrengthInfo() {
        return adStrengthInfo;
    }


    /**
     * Sets the adStrengthInfo value for this AdGroupAd.
     * 
     * @param adStrengthInfo   * The strength information of the Ad. This contains the overall
     * strength and action items to
     *                 improve the strength.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdStrengthInfo".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAdStrengthInfo(com.google.api.ads.adwords.axis.v201809.cm.AdStrengthInfo adStrengthInfo) {
        this.adStrengthInfo = adStrengthInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupAd)) return false;
        AdGroupAd other = (AdGroupAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.ad==null && other.getAd()==null) || 
             (this.ad!=null &&
              this.ad.equals(other.getAd()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.policySummary==null && other.getPolicySummary()==null) || 
             (this.policySummary!=null &&
              this.policySummary.equals(other.getPolicySummary()))) &&
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.baseCampaignId==null && other.getBaseCampaignId()==null) || 
             (this.baseCampaignId!=null &&
              this.baseCampaignId.equals(other.getBaseCampaignId()))) &&
            ((this.baseAdGroupId==null && other.getBaseAdGroupId()==null) || 
             (this.baseAdGroupId!=null &&
              this.baseAdGroupId.equals(other.getBaseAdGroupId()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) || 
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.adStrengthInfo==null && other.getAdStrengthInfo()==null) || 
             (this.adStrengthInfo!=null &&
              this.adStrengthInfo.equals(other.getAdStrengthInfo())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getAd() != null) {
            _hashCode += getAd().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPolicySummary() != null) {
            _hashCode += getPolicySummary().hashCode();
        }
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBaseCampaignId() != null) {
            _hashCode += getBaseCampaignId().hashCode();
        }
        if (getBaseAdGroupId() != null) {
            _hashCode += getBaseAdGroupId().hashCode();
        }
        if (getForwardCompatibilityMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForwardCompatibilityMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForwardCompatibilityMap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdStrengthInfo() != null) {
            _hashCode += getAdStrengthInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ad"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Ad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupAd.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policySummary");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "policySummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupAdPolicySummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "baseCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseAdGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "baseAdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "String_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adStrengthInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "adStrengthInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdStrengthInfo"));
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
