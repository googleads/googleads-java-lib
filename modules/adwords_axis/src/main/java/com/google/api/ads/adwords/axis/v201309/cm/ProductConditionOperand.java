/**
 * ProductConditionOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Attribute for the product condition.
 */
public class ProductConditionOperand  implements java.io.Serializable {
    /* Only following values are allowed as Operand :
     *                 <ul><li>id</li>
     *                 <li>product_type</li>
     *                 <li>brand</li>
     *                 <li>adwords_grouping</li>
     *                 <li>condition</li>
     *                 <li>adwords_labels</li></ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Operand".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String operand;

    public ProductConditionOperand() {
    }

    public ProductConditionOperand(
           java.lang.String operand) {
           this.operand = operand;
    }


    /**
     * Gets the operand value for this ProductConditionOperand.
     * 
     * @return operand   * Only following values are allowed as Operand :
     *                 <ul><li>id</li>
     *                 <li>product_type</li>
     *                 <li>brand</li>
     *                 <li>adwords_grouping</li>
     *                 <li>condition</li>
     *                 <li>adwords_labels</li></ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Operand".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this ProductConditionOperand.
     * 
     * @param operand   * Only following values are allowed as Operand :
     *                 <ul><li>id</li>
     *                 <li>product_type</li>
     *                 <li>brand</li>
     *                 <li>adwords_grouping</li>
     *                 <li>condition</li>
     *                 <li>adwords_labels</li></ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Operand".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setOperand(java.lang.String operand) {
        this.operand = operand;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductConditionOperand)) return false;
        ProductConditionOperand other = (ProductConditionOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operand==null && other.getOperand()==null) || 
             (this.operand!=null &&
              this.operand.equals(other.getOperand())));
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
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductConditionOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ProductConditionOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "operand"));
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
