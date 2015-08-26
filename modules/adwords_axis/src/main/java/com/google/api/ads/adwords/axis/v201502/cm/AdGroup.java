/**
 * AdGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * Represents an ad group.
 */
public class AdGroup  implements java.io.Serializable {
    /* ID of this ad group.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* ID of the campaign with which this ad group is associated.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Long campaignId;

    /* Name of the campaign with which this ad group is associated.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.String campaignName;

    /* Name of this ad group (at most 255 UTF-8 full-width characters).
     * This field is required and should not be {@code null} for ADD operations
     * from v201309 version.
     *                 <span class="constraint MatchesRegex">AdGroup names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span> */
    private java.lang.String name;

    /* Status of this ad group. */
    private com.google.api.ads.adwords.axis.v201502.cm.AdGroupStatus status;

    /* List of settings for the AdGroup. */
    private com.google.api.ads.adwords.axis.v201502.cm.Setting[] settings;

    /* Data from a campaign bidding strategy experiment, returned
     * by
     *                 {@link AdGroupService#get get()} only if the experimentId
     * is supplied. */
    private com.google.api.ads.adwords.axis.v201502.cm.AdGroupExperimentData experimentData;

    /* Labels that are attached to the {@link AdGroup}. To associate
     * an existing {@link Label} to an
     *                 existing {@link AdGroup}, use {@link AdGroupService#mutateLabel}
     * with ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link AdGroup}, use
     *                 {@link AdGroupService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span> */
    private com.google.api.ads.adwords.axis.v201502.cm.Label[] labels;

    private com.google.api.ads.adwords.axis.v201502.cm.String_StringMapEntry[] forwardCompatibilityMap;

    /* Bidding configuration for this ad group. To set the bids on
     * the ad groups use
     *                 {@link BiddingStrategyConfiguration#bids}. Multiple
     * bids can be set on ad group at the same
     *                 time. Only the bids that apply to the effective bidding
     * strategy will be used. Effective
     *                 bidding strategy is considered to be the directly
     * attached strategy or inherited campaign level
     *                 strategy when there?s no directly attached strategy. */
    private com.google.api.ads.adwords.axis.v201502.cm.BiddingStrategyConfiguration biddingStrategyConfiguration;

    /* Allows advertisers to specify a criteria dimension on which
     * to place absolute bids.
     *                 This is only applicable for campaigns that target
     * only the content network and not search. */
    private com.google.api.ads.adwords.axis.v201502.cm.CriterionTypeGroup contentBidCriterionTypeGroup;

    /* URL template for constructing a tracking URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field. */
    private java.lang.String trackingUrlTemplate;

    /* A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls. */
    private com.google.api.ads.adwords.axis.v201502.cm.CustomParameters urlCustomParameters;

    public AdGroup() {
    }

    public AdGroup(
           java.lang.Long id,
           java.lang.Long campaignId,
           java.lang.String campaignName,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201502.cm.AdGroupStatus status,
           com.google.api.ads.adwords.axis.v201502.cm.Setting[] settings,
           com.google.api.ads.adwords.axis.v201502.cm.AdGroupExperimentData experimentData,
           com.google.api.ads.adwords.axis.v201502.cm.Label[] labels,
           com.google.api.ads.adwords.axis.v201502.cm.String_StringMapEntry[] forwardCompatibilityMap,
           com.google.api.ads.adwords.axis.v201502.cm.BiddingStrategyConfiguration biddingStrategyConfiguration,
           com.google.api.ads.adwords.axis.v201502.cm.CriterionTypeGroup contentBidCriterionTypeGroup,
           java.lang.String trackingUrlTemplate,
           com.google.api.ads.adwords.axis.v201502.cm.CustomParameters urlCustomParameters) {
           this.id = id;
           this.campaignId = campaignId;
           this.campaignName = campaignName;
           this.name = name;
           this.status = status;
           this.settings = settings;
           this.experimentData = experimentData;
           this.labels = labels;
           this.forwardCompatibilityMap = forwardCompatibilityMap;
           this.biddingStrategyConfiguration = biddingStrategyConfiguration;
           this.contentBidCriterionTypeGroup = contentBidCriterionTypeGroup;
           this.trackingUrlTemplate = trackingUrlTemplate;
           this.urlCustomParameters = urlCustomParameters;
    }


