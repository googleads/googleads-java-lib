/**
 * TargetableAdBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public abstract class TargetableAdBase  extends com.google.api.ads.dfa.axis.v1_19.AdBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.ISP[] ISPs;

    private com.google.api.ads.dfa.axis.v1_19.OSP[] OSPs;

    private com.google.api.ads.dfa.axis.v1_19.AreaCode[] areaCodes;

    private long audienceSegmentId;

    private com.google.api.ads.dfa.axis.v1_19.Bandwidth[] bandwidths;

    private com.google.api.ads.dfa.axis.v1_19.BrowserVersion[] browserVersions;

    private com.google.api.ads.dfa.axis.v1_19.City[] cities;

    private int costType;

    private com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria countryTargetingCriteria;

    private int[] daysOfWeek;

    private int deliveryLimit;

    private boolean deliveryLimitEnabled;

    private com.google.api.ads.dfa.axis.v1_19.DesignatedMarketArea[] designatedMarketAreas;

    private com.google.api.ads.dfa.axis.v1_19.DomainNameBase[] domainNames;

    private com.google.api.ads.dfa.axis.v1_19.DomainType[] domainTypes;

    private int frequencyCap;

    private long frequencyCapPeriod;

    private boolean hardCutOff;

    private int[] hoursOfDay;

    private java.lang.String keywordExpression;

    private com.google.api.ads.dfa.axis.v1_19.OperatingSystem[] operatingSystems;

    private java.lang.String[] postalCodes;

    private int priority;

    private int ratio;

    private com.google.api.ads.dfa.axis.v1_19.State[] states;

    private com.google.api.ads.dfa.axis.v1_19.UserListExpression userListExpression;

    private boolean userLocalTime;

    public TargetableAdBase() {
    }

    public TargetableAdBase(
           long id,
           java.lang.String name,
           boolean active,
           boolean archived,
           long campaignId,
           java.lang.String comments,
           java.util.Calendar endTime,
           com.google.api.ads.dfa.axis.v1_19.PlacementAssignment[] placementAssignments,
           long sizeId,
           java.util.Calendar startTime,
           long typeId,
           com.google.api.ads.dfa.axis.v1_19.ISP[] ISPs,
           com.google.api.ads.dfa.axis.v1_19.OSP[] OSPs,
           com.google.api.ads.dfa.axis.v1_19.AreaCode[] areaCodes,
           long audienceSegmentId,
           com.google.api.ads.dfa.axis.v1_19.Bandwidth[] bandwidths,
           com.google.api.ads.dfa.axis.v1_19.BrowserVersion[] browserVersions,
           com.google.api.ads.dfa.axis.v1_19.City[] cities,
           int costType,
           com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria countryTargetingCriteria,
           int[] daysOfWeek,
           int deliveryLimit,
           boolean deliveryLimitEnabled,
           com.google.api.ads.dfa.axis.v1_19.DesignatedMarketArea[] designatedMarketAreas,
           com.google.api.ads.dfa.axis.v1_19.DomainNameBase[] domainNames,
           com.google.api.ads.dfa.axis.v1_19.DomainType[] domainTypes,
           int frequencyCap,
           long frequencyCapPeriod,
           boolean hardCutOff,
           int[] hoursOfDay,
           java.lang.String keywordExpression,
           com.google.api.ads.dfa.axis.v1_19.OperatingSystem[] operatingSystems,
           java.lang.String[] postalCodes,
           int priority,
           int ratio,
           com.google.api.ads.dfa.axis.v1_19.State[] states,
           com.google.api.ads.dfa.axis.v1_19.UserListExpression userListExpression,
           boolean userLocalTime) {
        super(
            id,
            name,
            active,
            archived,
            campaignId,
            comments,
            endTime,
            placementAssignments,
            sizeId,
            startTime,
            typeId);
        this.ISPs = ISPs;
        this.OSPs = OSPs;
        this.areaCodes = areaCodes;
        this.audienceSegmentId = audienceSegmentId;
        this.bandwidths = bandwidths;
        this.browserVersions = browserVersions;
        this.cities = cities;
        this.costType = costType;
        this.countryTargetingCriteria = countryTargetingCriteria;
        this.daysOfWeek = daysOfWeek;
        this.deliveryLimit = deliveryLimit;
        this.deliveryLimitEnabled = deliveryLimitEnabled;
        this.designatedMarketAreas = designatedMarketAreas;
        this.domainNames = domainNames;
        this.domainTypes = domainTypes;
        this.frequencyCap = frequencyCap;
        this.frequencyCapPeriod = frequencyCapPeriod;
        this.hardCutOff = hardCutOff;
        this.hoursOfDay = hoursOfDay;
        this.keywordExpression = keywordExpression;
        this.operatingSystems = operatingSystems;
        this.postalCodes = postalCodes;
        this.priority = priority;
        this.ratio = ratio;
        this.states = states;
        this.userListExpression = userListExpression;
        this.userLocalTime = userLocalTime;
    }


    /**
     * Gets the ISPs value for this TargetableAdBase.
     * 
     * @return ISPs
     */
    public com.google.api.ads.dfa.axis.v1_19.ISP[] getISPs() {
        return ISPs;
    }


    /**
     * Sets the ISPs value for this TargetableAdBase.
     * 
     * @param ISPs
     */
    public void setISPs(com.google.api.ads.dfa.axis.v1_19.ISP[] ISPs) {
        this.ISPs = ISPs;
    }


    /**
     * Gets the OSPs value for this TargetableAdBase.
     * 
     * @return OSPs
     */
    public com.google.api.ads.dfa.axis.v1_19.OSP[] getOSPs() {
        return OSPs;
    }


    /**
     * Sets the OSPs value for this TargetableAdBase.
     * 
     * @param OSPs
     */
    public void setOSPs(com.google.api.ads.dfa.axis.v1_19.OSP[] OSPs) {
        this.OSPs = OSPs;
    }


    /**
     * Gets the areaCodes value for this TargetableAdBase.
     * 
     * @return areaCodes
     */
    public com.google.api.ads.dfa.axis.v1_19.AreaCode[] getAreaCodes() {
        return areaCodes;
    }


    /**
     * Sets the areaCodes value for this TargetableAdBase.
     * 
     * @param areaCodes
     */
    public void setAreaCodes(com.google.api.ads.dfa.axis.v1_19.AreaCode[] areaCodes) {
        this.areaCodes = areaCodes;
    }


    /**
     * Gets the audienceSegmentId value for this TargetableAdBase.
     * 
     * @return audienceSegmentId
     */
    public long getAudienceSegmentId() {
        return audienceSegmentId;
    }


    /**
     * Sets the audienceSegmentId value for this TargetableAdBase.
     * 
     * @param audienceSegmentId
     */
    public void setAudienceSegmentId(long audienceSegmentId) {
        this.audienceSegmentId = audienceSegmentId;
    }


    /**
     * Gets the bandwidths value for this TargetableAdBase.
     * 
     * @return bandwidths
     */
    public com.google.api.ads.dfa.axis.v1_19.Bandwidth[] getBandwidths() {
        return bandwidths;
    }


    /**
     * Sets the bandwidths value for this TargetableAdBase.
     * 
     * @param bandwidths
     */
    public void setBandwidths(com.google.api.ads.dfa.axis.v1_19.Bandwidth[] bandwidths) {
        this.bandwidths = bandwidths;
    }


    /**
     * Gets the browserVersions value for this TargetableAdBase.
     * 
     * @return browserVersions
     */
    public com.google.api.ads.dfa.axis.v1_19.BrowserVersion[] getBrowserVersions() {
        return browserVersions;
    }


    /**
     * Sets the browserVersions value for this TargetableAdBase.
     * 
     * @param browserVersions
     */
    public void setBrowserVersions(com.google.api.ads.dfa.axis.v1_19.BrowserVersion[] browserVersions) {
        this.browserVersions = browserVersions;
    }


    /**
     * Gets the cities value for this TargetableAdBase.
     * 
     * @return cities
     */
    public com.google.api.ads.dfa.axis.v1_19.City[] getCities() {
        return cities;
    }


    /**
     * Sets the cities value for this TargetableAdBase.
     * 
     * @param cities
     */
    public void setCities(com.google.api.ads.dfa.axis.v1_19.City[] cities) {
        this.cities = cities;
    }


    /**
     * Gets the costType value for this TargetableAdBase.
     * 
     * @return costType
     */
    public int getCostType() {
        return costType;
    }


    /**
     * Sets the costType value for this TargetableAdBase.
     * 
     * @param costType
     */
    public void setCostType(int costType) {
        this.costType = costType;
    }


    /**
     * Gets the countryTargetingCriteria value for this TargetableAdBase.
     * 
     * @return countryTargetingCriteria
     */
    public com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria getCountryTargetingCriteria() {
        return countryTargetingCriteria;
    }


    /**
     * Sets the countryTargetingCriteria value for this TargetableAdBase.
     * 
     * @param countryTargetingCriteria
     */
    public void setCountryTargetingCriteria(com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria countryTargetingCriteria) {
        this.countryTargetingCriteria = countryTargetingCriteria;
    }


    /**
     * Gets the daysOfWeek value for this TargetableAdBase.
     * 
     * @return daysOfWeek
     */
    public int[] getDaysOfWeek() {
        return daysOfWeek;
    }


    /**
     * Sets the daysOfWeek value for this TargetableAdBase.
     * 
     * @param daysOfWeek
     */
    public void setDaysOfWeek(int[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }


    /**
     * Gets the deliveryLimit value for this TargetableAdBase.
     * 
     * @return deliveryLimit
     */
    public int getDeliveryLimit() {
        return deliveryLimit;
    }


    /**
     * Sets the deliveryLimit value for this TargetableAdBase.
     * 
     * @param deliveryLimit
     */
    public void setDeliveryLimit(int deliveryLimit) {
        this.deliveryLimit = deliveryLimit;
    }


    /**
     * Gets the deliveryLimitEnabled value for this TargetableAdBase.
     * 
     * @return deliveryLimitEnabled
     */
    public boolean isDeliveryLimitEnabled() {
        return deliveryLimitEnabled;
    }


    /**
     * Sets the deliveryLimitEnabled value for this TargetableAdBase.
     * 
     * @param deliveryLimitEnabled
     */
    public void setDeliveryLimitEnabled(boolean deliveryLimitEnabled) {
        this.deliveryLimitEnabled = deliveryLimitEnabled;
    }


    /**
     * Gets the designatedMarketAreas value for this TargetableAdBase.
     * 
     * @return designatedMarketAreas
     */
    public com.google.api.ads.dfa.axis.v1_19.DesignatedMarketArea[] getDesignatedMarketAreas() {
        return designatedMarketAreas;
    }


    /**
     * Sets the designatedMarketAreas value for this TargetableAdBase.
     * 
     * @param designatedMarketAreas
     */
    public void setDesignatedMarketAreas(com.google.api.ads.dfa.axis.v1_19.DesignatedMarketArea[] designatedMarketAreas) {
        this.designatedMarketAreas = designatedMarketAreas;
    }


    /**
     * Gets the domainNames value for this TargetableAdBase.
     * 
     * @return domainNames
     */
    public com.google.api.ads.dfa.axis.v1_19.DomainNameBase[] getDomainNames() {
        return domainNames;
    }


    /**
     * Sets the domainNames value for this TargetableAdBase.
     * 
     * @param domainNames
     */
    public void setDomainNames(com.google.api.ads.dfa.axis.v1_19.DomainNameBase[] domainNames) {
        this.domainNames = domainNames;
    }


    /**
     * Gets the domainTypes value for this TargetableAdBase.
     * 
     * @return domainTypes
     */
    public com.google.api.ads.dfa.axis.v1_19.DomainType[] getDomainTypes() {
        return domainTypes;
    }


    /**
     * Sets the domainTypes value for this TargetableAdBase.
     * 
     * @param domainTypes
     */
    public void setDomainTypes(com.google.api.ads.dfa.axis.v1_19.DomainType[] domainTypes) {
        this.domainTypes = domainTypes;
    }


    /**
     * Gets the frequencyCap value for this TargetableAdBase.
     * 
     * @return frequencyCap
     */
    public int getFrequencyCap() {
        return frequencyCap;
    }


    /**
     * Sets the frequencyCap value for this TargetableAdBase.
     * 
     * @param frequencyCap
     */
    public void setFrequencyCap(int frequencyCap) {
        this.frequencyCap = frequencyCap;
    }


    /**
     * Gets the frequencyCapPeriod value for this TargetableAdBase.
     * 
     * @return frequencyCapPeriod
     */
    public long getFrequencyCapPeriod() {
        return frequencyCapPeriod;
    }


    /**
     * Sets the frequencyCapPeriod value for this TargetableAdBase.
     * 
     * @param frequencyCapPeriod
     */
    public void setFrequencyCapPeriod(long frequencyCapPeriod) {
        this.frequencyCapPeriod = frequencyCapPeriod;
    }


    /**
     * Gets the hardCutOff value for this TargetableAdBase.
     * 
     * @return hardCutOff
     */
    public boolean isHardCutOff() {
        return hardCutOff;
    }


    /**
     * Sets the hardCutOff value for this TargetableAdBase.
     * 
     * @param hardCutOff
     */
    public void setHardCutOff(boolean hardCutOff) {
        this.hardCutOff = hardCutOff;
    }


    /**
     * Gets the hoursOfDay value for this TargetableAdBase.
     * 
     * @return hoursOfDay
     */
    public int[] getHoursOfDay() {
        return hoursOfDay;
    }


    /**
     * Sets the hoursOfDay value for this TargetableAdBase.
     * 
     * @param hoursOfDay
     */
    public void setHoursOfDay(int[] hoursOfDay) {
        this.hoursOfDay = hoursOfDay;
    }


    /**
     * Gets the keywordExpression value for this TargetableAdBase.
     * 
     * @return keywordExpression
     */
    public java.lang.String getKeywordExpression() {
        return keywordExpression;
    }


    /**
     * Sets the keywordExpression value for this TargetableAdBase.
     * 
     * @param keywordExpression
     */
    public void setKeywordExpression(java.lang.String keywordExpression) {
        this.keywordExpression = keywordExpression;
    }


    /**
     * Gets the operatingSystems value for this TargetableAdBase.
     * 
     * @return operatingSystems
     */
    public com.google.api.ads.dfa.axis.v1_19.OperatingSystem[] getOperatingSystems() {
        return operatingSystems;
    }


    /**
     * Sets the operatingSystems value for this TargetableAdBase.
     * 
     * @param operatingSystems
     */
    public void setOperatingSystems(com.google.api.ads.dfa.axis.v1_19.OperatingSystem[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }


    /**
     * Gets the postalCodes value for this TargetableAdBase.
     * 
     * @return postalCodes
     */
    public java.lang.String[] getPostalCodes() {
        return postalCodes;
    }


    /**
     * Sets the postalCodes value for this TargetableAdBase.
     * 
     * @param postalCodes
     */
    public void setPostalCodes(java.lang.String[] postalCodes) {
        this.postalCodes = postalCodes;
    }


    /**
     * Gets the priority value for this TargetableAdBase.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this TargetableAdBase.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the ratio value for this TargetableAdBase.
     * 
     * @return ratio
     */
    public int getRatio() {
        return ratio;
    }


    /**
     * Sets the ratio value for this TargetableAdBase.
     * 
     * @param ratio
     */
    public void setRatio(int ratio) {
        this.ratio = ratio;
    }


    /**
     * Gets the states value for this TargetableAdBase.
     * 
     * @return states
     */
    public com.google.api.ads.dfa.axis.v1_19.State[] getStates() {
        return states;
    }


    /**
     * Sets the states value for this TargetableAdBase.
     * 
     * @param states
     */
    public void setStates(com.google.api.ads.dfa.axis.v1_19.State[] states) {
        this.states = states;
    }


    /**
     * Gets the userListExpression value for this TargetableAdBase.
     * 
     * @return userListExpression
     */
    public com.google.api.ads.dfa.axis.v1_19.UserListExpression getUserListExpression() {
        return userListExpression;
    }


    /**
     * Sets the userListExpression value for this TargetableAdBase.
     * 
     * @param userListExpression
     */
    public void setUserListExpression(com.google.api.ads.dfa.axis.v1_19.UserListExpression userListExpression) {
        this.userListExpression = userListExpression;
    }


    /**
     * Gets the userLocalTime value for this TargetableAdBase.
     * 
     * @return userLocalTime
     */
    public boolean isUserLocalTime() {
        return userLocalTime;
    }


    /**
     * Sets the userLocalTime value for this TargetableAdBase.
     * 
     * @param userLocalTime
     */
    public void setUserLocalTime(boolean userLocalTime) {
        this.userLocalTime = userLocalTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetableAdBase)) return false;
        TargetableAdBase other = (TargetableAdBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ISPs==null && other.getISPs()==null) || 
             (this.ISPs!=null &&
              java.util.Arrays.equals(this.ISPs, other.getISPs()))) &&
            ((this.OSPs==null && other.getOSPs()==null) || 
             (this.OSPs!=null &&
              java.util.Arrays.equals(this.OSPs, other.getOSPs()))) &&
            ((this.areaCodes==null && other.getAreaCodes()==null) || 
             (this.areaCodes!=null &&
              java.util.Arrays.equals(this.areaCodes, other.getAreaCodes()))) &&
            this.audienceSegmentId == other.getAudienceSegmentId() &&
            ((this.bandwidths==null && other.getBandwidths()==null) || 
             (this.bandwidths!=null &&
              java.util.Arrays.equals(this.bandwidths, other.getBandwidths()))) &&
            ((this.browserVersions==null && other.getBrowserVersions()==null) || 
             (this.browserVersions!=null &&
              java.util.Arrays.equals(this.browserVersions, other.getBrowserVersions()))) &&
            ((this.cities==null && other.getCities()==null) || 
             (this.cities!=null &&
              java.util.Arrays.equals(this.cities, other.getCities()))) &&
            this.costType == other.getCostType() &&
            ((this.countryTargetingCriteria==null && other.getCountryTargetingCriteria()==null) || 
             (this.countryTargetingCriteria!=null &&
              this.countryTargetingCriteria.equals(other.getCountryTargetingCriteria()))) &&
            ((this.daysOfWeek==null && other.getDaysOfWeek()==null) || 
             (this.daysOfWeek!=null &&
              java.util.Arrays.equals(this.daysOfWeek, other.getDaysOfWeek()))) &&
            this.deliveryLimit == other.getDeliveryLimit() &&
            this.deliveryLimitEnabled == other.isDeliveryLimitEnabled() &&
            ((this.designatedMarketAreas==null && other.getDesignatedMarketAreas()==null) || 
             (this.designatedMarketAreas!=null &&
              java.util.Arrays.equals(this.designatedMarketAreas, other.getDesignatedMarketAreas()))) &&
            ((this.domainNames==null && other.getDomainNames()==null) || 
             (this.domainNames!=null &&
              java.util.Arrays.equals(this.domainNames, other.getDomainNames()))) &&
            ((this.domainTypes==null && other.getDomainTypes()==null) || 
             (this.domainTypes!=null &&
              java.util.Arrays.equals(this.domainTypes, other.getDomainTypes()))) &&
            this.frequencyCap == other.getFrequencyCap() &&
            this.frequencyCapPeriod == other.getFrequencyCapPeriod() &&
            this.hardCutOff == other.isHardCutOff() &&
            ((this.hoursOfDay==null && other.getHoursOfDay()==null) || 
             (this.hoursOfDay!=null &&
              java.util.Arrays.equals(this.hoursOfDay, other.getHoursOfDay()))) &&
            ((this.keywordExpression==null && other.getKeywordExpression()==null) || 
             (this.keywordExpression!=null &&
              this.keywordExpression.equals(other.getKeywordExpression()))) &&
            ((this.operatingSystems==null && other.getOperatingSystems()==null) || 
             (this.operatingSystems!=null &&
              java.util.Arrays.equals(this.operatingSystems, other.getOperatingSystems()))) &&
            ((this.postalCodes==null && other.getPostalCodes()==null) || 
             (this.postalCodes!=null &&
              java.util.Arrays.equals(this.postalCodes, other.getPostalCodes()))) &&
            this.priority == other.getPriority() &&
            this.ratio == other.getRatio() &&
            ((this.states==null && other.getStates()==null) || 
             (this.states!=null &&
              java.util.Arrays.equals(this.states, other.getStates()))) &&
            ((this.userListExpression==null && other.getUserListExpression()==null) || 
             (this.userListExpression!=null &&
              this.userListExpression.equals(other.getUserListExpression()))) &&
            this.userLocalTime == other.isUserLocalTime();
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
        if (getISPs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getISPs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getISPs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOSPs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOSPs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOSPs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAreaCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAreaCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAreaCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getAudienceSegmentId()).hashCode();
        if (getBandwidths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBandwidths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBandwidths(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBrowserVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrowserVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrowserVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCostType();
        if (getCountryTargetingCriteria() != null) {
            _hashCode += getCountryTargetingCriteria().hashCode();
        }
        if (getDaysOfWeek() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOfWeek());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOfWeek(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getDeliveryLimit();
        _hashCode += (isDeliveryLimitEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDesignatedMarketAreas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDesignatedMarketAreas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDesignatedMarketAreas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomainNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomainTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getFrequencyCap();
        _hashCode += new Long(getFrequencyCapPeriod()).hashCode();
        _hashCode += (isHardCutOff() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHoursOfDay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHoursOfDay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHoursOfDay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKeywordExpression() != null) {
            _hashCode += getKeywordExpression().hashCode();
        }
        if (getOperatingSystems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperatingSystems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperatingSystems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostalCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostalCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostalCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPriority();
        _hashCode += getRatio();
        if (getStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserListExpression() != null) {
            _hashCode += getUserListExpression().hashCode();
        }
        _hashCode += (isUserLocalTime() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetableAdBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "TargetableAdBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ISPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ISP"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OSPs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OSPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "OSP"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "areaCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AreaCode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceSegmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "audienceSegmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Bandwidth"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "browserVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "BrowserVersion"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "City"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryTargetingCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryTargetingCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CountryTargetingCriteria"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daysOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryLimitEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryLimitEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designatedMarketAreas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designatedMarketAreas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "DesignatedMarketArea"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "DomainNameBase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "DomainType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequencyCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCapPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequencyCapPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardCutOff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hardCutOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hoursOfDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hoursOfDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keywordExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatingSystems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "OperatingSystem"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postalCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("states");
        elemField.setXmlName(new javax.xml.namespace.QName("", "states"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "State"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userListExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserListExpression"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLocalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLocalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
