// Copyright 2016 Google Inc. All Rights Reserved.
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
 * Experiment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201603.cm;


/**
 * Class representing a experiment for the ExperimentService.
 */
public class Experiment  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* The id of the control associated with this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ControlId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long controlId;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "CampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Long campaignId;

    /* Experiment name.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String name;

    /* Status of the experiment.  For ADD, this can only be ACTIVE,
     * as nothing
     *                 else makes sense.  Default is ACTIVE for ADDs where
     * this field is omitted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201603.cm.ExperimentStatus status;

    /* Serving status of the experiment.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ServingStatus".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201603.cm.ExperimentServingStatus servingStatus;

    /* The percentage of queries that will get routed to the experiment.
     * It is
     *                 also the percentage of budget that will be used for
     * the experiment. Valid
     *                 values for this field are 10, 20, 30, 40, 50, 60,
     * 70, 80, 90.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "QueryPercentage".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 100, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Integer queryPercentage;

    /* Experiment started serving date;
     *                 {@code null} indicates campaign start date is indefinitely
     * in the future.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String startDateTime;

    /* Experiment ended serving date; {@code null} indicates campaign
     * end date depends on start
     *                 date. If start date is null, this is undefined. If
     * start date is not null, this defaults
     *                 to 30 days after the start date.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String endDateTime;

    /* The last time any change was made to this experiment, such
     * as adding a keyword to
     *                 the experiment only, adding a keyword to the control
     * only, or updating a bid modifier.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastModifiedDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String lastModifiedDateTime;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201603.cm.ExperimentSummaryStats experimentSummaryStats;

    public Experiment() {
    }

    public Experiment(
           java.lang.Long id,
           java.lang.Long controlId,
           java.lang.Long campaignId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201603.cm.ExperimentStatus status,
           com.google.api.ads.adwords.axis.v201603.cm.ExperimentServingStatus servingStatus,
           java.lang.Integer queryPercentage,
           java.lang.String startDateTime,
           java.lang.String endDateTime,
           java.lang.String lastModifiedDateTime,
           com.google.api.ads.adwords.axis.v201603.cm.ExperimentSummaryStats experimentSummaryStats) {
           this.id = id;
           this.controlId = controlId;
           this.campaignId = campaignId;
           this.name = name;
           this.status = status;
           this.servingStatus = servingStatus;
           this.queryPercentage = queryPercentage;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.experimentSummaryStats = experimentSummaryStats;
    }


    /**
     * Gets the id value for this Experiment.
     * 
     * @return id   * <span class="constraint Selectable">This field can be selected
     * using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
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
     * Sets the id value for this Experiment.
     * 
     * @param id   * <span class="constraint Selectable">This field can be selected
     * using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
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
     * Gets the controlId value for this Experiment.
     * 
     * @return controlId   * The id of the control associated with this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ControlId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getControlId() {
        return controlId;
    }


    /**
     * Sets the controlId value for this Experiment.
     * 
     * @param controlId   * The id of the control associated with this experiment
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ControlId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setControlId(java.lang.Long controlId) {
        this.controlId = controlId;
    }


    /**
     * Gets the campaignId value for this Experiment.
     * 
     * @return campaignId   * <span class="constraint Selectable">This field can be selected
     * using the value "CampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this Experiment.
     * 
     * @param campaignId   * <span class="constraint Selectable">This field can be selected
     * using the value "CampaignId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the name value for this Experiment.
     * 
     * @return name   * Experiment name.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Experiment.
     * 
     * @param name   * Experiment name.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Experiment.
     * 
     * @return status   * Status of the experiment.  For ADD, this can only be ACTIVE,
     * as nothing
     *                 else makes sense.  Default is ACTIVE for ADDs where
     * this field is omitted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201603.cm.ExperimentStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Experiment.
     * 
     * @param status   * Status of the experiment.  For ADD, this can only be ACTIVE,
     * as nothing
     *                 else makes sense.  Default is ACTIVE for ADDs where
     * this field is omitted.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201603.cm.ExperimentStatus status) {
        this.status = status;
    }


    /**
     * Gets the servingStatus value for this Experiment.
     * 
     * @return servingStatus   * Serving status of the experiment.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ServingStatus".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201603.cm.ExperimentServingStatus getServingStatus() {
        return servingStatus;
    }


    /**
     * Sets the servingStatus value for this Experiment.
     * 
     * @param servingStatus   * Serving status of the experiment.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ServingStatus".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setServingStatus(com.google.api.ads.adwords.axis.v201603.cm.ExperimentServingStatus servingStatus) {
        this.servingStatus = servingStatus;
    }


    /**
     * Gets the queryPercentage value for this Experiment.
     * 
     * @return queryPercentage   * The percentage of queries that will get routed to the experiment.
     * It is
     *                 also the percentage of budget that will be used for
     * the experiment. Valid
     *                 values for this field are 10, 20, 30, 40, 50, 60,
     * 70, 80, 90.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "QueryPercentage".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 100, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Integer getQueryPercentage() {
        return queryPercentage;
    }


    /**
     * Sets the queryPercentage value for this Experiment.
     * 
     * @param queryPercentage   * The percentage of queries that will get routed to the experiment.
     * It is
     *                 also the percentage of budget that will be used for
     * the experiment. Valid
     *                 values for this field are 10, 20, 30, 40, 50, 60,
     * 70, 80, 90.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "QueryPercentage".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 0 and 100, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setQueryPercentage(java.lang.Integer queryPercentage) {
        this.queryPercentage = queryPercentage;
    }


    /**
     * Gets the startDateTime value for this Experiment.
     * 
     * @return startDateTime   * Experiment started serving date;
     *                 {@code null} indicates campaign start date is indefinitely
     * in the future.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Experiment.
     * 
     * @param startDateTime   * Experiment started serving date;
     *                 {@code null} indicates campaign start date is indefinitely
     * in the future.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this Experiment.
     * 
     * @return endDateTime   * Experiment ended serving date; {@code null} indicates campaign
     * end date depends on start
     *                 date. If start date is null, this is undefined. If
     * start date is not null, this defaults
     *                 to 30 days after the start date.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Experiment.
     * 
     * @param endDateTime   * Experiment ended serving date; {@code null} indicates campaign
     * end date depends on start
     *                 date. If start date is null, this is undefined. If
     * start date is not null, this defaults
     *                 to 30 days after the start date.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this Experiment.
     * 
     * @return lastModifiedDateTime   * The last time any change was made to this experiment, such
     * as adding a keyword to
     *                 the experiment only, adding a keyword to the control
     * only, or updating a bid modifier.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastModifiedDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Experiment.
     * 
     * @param lastModifiedDateTime   * The last time any change was made to this experiment, such
     * as adding a keyword to
     *                 the experiment only, adding a keyword to the control
     * only, or updating a bid modifier.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LastModifiedDateTime".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setLastModifiedDateTime(java.lang.String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the experimentSummaryStats value for this Experiment.
     * 
     * @return experimentSummaryStats   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201603.cm.ExperimentSummaryStats getExperimentSummaryStats() {
        return experimentSummaryStats;
    }


    /**
     * Sets the experimentSummaryStats value for this Experiment.
     * 
     * @param experimentSummaryStats   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setExperimentSummaryStats(com.google.api.ads.adwords.axis.v201603.cm.ExperimentSummaryStats experimentSummaryStats) {
        this.experimentSummaryStats = experimentSummaryStats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Experiment)) return false;
        Experiment other = (Experiment) obj;
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
            ((this.controlId==null && other.getControlId()==null) || 
             (this.controlId!=null &&
              this.controlId.equals(other.getControlId()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.servingStatus==null && other.getServingStatus()==null) || 
             (this.servingStatus!=null &&
              this.servingStatus.equals(other.getServingStatus()))) &&
            ((this.queryPercentage==null && other.getQueryPercentage()==null) || 
             (this.queryPercentage!=null &&
              this.queryPercentage.equals(other.getQueryPercentage()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.experimentSummaryStats==null && other.getExperimentSummaryStats()==null) || 
             (this.experimentSummaryStats!=null &&
              this.experimentSummaryStats.equals(other.getExperimentSummaryStats())));
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
        if (getControlId() != null) {
            _hashCode += getControlId().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getServingStatus() != null) {
            _hashCode += getServingStatus().hashCode();
        }
        if (getQueryPercentage() != null) {
            _hashCode += getQueryPercentage().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getExperimentSummaryStats() != null) {
            _hashCode += getExperimentSummaryStats().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Experiment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "Experiment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "controlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "ExperimentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "servingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "ExperimentServingStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "queryPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentSummaryStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "experimentSummaryStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201603", "ExperimentSummaryStats"));
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
