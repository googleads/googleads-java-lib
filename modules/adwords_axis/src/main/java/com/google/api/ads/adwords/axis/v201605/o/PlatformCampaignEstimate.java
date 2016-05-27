/**
 * PlatformCampaignEstimate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.o;


/**
 * Contains a campaign level estimate for a specified {@link Platform}.
 */
public class PlatformCampaignEstimate  implements java.io.Serializable {
    /* The {@link Platform} associated with this estimate.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201605.cm.Platform platform;

    /* Minimum estimate for the specified {@link Platform}. */
    private com.google.api.ads.adwords.axis.v201605.o.StatsEstimate minEstimate;

    /* Maximum estimate for the specified {@link Platform}. */
    private com.google.api.ads.adwords.axis.v201605.o.StatsEstimate maxEstimate;

    public PlatformCampaignEstimate() {
    }

    public PlatformCampaignEstimate(
           com.google.api.ads.adwords.axis.v201605.cm.Platform platform,
           com.google.api.ads.adwords.axis.v201605.o.StatsEstimate minEstimate,
           com.google.api.ads.adwords.axis.v201605.o.StatsEstimate maxEstimate) {
           this.platform = platform;
           this.minEstimate = minEstimate;
           this.maxEstimate = maxEstimate;
    }


    /**
     * Gets the platform value for this PlatformCampaignEstimate.
     * 
     * @return platform   * The {@link Platform} associated with this estimate.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201605.cm.Platform getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this PlatformCampaignEstimate.
     * 
     * @param platform   * The {@link Platform} associated with this estimate.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setPlatform(com.google.api.ads.adwords.axis.v201605.cm.Platform platform) {
        this.platform = platform;
    }


    /**
     * Gets the minEstimate value for this PlatformCampaignEstimate.
     * 
     * @return minEstimate   * Minimum estimate for the specified {@link Platform}.
     */
    public com.google.api.ads.adwords.axis.v201605.o.StatsEstimate getMinEstimate() {
        return minEstimate;
    }


    /**
     * Sets the minEstimate value for this PlatformCampaignEstimate.
     * 
     * @param minEstimate   * Minimum estimate for the specified {@link Platform}.
     */
    public void setMinEstimate(com.google.api.ads.adwords.axis.v201605.o.StatsEstimate minEstimate) {
        this.minEstimate = minEstimate;
    }


    /**
     * Gets the maxEstimate value for this PlatformCampaignEstimate.
     * 
     * @return maxEstimate   * Maximum estimate for the specified {@link Platform}.
     */
    public com.google.api.ads.adwords.axis.v201605.o.StatsEstimate getMaxEstimate() {
        return maxEstimate;
    }


    /**
     * Sets the maxEstimate value for this PlatformCampaignEstimate.
     * 
     * @param maxEstimate   * Maximum estimate for the specified {@link Platform}.
     */
    public void setMaxEstimate(com.google.api.ads.adwords.axis.v201605.o.StatsEstimate maxEstimate) {
        this.maxEstimate = maxEstimate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlatformCampaignEstimate)) return false;
        PlatformCampaignEstimate other = (PlatformCampaignEstimate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.platform==null && other.getPlatform()==null) || 
             (this.platform!=null &&
              this.platform.equals(other.getPlatform()))) &&
            ((this.minEstimate==null && other.getMinEstimate()==null) || 
             (this.minEstimate!=null &&
              this.minEstimate.equals(other.getMinEstimate()))) &&
            ((this.maxEstimate==null && other.getMaxEstimate()==null) || 
             (this.maxEstimate!=null &&
              this.maxEstimate.equals(other.getMaxEstimate())));
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
        if (getPlatform() != null) {
            _hashCode += getPlatform().hashCode();
        }
        if (getMinEstimate() != null) {
            _hashCode += getMinEstimate().hashCode();
        }
        if (getMaxEstimate() != null) {
            _hashCode += getMaxEstimate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlatformCampaignEstimate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201605", "PlatformCampaignEstimate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201605", "platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "Platform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201605", "minEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201605", "StatsEstimate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201605", "maxEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201605", "StatsEstimate"));
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
