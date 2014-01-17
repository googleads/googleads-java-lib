/**
 * LineItemCreativeAssociationAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;


/**
 * Represents the actions that can be performed on
 *             {@link LineItemCreativeAssociation} objects.
 */
public abstract class LineItemCreativeAssociationAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of LineItemCreativeAssociationAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String lineItemCreativeAssociationActionType;

    public LineItemCreativeAssociationAction() {
    }

    public LineItemCreativeAssociationAction(
           java.lang.String lineItemCreativeAssociationActionType) {
           this.lineItemCreativeAssociationActionType = lineItemCreativeAssociationActionType;
    }


    /**
     * Gets the lineItemCreativeAssociationActionType value for this LineItemCreativeAssociationAction.
     * 
     * @return lineItemCreativeAssociationActionType   * Indicates that this instance is a subtype of LineItemCreativeAssociationAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getLineItemCreativeAssociationActionType() {
        return lineItemCreativeAssociationActionType;
    }


    /**
     * Sets the lineItemCreativeAssociationActionType value for this LineItemCreativeAssociationAction.
     * 
     * @param lineItemCreativeAssociationActionType   * Indicates that this instance is a subtype of LineItemCreativeAssociationAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setLineItemCreativeAssociationActionType(java.lang.String lineItemCreativeAssociationActionType) {
        this.lineItemCreativeAssociationActionType = lineItemCreativeAssociationActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemCreativeAssociationAction)) return false;
        LineItemCreativeAssociationAction other = (LineItemCreativeAssociationAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemCreativeAssociationActionType==null && other.getLineItemCreativeAssociationActionType()==null) || 
             (this.lineItemCreativeAssociationActionType!=null &&
              this.lineItemCreativeAssociationActionType.equals(other.getLineItemCreativeAssociationActionType())));
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
        if (getLineItemCreativeAssociationActionType() != null) {
            _hashCode += getLineItemCreativeAssociationActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemCreativeAssociationAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "LineItemCreativeAssociationAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemCreativeAssociationActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "LineItemCreativeAssociationAction.Type"));
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
