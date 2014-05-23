/**
 * ScopedDisapprovalReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * A composite {@code DisapprovalReason} with the affected {@code
 *             ApprovalContext}.
 */
public class ScopedDisapprovalReason  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201402.video.ApprovalContext approvalContext;

    private com.google.api.ads.adwords.axis.v201402.video.DisapprovalReason disapprovalReason;

    public ScopedDisapprovalReason() {
    }

    public ScopedDisapprovalReason(
           com.google.api.ads.adwords.axis.v201402.video.ApprovalContext approvalContext,
           com.google.api.ads.adwords.axis.v201402.video.DisapprovalReason disapprovalReason) {
           this.approvalContext = approvalContext;
           this.disapprovalReason = disapprovalReason;
    }


    /**
     * Gets the approvalContext value for this ScopedDisapprovalReason.
     * 
     * @return approvalContext
     */
    public com.google.api.ads.adwords.axis.v201402.video.ApprovalContext getApprovalContext() {
        return approvalContext;
    }


    /**
     * Sets the approvalContext value for this ScopedDisapprovalReason.
     * 
     * @param approvalContext
     */
    public void setApprovalContext(com.google.api.ads.adwords.axis.v201402.video.ApprovalContext approvalContext) {
        this.approvalContext = approvalContext;
    }


    /**
     * Gets the disapprovalReason value for this ScopedDisapprovalReason.
     * 
     * @return disapprovalReason
     */
    public com.google.api.ads.adwords.axis.v201402.video.DisapprovalReason getDisapprovalReason() {
        return disapprovalReason;
    }


    /**
     * Sets the disapprovalReason value for this ScopedDisapprovalReason.
     * 
     * @param disapprovalReason
     */
    public void setDisapprovalReason(com.google.api.ads.adwords.axis.v201402.video.DisapprovalReason disapprovalReason) {
        this.disapprovalReason = disapprovalReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScopedDisapprovalReason)) return false;
        ScopedDisapprovalReason other = (ScopedDisapprovalReason) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approvalContext==null && other.getApprovalContext()==null) || 
             (this.approvalContext!=null &&
              this.approvalContext.equals(other.getApprovalContext()))) &&
            ((this.disapprovalReason==null && other.getDisapprovalReason()==null) || 
             (this.disapprovalReason!=null &&
              this.disapprovalReason.equals(other.getDisapprovalReason())));
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
        if (getApprovalContext() != null) {
            _hashCode += getApprovalContext().hashCode();
        }
        if (getDisapprovalReason() != null) {
            _hashCode += getDisapprovalReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScopedDisapprovalReason.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ScopedDisapprovalReason"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalContext");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "approvalContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "ApprovalContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disapprovalReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "disapprovalReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "DisapprovalReason"));
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
