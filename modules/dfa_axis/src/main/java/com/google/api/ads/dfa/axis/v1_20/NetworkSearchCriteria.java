/**
 * NetworkSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class NetworkSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.ActiveFilter activeFilter;

    private com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder;

    public NetworkSearchCriteria() {
    }

    public NetworkSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           com.google.api.ads.dfa.axis.v1_20.ActiveFilter activeFilter,
           com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.activeFilter = activeFilter;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the activeFilter value for this NetworkSearchCriteria.
     * 
     * @return activeFilter
     */
    public com.google.api.ads.dfa.axis.v1_20.ActiveFilter getActiveFilter() {
        return activeFilter;
    }


    /**
     * Sets the activeFilter value for this NetworkSearchCriteria.
     * 
     * @param activeFilter
     */
    public void setActiveFilter(com.google.api.ads.dfa.axis.v1_20.ActiveFilter activeFilter) {
        this.activeFilter = activeFilter;
    }


    /**
     * Gets the sortOrder value for this NetworkSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_20.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this NetworkSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkSearchCriteria)) return false;
        NetworkSearchCriteria other = (NetworkSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activeFilter==null && other.getActiveFilter()==null) || 
             (this.activeFilter!=null &&
              this.activeFilter.equals(other.getActiveFilter()))) &&
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
        if (getActiveFilter() != null) {
            _hashCode += getActiveFilter().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "NetworkSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ActiveFilter"));
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
