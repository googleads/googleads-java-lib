/**
 * VideoSearchSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * A filter for looking up and searching for YouTube videos and channels.
 */
public class VideoSearchSelector  implements java.io.Serializable {
    /* The search type determines what is being searched for, i.e.
     * videos or channels. */
    private com.google.api.ads.adwords.axis.v201402.video.VideoSearchSelectorSearchType searchType;

    /* The list of video ids to look up.
     *                 
     *                 When video ids are present, other fields
     *                 (keywords, channels, etc.) are ignored and only the
     * given ids are looked up.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private java.lang.String[] videoIds;

    /* The keywords to search for.
     *                 
     *                 These will be used for searching for videos or channels
     * depending on the search type. */
    private java.lang.String query;

    /* Only the videos in these channels will be searched.
     *                 
     *                 Set this field only when search type is VIDEO.
     *                 - Leave unset to do a keyword search across all YouTube
     * videos.
     *                 - Set this and leave keywords unset to retrieve all
     * videos in specific channels.
     *                 To do a channel search, set search type to CHANNEL
     * and pass in keywords.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private java.lang.String[] channelUserNames;

    /* Can include further channels via their channel ids.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private java.lang.String[] channelUserIds;

    /* The starting index and number of results to return. */
    private com.google.api.ads.adwords.axis.v201402.cm.Paging paging;

    /* The ordering in which results should be returned. */
    private com.google.api.ads.adwords.axis.v201402.video.Sorting sorting;

    public VideoSearchSelector() {
    }

    public VideoSearchSelector(
           com.google.api.ads.adwords.axis.v201402.video.VideoSearchSelectorSearchType searchType,
           java.lang.String[] videoIds,
           java.lang.String query,
           java.lang.String[] channelUserNames,
           java.lang.String[] channelUserIds,
           com.google.api.ads.adwords.axis.v201402.cm.Paging paging,
           com.google.api.ads.adwords.axis.v201402.video.Sorting sorting) {
           this.searchType = searchType;
           this.videoIds = videoIds;
           this.query = query;
           this.channelUserNames = channelUserNames;
           this.channelUserIds = channelUserIds;
           this.paging = paging;
           this.sorting = sorting;
    }


    /**
     * Gets the searchType value for this VideoSearchSelector.
     * 
     * @return searchType   * The search type determines what is being searched for, i.e.
     * videos or channels.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoSearchSelectorSearchType getSearchType() {
        return searchType;
    }


    /**
     * Sets the searchType value for this VideoSearchSelector.
     * 
     * @param searchType   * The search type determines what is being searched for, i.e.
     * videos or channels.
     */
    public void setSearchType(com.google.api.ads.adwords.axis.v201402.video.VideoSearchSelectorSearchType searchType) {
        this.searchType = searchType;
    }


