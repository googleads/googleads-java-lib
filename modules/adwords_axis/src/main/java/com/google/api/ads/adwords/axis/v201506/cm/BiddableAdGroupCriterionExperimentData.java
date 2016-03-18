/**
 * BiddableAdGroupCriterionExperimentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * Data associated with an advertiser experiment for this {@link BiddableAdGroupCriterion}.
 */
public class BiddableAdGroupCriterionExperimentData  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private java.lang.Long experimentId;

    /* Status of this adgroup in the experiment. It must be specified
     * while adding
     *                 experiment data, which could come as a SET as well
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201506.cm.ExperimentDeltaStatus experimentDeltaStatus;

    /* Status of the experiment row
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201506.cm.ExperimentDataStatus experimentDataStatus;

    /* Bid multipliers, if any */
    private com.google.api.ads.adwords.axis.v201506.cm.AdGroupCriterionExperimentBidMultiplier experimentBidMultiplier;

    public BiddableAdGroupCriterionExperimentData() {
    }

    public BiddableAdGroupCriterionExperimentData(
           java.lang.Long experimentId,
           com.google.api.ads.adwords.axis.v201506.cm.ExperimentDeltaStatus experimentDeltaStatus,
           com.google.api.ads.adwords.axis.v201506.cm.ExperimentDataStatus experimentDataStatus,
           com.google.api.ads.adwords.axis.v201506.cm.AdGroupCriterionExperimentBidMultiplier experimentBidMultiplier) {
           this.experimentId = experimentId;
           this.experimentDeltaStatus = experimentDeltaStatus;
           this.experimentDataStatus = experimentDataStatus;
           this.experimentBidMultiplier = experimentBidMultiplier;
    }


    /**
     * Gets the experimentId value for this BiddableAdGroupCriterionExperimentData.
     * 
     * @return experimentId   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public java.lang.Long getExperimentId() {
        return experimentId;
    }


    /**
     * Sets the experimentId value for this BiddableAdGroupCriterionExperimentData.
     * 
     * @param experimentId   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setExperimentId(java.lang.Long experimentId) {
        this.experimentId = experimentId;
    }


    /**
     * Gets the experimentDeltaStatus value for this BiddableAdGroupCriterionExperimentData.
     * 
     * @return experimentDeltaStatus   * Status of this adgroup in the experiment. It must be specified
     * while adding
     *                 experiment data, which could come as a SET as well
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201506.cm.ExperimentDeltaStatus getExperimentDeltaStatus() {
        return experimentDeltaStatus;
    }


    /**
     * Sets the experimentDeltaStatus value for this BiddableAdGroupCriterionExperimentData.
     * 
     * @param experimentDeltaStatus   * Status of this adgroup in the experiment. It must be specified
     * while adding
     *                 experiment data, which could come as a SET as well
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setExperimentDeltaStatus(com.google.api.ads.adwords.axis.v201506.cm.ExperimentDeltaStatus experimentDeltaStatus) {
        this.experimentDeltaStatus = experimentDeltaStatus;
    }


    /**
     * Gets the experimentDataStatus value for this BiddableAdGroupCriterionExperimentData.
     * 
     * @return experimentDataStatus   * Status of the experiment row
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201506.cm.ExperimentDataStatus getExperimentDataStatus() {
        return experimentDataStatus;
    }


    /**
     * Sets the experimentDataStatus value for this BiddableAdGroupCriterionExperimentData.
     * 
     * @param experimentDataStatus   * Status of the experiment row
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setExperimentDataStatus(com.google.api.ads.adwords.axis.v201506.cm.ExperimentDataStatus experimentDataStatus) {
        this.experimentDataStatus = experimentDataStatus;
    }


    /**
     * Gets the experimentBidMultiplier value for this BiddableAdGroupCriterionExperimentData.
     * 
     * @return experimentBidMultiplier   * Bid multipliers, if any
     */
    public com.google.api.ads.adwords.axis.v201506.cm.AdGroupCriterionExperimentBidMultiplier getExperimentBidMultiplier() {
        return experimentBidMultiplier;
    }


    /**
     * Sets the experimentBidMultiplier value for this BiddableAdGroupCriterionExperimentData.
     * 
     * @param experimentBidMultiplier   * Bid multipliers, if any
     */
    public void setExperimentBidMultiplier(com.google.api.ads.adwords.axis.v201506.cm.AdGroupCriterionExperimentBidMultiplier experimentBidMultiplier) {
        this.experimentBidMultiplier = experimentBidMultiplier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiddableAdGroupCriterionExperimentData)) return false;
        BiddableAdGroupCriterionExperimentData other = (BiddableAdGroupCriterionExperimentData) obj;
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
            ((this.experimentBidMultiplier==null && other.getExperimentBidMultiplier()==null) || 
             (this.experimentBidMultiplier!=null &&
              this.experimentBidMultiplier.equals(other.getExperimentBidMultiplier())));
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
        if (getExperimentBidMultiplier() != null) {
            _hashCode += getExperimentBidMultiplier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BiddableAdGroupCriterionExperimentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "BiddableAdGroupCriterionExperimentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "experimentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentDeltaStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "experimentDeltaStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "ExperimentDeltaStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentDataStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "experimentDataStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "ExperimentDataStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("experimentBidMultiplier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "experimentBidMultiplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "AdGroupCriterionExperimentBidMultiplier"));
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
