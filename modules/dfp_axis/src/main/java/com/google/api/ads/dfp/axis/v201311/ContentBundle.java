/**
 * ContentBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * A {@code ContentBundle} is a grouping of individual {@link Content}.
 * A {@code ContentBundle} is
 *             defined as including the {@code Content} that match certain
 * filter rules, along with the
 *             option to explicitly include or exclude certain {@code
 * Content} IDs.
 */
public class ContentBundle  implements java.io.Serializable {
    /* ID that uniquely identifies the {@code ContentBundle}. This
     * attribute is read-only and
     *                 is assigned by Google when a content bundle is created. */
    private java.lang.Long id;

    /* The name of the {@code ContentBundle}. This attribute is required
     * and has a maximum length of
     *                 255 characters. */
    private java.lang.String name;

    /* The description of the {@code ContentBundle}. This attribute
     * is required and has a maximum
     *                 length of 65,535 characters. */
    private java.lang.String description;

    /* The {@link ContentBundleStatus} of the {@code ContentBundle}.
     * This attribute is read-only and
     *                 defaults to {@link ContentBundleStatus#INACTIVE}. */
    private com.google.api.ads.dfp.axis.v201311.ContentBundleStatus status;

    public ContentBundle() {
    }

    public ContentBundle(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201311.ContentBundleStatus status) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.status = status;
    }


    /**
     * Gets the id value for this ContentBundle.
     * 
     * @return id   * ID that uniquely identifies the {@code ContentBundle}. This
     * attribute is read-only and
     *                 is assigned by Google when a content bundle is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ContentBundle.
     * 
     * @param id   * ID that uniquely identifies the {@code ContentBundle}. This
     * attribute is read-only and
     *                 is assigned by Google when a content bundle is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ContentBundle.
     * 
     * @return name   * The name of the {@code ContentBundle}. This attribute is required
     * and has a maximum length of
     *                 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ContentBundle.
     * 
     * @param name   * The name of the {@code ContentBundle}. This attribute is required
     * and has a maximum length of
     *                 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ContentBundle.
     * 
     * @return description   * The description of the {@code ContentBundle}. This attribute
     * is required and has a maximum
     *                 length of 65,535 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ContentBundle.
     * 
     * @param description   * The description of the {@code ContentBundle}. This attribute
     * is required and has a maximum
     *                 length of 65,535 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this ContentBundle.
     * 
     * @return status   * The {@link ContentBundleStatus} of the {@code ContentBundle}.
     * This attribute is read-only and
     *                 defaults to {@link ContentBundleStatus#INACTIVE}.
     */
    public com.google.api.ads.dfp.axis.v201311.ContentBundleStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContentBundle.
     * 
     * @param status   * The {@link ContentBundleStatus} of the {@code ContentBundle}.
     * This attribute is read-only and
     *                 defaults to {@link ContentBundleStatus#INACTIVE}.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201311.ContentBundleStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentBundle)) return false;
        ContentBundle other = (ContentBundle) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentBundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ContentBundle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ContentBundleStatus"));
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
