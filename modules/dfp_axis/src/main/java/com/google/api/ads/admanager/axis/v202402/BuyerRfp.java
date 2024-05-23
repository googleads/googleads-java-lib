// Copyright 2024 Google LLC
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
 * BuyerRfp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;


/**
 * Represents the buyer RFP information associated with a {@link Proposal}
 * describing the
 *             requirements from the buyer.
 */
public class BuyerRfp  implements java.io.Serializable {
    /* CPM for the {@link Proposal} in question. Given that this field
     * belongs to a request for
     *                 proposal (for which initially a {@link Proposal} does
     * not yet exist), this field should serve
     *                 as guidance for publishers to create a {@link Proposal}
     * with {@link LineItem}s reflecting this
     *                 CPM.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.Money costPerUnit;

    /* The number of impressions per day that a buyer wishes to see
     * in the {@link Proposal} derived
     *                 from the request for proposal in question.
     *                 This attribute is read-only. */
    private java.lang.Long units;

    /* Total amount of {@link Money} available to spend on this deal.
     * In the case of Preferred Deal,
     *                 the budget is equal to the maximum amount of money
     * a buyer is willing to spend on a given
     *                 {@link Proposal}, even though the budget might not
     * be spent entirely, as impressions are not
     *                 guaranteed.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.Money budget;

    /* Currency code for this deal's budget and CPM.
     *                 This attribute is read-only. */
    private java.lang.String currencyCode;

    /* The {@link DateTime} in which the proposed deal should start
     * serving.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.DateTime startDateTime;

    /* The {@link DateTime} in which the proposed deal should end
     * serving.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.DateTime endDateTime;

    /* A description of the proposed deal. This can be used for the
     * buyer to tell the publisher more
     *                 detailed information about the deal in question.
     *                 This attribute is read-only. */
    private java.lang.String description;

    /* A list of inventory sizes in which creatives will be eventually
     * served.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.CreativePlaceholder[] creativePlaceholders;

    /* Targeting information for the proposal in question. Currently
     * this field only contains {@link
     *                 GeoTargeting} information.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.Targeting targeting;

    /* Additional terms of the deal in question. This field can be
     * used to state more specific
     *                 targeting information for the deal, as well as any
     * additional information regarding this deal.
     *                 Given that this field belongs to a request for proposal
     * (for which initially a {@link Proposal}
     *                 does not yet exist), this field can be populated by
     * buyers to specify additional information
     *                 that they wish publishers to incorporate into the
     * {@link Proposal} derived from this request
     *                 for proposal.
     *                 This attribute is read-only. */
    private java.lang.String additionalTerms;

    /* Identifies the format of the inventory or "channel" through
     * which the ad serves. Environments
     *                 currently supported include {@link AdExchangeEnvironment#DISPLAY},
     * {@link
     *                 AdExchangeEnvironment#VIDEO}, and {@link AdExchangeEnvironment#MOBILE}.
     * This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.AdExchangeEnvironment adExchangeEnvironment;

    /* Deal type; either Programmatic Guaranteed or Preferred Deal.
     * This field corresponds to the type
     *                 of {@link Proposal} that a buyer wishes to negotiate
     * with a seller.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202402.RfpType rfpType;

    public BuyerRfp() {
    }

    public BuyerRfp(
           com.google.api.ads.admanager.axis.v202402.Money costPerUnit,
           java.lang.Long units,
           com.google.api.ads.admanager.axis.v202402.Money budget,
           java.lang.String currencyCode,
           com.google.api.ads.admanager.axis.v202402.DateTime startDateTime,
           com.google.api.ads.admanager.axis.v202402.DateTime endDateTime,
           java.lang.String description,
           com.google.api.ads.admanager.axis.v202402.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.admanager.axis.v202402.Targeting targeting,
           java.lang.String additionalTerms,
           com.google.api.ads.admanager.axis.v202402.AdExchangeEnvironment adExchangeEnvironment,
           com.google.api.ads.admanager.axis.v202402.RfpType rfpType) {
           this.costPerUnit = costPerUnit;
           this.units = units;
           this.budget = budget;
           this.currencyCode = currencyCode;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.description = description;
           this.creativePlaceholders = creativePlaceholders;
           this.targeting = targeting;
           this.additionalTerms = additionalTerms;
           this.adExchangeEnvironment = adExchangeEnvironment;
           this.rfpType = rfpType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adExchangeEnvironment", getAdExchangeEnvironment())
            .add("additionalTerms", getAdditionalTerms())
            .add("budget", getBudget())
            .add("costPerUnit", getCostPerUnit())
            .add("creativePlaceholders", getCreativePlaceholders())
            .add("currencyCode", getCurrencyCode())
            .add("description", getDescription())
            .add("endDateTime", getEndDateTime())
            .add("rfpType", getRfpType())
            .add("startDateTime", getStartDateTime())
            .add("targeting", getTargeting())
            .add("units", getUnits())
            .toString();
    }

    /**
     * Gets the costPerUnit value for this BuyerRfp.
     * 
     * @return costPerUnit   * CPM for the {@link Proposal} in question. Given that this field
     * belongs to a request for
     *                 proposal (for which initially a {@link Proposal} does
     * not yet exist), this field should serve
     *                 as guidance for publishers to create a {@link Proposal}
     * with {@link LineItem}s reflecting this
     *                 CPM.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.Money getCostPerUnit() {
        return costPerUnit;
    }


    /**
     * Sets the costPerUnit value for this BuyerRfp.
     * 
     * @param costPerUnit   * CPM for the {@link Proposal} in question. Given that this field
     * belongs to a request for
     *                 proposal (for which initially a {@link Proposal} does
     * not yet exist), this field should serve
     *                 as guidance for publishers to create a {@link Proposal}
     * with {@link LineItem}s reflecting this
     *                 CPM.
     *                 This attribute is read-only.
     */
    public void setCostPerUnit(com.google.api.ads.admanager.axis.v202402.Money costPerUnit) {
        this.costPerUnit = costPerUnit;
    }


