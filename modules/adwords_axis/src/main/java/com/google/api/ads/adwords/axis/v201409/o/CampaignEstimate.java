/**
 * CampaignEstimate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.o;


/**
 * Represents the estimate results for a single campaign.
 */
public class CampaignEstimate  extends com.google.api.ads.adwords.axis.v201409.o.Estimate  implements java.io.Serializable {
    /* The campaignId of the campaign specified in the request.
     *                     
     *                     This will be <code>null</code> for new campaigns. */
    private java.lang.Long campaignId;

    /* The estimates for the ad groups belonging to this campaign
     * in the request.
     *                     
     *                     They will be returned in the same order that they
     * were sent in the request. */
    private com.google.api.ads.adwords.axis.v201409.o.AdGroupEstimate[] adGroupEstimates;

    public CampaignEstimate() {
    }

    public CampaignEstimate(
           java.lang.String estimateType,
           java.lang.Long campaignId,
           com.google.api.ads.adwords.axis.v201409.o.AdGroupEstimate[] adGroupEstimates) {
        super(
            estimateType);
        this.campaignId = campaignId;
        this.adGroupEstimates = adGroupEstimates;
    }


    /**
     * Gets the campaignId value for this CampaignEstimate.
     * 
     * @return campaignId   * The campaignId of the campaign specified in the request.
     *                     
     *                     This will be <code>null</code> for new campaigns.
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignEstimate.
     * 
     * @param campaignId   * The campaignId of the campaign specified in the request.
     *                     
     *                     This will be <code>null</code> for new campaigns.
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adGroupEstimates value for this CampaignEstimate.
     * 
     * @return adGroupEstimates   * The estimates for the ad groups belonging to this campaign
     * in the request.
     *                     
     *                     They will be returned in the same order that they
     * were sent in the request.
     */
    public com.google.api.ads.adwords.axis.v201409.o.AdGroupEstimate[] getAdGroupEstimates() {
        return adGroupEstimates;
    }


    /**
     * Sets the adGroupEstimates value for this CampaignEstimate.
     * 
     * @param adGroupEstimates   * The estimates for the ad groups belonging to this campaign
     * in the request.
     *                     
     *                     They will be returned in the same order that they
     * were sent in the request.
     */
    public void setAdGroupEstimates(com.google.api.ads.adwords.axis.v201409.o.AdGroupEstimate[] adGroupEstimates) {
        this.adGroupEstimates = adGroupEstimates;
    }

    public com.google.api.ads.adwords.axis.v201409.o.AdGroupEstimate getAdGroupEstimates(int i) {
        return this.adGroupEstimates[i];
    }

    public void setAdGroupEstimates(int i, com.google.api.ads.adwords.axis.v201409.o.AdGroupEstimate _value) {
        this.adGroupEstimates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignEstimate)) return false;
        CampaignEstimate other = (CampaignEstimate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adGroupEstimates==null && other.getAdGroupEstimates()==null) || 
             (this.adGroupEstimates!=null &&
              java.util.Arrays.equals(this.adGroupEstimates, other.getAdGroupEstimates())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdGroupEstimates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdGroupEstimates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdGroupEstimates(), i);
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
        new org.apache.axis.description.TypeDesc(CampaignEstimate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201409", "CampaignEstimate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201409", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupEstimates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201409", "adGroupEstimates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201409", "AdGroupEstimate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
