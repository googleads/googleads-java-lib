/**
 * RuleItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.rm;


/**
 * An atomic rule fragment.
 */
public class RuleItem  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201607.rm.DateRuleItem dateRuleItem;

    private com.google.api.ads.adwords.axis.v201607.rm.NumberRuleItem numberRuleItem;

    private com.google.api.ads.adwords.axis.v201607.rm.StringRuleItem stringRuleItem;

    public RuleItem() {
    }

    public RuleItem(
           com.google.api.ads.adwords.axis.v201607.rm.DateRuleItem dateRuleItem,
           com.google.api.ads.adwords.axis.v201607.rm.NumberRuleItem numberRuleItem,
           com.google.api.ads.adwords.axis.v201607.rm.StringRuleItem stringRuleItem) {
           this.dateRuleItem = dateRuleItem;
           this.numberRuleItem = numberRuleItem;
           this.stringRuleItem = stringRuleItem;
    }


    /**
     * Gets the dateRuleItem value for this RuleItem.
     * 
     * @return dateRuleItem
     */
    public com.google.api.ads.adwords.axis.v201607.rm.DateRuleItem getDateRuleItem() {
        return dateRuleItem;
    }


    /**
     * Sets the dateRuleItem value for this RuleItem.
     * 
     * @param dateRuleItem
     */
    public void setDateRuleItem(com.google.api.ads.adwords.axis.v201607.rm.DateRuleItem dateRuleItem) {
        this.dateRuleItem = dateRuleItem;
    }


    /**
     * Gets the numberRuleItem value for this RuleItem.
     * 
     * @return numberRuleItem
     */
    public com.google.api.ads.adwords.axis.v201607.rm.NumberRuleItem getNumberRuleItem() {
        return numberRuleItem;
    }


    /**
     * Sets the numberRuleItem value for this RuleItem.
     * 
     * @param numberRuleItem
     */
    public void setNumberRuleItem(com.google.api.ads.adwords.axis.v201607.rm.NumberRuleItem numberRuleItem) {
        this.numberRuleItem = numberRuleItem;
    }


    /**
     * Gets the stringRuleItem value for this RuleItem.
     * 
     * @return stringRuleItem
     */
    public com.google.api.ads.adwords.axis.v201607.rm.StringRuleItem getStringRuleItem() {
        return stringRuleItem;
    }


    /**
     * Sets the stringRuleItem value for this RuleItem.
     * 
     * @param stringRuleItem
     */
    public void setStringRuleItem(com.google.api.ads.adwords.axis.v201607.rm.StringRuleItem stringRuleItem) {
        this.stringRuleItem = stringRuleItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleItem)) return false;
        RuleItem other = (RuleItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateRuleItem==null && other.getDateRuleItem()==null) || 
             (this.dateRuleItem!=null &&
              this.dateRuleItem.equals(other.getDateRuleItem()))) &&
            ((this.numberRuleItem==null && other.getNumberRuleItem()==null) || 
             (this.numberRuleItem!=null &&
              this.numberRuleItem.equals(other.getNumberRuleItem()))) &&
            ((this.stringRuleItem==null && other.getStringRuleItem()==null) || 
             (this.stringRuleItem!=null &&
              this.stringRuleItem.equals(other.getStringRuleItem())));
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
        if (getDateRuleItem() != null) {
            _hashCode += getDateRuleItem().hashCode();
        }
        if (getNumberRuleItem() != null) {
            _hashCode += getNumberRuleItem().hashCode();
        }
        if (getStringRuleItem() != null) {
            _hashCode += getStringRuleItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "RuleItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRuleItem");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "DateRuleItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "DateRuleItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberRuleItem");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "NumberRuleItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "NumberRuleItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringRuleItem");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "StringRuleItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201607", "StringRuleItem"));
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
