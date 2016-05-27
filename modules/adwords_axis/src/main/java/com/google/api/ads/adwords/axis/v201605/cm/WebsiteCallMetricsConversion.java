/**
 * WebsiteCallMetricsConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * A conversion that happens when a user performs the following sequence
 * of actions:
 *             <ul>
 *             <li>Clicks on an advertiser's ad</li>
 *             <li>
 *             Proceeds to the advertiser's website, where special javascript
 * installed on the page
 *             produces a dynamically-generated phone number,
 *             </li>
 *             <li>Calls that number from their home (or other) phone</li>
 * </ul>
 */
public class WebsiteCallMetricsConversion  extends com.google.api.ads.adwords.axis.v201605.cm.ConversionTracker  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "WebsitePhoneCallDuration".</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 10000, inclusive.</span> */
    private java.lang.Long phoneCallDuration;

    private java.lang.String snippet;

    public WebsiteCallMetricsConversion() {
    }

    public WebsiteCallMetricsConversion(
           java.lang.Long id,
           java.lang.Long originalConversionTypeId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201605.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201605.cm.ConversionTrackerCategory category,
           java.lang.Long conversionTypeOwnerCustomerId,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Integer ctcLookbackWindow,
           com.google.api.ads.adwords.axis.v201605.cm.ConversionDeduplicationMode countingType,
           java.lang.Double defaultRevenueValue,
           java.lang.String defaultRevenueCurrencyCode,
           java.lang.Boolean alwaysUseDefaultRevenueValue,
           java.lang.Boolean excludeFromBidding,
           java.lang.String mostRecentConversionDate,
           java.lang.String lastReceivedRequestTime,
           java.lang.String conversionTrackerType,
           java.lang.Long phoneCallDuration,
           java.lang.String snippet) {
        super(
            id,
            originalConversionTypeId,
            name,
            status,
            category,
            conversionTypeOwnerCustomerId,
            viewthroughLookbackWindow,
            ctcLookbackWindow,
            countingType,
            defaultRevenueValue,
            defaultRevenueCurrencyCode,
            alwaysUseDefaultRevenueValue,
            excludeFromBidding,
            mostRecentConversionDate,
            lastReceivedRequestTime,
            conversionTrackerType);
        this.phoneCallDuration = phoneCallDuration;
        this.snippet = snippet;
    }


    /**
     * Gets the phoneCallDuration value for this WebsiteCallMetricsConversion.
     * 
     * @return phoneCallDuration   * <span class="constraint Selectable">This field can be selected
     * using the value "WebsitePhoneCallDuration".</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 10000, inclusive.</span>
     */
    public java.lang.Long getPhoneCallDuration() {
        return phoneCallDuration;
    }


    /**
     * Sets the phoneCallDuration value for this WebsiteCallMetricsConversion.
     * 
     * @param phoneCallDuration   * <span class="constraint Selectable">This field can be selected
     * using the value "WebsitePhoneCallDuration".</span>
     *                     <span class="constraint InRange">This field must
     * be between 0 and 10000, inclusive.</span>
     */
    public void setPhoneCallDuration(java.lang.Long phoneCallDuration) {
        this.phoneCallDuration = phoneCallDuration;
    }


    /**
     * Gets the snippet value for this WebsiteCallMetricsConversion.
     * 
     * @return snippet
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this WebsiteCallMetricsConversion.
     * 
     * @param snippet
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebsiteCallMetricsConversion)) return false;
        WebsiteCallMetricsConversion other = (WebsiteCallMetricsConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.phoneCallDuration==null && other.getPhoneCallDuration()==null) || 
             (this.phoneCallDuration!=null &&
              this.phoneCallDuration.equals(other.getPhoneCallDuration()))) &&
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet())));
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
        if (getPhoneCallDuration() != null) {
            _hashCode += getPhoneCallDuration().hashCode();
        }
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebsiteCallMetricsConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "WebsiteCallMetricsConversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneCallDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "phoneCallDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
