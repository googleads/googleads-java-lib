/**
 * Sortable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Marker interface for enums that represent sortable fields.
 */
public class Sortable  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201402.video.StatsSortable statsSortable;

    private com.google.api.ads.adwords.axis.v201402.video.TargetingGroupSortable targetingGroupSortable;

    public Sortable() {
    }

    public Sortable(
           com.google.api.ads.adwords.axis.v201402.video.StatsSortable statsSortable,
           com.google.api.ads.adwords.axis.v201402.video.TargetingGroupSortable targetingGroupSortable) {
           this.statsSortable = statsSortable;
           this.targetingGroupSortable = targetingGroupSortable;
    }


    /**
     * Gets the statsSortable value for this Sortable.
     * 
     * @return statsSortable
     */
    public com.google.api.ads.adwords.axis.v201402.video.StatsSortable getStatsSortable() {
        return statsSortable;
    }


    /**
     * Sets the statsSortable value for this Sortable.
     * 
     * @param statsSortable
     */
    public void setStatsSortable(com.google.api.ads.adwords.axis.v201402.video.StatsSortable statsSortable) {
        this.statsSortable = statsSortable;
    }


    /**
     * Gets the targetingGroupSortable value for this Sortable.
     * 
     * @return targetingGroupSortable
     */
    public com.google.api.ads.adwords.axis.v201402.video.TargetingGroupSortable getTargetingGroupSortable() {
        return targetingGroupSortable;
    }


    /**
     * Sets the targetingGroupSortable value for this Sortable.
     * 
     * @param targetingGroupSortable
     */
    public void setTargetingGroupSortable(com.google.api.ads.adwords.axis.v201402.video.TargetingGroupSortable targetingGroupSortable) {
        this.targetingGroupSortable = targetingGroupSortable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sortable)) return false;
        Sortable other = (Sortable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statsSortable==null && other.getStatsSortable()==null) || 
             (this.statsSortable!=null &&
              this.statsSortable.equals(other.getStatsSortable()))) &&
            ((this.targetingGroupSortable==null && other.getTargetingGroupSortable()==null) || 
             (this.targetingGroupSortable!=null &&
              this.targetingGroupSortable.equals(other.getTargetingGroupSortable())));
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
        if (getStatsSortable() != null) {
            _hashCode += getStatsSortable().hashCode();
        }
        if (getTargetingGroupSortable() != null) {
            _hashCode += getTargetingGroupSortable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sortable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "Sortable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsSortable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "StatsSortable"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "StatsSortable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupSortable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupSortable"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "TargetingGroupSortable"));
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
