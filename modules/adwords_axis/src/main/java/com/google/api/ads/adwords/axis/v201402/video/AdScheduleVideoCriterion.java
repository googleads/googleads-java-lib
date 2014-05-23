/**
 * AdScheduleVideoCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents the ad schedule criterion used for campaign scheduling.
 * This criterion is immutable.
 */
public class AdScheduleVideoCriterion  extends com.google.api.ads.adwords.axis.v201402.video.BaseCriterion  implements java.io.Serializable {
    /* Day of week. */
    private com.google.api.ads.adwords.axis.v201402.video.DayOfWeek dayOfWeek;

    /* Start hour. */
    private java.lang.Integer startHour;

    /* Start minute. */
    private com.google.api.ads.adwords.axis.v201402.video.MinuteOfHour startMinute;

    /* End hour. */
    private java.lang.Integer endHour;

    /* End minute. */
    private com.google.api.ads.adwords.axis.v201402.video.MinuteOfHour endMinute;

    public AdScheduleVideoCriterion() {
    }

    public AdScheduleVideoCriterion(
           java.lang.Long id,
           java.lang.String baseCriterionType,
           com.google.api.ads.adwords.axis.v201402.video.DayOfWeek dayOfWeek,
           java.lang.Integer startHour,
           com.google.api.ads.adwords.axis.v201402.video.MinuteOfHour startMinute,
           java.lang.Integer endHour,
           com.google.api.ads.adwords.axis.v201402.video.MinuteOfHour endMinute) {
        super(
            id,
            baseCriterionType);
        this.dayOfWeek = dayOfWeek;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }


    /**
     * Gets the dayOfWeek value for this AdScheduleVideoCriterion.
     * 
     * @return dayOfWeek   * Day of week.
     */
    public com.google.api.ads.adwords.axis.v201402.video.DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this AdScheduleVideoCriterion.
     * 
     * @param dayOfWeek   * Day of week.
     */
    public void setDayOfWeek(com.google.api.ads.adwords.axis.v201402.video.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the startHour value for this AdScheduleVideoCriterion.
     * 
     * @return startHour   * Start hour.
     */
    public java.lang.Integer getStartHour() {
        return startHour;
    }


    /**
     * Sets the startHour value for this AdScheduleVideoCriterion.
     * 
     * @param startHour   * Start hour.
     */
    public void setStartHour(java.lang.Integer startHour) {
        this.startHour = startHour;
    }


    /**
     * Gets the startMinute value for this AdScheduleVideoCriterion.
     * 
     * @return startMinute   * Start minute.
     */
    public com.google.api.ads.adwords.axis.v201402.video.MinuteOfHour getStartMinute() {
        return startMinute;
    }


    /**
     * Sets the startMinute value for this AdScheduleVideoCriterion.
     * 
     * @param startMinute   * Start minute.
     */
    public void setStartMinute(com.google.api.ads.adwords.axis.v201402.video.MinuteOfHour startMinute) {
        this.startMinute = startMinute;
    }


    /**
     * Gets the endHour value for this AdScheduleVideoCriterion.
     * 
     * @return endHour   * End hour.
     */
    public java.lang.Integer getEndHour() {
        return endHour;
    }


    /**
     * Sets the endHour value for this AdScheduleVideoCriterion.
     * 
     * @param endHour   * End hour.
     */
    public void setEndHour(java.lang.Integer endHour) {
        this.endHour = endHour;
    }


    /**
     * Gets the endMinute value for this AdScheduleVideoCriterion.
     * 
     * @return endMinute   * End minute.
     */
    public com.google.api.ads.adwords.axis.v201402.video.MinuteOfHour getEndMinute() {
        return endMinute;
    }


    /**
     * Sets the endMinute value for this AdScheduleVideoCriterion.
     * 
     * @param endMinute   * End minute.
     */
    public void setEndMinute(com.google.api.ads.adwords.axis.v201402.video.MinuteOfHour endMinute) {
        this.endMinute = endMinute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdScheduleVideoCriterion)) return false;
        AdScheduleVideoCriterion other = (AdScheduleVideoCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.startHour==null && other.getStartHour()==null) || 
             (this.startHour!=null &&
              this.startHour.equals(other.getStartHour()))) &&
            ((this.startMinute==null && other.getStartMinute()==null) || 
             (this.startMinute!=null &&
              this.startMinute.equals(other.getStartMinute()))) &&
            ((this.endHour==null && other.getEndHour()==null) || 
             (this.endHour!=null &&
              this.endHour.equals(other.getEndHour()))) &&
            ((this.endMinute==null && other.getEndMinute()==null) || 
             (this.endMinute!=null &&
              this.endMinute.equals(other.getEndMinute())));
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
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getStartHour() != null) {
            _hashCode += getStartHour().hashCode();
        }
        if (getStartMinute() != null) {
            _hashCode += getStartMinute().hashCode();
        }
        if (getEndHour() != null) {
            _hashCode += getEndHour().hashCode();
        }
        if (getEndMinute() != null) {
            _hashCode += getEndMinute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdScheduleVideoCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "AdScheduleVideoCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DayOfWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "startHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "startMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "MinuteOfHour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "endHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "endMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "MinuteOfHour"));
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
