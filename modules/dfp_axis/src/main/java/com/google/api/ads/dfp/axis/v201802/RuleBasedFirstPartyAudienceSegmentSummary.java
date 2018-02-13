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
 * RuleBasedFirstPartyAudienceSegmentSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@link RuleBasedFirstPartyAudienceSegmentSummary} is a {@link
 * FirstPartyAudienceSegment} owned
 *             by the publisher network.
 */
public class RuleBasedFirstPartyAudienceSegmentSummary  extends com.google.api.ads.dfp.axis.v201802.FirstPartyAudienceSegment  implements java.io.Serializable {
    /* Specifies the number of times a user's cookie must match the
     * segment rule before it's
     *                     associated with the audience segment. This is
     * used in combination with
     *                     {@link FirstPartyAudienceSegment#recencyDays}
     * to determine eligibility of the association. This
     *                     attribute is required and can be between 1 and
     * 12. */
    private java.lang.Integer pageViews;

    /* Specifies the number of days within which a user's cookie must
     * match the segment rule before
     *                     it's associated with the audience segment. This
     * is used in combination with
     *                     {@link FirstPartyAudienceSegment#pageViews} to
     * determine eligibility of the association. This
     *                     attribute is required only if {@link FirstPartyAudienceSegment#pageViews}
     * is greater than 1.
     *                     When required, it can be between 1 and 90. */
    private java.lang.Integer recencyDays;

    /* Specifies the number of days after which a user's cookie will
     * be removed from the audience
     *                     segment due to inactivity. This attribute is required
     * and can be between 1 and 540. */
    private java.lang.Integer membershipExpirationDays;

    public RuleBasedFirstPartyAudienceSegmentSummary() {
    }

