/**
 * Predicate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;


/**
 * Specifies how an entity (eg. adgroup, campaign, criterion, ad)
 * should be filtered.
 */
public class Predicate  implements java.io.Serializable {
    /* The field by which to filter the returned data. Possible values
     * are marked Filterable on
     *                 the entity's reference page. For example, for predicates
     * for the
     *                 CampaignService {@link Selector selector}, refer to
     * the filterable fields from the
     *                 {@link Campaign} reference page.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String field;

    /* The operator to use for filtering the data returned.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.ddp.axis.v201603.provider.PredicateOperator operator;

    /* The values by which to filter the field. The {@link Operator#CONTAINS_ALL},
     * {@link Operator#CONTAINS_ANY}, {@link Operator#CONTAINS_NONE}, {@link
     * Operator#IN}
     *                 and {@link Operator#NOT_IN} take multiple values.
     * All others take a single value.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String[] values;

    public Predicate() {
    }

    public Predicate(
           java.lang.String field,
           com.google.api.ads.ddp.axis.v201603.provider.PredicateOperator operator,
           java.lang.String[] values) {
           this.field = field;
           this.operator = operator;
           this.values = values;
    }


    /**
     * Gets the field value for this Predicate.
     * 
     * @return field   * The field by which to filter the returned data. Possible values
     * are marked Filterable on
     *                 the entity's reference page. For example, for predicates
     * for the
     *                 CampaignService {@link Selector selector}, refer to
     * the filterable fields from the
     *                 {@link Campaign} reference page.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this Predicate.
     * 
     * @param field   * The field by which to filter the returned data. Possible values
     * are marked Filterable on
     *                 the entity's reference page. For example, for predicates
     * for the
     *                 CampaignService {@link Selector selector}, refer to
     * the filterable fields from the
     *                 {@link Campaign} reference page.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the operator value for this Predicate.
     * 
     * @return operator   * The operator to use for filtering the data returned.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.ddp.axis.v201603.provider.PredicateOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this Predicate.
     * 
     * @param operator   * The operator to use for filtering the data returned.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setOperator(com.google.api.ads.ddp.axis.v201603.provider.PredicateOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the values value for this Predicate.
     * 
     * @return values   * The values by which to filter the field. The {@link Operator#CONTAINS_ALL},
     * {@link Operator#CONTAINS_ANY}, {@link Operator#CONTAINS_NONE}, {@link
     * Operator#IN}
     *                 and {@link Operator#NOT_IN} take multiple values.
     * All others take a single value.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this Predicate.
     * 
     * @param values   * The values by which to filter the field. The {@link Operator#CONTAINS_ALL},
     * {@link Operator#CONTAINS_ANY}, {@link Operator#CONTAINS_NONE}, {@link
     * Operator#IN}
     *                 and {@link Operator#NOT_IN} take multiple values.
     * All others take a single value.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setValues(java.lang.String[] values) {
        this.values = values;
    }

    public java.lang.String getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, java.lang.String _value) {
        this.values[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Predicate)) return false;
        Predicate other = (Predicate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Predicate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "Predicate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "Predicate.Operator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
