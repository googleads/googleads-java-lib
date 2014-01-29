/**
 * ContactSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class ContactSearchCriteria  extends com.google.api.ads.dfa.axis.v1_19.PageableSearchCriteriaBase  implements java.io.Serializable {
    private boolean includeParentContacts;

    private long[] siteDirectorySiteIds;

    private com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder;

    public ContactSearchCriteria() {
    }

    public ContactSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           boolean includeParentContacts,
           long[] siteDirectorySiteIds,
           com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.includeParentContacts = includeParentContacts;
        this.siteDirectorySiteIds = siteDirectorySiteIds;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the includeParentContacts value for this ContactSearchCriteria.
     * 
     * @return includeParentContacts
     */
    public boolean isIncludeParentContacts() {
        return includeParentContacts;
    }


    /**
     * Sets the includeParentContacts value for this ContactSearchCriteria.
     * 
     * @param includeParentContacts
     */
    public void setIncludeParentContacts(boolean includeParentContacts) {
        this.includeParentContacts = includeParentContacts;
    }


    /**
     * Gets the siteDirectorySiteIds value for this ContactSearchCriteria.
     * 
     * @return siteDirectorySiteIds
     */
    public long[] getSiteDirectorySiteIds() {
        return siteDirectorySiteIds;
    }


    /**
     * Sets the siteDirectorySiteIds value for this ContactSearchCriteria.
     * 
     * @param siteDirectorySiteIds
     */
    public void setSiteDirectorySiteIds(long[] siteDirectorySiteIds) {
        this.siteDirectorySiteIds = siteDirectorySiteIds;
    }


    /**
     * Gets the sortOrder value for this ContactSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_19.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this ContactSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactSearchCriteria)) return false;
        ContactSearchCriteria other = (ContactSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.includeParentContacts == other.isIncludeParentContacts() &&
            ((this.siteDirectorySiteIds==null && other.getSiteDirectorySiteIds()==null) || 
             (this.siteDirectorySiteIds!=null &&
              java.util.Arrays.equals(this.siteDirectorySiteIds, other.getSiteDirectorySiteIds()))) &&
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
        _hashCode += (isIncludeParentContacts() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSiteDirectorySiteIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSiteDirectorySiteIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSiteDirectorySiteIds(), i);
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
        new org.apache.axis.description.TypeDesc(ContactSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ContactSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeParentContacts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeParentContacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteDirectorySiteIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteDirectorySiteIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SortOrder"));
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
