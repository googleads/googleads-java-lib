/**
 * CustomCriteriaNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * A {@link CustomCriteriaNode} is a node in the custom targeting
 * tree. A custom
 *             criteria node can either be a {@link CustomCriteriaSet}
 * (a non-leaf node) or
 *             a {@link CustomCriteria} (a leaf node). The custom criteria
 * targeting tree is
 *             subject to the rules defined on {@link Targeting#customTargeting}.
 */
public abstract class CustomCriteriaNode  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of CustomCriteriaNode.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String customCriteriaNodeType;

    public CustomCriteriaNode() {
    }

    public CustomCriteriaNode(
           java.lang.String customCriteriaNodeType) {
           this.customCriteriaNodeType = customCriteriaNodeType;
    }


    /**
     * Gets the customCriteriaNodeType value for this CustomCriteriaNode.
     * 
     * @return customCriteriaNodeType   * Indicates that this instance is a subtype of CustomCriteriaNode.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getCustomCriteriaNodeType() {
        return customCriteriaNodeType;
    }


    /**
     * Sets the customCriteriaNodeType value for this CustomCriteriaNode.
     * 
     * @param customCriteriaNodeType   * Indicates that this instance is a subtype of CustomCriteriaNode.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setCustomCriteriaNodeType(java.lang.String customCriteriaNodeType) {
        this.customCriteriaNodeType = customCriteriaNodeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCriteriaNode)) return false;
        CustomCriteriaNode other = (CustomCriteriaNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customCriteriaNodeType==null && other.getCustomCriteriaNodeType()==null) || 
             (this.customCriteriaNodeType!=null &&
              this.customCriteriaNodeType.equals(other.getCustomCriteriaNodeType())));
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
        if (getCustomCriteriaNodeType() != null) {
            _hashCode += getCustomCriteriaNodeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomCriteriaNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CustomCriteriaNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customCriteriaNodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CustomCriteriaNode.Type"));
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
