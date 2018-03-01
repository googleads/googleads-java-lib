// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * AdCustomizerFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A Feed which contains data used to populate ad customizers.
 *             
 *             <p>An AdCustomizerFeed is a view of a regular Feed, but
 * with some simplifications intended to
 *             support the most common use cases.
 */
public class AdCustomizerFeed  implements java.io.Serializable {
    /* ID of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span> */
    private java.lang.Long feedId;

    /* Name of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 128, inclusive, (trimmed).</span> */
    private java.lang.String feedName;

    /* Status of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.FeedStatus feedStatus;

    /* The AdCustomizerFeed's schema. In SET operations, these attributes
     * will be considered new
     *                 attributes and will be appended to the existing list
     * of attributes unless this list is an exact
     *                 copy of the existing list (as would be obtained via
     * {@link AdCustomizerFeedService#get}).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedAttributes".</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedAttribute[] feedAttributes;

    public AdCustomizerFeed() {
    }

    public AdCustomizerFeed(
           java.lang.Long feedId,
           java.lang.String feedName,
           com.google.api.ads.adwords.axis.v201802.cm.FeedStatus feedStatus,
           com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedAttribute[] feedAttributes) {
           this.feedId = feedId;
           this.feedName = feedName;
           this.feedStatus = feedStatus;
           this.feedAttributes = feedAttributes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("feedAttributes", getFeedAttributes())
            .add("feedId", getFeedId())
            .add("feedName", getFeedName())
            .add("feedStatus", getFeedStatus())
            .toString();
    }

    /**
     * Gets the feedId value for this AdCustomizerFeed.
     * 
     * @return feedId   * ID of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this AdCustomizerFeed.
     * 
     * @param feedId   * ID of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the feedName value for this AdCustomizerFeed.
     * 
     * @return feedName   * Name of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 128, inclusive, (trimmed).</span>
     */
    public java.lang.String getFeedName() {
        return feedName;
    }


    /**
     * Sets the feedName value for this AdCustomizerFeed.
     * 
     * @param feedName   * Name of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 128, inclusive, (trimmed).</span>
     */
    public void setFeedName(java.lang.String feedName) {
        this.feedName = feedName;
    }


    /**
     * Gets the feedStatus value for this AdCustomizerFeed.
     * 
     * @return feedStatus   * Status of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.FeedStatus getFeedStatus() {
        return feedStatus;
    }


    /**
     * Sets the feedStatus value for this AdCustomizerFeed.
     * 
     * @param feedStatus   * Status of the feed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setFeedStatus(com.google.api.ads.adwords.axis.v201802.cm.FeedStatus feedStatus) {
        this.feedStatus = feedStatus;
    }


    /**
     * Gets the feedAttributes value for this AdCustomizerFeed.
     * 
     * @return feedAttributes   * The AdCustomizerFeed's schema. In SET operations, these attributes
     * will be considered new
     *                 attributes and will be appended to the existing list
     * of attributes unless this list is an exact
     *                 copy of the existing list (as would be obtained via
     * {@link AdCustomizerFeedService#get}).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedAttributes".</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedAttribute[] getFeedAttributes() {
        return feedAttributes;
    }


    /**
     * Sets the feedAttributes value for this AdCustomizerFeed.
     * 
     * @param feedAttributes   * The AdCustomizerFeed's schema. In SET operations, these attributes
     * will be considered new
     *                 attributes and will be appended to the existing list
     * of attributes unless this list is an exact
     *                 copy of the existing list (as would be obtained via
     * {@link AdCustomizerFeedService#get}).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedAttributes".</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD, SET.</span>
     */
    public void setFeedAttributes(com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedAttribute[] feedAttributes) {
        this.feedAttributes = feedAttributes;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedAttribute getFeedAttributes(int i) {
        return this.feedAttributes[i];
    }

    public void setFeedAttributes(int i, com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerFeedAttribute _value) {
        this.feedAttributes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdCustomizerFeed)) return false;
        AdCustomizerFeed other = (AdCustomizerFeed) obj;
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
            ((this.feedName==null && other.getFeedName()==null) || 
             (this.feedName!=null &&
              this.feedName.equals(other.getFeedName()))) &&
            ((this.feedStatus==null && other.getFeedStatus()==null) || 
             (this.feedStatus!=null &&
              this.feedStatus.equals(other.getFeedStatus()))) &&
            ((this.feedAttributes==null && other.getFeedAttributes()==null) || 
             (this.feedAttributes!=null &&
              java.util.Arrays.equals(this.feedAttributes, other.getFeedAttributes())));
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
        if (getFeedName() != null) {
            _hashCode += getFeedName().hashCode();
        }
        if (getFeedStatus() != null) {
            _hashCode += getFeedStatus().hashCode();
        }
        if (getFeedAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(AdCustomizerFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdCustomizerFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Feed.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdCustomizerFeedAttribute"));
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
