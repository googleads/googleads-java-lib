/**
 * AdBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public abstract class AdBase  extends com.google.api.ads.dfa.axis.v1_19.Base  implements java.io.Serializable {
    private boolean active;

    private boolean archived;

    private long campaignId;

    private java.lang.String comments;

    private java.util.Calendar endTime;

    private com.google.api.ads.dfa.axis.v1_19.PlacementAssignment[] placementAssignments;

    private long sizeId;

    private java.util.Calendar startTime;

    private long typeId;

    public AdBase() {
    }

    public AdBase(
           long id,
           java.lang.String name,
           boolean active,
           boolean archived,
           long campaignId,
           java.lang.String comments,
           java.util.Calendar endTime,
           com.google.api.ads.dfa.axis.v1_19.PlacementAssignment[] placementAssignments,
           long sizeId,
           java.util.Calendar startTime,
           long typeId) {
        super(
            id,
            name);
        this.active = active;
        this.archived = archived;
        this.campaignId = campaignId;
        this.comments = comments;
        this.endTime = endTime;
        this.placementAssignments = placementAssignments;
        this.sizeId = sizeId;
        this.startTime = startTime;
        this.typeId = typeId;
    }


    /**
     * Gets the active value for this AdBase.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this AdBase.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the archived value for this AdBase.
     * 
     * @return archived
     */
    public boolean isArchived() {
        return archived;
    }


    /**
     * Sets the archived value for this AdBase.
     * 
     * @param archived
     */
    public void setArchived(boolean archived) {
        this.archived = archived;
    }


    /**
     * Gets the campaignId value for this AdBase.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this AdBase.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the comments value for this AdBase.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this AdBase.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the endTime value for this AdBase.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this AdBase.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the placementAssignments value for this AdBase.
     * 
     * @return placementAssignments
     */
    public com.google.api.ads.dfa.axis.v1_19.PlacementAssignment[] getPlacementAssignments() {
        return placementAssignments;
    }


    /**
     * Sets the placementAssignments value for this AdBase.
     * 
     * @param placementAssignments
     */
    public void setPlacementAssignments(com.google.api.ads.dfa.axis.v1_19.PlacementAssignment[] placementAssignments) {
        this.placementAssignments = placementAssignments;
    }


    /**
     * Gets the sizeId value for this AdBase.
     * 
     * @return sizeId
     */
    public long getSizeId() {
        return sizeId;
    }


    /**
     * Sets the sizeId value for this AdBase.
     * 
     * @param sizeId
     */
    public void setSizeId(long sizeId) {
        this.sizeId = sizeId;
    }


    /**
     * Gets the startTime value for this AdBase.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this AdBase.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the typeId value for this AdBase.
     * 
     * @return typeId
     */
    public long getTypeId() {
        return typeId;
    }


    /**
     * Sets the typeId value for this AdBase.
     * 
     * @param typeId
     */
    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdBase)) return false;
        AdBase other = (AdBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.active == other.isActive() &&
            this.archived == other.isArchived() &&
            this.campaignId == other.getCampaignId() &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.placementAssignments==null && other.getPlacementAssignments()==null) || 
             (this.placementAssignments!=null &&
              java.util.Arrays.equals(this.placementAssignments, other.getPlacementAssignments()))) &&
            this.sizeId == other.getSizeId() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            this.typeId == other.getTypeId();
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isArchived() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCampaignId()).hashCode();
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getPlacementAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getSizeId()).hashCode();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        _hashCode += new Long(getTypeId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PlacementAssignment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
