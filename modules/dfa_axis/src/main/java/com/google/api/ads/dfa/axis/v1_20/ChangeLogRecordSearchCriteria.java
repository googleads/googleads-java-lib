/**
 * ChangeLogRecordSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class ChangeLogRecordSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private long objectId;

    private long objectTypeId;

    private com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder;

    public ChangeLogRecordSearchCriteria() {
    }

    public ChangeLogRecordSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           long objectId,
           long objectTypeId,
           com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.objectId = objectId;
        this.objectTypeId = objectTypeId;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the objectId value for this ChangeLogRecordSearchCriteria.
     * 
     * @return objectId
     */
    public long getObjectId() {
        return objectId;
    }


    /**
     * Sets the objectId value for this ChangeLogRecordSearchCriteria.
     * 
     * @param objectId
     */
    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }


    /**
     * Gets the objectTypeId value for this ChangeLogRecordSearchCriteria.
     * 
     * @return objectTypeId
     */
    public long getObjectTypeId() {
        return objectTypeId;
    }


    /**
     * Sets the objectTypeId value for this ChangeLogRecordSearchCriteria.
     * 
     * @param objectTypeId
     */
    public void setObjectTypeId(long objectTypeId) {
        this.objectTypeId = objectTypeId;
    }


    /**
     * Gets the sortOrder value for this ChangeLogRecordSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_20.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this ChangeLogRecordSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeLogRecordSearchCriteria)) return false;
        ChangeLogRecordSearchCriteria other = (ChangeLogRecordSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.objectId == other.getObjectId() &&
            this.objectTypeId == other.getObjectTypeId() &&
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
        _hashCode += new Long(getObjectId()).hashCode();
        _hashCode += new Long(getObjectTypeId()).hashCode();
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeLogRecordSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ChangeLogRecordSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objectTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
