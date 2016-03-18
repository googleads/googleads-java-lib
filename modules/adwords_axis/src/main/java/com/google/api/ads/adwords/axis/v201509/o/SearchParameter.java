/**
 * SearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.o;


/**
 * A set of {@link SearchParameter}s is supplied to the
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdeaSelector}
 * to specify how the user wants to filter the set of all possible
 *             {@link com.google.ads.api.services.targetingideas.TargetingIdea}s.
 * 
 *             <p>There is a {@link SearchParameter} for each type of
 * input.
 *             {@link SearchParameter}s can conceptually be broken down
 * into two types.</p>
 *             
 *             <ul>
 *             <li>Input {@link SearchParameter}s provide the seed information
 * from which
 *             ideas or stats are to be generated (e.g., {@link RelatedToQuerySearchParameter},
 * {@link RelatedToUrlSearchParameter}, etc.). This type of {@link SearchParameters}
 * is required in requests.</li>
 *             <li>Filter {@link SearchParameter}s (e.g., {@link CompetitionSearchParameter},
 * etc.)
 *             are used to trim down the results based on
 *             {@link com.google.ads.api.services.targetingideas.attributes.Attribute}-related
 * information.</li>
 *             </ul>
 *             
 *             <p>A request should only contain one instance of each
 * {@link SearchParameter}.
 *             Requests containing multiple instances of the same search
 * parameter will be
 *             rejected.</p>
 *             <p>One or more of the following {@link SearchParameter}s
 * are required:<br/>
 * <ul><li>{@link CategoryProductsAndServicesSearchParameter}</li>
 * <li>{@link LocationSearchParameter}</li>
 * <li>{@link RelatedToQuerySearchParameter}</li>
 * <li>{@link RelatedToUrlSearchParameter}</li>
 * <li>{@link SeedAdGroupIdSearchParameter}</li>
 * </ul><p>
 * <p><b>{@link IdeaType} KEYWORD supports following {@link SearchParameter}s:</b><br/>
 * <ul>
 * <li>{@link CategoryProductsAndServicesSearchParameter}</li>
 * <li>{@link CompetitionSearchParameter}</li>
 * <li>{@link IdeaTextFilterSearchParameter}</li>
 * <li>{@link IncludeAdultContentSearchParameter}</li>
 * <li>{@link LanguageSearchParameter}</li>
 * <li>{@link LocationSearchParameter}</li>
 * <li>{@link NetworkSearchParameter}</li>
 * <li>{@link RelatedToQuerySearchParameter}</li>
 * <li>{@link RelatedToUrlSearchParameter}</li>
 * <li>{@link SearchVolumeSearchParameter}</li>
 * <li>{@link SeedAdGroupIdSearchParameter}</li>
 * </ul><p>
 */
public abstract class SearchParameter  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of SearchParameter.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String searchParameterType;

    public SearchParameter() {
    }

    public SearchParameter(
           java.lang.String searchParameterType) {
           this.searchParameterType = searchParameterType;
    }


    /**
     * Gets the searchParameterType value for this SearchParameter.
     * 
     * @return searchParameterType   * Indicates that this instance is a subtype of SearchParameter.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getSearchParameterType() {
        return searchParameterType;
    }


    /**
     * Sets the searchParameterType value for this SearchParameter.
     * 
     * @param searchParameterType   * Indicates that this instance is a subtype of SearchParameter.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setSearchParameterType(java.lang.String searchParameterType) {
        this.searchParameterType = searchParameterType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchParameter)) return false;
        SearchParameter other = (SearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchParameterType==null && other.getSearchParameterType()==null) || 
             (this.searchParameterType!=null &&
              this.searchParameterType.equals(other.getSearchParameterType())));
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
        if (getSearchParameterType() != null) {
            _hashCode += getSearchParameterType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "SearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchParameterType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "SearchParameter.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
