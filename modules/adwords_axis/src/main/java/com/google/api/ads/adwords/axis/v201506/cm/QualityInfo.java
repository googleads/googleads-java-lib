/**
 * QualityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * Container for criterion quality information.
 */
public class QualityInfo  implements java.io.Serializable {
    /* Whether the keyword relevance is acceptable. */
    private java.lang.Boolean isKeywordAdRelevanceAcceptable;

    /* Whether the landing page quality is acceptable. */
    private java.lang.Boolean isLandingPageQualityAcceptable;

    /* The keyword quality score ranges from 1 (lowest) to 10 (highest).
     * For v201509 and later, this field may be returned as NULL if AdWords
     * does not have enough information to determine an appropriate quality
     * score value. */
    private java.lang.Integer qualityScore;

    public QualityInfo() {
    }

    public QualityInfo(
           java.lang.Boolean isKeywordAdRelevanceAcceptable,
           java.lang.Boolean isLandingPageQualityAcceptable,
           java.lang.Integer qualityScore) {
           this.isKeywordAdRelevanceAcceptable = isKeywordAdRelevanceAcceptable;
           this.isLandingPageQualityAcceptable = isLandingPageQualityAcceptable;
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
     * Gets the qualityScore value for this QualityInfo.
     * 
     * @return qualityScore   * The keyword quality score ranges from 1 (lowest) to 10 (highest).
     * For v201509 and later, this field may be returned as NULL if AdWords
     * does not have enough information to determine an appropriate quality
     * score value.
     */
    public java.lang.Integer getQualityScore() {
        return qualityScore;
    }


    /**
     * Sets the qualityScore value for this QualityInfo.
     * 
     * @param qualityScore   * The keyword quality score ranges from 1 (lowest) to 10 (highest).
     * For v201509 and later, this field may be returned as NULL if AdWords
     * does not have enough information to determine an appropriate quality
     * score value.
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "QualityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKeywordAdRelevanceAcceptable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "isKeywordAdRelevanceAcceptable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLandingPageQualityAcceptable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "isLandingPageQualityAcceptable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualityScore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "qualityScore"));
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