    /**
     * Gets the id value for this AdGroup.
     *
     * @return id   * ID of this ad group.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this AdGroup.
     *
     * @param id   * ID of this ad group.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the campaignId value for this AdGroup.
     *
     * @return campaignId   * ID of the campaign with which this ad group is associated.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this AdGroup.
     *
     * @param campaignId   * ID of the campaign with which this ad group is associated.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the campaignName value for this AdGroup.
     *
     * @return campaignName   * Name of the campaign with which this ad group is associated.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this AdGroup.
     *
     * @param campaignName   * Name of the campaign with which this ad group is associated.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the name value for this AdGroup.
     *
     * @return name   * Name of this ad group (at most 255 UTF-8 full-width characters).
     * This field is required and should not be {@code null} for ADD operations
     * from v201309 version.
     *                 <span class="constraint MatchesRegex">AdGroup names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AdGroup.
     *
     * @param name   * Name of this ad group (at most 255 UTF-8 full-width characters).
     * This field is required and should not be {@code null} for ADD operations
     * from v201309 version.
     *                 <span class="constraint MatchesRegex">AdGroup names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this AdGroup.
     *
     * @return status   * Status of this ad group.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.AdGroupStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdGroup.
     *
     * @param status   * Status of this ad group.
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201502.cm.AdGroupStatus status) {
        this.status = status;
    }


    /**
     * Gets the settings value for this AdGroup.
     *
     * @return settings   * List of settings for the AdGroup.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.Setting[] getSettings() {
        return settings;
    }


    /**
     * Sets the settings value for this AdGroup.
     *
     * @param settings   * List of settings for the AdGroup.
     */
    public void setSettings(com.google.api.ads.adwords.axis.v201502.cm.Setting[] settings) {
        this.settings = settings;
    }

    public com.google.api.ads.adwords.axis.v201502.cm.Setting getSettings(int i) {
        return this.settings[i];
    }

    public void setSettings(int i, com.google.api.ads.adwords.axis.v201502.cm.Setting _value) {
        this.settings[i] = _value;
    }


    /**
     * Gets the experimentData value for this AdGroup.
     *
     * @return experimentData   * Data from a campaign bidding strategy experiment, returned
     * by
     *                 {@link AdGroupService#get get()} only if the experimentId
     * is supplied.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.AdGroupExperimentData getExperimentData() {
        return experimentData;
    }


    /**
     * Sets the experimentData value for this AdGroup.
     *
     * @param experimentData   * Data from a campaign bidding strategy experiment, returned
     * by
     *                 {@link AdGroupService#get get()} only if the experimentId
     * is supplied.
     */
    public void setExperimentData(com.google.api.ads.adwords.axis.v201502.cm.AdGroupExperimentData experimentData) {
        this.experimentData = experimentData;
    }


    /**
     * Gets the labels value for this AdGroup.
     *
     * @return labels   * Labels that are attached to the {@link AdGroup}. To associate
     * an existing {@link Label} to an
     *                 existing {@link AdGroup}, use {@link AdGroupService#mutateLabel}
     * with ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link AdGroup}, use
     *                 {@link AdGroupService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201502.cm.Label[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this AdGroup.
     *
     * @param labels   * Labels that are attached to the {@link AdGroup}. To associate
     * an existing {@link Label} to an
     *                 existing {@link AdGroup}, use {@link AdGroupService#mutateLabel}
     * with ADD
     *                 operator. To remove an associated {@link Label} from
     * the {@link AdGroup}, use
     *                 {@link AdGroupService#mutateLabel} with REMOVE operator.
     * To filter on {@link Label}s,
     *                 use one of {@link Predicate.Operator#CONTAINS_ALL},
     * {@link Predicate.Operator#CONTAINS_ANY},
     *                 {@link Predicate.Operator#CONTAINS_NONE} operators
     * with a list of {@link Label} ids.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE and SET.</span>
     */
    public void setLabels(com.google.api.ads.adwords.axis.v201502.cm.Label[] labels) {
        this.labels = labels;
    }

    public com.google.api.ads.adwords.axis.v201502.cm.Label getLabels(int i) {
        return this.labels[i];
    }

    public void setLabels(int i, com.google.api.ads.adwords.axis.v201502.cm.Label _value) {
        this.labels[i] = _value;
    }


