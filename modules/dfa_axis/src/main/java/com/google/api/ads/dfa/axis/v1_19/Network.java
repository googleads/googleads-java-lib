/**
 * Network.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class Network  extends com.google.api.ads.dfa.axis.v1_19.NetworkBase  implements java.io.Serializable {
    private java.lang.String abbreviation;

    private boolean active;

    private int activeAdsLimit;

    private int availableAds;

    private long[] availablePermissions;

    private java.lang.String country;

    private long currency;

    private long defaultCreativeSize;

    private long defaultEncoding;

    private long defaultLanguage;

    private java.lang.String description;

    private com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[] frequencyCapGroups;

    private int loginAttempts;

    private long maximumImageSize;

    private int minimumPasswordLength;

    private long[] networkPermissions;

    private java.lang.String notificationEmailAddress;

    private long passwordExpirePeriod;

    private long reportGenerationTimeZone;

    private com.google.api.ads.dfa.axis.v1_19.ReportsConfiguration reportsConfiguration;

    private com.google.api.ads.dfa.axis.v1_19.RichMediaNetworkConfiguration richmediaNetworkConfig;

    private int totalActiveAds;

    private com.google.api.ads.dfa.axis.v1_19.WidgetNetworkConfig widgetNetworkConfig;

    public Network() {
    }

    public Network(
           long id,
           java.lang.String name,
           java.lang.String abbreviation,
           boolean active,
           int activeAdsLimit,
           int availableAds,
           long[] availablePermissions,
           java.lang.String country,
           long currency,
           long defaultCreativeSize,
           long defaultEncoding,
           long defaultLanguage,
           java.lang.String description,
           com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[] frequencyCapGroups,
           int loginAttempts,
           long maximumImageSize,
           int minimumPasswordLength,
           long[] networkPermissions,
           java.lang.String notificationEmailAddress,
           long passwordExpirePeriod,
           long reportGenerationTimeZone,
           com.google.api.ads.dfa.axis.v1_19.ReportsConfiguration reportsConfiguration,
           com.google.api.ads.dfa.axis.v1_19.RichMediaNetworkConfiguration richmediaNetworkConfig,
           int totalActiveAds,
           com.google.api.ads.dfa.axis.v1_19.WidgetNetworkConfig widgetNetworkConfig) {
        super(
            id,
            name);
        this.abbreviation = abbreviation;
        this.active = active;
        this.activeAdsLimit = activeAdsLimit;
        this.availableAds = availableAds;
        this.availablePermissions = availablePermissions;
        this.country = country;
        this.currency = currency;
        this.defaultCreativeSize = defaultCreativeSize;
        this.defaultEncoding = defaultEncoding;
        this.defaultLanguage = defaultLanguage;
        this.description = description;
        this.frequencyCapGroups = frequencyCapGroups;
        this.loginAttempts = loginAttempts;
        this.maximumImageSize = maximumImageSize;
        this.minimumPasswordLength = minimumPasswordLength;
        this.networkPermissions = networkPermissions;
        this.notificationEmailAddress = notificationEmailAddress;
        this.passwordExpirePeriod = passwordExpirePeriod;
        this.reportGenerationTimeZone = reportGenerationTimeZone;
        this.reportsConfiguration = reportsConfiguration;
        this.richmediaNetworkConfig = richmediaNetworkConfig;
        this.totalActiveAds = totalActiveAds;
        this.widgetNetworkConfig = widgetNetworkConfig;
    }


    /**
     * Gets the abbreviation value for this Network.
     * 
     * @return abbreviation
     */
    public java.lang.String getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this Network.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(java.lang.String abbreviation) {
        this.abbreviation = abbreviation;
    }


    /**
     * Gets the active value for this Network.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Network.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the activeAdsLimit value for this Network.
     * 
     * @return activeAdsLimit
     */
    public int getActiveAdsLimit() {
        return activeAdsLimit;
    }


    /**
     * Sets the activeAdsLimit value for this Network.
     * 
     * @param activeAdsLimit
     */
    public void setActiveAdsLimit(int activeAdsLimit) {
        this.activeAdsLimit = activeAdsLimit;
    }


    /**
     * Gets the availableAds value for this Network.
     * 
     * @return availableAds
     */
    public int getAvailableAds() {
        return availableAds;
    }


    /**
     * Sets the availableAds value for this Network.
     * 
     * @param availableAds
     */
    public void setAvailableAds(int availableAds) {
        this.availableAds = availableAds;
    }


    /**
     * Gets the availablePermissions value for this Network.
     * 
     * @return availablePermissions
     */
    public long[] getAvailablePermissions() {
        return availablePermissions;
    }


    /**
     * Sets the availablePermissions value for this Network.
     * 
     * @param availablePermissions
     */
    public void setAvailablePermissions(long[] availablePermissions) {
        this.availablePermissions = availablePermissions;
    }


    /**
     * Gets the country value for this Network.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Network.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the currency value for this Network.
     * 
     * @return currency
     */
    public long getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Network.
     * 
     * @param currency
     */
    public void setCurrency(long currency) {
        this.currency = currency;
    }


    /**
     * Gets the defaultCreativeSize value for this Network.
     * 
     * @return defaultCreativeSize
     */
    public long getDefaultCreativeSize() {
        return defaultCreativeSize;
    }


    /**
     * Sets the defaultCreativeSize value for this Network.
     * 
     * @param defaultCreativeSize
     */
    public void setDefaultCreativeSize(long defaultCreativeSize) {
        this.defaultCreativeSize = defaultCreativeSize;
    }


    /**
     * Gets the defaultEncoding value for this Network.
     * 
     * @return defaultEncoding
     */
    public long getDefaultEncoding() {
        return defaultEncoding;
    }


    /**
     * Sets the defaultEncoding value for this Network.
     * 
     * @param defaultEncoding
     */
    public void setDefaultEncoding(long defaultEncoding) {
        this.defaultEncoding = defaultEncoding;
    }


    /**
     * Gets the defaultLanguage value for this Network.
     * 
     * @return defaultLanguage
     */
    public long getDefaultLanguage() {
        return defaultLanguage;
    }


    /**
     * Sets the defaultLanguage value for this Network.
     * 
     * @param defaultLanguage
     */
    public void setDefaultLanguage(long defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }


    /**
     * Gets the description value for this Network.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Network.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the frequencyCapGroups value for this Network.
     * 
     * @return frequencyCapGroups
     */
    public com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[] getFrequencyCapGroups() {
        return frequencyCapGroups;
    }


    /**
     * Sets the frequencyCapGroups value for this Network.
     * 
     * @param frequencyCapGroups
     */
    public void setFrequencyCapGroups(com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[] frequencyCapGroups) {
        this.frequencyCapGroups = frequencyCapGroups;
    }


    /**
     * Gets the loginAttempts value for this Network.
     * 
     * @return loginAttempts
     */
    public int getLoginAttempts() {
        return loginAttempts;
    }


    /**
     * Sets the loginAttempts value for this Network.
     * 
     * @param loginAttempts
     */
    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }


    /**
     * Gets the maximumImageSize value for this Network.
     * 
     * @return maximumImageSize
     */
    public long getMaximumImageSize() {
        return maximumImageSize;
    }


    /**
     * Sets the maximumImageSize value for this Network.
     * 
     * @param maximumImageSize
     */
    public void setMaximumImageSize(long maximumImageSize) {
        this.maximumImageSize = maximumImageSize;
    }


    /**
     * Gets the minimumPasswordLength value for this Network.
     * 
     * @return minimumPasswordLength
     */
    public int getMinimumPasswordLength() {
        return minimumPasswordLength;
    }


    /**
     * Sets the minimumPasswordLength value for this Network.
     * 
     * @param minimumPasswordLength
     */
    public void setMinimumPasswordLength(int minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }


    /**
     * Gets the networkPermissions value for this Network.
     * 
     * @return networkPermissions
     */
    public long[] getNetworkPermissions() {
        return networkPermissions;
    }


    /**
     * Sets the networkPermissions value for this Network.
     * 
     * @param networkPermissions
     */
    public void setNetworkPermissions(long[] networkPermissions) {
        this.networkPermissions = networkPermissions;
    }


    /**
     * Gets the notificationEmailAddress value for this Network.
     * 
     * @return notificationEmailAddress
     */
    public java.lang.String getNotificationEmailAddress() {
        return notificationEmailAddress;
    }


    /**
     * Sets the notificationEmailAddress value for this Network.
     * 
     * @param notificationEmailAddress
     */
    public void setNotificationEmailAddress(java.lang.String notificationEmailAddress) {
        this.notificationEmailAddress = notificationEmailAddress;
    }


    /**
     * Gets the passwordExpirePeriod value for this Network.
     * 
     * @return passwordExpirePeriod
     */
    public long getPasswordExpirePeriod() {
        return passwordExpirePeriod;
    }


    /**
     * Sets the passwordExpirePeriod value for this Network.
     * 
     * @param passwordExpirePeriod
     */
    public void setPasswordExpirePeriod(long passwordExpirePeriod) {
        this.passwordExpirePeriod = passwordExpirePeriod;
    }


    /**
     * Gets the reportGenerationTimeZone value for this Network.
     * 
     * @return reportGenerationTimeZone
     */
    public long getReportGenerationTimeZone() {
        return reportGenerationTimeZone;
    }


    /**
     * Sets the reportGenerationTimeZone value for this Network.
     * 
     * @param reportGenerationTimeZone
     */
    public void setReportGenerationTimeZone(long reportGenerationTimeZone) {
        this.reportGenerationTimeZone = reportGenerationTimeZone;
    }


    /**
     * Gets the reportsConfiguration value for this Network.
     * 
     * @return reportsConfiguration
     */
    public com.google.api.ads.dfa.axis.v1_19.ReportsConfiguration getReportsConfiguration() {
        return reportsConfiguration;
    }


    /**
     * Sets the reportsConfiguration value for this Network.
     * 
     * @param reportsConfiguration
     */
    public void setReportsConfiguration(com.google.api.ads.dfa.axis.v1_19.ReportsConfiguration reportsConfiguration) {
        this.reportsConfiguration = reportsConfiguration;
    }


    /**
     * Gets the richmediaNetworkConfig value for this Network.
     * 
     * @return richmediaNetworkConfig
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaNetworkConfiguration getRichmediaNetworkConfig() {
        return richmediaNetworkConfig;
    }


    /**
     * Sets the richmediaNetworkConfig value for this Network.
     * 
     * @param richmediaNetworkConfig
     */
    public void setRichmediaNetworkConfig(com.google.api.ads.dfa.axis.v1_19.RichMediaNetworkConfiguration richmediaNetworkConfig) {
        this.richmediaNetworkConfig = richmediaNetworkConfig;
    }


    /**
     * Gets the totalActiveAds value for this Network.
     * 
     * @return totalActiveAds
     */
    public int getTotalActiveAds() {
        return totalActiveAds;
    }


    /**
     * Sets the totalActiveAds value for this Network.
     * 
     * @param totalActiveAds
     */
    public void setTotalActiveAds(int totalActiveAds) {
        this.totalActiveAds = totalActiveAds;
    }


    /**
     * Gets the widgetNetworkConfig value for this Network.
     * 
     * @return widgetNetworkConfig
     */
    public com.google.api.ads.dfa.axis.v1_19.WidgetNetworkConfig getWidgetNetworkConfig() {
        return widgetNetworkConfig;
    }


    /**
     * Sets the widgetNetworkConfig value for this Network.
     * 
     * @param widgetNetworkConfig
     */
    public void setWidgetNetworkConfig(com.google.api.ads.dfa.axis.v1_19.WidgetNetworkConfig widgetNetworkConfig) {
        this.widgetNetworkConfig = widgetNetworkConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Network)) return false;
        Network other = (Network) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              this.abbreviation.equals(other.getAbbreviation()))) &&
            this.active == other.isActive() &&
            this.activeAdsLimit == other.getActiveAdsLimit() &&
            this.availableAds == other.getAvailableAds() &&
            ((this.availablePermissions==null && other.getAvailablePermissions()==null) || 
             (this.availablePermissions!=null &&
              java.util.Arrays.equals(this.availablePermissions, other.getAvailablePermissions()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            this.currency == other.getCurrency() &&
            this.defaultCreativeSize == other.getDefaultCreativeSize() &&
            this.defaultEncoding == other.getDefaultEncoding() &&
            this.defaultLanguage == other.getDefaultLanguage() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.frequencyCapGroups==null && other.getFrequencyCapGroups()==null) || 
             (this.frequencyCapGroups!=null &&
              java.util.Arrays.equals(this.frequencyCapGroups, other.getFrequencyCapGroups()))) &&
            this.loginAttempts == other.getLoginAttempts() &&
            this.maximumImageSize == other.getMaximumImageSize() &&
            this.minimumPasswordLength == other.getMinimumPasswordLength() &&
            ((this.networkPermissions==null && other.getNetworkPermissions()==null) || 
             (this.networkPermissions!=null &&
              java.util.Arrays.equals(this.networkPermissions, other.getNetworkPermissions()))) &&
            ((this.notificationEmailAddress==null && other.getNotificationEmailAddress()==null) || 
             (this.notificationEmailAddress!=null &&
              this.notificationEmailAddress.equals(other.getNotificationEmailAddress()))) &&
            this.passwordExpirePeriod == other.getPasswordExpirePeriod() &&
            this.reportGenerationTimeZone == other.getReportGenerationTimeZone() &&
            ((this.reportsConfiguration==null && other.getReportsConfiguration()==null) || 
             (this.reportsConfiguration!=null &&
              this.reportsConfiguration.equals(other.getReportsConfiguration()))) &&
            ((this.richmediaNetworkConfig==null && other.getRichmediaNetworkConfig()==null) || 
             (this.richmediaNetworkConfig!=null &&
              this.richmediaNetworkConfig.equals(other.getRichmediaNetworkConfig()))) &&
            this.totalActiveAds == other.getTotalActiveAds() &&
            ((this.widgetNetworkConfig==null && other.getWidgetNetworkConfig()==null) || 
             (this.widgetNetworkConfig!=null &&
              this.widgetNetworkConfig.equals(other.getWidgetNetworkConfig())));
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
        if (getAbbreviation() != null) {
            _hashCode += getAbbreviation().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getActiveAdsLimit();
        _hashCode += getAvailableAds();
        if (getAvailablePermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailablePermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailablePermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += new Long(getCurrency()).hashCode();
        _hashCode += new Long(getDefaultCreativeSize()).hashCode();
        _hashCode += new Long(getDefaultEncoding()).hashCode();
        _hashCode += new Long(getDefaultLanguage()).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFrequencyCapGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequencyCapGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequencyCapGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getLoginAttempts();
        _hashCode += new Long(getMaximumImageSize()).hashCode();
        _hashCode += getMinimumPasswordLength();
        if (getNetworkPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotificationEmailAddress() != null) {
            _hashCode += getNotificationEmailAddress().hashCode();
        }
        _hashCode += new Long(getPasswordExpirePeriod()).hashCode();
        _hashCode += new Long(getReportGenerationTimeZone()).hashCode();
        if (getReportsConfiguration() != null) {
            _hashCode += getReportsConfiguration().hashCode();
        }
        if (getRichmediaNetworkConfig() != null) {
            _hashCode += getRichmediaNetworkConfig().hashCode();
        }
        _hashCode += getTotalActiveAds();
        if (getWidgetNetworkConfig() != null) {
            _hashCode += getWidgetNetworkConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Network.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Network"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeAdsLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeAdsLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableAds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availableAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availablePermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "availablePermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCreativeSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultCreativeSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEncoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultEncoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCapGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequencyCapGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "FrequencyCapGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumImageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumImageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumPasswordLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumPasswordLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordExpirePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordExpirePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportGenerationTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportGenerationTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportsConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportsConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ReportsConfiguration"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richmediaNetworkConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "richmediaNetworkConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaNetworkConfiguration"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalActiveAds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalActiveAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widgetNetworkConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "widgetNetworkConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "WidgetNetworkConfig"));
        elemField.setNillable(true);
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
