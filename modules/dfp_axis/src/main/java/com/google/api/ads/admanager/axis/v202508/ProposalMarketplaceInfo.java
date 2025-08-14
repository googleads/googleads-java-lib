// Copyright 2025 Google LLC
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
 * ProposalMarketplaceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;


/**
 * Marketplace info for a proposal with a corresponding order in Marketplace.
 */
public class ProposalMarketplaceInfo  implements java.io.Serializable {
    /* The marketplace ID of this proposal. This is a shared ID between
     * Ad Manager and the buy-side
     *                 platform. This value is null if the proposal has not
     * been sent to the buyer.
     *                 This attribute is read-only. */
    private java.lang.String marketplaceId;

    /* Whether the non-free-editable fields of a {@link Proposal}
     * are opened for edit. A proposal that
     *                 is open for edit will not receive buyer updates from
     * Marketplace. If the buyer updates the
     *                 proposal while this is open for local editing, Google
     * will set {@link #isNewVersionFromBuyer}
     *                 to {@code true}. You will then need to call {@link
     * DiscardProposalDrafts} to revert your edits
     *                 to get the buyer's latest changes.
     *                 This attribute is read-only. */
    private java.lang.Boolean hasLocalVersionEdits;

    /* The negotiation status of the {@link Proposal}.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202508.NegotiationStatus negotiationStatus;

    /* The comment on the {@link Proposal} to be sent to the buyer. */
    private java.lang.String marketplaceComment;

    /* Indicates that the buyer has made updates to the proposal on
     * Marketplace. This attribute is
     *                 only meaningful if the proposal is open for edit (i.e.,
     * {@link #hasLocalVersionEdits} is {@code
     *                 true})
     *                 This attribute is read-only. */
    private java.lang.Boolean isNewVersionFromBuyer;

    /* The Authorized Buyers ID of the buyer that this {@code Proposal}
     * is being negotiated with.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.Long buyerAccountId;

    /* The ID used to represent Display & Video 360 client buyer partner
     * ID (if Display & Video 360)
     *                 or Authorized Buyers client buyer account ID. This
     * field is readonly and assigned by Google.
     *                 This attribute is read-only. */
    private java.lang.String partnerClientId;

    public ProposalMarketplaceInfo() {
    }

    public ProposalMarketplaceInfo(
           java.lang.String marketplaceId,
           java.lang.Boolean hasLocalVersionEdits,
           com.google.api.ads.admanager.axis.v202508.NegotiationStatus negotiationStatus,
           java.lang.String marketplaceComment,
           java.lang.Boolean isNewVersionFromBuyer,
           java.lang.Long buyerAccountId,
           java.lang.String partnerClientId) {
           this.marketplaceId = marketplaceId;
           this.hasLocalVersionEdits = hasLocalVersionEdits;
           this.negotiationStatus = negotiationStatus;
           this.marketplaceComment = marketplaceComment;
           this.isNewVersionFromBuyer = isNewVersionFromBuyer;
           this.buyerAccountId = buyerAccountId;
           this.partnerClientId = partnerClientId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("buyerAccountId", getBuyerAccountId())
            .add("hasLocalVersionEdits", getHasLocalVersionEdits())
            .add("isNewVersionFromBuyer", getIsNewVersionFromBuyer())
            .add("marketplaceComment", getMarketplaceComment())
            .add("marketplaceId", getMarketplaceId())
            .add("negotiationStatus", getNegotiationStatus())
            .add("partnerClientId", getPartnerClientId())
            .toString();
    }

    /**
     * Gets the marketplaceId value for this ProposalMarketplaceInfo.
     * 
     * @return marketplaceId   * The marketplace ID of this proposal. This is a shared ID between
     * Ad Manager and the buy-side
     *                 platform. This value is null if the proposal has not
     * been sent to the buyer.
     *                 This attribute is read-only.
     */
    public java.lang.String getMarketplaceId() {
        return marketplaceId;
    }


    /**
     * Sets the marketplaceId value for this ProposalMarketplaceInfo.
     * 
     * @param marketplaceId   * The marketplace ID of this proposal. This is a shared ID between
     * Ad Manager and the buy-side
     *                 platform. This value is null if the proposal has not
     * been sent to the buyer.
     *                 This attribute is read-only.
     */
    public void setMarketplaceId(java.lang.String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }


