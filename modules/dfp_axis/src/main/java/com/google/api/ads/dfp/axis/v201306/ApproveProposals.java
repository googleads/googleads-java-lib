/**
 * ApproveProposals.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;


/**
 * The action used for approving {@link Proposal} objects.
 */
public class ApproveProposals  extends com.google.api.ads.dfp.axis.v201306.ProposalAction  implements java.io.Serializable {
    /* The list of IDs for the {@link WorkflowAction workflow actions}
     * to approve. This attribute is
     *                     required. */
    private long[] workflowActionIds;

    public ApproveProposals() {
    }

    public ApproveProposals(
           java.lang.String proposalActionType,
           long[] workflowActionIds) {
        super(
            proposalActionType);
        this.workflowActionIds = workflowActionIds;
    }


    /**
     * Gets the workflowActionIds value for this ApproveProposals.
     * 
     * @return workflowActionIds   * The list of IDs for the {@link WorkflowAction workflow actions}
     * to approve. This attribute is
     *                     required.
     */
    public long[] getWorkflowActionIds() {
        return workflowActionIds;
    }


    /**
     * Sets the workflowActionIds value for this ApproveProposals.
     * 
     * @param workflowActionIds   * The list of IDs for the {@link WorkflowAction workflow actions}
     * to approve. This attribute is
     *                     required.
     */
    public void setWorkflowActionIds(long[] workflowActionIds) {
        this.workflowActionIds = workflowActionIds;
    }

    public long getWorkflowActionIds(int i) {
        return this.workflowActionIds[i];
    }

    public void setWorkflowActionIds(int i, long _value) {
        this.workflowActionIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApproveProposals)) return false;
        ApproveProposals other = (ApproveProposals) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.workflowActionIds==null && other.getWorkflowActionIds()==null) || 
             (this.workflowActionIds!=null &&
              java.util.Arrays.equals(this.workflowActionIds, other.getWorkflowActionIds())));
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
        if (getWorkflowActionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkflowActionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkflowActionIds(), i);
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
        new org.apache.axis.description.TypeDesc(ApproveProposals.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApproveProposals"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowActionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "workflowActionIds"));
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
