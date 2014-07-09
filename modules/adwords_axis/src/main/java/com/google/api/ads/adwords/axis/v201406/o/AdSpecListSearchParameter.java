/**
 * AdSpecListSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.o;


/**
 * A {@link SearchParameter} for {@code PLACEMENT} {@link IdeaType}s
 * used to
 *             filter the results by the list of {@link AdSpec}s. See
 * {@link AdSpec}
 *             documentation for details on available options.
 *             <p>This element is supported by following {@link IdeaType}s:
 * PLACEMENT.
 *             <p>This element is supported by following {@link RequestType}s:
 * IDEAS, STATS.
 */
public class AdSpecListSearchParameter  extends com.google.api.ads.adwords.axis.v201406.o.SearchParameter  implements java.io.Serializable {
    /* A list of {@link AdSpec}s that indicates the types of placements
     * desired
     *                     in the results. See {@link AdSpec} documentation
     * for more details on
     *                     available options.
     *                     Only one of each type of AdSpec will be accepted
     * (i.e., if two
     *                     InStreamAdSpecs are included in a request, the
     * service will
     *                     return an error).
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.o.AdSpec[] adSpecs;

    public AdSpecListSearchParameter() {
    }

    public AdSpecListSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201406.o.AdSpec[] adSpecs) {
        super(
            searchParameterType);
        this.adSpecs = adSpecs;
    }


    /**
     * Gets the adSpecs value for this AdSpecListSearchParameter.
     * 
     * @return adSpecs   * A list of {@link AdSpec}s that indicates the types of placements
     * desired
     *                     in the results. See {@link AdSpec} documentation
     * for more details on
     *                     available options.
     *                     Only one of each type of AdSpec will be accepted
     * (i.e., if two
     *                     InStreamAdSpecs are included in a request, the
     * service will
     *                     return an error).
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.o.AdSpec[] getAdSpecs() {
        return adSpecs;
    }


    /**
     * Sets the adSpecs value for this AdSpecListSearchParameter.
     * 
     * @param adSpecs   * A list of {@link AdSpec}s that indicates the types of placements
     * desired
     *                     in the results. See {@link AdSpec} documentation
     * for more details on
     *                     available options.
     *                     Only one of each type of AdSpec will be accepted
     * (i.e., if two
     *                     InStreamAdSpecs are included in a request, the
     * service will
     *                     return an error).
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setAdSpecs(com.google.api.ads.adwords.axis.v201406.o.AdSpec[] adSpecs) {
        this.adSpecs = adSpecs;
    }

    public com.google.api.ads.adwords.axis.v201406.o.AdSpec getAdSpecs(int i) {
        return this.adSpecs[i];
    }

    public void setAdSpecs(int i, com.google.api.ads.adwords.axis.v201406.o.AdSpec _value) {
        this.adSpecs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdSpecListSearchParameter)) return false;
        AdSpecListSearchParameter other = (AdSpecListSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.adSpecs==null && other.getAdSpecs()==null) || 
             (this.adSpecs!=null &&
              java.util.Arrays.equals(this.adSpecs, other.getAdSpecs())));
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
        if (getAdSpecs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdSpecs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdSpecs(), i);
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
        new org.apache.axis.description.TypeDesc(AdSpecListSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "AdSpecListSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSpecs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "adSpecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "AdSpec"));
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