    /**
     * Gets the hasLocalVersionEdits value for this ProposalMarketplaceInfo.
     * 
     * @return hasLocalVersionEdits   * Whether the non-free-editable fields of a {@link Proposal}
     * are opened for edit. A proposal that
     *                 is open for edit will not receive buyer updates from
     * Marketplace. If the buyer updates the
     *                 proposal while this is open for local editing, Google
     * will set {@link #isNewVersionFromBuyer}
     *                 to {@code true}. You will then need to call {@link
     * DiscardProposalDrafts} to revert your edits
     *                 to get the buyer's latest changes.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getHasLocalVersionEdits() {
        return hasLocalVersionEdits;
    }


    /**
     * Sets the hasLocalVersionEdits value for this ProposalMarketplaceInfo.
     * 
     * @param hasLocalVersionEdits   * Whether the non-free-editable fields of a {@link Proposal}
     * are opened for edit. A proposal that
     *                 is open for edit will not receive buyer updates from
     * Marketplace. If the buyer updates the
     *                 proposal while this is open for local editing, Google
     * will set {@link #isNewVersionFromBuyer}
     *                 to {@code true}. You will then need to call {@link
     * DiscardProposalDrafts} to revert your edits
     *                 to get the buyer's latest changes.
     *                 This attribute is read-only.
     */
    public void setHasLocalVersionEdits(java.lang.Boolean hasLocalVersionEdits) {
        this.hasLocalVersionEdits = hasLocalVersionEdits;
    }


    /**
     * Gets the negotiationStatus value for this ProposalMarketplaceInfo.
     * 
     * @return negotiationStatus   * The negotiation status of the {@link Proposal}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202508.NegotiationStatus getNegotiationStatus() {
        return negotiationStatus;
    }


    /**
     * Sets the negotiationStatus value for this ProposalMarketplaceInfo.
     * 
     * @param negotiationStatus   * The negotiation status of the {@link Proposal}.
     *                 This attribute is read-only.
     */
    public void setNegotiationStatus(com.google.api.ads.admanager.axis.v202508.NegotiationStatus negotiationStatus) {
        this.negotiationStatus = negotiationStatus;
    }


    /**
     * Gets the marketplaceComment value for this ProposalMarketplaceInfo.
     * 
     * @return marketplaceComment   * The comment on the {@link Proposal} to be sent to the buyer.
     */
    public java.lang.String getMarketplaceComment() {
        return marketplaceComment;
    }


    /**
     * Sets the marketplaceComment value for this ProposalMarketplaceInfo.
     * 
     * @param marketplaceComment   * The comment on the {@link Proposal} to be sent to the buyer.
     */
    public void setMarketplaceComment(java.lang.String marketplaceComment) {
        this.marketplaceComment = marketplaceComment;
    }


    /**
     * Gets the isNewVersionFromBuyer value for this ProposalMarketplaceInfo.
     * 
     * @return isNewVersionFromBuyer   * Indicates that the buyer has made updates to the proposal on
     * Marketplace. This attribute is
     *                 only meaningful if the proposal is open for edit (i.e.,
     * {@link #hasLocalVersionEdits} is {@code
     *                 true})
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getIsNewVersionFromBuyer() {
        return isNewVersionFromBuyer;
    }


    /**
     * Sets the isNewVersionFromBuyer value for this ProposalMarketplaceInfo.
     * 
     * @param isNewVersionFromBuyer   * Indicates that the buyer has made updates to the proposal on
     * Marketplace. This attribute is
     *                 only meaningful if the proposal is open for edit (i.e.,
     * {@link #hasLocalVersionEdits} is {@code
     *                 true})
     *                 This attribute is read-only.
     */
    public void setIsNewVersionFromBuyer(java.lang.Boolean isNewVersionFromBuyer) {
        this.isNewVersionFromBuyer = isNewVersionFromBuyer;
    }


