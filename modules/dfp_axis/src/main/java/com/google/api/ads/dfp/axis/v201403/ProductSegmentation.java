/**
 * ProductSegmentation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;


/**
 * Segmentations used to create products. Within a product template,
 * for each segmentation,
 *             a product will be created for the combination of all other
 * segments within other segmentations.
 *             <p>
 *             For example, a product with 3 segmentations with only
 * 1 segment for each will produce
 *             {@code 1 x 1 x 1 = 1} product.
 *             A product with 3 segmentations with 2 segments for each
 * will produce {@code 2 x 2 x 2 = 8}
 *             products.
 */
public class ProductSegmentation  implements java.io.Serializable {
    /* The geographic segmentation. Segments should be set on the
     *                 {@link GeoTargeting#targetedLocations} field.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.GeoTargeting geoSegment;

    /* The ad unit targeting segmentation. For each ad unit segment,
     * {@link AdUnitTargeting#includeDescendants} must be true.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.AdUnitTargeting[] adUnitSegments;

    /* The placement targeting segmentation.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.PlacementTargeting placementSegment;

    /* The custom targeting segmentation.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.CustomCriteria[] customTargetingSegment;

    /* The user domain segmentation. {@link UserDomainTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.UserDomainTargeting userDomainSegment;

    /* The bandwidth segmentation. {@link BandwidthGroupTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.BandwidthGroupTargeting bandwidthSegment;

    /* The browser segmentation. {@link BrowserTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.BrowserTargeting browserSegment;

    /* The browser language segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.BrowserLanguageTargeting browserLanguageSegment;

    /* The operating system segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 We only allow segment by Operating_System, not Operating_System_Version
     * (will be ignored).
     *                 
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201403.OperatingSystemTargeting operatingSystemSegment;

    public ProductSegmentation() {
    }

    public ProductSegmentation(
           com.google.api.ads.dfp.axis.v201403.GeoTargeting geoSegment,
           com.google.api.ads.dfp.axis.v201403.AdUnitTargeting[] adUnitSegments,
           com.google.api.ads.dfp.axis.v201403.PlacementTargeting placementSegment,
           com.google.api.ads.dfp.axis.v201403.CustomCriteria[] customTargetingSegment,
           com.google.api.ads.dfp.axis.v201403.UserDomainTargeting userDomainSegment,
           com.google.api.ads.dfp.axis.v201403.BandwidthGroupTargeting bandwidthSegment,
           com.google.api.ads.dfp.axis.v201403.BrowserTargeting browserSegment,
           com.google.api.ads.dfp.axis.v201403.BrowserLanguageTargeting browserLanguageSegment,
           com.google.api.ads.dfp.axis.v201403.OperatingSystemTargeting operatingSystemSegment) {
           this.geoSegment = geoSegment;
           this.adUnitSegments = adUnitSegments;
           this.placementSegment = placementSegment;
           this.customTargetingSegment = customTargetingSegment;
           this.userDomainSegment = userDomainSegment;
           this.bandwidthSegment = bandwidthSegment;
           this.browserSegment = browserSegment;
           this.browserLanguageSegment = browserLanguageSegment;
           this.operatingSystemSegment = operatingSystemSegment;
    }


    /**
     * Gets the geoSegment value for this ProductSegmentation.
     * 
     * @return geoSegment   * The geographic segmentation. Segments should be set on the
     *                 {@link GeoTargeting#targetedLocations} field.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.GeoTargeting getGeoSegment() {
        return geoSegment;
    }


    /**
     * Sets the geoSegment value for this ProductSegmentation.
     * 
     * @param geoSegment   * The geographic segmentation. Segments should be set on the
     *                 {@link GeoTargeting#targetedLocations} field.
     *                 
     *                 This attribute is optional.
     */
    public void setGeoSegment(com.google.api.ads.dfp.axis.v201403.GeoTargeting geoSegment) {
        this.geoSegment = geoSegment;
    }


    /**
     * Gets the adUnitSegments value for this ProductSegmentation.
     * 
     * @return adUnitSegments   * The ad unit targeting segmentation. For each ad unit segment,
     * {@link AdUnitTargeting#includeDescendants} must be true.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.AdUnitTargeting[] getAdUnitSegments() {
        return adUnitSegments;
    }


    /**
     * Sets the adUnitSegments value for this ProductSegmentation.
     * 
     * @param adUnitSegments   * The ad unit targeting segmentation. For each ad unit segment,
     * {@link AdUnitTargeting#includeDescendants} must be true.
     *                 
     *                 This attribute is optional.
     */
    public void setAdUnitSegments(com.google.api.ads.dfp.axis.v201403.AdUnitTargeting[] adUnitSegments) {
        this.adUnitSegments = adUnitSegments;
    }

