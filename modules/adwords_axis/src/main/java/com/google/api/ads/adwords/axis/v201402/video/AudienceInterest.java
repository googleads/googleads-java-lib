/**
 * AudienceInterest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents interest criterion used for audience targeting.
 *             Interest criterion is immutable.
 */
public class AudienceInterest  extends com.google.api.ads.adwords.axis.v201402.video.BaseCriterion  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private java.lang.Long interestId;

    /* <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String[] interestPath;

    public AudienceInterest() {
    }

    public AudienceInterest(
           java.lang.Long id,
           java.lang.String baseCriterionType,
           java.lang.Long interestId,
           java.lang.String[] interestPath) {
        super(
            id,
            baseCriterionType);
        this.interestId = interestId;
        this.interestPath = interestPath;
    }


    /**
     * Gets the interestId value for this AudienceInterest.
     * 
     * @return interestId   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public java.lang.Long getInterestId() {
        return interestId;
    }


    /**
     * Sets the interestId value for this AudienceInterest.
     * 
     * @param interestId   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setInterestId(java.lang.Long interestId) {
        this.interestId = interestId;
    }


    /**
     * Gets the interestPath value for this AudienceInterest.
     * 
     * @return interestPath   * <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String[] getInterestPath() {
        return interestPath;
    }


    /**
     * Sets the interestPath value for this AudienceInterest.
     * 
     * @param interestPath   * <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setInterestPath(java.lang.String[] interestPath) {
        this.interestPath = interestPath;
    }

    public java.lang.String getInterestPath(int i) {
        return this.interestPath[i];
    }

    public void setInterestPath(int i, java.lang.String _value) {
        this.interestPath[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceInterest)) return false;
        AudienceInterest other = (AudienceInterest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.interestId==null && other.getInterestId()==null) || 
             (this.interestId!=null &&
              this.interestId.equals(other.getInterestId()))) &&
            ((this.interestPath==null && other.getInterestPath()==null) || 
             (this.interestPath!=null &&
              java.util.Arrays.equals(this.interestPath, other.getInterestPath())));
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
        if (getInterestId() != null) {
            _hashCode += getInterestId().hashCode();
        }
        if (getInterestPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterestPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterestPath(), i);
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
        new org.apache.axis.description.TypeDesc(AudienceInterest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "AudienceInterest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "interestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "interestPath"));
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
