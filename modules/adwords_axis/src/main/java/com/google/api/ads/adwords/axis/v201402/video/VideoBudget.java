/**
 * VideoBudget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents the budget data for a video campaign.
 */
public class VideoBudget  implements java.io.Serializable {
    /* The ID of this budget.
     *                 
     *                 <p>Note: For the case of shared (e.g. Campaign Summary)
     * budgets, the
     *                 budgetId may be null. */
    private java.lang.Long budgetId;

    /* Name of the Budget. Every Budget must have a non-null non-empty
     * name. In addition, all budget
     *                 names owned by an account must be distinct.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive.</span> */
    private java.lang.String name;

    /* Amount of budget.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span> */
    private com.google.api.ads.adwords.axis.v201402.cm.Money amount;

    private com.google.api.ads.adwords.axis.v201402.video.VideoBudgetBudgetDeliveryMethod deliveryMethod;

    /* If true, this budget was created through the BudgetService
     *                 or through the UI shared library with the purpose
     * of sharing
     *                 this budget across one or more campaigns.
     *                 <p>If false, this budget was created with the intention
     * to be
     *                 dedicatedly used with a single campaign, and the Budget's
     * name
     *                 and status will stay in the sync with the associated
     * Campaign's name
     *                 and status. Sharing this budget with a second Campaign
     * will flip
     *                 this field to true.</p> */
    private java.lang.Boolean isExplicitlyShared;

    public VideoBudget() {
    }

    public VideoBudget(
           java.lang.Long budgetId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201402.cm.Money amount,
           com.google.api.ads.adwords.axis.v201402.video.VideoBudgetBudgetDeliveryMethod deliveryMethod,
           java.lang.Boolean isExplicitlyShared) {
           this.budgetId = budgetId;
           this.name = name;
           this.amount = amount;
           this.deliveryMethod = deliveryMethod;
           this.isExplicitlyShared = isExplicitlyShared;
    }


    /**
     * Gets the budgetId value for this VideoBudget.
     * 
     * @return budgetId   * The ID of this budget.
     *                 
     *                 <p>Note: For the case of shared (e.g. Campaign Summary)
     * budgets, the
     *                 budgetId may be null.
     */
    public java.lang.Long getBudgetId() {
        return budgetId;
    }


    /**
     * Sets the budgetId value for this VideoBudget.
     * 
     * @param budgetId   * The ID of this budget.
     *                 
     *                 <p>Note: For the case of shared (e.g. Campaign Summary)
     * budgets, the
     *                 budgetId may be null.
     */
    public void setBudgetId(java.lang.Long budgetId) {
        this.budgetId = budgetId;
    }


    /**
     * Gets the name value for this VideoBudget.
     * 
     * @return name   * Name of the Budget. Every Budget must have a non-null non-empty
     * name. In addition, all budget
     *                 names owned by an account must be distinct.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VideoBudget.
     * 
     * @param name   * Name of the Budget. Every Budget must have a non-null non-empty
     * name. In addition, all budget
     *                 names owned by an account must be distinct.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 255, inclusive.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the amount value for this VideoBudget.
     * 
     * @return amount   * Amount of budget.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this VideoBudget.
     * 
     * @param amount   * Amount of budget.
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span>
     */
    public void setAmount(com.google.api.ads.adwords.axis.v201402.cm.Money amount) {
        this.amount = amount;
    }


    /**
     * Gets the deliveryMethod value for this VideoBudget.
     * 
     * @return deliveryMethod
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoBudgetBudgetDeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }


    /**
     * Sets the deliveryMethod value for this VideoBudget.
     * 
     * @param deliveryMethod
     */
    public void setDeliveryMethod(com.google.api.ads.adwords.axis.v201402.video.VideoBudgetBudgetDeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }


    /**
     * Gets the isExplicitlyShared value for this VideoBudget.
     * 
     * @return isExplicitlyShared   * If true, this budget was created through the BudgetService
     *                 or through the UI shared library with the purpose
     * of sharing
     *                 this budget across one or more campaigns.
     *                 <p>If false, this budget was created with the intention
     * to be
     *                 dedicatedly used with a single campaign, and the Budget's
     * name
     *                 and status will stay in the sync with the associated
     * Campaign's name
     *                 and status. Sharing this budget with a second Campaign
     * will flip
     *                 this field to true.</p>
     */
    public java.lang.Boolean getIsExplicitlyShared() {
        return isExplicitlyShared;
    }


    /**
     * Sets the isExplicitlyShared value for this VideoBudget.
     * 
     * @param isExplicitlyShared   * If true, this budget was created through the BudgetService
     *                 or through the UI shared library with the purpose
     * of sharing
     *                 this budget across one or more campaigns.
     *                 <p>If false, this budget was created with the intention
     * to be
     *                 dedicatedly used with a single campaign, and the Budget's
     * name
     *                 and status will stay in the sync with the associated
     * Campaign's name
     *                 and status. Sharing this budget with a second Campaign
     * will flip
     *                 this field to true.</p>
     */
    public void setIsExplicitlyShared(java.lang.Boolean isExplicitlyShared) {
        this.isExplicitlyShared = isExplicitlyShared;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoBudget)) return false;
        VideoBudget other = (VideoBudget) obj;
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
            ((this.isExplicitlyShared==null && other.getIsExplicitlyShared()==null) || 
             (this.isExplicitlyShared!=null &&
              this.isExplicitlyShared.equals(other.getIsExplicitlyShared())));
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
        if (getIsExplicitlyShared() != null) {
            _hashCode += getIsExplicitlyShared().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoBudget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoBudget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "budgetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "deliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoBudget.BudgetDeliveryMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExplicitlyShared");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "isExplicitlyShared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
