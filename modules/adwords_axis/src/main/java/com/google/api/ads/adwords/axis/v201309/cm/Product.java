/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Product targeting criteria, represents a filter for products in
 * the
 *             product feed that is defined by the advertiser. The criteria
 * is used to
 *             determine the products in a Merchant Center account to
 * be used with the
 *             ProductAds in the AdGroup. This criteria is available
 * only to some advertisers.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class Product  extends com.google.api.ads.adwords.axis.v201309.cm.Criterion  implements java.io.Serializable {
    /* Product filter conditions. The condition in the product criteria
     * is
     *                     defined as {operand1=argument1,operand2=argument2}.
     * The product conditions are anded to evaluate the targeting parameter.
     * {@code null} conditions means that all products are targeted. */
    private com.google.api.ads.adwords.axis.v201309.cm.ProductCondition[] conditions;

    /* Product criteria parameter
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Text".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private java.lang.String text;

    public Product() {
    }

    public Product(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201309.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201309.cm.ProductCondition[] conditions,
           java.lang.String text) {
        super(
            id,
            type,
            criterionType);
        this.conditions = conditions;
        this.text = text;
    }


    /**
     * Gets the conditions value for this Product.
     * 
     * @return conditions   * Product filter conditions. The condition in the product criteria
     * is
     *                     defined as {operand1=argument1,operand2=argument2}.
     * The product conditions are anded to evaluate the targeting parameter.
     * {@code null} conditions means that all products are targeted.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.ProductCondition[] getConditions() {
        return conditions;
    }


    /**
     * Sets the conditions value for this Product.
     * 
     * @param conditions   * Product filter conditions. The condition in the product criteria
     * is
     *                     defined as {operand1=argument1,operand2=argument2}.
     * The product conditions are anded to evaluate the targeting parameter.
     * {@code null} conditions means that all products are targeted.
     */
    public void setConditions(com.google.api.ads.adwords.axis.v201309.cm.ProductCondition[] conditions) {
        this.conditions = conditions;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.ProductCondition getConditions(int i) {
        return this.conditions[i];
    }

    public void setConditions(int i, com.google.api.ads.adwords.axis.v201309.cm.ProductCondition _value) {
        this.conditions[i] = _value;
    }


    /**
     * Gets the text value for this Product.
     * 
     * @return text   * Product criteria parameter
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Text".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Product.
     * 
     * @param text   * Product criteria parameter
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Text".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.conditions==null && other.getConditions()==null) || 
             (this.conditions!=null &&
              java.util.Arrays.equals(this.conditions, other.getConditions()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConditions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "conditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ProductCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "text"));
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
