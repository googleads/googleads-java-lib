/**
 * WorkflowActionPerformer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;


/**
 * A {@code WorkflowActionPerformer} represents a workflow action
 * performer. The performer is either
 *             an individual user or a team.
 */
public class WorkflowActionPerformer  implements java.io.Serializable {
    /* The unique ID of the {@code WorkflowActionPerformer} */
    private java.lang.Long id;

    /* The type of {@code WorkflowActionPerformer}, either user or
     * team. */
    private com.google.api.ads.dfp.axis.v201308.WorkflowRoundActionPerformerType type;

    /* The ID of user if performer is a single user. */
    private java.lang.Long userId;

    /* The team Id if performer is a team. */
    private java.lang.Long teamId;

    public WorkflowActionPerformer() {
    }

    public WorkflowActionPerformer(
           java.lang.Long id,
           com.google.api.ads.dfp.axis.v201308.WorkflowRoundActionPerformerType type,
           java.lang.Long userId,
           java.lang.Long teamId) {
           this.id = id;
           this.type = type;
           this.userId = userId;
           this.teamId = teamId;
    }


    /**
     * Gets the id value for this WorkflowActionPerformer.
     * 
     * @return id   * The unique ID of the {@code WorkflowActionPerformer}
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkflowActionPerformer.
     * 
     * @param id   * The unique ID of the {@code WorkflowActionPerformer}
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the type value for this WorkflowActionPerformer.
     * 
     * @return type   * The type of {@code WorkflowActionPerformer}, either user or
     * team.
     */
    public com.google.api.ads.dfp.axis.v201308.WorkflowRoundActionPerformerType getType() {
        return type;
    }


    /**
     * Sets the type value for this WorkflowActionPerformer.
     * 
     * @param type   * The type of {@code WorkflowActionPerformer}, either user or
     * team.
     */
    public void setType(com.google.api.ads.dfp.axis.v201308.WorkflowRoundActionPerformerType type) {
        this.type = type;
    }


    /**
     * Gets the userId value for this WorkflowActionPerformer.
     * 
     * @return userId   * The ID of user if performer is a single user.
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this WorkflowActionPerformer.
     * 
     * @param userId   * The ID of user if performer is a single user.
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the teamId value for this WorkflowActionPerformer.
     * 
     * @return teamId   * The team Id if performer is a team.
     */
    public java.lang.Long getTeamId() {
        return teamId;
    }


    /**
     * Sets the teamId value for this WorkflowActionPerformer.
     * 
     * @param teamId   * The team Id if performer is a team.
     */
    public void setTeamId(java.lang.Long teamId) {
        this.teamId = teamId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowActionPerformer)) return false;
        WorkflowActionPerformer other = (WorkflowActionPerformer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.teamId==null && other.getTeamId()==null) || 
             (this.teamId!=null &&
              this.teamId.equals(other.getTeamId())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getTeamId() != null) {
            _hashCode += getTeamId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowActionPerformer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "WorkflowActionPerformer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "WorkflowRoundActionPerformerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "teamId"));
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
