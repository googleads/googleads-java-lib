/**
 * VideoSearchPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * A page of videos resulting from a YouTube search.
 */
public class VideoSearchPage  extends com.google.api.ads.adwords.axis.v201406.cm.Page  implements java.io.Serializable {
    /* YouTube channel names which match the query, if this was a
     * channel search. */
    private java.lang.String[] recommendedChannels;

    /* Result entries in this page. */
    private com.google.api.ads.adwords.axis.v201406.video.YouTubeVideo[] entries;

    public VideoSearchPage() {
    }

    public VideoSearchPage(
           java.lang.Integer totalNumEntries,
           java.lang.String pageType,
           java.lang.String[] recommendedChannels,
           com.google.api.ads.adwords.axis.v201406.video.YouTubeVideo[] entries) {
        super(
            totalNumEntries,
            pageType);
        this.recommendedChannels = recommendedChannels;
        this.entries = entries;
    }


    /**
     * Gets the recommendedChannels value for this VideoSearchPage.
     * 
     * @return recommendedChannels   * YouTube channel names which match the query, if this was a
     * channel search.
     */
    public java.lang.String[] getRecommendedChannels() {
        return recommendedChannels;
    }


    /**
     * Sets the recommendedChannels value for this VideoSearchPage.
     * 
     * @param recommendedChannels   * YouTube channel names which match the query, if this was a
     * channel search.
     */
    public void setRecommendedChannels(java.lang.String[] recommendedChannels) {
        this.recommendedChannels = recommendedChannels;
    }

    public java.lang.String getRecommendedChannels(int i) {
        return this.recommendedChannels[i];
    }

    public void setRecommendedChannels(int i, java.lang.String _value) {
        this.recommendedChannels[i] = _value;
    }


    /**
     * Gets the entries value for this VideoSearchPage.
     * 
     * @return entries   * Result entries in this page.
     */
    public com.google.api.ads.adwords.axis.v201406.video.YouTubeVideo[] getEntries() {
        return entries;
    }


    /**
     * Sets the entries value for this VideoSearchPage.
     * 
     * @param entries   * Result entries in this page.
     */
    public void setEntries(com.google.api.ads.adwords.axis.v201406.video.YouTubeVideo[] entries) {
        this.entries = entries;
    }

    public com.google.api.ads.adwords.axis.v201406.video.YouTubeVideo getEntries(int i) {
        return this.entries[i];
    }

    public void setEntries(int i, com.google.api.ads.adwords.axis.v201406.video.YouTubeVideo _value) {
        this.entries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoSearchPage)) return false;
        VideoSearchPage other = (VideoSearchPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recommendedChannels==null && other.getRecommendedChannels()==null) || 
             (this.recommendedChannels!=null &&
              java.util.Arrays.equals(this.recommendedChannels, other.getRecommendedChannels()))) &&
            ((this.entries==null && other.getEntries()==null) || 
             (this.entries!=null &&
              java.util.Arrays.equals(this.entries, other.getEntries())));
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
        if (getRecommendedChannels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecommendedChannels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecommendedChannels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntries(), i);
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
        new org.apache.axis.description.TypeDesc(VideoSearchPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoSearchPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedChannels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "recommendedChannels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "YouTubeVideo"));
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
