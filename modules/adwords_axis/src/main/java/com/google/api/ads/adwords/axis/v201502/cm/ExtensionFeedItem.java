/**
 * ExtensionFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * Contains base extension feed item data for an extension in an extension
 * feed managed by AdWords.
 */
public class ExtensionFeedItem  implements java.io.Serializable {
    /* Id of this feed item's feed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long feedId;

    /* Id of the feed item. */
    private java.lang.Long feedItemId;

    /* Status of the feed item.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201502.cm.FeedItemStatus status;

    /* The type of the feed containing this extension feed item data.
     * The field will be set by a
     *                 subclass with a defined feed type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201502.cm.FeedType feedType;

    /* Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private java.lang.String startTime;

    /* End time in which this feed item is no longer effective and
     * will stop serving. The time zone
     *                 of endTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no end time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * end time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private java.lang.String endTime;

    /* Device preference for the feed item. */
    private com.google.api.ads.adwords.axis.v201502.cm.FeedItemDevicePreference devicePreference;

    /* FeedItemScheduling specifying times for when the feed item
     * may serve.
     *                 On retrieval or creation of the feed item, if the
     * field is left null,
     *                 no feed item scheduling restrictions are placed on
     * the feed item.
     *                 On update, if the field is left unspecified, the previous
     * feedItemScheduling state will
     *                 not be changed.
     *                 On update, if the field is set with a FeedItemScheduling
     * with an empty feedItemSchedules
     *                 list, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions. */
    private com.google.api.ads.adwords.axis.v201502.cm.FeedItemScheduling scheduling;

    /* Indicates that this instance is a subtype of ExtensionFeedItem.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String extensionFeedItemType;

    public ExtensionFeedItem() {
    }

    public ExtensionFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201502.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201502.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201502.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201502.cm.FeedItemScheduling scheduling,
           java.lang.String extensionFeedItemType) {
           this.feedId = feedId;
           this.feedItemId = feedItemId;
           this.status = status;
           this.feedType = feedType;
           this.startTime = startTime;
           this.endTime = endTime;
           this.devicePreference = devicePreference;
           this.scheduling = scheduling;
           this.extensionFeedItemType = extensionFeedItemType;
    }


    /**
     * Gets the feedId value for this ExtensionFeedItem.
     * 
     * @return feedId   * Id of this feed item's feed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this ExtensionFeedItem.
     * 
     * @param feedId   * Id of this feed item's feed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the feedItemId value for this ExtensionFeedItem.
     * 
     * @return feedItemId   * Id of the feed item.
     */
    public java.lang.Long getFeedItemId() {
        return feedItemId;
    }


    /**
     * Sets the feedItemId value for this ExtensionFeedItem.
     * 
     * @param feedItemId   * Id of the feed item.
     */
    public void setFeedItemId(java.lang.Long feedItemId) {
        this.feedItemId = feedItemId;
    }


    /**
     * Gets the status value for this ExtensionFeedItem.
     * 
     * @return status   * Status of the feed item.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201502.cm.FeedItemStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExtensionFeedItem.
     * 
     * @param status   * Status of the feed item.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201502.cm.FeedItemStatus status) {
        this.status = status;
    }


    /**
     * Gets the feedType value for this ExtensionFeedItem.
     * 
     * @return feedType   * The type of the feed containing this extension feed item data.
     * The field will be set by a
     *                 subclass with a defined feed type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201502.cm.FeedType getFeedType() {
        return feedType;
    }


    /**
     * Sets the feedType value for this ExtensionFeedItem.
     * 
     * @param feedType   * The type of the feed containing this extension feed item data.
     * The field will be set by a
     *                 subclass with a defined feed type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setFeedType(com.google.api.ads.adwords.axis.v201502.cm.FeedType feedType) {
        this.feedType = feedType;
    }


    /**
     * Gets the startTime value for this ExtensionFeedItem.
     * 
     * @return startTime   * Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ExtensionFeedItem.
     * 
     * @param startTime   * Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this ExtensionFeedItem.
     * 
     * @return endTime   * End time in which this feed item is no longer effective and
     * will stop serving. The time zone
     *                 of endTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no end time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * end time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this ExtensionFeedItem.
     * 
     * @param endTime   * End time in which this feed item is no longer effective and
     * will stop serving. The time zone
     *                 of endTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no end time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * end time.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the devicePreference value for this ExtensionFeedItem.
     * 
     * @return devicePreference   * Device preference for the feed item.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.FeedItemDevicePreference getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this ExtensionFeedItem.
     * 
     * @param devicePreference   * Device preference for the feed item.
     */
    public void setDevicePreference(com.google.api.ads.adwords.axis.v201502.cm.FeedItemDevicePreference devicePreference) {
        this.devicePreference = devicePreference;
    }


