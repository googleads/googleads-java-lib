/**
 * UserSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class UserSearchCriteria  extends com.google.api.ads.dfa.axis.v1_19.PageableSearchCriteriaBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter;

    private com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder;

    private long subnetworkId;

    private long userRoleId;

    public UserSearchCriteria() {
    }

    public UserSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter,
           com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder,
           long subnetworkId,
           long userRoleId) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.activeFilter = activeFilter;
        this.sortOrder = sortOrder;
        this.subnetworkId = subnetworkId;
        this.userRoleId = userRoleId;
    }


    /**
     * Gets the activeFilter value for this UserSearchCriteria.
     * 
     * @return activeFilter
     */
    public com.google.api.ads.dfa.axis.v1_19.ActiveFilter getActiveFilter() {
        return activeFilter;
    }


    /**
     * Sets the activeFilter value for this UserSearchCriteria.
     * 
     * @param activeFilter
     */
    public void setActiveFilter(com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter) {
        this.activeFilter = activeFilter;
    }


    /**
     * Gets the sortOrder value for this UserSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_19.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this UserSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the subnetworkId value for this UserSearchCriteria.
     * 
     * @return subnetworkId
     */
    public long getSubnetworkId() {
        return subnetworkId;
    }


    /**
     * Sets the subnetworkId value for this UserSearchCriteria.
     * 
     * @param subnetworkId
     */
    public void setSubnetworkId(long subnetworkId) {
        this.subnetworkId = subnetworkId;
    }


    /**
     * Gets the userRoleId value for this UserSearchCriteria.
     * 
     * @return userRoleId
     */
    public long getUserRoleId() {
        return userRoleId;
    }


    /**
     * Sets the userRoleId value for this UserSearchCriteria.
     * 
     * @param userRoleId
     */
    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSearchCriteria)) return false;
        UserSearchCriteria other = (UserSearchCriteria) obj;
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
              this.sortOrder.equals(other.getSortOrder()))) &&
            this.subnetworkId == other.getSubnetworkId() &&
            this.userRoleId == other.getUserRoleId();
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
        _hashCode += new Long(getSubnetworkId()).hashCode();
        _hashCode += new Long(getUserRoleId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ActiveFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SortOrder"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subnetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
