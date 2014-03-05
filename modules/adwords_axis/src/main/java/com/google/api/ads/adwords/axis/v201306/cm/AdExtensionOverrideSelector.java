/**
 * AdExtensionOverrideSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Specifies criteria for selecting a set of AdExtensionOverrides.
 */
public class AdExtensionOverrideSelector  implements java.io.Serializable {
    /* Returned AdExtensionOverrides should be on ads in the campaigns
     * indicated by this given list of campaign ids. An empty list means
     * there
     *                 are no campaign restrictions during the query. */
    private long[] campaignIds;

    /* Returned AdExtensionOverrides should have an ad id from this
     * list.
     *                 An empty list means there are no ad restrictions during
     * the query. */
    private long[] adIds;

    /* Returned AdExtensionOverrides should have overriding extensions
     * with
     *                 ad extension ids from this list. An empty list means
     * there are no ad
     *                 extension restrictions during the query. */
    private long[] adExtensionIds;

    /* Returned AdExtensionOverrides should have statuses from this
     * list. */
    private com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideStatus[] statuses;

    /* The starting index and number of results to return. */
    private com.google.api.ads.adwords.axis.v201306.cm.Paging paging;

    public AdExtensionOverrideSelector() {
    }

    public AdExtensionOverrideSelector(
           long[] campaignIds,
           long[] adIds,
           long[] adExtensionIds,
           com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideStatus[] statuses,
           com.google.api.ads.adwords.axis.v201306.cm.Paging paging) {
           this.campaignIds = campaignIds;
           this.adIds = adIds;
           this.adExtensionIds = adExtensionIds;
           this.statuses = statuses;
           this.paging = paging;
    }


    /**
     * Gets the campaignIds value for this AdExtensionOverrideSelector.
     * 
     * @return campaignIds   * Returned AdExtensionOverrides should be on ads in the campaigns
     * indicated by this given list of campaign ids. An empty list means
     * there
     *                 are no campaign restrictions during the query.
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this AdExtensionOverrideSelector.
     * 
     * @param campaignIds   * Returned AdExtensionOverrides should be on ads in the campaigns
     * indicated by this given list of campaign ids. An empty list means
     * there
     *                 are no campaign restrictions during the query.
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
     * Gets the adIds value for this AdExtensionOverrideSelector.
     * 
     * @return adIds   * Returned AdExtensionOverrides should have an ad id from this
     * list.
     *                 An empty list means there are no ad restrictions during
     * the query.
     */
    public long[] getAdIds() {
        return adIds;
    }


    /**
     * Sets the adIds value for this AdExtensionOverrideSelector.
     * 
     * @param adIds   * Returned AdExtensionOverrides should have an ad id from this
     * list.
     *                 An empty list means there are no ad restrictions during
     * the query.
     */
    public void setAdIds(long[] adIds) {
        this.adIds = adIds;
    }

    public long getAdIds(int i) {
        return this.adIds[i];
    }

    public void setAdIds(int i, long _value) {
        this.adIds[i] = _value;
    }


    /**
     * Gets the adExtensionIds value for this AdExtensionOverrideSelector.
     * 
     * @return adExtensionIds   * Returned AdExtensionOverrides should have overriding extensions
     * with
     *                 ad extension ids from this list. An empty list means
     * there are no ad
     *                 extension restrictions during the query.
     */
    public long[] getAdExtensionIds() {
        return adExtensionIds;
    }


    /**
     * Sets the adExtensionIds value for this AdExtensionOverrideSelector.
     * 
     * @param adExtensionIds   * Returned AdExtensionOverrides should have overriding extensions
     * with
     *                 ad extension ids from this list. An empty list means
     * there are no ad
     *                 extension restrictions during the query.
     */
    public void setAdExtensionIds(long[] adExtensionIds) {
        this.adExtensionIds = adExtensionIds;
    }

    public long getAdExtensionIds(int i) {
        return this.adExtensionIds[i];
    }

    public void setAdExtensionIds(int i, long _value) {
        this.adExtensionIds[i] = _value;
    }


    /**
     * Gets the statuses value for this AdExtensionOverrideSelector.
     * 
     * @return statuses   * Returned AdExtensionOverrides should have statuses from this
     * list.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideStatus[] getStatuses() {
        return statuses;
    }


    /**
     * Sets the statuses value for this AdExtensionOverrideSelector.
     * 
     * @param statuses   * Returned AdExtensionOverrides should have statuses from this
     * list.
     */
    public void setStatuses(com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideStatus[] statuses) {
        this.statuses = statuses;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideStatus getStatuses(int i) {
        return this.statuses[i];
    }

    public void setStatuses(int i, com.google.api.ads.adwords.axis.v201306.cm.AdExtensionOverrideStatus _value) {
        this.statuses[i] = _value;
    }


    /**
     * Gets the paging value for this AdExtensionOverrideSelector.
     * 
     * @return paging   * The starting index and number of results to return.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this AdExtensionOverrideSelector.
     * 
     * @param paging   * The starting index and number of results to return.
     */
    public void setPaging(com.google.api.ads.adwords.axis.v201306.cm.Paging paging) {
        this.paging = paging;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdExtensionOverrideSelector)) return false;
        AdExtensionOverrideSelector other = (AdExtensionOverrideSelector) obj;
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
            ((this.adIds==null && other.getAdIds()==null) || 
             (this.adIds!=null &&
              java.util.Arrays.equals(this.adIds, other.getAdIds()))) &&
            ((this.adExtensionIds==null && other.getAdExtensionIds()==null) || 
             (this.adExtensionIds!=null &&
              java.util.Arrays.equals(this.adExtensionIds, other.getAdExtensionIds()))) &&
            ((this.statuses==null && other.getStatuses()==null) || 
             (this.statuses!=null &&
              java.util.Arrays.equals(this.statuses, other.getStatuses()))) &&
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
        if (getAdIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdExtensionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdExtensionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdExtensionIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaging() != null) {
            _hashCode += getPaging().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdExtensionOverrideSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AdExtensionOverrideSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "adIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExtensionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "adExtensionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AdExtensionOverride.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Paging"));
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
