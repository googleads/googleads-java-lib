/**
 * VideoCampaignPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Contains a subset of video campaigns matching filtering and paging
 * options
 *             of the VideoCampaignService.get() call.
 */
public class VideoCampaignPage  extends com.google.api.ads.adwords.axis.v201406.cm.Page  implements java.io.Serializable {
    /* Result entries in this page. */
    private com.google.api.ads.adwords.axis.v201406.video.VideoCampaign[] entries;

    /* Summary stats for the result set, one entry for each summary
     * type specified in the
     *                     {@link StatsSelector}. */
    private com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] summaryStats;

    /* The total summary budgets. */
    private com.google.api.ads.adwords.axis.v201406.video.SummaryBudgets summaryBudgets;

    public VideoCampaignPage() {
    }

    public VideoCampaignPage(
           java.lang.Integer totalNumEntries,
           java.lang.String pageType,
           com.google.api.ads.adwords.axis.v201406.video.VideoCampaign[] entries,
           com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] summaryStats,
           com.google.api.ads.adwords.axis.v201406.video.SummaryBudgets summaryBudgets) {
        super(
            totalNumEntries,
            pageType);
        this.entries = entries;
        this.summaryStats = summaryStats;
        this.summaryBudgets = summaryBudgets;
    }


    /**
     * Gets the entries value for this VideoCampaignPage.
     * 
     * @return entries   * Result entries in this page.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoCampaign[] getEntries() {
        return entries;
    }


    /**
     * Sets the entries value for this VideoCampaignPage.
     * 
     * @param entries   * Result entries in this page.
     */
    public void setEntries(com.google.api.ads.adwords.axis.v201406.video.VideoCampaign[] entries) {
        this.entries = entries;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoCampaign getEntries(int i) {
        return this.entries[i];
    }

    public void setEntries(int i, com.google.api.ads.adwords.axis.v201406.video.VideoCampaign _value) {
        this.entries[i] = _value;
    }


    /**
     * Gets the summaryStats value for this VideoCampaignPage.
     * 
     * @return summaryStats   * Summary stats for the result set, one entry for each summary
     * type specified in the
     *                     {@link StatsSelector}.
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] getSummaryStats() {
        return summaryStats;
    }


    /**
     * Sets the summaryStats value for this VideoCampaignPage.
     * 
     * @param summaryStats   * Summary stats for the result set, one entry for each summary
     * type specified in the
     *                     {@link StatsSelector}.
     */
    public void setSummaryStats(com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats[] summaryStats) {
        this.summaryStats = summaryStats;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats getSummaryStats(int i) {
        return this.summaryStats[i];
    }

    public void setSummaryStats(int i, com.google.api.ads.adwords.axis.v201406.video.VideoEntityStats _value) {
        this.summaryStats[i] = _value;
    }


    /**
     * Gets the summaryBudgets value for this VideoCampaignPage.
     * 
     * @return summaryBudgets   * The total summary budgets.
     */
    public com.google.api.ads.adwords.axis.v201406.video.SummaryBudgets getSummaryBudgets() {
        return summaryBudgets;
    }


    /**
     * Sets the summaryBudgets value for this VideoCampaignPage.
     * 
     * @param summaryBudgets   * The total summary budgets.
     */
    public void setSummaryBudgets(com.google.api.ads.adwords.axis.v201406.video.SummaryBudgets summaryBudgets) {
        this.summaryBudgets = summaryBudgets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoCampaignPage)) return false;
        VideoCampaignPage other = (VideoCampaignPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entries==null && other.getEntries()==null) || 
             (this.entries!=null &&
              java.util.Arrays.equals(this.entries, other.getEntries()))) &&
            ((this.summaryStats==null && other.getSummaryStats()==null) || 
             (this.summaryStats!=null &&
              java.util.Arrays.equals(this.summaryStats, other.getSummaryStats()))) &&
            ((this.summaryBudgets==null && other.getSummaryBudgets()==null) || 
             (this.summaryBudgets!=null &&
              this.summaryBudgets.equals(other.getSummaryBudgets())));
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
        if (getEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummaryStats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSummaryStats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSummaryStats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummaryBudgets() != null) {
            _hashCode += getSummaryBudgets().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoCampaignPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoCampaignPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoCampaign"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "summaryStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryBudgets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "summaryBudgets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "SummaryBudgets"));
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
