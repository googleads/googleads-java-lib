/**
 * PlacementTypeSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.o;


/**
 * A {@link SearchParameter} for {@code PLACEMENT} {@link IdeaType}s
 * used to filter results based on the type of website, known as
 *             {@link com.google.ads.api.services.targetingideas.attributes.Type#PLACEMENT_TYPE},
 * that they appear in. For example, searches may be limited to find
 *             results that only appear within mobile websites or feeds.
 * <p>This element is supported by following {@link IdeaType}s: PLACEMENT.
 * <p>This element is supported by following {@link RequestType}s: IDEAS.
 */
public class PlacementTypeSearchParameter  extends com.google.api.ads.adwords.axis.v201402.o.SearchParameter  implements java.io.Serializable {
    /* A set of {@link PlacementType}s representing the types of sites
     * in which ideas must appear.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201402.o.SiteConstantsPlacementType[] placementTypes;

    public PlacementTypeSearchParameter() {
    }

    public PlacementTypeSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201402.o.SiteConstantsPlacementType[] placementTypes) {
        super(
            searchParameterType);
        this.placementTypes = placementTypes;
    }


    /**
     * Gets the placementTypes value for this PlacementTypeSearchParameter.
     * 
     * @return placementTypes   * A set of {@link PlacementType}s representing the types of sites
     * in which ideas must appear.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.o.SiteConstantsPlacementType[] getPlacementTypes() {
        return placementTypes;
    }


    /**
     * Sets the placementTypes value for this PlacementTypeSearchParameter.
     * 
     * @param placementTypes   * A set of {@link PlacementType}s representing the types of sites
     * in which ideas must appear.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setPlacementTypes(com.google.api.ads.adwords.axis.v201402.o.SiteConstantsPlacementType[] placementTypes) {
        this.placementTypes = placementTypes;
    }

    public com.google.api.ads.adwords.axis.v201402.o.SiteConstantsPlacementType getPlacementTypes(int i) {
        return this.placementTypes[i];
    }

    public void setPlacementTypes(int i, com.google.api.ads.adwords.axis.v201402.o.SiteConstantsPlacementType _value) {
        this.placementTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementTypeSearchParameter)) return false;
        PlacementTypeSearchParameter other = (PlacementTypeSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.placementTypes==null && other.getPlacementTypes()==null) || 
             (this.placementTypes!=null &&
              java.util.Arrays.equals(this.placementTypes, other.getPlacementTypes())));
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
        if (getPlacementTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementTypes(), i);
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
        new org.apache.axis.description.TypeDesc(PlacementTypeSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "PlacementTypeSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "placementTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201402", "SiteConstants.PlacementType"));
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
