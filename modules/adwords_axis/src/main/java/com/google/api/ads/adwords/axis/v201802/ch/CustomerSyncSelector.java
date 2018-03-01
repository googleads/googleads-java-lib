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
 * CustomerSyncSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.ch;


/**
 * A filter for selecting change history data for a customer.
 */
public class CustomerSyncSelector  implements java.io.Serializable {
    /* Only return entities that have changed during the specified
     * time range. String Format: yyyyMMdd
     *                 HHmmss <Timezone ID> (for example, 20100609 150223
     * America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.DateTimeRange dateTimeRange;

    /* Return entities belonging to these campaigns.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span> */
    private long[] campaignIds;

    /* Return entities belonging to these feeds.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span> */
    private long[] feedIds;

    public CustomerSyncSelector() {
    }

    public CustomerSyncSelector(
           com.google.api.ads.adwords.axis.v201802.cm.DateTimeRange dateTimeRange,
           long[] campaignIds,
           long[] feedIds) {
           this.dateTimeRange = dateTimeRange;
           this.campaignIds = campaignIds;
           this.feedIds = feedIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("campaignIds", getCampaignIds())
            .add("dateTimeRange", getDateTimeRange())
            .add("feedIds", getFeedIds())
            .toString();
    }

    /**
     * Gets the dateTimeRange value for this CustomerSyncSelector.
     * 
     * @return dateTimeRange   * Only return entities that have changed during the specified
     * time range. String Format: yyyyMMdd
     *                 HHmmss <Timezone ID> (for example, 20100609 150223
     * America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DateTimeRange getDateTimeRange() {
        return dateTimeRange;
    }


    /**
     * Sets the dateTimeRange value for this CustomerSyncSelector.
     * 
     * @param dateTimeRange   * Only return entities that have changed during the specified
     * time range. String Format: yyyyMMdd
     *                 HHmmss <Timezone ID> (for example, 20100609 150223
     * America/New_York). See the <a
     *                 href="https://developers.google.com/adwords/api/docs/appendix/timezones">Timezones</a>
     * page for
     *                 the complete list of Timezone IDs.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setDateTimeRange(com.google.api.ads.adwords.axis.v201802.cm.DateTimeRange dateTimeRange) {
        this.dateTimeRange = dateTimeRange;
    }


    /**
     * Gets the campaignIds value for this CustomerSyncSelector.
     * 
     * @return campaignIds   * Return entities belonging to these campaigns.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this CustomerSyncSelector.
     * 
     * @param campaignIds   * Return entities belonging to these campaigns.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     */
    public void setCampaignIds(long[] campaignIds) {
        this.campaignIds = campaignIds;
    }

    public long getCampaignIds(int i) {
        return this.campaignIds[i];
    }

    public void setCampaignIds(int i, long _value) {
        this.campaignIds[i] = _value;
    }


    /**
     * Gets the feedIds value for this CustomerSyncSelector.
     * 
     * @return feedIds   * Return entities belonging to these feeds.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     */
    public long[] getFeedIds() {
        return feedIds;
    }


    /**
     * Sets the feedIds value for this CustomerSyncSelector.
     * 
     * @param feedIds   * Return entities belonging to these feeds.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     */
    public void setFeedIds(long[] feedIds) {
        this.feedIds = feedIds;
    }

    public long getFeedIds(int i) {
        return this.feedIds[i];
    }

    public void setFeedIds(int i, long _value) {
        this.feedIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerSyncSelector)) return false;
        CustomerSyncSelector other = (CustomerSyncSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateTimeRange==null && other.getDateTimeRange()==null) || 
             (this.dateTimeRange!=null &&
              this.dateTimeRange.equals(other.getDateTimeRange()))) &&
            ((this.campaignIds==null && other.getCampaignIds()==null) || 
             (this.campaignIds!=null &&
              java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
            ((this.feedIds==null && other.getFeedIds()==null) || 
             (this.feedIds!=null &&
              java.util.Arrays.equals(this.feedIds, other.getFeedIds())));
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
        if (getDateTimeRange() != null) {
            _hashCode += getDateTimeRange().hashCode();
        }
        if (getCampaignIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeedIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedIds(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerSyncSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "CustomerSyncSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "dateTimeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DateTimeRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/ch/v201802", "feedIds"));
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
