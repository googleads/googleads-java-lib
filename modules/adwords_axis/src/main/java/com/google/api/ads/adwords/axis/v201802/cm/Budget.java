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
 * Budget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Budgets are used for managing the amount of money spent on AdWords.
 */
public class Budget  implements java.io.Serializable {
    /* A Budget is created using the BudgetService ADD operation and
     * is
     *                 assigned a BudgetId. The BudgetId is used when modifying
     * the
     *                 Budget with BudgetService, or associating the Budget
     * to a
     *                 Campaign with CampaignService. A BudgetId can be shared
     * across
     *                 different campaigns--the system will then allocate
     * the Budget
     *                 among the Campaigns to get the optimum result. */
    private java.lang.Long budgetId;

    /* Name of the Budget. When creating a Budget through BudgetService,
     * every explicitly shared
     *                 Budget must have a non-null non-empty name. In addition,
     * all explicitly shared Budget
     *                 names owned by an account must be distinct. Budgets
     * that are not explicitly shared derive
     *                 their name from the attached Campaign's name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span> */
    private java.lang.String name;

    /* Amount of budget in the local currency for the account.
     *                 
     *                 This value represents an average daily budget amount;
     * the actual daily costs might
     *                 vary. See <a href="https://support.google.com/adwords/answer/1704443">Charges
     * and your daily budget</a>.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money amount;

    /* Delivery method for the Budget which determines the rate at
     * which the
     *                 Budget is spent. Defaults to STANDARD and can be changed
     * through
     *                 BudgetService ADD or SET operations.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetDeliveryMethod deliveryMethod;

    /* Number of campaigns actively using this budget. This field
     * is only
     *                 populated for Get operations.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Integer referenceCount;

    /* If true, this budget was created with the purpose of sharing
     * this budget across one or more campaigns.
     *                 <p>If false, this budget was created with the intention
     * to be
     *                 dedicatedly used with a single campaign, and the Budget's
     * name
     *                 and status will stay in the sync with the associated
     * Campaign's name
     *                 and status. Attempting to share this budget with a
     * second Campaign will
     *                 result in an error.</p>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private java.lang.Boolean isExplicitlyShared;

    /* <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetStatus status;

    public Budget() {
    }

    public Budget(
           java.lang.Long budgetId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.Money amount,
           com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetDeliveryMethod deliveryMethod,
           java.lang.Integer referenceCount,
           java.lang.Boolean isExplicitlyShared,
           com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetStatus status) {
           this.budgetId = budgetId;
           this.name = name;
           this.amount = amount;
           this.deliveryMethod = deliveryMethod;
           this.referenceCount = referenceCount;
           this.isExplicitlyShared = isExplicitlyShared;
           this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("amount", getAmount())
            .add("budgetId", getBudgetId())
            .add("deliveryMethod", getDeliveryMethod())
            .add("isExplicitlyShared", getIsExplicitlyShared())
            .add("name", getName())
            .add("referenceCount", getReferenceCount())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the budgetId value for this Budget.
     * 
     * @return budgetId   * A Budget is created using the BudgetService ADD operation and
     * is
     *                 assigned a BudgetId. The BudgetId is used when modifying
     * the
     *                 Budget with BudgetService, or associating the Budget
     * to a
     *                 Campaign with CampaignService. A BudgetId can be shared
     * across
     *                 different campaigns--the system will then allocate
     * the Budget
     *                 among the Campaigns to get the optimum result.
     */
    public java.lang.Long getBudgetId() {
        return budgetId;
    }


    /**
     * Sets the budgetId value for this Budget.
     * 
     * @param budgetId   * A Budget is created using the BudgetService ADD operation and
     * is
     *                 assigned a BudgetId. The BudgetId is used when modifying
     * the
     *                 Budget with BudgetService, or associating the Budget
     * to a
     *                 Campaign with CampaignService. A BudgetId can be shared
     * across
     *                 different campaigns--the system will then allocate
     * the Budget
     *                 among the Campaigns to get the optimum result.
     */
    public void setBudgetId(java.lang.Long budgetId) {
        this.budgetId = budgetId;
    }


