/**
 * ProgrammaticSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class ProgrammaticSetting  implements java.io.Serializable {
    private java.lang.String insertionOrderId;

    private double mediaCost;

    private boolean programmatic;

    private java.lang.String[] traffickerEmails;

    public ProgrammaticSetting() {
    }

    public ProgrammaticSetting(
           java.lang.String insertionOrderId,
           double mediaCost,
           boolean programmatic,
           java.lang.String[] traffickerEmails) {
           this.insertionOrderId = insertionOrderId;
           this.mediaCost = mediaCost;
           this.programmatic = programmatic;
           this.traffickerEmails = traffickerEmails;
    }


    /**
     * Gets the insertionOrderId value for this ProgrammaticSetting.
     * 
     * @return insertionOrderId
     */
    public java.lang.String getInsertionOrderId() {
        return insertionOrderId;
    }


    /**
     * Sets the insertionOrderId value for this ProgrammaticSetting.
     * 
     * @param insertionOrderId
     */
    public void setInsertionOrderId(java.lang.String insertionOrderId) {
        this.insertionOrderId = insertionOrderId;
    }


    /**
     * Gets the mediaCost value for this ProgrammaticSetting.
     * 
     * @return mediaCost
     */
    public double getMediaCost() {
        return mediaCost;
    }


    /**
     * Sets the mediaCost value for this ProgrammaticSetting.
     * 
     * @param mediaCost
     */
    public void setMediaCost(double mediaCost) {
        this.mediaCost = mediaCost;
    }


    /**
     * Gets the programmatic value for this ProgrammaticSetting.
     * 
     * @return programmatic
     */
    public boolean isProgrammatic() {
        return programmatic;
    }


    /**
     * Sets the programmatic value for this ProgrammaticSetting.
     * 
     * @param programmatic
     */
    public void setProgrammatic(boolean programmatic) {
        this.programmatic = programmatic;
    }


    /**
     * Gets the traffickerEmails value for this ProgrammaticSetting.
     * 
     * @return traffickerEmails
     */
    public java.lang.String[] getTraffickerEmails() {
        return traffickerEmails;
    }


    /**
     * Sets the traffickerEmails value for this ProgrammaticSetting.
     * 
     * @param traffickerEmails
     */
    public void setTraffickerEmails(java.lang.String[] traffickerEmails) {
        this.traffickerEmails = traffickerEmails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgrammaticSetting)) return false;
        ProgrammaticSetting other = (ProgrammaticSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertionOrderId==null && other.getInsertionOrderId()==null) || 
             (this.insertionOrderId!=null &&
              this.insertionOrderId.equals(other.getInsertionOrderId()))) &&
            this.mediaCost == other.getMediaCost() &&
            this.programmatic == other.isProgrammatic() &&
            ((this.traffickerEmails==null && other.getTraffickerEmails()==null) || 
             (this.traffickerEmails!=null &&
              java.util.Arrays.equals(this.traffickerEmails, other.getTraffickerEmails())));
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
        if (getInsertionOrderId() != null) {
            _hashCode += getInsertionOrderId().hashCode();
        }
        _hashCode += new Double(getMediaCost()).hashCode();
        _hashCode += (isProgrammatic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTraffickerEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTraffickerEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTraffickerEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgrammaticSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ProgrammaticSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertionOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertionOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programmatic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programmatic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffickerEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traffickerEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
