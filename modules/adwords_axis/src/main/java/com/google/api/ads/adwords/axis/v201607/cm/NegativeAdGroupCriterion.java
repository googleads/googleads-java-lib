/**
 * NegativeAdGroupCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;


/**
 * A negative criterion in an adgroup.
 */
public class NegativeAdGroupCriterion  extends com.google.api.ads.adwords.axis.v201607.cm.AdGroupCriterion  implements java.io.Serializable {
    public NegativeAdGroupCriterion() {
    }

    public NegativeAdGroupCriterion(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201607.cm.CriterionUse criterionUse,
           com.google.api.ads.adwords.axis.v201607.cm.Criterion criterion,
           com.google.api.ads.adwords.axis.v201607.cm.Label[] labels,
           com.google.api.ads.adwords.axis.v201607.cm.String_StringMapEntry[] forwardCompatibilityMap,
           java.lang.Long baseCampaignId,
           java.lang.Long baseAdGroupId,
           java.lang.String adGroupCriterionType) {
        super(
            adGroupId,
            criterionUse,
            criterion,
            labels,
            forwardCompatibilityMap,
            baseCampaignId,
            baseAdGroupId,
            adGroupCriterionType);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NegativeAdGroupCriterion)) return false;
        NegativeAdGroupCriterion other = (NegativeAdGroupCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NegativeAdGroupCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "NegativeAdGroupCriterion"));
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
