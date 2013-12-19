/**
 * ThirdPartySlotAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;


/**
 * Represents the actions that can be performed on {@link ThirdPartySlot}
 * objects.
 */
public abstract class ThirdPartySlotAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of ThirdPartySlotAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String thirdPartySlotActionType;

    public ThirdPartySlotAction() {
    }

    public ThirdPartySlotAction(
           java.lang.String thirdPartySlotActionType) {
           this.thirdPartySlotActionType = thirdPartySlotActionType;
    }


    /**
     * Gets the thirdPartySlotActionType value for this ThirdPartySlotAction.
     * 
     * @return thirdPartySlotActionType   * Indicates that this instance is a subtype of ThirdPartySlotAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getThirdPartySlotActionType() {
        return thirdPartySlotActionType;
    }


    /**
     * Sets the thirdPartySlotActionType value for this ThirdPartySlotAction.
     * 
     * @param thirdPartySlotActionType   * Indicates that this instance is a subtype of ThirdPartySlotAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setThirdPartySlotActionType(java.lang.String thirdPartySlotActionType) {
        this.thirdPartySlotActionType = thirdPartySlotActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartySlotAction)) return false;
        ThirdPartySlotAction other = (ThirdPartySlotAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.thirdPartySlotActionType==null && other.getThirdPartySlotActionType()==null) || 
             (this.thirdPartySlotActionType!=null &&
              this.thirdPartySlotActionType.equals(other.getThirdPartySlotActionType())));
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
        if (getThirdPartySlotActionType() != null) {
            _hashCode += getThirdPartySlotActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartySlotAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "ThirdPartySlotAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartySlotActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "ThirdPartySlotAction.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