    /**
     * Gets the scheduling value for this ExtensionFeedItem.
     * 
     * @return scheduling   * FeedItemScheduling specifying times for when the feed item
     * may serve.
     *                 On retrieval or creation of the feed item, if the
     * field is left null,
     *                 no feed item scheduling restrictions are placed on
     * the feed item.
     *                 On update, if the field is left unspecified, the previous
     * feedItemScheduling state will
     *                 not be changed.
     *                 On update, if the field is set with a FeedItemScheduling
     * with an empty feedItemSchedules
     *                 list, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions.
     */
    public com.google.api.ads.adwords.axis.v201502.cm.FeedItemScheduling getScheduling() {
        return scheduling;
    }


    /**
     * Sets the scheduling value for this ExtensionFeedItem.
     * 
     * @param scheduling   * FeedItemScheduling specifying times for when the feed item
     * may serve.
     *                 On retrieval or creation of the feed item, if the
     * field is left null,
     *                 no feed item scheduling restrictions are placed on
     * the feed item.
     *                 On update, if the field is left unspecified, the previous
     * feedItemScheduling state will
     *                 not be changed.
     *                 On update, if the field is set with a FeedItemScheduling
     * with an empty feedItemSchedules
     *                 list, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions.
     */
    public void setScheduling(com.google.api.ads.adwords.axis.v201502.cm.FeedItemScheduling scheduling) {
        this.scheduling = scheduling;
    }


    /**
     * Gets the extensionFeedItemType value for this ExtensionFeedItem.
     * 
     * @return extensionFeedItemType   * Indicates that this instance is a subtype of ExtensionFeedItem.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getExtensionFeedItemType() {
        return extensionFeedItemType;
    }


    /**
     * Sets the extensionFeedItemType value for this ExtensionFeedItem.
     * 
     * @param extensionFeedItemType   * Indicates that this instance is a subtype of ExtensionFeedItem.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setExtensionFeedItemType(java.lang.String extensionFeedItemType) {
        this.extensionFeedItemType = extensionFeedItemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtensionFeedItem)) return false;
        ExtensionFeedItem other = (ExtensionFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedId==null && other.getFeedId()==null) || 
             (this.feedId!=null &&
              this.feedId.equals(other.getFeedId()))) &&
            ((this.feedItemId==null && other.getFeedItemId()==null) || 
             (this.feedItemId!=null &&
              this.feedItemId.equals(other.getFeedItemId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.feedType==null && other.getFeedType()==null) || 
             (this.feedType!=null &&
              this.feedType.equals(other.getFeedType()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.scheduling==null && other.getScheduling()==null) || 
             (this.scheduling!=null &&
              this.scheduling.equals(other.getScheduling()))) &&
            ((this.extensionFeedItemType==null && other.getExtensionFeedItemType()==null) || 
             (this.extensionFeedItemType!=null &&
              this.extensionFeedItemType.equals(other.getExtensionFeedItemType())));
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
        if (getFeedId() != null) {
            _hashCode += getFeedId().hashCode();
        }
        if (getFeedItemId() != null) {
            _hashCode += getFeedItemId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFeedType() != null) {
            _hashCode += getFeedType().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getScheduling() != null) {
            _hashCode += getScheduling().hashCode();
        }
        if (getExtensionFeedItemType() != null) {
            _hashCode += getExtensionFeedItemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtensionFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "ExtensionFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "feedItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "FeedItem.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "feedType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "Feed.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "devicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "FeedItemDevicePreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "scheduling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "FeedItemScheduling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionFeedItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "ExtensionFeedItem.Type"));
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
