/**
 * FeedItemAdGroupTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * Specifies the adgroup the request context must match in order for
 * the feed item to be considered eligible for serving (aka the targeted
 * adgroup).
 *             E.g., if the below adgroup targeting is set to adgroup
 * = X, then the feed
 *             item can only serve under adgroup X.
 */
public class FeedItemAdGroupTargeting  implements java.io.Serializable {
    /* The ID of the adgroup to target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TargetingAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private java.lang.Long targetingAdGroupId;

    public FeedItemAdGroupTargeting() {
    }

    public FeedItemAdGroupTargeting(
           java.lang.Long targetingAdGroupId) {
           this.targetingAdGroupId = targetingAdGroupId;
    }


    /**
     * Gets the targetingAdGroupId value for this FeedItemAdGroupTargeting.
     * 
     * @return targetingAdGroupId   * The ID of the adgroup to target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TargetingAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.Long getTargetingAdGroupId() {
        return targetingAdGroupId;
    }


    /**
     * Sets the targetingAdGroupId value for this FeedItemAdGroupTargeting.
     * 
     * @param targetingAdGroupId   * The ID of the adgroup to target.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TargetingAdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setTargetingAdGroupId(java.lang.Long targetingAdGroupId) {
        this.targetingAdGroupId = targetingAdGroupId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemAdGroupTargeting)) return false;
        FeedItemAdGroupTargeting other = (FeedItemAdGroupTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetingAdGroupId==null && other.getTargetingAdGroupId()==null) || 
             (this.targetingAdGroupId!=null &&
              this.targetingAdGroupId.equals(other.getTargetingAdGroupId())));
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
        if (getTargetingAdGroupId() != null) {
            _hashCode += getTargetingAdGroupId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemAdGroupTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "FeedItemAdGroupTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingAdGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "TargetingAdGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