    public com.google.api.ads.dfp.axis.v201403.AdUnitTargeting getAdUnitSegments(int i) {
        return this.adUnitSegments[i];
    }

    public void setAdUnitSegments(int i, com.google.api.ads.dfp.axis.v201403.AdUnitTargeting _value) {
        this.adUnitSegments[i] = _value;
    }


    /**
     * Gets the placementSegment value for this ProductSegmentation.
     * 
     * @return placementSegment   * The placement targeting segmentation.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.PlacementTargeting getPlacementSegment() {
        return placementSegment;
    }


    /**
     * Sets the placementSegment value for this ProductSegmentation.
     * 
     * @param placementSegment   * The placement targeting segmentation.
     *                 
     *                 This attribute is optional.
     */
    public void setPlacementSegment(com.google.api.ads.dfp.axis.v201403.PlacementTargeting placementSegment) {
        this.placementSegment = placementSegment;
    }


    /**
     * Gets the customTargetingSegment value for this ProductSegmentation.
     * 
     * @return customTargetingSegment   * The custom targeting segmentation.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.CustomCriteria[] getCustomTargetingSegment() {
        return customTargetingSegment;
    }


    /**
     * Sets the customTargetingSegment value for this ProductSegmentation.
     * 
     * @param customTargetingSegment   * The custom targeting segmentation.
     *                 
     *                 This attribute is optional.
     */
    public void setCustomTargetingSegment(com.google.api.ads.dfp.axis.v201403.CustomCriteria[] customTargetingSegment) {
        this.customTargetingSegment = customTargetingSegment;
    }

    public com.google.api.ads.dfp.axis.v201403.CustomCriteria getCustomTargetingSegment(int i) {
        return this.customTargetingSegment[i];
    }

    public void setCustomTargetingSegment(int i, com.google.api.ads.dfp.axis.v201403.CustomCriteria _value) {
        this.customTargetingSegment[i] = _value;
    }


    /**
     * Gets the userDomainSegment value for this ProductSegmentation.
     * 
     * @return userDomainSegment   * The user domain segmentation. {@link UserDomainTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.UserDomainTargeting getUserDomainSegment() {
        return userDomainSegment;
    }


    /**
     * Sets the userDomainSegment value for this ProductSegmentation.
     * 
     * @param userDomainSegment   * The user domain segmentation. {@link UserDomainTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional.
     */
    public void setUserDomainSegment(com.google.api.ads.dfp.axis.v201403.UserDomainTargeting userDomainSegment) {
        this.userDomainSegment = userDomainSegment;
    }


    /**
     * Gets the bandwidthSegment value for this ProductSegmentation.
     * 
     * @return bandwidthSegment   * The bandwidth segmentation. {@link BandwidthGroupTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.BandwidthGroupTargeting getBandwidthSegment() {
        return bandwidthSegment;
    }


    /**
     * Sets the bandwidthSegment value for this ProductSegmentation.
     * 
     * @param bandwidthSegment   * The bandwidth segmentation. {@link BandwidthGroupTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional.
     */
    public void setBandwidthSegment(com.google.api.ads.dfp.axis.v201403.BandwidthGroupTargeting bandwidthSegment) {
        this.bandwidthSegment = bandwidthSegment;
    }


    /**
     * Gets the browserSegment value for this ProductSegmentation.
     * 
     * @return browserSegment   * The browser segmentation. {@link BrowserTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.BrowserTargeting getBrowserSegment() {
        return browserSegment;
    }


    /**
     * Sets the browserSegment value for this ProductSegmentation.
     * 
     * @param browserSegment   * The browser segmentation. {@link BrowserTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional.
     */
    public void setBrowserSegment(com.google.api.ads.dfp.axis.v201403.BrowserTargeting browserSegment) {
        this.browserSegment = browserSegment;
    }


    /**
     * Gets the browserLanguageSegment value for this ProductSegmentation.
     * 
     * @return browserLanguageSegment   * The browser language segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.BrowserLanguageTargeting getBrowserLanguageSegment() {
        return browserLanguageSegment;
    }


    /**
     * Sets the browserLanguageSegment value for this ProductSegmentation.
     * 
     * @param browserLanguageSegment   * The browser language segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 
     *                 This attribute is optional.
     */
    public void setBrowserLanguageSegment(com.google.api.ads.dfp.axis.v201403.BrowserLanguageTargeting browserLanguageSegment) {
        this.browserLanguageSegment = browserLanguageSegment;
    }