    /**
     * Gets the units value for this BuyerRfp.
     * 
     * @return units   * The number of impressions per day that a buyer wishes to see
     * in the {@link Proposal} derived
     *                 from the request for proposal in question.
     *                 This attribute is read-only.
     */
    public java.lang.Long getUnits() {
        return units;
    }


    /**
     * Sets the units value for this BuyerRfp.
     * 
     * @param units   * The number of impressions per day that a buyer wishes to see
     * in the {@link Proposal} derived
     *                 from the request for proposal in question.
     *                 This attribute is read-only.
     */
    public void setUnits(java.lang.Long units) {
        this.units = units;
    }


    /**
     * Gets the budget value for this BuyerRfp.
     * 
     * @return budget   * Total amount of {@link Money} available to spend on this deal.
     * In the case of Preferred Deal,
     *                 the budget is equal to the maximum amount of money
     * a buyer is willing to spend on a given
     *                 {@link Proposal}, even though the budget might not
     * be spent entirely, as impressions are not
     *                 guaranteed.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this BuyerRfp.
     * 
     * @param budget   * Total amount of {@link Money} available to spend on this deal.
     * In the case of Preferred Deal,
     *                 the budget is equal to the maximum amount of money
     * a buyer is willing to spend on a given
     *                 {@link Proposal}, even though the budget might not
     * be spent entirely, as impressions are not
     *                 guaranteed.
     *                 This attribute is read-only.
     */
    public void setBudget(com.google.api.ads.admanager.axis.v202402.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the currencyCode value for this BuyerRfp.
     * 
     * @return currencyCode   * Currency code for this deal's budget and CPM.
     *                 This attribute is read-only.
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this BuyerRfp.
     * 
     * @param currencyCode   * Currency code for this deal's budget and CPM.
     *                 This attribute is read-only.
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the startDateTime value for this BuyerRfp.
     * 
     * @return startDateTime   * The {@link DateTime} in which the proposed deal should start
     * serving.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this BuyerRfp.
     * 
     * @param startDateTime   * The {@link DateTime} in which the proposed deal should start
     * serving.
     *                 This attribute is read-only.
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202402.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this BuyerRfp.
     * 
     * @return endDateTime   * The {@link DateTime} in which the proposed deal should end
     * serving.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this BuyerRfp.
     * 
     * @param endDateTime   * The {@link DateTime} in which the proposed deal should end
     * serving.
     *                 This attribute is read-only.
     */
    public void setEndDateTime(com.google.api.ads.admanager.axis.v202402.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the description value for this BuyerRfp.
     * 
     * @return description   * A description of the proposed deal. This can be used for the
     * buyer to tell the publisher more
     *                 detailed information about the deal in question.
     *                 This attribute is read-only.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BuyerRfp.
     * 
     * @param description   * A description of the proposed deal. This can be used for the
     * buyer to tell the publisher more
     *                 detailed information about the deal in question.
     *                 This attribute is read-only.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the creativePlaceholders value for this BuyerRfp.
     * 
     * @return creativePlaceholders   * A list of inventory sizes in which creatives will be eventually
     * served.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.CreativePlaceholder[] getCreativePlaceholders() {
        return creativePlaceholders;
    }


    /**
     * Sets the creativePlaceholders value for this BuyerRfp.
     * 
     * @param creativePlaceholders   * A list of inventory sizes in which creatives will be eventually
     * served.
     *                 This attribute is read-only.
     */
    public void setCreativePlaceholders(com.google.api.ads.admanager.axis.v202402.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.admanager.axis.v202402.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.admanager.axis.v202402.CreativePlaceholder _value) {
        this.creativePlaceholders[i] = _value;
    }


    /**
     * Gets the targeting value for this BuyerRfp.
     * 
     * @return targeting   * Targeting information for the proposal in question. Currently
     * this field only contains {@link
     *                 GeoTargeting} information.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this BuyerRfp.
     * 
     * @param targeting   * Targeting information for the proposal in question. Currently
     * this field only contains {@link
     *                 GeoTargeting} information.
     *                 This attribute is read-only.
     */
    public void setTargeting(com.google.api.ads.admanager.axis.v202402.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the additionalTerms value for this BuyerRfp.
     * 
     * @return additionalTerms   * Additional terms of the deal in question. This field can be
     * used to state more specific
     *                 targeting information for the deal, as well as any
     * additional information regarding this deal.
     *                 Given that this field belongs to a request for proposal
     * (for which initially a {@link Proposal}
     *                 does not yet exist), this field can be populated by
     * buyers to specify additional information
     *                 that they wish publishers to incorporate into the
     * {@link Proposal} derived from this request
     *                 for proposal.
     *                 This attribute is read-only.
     */
    public java.lang.String getAdditionalTerms() {
        return additionalTerms;
    }


    /**
     * Sets the additionalTerms value for this BuyerRfp.
     * 
     * @param additionalTerms   * Additional terms of the deal in question. This field can be
     * used to state more specific
     *                 targeting information for the deal, as well as any
     * additional information regarding this deal.
     *                 Given that this field belongs to a request for proposal
     * (for which initially a {@link Proposal}
     *                 does not yet exist), this field can be populated by
     * buyers to specify additional information
     *                 that they wish publishers to incorporate into the
     * {@link Proposal} derived from this request
     *                 for proposal.
     *                 This attribute is read-only.
     */
    public void setAdditionalTerms(java.lang.String additionalTerms) {
        this.additionalTerms = additionalTerms;
    }


    /**
     * Gets the adExchangeEnvironment value for this BuyerRfp.
     * 
     * @return adExchangeEnvironment   * Identifies the format of the inventory or "channel" through
     * which the ad serves. Environments
     *                 currently supported include {@link AdExchangeEnvironment#DISPLAY},
     * {@link
     *                 AdExchangeEnvironment#VIDEO}, and {@link AdExchangeEnvironment#MOBILE}.
     * This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.AdExchangeEnvironment getAdExchangeEnvironment() {
        return adExchangeEnvironment;
    }


    /**
     * Sets the adExchangeEnvironment value for this BuyerRfp.
     * 
     * @param adExchangeEnvironment   * Identifies the format of the inventory or "channel" through
     * which the ad serves. Environments
     *                 currently supported include {@link AdExchangeEnvironment#DISPLAY},
     * {@link
     *                 AdExchangeEnvironment#VIDEO}, and {@link AdExchangeEnvironment#MOBILE}.
     * This attribute is read-only.
     */
    public void setAdExchangeEnvironment(com.google.api.ads.admanager.axis.v202402.AdExchangeEnvironment adExchangeEnvironment) {
        this.adExchangeEnvironment = adExchangeEnvironment;
    }


    /**
     * Gets the rfpType value for this BuyerRfp.
     * 
     * @return rfpType   * Deal type; either Programmatic Guaranteed or Preferred Deal.
     * This field corresponds to the type
     *                 of {@link Proposal} that a buyer wishes to negotiate
     * with a seller.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202402.RfpType getRfpType() {
        return rfpType;
    }


    /**
     * Sets the rfpType value for this BuyerRfp.
     * 
     * @param rfpType   * Deal type; either Programmatic Guaranteed or Preferred Deal.
     * This field corresponds to the type
     *                 of {@link Proposal} that a buyer wishes to negotiate
     * with a seller.
     *                 This attribute is read-only.
     */
    public void setRfpType(com.google.api.ads.admanager.axis.v202402.RfpType rfpType) {
        this.rfpType = rfpType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuyerRfp)) return false;
        BuyerRfp other = (BuyerRfp) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.costPerUnit==null && other.getCostPerUnit()==null) || 
             (this.costPerUnit!=null &&
              this.costPerUnit.equals(other.getCostPerUnit()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.creativePlaceholders==null && other.getCreativePlaceholders()==null) || 
             (this.creativePlaceholders!=null &&
              java.util.Arrays.equals(this.creativePlaceholders, other.getCreativePlaceholders()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.additionalTerms==null && other.getAdditionalTerms()==null) || 
             (this.additionalTerms!=null &&
              this.additionalTerms.equals(other.getAdditionalTerms()))) &&
            ((this.adExchangeEnvironment==null && other.getAdExchangeEnvironment()==null) || 
             (this.adExchangeEnvironment!=null &&
              this.adExchangeEnvironment.equals(other.getAdExchangeEnvironment()))) &&
            ((this.rfpType==null && other.getRfpType()==null) || 
             (this.rfpType!=null &&
              this.rfpType.equals(other.getRfpType())));
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
        if (getCostPerUnit() != null) {
            _hashCode += getCostPerUnit().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCreativePlaceholders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativePlaceholders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativePlaceholders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getAdditionalTerms() != null) {
            _hashCode += getAdditionalTerms().hashCode();
        }
        if (getAdExchangeEnvironment() != null) {
            _hashCode += getAdExchangeEnvironment().hashCode();
        }
        if (getRfpType() != null) {
            _hashCode += getRfpType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuyerRfp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "BuyerRfp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "costPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "additionalTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExchangeEnvironment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "adExchangeEnvironment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "AdExchangeEnvironment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "rfpType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "RfpType"));
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
