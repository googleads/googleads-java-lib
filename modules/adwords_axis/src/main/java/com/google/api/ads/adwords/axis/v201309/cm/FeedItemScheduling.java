/**
 * FeedItemScheduling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Represents a collection of FeedItem schedules specifying all time
 * intervals for which
 *             the feed item may serve. Any time range not covered by
 * the specified FeedItemSchedules will
 *             prevent the feed item from serving during those times.
 */
public class FeedItemScheduling  implements java.io.Serializable {
    /* List of non-overlapping feed item schedules indicating when
     * the feed item may serve.
     *                 There can be a maximum of 6 FeedItemSchedules per
     * day.
     *                 If empty, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions. */
    private com.google.api.ads.adwords.axis.v201309.cm.FeedItemSchedule[] feedItemSchedules;

    public FeedItemScheduling() {
    }

    public FeedItemScheduling(
           com.google.api.ads.adwords.axis.v201309.cm.FeedItemSchedule[] feedItemSchedules) {
           this.feedItemSchedules = feedItemSchedules;
    }


    /**
     * Gets the feedItemSchedules value for this FeedItemScheduling.
     * 
     * @return feedItemSchedules   * List of non-overlapping feed item schedules indicating when
     * the feed item may serve.
     *                 There can be a maximum of 6 FeedItemSchedules per
     * day.
     *                 If empty, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.FeedItemSchedule[] getFeedItemSchedules() {
        return feedItemSchedules;
    }


    /**
     * Sets the feedItemSchedules value for this FeedItemScheduling.
     * 
     * @param feedItemSchedules   * List of non-overlapping feed item schedules indicating when
     * the feed item may serve.
     *                 There can be a maximum of 6 FeedItemSchedules per
     * day.
     *                 If empty, the scheduling will be cleared of all FeedItemSchedules
     * indicating the feed item
     *                 has no scheduling restrictions.
     */
    public void setFeedItemSchedules(com.google.api.ads.adwords.axis.v201309.cm.FeedItemSchedule[] feedItemSchedules) {
        this.feedItemSchedules = feedItemSchedules;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.FeedItemSchedule getFeedItemSchedules(int i) {
        return this.feedItemSchedules[i];
    }

    public void setFeedItemSchedules(int i, com.google.api.ads.adwords.axis.v201309.cm.FeedItemSchedule _value) {
        this.feedItemSchedules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemScheduling)) return false;
        FeedItemScheduling other = (FeedItemScheduling) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedItemSchedules==null && other.getFeedItemSchedules()==null) || 
             (this.feedItemSchedules!=null &&
              java.util.Arrays.equals(this.feedItemSchedules, other.getFeedItemSchedules())));
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
        if (getFeedItemSchedules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedItemSchedules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedItemSchedules(), i);
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
        new org.apache.axis.description.TypeDesc(FeedItemScheduling.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedItemScheduling"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedItemSchedules");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "feedItemSchedules"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "FeedItemSchedule"));
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
