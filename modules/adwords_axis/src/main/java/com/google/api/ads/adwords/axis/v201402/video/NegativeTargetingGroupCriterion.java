/**
 * NegativeTargetingGroupCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents an exclusion of a targeting {@link BaseCriterion} in
 * a
 *             {@link TargetingGroup}.
 *             
 *             A negative criterion doesn't have stats or status.
 */
public class NegativeTargetingGroupCriterion  extends com.google.api.ads.adwords.axis.v201402.video.TargetingGroupCriterion  implements java.io.Serializable {
    public NegativeTargetingGroupCriterion() {
    }

    public NegativeTargetingGroupCriterion(
           java.lang.Long targetingGroupId,
           java.lang.String targetingGroupName,
           com.google.api.ads.adwords.axis.v201402.video.BaseCriterion criterion,
           java.lang.Long campaignId,
           java.lang.String targetingGroupCriterionType) {
        super(
            targetingGroupId,
            targetingGroupName,
            criterion,
            campaignId,
            targetingGroupCriterionType);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NegativeTargetingGroupCriterion)) return false;
        NegativeTargetingGroupCriterion other = (NegativeTargetingGroupCriterion) obj;
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
        new org.apache.axis.description.TypeDesc(NegativeTargetingGroupCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "NegativeTargetingGroupCriterion"));
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