    public RuleBasedFirstPartyAudienceSegmentSummary(
           java.lang.Long id,
           java.lang.String name,
           long[] categoryIds,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201802.AudienceSegmentStatus status,
           java.lang.Long size,
           java.lang.Long mobileWebSize,
           java.lang.Long idfaSize,
           java.lang.Long adIdSize,
           java.lang.Long ppidSize,
           com.google.api.ads.dfp.axis.v201802.AudienceSegmentDataProvider dataProvider,
           com.google.api.ads.dfp.axis.v201802.AudienceSegmentType type,
           java.lang.Integer pageViews,
           java.lang.Integer recencyDays,
           java.lang.Integer membershipExpirationDays) {
        super(
            id,
            name,
            categoryIds,
            description,
            status,
            size,
            mobileWebSize,
            idfaSize,
            adIdSize,
            ppidSize,
            dataProvider,
            type);
        this.pageViews = pageViews;
        this.recencyDays = recencyDays;
        this.membershipExpirationDays = membershipExpirationDays;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adIdSize", getAdIdSize())
            .add("categoryIds", getCategoryIds())
            .add("dataProvider", getDataProvider())
            .add("description", getDescription())
            .add("id", getId())
            .add("idfaSize", getIdfaSize())
            .add("membershipExpirationDays", getMembershipExpirationDays())
            .add("mobileWebSize", getMobileWebSize())
            .add("name", getName())
            .add("pageViews", getPageViews())
            .add("ppidSize", getPpidSize())
            .add("recencyDays", getRecencyDays())
            .add("size", getSize())
            .add("status", getStatus())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the pageViews value for this RuleBasedFirstPartyAudienceSegmentSummary.
     * 
     * @return pageViews   * Specifies the number of times a user's cookie must match the
     * segment rule before it's
     *                     associated with the audience segment. This is
     * used in combination with
     *                     {@link FirstPartyAudienceSegment#recencyDays}
     * to determine eligibility of the association. This
     *                     attribute is required and can be between 1 and
     * 12.
     */
    public java.lang.Integer getPageViews() {
        return pageViews;
    }


    /**
     * Sets the pageViews value for this RuleBasedFirstPartyAudienceSegmentSummary.
     * 
     * @param pageViews   * Specifies the number of times a user's cookie must match the
     * segment rule before it's
     *                     associated with the audience segment. This is
     * used in combination with
     *                     {@link FirstPartyAudienceSegment#recencyDays}
     * to determine eligibility of the association. This
     *                     attribute is required and can be between 1 and
     * 12.
     */
    public void setPageViews(java.lang.Integer pageViews) {
        this.pageViews = pageViews;
    }


    /**
     * Gets the recencyDays value for this RuleBasedFirstPartyAudienceSegmentSummary.
     * 
     * @return recencyDays   * Specifies the number of days within which a user's cookie must
     * match the segment rule before
     *                     it's associated with the audience segment. This
     * is used in combination with
     *                     {@link FirstPartyAudienceSegment#pageViews} to
     * determine eligibility of the association. This
     *                     attribute is required only if {@link FirstPartyAudienceSegment#pageViews}
     * is greater than 1.
     *                     When required, it can be between 1 and 90.
     */
    public java.lang.Integer getRecencyDays() {
        return recencyDays;
    }


    /**
     * Sets the recencyDays value for this RuleBasedFirstPartyAudienceSegmentSummary.
     * 
     * @param recencyDays   * Specifies the number of days within which a user's cookie must
     * match the segment rule before
     *                     it's associated with the audience segment. This
     * is used in combination with
     *                     {@link FirstPartyAudienceSegment#pageViews} to
     * determine eligibility of the association. This
     *                     attribute is required only if {@link FirstPartyAudienceSegment#pageViews}
     * is greater than 1.
     *                     When required, it can be between 1 and 90.
     */
    public void setRecencyDays(java.lang.Integer recencyDays) {
        this.recencyDays = recencyDays;
    }


    /**
     * Gets the membershipExpirationDays value for this RuleBasedFirstPartyAudienceSegmentSummary.
     * 
     * @return membershipExpirationDays   * Specifies the number of days after which a user's cookie will
     * be removed from the audience
     *                     segment due to inactivity. This attribute is required
     * and can be between 1 and 540.
     */
    public java.lang.Integer getMembershipExpirationDays() {
        return membershipExpirationDays;
    }


    /**
     * Sets the membershipExpirationDays value for this RuleBasedFirstPartyAudienceSegmentSummary.
     * 
     * @param membershipExpirationDays   * Specifies the number of days after which a user's cookie will
     * be removed from the audience
     *                     segment due to inactivity. This attribute is required
     * and can be between 1 and 540.
     */
    public void setMembershipExpirationDays(java.lang.Integer membershipExpirationDays) {
        this.membershipExpirationDays = membershipExpirationDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RuleBasedFirstPartyAudienceSegmentSummary)) return false;
        RuleBasedFirstPartyAudienceSegmentSummary other = (RuleBasedFirstPartyAudienceSegmentSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pageViews==null && other.getPageViews()==null) || 
             (this.pageViews!=null &&
              this.pageViews.equals(other.getPageViews()))) &&
            ((this.recencyDays==null && other.getRecencyDays()==null) || 
             (this.recencyDays!=null &&
              this.recencyDays.equals(other.getRecencyDays()))) &&
            ((this.membershipExpirationDays==null && other.getMembershipExpirationDays()==null) || 
             (this.membershipExpirationDays!=null &&
              this.membershipExpirationDays.equals(other.getMembershipExpirationDays())));
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
        if (getPageViews() != null) {
            _hashCode += getPageViews().hashCode();
        }
        if (getRecencyDays() != null) {
            _hashCode += getRecencyDays().hashCode();
        }
        if (getMembershipExpirationDays() != null) {
            _hashCode += getMembershipExpirationDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RuleBasedFirstPartyAudienceSegmentSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RuleBasedFirstPartyAudienceSegmentSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageViews");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "pageViews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recencyDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "recencyDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("membershipExpirationDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "membershipExpirationDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
