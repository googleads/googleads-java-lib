/**
 * AdvertiserSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class AdvertiserSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private long[] advertiserGroupIds;

    private boolean includeAdvertisersWithOutGroupOnly;

    private boolean includeInventoryAdvertisersOnly;

    private long[] spotIds;

    private long subnetworkId;

    public AdvertiserSearchCriteria() {
    }

    public AdvertiserSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           long[] advertiserGroupIds,
           boolean includeAdvertisersWithOutGroupOnly,
           boolean includeInventoryAdvertisersOnly,
           long[] spotIds,
           long subnetworkId) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.advertiserGroupIds = advertiserGroupIds;
        this.includeAdvertisersWithOutGroupOnly = includeAdvertisersWithOutGroupOnly;
        this.includeInventoryAdvertisersOnly = includeInventoryAdvertisersOnly;
        this.spotIds = spotIds;
        this.subnetworkId = subnetworkId;
    }


    /**
     * Gets the advertiserGroupIds value for this AdvertiserSearchCriteria.
     * 
     * @return advertiserGroupIds
     */
    public long[] getAdvertiserGroupIds() {
        return advertiserGroupIds;
    }


    /**
     * Sets the advertiserGroupIds value for this AdvertiserSearchCriteria.
     * 
     * @param advertiserGroupIds
     */
    public void setAdvertiserGroupIds(long[] advertiserGroupIds) {
        this.advertiserGroupIds = advertiserGroupIds;
    }


    /**
     * Gets the includeAdvertisersWithOutGroupOnly value for this AdvertiserSearchCriteria.
     * 
     * @return includeAdvertisersWithOutGroupOnly
     */
    public boolean isIncludeAdvertisersWithOutGroupOnly() {
        return includeAdvertisersWithOutGroupOnly;
    }


    /**
     * Sets the includeAdvertisersWithOutGroupOnly value for this AdvertiserSearchCriteria.
     * 
     * @param includeAdvertisersWithOutGroupOnly
     */
    public void setIncludeAdvertisersWithOutGroupOnly(boolean includeAdvertisersWithOutGroupOnly) {
        this.includeAdvertisersWithOutGroupOnly = includeAdvertisersWithOutGroupOnly;
    }


    /**
     * Gets the includeInventoryAdvertisersOnly value for this AdvertiserSearchCriteria.
     * 
     * @return includeInventoryAdvertisersOnly
     */
    public boolean isIncludeInventoryAdvertisersOnly() {
        return includeInventoryAdvertisersOnly;
    }


    /**
     * Sets the includeInventoryAdvertisersOnly value for this AdvertiserSearchCriteria.
     * 
     * @param includeInventoryAdvertisersOnly
     */
    public void setIncludeInventoryAdvertisersOnly(boolean includeInventoryAdvertisersOnly) {
        this.includeInventoryAdvertisersOnly = includeInventoryAdvertisersOnly;
    }


    /**
     * Gets the spotIds value for this AdvertiserSearchCriteria.
     * 
     * @return spotIds
     */
    public long[] getSpotIds() {
        return spotIds;
    }


    /**
     * Sets the spotIds value for this AdvertiserSearchCriteria.
     * 
     * @param spotIds
     */
    public void setSpotIds(long[] spotIds) {
        this.spotIds = spotIds;
    }


    /**
     * Gets the subnetworkId value for this AdvertiserSearchCriteria.
     * 
     * @return subnetworkId
     */
    public long getSubnetworkId() {
        return subnetworkId;
    }


    /**
     * Sets the subnetworkId value for this AdvertiserSearchCriteria.
     * 
     * @param subnetworkId
     */
    public void setSubnetworkId(long subnetworkId) {
        this.subnetworkId = subnetworkId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvertiserSearchCriteria)) return false;
        AdvertiserSearchCriteria other = (AdvertiserSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.advertiserGroupIds==null && other.getAdvertiserGroupIds()==null) || 
             (this.advertiserGroupIds!=null &&
              java.util.Arrays.equals(this.advertiserGroupIds, other.getAdvertiserGroupIds()))) &&
            this.includeAdvertisersWithOutGroupOnly == other.isIncludeAdvertisersWithOutGroupOnly() &&
            this.includeInventoryAdvertisersOnly == other.isIncludeInventoryAdvertisersOnly() &&
            ((this.spotIds==null && other.getSpotIds()==null) || 
             (this.spotIds!=null &&
              java.util.Arrays.equals(this.spotIds, other.getSpotIds()))) &&
            this.subnetworkId == other.getSubnetworkId();
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
        if (getAdvertiserGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdvertiserGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdvertiserGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIncludeAdvertisersWithOutGroupOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludeInventoryAdvertisersOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSpotIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpotIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpotIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getSubnetworkId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvertiserSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "AdvertiserSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAdvertisersWithOutGroupOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeAdvertisersWithOutGroupOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInventoryAdvertisersOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeInventoryAdvertisersOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spotIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spotIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subnetworkId"));
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
