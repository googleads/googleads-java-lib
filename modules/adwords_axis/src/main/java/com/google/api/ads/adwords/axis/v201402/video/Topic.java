/**
 * Topic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Use verticals to target videos based on the category into which
 * the
 *             video falls (for example, "Pets &amp; Animals/Pets/Dogs").
 * <a href=
 *             "/adwords/api/docs/appendix/verticals">
 *             View the complete list of available vertical categories.</a>
 */
public class Topic  extends com.google.api.ads.adwords.axis.v201402.video.BaseCriterion  implements java.io.Serializable {
    /* The id that identifies the vertical.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Long verticalId;

    /* Human readable path of vertical names specified in en-US locale.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.String[] verticalPath;

    public Topic() {
    }

    public Topic(
           java.lang.Long id,
           java.lang.String baseCriterionType,
           java.lang.Long verticalId,
           java.lang.String[] verticalPath) {
        super(
            id,
            baseCriterionType);
        this.verticalId = verticalId;
        this.verticalPath = verticalPath;
    }


    /**
     * Gets the verticalId value for this Topic.
     * 
     * @return verticalId   * The id that identifies the vertical.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Long getVerticalId() {
        return verticalId;
    }


    /**
     * Sets the verticalId value for this Topic.
     * 
     * @param verticalId   * The id that identifies the vertical.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setVerticalId(java.lang.Long verticalId) {
        this.verticalId = verticalId;
    }


    /**
     * Gets the verticalPath value for this Topic.
     * 
     * @return verticalPath   * Human readable path of vertical names specified in en-US locale.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.String[] getVerticalPath() {
        return verticalPath;
    }


    /**
     * Sets the verticalPath value for this Topic.
     * 
     * @param verticalPath   * Human readable path of vertical names specified in en-US locale.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setVerticalPath(java.lang.String[] verticalPath) {
        this.verticalPath = verticalPath;
    }

    public java.lang.String getVerticalPath(int i) {
        return this.verticalPath[i];
    }

    public void setVerticalPath(int i, java.lang.String _value) {
        this.verticalPath[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Topic)) return false;
        Topic other = (Topic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.verticalId==null && other.getVerticalId()==null) || 
             (this.verticalId!=null &&
              this.verticalId.equals(other.getVerticalId()))) &&
            ((this.verticalPath==null && other.getVerticalPath()==null) || 
             (this.verticalPath!=null &&
              java.util.Arrays.equals(this.verticalPath, other.getVerticalPath())));
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
        if (getVerticalId() != null) {
            _hashCode += getVerticalId().hashCode();
        }
        if (getVerticalPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVerticalPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVerticalPath(), i);
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
        new org.apache.axis.description.TypeDesc(Topic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "Topic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "verticalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "verticalPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
