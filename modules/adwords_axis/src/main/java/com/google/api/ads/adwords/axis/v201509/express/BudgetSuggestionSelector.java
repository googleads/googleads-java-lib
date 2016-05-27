/**
 * BudgetSuggestionSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.express;


/**
 * A selector for budget suggestion
 */
public class BudgetSuggestionSelector  implements java.io.Serializable {
    /* Criteria for budget suggestion. The following criteria are
     * supported:
     *                 <ul>
     *                 <li>{@link ProductService}</li>
     *                 <li>{@link Language}</li>
     *                 <li>{@link Location}</li>
     *                 <li>{@link Proximity}</li>
     *                 </ul>
     *                 
     *                 <p>Please note that
     *                 {@link Address} is not supported in {@link Proximity}.
     * Please use
     *                 {@link GeoPoint} instead.
     *                 
     *                 {@link ProductService}, {@link Language}, and at least
     * one of
     *                 {@link Location} and {@link Proximity} must be given,
     * otherwise default
     *                 suggestion will be returned.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201509.cm.Criterion[] criteria;

    /* The currencyCode of budget suggestion. If null, the account's
     * currency will be used. */
    private com.google.api.ads.adwords.axis.v201509.express.CurrencyCode currencyCode;

    public BudgetSuggestionSelector() {
    }

    public BudgetSuggestionSelector(
           com.google.api.ads.adwords.axis.v201509.cm.Criterion[] criteria,
           com.google.api.ads.adwords.axis.v201509.express.CurrencyCode currencyCode) {
           this.criteria = criteria;
           this.currencyCode = currencyCode;
    }


    /**
     * Gets the criteria value for this BudgetSuggestionSelector.
     * 
     * @return criteria   * Criteria for budget suggestion. The following criteria are
     * supported:
     *                 <ul>
     *                 <li>{@link ProductService}</li>
     *                 <li>{@link Language}</li>
     *                 <li>{@link Location}</li>
     *                 <li>{@link Proximity}</li>
     *                 </ul>
     *                 
     *                 <p>Please note that
     *                 {@link Address} is not supported in {@link Proximity}.
     * Please use
     *                 {@link GeoPoint} instead.
     *                 
     *                 {@link ProductService}, {@link Language}, and at least
     * one of
     *                 {@link Location} and {@link Proximity} must be given,
     * otherwise default
     *                 suggestion will be returned.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201509.cm.Criterion[] getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this BudgetSuggestionSelector.
     * 
     * @param criteria   * Criteria for budget suggestion. The following criteria are
     * supported:
     *                 <ul>
     *                 <li>{@link ProductService}</li>
     *                 <li>{@link Language}</li>
     *                 <li>{@link Location}</li>
     *                 <li>{@link Proximity}</li>
     *                 </ul>
     *                 
     *                 <p>Please note that
     *                 {@link Address} is not supported in {@link Proximity}.
     * Please use
     *                 {@link GeoPoint} instead.
     *                 
     *                 {@link ProductService}, {@link Language}, and at least
     * one of
     *                 {@link Location} and {@link Proximity} must be given,
     * otherwise default
     *                 suggestion will be returned.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCriteria(com.google.api.ads.adwords.axis.v201509.cm.Criterion[] criteria) {
        this.criteria = criteria;
    }

    public com.google.api.ads.adwords.axis.v201509.cm.Criterion getCriteria(int i) {
        return this.criteria[i];
    }

    public void setCriteria(int i, com.google.api.ads.adwords.axis.v201509.cm.Criterion _value) {
        this.criteria[i] = _value;
    }


    /**
     * Gets the currencyCode value for this BudgetSuggestionSelector.
     * 
     * @return currencyCode   * The currencyCode of budget suggestion. If null, the account's
     * currency will be used.
     */
    public com.google.api.ads.adwords.axis.v201509.express.CurrencyCode getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this BudgetSuggestionSelector.
     * 
     * @param currencyCode   * The currencyCode of budget suggestion. If null, the account's
     * currency will be used.
     */
    public void setCurrencyCode(com.google.api.ads.adwords.axis.v201509.express.CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetSuggestionSelector)) return false;
        BudgetSuggestionSelector other = (BudgetSuggestionSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              java.util.Arrays.equals(this.criteria, other.getCriteria()))) &&
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
        if (getCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetSuggestionSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201509", "BudgetSuggestionSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201509", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "Criterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201509", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201509", "CurrencyCode"));
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