    /**
     * Gets the videoIds value for this VideoSearchSelector.
     * 
     * @return videoIds   * The list of video ids to look up.
     *                 
     *                 When video ids are present, other fields
     *                 (keywords, channels, etc.) are ignored and only the
     * given ids are looked up.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public java.lang.String[] getVideoIds() {
        return videoIds;
    }


    /**
     * Sets the videoIds value for this VideoSearchSelector.
     * 
     * @param videoIds   * The list of video ids to look up.
     *                 
     *                 When video ids are present, other fields
     *                 (keywords, channels, etc.) are ignored and only the
     * given ids are looked up.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setVideoIds(java.lang.String[] videoIds) {
        this.videoIds = videoIds;
    }

    public java.lang.String getVideoIds(int i) {
        return this.videoIds[i];
    }

    public void setVideoIds(int i, java.lang.String _value) {
        this.videoIds[i] = _value;
    }


    /**
     * Gets the query value for this VideoSearchSelector.
     * 
     * @return query   * The keywords to search for.
     *                 
     *                 These will be used for searching for videos or channels
     * depending on the search type.
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this VideoSearchSelector.
     * 
     * @param query   * The keywords to search for.
     *                 
     *                 These will be used for searching for videos or channels
     * depending on the search type.
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the channelUserNames value for this VideoSearchSelector.
     * 
     * @return channelUserNames   * Only the videos in these channels will be searched.
     *                 
     *                 Set this field only when search type is VIDEO.
     *                 - Leave unset to do a keyword search across all YouTube
     * videos.
     *                 - Set this and leave keywords unset to retrieve all
     * videos in specific channels.
     *                 To do a channel search, set search type to CHANNEL
     * and pass in keywords.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public java.lang.String[] getChannelUserNames() {
        return channelUserNames;
    }


    /**
     * Sets the channelUserNames value for this VideoSearchSelector.
     * 
     * @param channelUserNames   * Only the videos in these channels will be searched.
     *                 
     *                 Set this field only when search type is VIDEO.
     *                 - Leave unset to do a keyword search across all YouTube
     * videos.
     *                 - Set this and leave keywords unset to retrieve all
     * videos in specific channels.
     *                 To do a channel search, set search type to CHANNEL
     * and pass in keywords.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setChannelUserNames(java.lang.String[] channelUserNames) {
        this.channelUserNames = channelUserNames;
    }

    public java.lang.String getChannelUserNames(int i) {
        return this.channelUserNames[i];
    }

    public void setChannelUserNames(int i, java.lang.String _value) {
        this.channelUserNames[i] = _value;
    }


    /**
     * Gets the channelUserIds value for this VideoSearchSelector.
     * 
     * @return channelUserIds   * Can include further channels via their channel ids.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public java.lang.String[] getChannelUserIds() {
        return channelUserIds;
    }


    /**
     * Sets the channelUserIds value for this VideoSearchSelector.
     * 
     * @param channelUserIds   * Can include further channels via their channel ids.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setChannelUserIds(java.lang.String[] channelUserIds) {
        this.channelUserIds = channelUserIds;
    }

    public java.lang.String getChannelUserIds(int i) {
        return this.channelUserIds[i];
    }

    public void setChannelUserIds(int i, java.lang.String _value) {
        this.channelUserIds[i] = _value;
    }


    /**
     * Gets the paging value for this VideoSearchSelector.
     * 
     * @return paging   * The starting index and number of results to return.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this VideoSearchSelector.
     * 
     * @param paging   * The starting index and number of results to return.
     */
    public void setPaging(com.google.api.ads.adwords.axis.v201402.cm.Paging paging) {
        this.paging = paging;
    }


    /**
     * Gets the sorting value for this VideoSearchSelector.
     * 
     * @return sorting   * The ordering in which results should be returned.
     */
    public com.google.api.ads.adwords.axis.v201402.video.Sorting getSorting() {
        return sorting;
    }


    /**
     * Sets the sorting value for this VideoSearchSelector.
     * 
     * @param sorting   * The ordering in which results should be returned.
     */
    public void setSorting(com.google.api.ads.adwords.axis.v201402.video.Sorting sorting) {
        this.sorting = sorting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoSearchSelector)) return false;
        VideoSearchSelector other = (VideoSearchSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchType==null && other.getSearchType()==null) || 
             (this.searchType!=null &&
              this.searchType.equals(other.getSearchType()))) &&
            ((this.videoIds==null && other.getVideoIds()==null) || 
             (this.videoIds!=null &&
              java.util.Arrays.equals(this.videoIds, other.getVideoIds()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.channelUserNames==null && other.getChannelUserNames()==null) || 
             (this.channelUserNames!=null &&
              java.util.Arrays.equals(this.channelUserNames, other.getChannelUserNames()))) &&
            ((this.channelUserIds==null && other.getChannelUserIds()==null) || 
             (this.channelUserIds!=null &&
              java.util.Arrays.equals(this.channelUserIds, other.getChannelUserIds()))) &&
            ((this.paging==null && other.getPaging()==null) || 
             (this.paging!=null &&
              this.paging.equals(other.getPaging()))) &&
            ((this.sorting==null && other.getSorting()==null) || 
             (this.sorting!=null &&
              this.sorting.equals(other.getSorting())));
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
        if (getSearchType() != null) {
            _hashCode += getSearchType().hashCode();
        }
        if (getVideoIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideoIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getChannelUserNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelUserNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelUserNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannelUserIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannelUserIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannelUserIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaging() != null) {
            _hashCode += getPaging().hashCode();
        }
        if (getSorting() != null) {
            _hashCode += getSorting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoSearchSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoSearchSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "searchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoSearchSelector.SearchType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "videoIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelUserNames");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "channelUserNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelUserIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "channelUserIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Paging"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sorting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "sorting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "Sorting"));
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
