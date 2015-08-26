/**
 * PagedRecordSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public abstract class PagedRecordSet  implements java.io.Serializable {
    private int pageNumber;

    private int totalNumberOfPages;

    private int totalNumberOfRecords;

    public PagedRecordSet() {
    }

    public PagedRecordSet(
           int pageNumber,
           int totalNumberOfPages,
           int totalNumberOfRecords) {
           this.pageNumber = pageNumber;
           this.totalNumberOfPages = totalNumberOfPages;
           this.totalNumberOfRecords = totalNumberOfRecords;
    }


    /**
     * Gets the pageNumber value for this PagedRecordSet.
     * 
     * @return pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this PagedRecordSet.
     * 
     * @param pageNumber
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the totalNumberOfPages value for this PagedRecordSet.
     * 
     * @return totalNumberOfPages
     */
    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }


    /**
     * Sets the totalNumberOfPages value for this PagedRecordSet.
     * 
     * @param totalNumberOfPages
     */
    public void setTotalNumberOfPages(int totalNumberOfPages) {
        this.totalNumberOfPages = totalNumberOfPages;
    }


    /**
     * Gets the totalNumberOfRecords value for this PagedRecordSet.
     * 
     * @return totalNumberOfRecords
     */
    public int getTotalNumberOfRecords() {
        return totalNumberOfRecords;
    }


    /**
     * Sets the totalNumberOfRecords value for this PagedRecordSet.
     * 
     * @param totalNumberOfRecords
     */
    public void setTotalNumberOfRecords(int totalNumberOfRecords) {
        this.totalNumberOfRecords = totalNumberOfRecords;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagedRecordSet)) return false;
        PagedRecordSet other = (PagedRecordSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.pageNumber == other.getPageNumber() &&
            this.totalNumberOfPages == other.getTotalNumberOfPages() &&
            this.totalNumberOfRecords == other.getTotalNumberOfRecords();
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
        _hashCode += getPageNumber();
        _hashCode += getTotalNumberOfPages();
        _hashCode += getTotalNumberOfRecords();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagedRecordSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PagedRecordSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfPages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalNumberOfPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumberOfRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalNumberOfRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
