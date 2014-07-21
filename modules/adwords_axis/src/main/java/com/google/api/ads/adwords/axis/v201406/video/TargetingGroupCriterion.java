/**
 * TargetingGroupCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents the association between a {@link TargetingGroup} and
 * a targeting
 *             {@link BaseCriterion}.
 */
public class TargetingGroupCriterion  implements java.io.Serializable {
    /* Id of the targeting group this criterion is for.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long targetingGroupId;

    /* Name of the targeting group this criterion is for.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String targetingGroupName;

    /* The actual criterion used for targeting.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.BaseCriterion criterion;

    /* The id of the campaign to which the current targeting group
     * criterion belongs.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long campaignId;

    /* Indicates that this instance is a subtype of TargetingGroupCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String targetingGroupCriterionType;

    public TargetingGroupCriterion() {
    }

    public TargetingGroupCriterion(
           java.lang.Long targetingGroupId,
           java.lang.String targetingGroupName,
           com.google.api.ads.adwords.axis.v201406.video.BaseCriterion criterion,
           java.lang.Long campaignId,
           java.lang.String targetingGroupCriterionType) {
           this.targetingGroupId = targetingGroupId;
           this.targetingGroupName = targetingGroupName;
           this.criterion = criterion;
           this.campaignId = campaignId;
           this.targetingGroupCriterionType = targetingGroupCriterionType;
    }


    /**
     * Gets the targetingGroupId value for this TargetingGroupCriterion.
     * 
     * @return targetingGroupId   * Id of the targeting group this criterion is for.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getTargetingGroupId() {
        return targetingGroupId;
    }


    /**
     * Sets the targetingGroupId value for this TargetingGroupCriterion.
     * 
     * @param targetingGroupId   * Id of the targeting group this criterion is for.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setTargetingGroupId(java.lang.Long targetingGroupId) {
        this.targetingGroupId = targetingGroupId;
    }


    /**
     * Gets the targetingGroupName value for this TargetingGroupCriterion.
     * 
     * @return targetingGroupName   * Name of the targeting group this criterion is for.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getTargetingGroupName() {
        return targetingGroupName;
    }


    /**
     * Sets the targetingGroupName value for this TargetingGroupCriterion.
     * 
     * @param targetingGroupName   * Name of the targeting group this criterion is for.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTargetingGroupName(java.lang.String targetingGroupName) {
        this.targetingGroupName = targetingGroupName;
    }


    /**
     * Gets the criterion value for this TargetingGroupCriterion.
     * 
     * @return criterion   * The actual criterion used for targeting.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.BaseCriterion getCriterion() {
        return criterion;
    }


    /**
     * Sets the criterion value for this TargetingGroupCriterion.
     * 
     * @param criterion   * The actual criterion used for targeting.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCriterion(com.google.api.ads.adwords.axis.v201406.video.BaseCriterion criterion) {
        this.criterion = criterion;
    }


    /**
     * Gets the campaignId value for this TargetingGroupCriterion.
     * 
     * @return campaignId   * The id of the campaign to which the current targeting group
     * criterion belongs.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this TargetingGroupCriterion.
     * 
     * @param campaignId   * The id of the campaign to which the current targeting group
     * criterion belongs.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the targetingGroupCriterionType value for this TargetingGroupCriterion.
     * 
     * @return targetingGroupCriterionType   * Indicates that this instance is a subtype of TargetingGroupCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getTargetingGroupCriterionType() {
        return targetingGroupCriterionType;
    }


    /**
     * Sets the targetingGroupCriterionType value for this TargetingGroupCriterion.
     * 
     * @param targetingGroupCriterionType   * Indicates that this instance is a subtype of TargetingGroupCriterion.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setTargetingGroupCriterionType(java.lang.String targetingGroupCriterionType) {
        this.targetingGroupCriterionType = targetingGroupCriterionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingGroupCriterion)) return false;
        TargetingGroupCriterion other = (TargetingGroupCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetingGroupId==null && other.getTargetingGroupId()==null) || 
             (this.targetingGroupId!=null &&
              this.targetingGroupId.equals(other.getTargetingGroupId()))) &&
            ((this.targetingGroupName==null && other.getTargetingGroupName()==null) || 
             (this.targetingGroupName!=null &&
              this.targetingGroupName.equals(other.getTargetingGroupName()))) &&
            ((this.criterion==null && other.getCriterion()==null) || 
             (this.criterion!=null &&
              this.criterion.equals(other.getCriterion()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.targetingGroupCriterionType==null && other.getTargetingGroupCriterionType()==null) || 
             (this.targetingGroupCriterionType!=null &&
              this.targetingGroupCriterionType.equals(other.getTargetingGroupCriterionType())));
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
        if (getTargetingGroupId() != null) {
            _hashCode += getTargetingGroupId().hashCode();
        }
        if (getTargetingGroupName() != null) {
            _hashCode += getTargetingGroupName().hashCode();
        }
        if (getCriterion() != null) {
            _hashCode += getCriterion().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getTargetingGroupCriterionType() != null) {
            _hashCode += getTargetingGroupCriterionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingGroupCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingGroupCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "targetingGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "targetingGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "criterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "BaseCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingGroupCriterionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "TargetingGroupCriterion.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
