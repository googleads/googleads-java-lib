/**
 * ContentMetadataKeyHierarchyTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201508;


/**
 * Represents one or more {@link CustomTargetingValue custom targeting
 * values} from different
 *             {@link CustomTargetingKey custom targeting keys} ANDed
 * together.
 */
public class ContentMetadataKeyHierarchyTargeting  implements java.io.Serializable {
    /* The list of IDs of the targeted {@link CustomTargetingValue}
     * objects that are ANDed together.
     *                 <p>Targeting values do not need to be in the order
     * of the hierarchy levels. For example,
     *                 if the hierarchy is "show > season > genre" the values
     * could be
     *                 "season=3, show=30rock, genre=comedy." */
    private long[] customTargetingValueIds;

    public ContentMetadataKeyHierarchyTargeting() {
    }

    public ContentMetadataKeyHierarchyTargeting(
           long[] customTargetingValueIds) {
           this.customTargetingValueIds = customTargetingValueIds;
    }


    /**
     * Gets the customTargetingValueIds value for this ContentMetadataKeyHierarchyTargeting.
     * 
     * @return customTargetingValueIds   * The list of IDs of the targeted {@link CustomTargetingValue}
     * objects that are ANDed together.
     *                 <p>Targeting values do not need to be in the order
     * of the hierarchy levels. For example,
     *                 if the hierarchy is "show > season > genre" the values
     * could be
     *                 "season=3, show=30rock, genre=comedy."
     */
    public long[] getCustomTargetingValueIds() {
        return customTargetingValueIds;
    }


    /**
     * Sets the customTargetingValueIds value for this ContentMetadataKeyHierarchyTargeting.
     * 
     * @param customTargetingValueIds   * The list of IDs of the targeted {@link CustomTargetingValue}
     * objects that are ANDed together.
     *                 <p>Targeting values do not need to be in the order
     * of the hierarchy levels. For example,
     *                 if the hierarchy is "show > season > genre" the values
     * could be
     *                 "season=3, show=30rock, genre=comedy."
     */
    public void setCustomTargetingValueIds(long[] customTargetingValueIds) {
        this.customTargetingValueIds = customTargetingValueIds;
    }

    public long getCustomTargetingValueIds(int i) {
        return this.customTargetingValueIds[i];
    }

    public void setCustomTargetingValueIds(int i, long _value) {
        this.customTargetingValueIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentMetadataKeyHierarchyTargeting)) return false;
        ContentMetadataKeyHierarchyTargeting other = (ContentMetadataKeyHierarchyTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customTargetingValueIds==null && other.getCustomTargetingValueIds()==null) || 
             (this.customTargetingValueIds!=null &&
              java.util.Arrays.equals(this.customTargetingValueIds, other.getCustomTargetingValueIds())));
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
        if (getCustomTargetingValueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomTargetingValueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomTargetingValueIds(), i);
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
        new org.apache.axis.description.TypeDesc(ContentMetadataKeyHierarchyTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "ContentMetadataKeyHierarchyTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingValueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "customTargetingValueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
