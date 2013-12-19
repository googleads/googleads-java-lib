/**
 * SpotlightConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class SpotlightConfiguration  extends com.google.api.ads.dfa.axis.v1_19.SpotlightConfigurationBase  implements java.io.Serializable {
    private int clickDays;

    private boolean crossSiteDuplicateReport;

    private com.google.api.ads.dfa.axis.v1_19.CustomSpotlightVariableConfiguration[] customSpotlightVariableConfigurations;

    private boolean dynamicSpotlightEnabled;

    private int exposureActivitiesCount;

    private int exposureDays;

    private int exposureLevel;

    private boolean exposureToConversionReport;

    private int firstDayOfWeek;

    private boolean frequencyConversionReport;

    private boolean googleAnalyticsIntegrationEnabled;

    private boolean imageTagsEnabled;

    private int impressionDays;

    private int motifEventsDays;

    private long naturalSearchConversionAttributionOption;

    private boolean omnitureCostDataEnabled;

    private boolean omnitureIntegrationEnabled;

    private long[] standardVariableIds;

    private boolean timeLagConversionReport;

    private int timeSlot;

    public SpotlightConfiguration() {
    }

    public SpotlightConfiguration(
           long id,
           java.lang.String name,
           int clickDays,
           boolean crossSiteDuplicateReport,
           com.google.api.ads.dfa.axis.v1_19.CustomSpotlightVariableConfiguration[] customSpotlightVariableConfigurations,
           boolean dynamicSpotlightEnabled,
           int exposureActivitiesCount,
           int exposureDays,
           int exposureLevel,
           boolean exposureToConversionReport,
           int firstDayOfWeek,
           boolean frequencyConversionReport,
           boolean googleAnalyticsIntegrationEnabled,
           boolean imageTagsEnabled,
           int impressionDays,
           int motifEventsDays,
           long naturalSearchConversionAttributionOption,
           boolean omnitureCostDataEnabled,
           boolean omnitureIntegrationEnabled,
           long[] standardVariableIds,
           boolean timeLagConversionReport,
           int timeSlot) {
        super(
            id,
            name);
        this.clickDays = clickDays;
        this.crossSiteDuplicateReport = crossSiteDuplicateReport;
        this.customSpotlightVariableConfigurations = customSpotlightVariableConfigurations;
        this.dynamicSpotlightEnabled = dynamicSpotlightEnabled;
        this.exposureActivitiesCount = exposureActivitiesCount;
        this.exposureDays = exposureDays;
        this.exposureLevel = exposureLevel;
        this.exposureToConversionReport = exposureToConversionReport;
        this.firstDayOfWeek = firstDayOfWeek;
        this.frequencyConversionReport = frequencyConversionReport;
        this.googleAnalyticsIntegrationEnabled = googleAnalyticsIntegrationEnabled;
        this.imageTagsEnabled = imageTagsEnabled;
        this.impressionDays = impressionDays;
        this.motifEventsDays = motifEventsDays;
        this.naturalSearchConversionAttributionOption = naturalSearchConversionAttributionOption;
        this.omnitureCostDataEnabled = omnitureCostDataEnabled;
        this.omnitureIntegrationEnabled = omnitureIntegrationEnabled;
        this.standardVariableIds = standardVariableIds;
        this.timeLagConversionReport = timeLagConversionReport;
        this.timeSlot = timeSlot;
    }


    /**
     * Gets the clickDays value for this SpotlightConfiguration.
     * 
     * @return clickDays
     */
    public int getClickDays() {
        return clickDays;
    }


    /**
     * Sets the clickDays value for this SpotlightConfiguration.
     * 
     * @param clickDays
     */
    public void setClickDays(int clickDays) {
        this.clickDays = clickDays;
    }


    /**
     * Gets the crossSiteDuplicateReport value for this SpotlightConfiguration.
     * 
     * @return crossSiteDuplicateReport
     */
    public boolean isCrossSiteDuplicateReport() {
        return crossSiteDuplicateReport;
    }


    /**
     * Sets the crossSiteDuplicateReport value for this SpotlightConfiguration.
     * 
     * @param crossSiteDuplicateReport
     */
    public void setCrossSiteDuplicateReport(boolean crossSiteDuplicateReport) {
        this.crossSiteDuplicateReport = crossSiteDuplicateReport;
    }


    /**
     * Gets the customSpotlightVariableConfigurations value for this SpotlightConfiguration.
     * 
     * @return customSpotlightVariableConfigurations
     */
    public com.google.api.ads.dfa.axis.v1_19.CustomSpotlightVariableConfiguration[] getCustomSpotlightVariableConfigurations() {
        return customSpotlightVariableConfigurations;
    }


    /**
     * Sets the customSpotlightVariableConfigurations value for this SpotlightConfiguration.
     * 
     * @param customSpotlightVariableConfigurations
     */
    public void setCustomSpotlightVariableConfigurations(com.google.api.ads.dfa.axis.v1_19.CustomSpotlightVariableConfiguration[] customSpotlightVariableConfigurations) {
        this.customSpotlightVariableConfigurations = customSpotlightVariableConfigurations;
    }


    /**
     * Gets the dynamicSpotlightEnabled value for this SpotlightConfiguration.
     * 
     * @return dynamicSpotlightEnabled
     */
    public boolean isDynamicSpotlightEnabled() {
        return dynamicSpotlightEnabled;
    }


    /**
     * Sets the dynamicSpotlightEnabled value for this SpotlightConfiguration.
     * 
     * @param dynamicSpotlightEnabled
     */
    public void setDynamicSpotlightEnabled(boolean dynamicSpotlightEnabled) {
        this.dynamicSpotlightEnabled = dynamicSpotlightEnabled;
    }


    /**
     * Gets the exposureActivitiesCount value for this SpotlightConfiguration.
     * 
     * @return exposureActivitiesCount
     */
    public int getExposureActivitiesCount() {
        return exposureActivitiesCount;
    }


    /**
     * Sets the exposureActivitiesCount value for this SpotlightConfiguration.
     * 
     * @param exposureActivitiesCount
     */
    public void setExposureActivitiesCount(int exposureActivitiesCount) {
        this.exposureActivitiesCount = exposureActivitiesCount;
    }


    /**
     * Gets the exposureDays value for this SpotlightConfiguration.
     * 
     * @return exposureDays
     */
    public int getExposureDays() {
        return exposureDays;
    }


    /**
     * Sets the exposureDays value for this SpotlightConfiguration.
     * 
     * @param exposureDays
     */
    public void setExposureDays(int exposureDays) {
        this.exposureDays = exposureDays;
    }


    /**
     * Gets the exposureLevel value for this SpotlightConfiguration.
     * 
     * @return exposureLevel
     */
    public int getExposureLevel() {
        return exposureLevel;
    }


    /**
     * Sets the exposureLevel value for this SpotlightConfiguration.
     * 
     * @param exposureLevel
     */
    public void setExposureLevel(int exposureLevel) {
        this.exposureLevel = exposureLevel;
    }


    /**
     * Gets the exposureToConversionReport value for this SpotlightConfiguration.
     * 
     * @return exposureToConversionReport
     */
    public boolean isExposureToConversionReport() {
        return exposureToConversionReport;
    }


    /**
     * Sets the exposureToConversionReport value for this SpotlightConfiguration.
     * 
     * @param exposureToConversionReport
     */
    public void setExposureToConversionReport(boolean exposureToConversionReport) {
        this.exposureToConversionReport = exposureToConversionReport;
    }


    /**
     * Gets the firstDayOfWeek value for this SpotlightConfiguration.
     * 
     * @return firstDayOfWeek
     */
    public int getFirstDayOfWeek() {
        return firstDayOfWeek;
    }


    /**
     * Sets the firstDayOfWeek value for this SpotlightConfiguration.
     * 
     * @param firstDayOfWeek
     */
    public void setFirstDayOfWeek(int firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }


    /**
     * Gets the frequencyConversionReport value for this SpotlightConfiguration.
     * 
     * @return frequencyConversionReport
     */
    public boolean isFrequencyConversionReport() {
        return frequencyConversionReport;
    }


    /**
     * Sets the frequencyConversionReport value for this SpotlightConfiguration.
     * 
     * @param frequencyConversionReport
     */
    public void setFrequencyConversionReport(boolean frequencyConversionReport) {
        this.frequencyConversionReport = frequencyConversionReport;
    }


    /**
     * Gets the googleAnalyticsIntegrationEnabled value for this SpotlightConfiguration.
     * 
     * @return googleAnalyticsIntegrationEnabled
     */
    public boolean isGoogleAnalyticsIntegrationEnabled() {
        return googleAnalyticsIntegrationEnabled;
    }


    /**
     * Sets the googleAnalyticsIntegrationEnabled value for this SpotlightConfiguration.
     * 
     * @param googleAnalyticsIntegrationEnabled
     */
    public void setGoogleAnalyticsIntegrationEnabled(boolean googleAnalyticsIntegrationEnabled) {
        this.googleAnalyticsIntegrationEnabled = googleAnalyticsIntegrationEnabled;
    }


    /**
     * Gets the imageTagsEnabled value for this SpotlightConfiguration.
     * 
     * @return imageTagsEnabled
     */
    public boolean isImageTagsEnabled() {
        return imageTagsEnabled;
    }


    /**
     * Sets the imageTagsEnabled value for this SpotlightConfiguration.
     * 
     * @param imageTagsEnabled
     */
    public void setImageTagsEnabled(boolean imageTagsEnabled) {
        this.imageTagsEnabled = imageTagsEnabled;
    }


    /**
     * Gets the impressionDays value for this SpotlightConfiguration.
     * 
     * @return impressionDays
     */
    public int getImpressionDays() {
        return impressionDays;
    }


    /**
     * Sets the impressionDays value for this SpotlightConfiguration.
     * 
     * @param impressionDays
     */
    public void setImpressionDays(int impressionDays) {
        this.impressionDays = impressionDays;
    }


    /**
     * Gets the motifEventsDays value for this SpotlightConfiguration.
     * 
     * @return motifEventsDays
     */
    public int getMotifEventsDays() {
        return motifEventsDays;
    }


    /**
     * Sets the motifEventsDays value for this SpotlightConfiguration.
     * 
     * @param motifEventsDays
     */
    public void setMotifEventsDays(int motifEventsDays) {
        this.motifEventsDays = motifEventsDays;
    }


    /**
     * Gets the naturalSearchConversionAttributionOption value for this SpotlightConfiguration.
     * 
     * @return naturalSearchConversionAttributionOption
     */
    public long getNaturalSearchConversionAttributionOption() {
        return naturalSearchConversionAttributionOption;
    }


    /**
     * Sets the naturalSearchConversionAttributionOption value for this SpotlightConfiguration.
     * 
     * @param naturalSearchConversionAttributionOption
     */
    public void setNaturalSearchConversionAttributionOption(long naturalSearchConversionAttributionOption) {
        this.naturalSearchConversionAttributionOption = naturalSearchConversionAttributionOption;
    }


    /**
     * Gets the omnitureCostDataEnabled value for this SpotlightConfiguration.
     * 
     * @return omnitureCostDataEnabled
     */
    public boolean isOmnitureCostDataEnabled() {
        return omnitureCostDataEnabled;
    }


    /**
     * Sets the omnitureCostDataEnabled value for this SpotlightConfiguration.
     * 
     * @param omnitureCostDataEnabled
     */
    public void setOmnitureCostDataEnabled(boolean omnitureCostDataEnabled) {
        this.omnitureCostDataEnabled = omnitureCostDataEnabled;
    }


    /**
     * Gets the omnitureIntegrationEnabled value for this SpotlightConfiguration.
     * 
     * @return omnitureIntegrationEnabled
     */
    public boolean isOmnitureIntegrationEnabled() {
        return omnitureIntegrationEnabled;
    }


    /**
     * Sets the omnitureIntegrationEnabled value for this SpotlightConfiguration.
     * 
     * @param omnitureIntegrationEnabled
     */
    public void setOmnitureIntegrationEnabled(boolean omnitureIntegrationEnabled) {
        this.omnitureIntegrationEnabled = omnitureIntegrationEnabled;
    }


    /**
     * Gets the standardVariableIds value for this SpotlightConfiguration.
     * 
     * @return standardVariableIds
     */
    public long[] getStandardVariableIds() {
        return standardVariableIds;
    }


    /**
     * Sets the standardVariableIds value for this SpotlightConfiguration.
     * 
     * @param standardVariableIds
     */
    public void setStandardVariableIds(long[] standardVariableIds) {
        this.standardVariableIds = standardVariableIds;
    }


    /**
     * Gets the timeLagConversionReport value for this SpotlightConfiguration.
     * 
     * @return timeLagConversionReport
     */
    public boolean isTimeLagConversionReport() {
        return timeLagConversionReport;
    }


    /**
     * Sets the timeLagConversionReport value for this SpotlightConfiguration.
     * 
     * @param timeLagConversionReport
     */
    public void setTimeLagConversionReport(boolean timeLagConversionReport) {
        this.timeLagConversionReport = timeLagConversionReport;
    }


    /**
     * Gets the timeSlot value for this SpotlightConfiguration.
     * 
     * @return timeSlot
     */
    public int getTimeSlot() {
        return timeSlot;
    }


    /**
     * Sets the timeSlot value for this SpotlightConfiguration.
     * 
     * @param timeSlot
     */
    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpotlightConfiguration)) return false;
        SpotlightConfiguration other = (SpotlightConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.clickDays == other.getClickDays() &&
            this.crossSiteDuplicateReport == other.isCrossSiteDuplicateReport() &&
            ((this.customSpotlightVariableConfigurations==null && other.getCustomSpotlightVariableConfigurations()==null) || 
             (this.customSpotlightVariableConfigurations!=null &&
              java.util.Arrays.equals(this.customSpotlightVariableConfigurations, other.getCustomSpotlightVariableConfigurations()))) &&
            this.dynamicSpotlightEnabled == other.isDynamicSpotlightEnabled() &&
            this.exposureActivitiesCount == other.getExposureActivitiesCount() &&
            this.exposureDays == other.getExposureDays() &&
            this.exposureLevel == other.getExposureLevel() &&
            this.exposureToConversionReport == other.isExposureToConversionReport() &&
            this.firstDayOfWeek == other.getFirstDayOfWeek() &&
            this.frequencyConversionReport == other.isFrequencyConversionReport() &&
            this.googleAnalyticsIntegrationEnabled == other.isGoogleAnalyticsIntegrationEnabled() &&
            this.imageTagsEnabled == other.isImageTagsEnabled() &&
            this.impressionDays == other.getImpressionDays() &&
            this.motifEventsDays == other.getMotifEventsDays() &&
            this.naturalSearchConversionAttributionOption == other.getNaturalSearchConversionAttributionOption() &&
            this.omnitureCostDataEnabled == other.isOmnitureCostDataEnabled() &&
            this.omnitureIntegrationEnabled == other.isOmnitureIntegrationEnabled() &&
            ((this.standardVariableIds==null && other.getStandardVariableIds()==null) || 
             (this.standardVariableIds!=null &&
              java.util.Arrays.equals(this.standardVariableIds, other.getStandardVariableIds()))) &&
            this.timeLagConversionReport == other.isTimeLagConversionReport() &&
            this.timeSlot == other.getTimeSlot();
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
        _hashCode += getClickDays();
        _hashCode += (isCrossSiteDuplicateReport() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCustomSpotlightVariableConfigurations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSpotlightVariableConfigurations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSpotlightVariableConfigurations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isDynamicSpotlightEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getExposureActivitiesCount();
        _hashCode += getExposureDays();
        _hashCode += getExposureLevel();
        _hashCode += (isExposureToConversionReport() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getFirstDayOfWeek();
        _hashCode += (isFrequencyConversionReport() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGoogleAnalyticsIntegrationEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isImageTagsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getImpressionDays();
        _hashCode += getMotifEventsDays();
        _hashCode += new Long(getNaturalSearchConversionAttributionOption()).hashCode();
        _hashCode += (isOmnitureCostDataEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOmnitureIntegrationEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStandardVariableIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStandardVariableIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStandardVariableIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isTimeLagConversionReport() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getTimeSlot();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpotlightConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SpotlightConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossSiteDuplicateReport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crossSiteDuplicateReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSpotlightVariableConfigurations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customSpotlightVariableConfigurations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CustomSpotlightVariableConfiguration"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicSpotlightEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicSpotlightEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposureActivitiesCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposureActivitiesCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposureDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposureDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposureLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposureLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposureToConversionReport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposureToConversionReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyConversionReport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequencyConversionReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("googleAnalyticsIntegrationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "googleAnalyticsIntegrationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageTagsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageTagsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "impressionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motifEventsDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motifEventsDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturalSearchConversionAttributionOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "naturalSearchConversionAttributionOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omnitureCostDataEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "omnitureCostDataEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("omnitureIntegrationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "omnitureIntegrationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardVariableIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standardVariableIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLagConversionReport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeLagConversionReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSlot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeSlot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
