/**
 * SearchVolumeSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.o;


/**
 * A {@link SearchParameter} that specifies the level of search volume
 * expected in results,
 *             and it has a direct relationship to
 *             {@link com.google.ads.api.services.targetingideas.external.AttributeType#SEARCH_VOLUME}.
 * Absence of a {@link SearchVolumeSearchParameter} in a
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdeaSelector}
 * is
 *             equivalent to having no constraint on search volume specified.
 * <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 * <p>This element is supported by following {@link RequestType}s: IDEAS,
 * STATS.
 */
public class SearchVolumeSearchParameter  extends com.google.api.ads.adwords.axis.v201406.o.SearchParameter  implements java.io.Serializable {
    /* Used to specify the range of search volume.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.o.LongComparisonOperation operation;

    public SearchVolumeSearchParameter() {
    }

    public SearchVolumeSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201406.o.LongComparisonOperation operation) {
        super(
            searchParameterType);
        this.operation = operation;
    }


    /**
     * Gets the operation value for this SearchVolumeSearchParameter.
     * 
     * @return operation   * Used to specify the range of search volume.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.o.LongComparisonOperation getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this SearchVolumeSearchParameter.
     * 
     * @param operation   * Used to specify the range of search volume.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setOperation(com.google.api.ads.adwords.axis.v201406.o.LongComparisonOperation operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchVolumeSearchParameter)) return false;
        SearchVolumeSearchParameter other = (SearchVolumeSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchVolumeSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "SearchVolumeSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "LongComparisonOperation"));
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
