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
 * Trial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Interface for campaign trial entities. A trial is an experiment
 * created by an advertiser from
 *             changes in a draft.
 */
public class Trial  implements java.io.Serializable {
    /* The id of this trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* Id of the base campaign, which will be the control arm of this
     * trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Long baseCampaignId;

    /* Valid id of the draft this trial is based on.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Long draftId;

    /* Id of the new budget to assign to the trial campaign when graduating
     * a trial.
     *                 
     *                 <p>Required for {@link Operator#SET SET} operations,
     * when changing the {@link #status} to
     *                 {@code GRADUATED}, and read-only otherwise.
     *                 
     *                 <p>When graduating a trial, the same constraints apply
     * to this field as for a budget id passed
     *                 to {@code CampaignService} when creating a new campaign.
     * 
     *                 <p>{@code GET} operations always return a {@code null}
     * budget id.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private java.lang.Long budgetId;

    /* The name of this trial. Must not conflict with the name of
     * another trial or campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 1024, inclusive, in UTF-8 bytes,
     * (trimmed).</span> */
    private java.lang.String name;

    /* Date the trial begins. On add, defaults to the the base campaign's
     * start date or the
     *                 current day in the parent account's local timezone
     * (whichever is later).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String startDate;

    /* Date the campaign ends. On add, defaults to the base campaign's
     * end date.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String endDate;

    /* Traffic share to be directed to the trial arm of this trial,
     * i.e. the arm containing the
     *                 trial changes (in percent). The remainder of the traffic
     * (100 - {@code trafficSplitPercent})
     *                 will be directed to the base campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrafficSplitPercent".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 1 and 99, inclusive.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.Integer trafficSplitPercent;

    /* Status of this trial. Note that a running trial will always
     * be ACTIVE, but not all ACTIVE
     *                 trials are currently running: they may have ended
     * or been scheduled for the future.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.TrialStatus status;

    /* Id of the trial campaign. This will be null if the Trial has
     * status CREATING.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long trialCampaignId;

    public Trial() {
    }

    public Trial(
           java.lang.Long id,
           java.lang.Long baseCampaignId,
           java.lang.Long draftId,
           java.lang.Long budgetId,
           java.lang.String name,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Integer trafficSplitPercent,
           com.google.api.ads.adwords.axis.v201802.cm.TrialStatus status,
           java.lang.Long trialCampaignId) {
           this.id = id;
           this.baseCampaignId = baseCampaignId;
           this.draftId = draftId;
           this.budgetId = budgetId;
           this.name = name;
           this.startDate = startDate;
           this.endDate = endDate;
           this.trafficSplitPercent = trafficSplitPercent;
           this.status = status;
           this.trialCampaignId = trialCampaignId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("baseCampaignId", getBaseCampaignId())
            .add("budgetId", getBudgetId())
            .add("draftId", getDraftId())
            .add("endDate", getEndDate())
            .add("id", getId())
            .add("name", getName())
            .add("startDate", getStartDate())
            .add("status", getStatus())
            .add("trafficSplitPercent", getTrafficSplitPercent())
            .add("trialCampaignId", getTrialCampaignId())
            .toString();
    }

    /**
     * Gets the id value for this Trial.
     * 
     * @return id   * The id of this trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
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
     * Sets the id value for this Trial.
     * 
     * @param id   * The id of this trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
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
     * Gets the baseCampaignId value for this Trial.
     * 
     * @return baseCampaignId   * Id of the base campaign, which will be the control arm of this
     * trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Long getBaseCampaignId() {
        return baseCampaignId;
    }


    /**
     * Sets the baseCampaignId value for this Trial.
     * 
     * @param baseCampaignId   * Id of the base campaign, which will be the control arm of this
     * trial.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "BaseCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setBaseCampaignId(java.lang.Long baseCampaignId) {
        this.baseCampaignId = baseCampaignId;
    }


    /**
     * Gets the draftId value for this Trial.
     * 
     * @return draftId   * Valid id of the draft this trial is based on.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Long getDraftId() {
        return draftId;
    }


    /**
     * Sets the draftId value for this Trial.
     * 
     * @param draftId   * Valid id of the draft this trial is based on.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DraftId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setDraftId(java.lang.Long draftId) {
        this.draftId = draftId;
    }


    /**
     * Gets the budgetId value for this Trial.
     * 
     * @return budgetId   * Id of the new budget to assign to the trial campaign when graduating
     * a trial.
     *                 
     *                 <p>Required for {@link Operator#SET SET} operations,
     * when changing the {@link #status} to
     *                 {@code GRADUATED}, and read-only otherwise.
     *                 
     *                 <p>When graduating a trial, the same constraints apply
     * to this field as for a budget id passed
     *                 to {@code CampaignService} when creating a new campaign.
     * 
     *                 <p>{@code GET} operations always return a {@code null}
     * budget id.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public java.lang.Long getBudgetId() {
        return budgetId;
    }


    /**
     * Sets the budgetId value for this Trial.
     * 
     * @param budgetId   * Id of the new budget to assign to the trial campaign when graduating
     * a trial.
     *                 
     *                 <p>Required for {@link Operator#SET SET} operations,
     * when changing the {@link #status} to
     *                 {@code GRADUATED}, and read-only otherwise.
     *                 
     *                 <p>When graduating a trial, the same constraints apply
     * to this field as for a budget id passed
     *                 to {@code CampaignService} when creating a new campaign.
     * 
     *                 <p>{@code GET} operations always return a {@code null}
     * budget id.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setBudgetId(java.lang.Long budgetId) {
        this.budgetId = budgetId;
    }


    /**
     * Gets the name value for this Trial.
     * 
     * @return name   * The name of this trial. Must not conflict with the name of
     * another trial or campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 1024, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Trial.
     * 
     * @param name   * The name of this trial. Must not conflict with the name of
     * another trial or campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 1024, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startDate value for this Trial.
     * 
     * @return startDate   * Date the trial begins. On add, defaults to the the base campaign's
     * start date or the
     *                 current day in the parent account's local timezone
     * (whichever is later).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Trial.
     * 
     * @param startDate   * Date the trial begins. On add, defaults to the the base campaign's
     * start date or the
     *                 current day in the parent account's local timezone
     * (whichever is later).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Trial.
     * 
     * @return endDate   * Date the campaign ends. On add, defaults to the base campaign's
     * end date.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Trial.
     * 
     * @param endDate   * Date the campaign ends. On add, defaults to the base campaign's
     * end date.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the trafficSplitPercent value for this Trial.
     * 
     * @return trafficSplitPercent   * Traffic share to be directed to the trial arm of this trial,
     * i.e. the arm containing the
     *                 trial changes (in percent). The remainder of the traffic
     * (100 - {@code trafficSplitPercent})
     *                 will be directed to the base campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrafficSplitPercent".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 1 and 99, inclusive.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.Integer getTrafficSplitPercent() {
        return trafficSplitPercent;
    }


    /**
     * Sets the trafficSplitPercent value for this Trial.
     * 
     * @param trafficSplitPercent   * Traffic share to be directed to the trial arm of this trial,
     * i.e. the arm containing the
     *                 trial changes (in percent). The remainder of the traffic
     * (100 - {@code trafficSplitPercent})
     *                 will be directed to the base campaign.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrafficSplitPercent".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint InRange">This field must be
     * between 1 and 99, inclusive.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: SET.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setTrafficSplitPercent(java.lang.Integer trafficSplitPercent) {
        this.trafficSplitPercent = trafficSplitPercent;
    }


    /**
     * Gets the status value for this Trial.
     * 
     * @return status   * Status of this trial. Note that a running trial will always
     * be ACTIVE, but not all ACTIVE
     *                 trials are currently running: they may have ended
     * or been scheduled for the future.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TrialStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Trial.
     * 
     * @param status   * Status of this trial. Note that a running trial will always
     * be ACTIVE, but not all ACTIVE
     *                 trials are currently running: they may have ended
     * or been scheduled for the future.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.TrialStatus status) {
        this.status = status;
    }


    /**
     * Gets the trialCampaignId value for this Trial.
     * 
     * @return trialCampaignId   * Id of the trial campaign. This will be null if the Trial has
     * status CREATING.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getTrialCampaignId() {
        return trialCampaignId;
    }


    /**
     * Sets the trialCampaignId value for this Trial.
     * 
     * @param trialCampaignId   * Id of the trial campaign. This will be null if the Trial has
     * status CREATING.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TrialCampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTrialCampaignId(java.lang.Long trialCampaignId) {
        this.trialCampaignId = trialCampaignId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Trial)) return false;
        Trial other = (Trial) obj;
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
            ((this.baseCampaignId==null && other.getBaseCampaignId()==null) || 
             (this.baseCampaignId!=null &&
              this.baseCampaignId.equals(other.getBaseCampaignId()))) &&
            ((this.draftId==null && other.getDraftId()==null) || 
             (this.draftId!=null &&
              this.draftId.equals(other.getDraftId()))) &&
            ((this.budgetId==null && other.getBudgetId()==null) || 
             (this.budgetId!=null &&
              this.budgetId.equals(other.getBudgetId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.trafficSplitPercent==null && other.getTrafficSplitPercent()==null) || 
             (this.trafficSplitPercent!=null &&
              this.trafficSplitPercent.equals(other.getTrafficSplitPercent()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.trialCampaignId==null && other.getTrialCampaignId()==null) || 
             (this.trialCampaignId!=null &&
              this.trialCampaignId.equals(other.getTrialCampaignId())));
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
        if (getBaseCampaignId() != null) {
            _hashCode += getBaseCampaignId().hashCode();
        }
        if (getDraftId() != null) {
            _hashCode += getDraftId().hashCode();
        }
        if (getBudgetId() != null) {
            _hashCode += getBudgetId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getTrafficSplitPercent() != null) {
            _hashCode += getTrafficSplitPercent().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTrialCampaignId() != null) {
            _hashCode += getTrialCampaignId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Trial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Trial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "baseCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draftId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "draftId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "budgetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficSplitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "trafficSplitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialCampaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "trialCampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
