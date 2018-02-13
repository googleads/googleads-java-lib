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
 * ProspectiveLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a prospective line item to be forecasted.
 */
public class ProspectiveLineItem  implements java.io.Serializable {
    /* The target of the forecast. If {@link LineItem#id} is null
     * or no line item exists with that ID,
     *                 then a forecast is computed for the the subject, predicting
     * what would happen if it were added
     *                 to the network. If a line item already exists with
     * {@link LineItem#id}, the forecast is
     *                 computed for the subject, predicting what would happen
     * if the existing line item's settings
     *                 were modified to match the subject. */
    private com.google.api.ads.dfp.axis.v201802.LineItem lineItem;

    /* When set, the line item is assumed to be from this advertiser,
     * and unified blocking rules will
     *                 apply accordingly. If absent, line items without an
     * existing order won't be subject to unified
     *                 blocking rules. */
    private java.lang.Long advertiserId;

    public ProspectiveLineItem() {
    }

    public ProspectiveLineItem(
           com.google.api.ads.dfp.axis.v201802.LineItem lineItem,
           java.lang.Long advertiserId) {
           this.lineItem = lineItem;
           this.advertiserId = advertiserId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("lineItem", getLineItem())
            .toString();
    }

    /**
     * Gets the lineItem value for this ProspectiveLineItem.
     * 
     * @return lineItem   * The target of the forecast. If {@link LineItem#id} is null
     * or no line item exists with that ID,
     *                 then a forecast is computed for the the subject, predicting
     * what would happen if it were added
     *                 to the network. If a line item already exists with
     * {@link LineItem#id}, the forecast is
     *                 computed for the subject, predicting what would happen
     * if the existing line item's settings
     *                 were modified to match the subject.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItem getLineItem() {
        return lineItem;
    }


    /**
     * Sets the lineItem value for this ProspectiveLineItem.
     * 
     * @param lineItem   * The target of the forecast. If {@link LineItem#id} is null
     * or no line item exists with that ID,
     *                 then a forecast is computed for the the subject, predicting
     * what would happen if it were added
     *                 to the network. If a line item already exists with
     * {@link LineItem#id}, the forecast is
     *                 computed for the subject, predicting what would happen
     * if the existing line item's settings
     *                 were modified to match the subject.
     */
    public void setLineItem(com.google.api.ads.dfp.axis.v201802.LineItem lineItem) {
        this.lineItem = lineItem;
    }


    /**
     * Gets the advertiserId value for this ProspectiveLineItem.
     * 
     * @return advertiserId   * When set, the line item is assumed to be from this advertiser,
     * and unified blocking rules will
     *                 apply accordingly. If absent, line items without an
     * existing order won't be subject to unified
     *                 blocking rules.
     */
    public java.lang.Long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this ProspectiveLineItem.
     * 
     * @param advertiserId   * When set, the line item is assumed to be from this advertiser,
     * and unified blocking rules will
     *                 apply accordingly. If absent, line items without an
     * existing order won't be subject to unified
     *                 blocking rules.
     */
    public void setAdvertiserId(java.lang.Long advertiserId) {
        this.advertiserId = advertiserId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProspectiveLineItem)) return false;
        ProspectiveLineItem other = (ProspectiveLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItem==null && other.getLineItem()==null) || 
             (this.lineItem!=null &&
              this.lineItem.equals(other.getLineItem()))) &&
            ((this.advertiserId==null && other.getAdvertiserId()==null) || 
             (this.advertiserId!=null &&
              this.advertiserId.equals(other.getAdvertiserId())));
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
        if (getLineItem() != null) {
            _hashCode += getLineItem().hashCode();
        }
        if (getAdvertiserId() != null) {
            _hashCode += getAdvertiserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProspectiveLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProspectiveLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
