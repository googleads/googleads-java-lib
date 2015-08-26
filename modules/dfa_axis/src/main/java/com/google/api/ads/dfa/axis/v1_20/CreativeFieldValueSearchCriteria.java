/**
 * CreativeFieldValueSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeFieldValueSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private long[] creativeFieldIds;

    private com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder;

    public CreativeFieldValueSearchCriteria() {
    }

    public CreativeFieldValueSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           long[] creativeFieldIds,
           com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.creativeFieldIds = creativeFieldIds;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the creativeFieldIds value for this CreativeFieldValueSearchCriteria.
     * 
     * @return creativeFieldIds
     */
    public long[] getCreativeFieldIds() {
        return creativeFieldIds;
    }


    /**
     * Sets the creativeFieldIds value for this CreativeFieldValueSearchCriteria.
     * 
     * @param creativeFieldIds
     */
    public void setCreativeFieldIds(long[] creativeFieldIds) {
        this.creativeFieldIds = creativeFieldIds;
    }


    /**
     * Gets the sortOrder value for this CreativeFieldValueSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_20.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this CreativeFieldValueSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeFieldValueSearchCriteria)) return false;
        CreativeFieldValueSearchCriteria other = (CreativeFieldValueSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creativeFieldIds==null && other.getCreativeFieldIds()==null) || 
             (this.creativeFieldIds!=null &&
              java.util.Arrays.equals(this.creativeFieldIds, other.getCreativeFieldIds()))) &&
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
        int _hashCode = super.hashCode();
        if (getCreativeFieldIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativeFieldIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativeFieldIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeFieldValueSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeFieldValueSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeFieldIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeFieldIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SortOrder"));
        elemField.setNillable(true);
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
