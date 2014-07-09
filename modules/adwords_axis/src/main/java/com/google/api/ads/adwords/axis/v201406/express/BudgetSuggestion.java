/**
 * BudgetSuggestion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.express;


/**
 * A budget suggestion and its associated data (all are estimates).
 */
public class BudgetSuggestion  implements java.io.Serializable {
    /* Estimated cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money cpc;

    /* Minimum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money minCpc;

    /* Maximum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money maxCpc;

    /* Estimated CPM.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money cpm;

    /* Suggested budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money suggestedBudget;

    /* Minimum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money minBudget;

    /* Maximum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money maxBudget;

    /* Budget quantiles, ascending budget amounts at evenly segmented
     * percentage intervals over ads
     *                 competitors.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money[] budgetQuantiles;

    /* Number of impressions.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long impressions;

    public BudgetSuggestion() {
    }

    public BudgetSuggestion(
           com.google.api.ads.adwords.axis.v201406.cm.Money cpc,
           com.google.api.ads.adwords.axis.v201406.cm.Money minCpc,
           com.google.api.ads.adwords.axis.v201406.cm.Money maxCpc,
           com.google.api.ads.adwords.axis.v201406.cm.Money cpm,
           com.google.api.ads.adwords.axis.v201406.cm.Money suggestedBudget,
           com.google.api.ads.adwords.axis.v201406.cm.Money minBudget,
           com.google.api.ads.adwords.axis.v201406.cm.Money maxBudget,
           com.google.api.ads.adwords.axis.v201406.cm.Money[] budgetQuantiles,
           java.lang.Long impressions) {
           this.cpc = cpc;
           this.minCpc = minCpc;
           this.maxCpc = maxCpc;
           this.cpm = cpm;
           this.suggestedBudget = suggestedBudget;
           this.minBudget = minBudget;
           this.maxBudget = maxBudget;
           this.budgetQuantiles = budgetQuantiles;
           this.impressions = impressions;
    }


    /**
     * Gets the cpc value for this BudgetSuggestion.
     * 
     * @return cpc   * Estimated cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money getCpc() {
        return cpc;
    }


    /**
     * Sets the cpc value for this BudgetSuggestion.
     * 
     * @param cpc   * Estimated cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCpc(com.google.api.ads.adwords.axis.v201406.cm.Money cpc) {
        this.cpc = cpc;
    }


    /**
     * Gets the minCpc value for this BudgetSuggestion.
     * 
     * @return minCpc   * Minimum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money getMinCpc() {
        return minCpc;
    }


    /**
     * Sets the minCpc value for this BudgetSuggestion.
     * 
     * @param minCpc   * Minimum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMinCpc(com.google.api.ads.adwords.axis.v201406.cm.Money minCpc) {
        this.minCpc = minCpc;
    }


    /**
     * Gets the maxCpc value for this BudgetSuggestion.
     * 
     * @return maxCpc   * Maximum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money getMaxCpc() {
        return maxCpc;
    }


    /**
     * Sets the maxCpc value for this BudgetSuggestion.
     * 
     * @param maxCpc   * Maximum cost per click.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMaxCpc(com.google.api.ads.adwords.axis.v201406.cm.Money maxCpc) {
        this.maxCpc = maxCpc;
    }


    /**
     * Gets the cpm value for this BudgetSuggestion.
     * 
     * @return cpm   * Estimated CPM.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money getCpm() {
        return cpm;
    }


    /**
     * Sets the cpm value for this BudgetSuggestion.
     * 
     * @param cpm   * Estimated CPM.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCpm(com.google.api.ads.adwords.axis.v201406.cm.Money cpm) {
        this.cpm = cpm;
    }


    /**
     * Gets the suggestedBudget value for this BudgetSuggestion.
     * 
     * @return suggestedBudget   * Suggested budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money getSuggestedBudget() {
        return suggestedBudget;
    }


    /**
     * Sets the suggestedBudget value for this BudgetSuggestion.
     * 
     * @param suggestedBudget   * Suggested budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSuggestedBudget(com.google.api.ads.adwords.axis.v201406.cm.Money suggestedBudget) {
        this.suggestedBudget = suggestedBudget;
    }


    /**
     * Gets the minBudget value for this BudgetSuggestion.
     * 
     * @return minBudget   * Minimum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money getMinBudget() {
        return minBudget;
    }


    /**
     * Sets the minBudget value for this BudgetSuggestion.
     * 
     * @param minBudget   * Minimum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMinBudget(com.google.api.ads.adwords.axis.v201406.cm.Money minBudget) {
        this.minBudget = minBudget;
    }


    /**
     * Gets the maxBudget value for this BudgetSuggestion.
     * 
     * @return maxBudget   * Maximum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money getMaxBudget() {
        return maxBudget;
    }


    /**
     * Sets the maxBudget value for this BudgetSuggestion.
     * 
     * @param maxBudget   * Maximum budget.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMaxBudget(com.google.api.ads.adwords.axis.v201406.cm.Money maxBudget) {
        this.maxBudget = maxBudget;
    }


    /**
     * Gets the budgetQuantiles value for this BudgetSuggestion.
     * 
     * @return budgetQuantiles   * Budget quantiles, ascending budget amounts at evenly segmented
     * percentage intervals over ads
     *                 competitors.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money[] getBudgetQuantiles() {
        return budgetQuantiles;
    }


    /**
     * Sets the budgetQuantiles value for this BudgetSuggestion.
     * 
     * @param budgetQuantiles   * Budget quantiles, ascending budget amounts at evenly segmented
     * percentage intervals over ads
     *                 competitors.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBudgetQuantiles(com.google.api.ads.adwords.axis.v201406.cm.Money[] budgetQuantiles) {
        this.budgetQuantiles = budgetQuantiles;
    }

    public com.google.api.ads.adwords.axis.v201406.cm.Money getBudgetQuantiles(int i) {
        return this.budgetQuantiles[i];
    }

    public void setBudgetQuantiles(int i, com.google.api.ads.adwords.axis.v201406.cm.Money _value) {
        this.budgetQuantiles[i] = _value;
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
            ((this.budgetQuantiles==null && other.getBudgetQuantiles()==null) || 
             (this.budgetQuantiles!=null &&
              java.util.Arrays.equals(this.budgetQuantiles, other.getBudgetQuantiles()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions())));
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
        if (getBudgetQuantiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBudgetQuantiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudgetQuantiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetSuggestion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "BudgetSuggestion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "cpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "minCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "maxCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpm");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "cpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "suggestedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "minBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "maxBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetQuantiles");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "budgetQuantiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201406", "impressions"));
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
