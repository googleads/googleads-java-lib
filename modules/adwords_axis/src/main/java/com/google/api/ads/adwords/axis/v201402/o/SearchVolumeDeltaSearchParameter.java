/**
 * SearchVolumeDeltaSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.o;


/**
 * A {@link SearchParameter} that specifies the level of search volume
 * delta expected in results,
 *             and it is directly related to
 *             {@link com.google.ads.api.services.targetingideas.external.AttributeType#SEARCH_VOLUME_DELTA}.
 * Absence of a {@link SearchVolumeDeltaSearchParameter} in a
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdeaSelector}
 * is
 *             equivalent to having no constraint on search volume delta
 * specified.
 *             <p>This element is supported by following {@link IdeaType}s:
 * KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s:
 * STATS, IDEAS.
 */
public class SearchVolumeDeltaSearchParameter  extends com.google.api.ads.adwords.axis.v201402.o.SearchParameter  implements java.io.Serializable {
    /* Used to specify the range of relative search volume delta. */
    private com.google.api.ads.adwords.axis.v201402.o.DoubleComparisonOperation relative;

    /* Used to specify the range of absolute search volume delta. */
    private com.google.api.ads.adwords.axis.v201402.o.LongComparisonOperation absolute;

    public SearchVolumeDeltaSearchParameter() {
    }

    public SearchVolumeDeltaSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201402.o.DoubleComparisonOperation relative,
           com.google.api.ads.adwords.axis.v201402.o.LongComparisonOperation absolute) {
        super(
            searchParameterType);
        this.relative = relative;
        this.absolute = absolute;
    }


    /**
     * Gets the relative value for this SearchVolumeDeltaSearchParameter.
     * 
     * @return relative   * Used to specify the range of relative search volume delta.
     */
    public com.google.api.ads.adwords.axis.v201402.o.DoubleComparisonOperation getRelative() {
        return relative;
    }


    /**
     * Sets the relative value for this SearchVolumeDeltaSearchParameter.
     * 
     * @param relative   * Used to specify the range of relative search volume delta.
     */
    public void setRelative(com.google.api.ads.adwords.axis.v201402.o.DoubleComparisonOperation relative) {
        this.relative = relative;
    }


    /**
     * Gets the absolute value for this SearchVolumeDeltaSearchParameter.
     * 
     * @return absolute   * Used to specify the range of absolute search volume delta.
     */
    public com.google.api.ads.adwords.axis.v201402.o.LongComparisonOperation getAbsolute() {
        return absolute;
    }


    /**
     * Sets the absolute value for this SearchVolumeDeltaSearchParameter.
     * 
     * @param absolute   * Used to specify the range of absolute search volume delta.
     */
    public void setAbsolute(com.google.api.ads.adwords.axis.v201402.o.LongComparisonOperation absolute) {
        this.absolute = absolute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchVolumeDeltaSearchParameter)) return false;
        SearchVolumeDeltaSearchParameter other = (SearchVolumeDeltaSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.relative==null && other.getRelative()==null) || 
             (this.relative!=null &&
              this.relative.equals(other.getRelative()))) &&
            ((this.absolute==null && other.getAbsolute()==null) || 
             (this.absolute!=null &&
              this.absolute.equals(other.getAbsolute())));
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
        if (getRelative() != null) {
            _hashCode += getRelative().hashCode();
        }
        if (getAbsolute() != null) {
            _hashCode += getAbsolute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchVolumeDeltaSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "SearchVolumeDeltaSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relative");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "relative"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "DoubleComparisonOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("absolute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "absolute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "LongComparisonOperation"));
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
