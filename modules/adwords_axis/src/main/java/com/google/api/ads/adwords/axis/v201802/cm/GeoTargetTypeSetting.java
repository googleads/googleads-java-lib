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
 * GeoTargetTypeSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a collection of settings related to ads geotargeting.
 * 
 *             <p>AdWords ads can be geotargeted using <b>Location of
 * Presence</b> (<b>LOP</b>),
 *             <b>Area of Interest</b> (<b>AOI</b>), or both. LOP is
 * the physical location
 *             of the user performing the search; AOI is the geographical
 * region
 *             in which the searcher is interested. For example, if a
 * user in
 *             New York City performs a search "hotels california", their
 * LOP
 *             is New York City and their AOI is California.
 *             
 *             <p>Additionally, ads can be <b>positively</b> or <b>negatively</b>
 * geotargeted.
 *             An ad that is positively geotargeted to New York City
 * only appears
 *             to users whose location is related (via AOI or LOP) to
 * New York City. An ad
 *             that is negatively geotargeted to New York City appears
 * for <i>all</i>
 *             users <i>except</i> those whose location is related to
 * New York City. Ads can
 *             only be negatively geotargeted if a positive geotargeting
 * is also supplied, and
 *             the negatively geotargeted region must be contained within
 * the positive
 *             region.
 *             
 *             <p>Geotargeting settings allow ads to be targeted in the
 * following way:
 *             <ul>
 *             <li> Positively geotargeted using solely AOI, solely LOP,
 * or either.
 *             <li> Negatively geotargeted using solely LOP, or both.
 * </ul>
 *             
 *             <p>This setting applies only to ads shown on the search
 * network, and does
 *             not affect ads shown on the Google Display Network.
 */
public class GeoTargetTypeSetting  extends com.google.api.ads.adwords.axis.v201802.cm.Setting  implements java.io.Serializable {
    /* The setting used for positive geotargeting in this particular
     * campaign.
     *                     
     *                     <p>Again, the campaign can be positively targeted
     * using solely LOP, solely
     *                     AOI, or either. Positive targeting triggers ads
     * <i>only</i> for users
     *                     whose location is related to the given locations.
     * 
     *                     <p>The default value is DONT_CARE. */
    private com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingPositiveGeoTargetType positiveGeoTargetType;

    /* The setting used for negative geotargeting in this particular
     * campaign.
     *                     
     *                     <p>Again, the campaign can be negatively targeted
     * using solely LOP or
     *                     both AOI and LOP. Negative targeting triggers
     * ads for <i>all</i> users
     *                     <i>except</i> those whose location is related
     * to the given locations.
     *                     
     *                     <p>The default value is DONT_CARE. */
    private com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingNegativeGeoTargetType negativeGeoTargetType;

    public GeoTargetTypeSetting() {
    }

    public GeoTargetTypeSetting(
           java.lang.String settingType,
           com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingPositiveGeoTargetType positiveGeoTargetType,
           com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingNegativeGeoTargetType negativeGeoTargetType) {
        super(
            settingType);
        this.positiveGeoTargetType = positiveGeoTargetType;
        this.negativeGeoTargetType = negativeGeoTargetType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("negativeGeoTargetType", getNegativeGeoTargetType())
            .add("positiveGeoTargetType", getPositiveGeoTargetType())
            .add("settingType", getSettingType())
            .toString();
    }

    /**
     * Gets the positiveGeoTargetType value for this GeoTargetTypeSetting.
     * 
     * @return positiveGeoTargetType   * The setting used for positive geotargeting in this particular
     * campaign.
     *                     
     *                     <p>Again, the campaign can be positively targeted
     * using solely LOP, solely
     *                     AOI, or either. Positive targeting triggers ads
     * <i>only</i> for users
     *                     whose location is related to the given locations.
     * 
     *                     <p>The default value is DONT_CARE.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingPositiveGeoTargetType getPositiveGeoTargetType() {
        return positiveGeoTargetType;
    }


    /**
     * Sets the positiveGeoTargetType value for this GeoTargetTypeSetting.
     * 
     * @param positiveGeoTargetType   * The setting used for positive geotargeting in this particular
     * campaign.
     *                     
     *                     <p>Again, the campaign can be positively targeted
     * using solely LOP, solely
     *                     AOI, or either. Positive targeting triggers ads
     * <i>only</i> for users
     *                     whose location is related to the given locations.
     * 
     *                     <p>The default value is DONT_CARE.
     */
    public void setPositiveGeoTargetType(com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingPositiveGeoTargetType positiveGeoTargetType) {
        this.positiveGeoTargetType = positiveGeoTargetType;
    }


    /**
     * Gets the negativeGeoTargetType value for this GeoTargetTypeSetting.
     * 
     * @return negativeGeoTargetType   * The setting used for negative geotargeting in this particular
     * campaign.
     *                     
     *                     <p>Again, the campaign can be negatively targeted
     * using solely LOP or
     *                     both AOI and LOP. Negative targeting triggers
     * ads for <i>all</i> users
     *                     <i>except</i> those whose location is related
     * to the given locations.
     *                     
     *                     <p>The default value is DONT_CARE.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingNegativeGeoTargetType getNegativeGeoTargetType() {
        return negativeGeoTargetType;
    }


    /**
     * Sets the negativeGeoTargetType value for this GeoTargetTypeSetting.
     * 
     * @param negativeGeoTargetType   * The setting used for negative geotargeting in this particular
     * campaign.
     *                     
     *                     <p>Again, the campaign can be negatively targeted
     * using solely LOP or
     *                     both AOI and LOP. Negative targeting triggers
     * ads for <i>all</i> users
     *                     <i>except</i> those whose location is related
     * to the given locations.
     *                     
     *                     <p>The default value is DONT_CARE.
     */
    public void setNegativeGeoTargetType(com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingNegativeGeoTargetType negativeGeoTargetType) {
        this.negativeGeoTargetType = negativeGeoTargetType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoTargetTypeSetting)) return false;
        GeoTargetTypeSetting other = (GeoTargetTypeSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.positiveGeoTargetType==null && other.getPositiveGeoTargetType()==null) || 
             (this.positiveGeoTargetType!=null &&
              this.positiveGeoTargetType.equals(other.getPositiveGeoTargetType()))) &&
            ((this.negativeGeoTargetType==null && other.getNegativeGeoTargetType()==null) || 
             (this.negativeGeoTargetType!=null &&
              this.negativeGeoTargetType.equals(other.getNegativeGeoTargetType())));
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
        if (getPositiveGeoTargetType() != null) {
            _hashCode += getPositiveGeoTargetType().hashCode();
        }
        if (getNegativeGeoTargetType() != null) {
            _hashCode += getNegativeGeoTargetType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoTargetTypeSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoTargetTypeSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positiveGeoTargetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "positiveGeoTargetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoTargetTypeSetting.PositiveGeoTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeGeoTargetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "negativeGeoTargetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoTargetTypeSetting.NegativeGeoTargetType"));
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
