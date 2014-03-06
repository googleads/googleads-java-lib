/**
 * WorkflowAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;


/**
 * A {@code WorkflowAction} represents an executable in a workflow,
 * such as requesting approval or
 *             sending notification. When the workflow has executed to
 * a round, all of its actions will start.
 */
public class WorkflowAction  implements java.io.Serializable {
    /* The unique ID of the {@code WorkflowAction}. This attribute
     * is readonly and
     *                 is assigned by Google. */
    private java.lang.Long id;

    /* The name of the {@code WorkflowAction}. This attribute is required
     * and has a maximum length of
     *                 255 characters. */
    private java.lang.String name;

    /* The {@link User users} who are able to perform the {@code WorkflowAction}.
     * This attribute is
     *                 required and has a maximum size of 100. */
    private long[] userIds;

    /* The type of this action. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201308.WorkflowActionType type;

    public WorkflowAction() {
    }

    public WorkflowAction(
           java.lang.Long id,
           java.lang.String name,
           long[] userIds,
           com.google.api.ads.dfp.axis.v201308.WorkflowActionType type) {
           this.id = id;
           this.name = name;
           this.userIds = userIds;
           this.type = type;
    }


    /**
     * Gets the id value for this WorkflowAction.
     * 
     * @return id   * The unique ID of the {@code WorkflowAction}. This attribute
     * is readonly and
     *                 is assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkflowAction.
     * 
     * @param id   * The unique ID of the {@code WorkflowAction}. This attribute
     * is readonly and
     *                 is assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this WorkflowAction.
     * 
     * @return name   * The name of the {@code WorkflowAction}. This attribute is required
     * and has a maximum length of
     *                 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WorkflowAction.
     * 
     * @param name   * The name of the {@code WorkflowAction}. This attribute is required
     * and has a maximum length of
     *                 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the userIds value for this WorkflowAction.
     * 
     * @return userIds   * The {@link User users} who are able to perform the {@code WorkflowAction}.
     * This attribute is
     *                 required and has a maximum size of 100.
     */
    public long[] getUserIds() {
        return userIds;
    }


    /**
     * Sets the userIds value for this WorkflowAction.
     * 
     * @param userIds   * The {@link User users} who are able to perform the {@code WorkflowAction}.
     * This attribute is
     *                 required and has a maximum size of 100.
     */
    public void setUserIds(long[] userIds) {
        this.userIds = userIds;
    }

    public long getUserIds(int i) {
        return this.userIds[i];
    }

    public void setUserIds(int i, long _value) {
        this.userIds[i] = _value;
    }


    /**
     * Gets the type value for this WorkflowAction.
     * 
     * @return type   * The type of this action. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201308.WorkflowActionType getType() {
        return type;
    }


    /**
     * Sets the type value for this WorkflowAction.
     * 
     * @param type   * The type of this action. This attribute is required.
     */
    public void setType(com.google.api.ads.dfp.axis.v201308.WorkflowActionType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowAction)) return false;
        WorkflowAction other = (WorkflowAction) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.userIds==null && other.getUserIds()==null) || 
             (this.userIds!=null &&
              java.util.Arrays.equals(this.userIds, other.getUserIds()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUserIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "WorkflowAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "userIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "WorkflowActionType"));
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
