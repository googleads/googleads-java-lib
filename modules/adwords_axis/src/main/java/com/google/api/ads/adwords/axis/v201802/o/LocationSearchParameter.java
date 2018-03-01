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
 * LocationSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * A {@link SearchParameter} used to indicate the locations being
 * targeted.
 *             This can be used, for example, to search for {@code KEYWORD}
 * {@link IdeaType}s that are best for Japan and Los Angeles.
 *             
 *             <p>This parameter replaces the {@code CountryTargetSearchParameter}.</p>
 * 
 *             <p>See the
 *             <a href="https://developers.google.com/adwords/api/docs/appendix/geotargeting">Geographical
 * Targeting</a> page for the complete list of supported geo target types
 * for this service.</p>
 *             
 *             <p>The service allows up to 10 locations to be targeted
 * for KEYWORD requests and 50 locations
 *             for PLACEMENT requests.</p>
 *             <p>This element is supported by following {@link IdeaType}s:
 * KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s:
 * IDEAS, STATS.
 */
public class LocationSearchParameter  extends com.google.api.ads.adwords.axis.v201802.o.SearchParameter  implements java.io.Serializable {
    /* A list of {@link Location}s indicating the desired locations
     * (e.g countries) being targeted
     *                     in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Location[] locations;

    public LocationSearchParameter() {
    }

    public LocationSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201802.cm.Location[] locations) {
        super(
            searchParameterType);
        this.locations = locations;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("locations", getLocations())
            .add("searchParameterType", getSearchParameterType())
            .toString();
    }

    /**
     * Gets the locations value for this LocationSearchParameter.
     * 
     * @return locations   * A list of {@link Location}s indicating the desired locations
     * (e.g countries) being targeted
     *                     in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Location[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this LocationSearchParameter.
     * 
     * @param locations   * A list of {@link Location}s indicating the desired locations
     * (e.g countries) being targeted
     *                     in the results.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setLocations(com.google.api.ads.adwords.axis.v201802.cm.Location[] locations) {
        this.locations = locations;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.Location getLocations(int i) {
        return this.locations[i];
    }

    public void setLocations(int i, com.google.api.ads.adwords.axis.v201802.cm.Location _value) {
        this.locations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationSearchParameter)) return false;
        LocationSearchParameter other = (LocationSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations())));
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
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocations(), i);
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
        new org.apache.axis.description.TypeDesc(LocationSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "LocationSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Location"));
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
