/**
 * SpotlightActivityGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class SpotlightActivityGroup  extends com.google.api.ads.dfa.axis.v1_20.SpotlightActivityGroupBase  implements java.io.Serializable {
    private int groupType;

    private long spotlightConfigurationId;

    private java.lang.String tagString;

    public SpotlightActivityGroup() {
    }

    public SpotlightActivityGroup(
           long id,
           java.lang.String name,
           int groupType,
           long spotlightConfigurationId,
           java.lang.String tagString) {
        super(
            id,
            name);
        this.groupType = groupType;
        this.spotlightConfigurationId = spotlightConfigurationId;
        this.tagString = tagString;
    }


    /**
     * Gets the groupType value for this SpotlightActivityGroup.
     * 
     * @return groupType
     */
    public int getGroupType() {
        return groupType;
    }


    /**
     * Sets the groupType value for this SpotlightActivityGroup.
     * 
     * @param groupType
     */
    public void setGroupType(int groupType) {
        this.groupType = groupType;
    }


    /**
     * Gets the spotlightConfigurationId value for this SpotlightActivityGroup.
     * 
     * @return spotlightConfigurationId
     */
    public long getSpotlightConfigurationId() {
        return spotlightConfigurationId;
    }


    /**
     * Sets the spotlightConfigurationId value for this SpotlightActivityGroup.
     * 
     * @param spotlightConfigurationId
     */
    public void setSpotlightConfigurationId(long spotlightConfigurationId) {
        this.spotlightConfigurationId = spotlightConfigurationId;
    }


    /**
     * Gets the tagString value for this SpotlightActivityGroup.
     * 
     * @return tagString
     */
    public java.lang.String getTagString() {
        return tagString;
    }


    /**
     * Sets the tagString value for this SpotlightActivityGroup.
     * 
     * @param tagString
     */
    public void setTagString(java.lang.String tagString) {
        this.tagString = tagString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpotlightActivityGroup)) return false;
        SpotlightActivityGroup other = (SpotlightActivityGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.groupType == other.getGroupType() &&
            this.spotlightConfigurationId == other.getSpotlightConfigurationId() &&
            ((this.tagString==null && other.getTagString()==null) || 
             (this.tagString!=null &&
              this.tagString.equals(other.getTagString())));
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
        _hashCode += getGroupType();
        _hashCode += new Long(getSpotlightConfigurationId()).hashCode();
        if (getTagString() != null) {
            _hashCode += getTagString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpotlightActivityGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SpotlightActivityGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spotlightConfigurationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spotlightConfigurationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagString"));
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
