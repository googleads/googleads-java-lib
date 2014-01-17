/**
 * CampaignSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CampaignSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private long[] advertiserIds;

    private com.google.api.ads.dfa.axis.v1_20.ActiveFilter archiveFilter;

    private com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder;

    public CampaignSearchCriteria() {
    }

    public CampaignSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           long[] advertiserIds,
           com.google.api.ads.dfa.axis.v1_20.ActiveFilter archiveFilter,
           com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.advertiserIds = advertiserIds;
        this.archiveFilter = archiveFilter;
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the advertiserIds value for this CampaignSearchCriteria.
     * 
     * @return advertiserIds
     */
    public long[] getAdvertiserIds() {
        return advertiserIds;
    }


    /**
     * Sets the advertiserIds value for this CampaignSearchCriteria.
     * 
     * @param advertiserIds
     */
    public void setAdvertiserIds(long[] advertiserIds) {
        this.advertiserIds = advertiserIds;
    }


    /**
     * Gets the archiveFilter value for this CampaignSearchCriteria.
     * 
     * @return archiveFilter
     */
    public com.google.api.ads.dfa.axis.v1_20.ActiveFilter getArchiveFilter() {
        return archiveFilter;
    }


    /**
     * Sets the archiveFilter value for this CampaignSearchCriteria.
     * 
     * @param archiveFilter
     */
    public void setArchiveFilter(com.google.api.ads.dfa.axis.v1_20.ActiveFilter archiveFilter) {
        this.archiveFilter = archiveFilter;
    }


    /**
     * Gets the sortOrder value for this CampaignSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_20.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this CampaignSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignSearchCriteria)) return false;
        CampaignSearchCriteria other = (CampaignSearchCriteria) obj;
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
            ((this.archiveFilter==null && other.getArchiveFilter()==null) || 
             (this.archiveFilter!=null &&
              this.archiveFilter.equals(other.getArchiveFilter()))) &&
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
        if (getArchiveFilter() != null) {
            _hashCode += getArchiveFilter().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CampaignSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveFilter"));
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
