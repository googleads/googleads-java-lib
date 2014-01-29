/**
 * DfaSiteSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class DfaSiteSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private long[] SDSiteIds;

    private long[] campaignIds;

    private boolean excludeSitesMappedToSiteDirectory;

    private long networkId;

    private com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder;

    private long subnetworkId;

    public DfaSiteSearchCriteria() {
    }

    public DfaSiteSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           long[] SDSiteIds,
           long[] campaignIds,
           boolean excludeSitesMappedToSiteDirectory,
           long networkId,
           com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder,
           long subnetworkId) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.SDSiteIds = SDSiteIds;
        this.campaignIds = campaignIds;
        this.excludeSitesMappedToSiteDirectory = excludeSitesMappedToSiteDirectory;
        this.networkId = networkId;
        this.sortOrder = sortOrder;
        this.subnetworkId = subnetworkId;
    }


    /**
     * Gets the SDSiteIds value for this DfaSiteSearchCriteria.
     * 
     * @return SDSiteIds
     */
    public long[] getSDSiteIds() {
        return SDSiteIds;
    }


    /**
     * Sets the SDSiteIds value for this DfaSiteSearchCriteria.
     * 
     * @param SDSiteIds
     */
    public void setSDSiteIds(long[] SDSiteIds) {
        this.SDSiteIds = SDSiteIds;
    }


    /**
     * Gets the campaignIds value for this DfaSiteSearchCriteria.
     * 
     * @return campaignIds
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this DfaSiteSearchCriteria.
     * 
     * @param campaignIds
     */
    public void setCampaignIds(long[] campaignIds) {
        this.campaignIds = campaignIds;
    }


    /**
     * Gets the excludeSitesMappedToSiteDirectory value for this DfaSiteSearchCriteria.
     * 
     * @return excludeSitesMappedToSiteDirectory
     */
    public boolean isExcludeSitesMappedToSiteDirectory() {
        return excludeSitesMappedToSiteDirectory;
    }


    /**
     * Sets the excludeSitesMappedToSiteDirectory value for this DfaSiteSearchCriteria.
     * 
     * @param excludeSitesMappedToSiteDirectory
     */
    public void setExcludeSitesMappedToSiteDirectory(boolean excludeSitesMappedToSiteDirectory) {
        this.excludeSitesMappedToSiteDirectory = excludeSitesMappedToSiteDirectory;
    }


    /**
     * Gets the networkId value for this DfaSiteSearchCriteria.
     * 
     * @return networkId
     */
    public long getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this DfaSiteSearchCriteria.
     * 
     * @param networkId
     */
    public void setNetworkId(long networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the sortOrder value for this DfaSiteSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_20.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this DfaSiteSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the subnetworkId value for this DfaSiteSearchCriteria.
     * 
     * @return subnetworkId
     */
    public long getSubnetworkId() {
        return subnetworkId;
    }


    /**
     * Sets the subnetworkId value for this DfaSiteSearchCriteria.
     * 
     * @param subnetworkId
     */
    public void setSubnetworkId(long subnetworkId) {
        this.subnetworkId = subnetworkId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DfaSiteSearchCriteria)) return false;
        DfaSiteSearchCriteria other = (DfaSiteSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.SDSiteIds==null && other.getSDSiteIds()==null) || 
             (this.SDSiteIds!=null &&
              java.util.Arrays.equals(this.SDSiteIds, other.getSDSiteIds()))) &&
            ((this.campaignIds==null && other.getCampaignIds()==null) || 
             (this.campaignIds!=null &&
              java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
            this.excludeSitesMappedToSiteDirectory == other.isExcludeSitesMappedToSiteDirectory() &&
            this.networkId == other.getNetworkId() &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
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
        if (getSDSiteIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSDSiteIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSDSiteIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isExcludeSitesMappedToSiteDirectory() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getNetworkId()).hashCode();
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        _hashCode += new Long(getSubnetworkId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DfaSiteSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DfaSiteSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SDSiteIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SDSiteIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeSitesMappedToSiteDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excludeSitesMappedToSiteDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SortOrder"));
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
