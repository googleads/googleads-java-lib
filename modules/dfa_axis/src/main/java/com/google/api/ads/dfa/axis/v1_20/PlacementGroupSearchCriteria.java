/**
 * PlacementGroupSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class PlacementGroupSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.ActiveFilter archiveFilter;

    private long[] campaignIds;

    private long[] dfaSiteIds;

    private com.google.api.ads.dfa.axis.v1_20.DateInterval endDateRange;

    private int placementGroupFilter;

    private long[] placementStrategyIds;

    private long[] pricingTypeIds;

    private long[] siteIds;

    private com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder;

    private com.google.api.ads.dfa.axis.v1_20.DateInterval startDateRange;

    public PlacementGroupSearchCriteria() {
    }

    public PlacementGroupSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           com.google.api.ads.dfa.axis.v1_20.ActiveFilter archiveFilter,
           long[] campaignIds,
           long[] dfaSiteIds,
           com.google.api.ads.dfa.axis.v1_20.DateInterval endDateRange,
           int placementGroupFilter,
           long[] placementStrategyIds,
           long[] pricingTypeIds,
           long[] siteIds,
           com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder,
           com.google.api.ads.dfa.axis.v1_20.DateInterval startDateRange) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.archiveFilter = archiveFilter;
        this.campaignIds = campaignIds;
        this.dfaSiteIds = dfaSiteIds;
        this.endDateRange = endDateRange;
        this.placementGroupFilter = placementGroupFilter;
        this.placementStrategyIds = placementStrategyIds;
        this.pricingTypeIds = pricingTypeIds;
        this.siteIds = siteIds;
        this.sortOrder = sortOrder;
        this.startDateRange = startDateRange;
    }


    /**
     * Gets the archiveFilter value for this PlacementGroupSearchCriteria.
     * 
     * @return archiveFilter
     */
    public com.google.api.ads.dfa.axis.v1_20.ActiveFilter getArchiveFilter() {
        return archiveFilter;
    }


    /**
     * Sets the archiveFilter value for this PlacementGroupSearchCriteria.
     * 
     * @param archiveFilter
     */
    public void setArchiveFilter(com.google.api.ads.dfa.axis.v1_20.ActiveFilter archiveFilter) {
        this.archiveFilter = archiveFilter;
    }


    /**
     * Gets the campaignIds value for this PlacementGroupSearchCriteria.
     * 
     * @return campaignIds
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this PlacementGroupSearchCriteria.
     * 
     * @param campaignIds
     */
    public void setCampaignIds(long[] campaignIds) {
        this.campaignIds = campaignIds;
    }


    /**
     * Gets the dfaSiteIds value for this PlacementGroupSearchCriteria.
     * 
     * @return dfaSiteIds
     */
    public long[] getDfaSiteIds() {
        return dfaSiteIds;
    }


    /**
     * Sets the dfaSiteIds value for this PlacementGroupSearchCriteria.
     * 
     * @param dfaSiteIds
     */
    public void setDfaSiteIds(long[] dfaSiteIds) {
        this.dfaSiteIds = dfaSiteIds;
    }


    /**
     * Gets the endDateRange value for this PlacementGroupSearchCriteria.
     * 
     * @return endDateRange
     */
    public com.google.api.ads.dfa.axis.v1_20.DateInterval getEndDateRange() {
        return endDateRange;
    }


    /**
     * Sets the endDateRange value for this PlacementGroupSearchCriteria.
     * 
     * @param endDateRange
     */
    public void setEndDateRange(com.google.api.ads.dfa.axis.v1_20.DateInterval endDateRange) {
        this.endDateRange = endDateRange;
    }


    /**
     * Gets the placementGroupFilter value for this PlacementGroupSearchCriteria.
     * 
     * @return placementGroupFilter
     */
    public int getPlacementGroupFilter() {
        return placementGroupFilter;
    }


    /**
     * Sets the placementGroupFilter value for this PlacementGroupSearchCriteria.
     * 
     * @param placementGroupFilter
     */
    public void setPlacementGroupFilter(int placementGroupFilter) {
        this.placementGroupFilter = placementGroupFilter;
    }


    /**
     * Gets the placementStrategyIds value for this PlacementGroupSearchCriteria.
     * 
     * @return placementStrategyIds
     */
    public long[] getPlacementStrategyIds() {
        return placementStrategyIds;
    }


    /**
     * Sets the placementStrategyIds value for this PlacementGroupSearchCriteria.
     * 
     * @param placementStrategyIds
     */
    public void setPlacementStrategyIds(long[] placementStrategyIds) {
        this.placementStrategyIds = placementStrategyIds;
    }


    /**
     * Gets the pricingTypeIds value for this PlacementGroupSearchCriteria.
     * 
     * @return pricingTypeIds
     */
    public long[] getPricingTypeIds() {
        return pricingTypeIds;
    }


    /**
     * Sets the pricingTypeIds value for this PlacementGroupSearchCriteria.
     * 
     * @param pricingTypeIds
     */
    public void setPricingTypeIds(long[] pricingTypeIds) {
        this.pricingTypeIds = pricingTypeIds;
    }


    /**
     * Gets the siteIds value for this PlacementGroupSearchCriteria.
     * 
     * @return siteIds
     */
    public long[] getSiteIds() {
        return siteIds;
    }


    /**
     * Sets the siteIds value for this PlacementGroupSearchCriteria.
     * 
     * @param siteIds
     */
    public void setSiteIds(long[] siteIds) {
        this.siteIds = siteIds;
    }


    /**
     * Gets the sortOrder value for this PlacementGroupSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_20.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this PlacementGroupSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_20.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the startDateRange value for this PlacementGroupSearchCriteria.
     * 
     * @return startDateRange
     */
    public com.google.api.ads.dfa.axis.v1_20.DateInterval getStartDateRange() {
        return startDateRange;
    }


    /**
     * Sets the startDateRange value for this PlacementGroupSearchCriteria.
     * 
     * @param startDateRange
     */
    public void setStartDateRange(com.google.api.ads.dfa.axis.v1_20.DateInterval startDateRange) {
        this.startDateRange = startDateRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementGroupSearchCriteria)) return false;
        PlacementGroupSearchCriteria other = (PlacementGroupSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.archiveFilter==null && other.getArchiveFilter()==null) || 
             (this.archiveFilter!=null &&
              this.archiveFilter.equals(other.getArchiveFilter()))) &&
            ((this.campaignIds==null && other.getCampaignIds()==null) || 
             (this.campaignIds!=null &&
              java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
            ((this.dfaSiteIds==null && other.getDfaSiteIds()==null) || 
             (this.dfaSiteIds!=null &&
              java.util.Arrays.equals(this.dfaSiteIds, other.getDfaSiteIds()))) &&
            ((this.endDateRange==null && other.getEndDateRange()==null) || 
             (this.endDateRange!=null &&
              this.endDateRange.equals(other.getEndDateRange()))) &&
            this.placementGroupFilter == other.getPlacementGroupFilter() &&
            ((this.placementStrategyIds==null && other.getPlacementStrategyIds()==null) || 
             (this.placementStrategyIds!=null &&
              java.util.Arrays.equals(this.placementStrategyIds, other.getPlacementStrategyIds()))) &&
            ((this.pricingTypeIds==null && other.getPricingTypeIds()==null) || 
             (this.pricingTypeIds!=null &&
              java.util.Arrays.equals(this.pricingTypeIds, other.getPricingTypeIds()))) &&
            ((this.siteIds==null && other.getSiteIds()==null) || 
             (this.siteIds!=null &&
              java.util.Arrays.equals(this.siteIds, other.getSiteIds()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.startDateRange==null && other.getStartDateRange()==null) || 
             (this.startDateRange!=null &&
              this.startDateRange.equals(other.getStartDateRange())));
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
        if (getArchiveFilter() != null) {
            _hashCode += getArchiveFilter().hashCode();
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
        if (getDfaSiteIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDfaSiteIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDfaSiteIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDateRange() != null) {
            _hashCode += getEndDateRange().hashCode();
        }
        _hashCode += getPlacementGroupFilter();
        if (getPlacementStrategyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementStrategyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementStrategyIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingTypeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingTypeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingTypeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSiteIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSiteIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSiteIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getStartDateRange() != null) {
            _hashCode += getStartDateRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlacementGroupSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PlacementGroupSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ActiveFilter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfaSiteIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dfaSiteIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DateInterval"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementGroupFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementGroupFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementStrategyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementStrategyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingTypeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingTypeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SortOrder"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DateInterval"));
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
