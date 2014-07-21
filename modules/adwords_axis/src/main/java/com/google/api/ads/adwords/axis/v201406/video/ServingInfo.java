/**
 * ServingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * ServingInfo has all information relative to how an entity (e.g.
 * Campaign, VideoAd,...)
 *             serves ads. This includes the {ServingStatus} and optionally
 * a set of {ServingIssue}s.
 *             {@link ServingStatus#IMPROVABLE} and {@link ServingStatus#BROKEN}
 * must have a set of issues.
 *             When returning from an API service such as VideoAdService,
 * the ServingInfo will always be set
 *             to {@link #UNDEFINED}. Only the ServingIssuesService will
 * create real ServingInfo objects.
 */
public class ServingInfo  implements java.io.Serializable {
    /* The list of issues. */
    private com.google.api.ads.adwords.axis.v201406.video.ServingIssue[] issues;

    private com.google.api.ads.adwords.axis.v201406.video.ServingStatus servingStatus;

    public ServingInfo() {
    }

    public ServingInfo(
           com.google.api.ads.adwords.axis.v201406.video.ServingIssue[] issues,
           com.google.api.ads.adwords.axis.v201406.video.ServingStatus servingStatus) {
           this.issues = issues;
           this.servingStatus = servingStatus;
    }


    /**
     * Gets the issues value for this ServingInfo.
     * 
     * @return issues   * The list of issues.
     */
    public com.google.api.ads.adwords.axis.v201406.video.ServingIssue[] getIssues() {
        return issues;
    }


    /**
     * Sets the issues value for this ServingInfo.
     * 
     * @param issues   * The list of issues.
     */
    public void setIssues(com.google.api.ads.adwords.axis.v201406.video.ServingIssue[] issues) {
        this.issues = issues;
    }

    public com.google.api.ads.adwords.axis.v201406.video.ServingIssue getIssues(int i) {
        return this.issues[i];
    }

    public void setIssues(int i, com.google.api.ads.adwords.axis.v201406.video.ServingIssue _value) {
        this.issues[i] = _value;
    }


    /**
     * Gets the servingStatus value for this ServingInfo.
     * 
     * @return servingStatus
     */
    public com.google.api.ads.adwords.axis.v201406.video.ServingStatus getServingStatus() {
        return servingStatus;
    }


    /**
     * Sets the servingStatus value for this ServingInfo.
     * 
     * @param servingStatus
     */
    public void setServingStatus(com.google.api.ads.adwords.axis.v201406.video.ServingStatus servingStatus) {
        this.servingStatus = servingStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServingInfo)) return false;
        ServingInfo other = (ServingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.issues==null && other.getIssues()==null) || 
             (this.issues!=null &&
              java.util.Arrays.equals(this.issues, other.getIssues()))) &&
            ((this.servingStatus==null && other.getServingStatus()==null) || 
             (this.servingStatus!=null &&
              this.servingStatus.equals(other.getServingStatus())));
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
        if (getIssues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServingStatus() != null) {
            _hashCode += getServingStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "issues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingIssue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "servingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "ServingStatus"));
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
