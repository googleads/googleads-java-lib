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
 * BudgetOrderRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.billing;


/**
 * Holds fields that provide information on the last set of values
 * that were passed in through
 *             the parent BudgetOrder for mutate.add and mutate.set.
 */
public class BudgetOrderRequest  implements java.io.Serializable {
    /* Status of the last {@link BudgetOrder} change.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.billing.BudgetOrderRequestStatus status;

    /* {@link DateTime} of when the request was received.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String date;

    /* Enables user to specify meaningful name for a billing account
     * to aid in reconciling monthly invoices. This name will be printed
     * in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String billingAccountName;

    /* Enables user to enter a value that helps them reference this
     * budget order
     *                 in their monthly invoices. This number will be printed
     * in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String poNumber;

    /* Enables user to specify meaningful name for referencing this
     * budget order. A default name
     *                 will be provided if none is specified. This name will
     * be printed in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String budgetOrderName;

    /* The spending limit in micros. To specify an unlimited budget,
     * set spendingLimit to -1,
     *                 otherwise spendingLimit must be greater than 0.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money spendingLimit;

    /* StartDateTime cannot be in the past, it must be on or before
     * "20361231 235959 America/Los_Angeles". StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String startDateTime;

    /* EndDateTime must be on or before "20361231 235959 America/Los_Angeles"
     * or
     *                 must set the same instant as "20371230 235959 America/Los_Angeles"
     * to
     *                 indicate infinite end date. StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String endDateTime;

    public BudgetOrderRequest() {
    }

    public BudgetOrderRequest(
           com.google.api.ads.adwords.axis.v201802.billing.BudgetOrderRequestStatus status,
           java.lang.String date,
           java.lang.String billingAccountName,
           java.lang.String poNumber,
           java.lang.String budgetOrderName,
           com.google.api.ads.adwords.axis.v201802.cm.Money spendingLimit,
           java.lang.String startDateTime,
           java.lang.String endDateTime) {
           this.status = status;
           this.date = date;
           this.billingAccountName = billingAccountName;
           this.poNumber = poNumber;
           this.budgetOrderName = budgetOrderName;
           this.spendingLimit = spendingLimit;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("billingAccountName", getBillingAccountName())
            .add("budgetOrderName", getBudgetOrderName())
            .add("date", getDate())
            .add("endDateTime", getEndDateTime())
            .add("poNumber", getPoNumber())
            .add("spendingLimit", getSpendingLimit())
            .add("startDateTime", getStartDateTime())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the status value for this BudgetOrderRequest.
     * 
     * @return status   * Status of the last {@link BudgetOrder} change.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.billing.BudgetOrderRequestStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BudgetOrderRequest.
     * 
     * @param status   * Status of the last {@link BudgetOrder} change.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.billing.BudgetOrderRequestStatus status) {
        this.status = status;
    }


    /**
     * Gets the date value for this BudgetOrderRequest.
     * 
     * @return date   * {@link DateTime} of when the request was received.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this BudgetOrderRequest.
     * 
     * @param date   * {@link DateTime} of when the request was received.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the billingAccountName value for this BudgetOrderRequest.
     * 
     * @return billingAccountName   * Enables user to specify meaningful name for a billing account
     * to aid in reconciling monthly invoices. This name will be printed
     * in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getBillingAccountName() {
        return billingAccountName;
    }


    /**
     * Sets the billingAccountName value for this BudgetOrderRequest.
     * 
     * @param billingAccountName   * Enables user to specify meaningful name for a billing account
     * to aid in reconciling monthly invoices. This name will be printed
     * in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBillingAccountName(java.lang.String billingAccountName) {
        this.billingAccountName = billingAccountName;
    }


    /**
     * Gets the poNumber value for this BudgetOrderRequest.
     * 
     * @return poNumber   * Enables user to enter a value that helps them reference this
     * budget order
     *                 in their monthly invoices. This number will be printed
     * in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getPoNumber() {
        return poNumber;
    }


    /**
     * Sets the poNumber value for this BudgetOrderRequest.
     * 
     * @param poNumber   * Enables user to enter a value that helps them reference this
     * budget order
     *                 in their monthly invoices. This number will be printed
     * in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setPoNumber(java.lang.String poNumber) {
        this.poNumber = poNumber;
    }


    /**
     * Gets the budgetOrderName value for this BudgetOrderRequest.
     * 
     * @return budgetOrderName   * Enables user to specify meaningful name for referencing this
     * budget order. A default name
     *                 will be provided if none is specified. This name will
     * be printed in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getBudgetOrderName() {
        return budgetOrderName;
    }


    /**
     * Sets the budgetOrderName value for this BudgetOrderRequest.
     * 
     * @param budgetOrderName   * Enables user to specify meaningful name for referencing this
     * budget order. A default name
     *                 will be provided if none is specified. This name will
     * be printed in the monthly invoices.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBudgetOrderName(java.lang.String budgetOrderName) {
        this.budgetOrderName = budgetOrderName;
    }


    /**
     * Gets the spendingLimit value for this BudgetOrderRequest.
     * 
     * @return spendingLimit   * The spending limit in micros. To specify an unlimited budget,
     * set spendingLimit to -1,
     *                 otherwise spendingLimit must be greater than 0.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getSpendingLimit() {
        return spendingLimit;
    }


    /**
     * Sets the spendingLimit value for this BudgetOrderRequest.
     * 
     * @param spendingLimit   * The spending limit in micros. To specify an unlimited budget,
     * set spendingLimit to -1,
     *                 otherwise spendingLimit must be greater than 0.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSpendingLimit(com.google.api.ads.adwords.axis.v201802.cm.Money spendingLimit) {
        this.spendingLimit = spendingLimit;
    }


    /**
     * Gets the startDateTime value for this BudgetOrderRequest.
     * 
     * @return startDateTime   * StartDateTime cannot be in the past, it must be on or before
     * "20361231 235959 America/Los_Angeles". StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this BudgetOrderRequest.
     * 
     * @param startDateTime   * StartDateTime cannot be in the past, it must be on or before
     * "20361231 235959 America/Los_Angeles". StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStartDateTime(java.lang.String startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this BudgetOrderRequest.
     * 
     * @return endDateTime   * EndDateTime must be on or before "20361231 235959 America/Los_Angeles"
     * or
     *                 must set the same instant as "20371230 235959 America/Los_Angeles"
     * to
     *                 indicate infinite end date. StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this BudgetOrderRequest.
     * 
     * @param endDateTime   * EndDateTime must be on or before "20361231 235959 America/Los_Angeles"
     * or
     *                 must set the same instant as "20371230 235959 America/Los_Angeles"
     * to
     *                 indicate infinite end date. StartDateTime and EndDateTime
     * must use the same time zone.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setEndDateTime(java.lang.String endDateTime) {
        this.endDateTime = endDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetOrderRequest)) return false;
        BudgetOrderRequest other = (BudgetOrderRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.billingAccountName==null && other.getBillingAccountName()==null) || 
             (this.billingAccountName!=null &&
              this.billingAccountName.equals(other.getBillingAccountName()))) &&
            ((this.poNumber==null && other.getPoNumber()==null) || 
             (this.poNumber!=null &&
              this.poNumber.equals(other.getPoNumber()))) &&
            ((this.budgetOrderName==null && other.getBudgetOrderName()==null) || 
             (this.budgetOrderName!=null &&
              this.budgetOrderName.equals(other.getBudgetOrderName()))) &&
            ((this.spendingLimit==null && other.getSpendingLimit()==null) || 
             (this.spendingLimit!=null &&
              this.spendingLimit.equals(other.getSpendingLimit()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getBillingAccountName() != null) {
            _hashCode += getBillingAccountName().hashCode();
        }
        if (getPoNumber() != null) {
            _hashCode += getPoNumber().hashCode();
        }
        if (getBudgetOrderName() != null) {
            _hashCode += getBudgetOrderName().hashCode();
        }
        if (getSpendingLimit() != null) {
            _hashCode += getSpendingLimit().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetOrderRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "BudgetOrderRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "BudgetOrderRequest.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "billingAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "poNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetOrderName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "budgetOrderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spendingLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "spendingLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201802", "endDateTime"));
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
