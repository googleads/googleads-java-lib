/**
 * OrderBy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;


/**
 * Specifies how the resulting information should be sorted.
 */
public class OrderBy  implements java.io.Serializable {
    /* The field to sort the results on.
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span> */
    private java.lang.String field;

    /* The order to sort the results on. The default sort order is
     * {@link SortOrder#ASCENDING}. */
    private com.google.api.ads.ddp.axis.v201603.dmp.SortOrder sortOrder;

    public OrderBy() {
    }

    public OrderBy(
           java.lang.String field,
           com.google.api.ads.ddp.axis.v201603.dmp.SortOrder sortOrder) {
           this.field = field;
           this.sortOrder = sortOrder;
    }


    /**
     * Gets the field value for this OrderBy.
     * 
     * @return field   * The field to sort the results on.
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span>
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this OrderBy.
     * 
     * @param field   * The field to sort the results on.
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span>
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the sortOrder value for this OrderBy.
     * 
     * @return sortOrder   * The order to sort the results on. The default sort order is
     * {@link SortOrder#ASCENDING}.
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this OrderBy.
     * 
     * @param sortOrder   * The order to sort the results on. The default sort order is
     * {@link SortOrder#ASCENDING}.
     */
    public void setSortOrder(com.google.api.ads.ddp.axis.v201603.dmp.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderBy)) return false;
        OrderBy other = (OrderBy) obj;
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
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder())));
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
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderBy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "OrderBy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "SortOrder"));
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
