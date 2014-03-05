/**
 * CreativeGroupSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeGroupSearchCriteria  extends com.google.api.ads.dfa.axis.v1_19.SearchCriteriaBase  implements java.io.Serializable {
    private long[] advertiserIds;

    private int groupNumber;

    public CreativeGroupSearchCriteria() {
    }

    public CreativeGroupSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           long[] advertiserIds,
           int groupNumber) {
        super(
            ids,
            searchString);
        this.advertiserIds = advertiserIds;
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the advertiserIds value for this CreativeGroupSearchCriteria.
     * 
     * @return advertiserIds
     */
    public long[] getAdvertiserIds() {
        return advertiserIds;
    }


    /**
     * Sets the advertiserIds value for this CreativeGroupSearchCriteria.
     * 
     * @param advertiserIds
     */
    public void setAdvertiserIds(long[] advertiserIds) {
        this.advertiserIds = advertiserIds;
    }


    /**
     * Gets the groupNumber value for this CreativeGroupSearchCriteria.
     * 
     * @return groupNumber
     */
    public int getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this CreativeGroupSearchCriteria.
     * 
     * @param groupNumber
     */
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeGroupSearchCriteria)) return false;
        CreativeGroupSearchCriteria other = (CreativeGroupSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.advertiserIds==null && other.getAdvertiserIds()==null) || 
             (this.advertiserIds!=null &&
              java.util.Arrays.equals(this.advertiserIds, other.getAdvertiserIds()))) &&
            this.groupNumber == other.getGroupNumber();
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
        if (getAdvertiserIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdvertiserIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdvertiserIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getGroupNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeGroupSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeGroupSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupNumber"));
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
