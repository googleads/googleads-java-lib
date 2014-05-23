/**
 * SegmentKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents one value in a dimension for a segmented entity (e.g.
 * one country in the dimension
 *             Geo for a campaign segmented by Geo).
 */
public class SegmentKey  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201402.video.CampaignKey campaignKey;

    private com.google.api.ads.adwords.axis.v201402.video.ConversionTypeKey conversionTypeKey;

    private com.google.api.ads.adwords.axis.v201402.video.DateKey dateKey;

    private com.google.api.ads.adwords.axis.v201402.video.DayOfWeekKey dayOfWeekKey;

    private com.google.api.ads.adwords.axis.v201402.video.DeviceKey deviceKey;

    private com.google.api.ads.adwords.axis.v201402.video.DisplayFormatKey displayFormatKey;

    private com.google.api.ads.adwords.axis.v201402.video.DisplayFormatNetworkKey displayFormatNetworkKey;

    private com.google.api.ads.adwords.axis.v201402.video.DisplayFormatTypeKey displayFormatTypeKey;

    private com.google.api.ads.adwords.axis.v201402.video.HourOfDayKey hourOfDayKey;

    private com.google.api.ads.adwords.axis.v201402.video.NetworkKey networkKey;

    private com.google.api.ads.adwords.axis.v201402.video.PaidViewsKey paidViewsKey;

    private com.google.api.ads.adwords.axis.v201402.video.TargetingGroupKey targetingGroupKey;

    private com.google.api.ads.adwords.axis.v201402.video.VideoAdKey videoAdKey;

    public SegmentKey() {
    }

    public SegmentKey(
           com.google.api.ads.adwords.axis.v201402.video.CampaignKey campaignKey,
           com.google.api.ads.adwords.axis.v201402.video.ConversionTypeKey conversionTypeKey,
           com.google.api.ads.adwords.axis.v201402.video.DateKey dateKey,
           com.google.api.ads.adwords.axis.v201402.video.DayOfWeekKey dayOfWeekKey,
           com.google.api.ads.adwords.axis.v201402.video.DeviceKey deviceKey,
           com.google.api.ads.adwords.axis.v201402.video.DisplayFormatKey displayFormatKey,
           com.google.api.ads.adwords.axis.v201402.video.DisplayFormatNetworkKey displayFormatNetworkKey,
           com.google.api.ads.adwords.axis.v201402.video.DisplayFormatTypeKey displayFormatTypeKey,
           com.google.api.ads.adwords.axis.v201402.video.HourOfDayKey hourOfDayKey,
           com.google.api.ads.adwords.axis.v201402.video.NetworkKey networkKey,
           com.google.api.ads.adwords.axis.v201402.video.PaidViewsKey paidViewsKey,
           com.google.api.ads.adwords.axis.v201402.video.TargetingGroupKey targetingGroupKey,
           com.google.api.ads.adwords.axis.v201402.video.VideoAdKey videoAdKey) {
           this.campaignKey = campaignKey;
           this.conversionTypeKey = conversionTypeKey;
           this.dateKey = dateKey;
           this.dayOfWeekKey = dayOfWeekKey;
           this.deviceKey = deviceKey;
           this.displayFormatKey = displayFormatKey;
           this.displayFormatNetworkKey = displayFormatNetworkKey;
           this.displayFormatTypeKey = displayFormatTypeKey;
           this.hourOfDayKey = hourOfDayKey;
           this.networkKey = networkKey;
           this.paidViewsKey = paidViewsKey;
           this.targetingGroupKey = targetingGroupKey;
           this.videoAdKey = videoAdKey;
    }


    /**
     * Gets the campaignKey value for this SegmentKey.
     * 
     * @return campaignKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.CampaignKey getCampaignKey() {
        return campaignKey;
    }


    /**
     * Sets the campaignKey value for this SegmentKey.
     * 
     * @param campaignKey
     */
    public void setCampaignKey(com.google.api.ads.adwords.axis.v201402.video.CampaignKey campaignKey) {
        this.campaignKey = campaignKey;
    }


    /**
     * Gets the conversionTypeKey value for this SegmentKey.
     * 
     * @return conversionTypeKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.ConversionTypeKey getConversionTypeKey() {
        return conversionTypeKey;
    }


    /**
     * Sets the conversionTypeKey value for this SegmentKey.
     * 
     * @param conversionTypeKey
     */
    public void setConversionTypeKey(com.google.api.ads.adwords.axis.v201402.video.ConversionTypeKey conversionTypeKey) {
        this.conversionTypeKey = conversionTypeKey;
    }


    /**
     * Gets the dateKey value for this SegmentKey.
     * 
     * @return dateKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.DateKey getDateKey() {
        return dateKey;
    }


    /**
     * Sets the dateKey value for this SegmentKey.
     * 
     * @param dateKey
     */
    public void setDateKey(com.google.api.ads.adwords.axis.v201402.video.DateKey dateKey) {
        this.dateKey = dateKey;
    }


    /**
     * Gets the dayOfWeekKey value for this SegmentKey.
     * 
     * @return dayOfWeekKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.DayOfWeekKey getDayOfWeekKey() {
        return dayOfWeekKey;
    }


    /**
     * Sets the dayOfWeekKey value for this SegmentKey.
     * 
     * @param dayOfWeekKey
     */
    public void setDayOfWeekKey(com.google.api.ads.adwords.axis.v201402.video.DayOfWeekKey dayOfWeekKey) {
        this.dayOfWeekKey = dayOfWeekKey;
    }


    /**
     * Gets the deviceKey value for this SegmentKey.
     * 
     * @return deviceKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.DeviceKey getDeviceKey() {
        return deviceKey;
    }


    /**
     * Sets the deviceKey value for this SegmentKey.
     * 
     * @param deviceKey
     */
    public void setDeviceKey(com.google.api.ads.adwords.axis.v201402.video.DeviceKey deviceKey) {
        this.deviceKey = deviceKey;
    }


    /**
     * Gets the displayFormatKey value for this SegmentKey.
     * 
     * @return displayFormatKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.DisplayFormatKey getDisplayFormatKey() {
        return displayFormatKey;
    }


    /**
     * Sets the displayFormatKey value for this SegmentKey.
     * 
     * @param displayFormatKey
     */
    public void setDisplayFormatKey(com.google.api.ads.adwords.axis.v201402.video.DisplayFormatKey displayFormatKey) {
        this.displayFormatKey = displayFormatKey;
    }


    /**
     * Gets the displayFormatNetworkKey value for this SegmentKey.
     * 
     * @return displayFormatNetworkKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.DisplayFormatNetworkKey getDisplayFormatNetworkKey() {
        return displayFormatNetworkKey;
    }


    /**
     * Sets the displayFormatNetworkKey value for this SegmentKey.
     * 
     * @param displayFormatNetworkKey
     */
    public void setDisplayFormatNetworkKey(com.google.api.ads.adwords.axis.v201402.video.DisplayFormatNetworkKey displayFormatNetworkKey) {
        this.displayFormatNetworkKey = displayFormatNetworkKey;
    }


    /**
     * Gets the displayFormatTypeKey value for this SegmentKey.
     * 
     * @return displayFormatTypeKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.DisplayFormatTypeKey getDisplayFormatTypeKey() {
        return displayFormatTypeKey;
    }


    /**
     * Sets the displayFormatTypeKey value for this SegmentKey.
     * 
     * @param displayFormatTypeKey
     */
    public void setDisplayFormatTypeKey(com.google.api.ads.adwords.axis.v201402.video.DisplayFormatTypeKey displayFormatTypeKey) {
        this.displayFormatTypeKey = displayFormatTypeKey;
    }


    /**
     * Gets the hourOfDayKey value for this SegmentKey.
     * 
     * @return hourOfDayKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.HourOfDayKey getHourOfDayKey() {
        return hourOfDayKey;
    }


    /**
     * Sets the hourOfDayKey value for this SegmentKey.
     * 
     * @param hourOfDayKey
     */
    public void setHourOfDayKey(com.google.api.ads.adwords.axis.v201402.video.HourOfDayKey hourOfDayKey) {
        this.hourOfDayKey = hourOfDayKey;
    }


    /**
     * Gets the networkKey value for this SegmentKey.
     * 
     * @return networkKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.NetworkKey getNetworkKey() {
        return networkKey;
    }


    /**
     * Sets the networkKey value for this SegmentKey.
     * 
     * @param networkKey
     */
    public void setNetworkKey(com.google.api.ads.adwords.axis.v201402.video.NetworkKey networkKey) {
        this.networkKey = networkKey;
    }


    /**
     * Gets the paidViewsKey value for this SegmentKey.
     * 
     * @return paidViewsKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.PaidViewsKey getPaidViewsKey() {
        return paidViewsKey;
    }


    /**
     * Sets the paidViewsKey value for this SegmentKey.
     * 
     * @param paidViewsKey
     */
    public void setPaidViewsKey(com.google.api.ads.adwords.axis.v201402.video.PaidViewsKey paidViewsKey) {
        this.paidViewsKey = paidViewsKey;
    }


    /**
     * Gets the targetingGroupKey value for this SegmentKey.
     * 
     * @return targetingGroupKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.TargetingGroupKey getTargetingGroupKey() {
        return targetingGroupKey;
    }


    /**
     * Sets the targetingGroupKey value for this SegmentKey.
     * 
     * @param targetingGroupKey
     */
    public void setTargetingGroupKey(com.google.api.ads.adwords.axis.v201402.video.TargetingGroupKey targetingGroupKey) {
        this.targetingGroupKey = targetingGroupKey;
    }


    /**
     * Gets the videoAdKey value for this SegmentKey.
     * 
     * @return videoAdKey
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoAdKey getVideoAdKey() {
        return videoAdKey;
    }


    /**
     * Sets the videoAdKey value for this SegmentKey.
     * 
     * @param videoAdKey
     */
    public void setVideoAdKey(com.google.api.ads.adwords.axis.v201402.video.VideoAdKey videoAdKey) {
        this.videoAdKey = videoAdKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SegmentKey)) return false;
        SegmentKey other = (SegmentKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignKey==null && other.getCampaignKey()==null) || 
             (this.campaignKey!=null &&
              this.campaignKey.equals(other.getCampaignKey()))) &&
            ((this.conversionTypeKey==null && other.getConversionTypeKey()==null) || 
             (this.conversionTypeKey!=null &&
              this.conversionTypeKey.equals(other.getConversionTypeKey()))) &&
            ((this.dateKey==null && other.getDateKey()==null) || 
             (this.dateKey!=null &&
              this.dateKey.equals(other.getDateKey()))) &&
            ((this.dayOfWeekKey==null && other.getDayOfWeekKey()==null) || 
             (this.dayOfWeekKey!=null &&
              this.dayOfWeekKey.equals(other.getDayOfWeekKey()))) &&
            ((this.deviceKey==null && other.getDeviceKey()==null) || 
             (this.deviceKey!=null &&
              this.deviceKey.equals(other.getDeviceKey()))) &&
            ((this.displayFormatKey==null && other.getDisplayFormatKey()==null) || 
             (this.displayFormatKey!=null &&
              this.displayFormatKey.equals(other.getDisplayFormatKey()))) &&
            ((this.displayFormatNetworkKey==null && other.getDisplayFormatNetworkKey()==null) || 
             (this.displayFormatNetworkKey!=null &&
              this.displayFormatNetworkKey.equals(other.getDisplayFormatNetworkKey()))) &&
            ((this.displayFormatTypeKey==null && other.getDisplayFormatTypeKey()==null) || 
             (this.displayFormatTypeKey!=null &&
              this.displayFormatTypeKey.equals(other.getDisplayFormatTypeKey()))) &&
            ((this.hourOfDayKey==null && other.getHourOfDayKey()==null) || 
             (this.hourOfDayKey!=null &&
              this.hourOfDayKey.equals(other.getHourOfDayKey()))) &&
            ((this.networkKey==null && other.getNetworkKey()==null) || 
             (this.networkKey!=null &&
              this.networkKey.equals(other.getNetworkKey()))) &&
            ((this.paidViewsKey==null && other.getPaidViewsKey()==null) || 
             (this.paidViewsKey!=null &&
              this.paidViewsKey.equals(other.getPaidViewsKey()))) &&
            ((this.targetingGroupKey==null && other.getTargetingGroupKey()==null) || 
             (this.targetingGroupKey!=null &&
              this.targetingGroupKey.equals(other.getTargetingGroupKey()))) &&
            ((this.videoAdKey==null && other.getVideoAdKey()==null) || 
             (this.videoAdKey!=null &&
              this.videoAdKey.equals(other.getVideoAdKey())));
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
        if (getCampaignKey() != null) {
            _hashCode += getCampaignKey().hashCode();
        }
        if (getConversionTypeKey() != null) {
            _hashCode += getConversionTypeKey().hashCode();
        }
        if (getDateKey() != null) {
            _hashCode += getDateKey().hashCode();
        }
        if (getDayOfWeekKey() != null) {
            _hashCode += getDayOfWeekKey().hashCode();
        }
        if (getDeviceKey() != null) {
            _hashCode += getDeviceKey().hashCode();
        }
        if (getDisplayFormatKey() != null) {
            _hashCode += getDisplayFormatKey().hashCode();
        }
        if (getDisplayFormatNetworkKey() != null) {
            _hashCode += getDisplayFormatNetworkKey().hashCode();
        }
        if (getDisplayFormatTypeKey() != null) {
            _hashCode += getDisplayFormatTypeKey().hashCode();
        }
        if (getHourOfDayKey() != null) {
            _hashCode += getHourOfDayKey().hashCode();
        }
        if (getNetworkKey() != null) {
            _hashCode += getNetworkKey().hashCode();
        }
        if (getPaidViewsKey() != null) {
            _hashCode += getPaidViewsKey().hashCode();
        }
        if (getTargetingGroupKey() != null) {
            _hashCode += getTargetingGroupKey().hashCode();
        }
        if (getVideoAdKey() != null) {
            _hashCode += getVideoAdKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SegmentKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "SegmentKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "CampaignKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "CampaignKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTypeKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ConversionTypeKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ConversionTypeKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DateKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DateKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeekKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DayOfWeekKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DayOfWeekKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DeviceKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DeviceKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFormatKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisplayFormatKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisplayFormatKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFormatNetworkKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisplayFormatNetworkKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisplayFormatNetworkKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFormatTypeKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisplayFormatTypeKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisplayFormatTypeKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourOfDayKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "HourOfDayKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "HourOfDayKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "NetworkKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "NetworkKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidViewsKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "PaidViewsKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "PaidViewsKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoAdKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoAdKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoAdKey"));
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
