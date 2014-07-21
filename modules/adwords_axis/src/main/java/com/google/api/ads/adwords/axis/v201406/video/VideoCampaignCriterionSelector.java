/**
 * VideoCampaignCriterionSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoCampaignCriterionSelector  implements java.io.Serializable {
    /* <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private long[] campaignIds;

    /* <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus[] campaignStatuses;

    /* <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.BaseCriterionType[] criterionTypes;

    private com.google.api.ads.adwords.axis.v201406.video.Sorting sorting;

    private com.google.api.ads.adwords.axis.v201406.cm.Paging paging;

    public VideoCampaignCriterionSelector() {
    }

    public VideoCampaignCriterionSelector(
           long[] campaignIds,
           com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus[] campaignStatuses,
           com.google.api.ads.adwords.axis.v201406.video.BaseCriterionType[] criterionTypes,
           com.google.api.ads.adwords.axis.v201406.video.Sorting sorting,
           com.google.api.ads.adwords.axis.v201406.cm.Paging paging) {
           this.campaignIds = campaignIds;
           this.campaignStatuses = campaignStatuses;
           this.criterionTypes = criterionTypes;
           this.sorting = sorting;
           this.paging = paging;
    }


    /**
     * Gets the campaignIds value for this VideoCampaignCriterionSelector.
     * 
     * @return campaignIds   * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this VideoCampaignCriterionSelector.
     * 
     * @param campaignIds   * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCampaignIds(long[] campaignIds) {
        this.campaignIds = campaignIds;
    }

    public long getCampaignIds(int i) {
        return this.campaignIds[i];
    }

    public void setCampaignIds(int i, long _value) {
        this.campaignIds[i] = _value;
    }


    /**
     * Gets the campaignStatuses value for this VideoCampaignCriterionSelector.
     * 
     * @return campaignStatuses   * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus[] getCampaignStatuses() {
        return campaignStatuses;
    }


    /**
     * Sets the campaignStatuses value for this VideoCampaignCriterionSelector.
     * 
     * @param campaignStatuses   * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCampaignStatuses(com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus[] campaignStatuses) {
        this.campaignStatuses = campaignStatuses;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus getCampaignStatuses(int i) {
        return this.campaignStatuses[i];
    }

    public void setCampaignStatuses(int i, com.google.api.ads.adwords.axis.v201406.video.VideoCampaignStatus _value) {
        this.campaignStatuses[i] = _value;
    }


    /**
     * Gets the criterionTypes value for this VideoCampaignCriterionSelector.
     * 
     * @return criterionTypes   * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.BaseCriterionType[] getCriterionTypes() {
        return criterionTypes;
    }


    /**
     * Sets the criterionTypes value for this VideoCampaignCriterionSelector.
     * 
     * @param criterionTypes   * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCriterionTypes(com.google.api.ads.adwords.axis.v201406.video.BaseCriterionType[] criterionTypes) {
        this.criterionTypes = criterionTypes;
    }

    public com.google.api.ads.adwords.axis.v201406.video.BaseCriterionType getCriterionTypes(int i) {
        return this.criterionTypes[i];
    }

    public void setCriterionTypes(int i, com.google.api.ads.adwords.axis.v201406.video.BaseCriterionType _value) {
        this.criterionTypes[i] = _value;
    }


    /**
     * Gets the sorting value for this VideoCampaignCriterionSelector.
     * 
     * @return sorting
     */
    public com.google.api.ads.adwords.axis.v201406.video.Sorting getSorting() {
        return sorting;
    }


    /**
     * Sets the sorting value for this VideoCampaignCriterionSelector.
     * 
     * @param sorting
     */
    public void setSorting(com.google.api.ads.adwords.axis.v201406.video.Sorting sorting) {
        this.sorting = sorting;
    }


    /**
     * Gets the paging value for this VideoCampaignCriterionSelector.
     * 
     * @return paging
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this VideoCampaignCriterionSelector.
     * 
     * @param paging
     */
    public void setPaging(com.google.api.ads.adwords.axis.v201406.cm.Paging paging) {
        this.paging = paging;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoCampaignCriterionSelector)) return false;
        VideoCampaignCriterionSelector other = (VideoCampaignCriterionSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignIds==null && other.getCampaignIds()==null) || 
             (this.campaignIds!=null &&
              java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
            ((this.campaignStatuses==null && other.getCampaignStatuses()==null) || 
             (this.campaignStatuses!=null &&
              java.util.Arrays.equals(this.campaignStatuses, other.getCampaignStatuses()))) &&
            ((this.criterionTypes==null && other.getCriterionTypes()==null) || 
             (this.criterionTypes!=null &&
              java.util.Arrays.equals(this.criterionTypes, other.getCriterionTypes()))) &&
            ((this.sorting==null && other.getSorting()==null) || 
             (this.sorting!=null &&
              this.sorting.equals(other.getSorting()))) &&
            ((this.paging==null && other.getPaging()==null) || 
             (this.paging!=null &&
              this.paging.equals(other.getPaging())));
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
        if (getCampaignStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCriterionTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriterionTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriterionTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSorting() != null) {
            _hashCode += getSorting().hashCode();
        }
        if (getPaging() != null) {
            _hashCode += getPaging().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoCampaignCriterionSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoCampaignCriterionSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "campaignStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoCampaignStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "criterionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "BaseCriterion.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sorting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "sorting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "Sorting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Paging"));
        elemField.setMinOccurs(0);
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
