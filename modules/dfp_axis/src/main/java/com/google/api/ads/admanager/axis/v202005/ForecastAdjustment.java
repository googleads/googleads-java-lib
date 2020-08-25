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
 * ForecastAdjustment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;


/**
 * Provides information about the expected volume and composition
 * of traffic over a date range for a
 *             traffic forecast segment.
 */
public class ForecastAdjustment  implements java.io.Serializable {
    /* The unique ID of the ForecastAdjustment. This field is read-only.
     * This attribute is read-only. */
    private java.lang.Long id;

    /* The ID of the parent TrafficForecastSegment. This field is
     * required and immutable after
     *                 creation.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.Long trafficForecastSegmentId;

    /* Name of the ForecastAdjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.String name;

    /* The start and end date range of the adjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private com.google.api.ads.admanager.axis.v202005.DateRange dateRange;

    /* The status of the adjustment. Changes to this field should
     * be made via {@code
     *                 performForecastAdjustmentAction}
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentStatus status;

    /* The volume type of the adjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentVolumeType volumeType;

    /* Whether to allow provided volume settings to increase the current
     * forecast by more than 300%.
     *                 Due to system constraints, adjusting the forecast
     * by more than 300% may have unintended
     *                 consequences for other parts of the forecast.
     *                 
     *                 <p>Note that this field will not persist on the adjustment
     * itself, and will only affect the
     *                 current request. */
    private java.lang.Boolean allowAdjustingForecastAboveRecommendedLimit;

    /* The daily number of ad opportunities for each day in the adjustment
     * date range. This field is
     *                 required if {@code volumeType} is {@code ForecastAdjustmentVolumeType#DAILY_VOLUME}
     * and ignored
     *                 othewise. */
    private com.google.api.ads.admanager.axis.v202005.DailyVolumeSettings dailyVolumeSettings;

    /* The total number of ad opportunities for the entire adjustment
     * date range. This field is
     *                 required if {@code volumeType} is {@code ForecastAdjustmentVolumeType#TOTAL_VOLUME}
     * and ignored
     *                 othewise. */
    private com.google.api.ads.admanager.axis.v202005.TotalVolumeSettings totalVolumeSettings;

    /* The daily number of ad opportunities for each day in the adjustment
     * date range, determined by
     *                 reference to the ad opportunity volume of a historical
     * reference period. This field is required
     *                 if {@code volumeType} is {@code ForecastAdjustmentVolumeType#HISTORICAL_BASIS_VOLUME}
     * and
     *                 ignored othewise. */
    private com.google.api.ads.admanager.axis.v202005.HistoricalBasisVolumeSettings historicalBasisVolumeSettings;

    /* The daily number of ad opportunities calculated to satisfy
     * the provided volume settings. Each
     *                 value in this list represents the calculated ad opportunities
     * on the corresponding day of the
     *                 adjustment date range. For example: for a {@code dateRange}
     * of 2001-8-15 to 2001-8-17, this
     *                 field will contain one value for 2001-8-15, one value
     * for 2001-8-16, and one value for
     *                 2001-8-17.
     *                 
     *                 <p>This field is read-only and is populated by Google
     * after forecast adjustment creation or
     *                 update.
     *                 This attribute is read-only. */
    private long[] calculatedDailyAdOpportunityCounts;

    public ForecastAdjustment() {
    }

    public ForecastAdjustment(
           java.lang.Long id,
           java.lang.Long trafficForecastSegmentId,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202005.DateRange dateRange,
           com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentStatus status,
           com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentVolumeType volumeType,
           java.lang.Boolean allowAdjustingForecastAboveRecommendedLimit,
           com.google.api.ads.admanager.axis.v202005.DailyVolumeSettings dailyVolumeSettings,
           com.google.api.ads.admanager.axis.v202005.TotalVolumeSettings totalVolumeSettings,
           com.google.api.ads.admanager.axis.v202005.HistoricalBasisVolumeSettings historicalBasisVolumeSettings,
           long[] calculatedDailyAdOpportunityCounts) {
           this.id = id;
           this.trafficForecastSegmentId = trafficForecastSegmentId;
           this.name = name;
           this.dateRange = dateRange;
           this.status = status;
           this.volumeType = volumeType;
           this.allowAdjustingForecastAboveRecommendedLimit = allowAdjustingForecastAboveRecommendedLimit;
           this.dailyVolumeSettings = dailyVolumeSettings;
           this.totalVolumeSettings = totalVolumeSettings;
           this.historicalBasisVolumeSettings = historicalBasisVolumeSettings;
           this.calculatedDailyAdOpportunityCounts = calculatedDailyAdOpportunityCounts;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("allowAdjustingForecastAboveRecommendedLimit", getAllowAdjustingForecastAboveRecommendedLimit())
            .add("calculatedDailyAdOpportunityCounts", getCalculatedDailyAdOpportunityCounts())
            .add("dailyVolumeSettings", getDailyVolumeSettings())
            .add("dateRange", getDateRange())
            .add("historicalBasisVolumeSettings", getHistoricalBasisVolumeSettings())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .add("totalVolumeSettings", getTotalVolumeSettings())
            .add("trafficForecastSegmentId", getTrafficForecastSegmentId())
            .add("volumeType", getVolumeType())
            .toString();
    }

