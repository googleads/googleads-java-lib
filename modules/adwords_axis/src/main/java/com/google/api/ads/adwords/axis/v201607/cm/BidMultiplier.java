// Copyright 2016 Google Inc. All Rights Reserved.
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
 * BidMultiplier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;


/**
 * Represents a multiplier to modify a bid. The final value after
 *             modification is represented by the multiplied bid value.
 */
public class BidMultiplier  implements java.io.Serializable {
    /* A number used in bidding strategies to increase or decrease
     * a bid by a scale factor. */
    private java.lang.Double multiplier;

    /* The bid after multiplying original bid with the multiplier.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201607.cm.Bid multipliedBid;

    public BidMultiplier() {
    }

    public BidMultiplier(
           java.lang.Double multiplier,
           com.google.api.ads.adwords.axis.v201607.cm.Bid multipliedBid) {
           this.multiplier = multiplier;
           this.multipliedBid = multipliedBid;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("multipliedBid", getMultipliedBid())
            .add("multiplier", getMultiplier())
            .toString();
    }

    /**
     * Gets the multiplier value for this BidMultiplier.
     * 
     * @return multiplier   * A number used in bidding strategies to increase or decrease
     * a bid by a scale factor.
     */
    public java.lang.Double getMultiplier() {
        return multiplier;
    }


    /**
     * Sets the multiplier value for this BidMultiplier.
     * 
     * @param multiplier   * A number used in bidding strategies to increase or decrease
     * a bid by a scale factor.
     */
    public void setMultiplier(java.lang.Double multiplier) {
        this.multiplier = multiplier;
    }


    /**
     * Gets the multipliedBid value for this BidMultiplier.
     * 
     * @return multipliedBid   * The bid after multiplying original bid with the multiplier.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201607.cm.Bid getMultipliedBid() {
        return multipliedBid;
    }


    /**
     * Sets the multipliedBid value for this BidMultiplier.
     * 
     * @param multipliedBid   * The bid after multiplying original bid with the multiplier.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setMultipliedBid(com.google.api.ads.adwords.axis.v201607.cm.Bid multipliedBid) {
        this.multipliedBid = multipliedBid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BidMultiplier)) return false;
        BidMultiplier other = (BidMultiplier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.multiplier==null && other.getMultiplier()==null) || 
             (this.multiplier!=null &&
              this.multiplier.equals(other.getMultiplier()))) &&
            ((this.multipliedBid==null && other.getMultipliedBid()==null) || 
             (this.multipliedBid!=null &&
              this.multipliedBid.equals(other.getMultipliedBid())));
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
        if (getMultiplier() != null) {
            _hashCode += getMultiplier().hashCode();
        }
        if (getMultipliedBid() != null) {
            _hashCode += getMultipliedBid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BidMultiplier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "BidMultiplier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiplier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "multiplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipliedBid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "multipliedBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "Bid"));
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