    public com.google.api.ads.adwords.axis.v201502.cm.String_StringMapEntry[] getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }


    public void setForwardCompatibilityMap(com.google.api.ads.adwords.axis.v201502.cm.String_StringMapEntry[] forwardCompatibilityMap) {
        this.forwardCompatibilityMap = forwardCompatibilityMap;
    }

    public com.google.api.ads.adwords.axis.v201502.cm.String_StringMapEntry getForwardCompatibilityMap(int i) {
        return this.forwardCompatibilityMap[i];
    }

    public void setForwardCompatibilityMap(int i, com.google.api.ads.adwords.axis.v201502.cm.String_StringMapEntry _value) {
        this.forwardCompatibilityMap[i] = _value;
    }


    /**
     * Gets the biddingStrategyConfiguration value for this AdGroup.
     *
     * @return biddingStrategyConfiguration   * Bidding configuration for this ad group. To set the bids on
     * the ad groups use
     *                 {@link BiddingStrategyConfiguration#bids}. Multiple
     * bids can be set on ad group at the same
     *                 time. Only the bids that apply to the effective bidding
     * strategy will be used. Effective
     *                 bidding strategy is considered to be the directly
     * attached strategy or inherited campaign level
     *                 strategy when there?s no directly attached strategy.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
        return biddingStrategyConfiguration;
    }


    /**
     * Sets the biddingStrategyConfiguration value for this AdGroup.
     *
     * @param biddingStrategyConfiguration   * Bidding configuration for this ad group. To set the bids on
     * the ad groups use
     *                 {@link BiddingStrategyConfiguration#bids}. Multiple
     * bids can be set on ad group at the same
     *                 time. Only the bids that apply to the effective bidding
     * strategy will be used. Effective
     *                 bidding strategy is considered to be the directly
     * attached strategy or inherited campaign level
     *                 strategy when there?s no directly attached strategy.
     */
    public void setBiddingStrategyConfiguration(com.google.api.ads.adwords.axis.v201502.cm.BiddingStrategyConfiguration biddingStrategyConfiguration) {
        this.biddingStrategyConfiguration = biddingStrategyConfiguration;
    }


    /**
     * Gets the contentBidCriterionTypeGroup value for this AdGroup.
     *
     * @return contentBidCriterionTypeGroup   * Allows advertisers to specify a criteria dimension on which
     * to place absolute bids.
     *                 This is only applicable for campaigns that target
     * only the content network and not search.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.CriterionTypeGroup getContentBidCriterionTypeGroup() {
        return contentBidCriterionTypeGroup;
    }


    /**
     * Sets the contentBidCriterionTypeGroup value for this AdGroup.
     *
     * @param contentBidCriterionTypeGroup   * Allows advertisers to specify a criteria dimension on which
     * to place absolute bids.
     *                 This is only applicable for campaigns that target
     * only the content network and not search.
     */
    public void setContentBidCriterionTypeGroup(com.google.api.ads.adwords.axis.v201502.cm.CriterionTypeGroup contentBidCriterionTypeGroup) {
        this.contentBidCriterionTypeGroup = contentBidCriterionTypeGroup;
    }


    /**
     * Gets the trackingUrlTemplate value for this AdGroup.
     *
     * @return trackingUrlTemplate   * URL template for constructing a tracking URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this AdGroup.
     *
     * @param trackingUrlTemplate   * URL template for constructing a tracking URL.
     *
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the urlCustomParameters value for this AdGroup.
     *
     * @return urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }


    /**
     * Sets the urlCustomParameters value for this AdGroup.
     *
     * @param urlCustomParameters   * A list of mappings to be used for substituting URL custom parameter
     * tags in the
     *                 trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
     */
    public void setUrlCustomParameters(com.google.api.ads.adwords.axis.v201502.cm.CustomParameters urlCustomParameters) {
        this.urlCustomParameters = urlCustomParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroup)) return false;
        AdGroup other = (AdGroup) obj;
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
            ((this.campaignId==null && other.getCampaignId()==null) ||
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.campaignName==null && other.getCampaignName()==null) ||
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.name==null && other.getName()==null) ||
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) ||
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.settings==null && other.getSettings()==null) ||
             (this.settings!=null &&
              java.util.Arrays.equals(this.settings, other.getSettings()))) &&
            ((this.experimentData==null && other.getExperimentData()==null) ||
             (this.experimentData!=null &&
              this.experimentData.equals(other.getExperimentData()))) &&
            ((this.labels==null && other.getLabels()==null) ||
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            ((this.forwardCompatibilityMap==null && other.getForwardCompatibilityMap()==null) ||
             (this.forwardCompatibilityMap!=null &&
              java.util.Arrays.equals(this.forwardCompatibilityMap, other.getForwardCompatibilityMap()))) &&
            ((this.biddingStrategyConfiguration==null && other.getBiddingStrategyConfiguration()==null) ||
             (this.biddingStrategyConfiguration!=null &&
              this.biddingStrategyConfiguration.equals(other.getBiddingStrategyConfiguration()))) &&
            ((this.contentBidCriterionTypeGroup==null && other.getContentBidCriterionTypeGroup()==null) ||
             (this.contentBidCriterionTypeGroup!=null &&
              this.contentBidCriterionTypeGroup.equals(other.getContentBidCriterionTypeGroup()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) ||
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.urlCustomParameters==null && other.getUrlCustomParameters()==null) ||
             (this.urlCustomParameters!=null &&
              this.urlCustomParameters.equals(other.getUrlCustomParameters())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExperimentData() != null) {
            _hashCode += getExperimentData().hashCode();
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
        if (getBiddingStrategyConfiguration() != null) {
            _hashCode += getBiddingStrategyConfiguration().hashCode();
        }
        if (getContentBidCriterionTypeGroup() != null) {
            _hashCode += getContentBidCriterionTypeGroup().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getUrlCustomParameters() != null) {
            _hashCode += getUrlCustomParameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "AdGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "AdGroup.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "Setting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "experimentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "AdGroupExperimentData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "Label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardCompatibilityMap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "forwardCompatibilityMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "String_StringMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "biddingStrategyConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "BiddingStrategyConfiguration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentBidCriterionTypeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "contentBidCriterionTypeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "CriterionTypeGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "trackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlCustomParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "urlCustomParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "CustomParameters"));
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
