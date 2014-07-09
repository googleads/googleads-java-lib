/**
 * ExcludedKeywordSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.o;


/**
 * A {@link SearchParameter} for {@code KEYWORD} {@link IdeaType}s
 * that
 *             specifies {@link Keyword}s that should be excluded from
 * the results.<p>
 *             
 *             The {@link KeywordMatchType} associated with these keywords
 * is used to
 *             provide various filtering strategies. For example, the
 * excluded keyword
 *             <b>"brand x player"</b> will exclude ideas from the resulting
 * ideas as
 *             described by the table below.
 *             
 *             <table border="1">
 *             <tr style="font-weight: bold;">
 *             <th>Idea</th>
 *             <th>{@code BROAD}</th>
 *             <th>{@code PHRASE}</th>
 *             <th>{@code EXACT}</th>
 *             </tr>
 *             <tr>
 *             <td>brand x player</td>
 *             <td>Exclude</td>
 *             <td>Exclude</td>
 *             <td>Exclude</td>
 *             </tr>
 *             <tr>
 *             <td>blu-ray brand x player</td>
 *             <td>Exclude</td>
 *             <td>Exclude</td>
 *             <td>Include</td>
 *             </tr>
 *             <tr>
 *             <td>brand x dvd player</td>
 *             <td>Exclude</td>
 *             <td>Include</td>
 *             <td>Include</td>
 *             </tr>
 *             <tr>
 *             <td>brand x dvd</td>
 *             <td>Include</td>
 *             <td>Include</td>
 *             <td>Include</td>
 *             </tr>
 *             </table>
 *             <p>This element is supported by following {@link IdeaType}s:
 * KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s:
 * IDEAS, STATS.
 */
public class ExcludedKeywordSearchParameter  extends com.google.api.ads.adwords.axis.v201406.o.SearchParameter  implements java.io.Serializable {
    /* A list of {@link Keyword}s to be excluded from the search results.
     * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.Keyword[] keywords;

    public ExcludedKeywordSearchParameter() {
    }

    public ExcludedKeywordSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201406.cm.Keyword[] keywords) {
        super(
            searchParameterType);
        this.keywords = keywords;
    }


    /**
     * Gets the keywords value for this ExcludedKeywordSearchParameter.
     * 
     * @return keywords   * A list of {@link Keyword}s to be excluded from the search results.
     * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.Keyword[] getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this ExcludedKeywordSearchParameter.
     * 
     * @param keywords   * A list of {@link Keyword}s to be excluded from the search results.
     * <span class="constraint ContentsDistinct">This field must contain
     * distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setKeywords(com.google.api.ads.adwords.axis.v201406.cm.Keyword[] keywords) {
        this.keywords = keywords;
    }

    public com.google.api.ads.adwords.axis.v201406.cm.Keyword getKeywords(int i) {
        return this.keywords[i];
    }

    public void setKeywords(int i, com.google.api.ads.adwords.axis.v201406.cm.Keyword _value) {
        this.keywords[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcludedKeywordSearchParameter)) return false;
        ExcludedKeywordSearchParameter other = (ExcludedKeywordSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              java.util.Arrays.equals(this.keywords, other.getKeywords())));
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
        if (getKeywords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeywords(), i);
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
        new org.apache.axis.description.TypeDesc(ExcludedKeywordSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "ExcludedKeywordSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201406", "keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "Keyword"));
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
