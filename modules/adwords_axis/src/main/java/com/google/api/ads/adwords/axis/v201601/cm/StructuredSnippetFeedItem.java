/**
 * StructuredSnippetFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;


/**
 * Represents a structured snippet extension.
 */
public class StructuredSnippetFeedItem  extends com.google.api.ads.adwords.axis.v201601.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* The header of the snippet. See the
     *                     <a href="https://developers.google.com/adwords/api/docs/appendix/structured-snippet-headers">
     * structured snippets header translations</a> page for supported localized
     * headers.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String header;

    /* The values in the snippet. A SET operation replaces the values
     * in the list.
     *                     <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span>
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span> */
    private java.lang.String[] values;

    public StructuredSnippetFeedItem() {
    }

    public StructuredSnippetFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201601.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemPolicyData[] policyData,
           java.lang.String extensionFeedItemType,
           java.lang.String header,
           java.lang.String[] values) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            policyData,
            extensionFeedItemType);
        this.header = header;
        this.values = values;
    }


    /**
     * Gets the header value for this StructuredSnippetFeedItem.
     * 
     * @return header   * The header of the snippet. See the
     *                     <a href="https://developers.google.com/adwords/api/docs/appendix/structured-snippet-headers">
     * structured snippets header translations</a> page for supported localized
     * headers.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getHeader() {
        return header;
    }


    /**
     * Sets the header value for this StructuredSnippetFeedItem.
     * 
     * @param header   * The header of the snippet. See the
     *                     <a href="https://developers.google.com/adwords/api/docs/appendix/structured-snippet-headers">
     * structured snippets header translations</a> page for supported localized
     * headers.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setHeader(java.lang.String header) {
        this.header = header;
    }


    /**
     * Gets the values value for this StructuredSnippetFeedItem.
     * 
     * @return values   * The values in the snippet. A SET operation replaces the values
     * in the list.
     *                     <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span>
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public java.lang.String[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this StructuredSnippetFeedItem.
     * 
     * @param values   * The values in the snippet. A SET operation replaces the values
     * in the list.
     *                     <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span>
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public void setValues(java.lang.String[] values) {
        this.values = values;
    }

    public java.lang.String getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, java.lang.String _value) {
        this.values[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructuredSnippetFeedItem)) return false;
        StructuredSnippetFeedItem other = (StructuredSnippetFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(StructuredSnippetFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StructuredSnippetFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "values"));
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
