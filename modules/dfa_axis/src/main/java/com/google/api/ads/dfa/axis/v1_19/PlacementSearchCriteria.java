/**
 * PlacementSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class PlacementSearchCriteria  extends com.google.api.ads.dfa.axis.v1_19.PageableSearchCriteriaBase  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.ActiveFilter archiveFilter;

    private long[] campaignIds;

    private long[] dfaSiteIds;

    private com.google.api.ads.dfa.axis.v1_19.DateInterval endDateRange;

    private int placementFilter;

    private long[] placementStrategyIds;

    private long[] placementTypeIds;

    private long[] pricingTypeIds;

    private long[] siteIds;

    private long[] sizeIds;

    private com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder;

    private com.google.api.ads.dfa.axis.v1_19.DateInterval startDateRange;

    public PlacementSearchCriteria() {
    }

    public PlacementSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           com.google.api.ads.dfa.axis.v1_19.ActiveFilter archiveFilter,
           long[] campaignIds,
           long[] dfaSiteIds,
           com.google.api.ads.dfa.axis.v1_19.DateInterval endDateRange,
           int placementFilter,
           long[] placementStrategyIds,
           long[] placementTypeIds,
           long[] pricingTypeIds,
           long[] siteIds,
           long[] sizeIds,
           com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder,
           com.google.api.ads.dfa.axis.v1_19.DateInterval startDateRange) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.archiveFilter = archiveFilter;
        this.campaignIds = campaignIds;
        this.dfaSiteIds = dfaSiteIds;
        this.endDateRange = endDateRange;
        this.placementFilter = placementFilter;
        this.placementStrategyIds = placementStrategyIds;
        this.placementTypeIds = placementTypeIds;
        this.pricingTypeIds = pricingTypeIds;
        this.siteIds = siteIds;
        this.sizeIds = sizeIds;
        this.sortOrder = sortOrder;
        this.startDateRange = startDateRange;
    }


    /**
     * Gets the archiveFilter value for this PlacementSearchCriteria.
     * 
     * @return archiveFilter
     */
    public com.google.api.ads.dfa.axis.v1_19.ActiveFilter getArchiveFilter() {
        return archiveFilter;
    }


    /**
     * Sets the archiveFilter value for this PlacementSearchCriteria.
     * 
     * @param archiveFilter
     */
    public void setArchiveFilter(com.google.api.ads.dfa.axis.v1_19.ActiveFilter archiveFilter) {
        this.archiveFilter = archiveFilter;
    }


    /**
     * Gets the campaignIds value for this PlacementSearchCriteria.
     * 
     * @return campaignIds
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this PlacementSearchCriteria.
     * 
     * @param campaignIds
     */
    public void setCampaignIds(long[] campaignIds) {
        this.campaignIds = campaignIds;
    }


    /**
     * Gets the dfaSiteIds value for this PlacementSearchCriteria.
     * 
     * @return dfaSiteIds
     */
    public long[] getDfaSiteIds() {
        return dfaSiteIds;
    }


    /**
     * Sets the dfaSiteIds value for this PlacementSearchCriteria.
     * 
     * @param dfaSiteIds
     */
    public void setDfaSiteIds(long[] dfaSiteIds) {
        this.dfaSiteIds = dfaSiteIds;
    }


    /**
     * Gets the endDateRange value for this PlacementSearchCriteria.
     * 
     * @return endDateRange
     */
    public com.google.api.ads.dfa.axis.v1_19.DateInterval getEndDateRange() {
        return endDateRange;
    }


    /**
     * Sets the endDateRange value for this PlacementSearchCriteria.
     * 
     * @param endDateRange
     */
    public void setEndDateRange(com.google.api.ads.dfa.axis.v1_19.DateInterval endDateRange) {
        this.endDateRange = endDateRange;
    }


    /**
     * Gets the placementFilter value for this PlacementSearchCriteria.
     * 
     * @return placementFilter
     */
    public int getPlacementFilter() {
        return placementFilter;
    }


    /**
     * Sets the placementFilter value for this PlacementSearchCriteria.
     * 
     * @param placementFilter
     */
    public void setPlacementFilter(int placementFilter) {
        this.placementFilter = placementFilter;
    }


    /**
     * Gets the placementStrategyIds value for this PlacementSearchCriteria.
     * 
     * @return placementStrategyIds
     */
    public long[] getPlacementStrategyIds() {
        return placementStrategyIds;
    }


    /**
     * Sets the placementStrategyIds value for this PlacementSearchCriteria.
     * 
     * @param placementStrategyIds
     */
    public void setPlacementStrategyIds(long[] placementStrategyIds) {
        this.placementStrategyIds = placementStrategyIds;
    }


    /**
     * Gets the placementTypeIds value for this PlacementSearchCriteria.
     * 
     * @return placementTypeIds
     */
    public long[] getPlacementTypeIds() {
        return placementTypeIds;
    }


    /**
     * Sets the placementTypeIds value for this PlacementSearchCriteria.
     * 
     * @param placementTypeIds
     */
    public void setPlacementTypeIds(long[] placementTypeIds) {
        this.placementTypeIds = placementTypeIds;
    }


    /**
     * Gets the pricingTypeIds value for this PlacementSearchCriteria.
     * 
     * @return pricingTypeIds
     */
    public long[] getPricingTypeIds() {
        return pricingTypeIds;
    }


    /**
     * Sets the pricingTypeIds value for this PlacementSearchCriteria.
     * 
     * @param pricingTypeIds
     */
    public void setPricingTypeIds(long[] pricingTypeIds) {
        this.pricingTypeIds = pricingTypeIds;
    }


    /**
     * Gets the siteIds value for this PlacementSearchCriteria.
     * 
     * @return siteIds
     */
    public long[] getSiteIds() {
        return siteIds;
    }


    /**
     * Sets the siteIds value for this PlacementSearchCriteria.
     * 
     * @param siteIds
     */
    public void setSiteIds(long[] siteIds) {
        this.siteIds = siteIds;
    }


    /**
     * Gets the sizeIds value for this PlacementSearchCriteria.
     * 
     * @return sizeIds
     */
    public long[] getSizeIds() {
        return sizeIds;
    }


    /**
     * Sets the sizeIds value for this PlacementSearchCriteria.
     * 
     * @param sizeIds
     */
    public void setSizeIds(long[] sizeIds) {
        this.sizeIds = sizeIds;
    }


    /**
     * Gets the sortOrder value for this PlacementSearchCriteria.
     * 
     * @return sortOrder
     */
    public com.google.api.ads.dfa.axis.v1_19.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this PlacementSearchCriteria.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.google.api.ads.dfa.axis.v1_19.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the startDateRange value for this PlacementSearchCriteria.
     * 
     * @return startDateRange
     */
    public com.google.api.ads.dfa.axis.v1_19.DateInterval getStartDateRange() {
        return startDateRange;
    }


    /**
     * Sets the startDateRange value for this PlacementSearchCriteria.
     * 
     * @param startDateRange
     */
    public void setStartDateRange(com.google.api.ads.dfa.axis.v1_19.DateInterval startDateRange) {
        this.startDateRange = startDateRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementSearchCriteria)) return false;
        PlacementSearchCriteria other = (PlacementSearchCriteria) obj;
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
            this.placementFilter == other.getPlacementFilter() &&
            ((this.placementStrategyIds==null && other.getPlacementStrategyIds()==null) || 
             (this.placementStrategyIds!=null &&
              java.util.Arrays.equals(this.placementStrategyIds, other.getPlacementStrategyIds()))) &&
            ((this.placementTypeIds==null && other.getPlacementTypeIds()==null) || 
             (this.placementTypeIds!=null &&
              java.util.Arrays.equals(this.placementTypeIds, other.getPlacementTypeIds()))) &&
            ((this.pricingTypeIds==null && other.getPricingTypeIds()==null) || 
             (this.pricingTypeIds!=null &&
              java.util.Arrays.equals(this.pricingTypeIds, other.getPricingTypeIds()))) &&
            ((this.siteIds==null && other.getSiteIds()==null) || 
             (this.siteIds!=null &&
              java.util.Arrays.equals(this.siteIds, other.getSiteIds()))) &&
            ((this.sizeIds==null && other.getSizeIds()==null) || 
             (this.sizeIds!=null &&
              java.util.Arrays.equals(this.sizeIds, other.getSizeIds()))) &&
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
        _hashCode += getPlacementFilter();
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
        if (getPlacementTypeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementTypeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementTypeIds(), i);
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
        new org.apache.axis.description.TypeDesc(PlacementSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PlacementSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archiveFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ActiveFilter"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "DateInterval"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementFilter"));
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
        elemField.setFieldName("placementTypeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementTypeIds"));
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
        elemField.setFieldName("sizeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SortOrder"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "DateInterval"));
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
