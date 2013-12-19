/**
 * MobileAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class MobileAd  extends com.google.api.ads.dfa.axis.v1_19.AdBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria countryTargetingCriteria;

    private com.google.api.ads.dfa.axis.v1_19.CreativeAssignment[] creativeAssignments;

    private int[] daysOfWeek;

    private int deliveryLimit;

    private boolean deliveryLimitEnabled;

    private boolean hardCutOff;

    private int[] hoursOfDay;

    private java.lang.String keywordExpression;

    private com.google.api.ads.dfa.axis.v1_19.MobilePlatform[] mobilePlatforms;

    private int priority;

    private int ratio;

    private boolean userLocalTime;

    public MobileAd() {
    }

    public MobileAd(
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
           com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria countryTargetingCriteria,
           com.google.api.ads.dfa.axis.v1_19.CreativeAssignment[] creativeAssignments,
           int[] daysOfWeek,
           int deliveryLimit,
           boolean deliveryLimitEnabled,
           boolean hardCutOff,
           int[] hoursOfDay,
           java.lang.String keywordExpression,
           com.google.api.ads.dfa.axis.v1_19.MobilePlatform[] mobilePlatforms,
           int priority,
           int ratio,
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
        this.countryTargetingCriteria = countryTargetingCriteria;
        this.creativeAssignments = creativeAssignments;
        this.daysOfWeek = daysOfWeek;
        this.deliveryLimit = deliveryLimit;
        this.deliveryLimitEnabled = deliveryLimitEnabled;
        this.hardCutOff = hardCutOff;
        this.hoursOfDay = hoursOfDay;
        this.keywordExpression = keywordExpression;
        this.mobilePlatforms = mobilePlatforms;
        this.priority = priority;
        this.ratio = ratio;
        this.userLocalTime = userLocalTime;
    }


    /**
     * Gets the countryTargetingCriteria value for this MobileAd.
     * 
     * @return countryTargetingCriteria
     */
    public com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria getCountryTargetingCriteria() {
        return countryTargetingCriteria;
    }


    /**
     * Sets the countryTargetingCriteria value for this MobileAd.
     * 
     * @param countryTargetingCriteria
     */
    public void setCountryTargetingCriteria(com.google.api.ads.dfa.axis.v1_19.CountryTargetingCriteria countryTargetingCriteria) {
        this.countryTargetingCriteria = countryTargetingCriteria;
    }


    /**
     * Gets the creativeAssignments value for this MobileAd.
     * 
     * @return creativeAssignments
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeAssignment[] getCreativeAssignments() {
        return creativeAssignments;
    }


    /**
     * Sets the creativeAssignments value for this MobileAd.
     * 
     * @param creativeAssignments
     */
    public void setCreativeAssignments(com.google.api.ads.dfa.axis.v1_19.CreativeAssignment[] creativeAssignments) {
        this.creativeAssignments = creativeAssignments;
    }


    /**
     * Gets the daysOfWeek value for this MobileAd.
     * 
     * @return daysOfWeek
     */
    public int[] getDaysOfWeek() {
        return daysOfWeek;
    }


    /**
     * Sets the daysOfWeek value for this MobileAd.
     * 
     * @param daysOfWeek
     */
    public void setDaysOfWeek(int[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }


    /**
     * Gets the deliveryLimit value for this MobileAd.
     * 
     * @return deliveryLimit
     */
    public int getDeliveryLimit() {
        return deliveryLimit;
    }


    /**
     * Sets the deliveryLimit value for this MobileAd.
     * 
     * @param deliveryLimit
     */
    public void setDeliveryLimit(int deliveryLimit) {
        this.deliveryLimit = deliveryLimit;
    }


    /**
     * Gets the deliveryLimitEnabled value for this MobileAd.
     * 
     * @return deliveryLimitEnabled
     */
    public boolean isDeliveryLimitEnabled() {
        return deliveryLimitEnabled;
    }


    /**
     * Sets the deliveryLimitEnabled value for this MobileAd.
     * 
     * @param deliveryLimitEnabled
     */
    public void setDeliveryLimitEnabled(boolean deliveryLimitEnabled) {
        this.deliveryLimitEnabled = deliveryLimitEnabled;
    }


    /**
     * Gets the hardCutOff value for this MobileAd.
     * 
     * @return hardCutOff
     */
    public boolean isHardCutOff() {
        return hardCutOff;
    }


    /**
     * Sets the hardCutOff value for this MobileAd.
     * 
     * @param hardCutOff
     */
    public void setHardCutOff(boolean hardCutOff) {
        this.hardCutOff = hardCutOff;
    }


    /**
     * Gets the hoursOfDay value for this MobileAd.
     * 
     * @return hoursOfDay
     */
    public int[] getHoursOfDay() {
        return hoursOfDay;
    }


    /**
     * Sets the hoursOfDay value for this MobileAd.
     * 
     * @param hoursOfDay
     */
    public void setHoursOfDay(int[] hoursOfDay) {
        this.hoursOfDay = hoursOfDay;
    }


    /**
     * Gets the keywordExpression value for this MobileAd.
     * 
     * @return keywordExpression
     */
    public java.lang.String getKeywordExpression() {
        return keywordExpression;
    }


    /**
     * Sets the keywordExpression value for this MobileAd.
     * 
     * @param keywordExpression
     */
    public void setKeywordExpression(java.lang.String keywordExpression) {
        this.keywordExpression = keywordExpression;
    }


    /**
     * Gets the mobilePlatforms value for this MobileAd.
     * 
     * @return mobilePlatforms
     */
    public com.google.api.ads.dfa.axis.v1_19.MobilePlatform[] getMobilePlatforms() {
        return mobilePlatforms;
    }


    /**
     * Sets the mobilePlatforms value for this MobileAd.
     * 
     * @param mobilePlatforms
     */
    public void setMobilePlatforms(com.google.api.ads.dfa.axis.v1_19.MobilePlatform[] mobilePlatforms) {
        this.mobilePlatforms = mobilePlatforms;
    }


    /**
     * Gets the priority value for this MobileAd.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this MobileAd.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the ratio value for this MobileAd.
     * 
     * @return ratio
     */
    public int getRatio() {
        return ratio;
    }


    /**
     * Sets the ratio value for this MobileAd.
     * 
     * @param ratio
     */
    public void setRatio(int ratio) {
        this.ratio = ratio;
    }


    /**
     * Gets the userLocalTime value for this MobileAd.
     * 
     * @return userLocalTime
     */
    public boolean isUserLocalTime() {
        return userLocalTime;
    }


    /**
     * Sets the userLocalTime value for this MobileAd.
     * 
     * @param userLocalTime
     */
    public void setUserLocalTime(boolean userLocalTime) {
        this.userLocalTime = userLocalTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileAd)) return false;
        MobileAd other = (MobileAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countryTargetingCriteria==null && other.getCountryTargetingCriteria()==null) || 
             (this.countryTargetingCriteria!=null &&
              this.countryTargetingCriteria.equals(other.getCountryTargetingCriteria()))) &&
            ((this.creativeAssignments==null && other.getCreativeAssignments()==null) || 
             (this.creativeAssignments!=null &&
              java.util.Arrays.equals(this.creativeAssignments, other.getCreativeAssignments()))) &&
            ((this.daysOfWeek==null && other.getDaysOfWeek()==null) || 
             (this.daysOfWeek!=null &&
              java.util.Arrays.equals(this.daysOfWeek, other.getDaysOfWeek()))) &&
            this.deliveryLimit == other.getDeliveryLimit() &&
            this.deliveryLimitEnabled == other.isDeliveryLimitEnabled() &&
            this.hardCutOff == other.isHardCutOff() &&
            ((this.hoursOfDay==null && other.getHoursOfDay()==null) || 
             (this.hoursOfDay!=null &&
              java.util.Arrays.equals(this.hoursOfDay, other.getHoursOfDay()))) &&
            ((this.keywordExpression==null && other.getKeywordExpression()==null) || 
             (this.keywordExpression!=null &&
              this.keywordExpression.equals(other.getKeywordExpression()))) &&
            ((this.mobilePlatforms==null && other.getMobilePlatforms()==null) || 
             (this.mobilePlatforms!=null &&
              java.util.Arrays.equals(this.mobilePlatforms, other.getMobilePlatforms()))) &&
            this.priority == other.getPriority() &&
            this.ratio == other.getRatio() &&
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
        if (getCountryTargetingCriteria() != null) {
            _hashCode += getCountryTargetingCriteria().hashCode();
        }
        if (getCreativeAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getMobilePlatforms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobilePlatforms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobilePlatforms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPriority();
        _hashCode += getRatio();
        _hashCode += (isUserLocalTime() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "MobileAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryTargetingCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryTargetingCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CountryTargetingCriteria"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeAssignment"));
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
        elemField.setFieldName("mobilePlatforms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobilePlatforms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "MobilePlatform"));
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