    /**
     * Gets the buyerAccountId value for this ProposalMarketplaceInfo.
     * 
     * @return buyerAccountId   * The Authorized Buyers ID of the buyer that this {@code Proposal}
     * is being negotiated with.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.Long getBuyerAccountId() {
        return buyerAccountId;
    }


    /**
     * Sets the buyerAccountId value for this ProposalMarketplaceInfo.
     * 
     * @param buyerAccountId   * The Authorized Buyers ID of the buyer that this {@code Proposal}
     * is being negotiated with.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setBuyerAccountId(java.lang.Long buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
    }


    /**
     * Gets the partnerClientId value for this ProposalMarketplaceInfo.
     * 
     * @return partnerClientId   * The ID used to represent Display & Video 360 client buyer partner
     * ID (if Display & Video 360)
     *                 or Authorized Buyers client buyer account ID. This
     * field is readonly and assigned by Google.
     *                 This attribute is read-only.
     */
    public java.lang.String getPartnerClientId() {
        return partnerClientId;
    }


    /**
     * Sets the partnerClientId value for this ProposalMarketplaceInfo.
     * 
     * @param partnerClientId   * The ID used to represent Display & Video 360 client buyer partner
     * ID (if Display & Video 360)
     *                 or Authorized Buyers client buyer account ID. This
     * field is readonly and assigned by Google.
     *                 This attribute is read-only.
     */
    public void setPartnerClientId(java.lang.String partnerClientId) {
        this.partnerClientId = partnerClientId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalMarketplaceInfo)) return false;
        ProposalMarketplaceInfo other = (ProposalMarketplaceInfo) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.marketplaceId==null && other.getMarketplaceId()==null) || 
             (this.marketplaceId!=null &&
              this.marketplaceId.equals(other.getMarketplaceId()))) &&
            ((this.hasLocalVersionEdits==null && other.getHasLocalVersionEdits()==null) || 
             (this.hasLocalVersionEdits!=null &&
              this.hasLocalVersionEdits.equals(other.getHasLocalVersionEdits()))) &&
            ((this.negotiationStatus==null && other.getNegotiationStatus()==null) || 
             (this.negotiationStatus!=null &&
              this.negotiationStatus.equals(other.getNegotiationStatus()))) &&
            ((this.marketplaceComment==null && other.getMarketplaceComment()==null) || 
             (this.marketplaceComment!=null &&
              this.marketplaceComment.equals(other.getMarketplaceComment()))) &&
            ((this.isNewVersionFromBuyer==null && other.getIsNewVersionFromBuyer()==null) || 
             (this.isNewVersionFromBuyer!=null &&
              this.isNewVersionFromBuyer.equals(other.getIsNewVersionFromBuyer()))) &&
            ((this.buyerAccountId==null && other.getBuyerAccountId()==null) || 
             (this.buyerAccountId!=null &&
              this.buyerAccountId.equals(other.getBuyerAccountId()))) &&
            ((this.partnerClientId==null && other.getPartnerClientId()==null) || 
             (this.partnerClientId!=null &&
              this.partnerClientId.equals(other.getPartnerClientId())));
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
        if (getMarketplaceId() != null) {
            _hashCode += getMarketplaceId().hashCode();
        }
        if (getHasLocalVersionEdits() != null) {
            _hashCode += getHasLocalVersionEdits().hashCode();
        }
        if (getNegotiationStatus() != null) {
            _hashCode += getNegotiationStatus().hashCode();
        }
        if (getMarketplaceComment() != null) {
            _hashCode += getMarketplaceComment().hashCode();
        }
        if (getIsNewVersionFromBuyer() != null) {
            _hashCode += getIsNewVersionFromBuyer().hashCode();
        }
        if (getBuyerAccountId() != null) {
            _hashCode += getBuyerAccountId().hashCode();
        }
        if (getPartnerClientId() != null) {
            _hashCode += getPartnerClientId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalMarketplaceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ProposalMarketplaceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketplaceId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "marketplaceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasLocalVersionEdits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "hasLocalVersionEdits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negotiationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "negotiationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "NegotiationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketplaceComment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "marketplaceComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNewVersionFromBuyer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "isNewVersionFromBuyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "buyerAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerClientId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "partnerClientId"));
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
