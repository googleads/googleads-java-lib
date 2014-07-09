/**
 * AdGroupExperimentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.cm;


/**
 * Data associated with an advertiser experiment for this adgroup.
 * <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 */
public class AdGroupExperimentData  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private java.lang.Long experimentId;

    /* Status of this adgroup in the experiment. It must be specified
     * while adding
     *                 experiment data, which could come through a SET as
     * well.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.ExperimentDeltaStatus experimentDeltaStatus;

    /* Status of the experiment row. If this is set to DELETED in
     * a SET operation, the adgroup
     *                 will be removed from the experiment.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201406.cm.ExperimentDataStatus experimentDataStatus;

    /* Bid multipliers, if any. */
    private com.google.api.ads.adwords.axis.v201406.cm.AdGroupExperimentBidMultipliers experimentBidMultipliers;

    public AdGroupExperimentData() {
    }

    public AdGroupExperimentData(
           java.lang.Long experimentId,
           com.google.api.ads.adwords.axis.v201406.cm.ExperimentDeltaStatus experimentDeltaStatus,
           com.google.api.ads.adwords.axis.v201406.cm.ExperimentDataStatus experimentDataStatus,
           com.google.api.ads.adwords.axis.v201406.cm.AdGroupExperimentBidMultipliers experimentBidMultipliers) {
           this.experimentId = experimentId;
           this.experimentDeltaStatus = experimentDeltaStatus;
           this.experimentDataStatus = experimentDataStatus;
           this.experimentBidMultipliers = experimentBidMultipliers;
    }


    /**
     * Gets the experimentId value for this AdGroupExperimentData.
     * 
     * @return experimentId   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public java.lang.Long getExperimentId() {
        return experimentId;
    }


    /**
     * Sets the experimentId value for this AdGroupExperimentData.
     * 
     * @param experimentId   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setExperimentId(java.lang.Long experimentId) {
        this.experimentId = experimentId;
    }


    /**
     * Gets the experimentDeltaStatus value for this AdGroupExperimentData.
     * 
     * @return experimentDeltaStatus   * Status of this adgroup in the experiment. It must be specified
     * while adding
     *                 experiment data, which could come through a SET as
     * well.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.ExperimentDeltaStatus getExperimentDeltaStatus() {
        return experimentDeltaStatus;
    }


    /**
     * Sets the experimentDeltaStatus value for this AdGroupExperimentData.
     * 
     * @param experimentDeltaStatus   * Status of this adgroup in the experiment. It must be specified
     * while adding
     *                 experiment data, which could come through a SET as
     * well.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setExperimentDeltaStatus(com.google.api.ads.adwords.axis.v201406.cm.ExperimentDeltaStatus experimentDeltaStatus) {
        this.experimentDeltaStatus = experimentDeltaStatus;
    }


    /**
     * Gets the experimentDataStatus value for this AdGroupExperimentData.
     * 
     * @return experimentDataStatus   * Status of the experiment row. If this is set to DELETED in
     * a SET operation, the adgroup
     *                 will be removed from the experiment.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.cm.ExperimentDataStatus getExperimentDataStatus() {
        return experimentDataStatus;
    }


    /**
     * Sets the experimentDataStatus value for this AdGroupExperimentData.
     * 
     * @param experimentDataStatus   * Status of the experiment row. If this is set to DELETED in
     * a SET operation, the adgroup
     *                 will be removed from the experiment.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setExperimentDataStatus(com.google.api.ads.adwords.axis.v201406.cm.ExperimentDataStatus experimentDataStatus) {
        this.experimentDataStatus = experimentDataStatus;
    }


    /**
     * Gets the experimentBidMultipliers value for this AdGroupExperimentData.
     * 
     * @return experimentBidMultipliers   * Bid multipliers, if any.
     */
    public com.google.api.ads.adwords.axis.v201406.cm.AdGroupExperimentBidMultipliers getExperimentBidMultipliers() {
        return experimentBidMultipliers;
    }


    /**
     * Sets the experimentBidMultipliers value for this AdGroupExperimentData.
     * 
     * @param experimentBidMultipliers   * Bid multipliers, if any.
     */
    public void setExperimentBidMultipliers(com.google.api.ads.adwords.axis.v201406.cm.AdGroupExperimentBidMultipliers experimentBidMultipliers) {
        this.experimentBidMultipliers = experimentBidMultipliers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupExperimentData)) return false;
        AdGroupExperimentData other = (AdGroupExperimentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.experimentId==null && other.getExperimentId()==null) || 
             (this.experimentId!=null &&
              this.experimentId.equals(other.getExperimentId()))) &&
            ((this.experimentDeltaStatus==null && other.getExperimentDeltaStatus()==null) || 
             (this.experimentDeltaStatus!=null &&
              this.experimentDeltaStatus.equals(other.getExperimentDeltaStatus()))) &&
            ((this.experimentDataStatus==null && other.getExperimentDataStatus()==null) || 
             (this.experimentDataStatus!=null &&
              this.experimentDataStatus.equals(other.getExperimentDataStatus()))) &&
            ((this.experimentBidMultipliers==null && other.getExperimentBidMultipliers()==null) || 
             (this.experimentBidMultipliers!=null &&
              this.experimentBidMultipliers.equals(other.getExperimentBidMultipliers())));
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
        if (getExperimentId() != null) {
            _hashCode += getExperimentId().hashCode();
        }
        if (getExperimentDeltaStatus() != null) {
            _hashCode += getExperimentDeltaStatus().hashCode();
        }
        if (getExperimentDataStatus() != null) {
            _hashCode += getExperimentDataStatus().hashCode();
        }
        if (getExperimentBidMultipliers() != null) {
            _hashCode += getExperimentBidMultipliers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupExperimentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "AdGroupExperimentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "experimentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentDeltaStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "experimentDeltaStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "ExperimentDeltaStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentDataStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "experimentDataStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "ExperimentDataStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentBidMultipliers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "experimentBidMultipliers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201406", "AdGroupExperimentBidMultipliers"));
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
