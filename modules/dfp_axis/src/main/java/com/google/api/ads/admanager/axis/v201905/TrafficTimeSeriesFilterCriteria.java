// Copyright 2019 Google LLC
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
 * TrafficTimeSeriesFilterCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201905;


/**
 * Represents the filter criteria that defines the slice of inventory
 * for the associated {@link
 *             TrafficTimeSeries}.
 */
public class TrafficTimeSeriesFilterCriteria  implements java.io.Serializable {
    /* Specifies the targeting of the traffic time series. Only ad
     * unit, placement, country, and video
     *                 content are supported at this time.
     *                 
     *                 <p>For ad unit and placement, use {@link InventoryTargeting}/
     * All targeted ad units must have
     *                 {@link AdUnitTargeting#includeDescendants} set to
     * {@code true}.
     *                 
     *                 <p>For country, use {@link GeoTargeting}. {@link Location#type}
     * must be set to {@code COUNTRY}
     *                 and other location types such as city, state, and
     * county are not supported.
     *                 
     *                 <p>For video content, use {@link ContentTargeting}.
     * {@link ContentTargeting#targetedContentIds}
     *                 is the only field supported.
     *                 
     *                 <p>Exclusion targetings are not supported for any
     * of the fields above. */
    private com.google.api.ads.admanager.axis.v201905.Targeting targeting;

    /* A set of requested ad sizes that are included in the time series. */
    private com.google.api.ads.admanager.axis.v201905.AdUnitSize[] adUnitSizes;

    public TrafficTimeSeriesFilterCriteria() {
    }

    public TrafficTimeSeriesFilterCriteria(
           com.google.api.ads.admanager.axis.v201905.Targeting targeting,
           com.google.api.ads.admanager.axis.v201905.AdUnitSize[] adUnitSizes) {
           this.targeting = targeting;
           this.adUnitSizes = adUnitSizes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adUnitSizes", getAdUnitSizes())
            .add("targeting", getTargeting())
            .toString();
    }

    /**
     * Gets the targeting value for this TrafficTimeSeriesFilterCriteria.
     * 
     * @return targeting   * Specifies the targeting of the traffic time series. Only ad
     * unit, placement, country, and video
     *                 content are supported at this time.
     *                 
     *                 <p>For ad unit and placement, use {@link InventoryTargeting}/
     * All targeted ad units must have
     *                 {@link AdUnitTargeting#includeDescendants} set to
     * {@code true}.
     *                 
     *                 <p>For country, use {@link GeoTargeting}. {@link Location#type}
     * must be set to {@code COUNTRY}
     *                 and other location types such as city, state, and
     * county are not supported.
     *                 
     *                 <p>For video content, use {@link ContentTargeting}.
     * {@link ContentTargeting#targetedContentIds}
     *                 is the only field supported.
     *                 
     *                 <p>Exclusion targetings are not supported for any
     * of the fields above.
     */
    public com.google.api.ads.admanager.axis.v201905.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this TrafficTimeSeriesFilterCriteria.
     * 
     * @param targeting   * Specifies the targeting of the traffic time series. Only ad
     * unit, placement, country, and video
     *                 content are supported at this time.
     *                 
     *                 <p>For ad unit and placement, use {@link InventoryTargeting}/
     * All targeted ad units must have
     *                 {@link AdUnitTargeting#includeDescendants} set to
     * {@code true}.
     *                 
     *                 <p>For country, use {@link GeoTargeting}. {@link Location#type}
     * must be set to {@code COUNTRY}
     *                 and other location types such as city, state, and
     * county are not supported.
     *                 
     *                 <p>For video content, use {@link ContentTargeting}.
     * {@link ContentTargeting#targetedContentIds}
     *                 is the only field supported.
     *                 
     *                 <p>Exclusion targetings are not supported for any
     * of the fields above.
     */
    public void setTargeting(com.google.api.ads.admanager.axis.v201905.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the adUnitSizes value for this TrafficTimeSeriesFilterCriteria.
     * 
     * @return adUnitSizes   * A set of requested ad sizes that are included in the time series.
     */
    public com.google.api.ads.admanager.axis.v201905.AdUnitSize[] getAdUnitSizes() {
        return adUnitSizes;
    }


    /**
     * Sets the adUnitSizes value for this TrafficTimeSeriesFilterCriteria.
     * 
     * @param adUnitSizes   * A set of requested ad sizes that are included in the time series.
     */
    public void setAdUnitSizes(com.google.api.ads.admanager.axis.v201905.AdUnitSize[] adUnitSizes) {
        this.adUnitSizes = adUnitSizes;
    }

    public com.google.api.ads.admanager.axis.v201905.AdUnitSize getAdUnitSizes(int i) {
        return this.adUnitSizes[i];
    }

    public void setAdUnitSizes(int i, com.google.api.ads.admanager.axis.v201905.AdUnitSize _value) {
        this.adUnitSizes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficTimeSeriesFilterCriteria)) return false;
        TrafficTimeSeriesFilterCriteria other = (TrafficTimeSeriesFilterCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.adUnitSizes==null && other.getAdUnitSizes()==null) || 
             (this.adUnitSizes!=null &&
              java.util.Arrays.equals(this.adUnitSizes, other.getAdUnitSizes())));
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
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getAdUnitSizes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdUnitSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdUnitSizes(), i);
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
        new org.apache.axis.description.TypeDesc(TrafficTimeSeriesFilterCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "TrafficTimeSeriesFilterCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "adUnitSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201905", "AdUnitSize"));
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