    /**
     * Gets the name value for this Budget.
     * 
     * @return name   * Name of the Budget. When creating a Budget through BudgetService,
     * every explicitly shared
     *                 Budget must have a non-null non-empty name. In addition,
     * all explicitly shared Budget
     *                 names owned by an account must be distinct. Budgets
     * that are not explicitly shared derive
     *                 their name from the attached Campaign's name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Budget.
     * 
     * @param name   * Name of the Budget. When creating a Budget through BudgetService,
     * every explicitly shared
     *                 Budget must have a non-null non-empty name. In addition,
     * all explicitly shared Budget
     *                 names owned by an account must be distinct. Budgets
     * that are not explicitly shared derive
     *                 their name from the attached Campaign's name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive, in UTF-8 bytes,
     * (trimmed).</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the amount value for this Budget.
     * 
     * @return amount   * Amount of budget in the local currency for the account.
     *                 
     *                 This value represents an average daily budget amount;
     * the actual daily costs might
     *                 vary. See <a href="https://support.google.com/adwords/answer/1704443">Charges
     * and your daily budget</a>.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Budget.
     * 
     * @param amount   * Amount of budget in the local currency for the account.
     *                 
     *                 This value represents an average daily budget amount;
     * the actual daily costs might
     *                 vary. See <a href="https://support.google.com/adwords/answer/1704443">Charges
     * and your daily budget</a>.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setAmount(com.google.api.ads.adwords.axis.v201802.cm.Money amount) {
        this.amount = amount;
    }


    /**
     * Gets the deliveryMethod value for this Budget.
     * 
     * @return deliveryMethod   * Delivery method for the Budget which determines the rate at
     * which the
     *                 Budget is spent. Defaults to STANDARD and can be changed
     * through
     *                 BudgetService ADD or SET operations.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetDeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }


    /**
     * Sets the deliveryMethod value for this Budget.
     * 
     * @param deliveryMethod   * Delivery method for the Budget which determines the rate at
     * which the
     *                 Budget is spent. Defaults to STANDARD and can be changed
     * through
     *                 BudgetService ADD or SET operations.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setDeliveryMethod(com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetDeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }


    /**
     * Gets the referenceCount value for this Budget.
     * 
     * @return referenceCount   * Number of campaigns actively using this budget. This field
     * is only
     *                 populated for Get operations.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getReferenceCount() {
        return referenceCount;
    }


    /**
     * Sets the referenceCount value for this Budget.
     * 
     * @param referenceCount   * Number of campaigns actively using this budget. This field
     * is only
     *                 populated for Get operations.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setReferenceCount(java.lang.Integer referenceCount) {
        this.referenceCount = referenceCount;
    }


    /**
     * Gets the isExplicitlyShared value for this Budget.
     * 
     * @return isExplicitlyShared   * If true, this budget was created with the purpose of sharing
     * this budget across one or more campaigns.
     *                 <p>If false, this budget was created with the intention
     * to be
     *                 dedicatedly used with a single campaign, and the Budget's
     * name
     *                 and status will stay in the sync with the associated
     * Campaign's name
     *                 and status. Attempting to share this budget with a
     * second Campaign will
     *                 result in an error.</p>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.Boolean getIsExplicitlyShared() {
        return isExplicitlyShared;
    }


    /**
     * Sets the isExplicitlyShared value for this Budget.
     * 
     * @param isExplicitlyShared   * If true, this budget was created with the purpose of sharing
     * this budget across one or more campaigns.
     *                 <p>If false, this budget was created with the intention
     * to be
     *                 dedicatedly used with a single campaign, and the Budget's
     * name
     *                 and status will stay in the sync with the associated
     * Campaign's name
     *                 and status. Attempting to share this budget with a
     * second Campaign will
     *                 result in an error.</p>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setIsExplicitlyShared(java.lang.Boolean isExplicitlyShared) {
        this.isExplicitlyShared = isExplicitlyShared;
    }


    /**
     * Gets the status value for this Budget.
     * 
     * @return status   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Budget.
     * 
     * @param status   * <span class="constraint ReadOnly">This field is read only and
     * will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Budget)) return false;
        Budget other = (Budget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.budgetId==null && other.getBudgetId()==null) || 
             (this.budgetId!=null &&
              this.budgetId.equals(other.getBudgetId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.deliveryMethod==null && other.getDeliveryMethod()==null) || 
             (this.deliveryMethod!=null &&
              this.deliveryMethod.equals(other.getDeliveryMethod()))) &&
            ((this.referenceCount==null && other.getReferenceCount()==null) || 
             (this.referenceCount!=null &&
              this.referenceCount.equals(other.getReferenceCount()))) &&
            ((this.isExplicitlyShared==null && other.getIsExplicitlyShared()==null) || 
             (this.isExplicitlyShared!=null &&
              this.isExplicitlyShared.equals(other.getIsExplicitlyShared()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getBudgetId() != null) {
            _hashCode += getBudgetId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDeliveryMethod() != null) {
            _hashCode += getDeliveryMethod().hashCode();
        }
        if (getReferenceCount() != null) {
            _hashCode += getReferenceCount().hashCode();
        }
        if (getIsExplicitlyShared() != null) {
            _hashCode += getIsExplicitlyShared().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Budget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Budget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "deliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Budget.BudgetDeliveryMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "referenceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExplicitlyShared");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isExplicitlyShared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Budget.BudgetStatus"));
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