    /**
     * Gets the operatingSystemSegment value for this ProductSegmentation.
     * 
     * @return operatingSystemSegment   * The operating system segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 We only allow segment by Operating_System, not Operating_System_Version
     * (will be ignored).
     *                 
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201403.OperatingSystemTargeting getOperatingSystemSegment() {
        return operatingSystemSegment;
    }


    /**
     * Sets the operatingSystemSegment value for this ProductSegmentation.
     * 
     * @param operatingSystemSegment   * The operating system segmentation. {@link BrowserLanguageTargeting#isTargeted}
     * must be {@code true}.
     *                 We only allow segment by Operating_System, not Operating_System_Version
     * (will be ignored).
     *                 
     *                 This attribute is optional.
     */
    public void setOperatingSystemSegment(com.google.api.ads.dfp.axis.v201403.OperatingSystemTargeting operatingSystemSegment) {
        this.operatingSystemSegment = operatingSystemSegment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSegmentation)) return false;
        ProductSegmentation other = (ProductSegmentation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoSegment==null && other.getGeoSegment()==null) || 
             (this.geoSegment!=null &&
              this.geoSegment.equals(other.getGeoSegment()))) &&
            ((this.adUnitSegments==null && other.getAdUnitSegments()==null) || 
             (this.adUnitSegments!=null &&
              java.util.Arrays.equals(this.adUnitSegments, other.getAdUnitSegments()))) &&
            ((this.placementSegment==null && other.getPlacementSegment()==null) || 
             (this.placementSegment!=null &&
              this.placementSegment.equals(other.getPlacementSegment()))) &&
            ((this.customTargetingSegment==null && other.getCustomTargetingSegment()==null) || 
             (this.customTargetingSegment!=null &&
              java.util.Arrays.equals(this.customTargetingSegment, other.getCustomTargetingSegment()))) &&
            ((this.userDomainSegment==null && other.getUserDomainSegment()==null) || 
             (this.userDomainSegment!=null &&
              this.userDomainSegment.equals(other.getUserDomainSegment()))) &&
            ((this.bandwidthSegment==null && other.getBandwidthSegment()==null) || 
             (this.bandwidthSegment!=null &&
              this.bandwidthSegment.equals(other.getBandwidthSegment()))) &&
            ((this.browserSegment==null && other.getBrowserSegment()==null) || 
             (this.browserSegment!=null &&
              this.browserSegment.equals(other.getBrowserSegment()))) &&
            ((this.browserLanguageSegment==null && other.getBrowserLanguageSegment()==null) || 
             (this.browserLanguageSegment!=null &&
              this.browserLanguageSegment.equals(other.getBrowserLanguageSegment()))) &&
            ((this.operatingSystemSegment==null && other.getOperatingSystemSegment()==null) || 
             (this.operatingSystemSegment!=null &&
              this.operatingSystemSegment.equals(other.getOperatingSystemSegment())));
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
        if (getGeoSegment() != null) {
            _hashCode += getGeoSegment().hashCode();
        }
        if (getAdUnitSegments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdUnitSegments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdUnitSegments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlacementSegment() != null) {
            _hashCode += getPlacementSegment().hashCode();
        }
        if (getCustomTargetingSegment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomTargetingSegment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomTargetingSegment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDomainSegment() != null) {
            _hashCode += getUserDomainSegment().hashCode();
        }
        if (getBandwidthSegment() != null) {
            _hashCode += getBandwidthSegment().hashCode();
        }
        if (getBrowserSegment() != null) {
            _hashCode += getBrowserSegment().hashCode();
        }
        if (getBrowserLanguageSegment() != null) {
            _hashCode += getBrowserLanguageSegment().hashCode();
        }
        if (getOperatingSystemSegment() != null) {
            _hashCode += getOperatingSystemSegment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductSegmentation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ProductSegmentation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "geoSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "GeoTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitSegments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "adUnitSegments"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "AdUnitTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "placementSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "PlacementTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "customTargetingSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "CustomCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDomainSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "userDomainSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "UserDomainTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "bandwidthSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "BandwidthGroupTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "browserSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "BrowserTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserLanguageSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "browserLanguageSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "BrowserLanguageTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystemSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "operatingSystemSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "OperatingSystemTargeting"));
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
