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
 * YouTubeChannel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * YouTube channel criterion.
 *             <p>
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class YouTubeChannel  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* The YouTube uploader channel id or the channel code of a YouTube
     * content channel.
     *                     <p>The uploader channel id can be obtained from
     * the YouTube id-based URL. For example, in
     *                     <code>https://www.youtube.com/channel/UCEN58iXQg82TXgsDCjWqIkg</code>
     * the channel id is
     *                     <code>UCEN58iXQg82TXgsDCjWqIkg</code>
     *                     <p>For more information see: https://support.google.com/youtube/answer/6180214 */
    private java.lang.String channelId;

    /* The public name for a YouTube user channel.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String channelName;

    public YouTubeChannel() {
    }

    public YouTubeChannel(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String channelId,
           java.lang.String channelName) {
        super(
            id,
            type,
            criterionType);
        this.channelId = channelId;
        this.channelName = channelName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("channelId", getChannelId())
            .add("channelName", getChannelName())
            .add("criterionType", getCriterionType())
            .add("id", getId())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the channelId value for this YouTubeChannel.
     * 
     * @return channelId   * The YouTube uploader channel id or the channel code of a YouTube
     * content channel.
     *                     <p>The uploader channel id can be obtained from
     * the YouTube id-based URL. For example, in
     *                     <code>https://www.youtube.com/channel/UCEN58iXQg82TXgsDCjWqIkg</code>
     * the channel id is
     *                     <code>UCEN58iXQg82TXgsDCjWqIkg</code>
     *                     <p>For more information see: https://support.google.com/youtube/answer/6180214
     */
    public java.lang.String getChannelId() {
        return channelId;
    }


    /**
     * Sets the channelId value for this YouTubeChannel.
     * 
     * @param channelId   * The YouTube uploader channel id or the channel code of a YouTube
     * content channel.
     *                     <p>The uploader channel id can be obtained from
     * the YouTube id-based URL. For example, in
     *                     <code>https://www.youtube.com/channel/UCEN58iXQg82TXgsDCjWqIkg</code>
     * the channel id is
     *                     <code>UCEN58iXQg82TXgsDCjWqIkg</code>
     *                     <p>For more information see: https://support.google.com/youtube/answer/6180214
     */
    public void setChannelId(java.lang.String channelId) {
        this.channelId = channelId;
    }


    /**
     * Gets the channelName value for this YouTubeChannel.
     * 
     * @return channelName   * The public name for a YouTube user channel.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this YouTubeChannel.
     * 
     * @param channelName   * The public name for a YouTube user channel.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YouTubeChannel)) return false;
        YouTubeChannel other = (YouTubeChannel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channelId==null && other.getChannelId()==null) || 
             (this.channelId!=null &&
              this.channelId.equals(other.getChannelId()))) &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName())));
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
        if (getChannelId() != null) {
            _hashCode += getChannelId().hashCode();
        }
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YouTubeChannel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "YouTubeChannel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "channelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "channelName"));
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
