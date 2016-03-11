/**
 * ProductService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.express;


/**
 * A {@link Criterion} which describes the product or service an Ad
 * is targeting. A product and
 *             service criterion can be used to derive a group of {@link
 * KeywordSet} by AdWords Express.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class ProductService  extends com.google.api.ads.adwords.axis.v201601.cm.Criterion  implements java.io.Serializable {
    /* Text of the product service.
     *                     
     *                     <p>Please note that only {@link com.google.ads.api.services.common.selector.Operator.EQUALS}
     * is
     *                     supported.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ProductServiceText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span> */
    private java.lang.String text;

    /* Input locale of the product service text (e.g. "en_US").
     *                     
     *                     <p>Please note that only {@link com.google.ads.api.services.common.selector.Operator.EQUALS}
     * is
     *                     supported.
     *                     <p>This field is required for
     *                     {@link com.google.ads.api.services.express.productservice.ProductServiceService}.
     * <span class="constraint Filterable">This field can be filtered on
     * using the value "Locale".</span> */
    private java.lang.String locale;

    public ProductService() {
    }

    public ProductService(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201601.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String text,
           java.lang.String locale) {
        super(
            id,
            type,
            criterionType);
        this.text = text;
        this.locale = locale;
    }


    /**
     * Gets the text value for this ProductService.
     * 
     * @return text   * Text of the product service.
     *                     
     *                     <p>Please note that only {@link com.google.ads.api.services.common.selector.Operator.EQUALS}
     * is
     *                     supported.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ProductServiceText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this ProductService.
     * 
     * @param text   * Text of the product service.
     *                     
     *                     <p>Please note that only {@link com.google.ads.api.services.common.selector.Operator.EQUALS}
     * is
     *                     supported.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ProductServiceText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the locale value for this ProductService.
     * 
     * @return locale   * Input locale of the product service text (e.g. "en_US").
     *                     
     *                     <p>Please note that only {@link com.google.ads.api.services.common.selector.Operator.EQUALS}
     * is
     *                     supported.
     *                     <p>This field is required for
     *                     {@link com.google.ads.api.services.express.productservice.ProductServiceService}.
     * <span class="constraint Filterable">This field can be filtered on
     * using the value "Locale".</span>
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this ProductService.
     * 
     * @param locale   * Input locale of the product service text (e.g. "en_US").
     *                     
     *                     <p>Please note that only {@link com.google.ads.api.services.common.selector.Operator.EQUALS}
     * is
     *                     supported.
     *                     <p>This field is required for
     *                     {@link com.google.ads.api.services.express.productservice.ProductServiceService}.
     * <span class="constraint Filterable">This field can be filtered on
     * using the value "Locale".</span>
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductService)) return false;
        ProductService other = (ProductService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "ProductService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "locale"));
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
