/**
 * InStreamAdInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.o;


/**
 * Information specific to the instream ad format. Instream ads are
 * video ads
 *             which play as part of the delivery of video content, either
 * before, during,
 *             or after the content itself.
 */
public class InStreamAdInfo  implements java.io.Serializable {
    /* The maximum ad duration (sec). */
    private java.lang.Integer maxAdDuration;

    /* The minimum ad duration (sec). */
    private java.lang.Integer minAdDuration;

    /* The median ad duration (sec). */
    private java.lang.Integer medianAdDuration;

    /* Percentage of ads shown before the video content. */
    private java.lang.Double preRollPercent;

    /* Percentage of ads shown during the video content. */
    private java.lang.Double midRollPercent;

    /* Percentage of ads shown after the video content. */
    private java.lang.Double postRollPercent;

    public InStreamAdInfo() {
    }

    public InStreamAdInfo(
           java.lang.Integer maxAdDuration,
           java.lang.Integer minAdDuration,
           java.lang.Integer medianAdDuration,
           java.lang.Double preRollPercent,
           java.lang.Double midRollPercent,
           java.lang.Double postRollPercent) {
           this.maxAdDuration = maxAdDuration;
           this.minAdDuration = minAdDuration;
           this.medianAdDuration = medianAdDuration;
           this.preRollPercent = preRollPercent;
           this.midRollPercent = midRollPercent;
           this.postRollPercent = postRollPercent;
    }


    /**
     * Gets the maxAdDuration value for this InStreamAdInfo.
     * 
     * @return maxAdDuration   * The maximum ad duration (sec).
     */
    public java.lang.Integer getMaxAdDuration() {
        return maxAdDuration;
    }


    /**
     * Sets the maxAdDuration value for this InStreamAdInfo.
     * 
     * @param maxAdDuration   * The maximum ad duration (sec).
     */
    public void setMaxAdDuration(java.lang.Integer maxAdDuration) {
        this.maxAdDuration = maxAdDuration;
    }


    /**
     * Gets the minAdDuration value for this InStreamAdInfo.
     * 
     * @return minAdDuration   * The minimum ad duration (sec).
     */
    public java.lang.Integer getMinAdDuration() {
        return minAdDuration;
    }


    /**
     * Sets the minAdDuration value for this InStreamAdInfo.
     * 
     * @param minAdDuration   * The minimum ad duration (sec).
     */
    public void setMinAdDuration(java.lang.Integer minAdDuration) {
        this.minAdDuration = minAdDuration;
    }


    /**
     * Gets the medianAdDuration value for this InStreamAdInfo.
     * 
     * @return medianAdDuration   * The median ad duration (sec).
     */
    public java.lang.Integer getMedianAdDuration() {
        return medianAdDuration;
    }


    /**
     * Sets the medianAdDuration value for this InStreamAdInfo.
     * 
     * @param medianAdDuration   * The median ad duration (sec).
     */
    public void setMedianAdDuration(java.lang.Integer medianAdDuration) {
        this.medianAdDuration = medianAdDuration;
    }


    /**
     * Gets the preRollPercent value for this InStreamAdInfo.
     * 
     * @return preRollPercent   * Percentage of ads shown before the video content.
     */
    public java.lang.Double getPreRollPercent() {
        return preRollPercent;
    }


    /**
     * Sets the preRollPercent value for this InStreamAdInfo.
     * 
     * @param preRollPercent   * Percentage of ads shown before the video content.
     */
    public void setPreRollPercent(java.lang.Double preRollPercent) {
        this.preRollPercent = preRollPercent;
    }


    /**
     * Gets the midRollPercent value for this InStreamAdInfo.
     * 
     * @return midRollPercent   * Percentage of ads shown during the video content.
     */
    public java.lang.Double getMidRollPercent() {
        return midRollPercent;
    }


    /**
     * Sets the midRollPercent value for this InStreamAdInfo.
     * 
     * @param midRollPercent   * Percentage of ads shown during the video content.
     */
    public void setMidRollPercent(java.lang.Double midRollPercent) {
        this.midRollPercent = midRollPercent;
    }


    /**
     * Gets the postRollPercent value for this InStreamAdInfo.
     * 
     * @return postRollPercent   * Percentage of ads shown after the video content.
     */
    public java.lang.Double getPostRollPercent() {
        return postRollPercent;
    }


    /**
     * Sets the postRollPercent value for this InStreamAdInfo.
     * 
     * @param postRollPercent   * Percentage of ads shown after the video content.
     */
    public void setPostRollPercent(java.lang.Double postRollPercent) {
        this.postRollPercent = postRollPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InStreamAdInfo)) return false;
        InStreamAdInfo other = (InStreamAdInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxAdDuration==null && other.getMaxAdDuration()==null) || 
             (this.maxAdDuration!=null &&
              this.maxAdDuration.equals(other.getMaxAdDuration()))) &&
            ((this.minAdDuration==null && other.getMinAdDuration()==null) || 
             (this.minAdDuration!=null &&
              this.minAdDuration.equals(other.getMinAdDuration()))) &&
            ((this.medianAdDuration==null && other.getMedianAdDuration()==null) || 
             (this.medianAdDuration!=null &&
              this.medianAdDuration.equals(other.getMedianAdDuration()))) &&
            ((this.preRollPercent==null && other.getPreRollPercent()==null) || 
             (this.preRollPercent!=null &&
              this.preRollPercent.equals(other.getPreRollPercent()))) &&
            ((this.midRollPercent==null && other.getMidRollPercent()==null) || 
             (this.midRollPercent!=null &&
              this.midRollPercent.equals(other.getMidRollPercent()))) &&
            ((this.postRollPercent==null && other.getPostRollPercent()==null) || 
             (this.postRollPercent!=null &&
              this.postRollPercent.equals(other.getPostRollPercent())));
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
        if (getMaxAdDuration() != null) {
            _hashCode += getMaxAdDuration().hashCode();
        }
        if (getMinAdDuration() != null) {
            _hashCode += getMinAdDuration().hashCode();
        }
        if (getMedianAdDuration() != null) {
            _hashCode += getMedianAdDuration().hashCode();
        }
        if (getPreRollPercent() != null) {
            _hashCode += getPreRollPercent().hashCode();
        }
        if (getMidRollPercent() != null) {
            _hashCode += getMidRollPercent().hashCode();
        }
        if (getPostRollPercent() != null) {
            _hashCode += getPostRollPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InStreamAdInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "InStreamAdInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAdDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "maxAdDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAdDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "minAdDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medianAdDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "medianAdDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preRollPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "preRollPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midRollPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "midRollPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postRollPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "postRollPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
