/**
 * CampaignCriterionLimitExceeded.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Error to indicate that too many negative criteria added to some
 * campaign.
 */
public class CampaignCriterionLimitExceeded  extends com.google.api.ads.adwords.axis.v201306.cm.EntityCountLimitExceeded  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201306.cm.CampaignCriterionLimitExceededCriteriaLimitType limitType;

    public CampaignCriterionLimitExceeded() {
    }

    public CampaignCriterionLimitExceeded(
           java.lang.String fieldPath,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201306.cm.EntityCountLimitExceededReason reason,
           java.lang.String enclosingId,
           java.lang.Integer limit,
           java.lang.String accountLimitType,
           java.lang.Integer existingCount,
           com.google.api.ads.adwords.axis.v201306.cm.CampaignCriterionLimitExceededCriteriaLimitType limitType) {
        super(
            fieldPath,
            trigger,
            errorString,
            apiErrorType,
            reason,
            enclosingId,
            limit,
            accountLimitType,
            existingCount);
        this.limitType = limitType;
    }


    /**
     * Gets the limitType value for this CampaignCriterionLimitExceeded.
     * 
     * @return limitType
     */
    public com.google.api.ads.adwords.axis.v201306.cm.CampaignCriterionLimitExceededCriteriaLimitType getLimitType() {
        return limitType;
    }


    /**
     * Sets the limitType value for this CampaignCriterionLimitExceeded.
     * 
     * @param limitType
     */
    public void setLimitType(com.google.api.ads.adwords.axis.v201306.cm.CampaignCriterionLimitExceededCriteriaLimitType limitType) {
        this.limitType = limitType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignCriterionLimitExceeded)) return false;
        CampaignCriterionLimitExceeded other = (CampaignCriterionLimitExceeded) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.limitType==null && other.getLimitType()==null) || 
             (this.limitType!=null &&
              this.limitType.equals(other.getLimitType())));
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
        if (getLimitType() != null) {
            _hashCode += getLimitType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignCriterionLimitExceeded.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignCriterionLimitExceeded"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "limitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "CampaignCriterionLimitExceeded.CriteriaLimitType"));
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
