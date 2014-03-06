/**
 * FeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents an item in a feed.
 */
public class FeedItem  implements java.io.Serializable {
    /* ID of this feed item's feed
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedId;

    /* ID of this feed item.
     *                 This may be unspecified if the user-defined key attributes
     * are specified.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedItemId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private java.lang.Long feedItemId;

    /* Status of feed item
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.FeedItemStatus status;

    /* Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartTime".</span>
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
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndTime".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span> */
    private java.lang.String endTime;

    /* The feed item's attribute values. For any unset/unspecified
     * feed attributes, the value is
     *                 considered unset/null on ADD and unchanged on SET.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributeValues".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.FeedItemAttributeValue[] attributeValues;

    /* List of details about a feed item's validation state for active
     * feed mappings.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ValidationDetails".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.FeedItemValidationDetail[] validationDetails;

    /* Device preference for the feed item.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DevicePreference".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.FeedItemDevicePreference devicePreference;

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
     *                 has no scheduling restrictions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Scheduling".</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.FeedItemScheduling scheduling;

    public FeedItem() {
    }

    public FeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201306.cm.FeedItemStatus status,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201306.cm.FeedItemAttributeValue[] attributeValues,
           com.google.api.ads.adwords.axis.v201306.cm.FeedItemValidationDetail[] validationDetails,
           com.google.api.ads.adwords.axis.v201306.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201306.cm.FeedItemScheduling scheduling) {
           this.feedId = feedId;
           this.feedItemId = feedItemId;
           this.status = status;
           this.startTime = startTime;
           this.endTime = endTime;
           this.attributeValues = attributeValues;
           this.validationDetails = validationDetails;
           this.devicePreference = devicePreference;
           this.scheduling = scheduling;
    }


    /**
     * Gets the feedId value for this FeedItem.
     * 
     * @return feedId   * ID of this feed item's feed
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this FeedItem.
     * 
     * @param feedId   * ID of this feed item's feed
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the feedItemId value for this FeedItem.
     * 
     * @return feedItemId   * ID of this feed item.
     *                 This may be unspecified if the user-defined key attributes
     * are specified.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedItemId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public java.lang.Long getFeedItemId() {
        return feedItemId;
    }


    /**
     * Sets the feedItemId value for this FeedItem.
     * 
     * @param feedItemId   * ID of this feed item.
     *                 This may be unspecified if the user-defined key attributes
     * are specified.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedItemId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setFeedItemId(java.lang.Long feedItemId) {
        this.feedItemId = feedItemId;
    }


    /**
     * Gets the status value for this FeedItem.
     * 
     * @return status   * Status of feed item
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FeedItem.
     * 
     * @param status   * Status of feed item
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201306.cm.FeedItemStatus status) {
        this.status = status;
    }


    /**
     * Gets the startTime value for this FeedItem.
     * 
     * @return startTime   * Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartTime".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this FeedItem.
     * 
     * @param startTime   * Start time in which this feed item is effective and can begin
     * serving. The time zone
     *                 of startTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no start time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * start time.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StartTime".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this FeedItem.
     * 
     * @return endTime   * End time in which this feed item is no longer effective and
     * will stop serving. The time zone
     *                 of endTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no end time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * end time.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndTime".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this FeedItem.
     * 
     * @param endTime   * End time in which this feed item is no longer effective and
     * will stop serving. The time zone
     *                 of endTime must either match the time zone of the
     * account or be unspecified where
     *                 the time zone defaults to the account time zone.
     *                 This field may be null to indicate no end time restriction.
     * The special value "00000101 000000" may be used to clear an existing
     * end time.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "EndTime".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: REMOVE.</span>
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the attributeValues value for this FeedItem.
     * 
     * @return attributeValues   * The feed item's attribute values. For any unset/unspecified
     * feed attributes, the value is
     *                 considered unset/null on ADD and unchanged on SET.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributeValues".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemAttributeValue[] getAttributeValues() {
        return attributeValues;
    }


    /**
     * Sets the attributeValues value for this FeedItem.
     * 
     * @param attributeValues   * The feed item's attribute values. For any unset/unspecified
     * feed attributes, the value is
     *                 considered unset/null on ADD and unchanged on SET.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AttributeValues".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setAttributeValues(com.google.api.ads.adwords.axis.v201306.cm.FeedItemAttributeValue[] attributeValues) {
        this.attributeValues = attributeValues;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemAttributeValue getAttributeValues(int i) {
        return this.attributeValues[i];
    }

    public void setAttributeValues(int i, com.google.api.ads.adwords.axis.v201306.cm.FeedItemAttributeValue _value) {
        this.attributeValues[i] = _value;
    }


    /**
     * Gets the validationDetails value for this FeedItem.
     * 
     * @return validationDetails   * List of details about a feed item's validation state for active
     * feed mappings.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ValidationDetails".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemValidationDetail[] getValidationDetails() {
        return validationDetails;
    }


    /**
     * Sets the validationDetails value for this FeedItem.
     * 
     * @param validationDetails   * List of details about a feed item's validation state for active
     * feed mappings.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ValidationDetails".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setValidationDetails(com.google.api.ads.adwords.axis.v201306.cm.FeedItemValidationDetail[] validationDetails) {
        this.validationDetails = validationDetails;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemValidationDetail getValidationDetails(int i) {
        return this.validationDetails[i];
    }

    public void setValidationDetails(int i, com.google.api.ads.adwords.axis.v201306.cm.FeedItemValidationDetail _value) {
        this.validationDetails[i] = _value;
    }


    /**
     * Gets the devicePreference value for this FeedItem.
     * 
     * @return devicePreference   * Device preference for the feed item.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DevicePreference".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemDevicePreference getDevicePreference() {
        return devicePreference;
    }


    /**
     * Sets the devicePreference value for this FeedItem.
     * 
     * @param devicePreference   * Device preference for the feed item.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DevicePreference".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDevicePreference(com.google.api.ads.adwords.axis.v201306.cm.FeedItemDevicePreference devicePreference) {
        this.devicePreference = devicePreference;
    }


    /**
     * Gets the scheduling value for this FeedItem.
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
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Scheduling".</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FeedItemScheduling getScheduling() {
        return scheduling;
    }


    /**
     * Sets the scheduling value for this FeedItem.
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
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Scheduling".</span>
     */
    public void setScheduling(com.google.api.ads.adwords.axis.v201306.cm.FeedItemScheduling scheduling) {
        this.scheduling = scheduling;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItem)) return false;
        FeedItem other = (FeedItem) obj;
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
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.attributeValues==null && other.getAttributeValues()==null) || 
             (this.attributeValues!=null &&
              java.util.Arrays.equals(this.attributeValues, other.getAttributeValues()))) &&
            ((this.validationDetails==null && other.getValidationDetails()==null) || 
             (this.validationDetails!=null &&
              java.util.Arrays.equals(this.validationDetails, other.getValidationDetails()))) &&
            ((this.devicePreference==null && other.getDevicePreference()==null) || 
             (this.devicePreference!=null &&
              this.devicePreference.equals(other.getDevicePreference()))) &&
            ((this.scheduling==null && other.getScheduling()==null) || 
             (this.scheduling!=null &&
              this.scheduling.equals(other.getScheduling())));
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
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getAttributeValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValidationDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValidationDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValidationDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDevicePreference() != null) {
            _hashCode += getDevicePreference().hashCode();
        }
        if (getScheduling() != null) {
            _hashCode += getScheduling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "feedItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FeedItem.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "attributeValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FeedItemAttributeValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "validationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FeedItemValidationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePreference");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "devicePreference"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FeedItemDevicePreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "scheduling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FeedItemScheduling"));
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
