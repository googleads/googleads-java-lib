/**
 * CreativeOptimizationConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeOptimizationConfiguration  implements java.io.Serializable {
    private int minimumCreativeWeight;

    private int optimizationModelId;

    private int relativeStrength;

    private com.google.api.ads.dfa.axis.v1_20.SpotlightActivityWeight[] spotlightActivities;

    public CreativeOptimizationConfiguration() {
    }

    public CreativeOptimizationConfiguration(
           int minimumCreativeWeight,
           int optimizationModelId,
           int relativeStrength,
           com.google.api.ads.dfa.axis.v1_20.SpotlightActivityWeight[] spotlightActivities) {
           this.minimumCreativeWeight = minimumCreativeWeight;
           this.optimizationModelId = optimizationModelId;
           this.relativeStrength = relativeStrength;
           this.spotlightActivities = spotlightActivities;
    }


    /**
     * Gets the minimumCreativeWeight value for this CreativeOptimizationConfiguration.
     * 
     * @return minimumCreativeWeight
     */
    public int getMinimumCreativeWeight() {
        return minimumCreativeWeight;
    }


    /**
     * Sets the minimumCreativeWeight value for this CreativeOptimizationConfiguration.
     * 
     * @param minimumCreativeWeight
     */
    public void setMinimumCreativeWeight(int minimumCreativeWeight) {
        this.minimumCreativeWeight = minimumCreativeWeight;
    }


    /**
     * Gets the optimizationModelId value for this CreativeOptimizationConfiguration.
     * 
     * @return optimizationModelId
     */
    public int getOptimizationModelId() {
        return optimizationModelId;
    }


    /**
     * Sets the optimizationModelId value for this CreativeOptimizationConfiguration.
     * 
     * @param optimizationModelId
     */
    public void setOptimizationModelId(int optimizationModelId) {
        this.optimizationModelId = optimizationModelId;
    }


    /**
     * Gets the relativeStrength value for this CreativeOptimizationConfiguration.
     * 
     * @return relativeStrength
     */
    public int getRelativeStrength() {
        return relativeStrength;
    }


    /**
     * Sets the relativeStrength value for this CreativeOptimizationConfiguration.
     * 
     * @param relativeStrength
     */
    public void setRelativeStrength(int relativeStrength) {
        this.relativeStrength = relativeStrength;
    }


    /**
     * Gets the spotlightActivities value for this CreativeOptimizationConfiguration.
     * 
     * @return spotlightActivities
     */
    public com.google.api.ads.dfa.axis.v1_20.SpotlightActivityWeight[] getSpotlightActivities() {
        return spotlightActivities;
    }


    /**
     * Sets the spotlightActivities value for this CreativeOptimizationConfiguration.
     * 
     * @param spotlightActivities
     */
    public void setSpotlightActivities(com.google.api.ads.dfa.axis.v1_20.SpotlightActivityWeight[] spotlightActivities) {
        this.spotlightActivities = spotlightActivities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeOptimizationConfiguration)) return false;
        CreativeOptimizationConfiguration other = (CreativeOptimizationConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.minimumCreativeWeight == other.getMinimumCreativeWeight() &&
            this.optimizationModelId == other.getOptimizationModelId() &&
            this.relativeStrength == other.getRelativeStrength() &&
            ((this.spotlightActivities==null && other.getSpotlightActivities()==null) || 
             (this.spotlightActivities!=null &&
              java.util.Arrays.equals(this.spotlightActivities, other.getSpotlightActivities())));
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
        _hashCode += getMinimumCreativeWeight();
        _hashCode += getOptimizationModelId();
        _hashCode += getRelativeStrength();
        if (getSpotlightActivities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpotlightActivities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpotlightActivities(), i);
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
        new org.apache.axis.description.TypeDesc(CreativeOptimizationConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeOptimizationConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumCreativeWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimumCreativeWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimizationModelId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optimizationModelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeStrength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relativeStrength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spotlightActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spotlightActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SpotlightActivityWeight"));
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
