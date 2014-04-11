/**
 * LocationGroups.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;


/**
 * Represents a criterion containing a function that when evaluated
 * specifies how to target
 *             based on the type of the location. These ???location groups???
 * are custom, dynamic bundles of
 *             locations (for instance "High income areas in California"
 * or "Airports in France").
 *             
 *             <p>Examples:</p>
 *             
 *             For income demographic targeting, we need to specify the
 * income tier and the geo
 *             which it targets. Areas in California that are in the
 * top national income tier can be
 *             represented by:
 *             <pre><code>
 *             Function function = new Function();
 *             function.setLhsOperand(Arrays.asList(
 *             (Operand) new IncomeOperand(IncomeTier.TIER_1));
 *             function.setOperator(Operator.AND);
 *             function.setRhsOperand(Arrays.asList(
 *             (Operand) new GeoTargetOperand(Lists.newArrayList(new
 * CriterionId(21137L))));
 *             </code></pre>
 *             
 *             For place of interest targeting, we need to specify the
 * place of interest category and the geo
 *             which it targets. Airports in France can be represented
 * by:
 *             <pre><code>
 *             Function function = new Function();
 *             function.setLhsOperand(Arrays.asList(
 *             (Operand) new PlacesOfInterestOperand(PlacesOfInterestOperand.Category.AIRPORT));
 * function.setOperator(Operator.AND);
 *             function.setRhsOperand(Arrays.asList(
 *             (Operand) new GeoTargetOperand(Lists.newArrayList(new
 * CriterionId(2250L))));
 *             </code></pre>
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class LocationGroups  extends com.google.api.ads.adwords.axis.v201402.cm.Criterion  implements java.io.Serializable {
    /* Matching function to filter out locations targeted by the criteria.
     * 
     *                     This allows advertisers to target based on the
     * semantics of the location.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MatchingFunction".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201402.cm.Function matchingFunction;

    public LocationGroups() {
    }

    public LocationGroups(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201402.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201402.cm.Function matchingFunction) {
        super(
            id,
            type,
            criterionType);
        this.matchingFunction = matchingFunction;
    }


    /**
     * Gets the matchingFunction value for this LocationGroups.
     * 
     * @return matchingFunction   * Matching function to filter out locations targeted by the criteria.
     * 
     *                     This allows advertisers to target based on the
     * semantics of the location.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MatchingFunction".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Function getMatchingFunction() {
        return matchingFunction;
    }


    /**
     * Sets the matchingFunction value for this LocationGroups.
     * 
     * @param matchingFunction   * Matching function to filter out locations targeted by the criteria.
     * 
     *                     This allows advertisers to target based on the
     * semantics of the location.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MatchingFunction".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMatchingFunction(com.google.api.ads.adwords.axis.v201402.cm.Function matchingFunction) {
        this.matchingFunction = matchingFunction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationGroups)) return false;
        LocationGroups other = (LocationGroups) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.matchingFunction==null && other.getMatchingFunction()==null) || 
             (this.matchingFunction!=null &&
              this.matchingFunction.equals(other.getMatchingFunction())));
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
        if (getMatchingFunction() != null) {
            _hashCode += getMatchingFunction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationGroups.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "LocationGroups"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "matchingFunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Function"));
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
