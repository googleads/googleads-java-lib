/**
 * Sorting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Specifies the sorting of the results of a get.
 */
public class Sorting  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201402.video.Sortable field;

    private com.google.api.ads.adwords.axis.v201402.video.SortOrder sortOrder;

    private com.google.api.ads.adwords.axis.v201402.video.Sortable[] fields;

    private com.google.api.ads.adwords.axis.v201402.video.SortOrder[] sortOrders;

    public Sorting() {
    }

    public Sorting(
           com.google.api.ads.adwords.axis.v201402.video.Sortable field,
           com.google.api.ads.adwords.axis.v201402.video.SortOrder sortOrder,
           com.google.api.ads.adwords.axis.v201402.video.Sortable[] fields,
           com.google.api.ads.adwords.axis.v201402.video.SortOrder[] sortOrders) {
           this.field = field;
           this.sortOrder = sortOrder;
           this.fields = fields;
           this.sortOrders = sortOrders;
    }


    /**
     * Gets the field value for this Sorting.
     * 
     * @return field
     */
    public com.google.api.ads.adwords.axis.v201402.video.Sortable getField() {
        return field;
    }


    /**
     * Sets the field value for this Sorting.
     * 
     * @param field
     */
    public void setField(com.google.api.ads.adwords.axis.v201402.video.Sortable field) {
        this.field = field;
    }


    /**
     * Gets the sortOrder value for this Sorting.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.adwords.axis.v201402.video.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this Sorting.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.adwords.axis.v201402.video.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the fields value for this Sorting.
     * 
     * @return fields
     */
    public com.google.api.ads.adwords.axis.v201402.video.Sortable[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this Sorting.
     * 
     * @param fields
     */
    public void setFields(com.google.api.ads.adwords.axis.v201402.video.Sortable[] fields) {
        this.fields = fields;
    }

    public com.google.api.ads.adwords.axis.v201402.video.Sortable getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.google.api.ads.adwords.axis.v201402.video.Sortable _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the sortOrders value for this Sorting.
     * 
     * @return sortOrders
     */
    public com.google.api.ads.adwords.axis.v201402.video.SortOrder[] getSortOrders() {
        return sortOrders;
    }


    /**
     * Sets the sortOrders value for this Sorting.
     * 
     * @param sortOrders
     */
    public void setSortOrders(com.google.api.ads.adwords.axis.v201402.video.SortOrder[] sortOrders) {
        this.sortOrders = sortOrders;
    }

    public com.google.api.ads.adwords.axis.v201402.video.SortOrder getSortOrders(int i) {
        return this.sortOrders[i];
    }

    public void setSortOrders(int i, com.google.api.ads.adwords.axis.v201402.video.SortOrder _value) {
        this.sortOrders[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sorting)) return false;
        Sorting other = (Sorting) obj;
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
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.sortOrders==null && other.getSortOrders()==null) || 
             (this.sortOrders!=null &&
              java.util.Arrays.equals(this.sortOrders, other.getSortOrders())));
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
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSortOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSortOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSortOrders(), i);
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
        new org.apache.axis.description.TypeDesc(Sorting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "Sorting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "Sortable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "SortOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "Sortable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "sortOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "SortOrder"));
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
