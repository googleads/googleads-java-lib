/**
 * PricingSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class PricingSchedule  implements java.io.Serializable {
    private int capCostOption;

    private java.util.Calendar endDate;

    private boolean flighted;

    private com.google.api.ads.dfa.axis.v1_20.PricingPeriod[] pricingPeriods;

    private int pricingType;

    private java.util.Calendar startDate;

    private java.util.Calendar testingStartDate;

    public PricingSchedule() {
    }

    public PricingSchedule(
           int capCostOption,
           java.util.Calendar endDate,
           boolean flighted,
           com.google.api.ads.dfa.axis.v1_20.PricingPeriod[] pricingPeriods,
           int pricingType,
           java.util.Calendar startDate,
           java.util.Calendar testingStartDate) {
           this.capCostOption = capCostOption;
           this.endDate = endDate;
           this.flighted = flighted;
           this.pricingPeriods = pricingPeriods;
           this.pricingType = pricingType;
           this.startDate = startDate;
           this.testingStartDate = testingStartDate;
    }


    /**
     * Gets the capCostOption value for this PricingSchedule.
     * 
     * @return capCostOption
     */
    public int getCapCostOption() {
        return capCostOption;
    }


    /**
     * Sets the capCostOption value for this PricingSchedule.
     * 
     * @param capCostOption
     */
    public void setCapCostOption(int capCostOption) {
        this.capCostOption = capCostOption;
    }


    /**
     * Gets the endDate value for this PricingSchedule.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PricingSchedule.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the flighted value for this PricingSchedule.
     * 
     * @return flighted
     */
    public boolean isFlighted() {
        return flighted;
    }


    /**
     * Sets the flighted value for this PricingSchedule.
     * 
     * @param flighted
     */
    public void setFlighted(boolean flighted) {
        this.flighted = flighted;
    }


    /**
     * Gets the pricingPeriods value for this PricingSchedule.
     * 
     * @return pricingPeriods
     */
    public com.google.api.ads.dfa.axis.v1_20.PricingPeriod[] getPricingPeriods() {
        return pricingPeriods;
    }


    /**
     * Sets the pricingPeriods value for this PricingSchedule.
     * 
     * @param pricingPeriods
     */
    public void setPricingPeriods(com.google.api.ads.dfa.axis.v1_20.PricingPeriod[] pricingPeriods) {
        this.pricingPeriods = pricingPeriods;
    }


    /**
     * Gets the pricingType value for this PricingSchedule.
     * 
     * @return pricingType
     */
    public int getPricingType() {
        return pricingType;
    }


    /**
     * Sets the pricingType value for this PricingSchedule.
     * 
     * @param pricingType
     */
    public void setPricingType(int pricingType) {
        this.pricingType = pricingType;
    }


    /**
     * Gets the startDate value for this PricingSchedule.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PricingSchedule.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the testingStartDate value for this PricingSchedule.
     * 
     * @return testingStartDate
     */
    public java.util.Calendar getTestingStartDate() {
        return testingStartDate;
    }


    /**
     * Sets the testingStartDate value for this PricingSchedule.
     * 
     * @param testingStartDate
     */
    public void setTestingStartDate(java.util.Calendar testingStartDate) {
        this.testingStartDate = testingStartDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricingSchedule)) return false;
        PricingSchedule other = (PricingSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.capCostOption == other.getCapCostOption() &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.flighted == other.isFlighted() &&
            ((this.pricingPeriods==null && other.getPricingPeriods()==null) || 
             (this.pricingPeriods!=null &&
              java.util.Arrays.equals(this.pricingPeriods, other.getPricingPeriods()))) &&
            this.pricingType == other.getPricingType() &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.testingStartDate==null && other.getTestingStartDate()==null) || 
             (this.testingStartDate!=null &&
              this.testingStartDate.equals(other.getTestingStartDate())));
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
        _hashCode += getCapCostOption();
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += (isFlighted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPricingPeriods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingPeriods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingPeriods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPricingType();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTestingStartDate() != null) {
            _hashCode += getTestingStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricingSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PricingSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capCostOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capCostOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flighted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flighted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PricingPeriod"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricingType"));
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
        elemField.setFieldName("testingStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testingStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
