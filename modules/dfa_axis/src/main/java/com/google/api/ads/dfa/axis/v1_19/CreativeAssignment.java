/**
 * CreativeAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeAssignment  implements java.io.Serializable {
    private boolean active;

    private java.lang.String alternalteText;

    private com.google.api.ads.dfa.axis.v1_19.ClickThroughUrl clickThroughUrl;

    private com.google.api.ads.dfa.axis.v1_19.CreativeGroupAssignment creativeGroupAssignment;

    private long creativeId;

    private java.util.Calendar endDate;

    private com.google.api.ads.dfa.axis.v1_19.RichMediaExitOverride[] richMediaExitOverrides;

    private int sequence;

    private java.util.Calendar startDate;

    private int weight;

    public CreativeAssignment() {
    }

    public CreativeAssignment(
           boolean active,
           java.lang.String alternalteText,
           com.google.api.ads.dfa.axis.v1_19.ClickThroughUrl clickThroughUrl,
           com.google.api.ads.dfa.axis.v1_19.CreativeGroupAssignment creativeGroupAssignment,
           long creativeId,
           java.util.Calendar endDate,
           com.google.api.ads.dfa.axis.v1_19.RichMediaExitOverride[] richMediaExitOverrides,
           int sequence,
           java.util.Calendar startDate,
           int weight) {
           this.active = active;
           this.alternalteText = alternalteText;
           this.clickThroughUrl = clickThroughUrl;
           this.creativeGroupAssignment = creativeGroupAssignment;
           this.creativeId = creativeId;
           this.endDate = endDate;
           this.richMediaExitOverrides = richMediaExitOverrides;
           this.sequence = sequence;
           this.startDate = startDate;
           this.weight = weight;
    }


    /**
     * Gets the active value for this CreativeAssignment.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this CreativeAssignment.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the alternalteText value for this CreativeAssignment.
     * 
     * @return alternalteText
     */
    public java.lang.String getAlternalteText() {
        return alternalteText;
    }


    /**
     * Sets the alternalteText value for this CreativeAssignment.
     * 
     * @param alternalteText
     */
    public void setAlternalteText(java.lang.String alternalteText) {
        this.alternalteText = alternalteText;
    }


    /**
     * Gets the clickThroughUrl value for this CreativeAssignment.
     * 
     * @return clickThroughUrl
     */
    public com.google.api.ads.dfa.axis.v1_19.ClickThroughUrl getClickThroughUrl() {
        return clickThroughUrl;
    }


    /**
     * Sets the clickThroughUrl value for this CreativeAssignment.
     * 
     * @param clickThroughUrl
     */
    public void setClickThroughUrl(com.google.api.ads.dfa.axis.v1_19.ClickThroughUrl clickThroughUrl) {
        this.clickThroughUrl = clickThroughUrl;
    }


    /**
     * Gets the creativeGroupAssignment value for this CreativeAssignment.
     * 
     * @return creativeGroupAssignment
     */
    public com.google.api.ads.dfa.axis.v1_19.CreativeGroupAssignment getCreativeGroupAssignment() {
        return creativeGroupAssignment;
    }


    /**
     * Sets the creativeGroupAssignment value for this CreativeAssignment.
     * 
     * @param creativeGroupAssignment
     */
    public void setCreativeGroupAssignment(com.google.api.ads.dfa.axis.v1_19.CreativeGroupAssignment creativeGroupAssignment) {
        this.creativeGroupAssignment = creativeGroupAssignment;
    }


    /**
     * Gets the creativeId value for this CreativeAssignment.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativeAssignment.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the endDate value for this CreativeAssignment.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CreativeAssignment.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the richMediaExitOverrides value for this CreativeAssignment.
     * 
     * @return richMediaExitOverrides
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaExitOverride[] getRichMediaExitOverrides() {
        return richMediaExitOverrides;
    }


    /**
     * Sets the richMediaExitOverrides value for this CreativeAssignment.
     * 
     * @param richMediaExitOverrides
     */
    public void setRichMediaExitOverrides(com.google.api.ads.dfa.axis.v1_19.RichMediaExitOverride[] richMediaExitOverrides) {
        this.richMediaExitOverrides = richMediaExitOverrides;
    }


    /**
     * Gets the sequence value for this CreativeAssignment.
     * 
     * @return sequence
     */
    public int getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this CreativeAssignment.
     * 
     * @param sequence
     */
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the startDate value for this CreativeAssignment.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CreativeAssignment.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the weight value for this CreativeAssignment.
     * 
     * @return weight
     */
    public int getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this CreativeAssignment.
     * 
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeAssignment)) return false;
        CreativeAssignment other = (CreativeAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.alternalteText==null && other.getAlternalteText()==null) || 
             (this.alternalteText!=null &&
              this.alternalteText.equals(other.getAlternalteText()))) &&
            ((this.clickThroughUrl==null && other.getClickThroughUrl()==null) || 
             (this.clickThroughUrl!=null &&
              this.clickThroughUrl.equals(other.getClickThroughUrl()))) &&
            ((this.creativeGroupAssignment==null && other.getCreativeGroupAssignment()==null) || 
             (this.creativeGroupAssignment!=null &&
              this.creativeGroupAssignment.equals(other.getCreativeGroupAssignment()))) &&
            this.creativeId == other.getCreativeId() &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.richMediaExitOverrides==null && other.getRichMediaExitOverrides()==null) || 
             (this.richMediaExitOverrides!=null &&
              java.util.Arrays.equals(this.richMediaExitOverrides, other.getRichMediaExitOverrides()))) &&
            this.sequence == other.getSequence() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            this.weight == other.getWeight();
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAlternalteText() != null) {
            _hashCode += getAlternalteText().hashCode();
        }
        if (getClickThroughUrl() != null) {
            _hashCode += getClickThroughUrl().hashCode();
        }
        if (getCreativeGroupAssignment() != null) {
            _hashCode += getCreativeGroupAssignment().hashCode();
        }
        _hashCode += new Long(getCreativeId()).hashCode();
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getRichMediaExitOverrides() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRichMediaExitOverrides());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRichMediaExitOverrides(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSequence();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        _hashCode += getWeight();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternalteText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternalteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ClickThroughUrl"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeGroupAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeGroupAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeGroupAssignment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("richMediaExitOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("", "richMediaExitOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaExitOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
