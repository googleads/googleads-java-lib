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
 * PerformanceTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * This class is used to configure various Performance Targets.
 */
public class PerformanceTarget  implements java.io.Serializable {
    /* The volume goal of the performance target. This property defines
     * the way stats data will be
     *                 reported for the time period specified.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "VolumeGoalType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.VolumeGoalType volumeGoalType;

    /* The value of the volume target. This corresponds directly to
     * the volume_goal_type property
     *                 and defines a target that the advertiser intends to
     * reach during the time the performance
     *                 target is active. As an example, if the volume_goal
     * is MAXIMIZE_CONVERSIONS and the volume
     *                 target is 3000, then the advertiser intends to reach
     * at least 3000 conversions between start
     *                 and end dates of the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "VolumeTargetValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long volumeTargetValue;

    /* This property specifies desired outcomes for some clicks, conversions
     * or impressions
     *                 statistic for the given time period. It's usually
     * a constraint on the volume goal of the
     *                 performance target, usually in terms of spending.
     *                 
     *                 <p>Only specific efficiency target types are allowed
     * for a volume goal type. The following
     *                 mapping explicitly specifies all allowed combinations.
     * Volume Goal Type : List of Efficiency Target Types
     *                 MAXIMIZE_CLICKS : CPC_LESS_THAN_OR_EQUAL_TO
     *                 MAXIMIZE_CONVERSIONS : CPA_LESS_THAN_OR_EQUAL_TO
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EfficiencyTargetType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.EfficiencyTargetType efficiencyTargetType;

    /* The numerical value that goes along with the expression specified
     * by the efficiency target
     *                 type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EfficiencyTargetValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Double efficiencyTargetValue;

    /* A numerical value specifying just how much money the advertiser
     * is willing to spend during the
     *                 time period of this performance target. This does
     * not affect serving. The spend target is
     *                 always in micros of the customer's currency.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SpendTarget".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money spendTarget;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "SpendTargetType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.SpendTargetType spendTargetType;

    /* The forecast status specifies how well the campaigns of a performance
     * targets are doing or have
     *                 done in the past in relation to the targets set on
     * the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ForecastStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.PerformanceTargetStatus forecastStatus;

    /* Specifies whether this performance target has promoted suggestions
     * associated with it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "HasPromotedSuggestions".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.Boolean hasPromotedSuggestions;

    /* The start date for the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String startDate;

    /* The end date for the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String endDate;

    public PerformanceTarget() {
    }

    public PerformanceTarget(
           com.google.api.ads.adwords.axis.v201802.cm.VolumeGoalType volumeGoalType,
           java.lang.Long volumeTargetValue,
           com.google.api.ads.adwords.axis.v201802.cm.EfficiencyTargetType efficiencyTargetType,
           java.lang.Double efficiencyTargetValue,
           com.google.api.ads.adwords.axis.v201802.cm.Money spendTarget,
           com.google.api.ads.adwords.axis.v201802.cm.SpendTargetType spendTargetType,
           com.google.api.ads.adwords.axis.v201802.cm.PerformanceTargetStatus forecastStatus,
           java.lang.Boolean hasPromotedSuggestions,
           java.lang.String startDate,
           java.lang.String endDate) {
           this.volumeGoalType = volumeGoalType;
           this.volumeTargetValue = volumeTargetValue;
           this.efficiencyTargetType = efficiencyTargetType;
           this.efficiencyTargetValue = efficiencyTargetValue;
           this.spendTarget = spendTarget;
           this.spendTargetType = spendTargetType;
           this.forecastStatus = forecastStatus;
           this.hasPromotedSuggestions = hasPromotedSuggestions;
           this.startDate = startDate;
           this.endDate = endDate;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("efficiencyTargetType", getEfficiencyTargetType())
            .add("efficiencyTargetValue", getEfficiencyTargetValue())
            .add("endDate", getEndDate())
            .add("forecastStatus", getForecastStatus())
            .add("hasPromotedSuggestions", getHasPromotedSuggestions())
            .add("spendTarget", getSpendTarget())
            .add("spendTargetType", getSpendTargetType())
            .add("startDate", getStartDate())
            .add("volumeGoalType", getVolumeGoalType())
            .add("volumeTargetValue", getVolumeTargetValue())
            .toString();
    }

    /**
     * Gets the volumeGoalType value for this PerformanceTarget.
     * 
     * @return volumeGoalType   * The volume goal of the performance target. This property defines
     * the way stats data will be
     *                 reported for the time period specified.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "VolumeGoalType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.VolumeGoalType getVolumeGoalType() {
        return volumeGoalType;
    }


    /**
     * Sets the volumeGoalType value for this PerformanceTarget.
     * 
     * @param volumeGoalType   * The volume goal of the performance target. This property defines
     * the way stats data will be
     *                 reported for the time period specified.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "VolumeGoalType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setVolumeGoalType(com.google.api.ads.adwords.axis.v201802.cm.VolumeGoalType volumeGoalType) {
        this.volumeGoalType = volumeGoalType;
    }


    /**
     * Gets the volumeTargetValue value for this PerformanceTarget.
     * 
     * @return volumeTargetValue   * The value of the volume target. This corresponds directly to
     * the volume_goal_type property
     *                 and defines a target that the advertiser intends to
     * reach during the time the performance
     *                 target is active. As an example, if the volume_goal
     * is MAXIMIZE_CONVERSIONS and the volume
     *                 target is 3000, then the advertiser intends to reach
     * at least 3000 conversions between start
     *                 and end dates of the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "VolumeTargetValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getVolumeTargetValue() {
        return volumeTargetValue;
    }


    /**
     * Sets the volumeTargetValue value for this PerformanceTarget.
     * 
     * @param volumeTargetValue   * The value of the volume target. This corresponds directly to
     * the volume_goal_type property
     *                 and defines a target that the advertiser intends to
     * reach during the time the performance
     *                 target is active. As an example, if the volume_goal
     * is MAXIMIZE_CONVERSIONS and the volume
     *                 target is 3000, then the advertiser intends to reach
     * at least 3000 conversions between start
     *                 and end dates of the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "VolumeTargetValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setVolumeTargetValue(java.lang.Long volumeTargetValue) {
        this.volumeTargetValue = volumeTargetValue;
    }


    /**
     * Gets the efficiencyTargetType value for this PerformanceTarget.
     * 
     * @return efficiencyTargetType   * This property specifies desired outcomes for some clicks, conversions
     * or impressions
     *                 statistic for the given time period. It's usually
     * a constraint on the volume goal of the
     *                 performance target, usually in terms of spending.
     *                 
     *                 <p>Only specific efficiency target types are allowed
     * for a volume goal type. The following
     *                 mapping explicitly specifies all allowed combinations.
     * Volume Goal Type : List of Efficiency Target Types
     *                 MAXIMIZE_CLICKS : CPC_LESS_THAN_OR_EQUAL_TO
     *                 MAXIMIZE_CONVERSIONS : CPA_LESS_THAN_OR_EQUAL_TO
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EfficiencyTargetType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.EfficiencyTargetType getEfficiencyTargetType() {
        return efficiencyTargetType;
    }


    /**
     * Sets the efficiencyTargetType value for this PerformanceTarget.
     * 
     * @param efficiencyTargetType   * This property specifies desired outcomes for some clicks, conversions
     * or impressions
     *                 statistic for the given time period. It's usually
     * a constraint on the volume goal of the
     *                 performance target, usually in terms of spending.
     *                 
     *                 <p>Only specific efficiency target types are allowed
     * for a volume goal type. The following
     *                 mapping explicitly specifies all allowed combinations.
     * Volume Goal Type : List of Efficiency Target Types
     *                 MAXIMIZE_CLICKS : CPC_LESS_THAN_OR_EQUAL_TO
     *                 MAXIMIZE_CONVERSIONS : CPA_LESS_THAN_OR_EQUAL_TO
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EfficiencyTargetType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setEfficiencyTargetType(com.google.api.ads.adwords.axis.v201802.cm.EfficiencyTargetType efficiencyTargetType) {
        this.efficiencyTargetType = efficiencyTargetType;
    }


    /**
     * Gets the efficiencyTargetValue value for this PerformanceTarget.
     * 
     * @return efficiencyTargetValue   * The numerical value that goes along with the expression specified
     * by the efficiency target
     *                 type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EfficiencyTargetValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Double getEfficiencyTargetValue() {
        return efficiencyTargetValue;
    }


    /**
     * Sets the efficiencyTargetValue value for this PerformanceTarget.
     * 
     * @param efficiencyTargetValue   * The numerical value that goes along with the expression specified
     * by the efficiency target
     *                 type.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EfficiencyTargetValue".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setEfficiencyTargetValue(java.lang.Double efficiencyTargetValue) {
        this.efficiencyTargetValue = efficiencyTargetValue;
    }


    /**
     * Gets the spendTarget value for this PerformanceTarget.
     * 
     * @return spendTarget   * A numerical value specifying just how much money the advertiser
     * is willing to spend during the
     *                 time period of this performance target. This does
     * not affect serving. The spend target is
     *                 always in micros of the customer's currency.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SpendTarget".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getSpendTarget() {
        return spendTarget;
    }


    /**
     * Sets the spendTarget value for this PerformanceTarget.
     * 
     * @param spendTarget   * A numerical value specifying just how much money the advertiser
     * is willing to spend during the
     *                 time period of this performance target. This does
     * not affect serving. The spend target is
     *                 always in micros of the customer's currency.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "SpendTarget".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setSpendTarget(com.google.api.ads.adwords.axis.v201802.cm.Money spendTarget) {
        this.spendTarget = spendTarget;
    }


    /**
     * Gets the spendTargetType value for this PerformanceTarget.
     * 
     * @return spendTargetType   * <span class="constraint Selectable">This field can be selected
     * using the value "SpendTargetType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.SpendTargetType getSpendTargetType() {
        return spendTargetType;
    }


    /**
     * Sets the spendTargetType value for this PerformanceTarget.
     * 
     * @param spendTargetType   * <span class="constraint Selectable">This field can be selected
     * using the value "SpendTargetType".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setSpendTargetType(com.google.api.ads.adwords.axis.v201802.cm.SpendTargetType spendTargetType) {
        this.spendTargetType = spendTargetType;
    }


    /**
     * Gets the forecastStatus value for this PerformanceTarget.
     * 
     * @return forecastStatus   * The forecast status specifies how well the campaigns of a performance
     * targets are doing or have
     *                 done in the past in relation to the targets set on
     * the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ForecastStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PerformanceTargetStatus getForecastStatus() {
        return forecastStatus;
    }


    /**
     * Sets the forecastStatus value for this PerformanceTarget.
     * 
     * @param forecastStatus   * The forecast status specifies how well the campaigns of a performance
     * targets are doing or have
     *                 done in the past in relation to the targets set on
     * the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ForecastStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setForecastStatus(com.google.api.ads.adwords.axis.v201802.cm.PerformanceTargetStatus forecastStatus) {
        this.forecastStatus = forecastStatus;
    }


    /**
     * Gets the hasPromotedSuggestions value for this PerformanceTarget.
     * 
     * @return hasPromotedSuggestions   * Specifies whether this performance target has promoted suggestions
     * associated with it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "HasPromotedSuggestions".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getHasPromotedSuggestions() {
        return hasPromotedSuggestions;
    }


    /**
     * Sets the hasPromotedSuggestions value for this PerformanceTarget.
     * 
     * @param hasPromotedSuggestions   * Specifies whether this performance target has promoted suggestions
     * associated with it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "HasPromotedSuggestions".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setHasPromotedSuggestions(java.lang.Boolean hasPromotedSuggestions) {
        this.hasPromotedSuggestions = hasPromotedSuggestions;
    }


    /**
     * Gets the startDate value for this PerformanceTarget.
     * 
     * @return startDate   * The start date for the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PerformanceTarget.
     * 
     * @param startDate   * The start date for the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PerformanceTarget.
     * 
     * @return endDate   * The end date for the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PerformanceTarget.
     * 
     * @param endDate   * The end date for the performance target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerformanceTarget)) return false;
        PerformanceTarget other = (PerformanceTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.volumeGoalType==null && other.getVolumeGoalType()==null) || 
             (this.volumeGoalType!=null &&
              this.volumeGoalType.equals(other.getVolumeGoalType()))) &&
            ((this.volumeTargetValue==null && other.getVolumeTargetValue()==null) || 
             (this.volumeTargetValue!=null &&
              this.volumeTargetValue.equals(other.getVolumeTargetValue()))) &&
            ((this.efficiencyTargetType==null && other.getEfficiencyTargetType()==null) || 
             (this.efficiencyTargetType!=null &&
              this.efficiencyTargetType.equals(other.getEfficiencyTargetType()))) &&
            ((this.efficiencyTargetValue==null && other.getEfficiencyTargetValue()==null) || 
             (this.efficiencyTargetValue!=null &&
              this.efficiencyTargetValue.equals(other.getEfficiencyTargetValue()))) &&
            ((this.spendTarget==null && other.getSpendTarget()==null) || 
             (this.spendTarget!=null &&
              this.spendTarget.equals(other.getSpendTarget()))) &&
            ((this.spendTargetType==null && other.getSpendTargetType()==null) || 
             (this.spendTargetType!=null &&
              this.spendTargetType.equals(other.getSpendTargetType()))) &&
            ((this.forecastStatus==null && other.getForecastStatus()==null) || 
             (this.forecastStatus!=null &&
              this.forecastStatus.equals(other.getForecastStatus()))) &&
            ((this.hasPromotedSuggestions==null && other.getHasPromotedSuggestions()==null) || 
             (this.hasPromotedSuggestions!=null &&
              this.hasPromotedSuggestions.equals(other.getHasPromotedSuggestions()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getVolumeGoalType() != null) {
            _hashCode += getVolumeGoalType().hashCode();
        }
        if (getVolumeTargetValue() != null) {
            _hashCode += getVolumeTargetValue().hashCode();
        }
        if (getEfficiencyTargetType() != null) {
            _hashCode += getEfficiencyTargetType().hashCode();
        }
        if (getEfficiencyTargetValue() != null) {
            _hashCode += getEfficiencyTargetValue().hashCode();
        }
        if (getSpendTarget() != null) {
            _hashCode += getSpendTarget().hashCode();
        }
        if (getSpendTargetType() != null) {
            _hashCode += getSpendTargetType().hashCode();
        }
        if (getForecastStatus() != null) {
            _hashCode += getForecastStatus().hashCode();
        }
        if (getHasPromotedSuggestions() != null) {
            _hashCode += getHasPromotedSuggestions().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerformanceTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PerformanceTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeGoalType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "volumeGoalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VolumeGoalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeTargetValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "volumeTargetValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("efficiencyTargetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "efficiencyTargetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EfficiencyTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("efficiencyTargetValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "efficiencyTargetValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spendTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "spendTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spendTargetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "spendTargetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SpendTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "forecastStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PerformanceTargetStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPromotedSuggestions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "hasPromotedSuggestions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