    /**
     * Gets the id value for this ForecastAdjustment.
     * 
     * @return id   * The unique ID of the ForecastAdjustment. This field is read-only.
     * This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ForecastAdjustment.
     * 
     * @param id   * The unique ID of the ForecastAdjustment. This field is read-only.
     * This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the trafficForecastSegmentId value for this ForecastAdjustment.
     * 
     * @return trafficForecastSegmentId   * The ID of the parent TrafficForecastSegment. This field is
     * required and immutable after
     *                 creation.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.Long getTrafficForecastSegmentId() {
        return trafficForecastSegmentId;
    }


    /**
     * Sets the trafficForecastSegmentId value for this ForecastAdjustment.
     * 
     * @param trafficForecastSegmentId   * The ID of the parent TrafficForecastSegment. This field is
     * required and immutable after
     *                 creation.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setTrafficForecastSegmentId(java.lang.Long trafficForecastSegmentId) {
        this.trafficForecastSegmentId = trafficForecastSegmentId;
    }


    /**
     * Gets the name value for this ForecastAdjustment.
     * 
     * @return name   * Name of the ForecastAdjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ForecastAdjustment.
     * 
     * @param name   * Name of the ForecastAdjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dateRange value for this ForecastAdjustment.
     * 
     * @return dateRange   * The start and end date range of the adjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public com.google.api.ads.admanager.axis.v202005.DateRange getDateRange() {
        return dateRange;
    }


    /**
     * Sets the dateRange value for this ForecastAdjustment.
     * 
     * @param dateRange   * The start and end date range of the adjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setDateRange(com.google.api.ads.admanager.axis.v202005.DateRange dateRange) {
        this.dateRange = dateRange;
    }


    /**
     * Gets the status value for this ForecastAdjustment.
     * 
     * @return status   * The status of the adjustment. Changes to this field should
     * be made via {@code
     *                 performForecastAdjustmentAction}
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ForecastAdjustment.
     * 
     * @param status   * The status of the adjustment. Changes to this field should
     * be made via {@code
     *                 performForecastAdjustmentAction}
     *                 This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentStatus status) {
        this.status = status;
    }


    /**
     * Gets the volumeType value for this ForecastAdjustment.
     * 
     * @return volumeType   * The volume type of the adjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentVolumeType getVolumeType() {
        return volumeType;
    }


    /**
     * Sets the volumeType value for this ForecastAdjustment.
     * 
     * @param volumeType   * The volume type of the adjustment.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setVolumeType(com.google.api.ads.admanager.axis.v202005.ForecastAdjustmentVolumeType volumeType) {
        this.volumeType = volumeType;
    }


    /**
     * Gets the allowAdjustingForecastAboveRecommendedLimit value for this ForecastAdjustment.
     * 
     * @return allowAdjustingForecastAboveRecommendedLimit   * Whether to allow provided volume settings to increase the current
     * forecast by more than 300%.
     *                 Due to system constraints, adjusting the forecast
     * by more than 300% may have unintended
     *                 consequences for other parts of the forecast.
     *                 
     *                 <p>Note that this field will not persist on the adjustment
     * itself, and will only affect the
     *                 current request.
     */
    public java.lang.Boolean getAllowAdjustingForecastAboveRecommendedLimit() {
        return allowAdjustingForecastAboveRecommendedLimit;
    }


    /**
     * Sets the allowAdjustingForecastAboveRecommendedLimit value for this ForecastAdjustment.
     * 
     * @param allowAdjustingForecastAboveRecommendedLimit   * Whether to allow provided volume settings to increase the current
     * forecast by more than 300%.
     *                 Due to system constraints, adjusting the forecast
     * by more than 300% may have unintended
     *                 consequences for other parts of the forecast.
     *                 
     *                 <p>Note that this field will not persist on the adjustment
     * itself, and will only affect the
     *                 current request.
     */
    public void setAllowAdjustingForecastAboveRecommendedLimit(java.lang.Boolean allowAdjustingForecastAboveRecommendedLimit) {
        this.allowAdjustingForecastAboveRecommendedLimit = allowAdjustingForecastAboveRecommendedLimit;
    }


