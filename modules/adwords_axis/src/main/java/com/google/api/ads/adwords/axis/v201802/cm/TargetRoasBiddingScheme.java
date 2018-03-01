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
 * TargetRoasBiddingScheme.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Target Roas bidding strategy helps you maximize revenue while averaging
 * a specific target
 *             return on average spend (ROAS).
 *             
 *             <p>For example: If TargetRoas is 1.5, the strategy will
 * create as much revenue as possible while
 *             ensuring that every $1.00 of clicks provides $1.50 in
 * conversion value.
 *             
 *             <p>Note that campaigns must meet <a
 *             href="//support.google.com/adwords/answer/6268637">specific
 * eligibility requirements</a> before they can use the <code>TargetRoasBiddingScheme</code>
 * bidding strategy.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX.</span>
 */
public class TargetRoasBiddingScheme  extends com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme  implements java.io.Serializable {
    /* The target return on average spend (ROAS).
     *                     <span class="constraint InRange">This field must
     * be between 0.01 and 1000.0, inclusive.</span> */
    private java.lang.Double targetRoas;

    /* Maximum bid limit that applies to all keywords managed by the
     * strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money bidCeiling;

    /* Minimum bid limit that applies to all keywords managed by the
     * strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Money bidFloor;

    public TargetRoasBiddingScheme() {
    }

    public TargetRoasBiddingScheme(
           java.lang.String biddingSchemeType,
           java.lang.Double targetRoas,
           com.google.api.ads.adwords.axis.v201802.cm.Money bidCeiling,
           com.google.api.ads.adwords.axis.v201802.cm.Money bidFloor) {
        super(
            biddingSchemeType);
        this.targetRoas = targetRoas;
        this.bidCeiling = bidCeiling;
        this.bidFloor = bidFloor;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bidCeiling", getBidCeiling())
            .add("bidFloor", getBidFloor())
            .add("biddingSchemeType", getBiddingSchemeType())
            .add("targetRoas", getTargetRoas())
            .toString();
    }

    /**
     * Gets the targetRoas value for this TargetRoasBiddingScheme.
     * 
     * @return targetRoas   * The target return on average spend (ROAS).
     *                     <span class="constraint InRange">This field must
     * be between 0.01 and 1000.0, inclusive.</span>
     */
    public java.lang.Double getTargetRoas() {
        return targetRoas;
    }


    /**
     * Sets the targetRoas value for this TargetRoasBiddingScheme.
     * 
     * @param targetRoas   * The target return on average spend (ROAS).
     *                     <span class="constraint InRange">This field must
     * be between 0.01 and 1000.0, inclusive.</span>
     */
    public void setTargetRoas(java.lang.Double targetRoas) {
        this.targetRoas = targetRoas;
    }


    /**
     * Gets the bidCeiling value for this TargetRoasBiddingScheme.
     * 
     * @return bidCeiling   * Maximum bid limit that applies to all keywords managed by the
     * strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getBidCeiling() {
        return bidCeiling;
    }


    /**
     * Sets the bidCeiling value for this TargetRoasBiddingScheme.
     * 
     * @param bidCeiling   * Maximum bid limit that applies to all keywords managed by the
     * strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setBidCeiling(com.google.api.ads.adwords.axis.v201802.cm.Money bidCeiling) {
        this.bidCeiling = bidCeiling;
    }


    /**
     * Gets the bidFloor value for this TargetRoasBiddingScheme.
     * 
     * @return bidFloor   * Minimum bid limit that applies to all keywords managed by the
     * strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Money getBidFloor() {
        return bidFloor;
    }


    /**
     * Sets the bidFloor value for this TargetRoasBiddingScheme.
     * 
     * @param bidFloor   * Minimum bid limit that applies to all keywords managed by the
     * strategy.
     *                     <span class="constraint InRange">This field must
     * be greater than or equal to 0.</span>
     */
    public void setBidFloor(com.google.api.ads.adwords.axis.v201802.cm.Money bidFloor) {
        this.bidFloor = bidFloor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetRoasBiddingScheme)) return false;
        TargetRoasBiddingScheme other = (TargetRoasBiddingScheme) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targetRoas==null && other.getTargetRoas()==null) || 
             (this.targetRoas!=null &&
              this.targetRoas.equals(other.getTargetRoas()))) &&
            ((this.bidCeiling==null && other.getBidCeiling()==null) || 
             (this.bidCeiling!=null &&
              this.bidCeiling.equals(other.getBidCeiling()))) &&
            ((this.bidFloor==null && other.getBidFloor()==null) || 
             (this.bidFloor!=null &&
              this.bidFloor.equals(other.getBidFloor())));
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
        if (getTargetRoas() != null) {
            _hashCode += getTargetRoas().hashCode();
        }
        if (getBidCeiling() != null) {
            _hashCode += getBidCeiling().hashCode();
        }
        if (getBidFloor() != null) {
            _hashCode += getBidFloor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetRoasBiddingScheme.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetRoasBiddingScheme"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRoas");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "targetRoas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidCeiling");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bidCeiling"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidFloor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "bidFloor"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money"));
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
