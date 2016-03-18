/**
 * ApproveWorkflowApprovalRequests.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201508;


/**
 * The action used to approve {@link WorkflowApprovalRequest workflow
 * approval requests}.
 */
public class ApproveWorkflowApprovalRequests  extends com.google.api.ads.dfp.axis.v201508.WorkflowRequestAction  implements java.io.Serializable {
    /* The comment of the {@link ApproveWorkflowApprovalRequests}
     * action.
     *                     This field is optional. */
    private java.lang.String comment;

    public ApproveWorkflowApprovalRequests() {
    }

    public ApproveWorkflowApprovalRequests(
           java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the comment value for this ApproveWorkflowApprovalRequests.
     * 
     * @return comment   * The comment of the {@link ApproveWorkflowApprovalRequests}
     * action.
     *                     This field is optional.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this ApproveWorkflowApprovalRequests.
     * 
     * @param comment   * The comment of the {@link ApproveWorkflowApprovalRequests}
     * action.
     *                     This field is optional.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApproveWorkflowApprovalRequests)) return false;
        ApproveWorkflowApprovalRequests other = (ApproveWorkflowApprovalRequests) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApproveWorkflowApprovalRequests.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "ApproveWorkflowApprovalRequests"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "comment"));
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