    /**
     * Gets the dailyVolumeSettings value for this ForecastAdjustment.
     * 
     * @return dailyVolumeSettings   * The daily number of ad opportunities for each day in the adjustment
     * date range. This field is
     *                 required if {@code volumeType} is {@code ForecastAdjustmentVolumeType#DAILY_VOLUME}
     * and ignored
     *                 othewise.
     */
    public com.google.api.ads.admanager.axis.v202005.DailyVolumeSettings getDailyVolumeSettings() {
        return dailyVolumeSettings;
    }


    /**
     * Sets the dailyVolumeSettings value for this ForecastAdjustment.
     * 
     * @param dailyVolumeSettings   * The daily number of ad opportunities for each day in the adjustment
     * date range. This field is
     *                 required if {@code volumeType} is {@code ForecastAdjustmentVolumeType#DAILY_VOLUME}
     * and ignored
     *                 othewise.
     */
    public void setDailyVolumeSettings(com.google.api.ads.admanager.axis.v202005.DailyVolumeSettings dailyVolumeSettings) {
        this.dailyVolumeSettings = dailyVolumeSettings;
    }


    /**
     * Gets the totalVolumeSettings value for this ForecastAdjustment.
     * 
     * @return totalVolumeSettings   * The total number of ad opportunities for the entire adjustment
     * date range. This field is
     *                 required if {@code volumeType} is {@code ForecastAdjustmentVolumeType#TOTAL_VOLUME}
     * and ignored
     *                 othewise.
     */
    public com.google.api.ads.admanager.axis.v202005.TotalVolumeSettings getTotalVolumeSettings() {
        return totalVolumeSettings;
    }


    /**
     * Sets the totalVolumeSettings value for this ForecastAdjustment.
     * 
     * @param totalVolumeSettings   * The total number of ad opportunities for the entire adjustment
     * date range. This field is
     *                 required if {@code volumeType} is {@code ForecastAdjustmentVolumeType#TOTAL_VOLUME}
     * and ignored
     *                 othewise.
     */
    public void setTotalVolumeSettings(com.google.api.ads.admanager.axis.v202005.TotalVolumeSettings totalVolumeSettings) {
        this.totalVolumeSettings = totalVolumeSettings;
    }


    /**
     * Gets the historicalBasisVolumeSettings value for this ForecastAdjustment.
     * 
     * @return historicalBasisVolumeSettings   * The daily number of ad opportunities for each day in the adjustment
     * date range, determined by
     *                 reference to the ad opportunity volume of a historical
     * reference period. This field is required
     *                 if {@code volumeType} is {@code ForecastAdjustmentVolumeType#HISTORICAL_BASIS_VOLUME}
     * and
     *                 ignored othewise.
     */
    public com.google.api.ads.admanager.axis.v202005.HistoricalBasisVolumeSettings getHistoricalBasisVolumeSettings() {
        return historicalBasisVolumeSettings;
    }


    /**
     * Sets the historicalBasisVolumeSettings value for this ForecastAdjustment.
     * 
     * @param historicalBasisVolumeSettings   * The daily number of ad opportunities for each day in the adjustment
     * date range, determined by
     *                 reference to the ad opportunity volume of a historical
     * reference period. This field is required
     *                 if {@code volumeType} is {@code ForecastAdjustmentVolumeType#HISTORICAL_BASIS_VOLUME}
     * and
     *                 ignored othewise.
     */
    public void setHistoricalBasisVolumeSettings(com.google.api.ads.admanager.axis.v202005.HistoricalBasisVolumeSettings historicalBasisVolumeSettings) {
        this.historicalBasisVolumeSettings = historicalBasisVolumeSettings;
    }


    /**
     * Gets the calculatedDailyAdOpportunityCounts value for this ForecastAdjustment.
     * 
     * @return calculatedDailyAdOpportunityCounts   * The daily number of ad opportunities calculated to satisfy
     * the provided volume settings. Each
     *                 value in this list represents the calculated ad opportunities
     * on the corresponding day of the
     *                 adjustment date range. For example: for a {@code dateRange}
     * of 2001-8-15 to 2001-8-17, this
     *                 field will contain one value for 2001-8-15, one value
     * for 2001-8-16, and one value for
     *                 2001-8-17.
     *                 
     *                 <p>This field is read-only and is populated by Google
     * after forecast adjustment creation or
     *                 update.
     *                 This attribute is read-only.
     */
    public long[] getCalculatedDailyAdOpportunityCounts() {
        return calculatedDailyAdOpportunityCounts;
    }


