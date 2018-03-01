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
 * AffiliateLocationFeedData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Data used to configure an Affiliate Location Feed populated with
 * the specified chains.
 */
public class AffiliateLocationFeedData  extends com.google.api.ads.adwords.axis.v201802.cm.SystemFeedGenerationData  implements java.io.Serializable {
    /* The list of chains that the Affiliate Location Feed will sync
     * the locations from. */
    private com.google.api.ads.adwords.axis.v201802.cm.Chain[] chains;

    /* The relationship the chains have with the advertiser. */
    private com.google.api.ads.adwords.axis.v201802.cm.RelationshipType relationshipType;

    public AffiliateLocationFeedData() {
    }

    public AffiliateLocationFeedData(
           java.lang.String systemFeedGenerationDataType,
           com.google.api.ads.adwords.axis.v201802.cm.Chain[] chains,
           com.google.api.ads.adwords.axis.v201802.cm.RelationshipType relationshipType) {
        super(
            systemFeedGenerationDataType);
        this.chains = chains;
        this.relationshipType = relationshipType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("chains", getChains())
            .add("relationshipType", getRelationshipType())
            .add("systemFeedGenerationDataType", getSystemFeedGenerationDataType())
            .toString();
    }

    /**
     * Gets the chains value for this AffiliateLocationFeedData.
     * 
     * @return chains   * The list of chains that the Affiliate Location Feed will sync
     * the locations from.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Chain[] getChains() {
        return chains;
    }


    /**
     * Sets the chains value for this AffiliateLocationFeedData.
     * 
     * @param chains   * The list of chains that the Affiliate Location Feed will sync
     * the locations from.
     */
    public void setChains(com.google.api.ads.adwords.axis.v201802.cm.Chain[] chains) {
        this.chains = chains;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Chain getChains(int i) {
        return this.chains[i];
    }

    public void setChains(int i, com.google.api.ads.adwords.axis.v201802.cm.Chain _value) {
        this.chains[i] = _value;
    }


    /**
     * Gets the relationshipType value for this AffiliateLocationFeedData.
     * 
     * @return relationshipType   * The relationship the chains have with the advertiser.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.RelationshipType getRelationshipType() {
        return relationshipType;
    }


    /**
     * Sets the relationshipType value for this AffiliateLocationFeedData.
     * 
     * @param relationshipType   * The relationship the chains have with the advertiser.
     */
    public void setRelationshipType(com.google.api.ads.adwords.axis.v201802.cm.RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AffiliateLocationFeedData)) return false;
        AffiliateLocationFeedData other = (AffiliateLocationFeedData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.chains==null && other.getChains()==null) || 
             (this.chains!=null &&
              java.util.Arrays.equals(this.chains, other.getChains()))) &&
            ((this.relationshipType==null && other.getRelationshipType()==null) || 
             (this.relationshipType!=null &&
              this.relationshipType.equals(other.getRelationshipType())));
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
        if (getChains() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChains());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChains(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationshipType() != null) {
            _hashCode += getRelationshipType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AffiliateLocationFeedData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AffiliateLocationFeedData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chains");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "chains"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Chain"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "relationshipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RelationshipType"));
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
