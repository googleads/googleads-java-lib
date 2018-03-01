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
 * FeedAttributeOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a feed attribute reference to use in a function.
 */
public class FeedAttributeOperand  extends com.google.api.ads.adwords.axis.v201802.cm.FunctionArgumentOperand  implements java.io.Serializable {
    /* Id of associated feed.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Long feedId;

    /* Id of the referenced feed attribute.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.Long feedAttributeId;

    public FeedAttributeOperand() {
    }

    public FeedAttributeOperand(
           java.lang.String functionArgumentOperandType,
           java.lang.Long feedId,
           java.lang.Long feedAttributeId) {
        super(
            functionArgumentOperandType);
        this.feedId = feedId;
        this.feedAttributeId = feedAttributeId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("feedAttributeId", getFeedAttributeId())
            .add("feedId", getFeedId())
            .add("functionArgumentOperandType", getFunctionArgumentOperandType())
            .toString();
    }

    /**
     * Gets the feedId value for this FeedAttributeOperand.
     * 
     * @return feedId   * Id of associated feed.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this FeedAttributeOperand.
     * 
     * @param feedId   * Id of associated feed.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the feedAttributeId value for this FeedAttributeOperand.
     * 
     * @return feedAttributeId   * Id of the referenced feed attribute.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedAttributeId() {
        return feedAttributeId;
    }


    /**
     * Sets the feedAttributeId value for this FeedAttributeOperand.
     * 
     * @param feedAttributeId   * Id of the referenced feed attribute.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setFeedAttributeId(java.lang.Long feedAttributeId) {
        this.feedAttributeId = feedAttributeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedAttributeOperand)) return false;
        FeedAttributeOperand other = (FeedAttributeOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.feedId==null && other.getFeedId()==null) || 
             (this.feedId!=null &&
              this.feedId.equals(other.getFeedId()))) &&
            ((this.feedAttributeId==null && other.getFeedAttributeId()==null) || 
             (this.feedAttributeId!=null &&
              this.feedAttributeId.equals(other.getFeedAttributeId())));
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
        if (getFeedId() != null) {
            _hashCode += getFeedId().hashCode();
        }
        if (getFeedAttributeId() != null) {
            _hashCode += getFeedAttributeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedAttributeOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedAttributeOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedAttributeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "feedAttributeId"));
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
