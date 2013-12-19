/**
 * FeedChangeData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.ch;


/**
 * Holds information about a changed feed and any feeds items within
 * the feed.
 */
public class FeedChangeData  implements java.io.Serializable {
    /* The feed ID. */
    private java.lang.Long feedId;

    /* Whether or not the fields of this feed have changed. */
    private com.google.api.ads.adwords.axis.v201309.ch.ChangeStatus feedChangeStatus;

    /* A list of feed item IDs that have been added or modified within
     * the the
     *                 feed.  If a feed item is deleted after a modification,
     * it will not be
     *                 included in this list. */
    private long[] changedFeedItems;

    /* A list feed item IDs that have been removed from the feed. */
    private long[] deletedFeedItems;

    public FeedChangeData() {
    }

    public FeedChangeData(
           java.lang.Long feedId,
           com.google.api.ads.adwords.axis.v201309.ch.ChangeStatus feedChangeStatus,
           long[] changedFeedItems,
           long[] deletedFeedItems) {
           this.feedId = feedId;
           this.feedChangeStatus = feedChangeStatus;
           this.changedFeedItems = changedFeedItems;
           this.deletedFeedItems = deletedFeedItems;
    }


    /**
     * Gets the feedId value for this FeedChangeData.
     * 
     * @return feedId   * The feed ID.
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this FeedChangeData.
     * 
     * @param feedId   * The feed ID.
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the feedChangeStatus value for this FeedChangeData.
     * 
     * @return feedChangeStatus   * Whether or not the fields of this feed have changed.
     */
    public com.google.api.ads.adwords.axis.v201309.ch.ChangeStatus getFeedChangeStatus() {
        return feedChangeStatus;
    }


    /**
     * Sets the feedChangeStatus value for this FeedChangeData.
     * 
     * @param feedChangeStatus   * Whether or not the fields of this feed have changed.
     */
    public void setFeedChangeStatus(com.google.api.ads.adwords.axis.v201309.ch.ChangeStatus feedChangeStatus) {
        this.feedChangeStatus = feedChangeStatus;
    }


    /**
     * Gets the changedFeedItems value for this FeedChangeData.
     * 
     * @return changedFeedItems   * A list of feed item IDs that have been added or modified within
     * the the
     *                 feed.  If a feed item is deleted after a modification,
     * it will not be
     *                 included in this list.
     */
    public long[] getChangedFeedItems() {
        return changedFeedItems;
    }


    /**
     * Sets the changedFeedItems value for this FeedChangeData.
     * 
     * @param changedFeedItems   * A list of feed item IDs that have been added or modified within
     * the the
     *                 feed.  If a feed item is deleted after a modification,
     * it will not be
     *                 included in this list.
     */
    public void setChangedFeedItems(long[] changedFeedItems) {
        this.changedFeedItems = changedFeedItems;
    }

    public long getChangedFeedItems(int i) {
        return this.changedFeedItems[i];
    }

    public void setChangedFeedItems(int i, long _value) {
        this.changedFeedItems[i] = _value;
    }


    /**
     * Gets the deletedFeedItems value for this FeedChangeData.
     * 
     * @return deletedFeedItems   * A list feed item IDs that have been removed from the feed.
     */
    public long[] getDeletedFeedItems() {
        return deletedFeedItems;
    }


    /**
     * Sets the deletedFeedItems value for this FeedChangeData.
     * 
     * @param deletedFeedItems   * A list feed item IDs that have been removed from the feed.
     */
    public void setDeletedFeedItems(long[] deletedFeedItems) {
        this.deletedFeedItems = deletedFeedItems;
    }

    public long getDeletedFeedItems(int i) {
        return this.deletedFeedItems[i];
    }

    public void setDeletedFeedItems(int i, long _value) {
        this.deletedFeedItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedChangeData)) return false;
        FeedChangeData other = (FeedChangeData) obj;
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
            ((this.feedChangeStatus==null && other.getFeedChangeStatus()==null) || 
             (this.feedChangeStatus!=null &&
              this.feedChangeStatus.equals(other.getFeedChangeStatus()))) &&
            ((this.changedFeedItems==null && other.getChangedFeedItems()==null) || 
             (this.changedFeedItems!=null &&
              java.util.Arrays.equals(this.changedFeedItems, other.getChangedFeedItems()))) &&
            ((this.deletedFeedItems==null && other.getDeletedFeedItems()==null) || 
             (this.deletedFeedItems!=null &&
              java.util.Arrays.equals(this.deletedFeedItems, other.getDeletedFeedItems())));
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
        if (getFeedChangeStatus() != null) {
            _hashCode += getFeedChangeStatus().hashCode();
        }
        if (getChangedFeedItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedFeedItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedFeedItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeletedFeedItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeletedFeedItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeletedFeedItems(), i);
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
        new org.apache.axis.description.TypeDesc(FeedChangeData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201309", "FeedChangeData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201309", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedChangeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201309", "feedChangeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201309", "ChangeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedFeedItems");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201309", "changedFeedItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletedFeedItems");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201309", "deletedFeedItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
