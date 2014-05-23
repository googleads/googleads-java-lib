/**
 * QualityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Container for criterion quality information.
 */
public class QualityInfo  implements java.io.Serializable {
    /* Whether the keyword relevance is acceptable. */
    private java.lang.Boolean isKeywordAdRelevanceAcceptable;

    /* Whether the landing page quality is acceptable. */
    private java.lang.Boolean isLandingPageQualityAcceptable;

    /* Whether the latency to load the landing page is acceptable. */
    private java.lang.Boolean isLandingPageLatencyAcceptable;

    /* Keyword quality score that ranges from 1 to 10, 1 being the
     * lowest, 10 the highest. */
    private java.lang.Integer qualityScore;

    public QualityInfo() {
    }

    public QualityInfo(
           java.lang.Boolean isKeywordAdRelevanceAcceptable,
           java.lang.Boolean isLandingPageQualityAcceptable,
           java.lang.Boolean isLandingPageLatencyAcceptable,
           java.lang.Integer qualityScore) {
           this.isKeywordAdRelevanceAcceptable = isKeywordAdRelevanceAcceptable;
           this.isLandingPageQualityAcceptable = isLandingPageQualityAcceptable;
           this.isLandingPageLatencyAcceptable = isLandingPageLatencyAcceptable;
           this.qualityScore = qualityScore;
    }


    /**
     * Gets the isKeywordAdRelevanceAcceptable value for this QualityInfo.
     * 
     * @return isKeywordAdRelevanceAcceptable   * Whether the keyword relevance is acceptable.
     */
    public java.lang.Boolean getIsKeywordAdRelevanceAcceptable() {
        return isKeywordAdRelevanceAcceptable;
    }


    /**
     * Sets the isKeywordAdRelevanceAcceptable value for this QualityInfo.
     * 
     * @param isKeywordAdRelevanceAcceptable   * Whether the keyword relevance is acceptable.
     */
    public void setIsKeywordAdRelevanceAcceptable(java.lang.Boolean isKeywordAdRelevanceAcceptable) {
        this.isKeywordAdRelevanceAcceptable = isKeywordAdRelevanceAcceptable;
    }


    /**
     * Gets the isLandingPageQualityAcceptable value for this QualityInfo.
     * 
     * @return isLandingPageQualityAcceptable   * Whether the landing page quality is acceptable.
     */
    public java.lang.Boolean getIsLandingPageQualityAcceptable() {
        return isLandingPageQualityAcceptable;
    }


    /**
     * Sets the isLandingPageQualityAcceptable value for this QualityInfo.
     * 
     * @param isLandingPageQualityAcceptable   * Whether the landing page quality is acceptable.
     */
    public void setIsLandingPageQualityAcceptable(java.lang.Boolean isLandingPageQualityAcceptable) {
        this.isLandingPageQualityAcceptable = isLandingPageQualityAcceptable;
    }


    /**
     * Gets the isLandingPageLatencyAcceptable value for this QualityInfo.
     * 
     * @return isLandingPageLatencyAcceptable   * Whether the latency to load the landing page is acceptable.
     */
    public java.lang.Boolean getIsLandingPageLatencyAcceptable() {
        return isLandingPageLatencyAcceptable;
    }


    /**
     * Sets the isLandingPageLatencyAcceptable value for this QualityInfo.
     * 
     * @param isLandingPageLatencyAcceptable   * Whether the latency to load the landing page is acceptable.
     */
    public void setIsLandingPageLatencyAcceptable(java.lang.Boolean isLandingPageLatencyAcceptable) {
        this.isLandingPageLatencyAcceptable = isLandingPageLatencyAcceptable;
    }


    /**
     * Gets the qualityScore value for this QualityInfo.
     * 
     * @return qualityScore   * Keyword quality score that ranges from 1 to 10, 1 being the
     * lowest, 10 the highest.
     */
    public java.lang.Integer getQualityScore() {
        return qualityScore;
    }


    /**
     * Sets the qualityScore value for this QualityInfo.
     * 
     * @param qualityScore   * Keyword quality score that ranges from 1 to 10, 1 being the
     * lowest, 10 the highest.
     */
    public void setQualityScore(java.lang.Integer qualityScore) {
        this.qualityScore = qualityScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QualityInfo)) return false;
        QualityInfo other = (QualityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isKeywordAdRelevanceAcceptable==null && other.getIsKeywordAdRelevanceAcceptable()==null) || 
             (this.isKeywordAdRelevanceAcceptable!=null &&
              this.isKeywordAdRelevanceAcceptable.equals(other.getIsKeywordAdRelevanceAcceptable()))) &&
            ((this.isLandingPageQualityAcceptable==null && other.getIsLandingPageQualityAcceptable()==null) || 
             (this.isLandingPageQualityAcceptable!=null &&
              this.isLandingPageQualityAcceptable.equals(other.getIsLandingPageQualityAcceptable()))) &&
            ((this.isLandingPageLatencyAcceptable==null && other.getIsLandingPageLatencyAcceptable()==null) || 
             (this.isLandingPageLatencyAcceptable!=null &&
              this.isLandingPageLatencyAcceptable.equals(other.getIsLandingPageLatencyAcceptable()))) &&
            ((this.qualityScore==null && other.getQualityScore()==null) || 
             (this.qualityScore!=null &&
              this.qualityScore.equals(other.getQualityScore())));
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
        if (getIsKeywordAdRelevanceAcceptable() != null) {
            _hashCode += getIsKeywordAdRelevanceAcceptable().hashCode();
        }
        if (getIsLandingPageQualityAcceptable() != null) {
            _hashCode += getIsLandingPageQualityAcceptable().hashCode();
        }
        if (getIsLandingPageLatencyAcceptable() != null) {
            _hashCode += getIsLandingPageLatencyAcceptable().hashCode();
        }
        if (getQualityScore() != null) {
            _hashCode += getQualityScore().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QualityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "QualityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKeywordAdRelevanceAcceptable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "isKeywordAdRelevanceAcceptable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLandingPageQualityAcceptable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "isLandingPageQualityAcceptable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLandingPageLatencyAcceptable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "isLandingPageLatencyAcceptable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "qualityScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