    /**
     * Sets the calculatedDailyAdOpportunityCounts value for this ForecastAdjustment.
     * 
     * @param calculatedDailyAdOpportunityCounts   * The daily number of ad opportunities calculated to satisfy
     * the provided volume settings. Each
     *                 value in this list represents the calculated ad opportunities
     * on the corresponding day of the
     *                 adjustment date range. For example: for a {@code dateRange}
     * of 2001-8-15 to 2001-8-17, this
     *                 field will contain one value for 2001-8-15, one value
     * for 2001-8-16, and one value for
     *                 2001-8-17.
     *                 
     *                 <p>This field is read-only and is populated by Google
     * after forecast adjustment creation or
     *                 update.
     *                 This attribute is read-only.
     */
    public void setCalculatedDailyAdOpportunityCounts(long[] calculatedDailyAdOpportunityCounts) {
        this.calculatedDailyAdOpportunityCounts = calculatedDailyAdOpportunityCounts;
    }

    public long getCalculatedDailyAdOpportunityCounts(int i) {
        return this.calculatedDailyAdOpportunityCounts[i];
    }

    public void setCalculatedDailyAdOpportunityCounts(int i, long _value) {
        this.calculatedDailyAdOpportunityCounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastAdjustment)) return false;
        ForecastAdjustment other = (ForecastAdjustment) obj;
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
            ((this.trafficForecastSegmentId==null && other.getTrafficForecastSegmentId()==null) || 
             (this.trafficForecastSegmentId!=null &&
              this.trafficForecastSegmentId.equals(other.getTrafficForecastSegmentId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.dateRange==null && other.getDateRange()==null) || 
             (this.dateRange!=null &&
              this.dateRange.equals(other.getDateRange()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.volumeType==null && other.getVolumeType()==null) || 
             (this.volumeType!=null &&
              this.volumeType.equals(other.getVolumeType()))) &&
            ((this.allowAdjustingForecastAboveRecommendedLimit==null && other.getAllowAdjustingForecastAboveRecommendedLimit()==null) || 
             (this.allowAdjustingForecastAboveRecommendedLimit!=null &&
              this.allowAdjustingForecastAboveRecommendedLimit.equals(other.getAllowAdjustingForecastAboveRecommendedLimit()))) &&
            ((this.dailyVolumeSettings==null && other.getDailyVolumeSettings()==null) || 
             (this.dailyVolumeSettings!=null &&
              this.dailyVolumeSettings.equals(other.getDailyVolumeSettings()))) &&
            ((this.totalVolumeSettings==null && other.getTotalVolumeSettings()==null) || 
             (this.totalVolumeSettings!=null &&
              this.totalVolumeSettings.equals(other.getTotalVolumeSettings()))) &&
            ((this.historicalBasisVolumeSettings==null && other.getHistoricalBasisVolumeSettings()==null) || 
             (this.historicalBasisVolumeSettings!=null &&
              this.historicalBasisVolumeSettings.equals(other.getHistoricalBasisVolumeSettings()))) &&
            ((this.calculatedDailyAdOpportunityCounts==null && other.getCalculatedDailyAdOpportunityCounts()==null) || 
             (this.calculatedDailyAdOpportunityCounts!=null &&
              java.util.Arrays.equals(this.calculatedDailyAdOpportunityCounts, other.getCalculatedDailyAdOpportunityCounts())));
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
        if (getTrafficForecastSegmentId() != null) {
            _hashCode += getTrafficForecastSegmentId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDateRange() != null) {
            _hashCode += getDateRange().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getVolumeType() != null) {
            _hashCode += getVolumeType().hashCode();
        }
        if (getAllowAdjustingForecastAboveRecommendedLimit() != null) {
            _hashCode += getAllowAdjustingForecastAboveRecommendedLimit().hashCode();
        }
        if (getDailyVolumeSettings() != null) {
            _hashCode += getDailyVolumeSettings().hashCode();
        }
        if (getTotalVolumeSettings() != null) {
            _hashCode += getTotalVolumeSettings().hashCode();
        }
        if (getHistoricalBasisVolumeSettings() != null) {
            _hashCode += getHistoricalBasisVolumeSettings().hashCode();
        }
        if (getCalculatedDailyAdOpportunityCounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalculatedDailyAdOpportunityCounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalculatedDailyAdOpportunityCounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastAdjustment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "ForecastAdjustment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficForecastSegmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "trafficForecastSegmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "dateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "ForecastAdjustmentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "volumeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "ForecastAdjustmentVolumeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAdjustingForecastAboveRecommendedLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "allowAdjustingForecastAboveRecommendedLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dailyVolumeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "dailyVolumeSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "DailyVolumeSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVolumeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "totalVolumeSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "TotalVolumeSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalBasisVolumeSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "historicalBasisVolumeSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "HistoricalBasisVolumeSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedDailyAdOpportunityCounts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "calculatedDailyAdOpportunityCounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
