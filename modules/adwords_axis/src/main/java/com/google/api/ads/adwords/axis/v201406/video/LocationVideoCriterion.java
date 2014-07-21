/**
 * LocationVideoCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents the country criterion used for audience targeting.
 *             This criterion is immutable.
 */
public class LocationVideoCriterion  extends com.google.api.ads.adwords.axis.v201406.video.BaseCriterion  implements java.io.Serializable {
    /* Name of the location criterion. <b> Note:</b> This field is
     * filterable only in
     *                     LocationCriterionService.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String locationName;

    /* Display type of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String displayType;

    /* Indicates if the location criterion is obsolete.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean isObsolete;

    /* Ordered list of parents of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.LocationVideoCriterion[] parentLocations;

    public LocationVideoCriterion() {
    }

    public LocationVideoCriterion(
           java.lang.Long id,
           java.lang.String baseCriterionType,
           java.lang.String locationName,
           java.lang.String displayType,
           java.lang.Boolean isObsolete,
           com.google.api.ads.adwords.axis.v201406.video.LocationVideoCriterion[] parentLocations) {
        super(
            id,
            baseCriterionType);
        this.locationName = locationName;
        this.displayType = displayType;
        this.isObsolete = isObsolete;
        this.parentLocations = parentLocations;
    }


    /**
     * Gets the locationName value for this LocationVideoCriterion.
     * 
     * @return locationName   * Name of the location criterion. <b> Note:</b> This field is
     * filterable only in
     *                     LocationCriterionService.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this LocationVideoCriterion.
     * 
     * @param locationName   * Name of the location criterion. <b> Note:</b> This field is
     * filterable only in
     *                     LocationCriterionService.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setLocationName(java.lang.String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the displayType value for this LocationVideoCriterion.
     * 
     * @return displayType   * Display type of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDisplayType() {
        return displayType;
    }


    /**
     * Sets the displayType value for this LocationVideoCriterion.
     * 
     * @param displayType   * Display type of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setDisplayType(java.lang.String displayType) {
        this.displayType = displayType;
    }


    /**
     * Gets the isObsolete value for this LocationVideoCriterion.
     * 
     * @return isObsolete   * Indicates if the location criterion is obsolete.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getIsObsolete() {
        return isObsolete;
    }


    /**
     * Sets the isObsolete value for this LocationVideoCriterion.
     * 
     * @param isObsolete   * Indicates if the location criterion is obsolete.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setIsObsolete(java.lang.Boolean isObsolete) {
        this.isObsolete = isObsolete;
    }


    /**
     * Gets the parentLocations value for this LocationVideoCriterion.
     * 
     * @return parentLocations   * Ordered list of parents of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.LocationVideoCriterion[] getParentLocations() {
        return parentLocations;
    }


    /**
     * Sets the parentLocations value for this LocationVideoCriterion.
     * 
     * @param parentLocations   * Ordered list of parents of the location criterion.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setParentLocations(com.google.api.ads.adwords.axis.v201406.video.LocationVideoCriterion[] parentLocations) {
        this.parentLocations = parentLocations;
    }

    public com.google.api.ads.adwords.axis.v201406.video.LocationVideoCriterion getParentLocations(int i) {
        return this.parentLocations[i];
    }

    public void setParentLocations(int i, com.google.api.ads.adwords.axis.v201406.video.LocationVideoCriterion _value) {
        this.parentLocations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationVideoCriterion)) return false;
        LocationVideoCriterion other = (LocationVideoCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.displayType==null && other.getDisplayType()==null) || 
             (this.displayType!=null &&
              this.displayType.equals(other.getDisplayType()))) &&
            ((this.isObsolete==null && other.getIsObsolete()==null) || 
             (this.isObsolete!=null &&
              this.isObsolete.equals(other.getIsObsolete()))) &&
            ((this.parentLocations==null && other.getParentLocations()==null) || 
             (this.parentLocations!=null &&
              java.util.Arrays.equals(this.parentLocations, other.getParentLocations())));
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
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getDisplayType() != null) {
            _hashCode += getDisplayType().hashCode();
        }
        if (getIsObsolete() != null) {
            _hashCode += getIsObsolete().hashCode();
        }
        if (getParentLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentLocations(), i);
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
        new org.apache.axis.description.TypeDesc(LocationVideoCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "LocationVideoCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "locationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "displayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isObsolete");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "isObsolete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "parentLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "LocationVideoCriterion"));
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
