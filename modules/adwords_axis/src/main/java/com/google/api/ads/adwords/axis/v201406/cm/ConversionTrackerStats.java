/**
 * ConversionTrackerStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;


/**
 * Usage stats about a single {@link ConversionTracker}.
 */
public class ConversionTrackerStats  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "NumConversionEvents".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Integer numConversionEvents;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "ConversionValue".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Money conversionValue;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "MostRecentConversionDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String mostRecentConversionDate;

    /* The number of converted clicks, a.k.a. 1-per-click conversions.
     * <span class="constraint Selectable">This field can be selected using
     * the value "NumConvertedClicks".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Integer numConvertedClicks;

    public ConversionTrackerStats() {
    }

    public ConversionTrackerStats(
           java.lang.Integer numConversionEvents,
           com.google.api.ads.adwords.axis.v201406.cm.Money conversionValue,
           java.lang.String mostRecentConversionDate,
           java.lang.Integer numConvertedClicks) {
           this.numConversionEvents = numConversionEvents;
           this.conversionValue = conversionValue;
           this.mostRecentConversionDate = mostRecentConversionDate;
           this.numConvertedClicks = numConvertedClicks;
    }


    /**
     * Gets the numConversionEvents value for this ConversionTrackerStats.
     * 
     * @return numConversionEvents   * <span class="constraint Selectable">This field can be selected
     * using the value "NumConversionEvents".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getNumConversionEvents() {
        return numConversionEvents;
    }


    /**
     * Sets the numConversionEvents value for this ConversionTrackerStats.
     * 
     * @param numConversionEvents   * <span class="constraint Selectable">This field can be selected
     * using the value "NumConversionEvents".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setNumConversionEvents(java.lang.Integer numConversionEvents) {
        this.numConversionEvents = numConversionEvents;
    }


    /**
     * Gets the conversionValue value for this ConversionTrackerStats.
     * 
     * @return conversionValue   * <span class="constraint Selectable">This field can be selected
     * using the value "ConversionValue".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Money getConversionValue() {
        return conversionValue;
    }


    /**
     * Sets the conversionValue value for this ConversionTrackerStats.
     * 
     * @param conversionValue   * <span class="constraint Selectable">This field can be selected
     * using the value "ConversionValue".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setConversionValue(com.google.api.ads.adwords.axis.v201406.cm.Money conversionValue) {
        this.conversionValue = conversionValue;
    }


    /**
     * Gets the mostRecentConversionDate value for this ConversionTrackerStats.
     * 
     * @return mostRecentConversionDate   * <span class="constraint Selectable">This field can be selected
     * using the value "MostRecentConversionDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getMostRecentConversionDate() {
        return mostRecentConversionDate;
    }


    /**
     * Sets the mostRecentConversionDate value for this ConversionTrackerStats.
     * 
     * @param mostRecentConversionDate   * <span class="constraint Selectable">This field can be selected
     * using the value "MostRecentConversionDate".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMostRecentConversionDate(java.lang.String mostRecentConversionDate) {
        this.mostRecentConversionDate = mostRecentConversionDate;
    }


    /**
     * Gets the numConvertedClicks value for this ConversionTrackerStats.
     * 
     * @return numConvertedClicks   * The number of converted clicks, a.k.a. 1-per-click conversions.
     * <span class="constraint Selectable">This field can be selected using
     * the value "NumConvertedClicks".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Integer getNumConvertedClicks() {
        return numConvertedClicks;
    }


    /**
     * Sets the numConvertedClicks value for this ConversionTrackerStats.
     * 
     * @param numConvertedClicks   * The number of converted clicks, a.k.a. 1-per-click conversions.
     * <span class="constraint Selectable">This field can be selected using
     * the value "NumConvertedClicks".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setNumConvertedClicks(java.lang.Integer numConvertedClicks) {
        this.numConvertedClicks = numConvertedClicks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionTrackerStats)) return false;
        ConversionTrackerStats other = (ConversionTrackerStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numConversionEvents==null && other.getNumConversionEvents()==null) || 
             (this.numConversionEvents!=null &&
              this.numConversionEvents.equals(other.getNumConversionEvents()))) &&
            ((this.conversionValue==null && other.getConversionValue()==null) || 
             (this.conversionValue!=null &&
              this.conversionValue.equals(other.getConversionValue()))) &&
            ((this.mostRecentConversionDate==null && other.getMostRecentConversionDate()==null) || 
             (this.mostRecentConversionDate!=null &&
              this.mostRecentConversionDate.equals(other.getMostRecentConversionDate()))) &&
            ((this.numConvertedClicks==null && other.getNumConvertedClicks()==null) || 
             (this.numConvertedClicks!=null &&
              this.numConvertedClicks.equals(other.getNumConvertedClicks())));
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
        if (getNumConversionEvents() != null) {
            _hashCode += getNumConversionEvents().hashCode();
        }
        if (getConversionValue() != null) {
            _hashCode += getConversionValue().hashCode();
        }
        if (getMostRecentConversionDate() != null) {
            _hashCode += getMostRecentConversionDate().hashCode();
        }
        if (getNumConvertedClicks() != null) {
            _hashCode += getNumConvertedClicks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionTrackerStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "ConversionTrackerStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numConversionEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "numConversionEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "conversionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mostRecentConversionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "mostRecentConversionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numConvertedClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "numConvertedClicks"));
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
