/**
 * AdScheduleTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Immutable structure to hold an ad schedule target.
 */
public class AdScheduleTarget  extends com.google.api.ads.adwords.axis.v201409.cm.Target  implements java.io.Serializable {
    /* Day of the week the schedule applies to.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.DayOfWeek dayOfWeek;

    /* Starting hour in 24 hour time.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 23, inclusive.</span> */
    private java.lang.Integer startHour;

    /* Interval starts these minutes after the starting hour.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.MinuteOfHour startMinute;

    /* Ending hour in 24 hour time; <code>24</code> signifies end
     * of the day.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 24, inclusive.</span> */
    private java.lang.Integer endHour;

    /* Interval ends these minutes after the ending hour.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.MinuteOfHour endMinute;

    /* Multiplying factor for bids during this specified time interval. */
    private java.lang.Double bidMultiplier;

    public AdScheduleTarget() {
    }

    public AdScheduleTarget(
           java.lang.String targetType,
           com.google.api.ads.adwords.axis.v201409.cm.DayOfWeek dayOfWeek,
           java.lang.Integer startHour,
           com.google.api.ads.adwords.axis.v201409.cm.MinuteOfHour startMinute,
           java.lang.Integer endHour,
           com.google.api.ads.adwords.axis.v201409.cm.MinuteOfHour endMinute,
           java.lang.Double bidMultiplier) {
        super(
            targetType);
        this.dayOfWeek = dayOfWeek;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
        this.bidMultiplier = bidMultiplier;
    }


    /**
     * Gets the dayOfWeek value for this AdScheduleTarget.
     * 
     * @return dayOfWeek   * Day of the week the schedule applies to.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this AdScheduleTarget.
     * 
     * @param dayOfWeek   * Day of the week the schedule applies to.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setDayOfWeek(com.google.api.ads.adwords.axis.v201409.cm.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the startHour value for this AdScheduleTarget.
     * 
     * @return startHour   * Starting hour in 24 hour time.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 23, inclusive.</span>
     */
    public java.lang.Integer getStartHour() {
        return startHour;
    }


    /**
     * Sets the startHour value for this AdScheduleTarget.
     * 
     * @param startHour   * Starting hour in 24 hour time.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 23, inclusive.</span>
     */
    public void setStartHour(java.lang.Integer startHour) {
        this.startHour = startHour;
    }


    /**
     * Gets the startMinute value for this AdScheduleTarget.
     * 
     * @return startMinute   * Interval starts these minutes after the starting hour.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.MinuteOfHour getStartMinute() {
        return startMinute;
    }


    /**
     * Sets the startMinute value for this AdScheduleTarget.
     * 
     * @param startMinute   * Interval starts these minutes after the starting hour.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setStartMinute(com.google.api.ads.adwords.axis.v201409.cm.MinuteOfHour startMinute) {
        this.startMinute = startMinute;
    }


    /**
     * Gets the endHour value for this AdScheduleTarget.
     * 
     * @return endHour   * Ending hour in 24 hour time; <code>24</code> signifies end
     * of the day.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 24, inclusive.</span>
     */
    public java.lang.Integer getEndHour() {
        return endHour;
    }


    /**
     * Sets the endHour value for this AdScheduleTarget.
     * 
     * @param endHour   * Ending hour in 24 hour time; <code>24</code> signifies end
     * of the day.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 24, inclusive.</span>
     */
    public void setEndHour(java.lang.Integer endHour) {
        this.endHour = endHour;
    }


    /**
     * Gets the endMinute value for this AdScheduleTarget.
     * 
     * @return endMinute   * Interval ends these minutes after the ending hour.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.MinuteOfHour getEndMinute() {
        return endMinute;
    }


    /**
     * Sets the endMinute value for this AdScheduleTarget.
     * 
     * @param endMinute   * Interval ends these minutes after the ending hour.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setEndMinute(com.google.api.ads.adwords.axis.v201409.cm.MinuteOfHour endMinute) {
        this.endMinute = endMinute;
    }


    /**
     * Gets the bidMultiplier value for this AdScheduleTarget.
     * 
     * @return bidMultiplier   * Multiplying factor for bids during this specified time interval.
     */
    public java.lang.Double getBidMultiplier() {
        return bidMultiplier;
    }


    /**
     * Sets the bidMultiplier value for this AdScheduleTarget.
     * 
     * @param bidMultiplier   * Multiplying factor for bids during this specified time interval.
     */
    public void setBidMultiplier(java.lang.Double bidMultiplier) {
        this.bidMultiplier = bidMultiplier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdScheduleTarget)) return false;
        AdScheduleTarget other = (AdScheduleTarget) obj;
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
              this.endMinute.equals(other.getEndMinute()))) &&
            ((this.bidMultiplier==null && other.getBidMultiplier()==null) || 
             (this.bidMultiplier!=null &&
              this.bidMultiplier.equals(other.getBidMultiplier())));
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
        if (getBidMultiplier() != null) {
            _hashCode += getBidMultiplier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdScheduleTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AdScheduleTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "DayOfWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "startHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "startMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "MinuteOfHour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "endHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "endMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "MinuteOfHour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidMultiplier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "bidMultiplier"));
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
