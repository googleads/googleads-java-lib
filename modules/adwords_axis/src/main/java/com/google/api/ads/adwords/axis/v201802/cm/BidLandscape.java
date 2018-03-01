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
 * BidLandscape.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents data about a bid landscape for an ad group or criterion.
 */
public abstract class BidLandscape  extends com.google.api.ads.adwords.axis.v201802.cm.DataEntry  implements java.io.Serializable {
    /* ID of the campaign that contains the criterion with which this
     * bid
     *                     landscape is associated.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long campaignId;

    /* ID of the ad group that contains the criterion with which this
     * bid
     *                     landscape is associated.
     *                     Only available for ad group bid landscapes and
     * ad group criterion bid landscapes.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long adGroupId;

    /* First day on which this landscape is based. Typically, it could
     * be
     *                     up to a week ago.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "StartDate".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String startDate;

    /* Last day on which this landscape is based.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EndDate".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private java.lang.String endDate;

    /* List of landscape points, each corresponding to a specifid
     * bid amount. */
    private com.google.api.ads.adwords.axis.v201802.cm.BidLandscapeLandscapePoint[] landscapePoints;

    public BidLandscape() {
    }

    public BidLandscape(
           java.lang.String dataEntryType,
           java.lang.Long campaignId,
           java.lang.Long adGroupId,
           java.lang.String startDate,
           java.lang.String endDate,
           com.google.api.ads.adwords.axis.v201802.cm.BidLandscapeLandscapePoint[] landscapePoints) {
        super(
            dataEntryType);
        this.campaignId = campaignId;
        this.adGroupId = adGroupId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.landscapePoints = landscapePoints;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adGroupId", getAdGroupId())
            .add("campaignId", getCampaignId())
            .add("dataEntryType", getDataEntryType())
            .add("endDate", getEndDate())
            .add("landscapePoints", getLandscapePoints())
            .add("startDate", getStartDate())
            .toString();
    }

    /**
     * Gets the campaignId value for this BidLandscape.
     * 
     * @return campaignId   * ID of the campaign that contains the criterion with which this
     * bid
     *                     landscape is associated.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this BidLandscape.
     * 
     * @param campaignId   * ID of the campaign that contains the criterion with which this
     * bid
     *                     landscape is associated.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "CampaignId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the adGroupId value for this BidLandscape.
     * 
     * @return adGroupId   * ID of the ad group that contains the criterion with which this
     * bid
     *                     landscape is associated.
     *                     Only available for ad group bid landscapes and
     * ad group criterion bid landscapes.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this BidLandscape.
     * 
     * @param adGroupId   * ID of the ad group that contains the criterion with which this
     * bid
     *                     landscape is associated.
     *                     Only available for ad group bid landscapes and
     * ad group criterion bid landscapes.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the startDate value for this BidLandscape.
     * 
     * @return startDate   * First day on which this landscape is based. Typically, it could
     * be
     *                     up to a week ago.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "StartDate".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this BidLandscape.
     * 
     * @param startDate   * First day on which this landscape is based. Typically, it could
     * be
     *                     up to a week ago.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "StartDate".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this BidLandscape.
     * 
     * @return endDate   * Last day on which this landscape is based.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EndDate".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this BidLandscape.
     * 
     * @param endDate   * Last day on which this landscape is based.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "EndDate".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the landscapePoints value for this BidLandscape.
     * 
     * @return landscapePoints   * List of landscape points, each corresponding to a specifid
     * bid amount.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.BidLandscapeLandscapePoint[] getLandscapePoints() {
        return landscapePoints;
    }


    /**
     * Sets the landscapePoints value for this BidLandscape.
     * 
     * @param landscapePoints   * List of landscape points, each corresponding to a specifid
     * bid amount.
     */
    public void setLandscapePoints(com.google.api.ads.adwords.axis.v201802.cm.BidLandscapeLandscapePoint[] landscapePoints) {
        this.landscapePoints = landscapePoints;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.BidLandscapeLandscapePoint getLandscapePoints(int i) {
        return this.landscapePoints[i];
    }

    public void setLandscapePoints(int i, com.google.api.ads.adwords.axis.v201802.cm.BidLandscapeLandscapePoint _value) {
        this.landscapePoints[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BidLandscape)) return false;
        BidLandscape other = (BidLandscape) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.landscapePoints==null && other.getLandscapePoints()==null) || 
             (this.landscapePoints!=null &&
              java.util.Arrays.equals(this.landscapePoints, other.getLandscapePoints())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getLandscapePoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandscapePoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandscapePoints(), i);
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
        new org.apache.axis.description.TypeDesc(BidLandscape.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BidLandscape"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landscapePoints");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "landscapePoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BidLandscape.LandscapePoint"));
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
