/**
 * CreativeAdAssociationUpdateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeAdAssociationUpdateRequest  implements java.io.Serializable {
    private long[] adIds;

    private boolean associationStatus;

    private java.lang.String clickThroughUrl;

    private long creativeId;

    private java.util.Calendar endDate;

    private java.lang.String[] propertiesToUpdate;

    private java.util.Calendar startDate;

    public CreativeAdAssociationUpdateRequest() {
    }

    public CreativeAdAssociationUpdateRequest(
           long[] adIds,
           boolean associationStatus,
           java.lang.String clickThroughUrl,
           long creativeId,
           java.util.Calendar endDate,
           java.lang.String[] propertiesToUpdate,
           java.util.Calendar startDate) {
           this.adIds = adIds;
           this.associationStatus = associationStatus;
           this.clickThroughUrl = clickThroughUrl;
           this.creativeId = creativeId;
           this.endDate = endDate;
           this.propertiesToUpdate = propertiesToUpdate;
           this.startDate = startDate;
    }


    /**
     * Gets the adIds value for this CreativeAdAssociationUpdateRequest.
     * 
     * @return adIds
     */
    public long[] getAdIds() {
        return adIds;
    }


    /**
     * Sets the adIds value for this CreativeAdAssociationUpdateRequest.
     * 
     * @param adIds
     */
    public void setAdIds(long[] adIds) {
        this.adIds = adIds;
    }


    /**
     * Gets the associationStatus value for this CreativeAdAssociationUpdateRequest.
     * 
     * @return associationStatus
     */
    public boolean isAssociationStatus() {
        return associationStatus;
    }


    /**
     * Sets the associationStatus value for this CreativeAdAssociationUpdateRequest.
     * 
     * @param associationStatus
     */
    public void setAssociationStatus(boolean associationStatus) {
        this.associationStatus = associationStatus;
    }


    /**
     * Gets the clickThroughUrl value for this CreativeAdAssociationUpdateRequest.
     * 
     * @return clickThroughUrl
     */
    public java.lang.String getClickThroughUrl() {
        return clickThroughUrl;
    }


    /**
     * Sets the clickThroughUrl value for this CreativeAdAssociationUpdateRequest.
     * 
     * @param clickThroughUrl
     */
    public void setClickThroughUrl(java.lang.String clickThroughUrl) {
        this.clickThroughUrl = clickThroughUrl;
    }


    /**
     * Gets the creativeId value for this CreativeAdAssociationUpdateRequest.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativeAdAssociationUpdateRequest.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the endDate value for this CreativeAdAssociationUpdateRequest.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CreativeAdAssociationUpdateRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the propertiesToUpdate value for this CreativeAdAssociationUpdateRequest.
     * 
     * @return propertiesToUpdate
     */
    public java.lang.String[] getPropertiesToUpdate() {
        return propertiesToUpdate;
    }


    /**
     * Sets the propertiesToUpdate value for this CreativeAdAssociationUpdateRequest.
     * 
     * @param propertiesToUpdate
     */
    public void setPropertiesToUpdate(java.lang.String[] propertiesToUpdate) {
        this.propertiesToUpdate = propertiesToUpdate;
    }


    /**
     * Gets the startDate value for this CreativeAdAssociationUpdateRequest.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CreativeAdAssociationUpdateRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeAdAssociationUpdateRequest)) return false;
        CreativeAdAssociationUpdateRequest other = (CreativeAdAssociationUpdateRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adIds==null && other.getAdIds()==null) || 
             (this.adIds!=null &&
              java.util.Arrays.equals(this.adIds, other.getAdIds()))) &&
            this.associationStatus == other.isAssociationStatus() &&
            ((this.clickThroughUrl==null && other.getClickThroughUrl()==null) || 
             (this.clickThroughUrl!=null &&
              this.clickThroughUrl.equals(other.getClickThroughUrl()))) &&
            this.creativeId == other.getCreativeId() &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.propertiesToUpdate==null && other.getPropertiesToUpdate()==null) || 
             (this.propertiesToUpdate!=null &&
              java.util.Arrays.equals(this.propertiesToUpdate, other.getPropertiesToUpdate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        if (getAdIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isAssociationStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getClickThroughUrl() != null) {
            _hashCode += getClickThroughUrl().hashCode();
        }
        _hashCode += new Long(getCreativeId()).hashCode();
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPropertiesToUpdate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertiesToUpdate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertiesToUpdate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeAdAssociationUpdateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeAdAssociationUpdateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertiesToUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertiesToUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
