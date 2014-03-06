/**
 * ExcludeContentFromContentBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;


/**
 * The action used for explicitly excluding specific content from
 * a {@link ContentBundle} object.
 */
public class ExcludeContentFromContentBundle  extends com.google.api.ads.dfp.axis.v201306.ContentBundleAction  implements java.io.Serializable {
    /* The Publisher Query Language statement specifying which {@link
     * Content} to exclude from the
     *                     {@link ContentBundle}. The statement is expressed
     * in terms of {@code Content} fields such as
     *                     name and status.
     *                     <p>
     *                     All fields supported by {@link ContentService#getContentByStatement}
     * are supported on this
     *                     statement. */
    private com.google.api.ads.dfp.axis.v201306.Statement contentStatement;

    public ExcludeContentFromContentBundle() {
    }

    public ExcludeContentFromContentBundle(
           java.lang.String contentBundleActionType,
           com.google.api.ads.dfp.axis.v201306.Statement contentStatement) {
        super(
            contentBundleActionType);
        this.contentStatement = contentStatement;
    }


    /**
     * Gets the contentStatement value for this ExcludeContentFromContentBundle.
     * 
     * @return contentStatement   * The Publisher Query Language statement specifying which {@link
     * Content} to exclude from the
     *                     {@link ContentBundle}. The statement is expressed
     * in terms of {@code Content} fields such as
     *                     name and status.
     *                     <p>
     *                     All fields supported by {@link ContentService#getContentByStatement}
     * are supported on this
     *                     statement.
     */
    public com.google.api.ads.dfp.axis.v201306.Statement getContentStatement() {
        return contentStatement;
    }


    /**
     * Sets the contentStatement value for this ExcludeContentFromContentBundle.
     * 
     * @param contentStatement   * The Publisher Query Language statement specifying which {@link
     * Content} to exclude from the
     *                     {@link ContentBundle}. The statement is expressed
     * in terms of {@code Content} fields such as
     *                     name and status.
     *                     <p>
     *                     All fields supported by {@link ContentService#getContentByStatement}
     * are supported on this
     *                     statement.
     */
    public void setContentStatement(com.google.api.ads.dfp.axis.v201306.Statement contentStatement) {
        this.contentStatement = contentStatement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcludeContentFromContentBundle)) return false;
        ExcludeContentFromContentBundle other = (ExcludeContentFromContentBundle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentStatement==null && other.getContentStatement()==null) || 
             (this.contentStatement!=null &&
              this.contentStatement.equals(other.getContentStatement())));
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
        if (getContentStatement() != null) {
            _hashCode += getContentStatement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcludeContentFromContentBundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ExcludeContentFromContentBundle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "contentStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Statement"));
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
