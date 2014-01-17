/**
 * AdSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class AdSearchCriteria  extends com.google.api.ads.dfa.axis.v1_19.PageableSearchCriteriaBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter;

    private long campaignId;

    private long[] sizeIds;

    private long[] typeIds;

    public AdSearchCriteria() {
    }

    public AdSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter,
           long campaignId,
           long[] sizeIds,
           long[] typeIds) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.activeFilter = activeFilter;
        this.campaignId = campaignId;
        this.sizeIds = sizeIds;
        this.typeIds = typeIds;
    }


    /**
     * Gets the activeFilter value for this AdSearchCriteria.
     * 
     * @return activeFilter
     */
    public com.google.api.ads.dfa.axis.v1_19.ActiveFilter getActiveFilter() {
        return activeFilter;
    }


    /**
     * Sets the activeFilter value for this AdSearchCriteria.
     * 
     * @param activeFilter
     */
    public void setActiveFilter(com.google.api.ads.dfa.axis.v1_19.ActiveFilter activeFilter) {
        this.activeFilter = activeFilter;
    }


    /**
     * Gets the campaignId value for this AdSearchCriteria.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this AdSearchCriteria.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the sizeIds value for this AdSearchCriteria.
     * 
     * @return sizeIds
     */
    public long[] getSizeIds() {
        return sizeIds;
    }


    /**
     * Sets the sizeIds value for this AdSearchCriteria.
     * 
     * @param sizeIds
     */
    public void setSizeIds(long[] sizeIds) {
        this.sizeIds = sizeIds;
    }


    /**
     * Gets the typeIds value for this AdSearchCriteria.
     * 
     * @return typeIds
     */
    public long[] getTypeIds() {
        return typeIds;
    }


    /**
     * Sets the typeIds value for this AdSearchCriteria.
     * 
     * @param typeIds
     */
    public void setTypeIds(long[] typeIds) {
        this.typeIds = typeIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdSearchCriteria)) return false;
        AdSearchCriteria other = (AdSearchCriteria) obj;
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
            this.campaignId == other.getCampaignId() &&
            ((this.sizeIds==null && other.getSizeIds()==null) || 
             (this.sizeIds!=null &&
              java.util.Arrays.equals(this.sizeIds, other.getSizeIds()))) &&
            ((this.typeIds==null && other.getTypeIds()==null) || 
             (this.typeIds!=null &&
              java.util.Arrays.equals(this.typeIds, other.getTypeIds())));
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
        _hashCode += new Long(getCampaignId()).hashCode();
        if (getSizeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSizeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSizeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTypeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ActiveFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
