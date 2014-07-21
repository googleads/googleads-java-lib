/**
 * TargetingGroupAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * An association between a VideoAd and a TargetingGroup, with a mutable
 * for a status for that association.
 */
public class TargetingGroupAssociation  implements java.io.Serializable {
    /* A targeting group id with which to associate this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long targetingGroupId;

    /* The status of this association.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociationStatus status;

    public TargetingGroupAssociation() {
    }

    public TargetingGroupAssociation(
           java.lang.Long targetingGroupId,
           com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociationStatus status) {
           this.targetingGroupId = targetingGroupId;
           this.status = status;
    }


    /**
     * Gets the targetingGroupId value for this TargetingGroupAssociation.
     * 
     * @return targetingGroupId   * A targeting group id with which to associate this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getTargetingGroupId() {
        return targetingGroupId;
    }


    /**
     * Sets the targetingGroupId value for this TargetingGroupAssociation.
     * 
     * @param targetingGroupId   * A targeting group id with which to associate this VideoAd.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setTargetingGroupId(java.lang.Long targetingGroupId) {
        this.targetingGroupId = targetingGroupId;
    }


    /**
     * Gets the status value for this TargetingGroupAssociation.
     * 
     * @return status   * The status of this association.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociationStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TargetingGroupAssociation.
     * 
     * @param status   * The status of this association.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201406.video.TargetingGroupAssociationStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingGroupAssociation)) return false;
        TargetingGroupAssociation other = (TargetingGroupAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetingGroupId==null && other.getTargetingGroupId()==null) || 
             (this.targetingGroupId!=null &&
              this.targetingGroupId.equals(other.getTargetingGroupId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getTargetingGroupId() != null) {
            _hashCode += getTargetingGroupId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingGroupAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingGroupAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "targetingGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingGroupAssociation.Status"));
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
