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
 * BudgetSuggestion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.express;


/**
 * A budget suggestion and its associated data (all are estimates).
 */
public class BudgetSuggestion  implements java.io.Serializable {
    /* Estimated cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Money cpc;

    /* Minimum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Money minCpc;

    /* Maximum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Money maxCpc;

    /* Estimated CPM.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Money cpm;

    /* Suggested budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Money suggestedBudget;

    /* Minimum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Money minBudget;

    /* Maximum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.cm.Money maxBudget;

    /* Number of impressions.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long impressions;

    /* The suggested currency code to be used if not specified
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201601.express.CurrencyCode currencyCode;

    public BudgetSuggestion() {
    }

    public BudgetSuggestion(
           com.google.api.ads.adwords.axis.v201601.cm.Money cpc,
           com.google.api.ads.adwords.axis.v201601.cm.Money minCpc,
           com.google.api.ads.adwords.axis.v201601.cm.Money maxCpc,
           com.google.api.ads.adwords.axis.v201601.cm.Money cpm,
           com.google.api.ads.adwords.axis.v201601.cm.Money suggestedBudget,
           com.google.api.ads.adwords.axis.v201601.cm.Money minBudget,
           com.google.api.ads.adwords.axis.v201601.cm.Money maxBudget,
           java.lang.Long impressions,
           com.google.api.ads.adwords.axis.v201601.express.CurrencyCode currencyCode) {
           this.cpc = cpc;
           this.minCpc = minCpc;
           this.maxCpc = maxCpc;
           this.cpm = cpm;
           this.suggestedBudget = suggestedBudget;
           this.minBudget = minBudget;
           this.maxBudget = maxBudget;
           this.impressions = impressions;
           this.currencyCode = currencyCode;
    }


    /**
     * Gets the cpc value for this BudgetSuggestion.
     * 
     * @return cpc   * Estimated cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Money getCpc() {
        return cpc;
    }


    /**
     * Sets the cpc value for this BudgetSuggestion.
     * 
     * @param cpc   * Estimated cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCpc(com.google.api.ads.adwords.axis.v201601.cm.Money cpc) {
        this.cpc = cpc;
    }


    /**
     * Gets the minCpc value for this BudgetSuggestion.
     * 
     * @return minCpc   * Minimum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Money getMinCpc() {
        return minCpc;
    }


    /**
     * Sets the minCpc value for this BudgetSuggestion.
     * 
     * @param minCpc   * Minimum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMinCpc(com.google.api.ads.adwords.axis.v201601.cm.Money minCpc) {
        this.minCpc = minCpc;
    }


    /**
     * Gets the maxCpc value for this BudgetSuggestion.
     * 
     * @return maxCpc   * Maximum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Money getMaxCpc() {
        return maxCpc;
    }


    /**
     * Sets the maxCpc value for this BudgetSuggestion.
     * 
     * @param maxCpc   * Maximum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMaxCpc(com.google.api.ads.adwords.axis.v201601.cm.Money maxCpc) {
        this.maxCpc = maxCpc;
    }


    /**
     * Gets the cpm value for this BudgetSuggestion.
     * 
     * @return cpm   * Estimated CPM.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Money getCpm() {
        return cpm;
    }


    /**
     * Sets the cpm value for this BudgetSuggestion.
     * 
     * @param cpm   * Estimated CPM.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCpm(com.google.api.ads.adwords.axis.v201601.cm.Money cpm) {
        this.cpm = cpm;
    }


    /**
     * Gets the suggestedBudget value for this BudgetSuggestion.
     * 
     * @return suggestedBudget   * Suggested budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Money getSuggestedBudget() {
        return suggestedBudget;
    }


    /**
     * Sets the suggestedBudget value for this BudgetSuggestion.
     * 
     * @param suggestedBudget   * Suggested budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSuggestedBudget(com.google.api.ads.adwords.axis.v201601.cm.Money suggestedBudget) {
        this.suggestedBudget = suggestedBudget;
    }


    /**
     * Gets the minBudget value for this BudgetSuggestion.
     * 
     * @return minBudget   * Minimum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Money getMinBudget() {
        return minBudget;
    }


    /**
     * Sets the minBudget value for this BudgetSuggestion.
     * 
     * @param minBudget   * Minimum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMinBudget(com.google.api.ads.adwords.axis.v201601.cm.Money minBudget) {
        this.minBudget = minBudget;
    }


    /**
     * Gets the maxBudget value for this BudgetSuggestion.
     * 
     * @return maxBudget   * Maximum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.cm.Money getMaxBudget() {
        return maxBudget;
    }


    /**
     * Sets the maxBudget value for this BudgetSuggestion.
     * 
     * @param maxBudget   * Maximum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMaxBudget(com.google.api.ads.adwords.axis.v201601.cm.Money maxBudget) {
        this.maxBudget = maxBudget;
    }


    /**
     * Gets the impressions value for this BudgetSuggestion.
     * 
     * @return impressions   * Number of impressions.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this BudgetSuggestion.
     * 
     * @param impressions   * Number of impressions.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }


    /**
     * Gets the currencyCode value for this BudgetSuggestion.
     * 
     * @return currencyCode   * The suggested currency code to be used if not specified
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201601.express.CurrencyCode getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this BudgetSuggestion.
     * 
     * @param currencyCode   * The suggested currency code to be used if not specified
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCurrencyCode(com.google.api.ads.adwords.axis.v201601.express.CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetSuggestion)) return false;
        BudgetSuggestion other = (BudgetSuggestion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpc==null && other.getCpc()==null) || 
             (this.cpc!=null &&
              this.cpc.equals(other.getCpc()))) &&
            ((this.minCpc==null && other.getMinCpc()==null) || 
             (this.minCpc!=null &&
              this.minCpc.equals(other.getMinCpc()))) &&
            ((this.maxCpc==null && other.getMaxCpc()==null) || 
             (this.maxCpc!=null &&
              this.maxCpc.equals(other.getMaxCpc()))) &&
            ((this.cpm==null && other.getCpm()==null) || 
             (this.cpm!=null &&
              this.cpm.equals(other.getCpm()))) &&
            ((this.suggestedBudget==null && other.getSuggestedBudget()==null) || 
             (this.suggestedBudget!=null &&
              this.suggestedBudget.equals(other.getSuggestedBudget()))) &&
            ((this.minBudget==null && other.getMinBudget()==null) || 
             (this.minBudget!=null &&
              this.minBudget.equals(other.getMinBudget()))) &&
            ((this.maxBudget==null && other.getMaxBudget()==null) || 
             (this.maxBudget!=null &&
              this.maxBudget.equals(other.getMaxBudget()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode())));
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
        if (getCpc() != null) {
            _hashCode += getCpc().hashCode();
        }
        if (getMinCpc() != null) {
            _hashCode += getMinCpc().hashCode();
        }
        if (getMaxCpc() != null) {
            _hashCode += getMaxCpc().hashCode();
        }
        if (getCpm() != null) {
            _hashCode += getCpm().hashCode();
        }
        if (getSuggestedBudget() != null) {
            _hashCode += getSuggestedBudget().hashCode();
        }
        if (getMinBudget() != null) {
            _hashCode += getMinBudget().hashCode();
        }
        if (getMaxBudget() != null) {
            _hashCode += getMaxBudget().hashCode();
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetSuggestion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "BudgetSuggestion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "cpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "minCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "maxCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpm");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "cpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "suggestedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "minBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "maxBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "impressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "CurrencyCode"));
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
