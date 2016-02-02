/**
 * BiddingStrategyConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201506.cm;


/**
 * Encapsulates the information about bids and bidding strategies.
 * 
 *             <p>Bidding Strategy can be set on campaigns, ad groups
 * or ad group criteria.
 *             <p>A bidding strategy can be set using one of the following:
 * <ul>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingScheme
 * bidding scheme}</li>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingStrategyType
 * bidding strategy type}</li>
 *             <li>{@linkplain BiddingStrategyConfiguration#biddingStrategyId
 * bidding strategy ID} for
 *             flexible bid strategies.</li>
 *             </ul>
 *             <p>If the bidding strategy type is used, then schemes
 * are created using default values.
 *             
 *             <p>Bids can be set only on ad groups and ad group criteria.
 * They cannot be set on campaigns.
 *             Multiple bids can be set at the same time. Only the bids
 * that apply to the effective
 *             bidding strategy will be used. Effective bidding strategy
 * is considered to be the directly
 *             attached strategy or inherited strategy from above level(s)
 * when there is no directly attached
 *             strategy.
 *             
 *             <p>For more information on flexible bidding, visit the
 * <a href="https://support.google.com/adwords/answer/2979071">Help Center</a>.
 */
public class BiddingStrategyConfiguration  implements java.io.Serializable {
    /* Id of the bidding strategy to be associated with the campaign,
     * ad group or ad group criteria.
     *                 A bidding strategy is created using the BiddingStrategyService
     * ADD operation and is
     *                 assigned a BiddingStrategyId. The BiddingStrategyId
     * can be shared across campaigns,
     *                 ad groups and ad group criteria.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span> */
    private java.lang.Long biddingStrategyId;

    /* Name of the bidding strategy. This is applicable only for flexible
     * bidding strategies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String biddingStrategyName;

    /* The type of the bidding strategy to be attached. */
    private com.google.api.ads.adwords.axis.v201506.cm.BiddingStrategyType biddingStrategyType;

    /* Indicates where the bidding strategy is associated i.e. campaign,
     * ad group or
     *                 ad group criterion.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201506.cm.BiddingStrategySource biddingStrategySource;

    /* The bidding strategy metadata. Bidding strategy can be associated
     * using the
     *                 {@linkplain BiddingStrategyConfiguration#biddingStrategyType}
     * or the bidding scheme. */
    private com.google.api.ads.adwords.axis.v201506.cm.BiddingScheme biddingScheme;

    /* Specifies the bids. Bids can be set only on ad groups and ad
     * group criteria.
     *                 Bids cannot be set on campaign.
     *                 
     *                 Default CPC and CPM bid values will be set if they
     * are not provided during {@linkplain AdGroup}
     *                 creation. Default CPC and CPM values are minimal billable
     * amounts in local currencies.
     *                 For example, for US Dollars CPC and CPM default values
     * are $0.01 and $0.01, respectively. */
    private com.google.api.ads.adwords.axis.v201506.cm.Bids[] bids;

    public BiddingStrategyConfiguration() {
    }

    public BiddingStrategyConfiguration(
           java.lang.Long biddingStrategyId,
           java.lang.String biddingStrategyName,
           com.google.api.ads.adwords.axis.v201506.cm.BiddingStrategyType biddingStrategyType,
           com.google.api.ads.adwords.axis.v201506.cm.BiddingStrategySource biddingStrategySource,
           com.google.api.ads.adwords.axis.v201506.cm.BiddingScheme biddingScheme,
           com.google.api.ads.adwords.axis.v201506.cm.Bids[] bids) {
           this.biddingStrategyId = biddingStrategyId;
           this.biddingStrategyName = biddingStrategyName;
           this.biddingStrategyType = biddingStrategyType;
           this.biddingStrategySource = biddingStrategySource;
           this.biddingScheme = biddingScheme;
           this.bids = bids;
    }


    /**
     * Gets the biddingStrategyId value for this BiddingStrategyConfiguration.
     * 
     * @return biddingStrategyId   * Id of the bidding strategy to be associated with the campaign,
     * ad group or ad group criteria.
     *                 A bidding strategy is created using the BiddingStrategyService
     * ADD operation and is
     *                 assigned a BiddingStrategyId. The BiddingStrategyId
     * can be shared across campaigns,
     *                 ad groups and ad group criteria.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     */
    public java.lang.Long getBiddingStrategyId() {
        return biddingStrategyId;
    }


    /**
     * Sets the biddingStrategyId value for this BiddingStrategyConfiguration.
     * 
     * @param biddingStrategyId   * Id of the bidding strategy to be associated with the campaign,
     * ad group or ad group criteria.
     *                 A bidding strategy is created using the BiddingStrategyService
     * ADD operation and is
     *                 assigned a BiddingStrategyId. The BiddingStrategyId
     * can be shared across campaigns,
     *                 ad groups and ad group criteria.
     *                 <span class="constraint AdxEnabled">This is disabled
     * for AdX.</span>
     */
    public void setBiddingStrategyId(java.lang.Long biddingStrategyId) {
        this.biddingStrategyId = biddingStrategyId;
    }


    /**
     * Gets the biddingStrategyName value for this BiddingStrategyConfiguration.
     * 
     * @return biddingStrategyName   * Name of the bidding strategy. This is applicable only for flexible
     * bidding strategies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getBiddingStrategyName() {
        return biddingStrategyName;
    }


    /**
     * Sets the biddingStrategyName value for this BiddingStrategyConfiguration.
     * 
     * @param biddingStrategyName   * Name of the bidding strategy. This is applicable only for flexible
     * bidding strategies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBiddingStrategyName(java.lang.String biddingStrategyName) {
        this.biddingStrategyName = biddingStrategyName;
    }


    /**
     * Gets the biddingStrategyType value for this BiddingStrategyConfiguration.
     * 
     * @return biddingStrategyType   * The type of the bidding strategy to be attached.
     */
    public com.google.api.ads.adwords.axis.v201506.cm.BiddingStrategyType getBiddingStrategyType() {
        return biddingStrategyType;
    }


    /**
     * Sets the biddingStrategyType value for this BiddingStrategyConfiguration.
     * 
     * @param biddingStrategyType   * The type of the bidding strategy to be attached.
     */
    public void setBiddingStrategyType(com.google.api.ads.adwords.axis.v201506.cm.BiddingStrategyType biddingStrategyType) {
        this.biddingStrategyType = biddingStrategyType;
    }


    /**
     * Gets the biddingStrategySource value for this BiddingStrategyConfiguration.
     * 
     * @return biddingStrategySource   * Indicates where the bidding strategy is associated i.e. campaign,
     * ad group or
     *                 ad group criterion.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201506.cm.BiddingStrategySource getBiddingStrategySource() {
        return biddingStrategySource;
    }


    /**
     * Sets the biddingStrategySource value for this BiddingStrategyConfiguration.
     * 
     * @param biddingStrategySource   * Indicates where the bidding strategy is associated i.e. campaign,
     * ad group or
     *                 ad group criterion.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setBiddingStrategySource(com.google.api.ads.adwords.axis.v201506.cm.BiddingStrategySource biddingStrategySource) {
        this.biddingStrategySource = biddingStrategySource;
    }


    /**
     * Gets the biddingScheme value for this BiddingStrategyConfiguration.
     * 
     * @return biddingScheme   * The bidding strategy metadata. Bidding strategy can be associated
     * using the
     *                 {@linkplain BiddingStrategyConfiguration#biddingStrategyType}
     * or the bidding scheme.
     */
    public com.google.api.ads.adwords.axis.v201506.cm.BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }


    /**
     * Sets the biddingScheme value for this BiddingStrategyConfiguration.
     * 
     * @param biddingScheme   * The bidding strategy metadata. Bidding strategy can be associated
     * using the
     *                 {@linkplain BiddingStrategyConfiguration#biddingStrategyType}
     * or the bidding scheme.
     */
    public void setBiddingScheme(com.google.api.ads.adwords.axis.v201506.cm.BiddingScheme biddingScheme) {
        this.biddingScheme = biddingScheme;
    }


    /**
     * Gets the bids value for this BiddingStrategyConfiguration.
     * 
     * @return bids   * Specifies the bids. Bids can be set only on ad groups and ad
     * group criteria.
     *                 Bids cannot be set on campaign.
     *                 
     *                 Default CPC and CPM bid values will be set if they
     * are not provided during {@linkplain AdGroup}
     *                 creation. Default CPC and CPM values are minimal billable
     * amounts in local currencies.
     *                 For example, for US Dollars CPC and CPM default values
     * are $0.01 and $0.01, respectively.
     */
    public com.google.api.ads.adwords.axis.v201506.cm.Bids[] getBids() {
        return bids;
    }


    /**
     * Sets the bids value for this BiddingStrategyConfiguration.
     * 
     * @param bids   * Specifies the bids. Bids can be set only on ad groups and ad
     * group criteria.
     *                 Bids cannot be set on campaign.
     *                 
     *                 Default CPC and CPM bid values will be set if they
     * are not provided during {@linkplain AdGroup}
     *                 creation. Default CPC and CPM values are minimal billable
     * amounts in local currencies.
     *                 For example, for US Dollars CPC and CPM default values
     * are $0.01 and $0.01, respectively.
     */
    public void setBids(com.google.api.ads.adwords.axis.v201506.cm.Bids[] bids) {
        this.bids = bids;
    }

    public com.google.api.ads.adwords.axis.v201506.cm.Bids getBids(int i) {
        return this.bids[i];
    }

    public void setBids(int i, com.google.api.ads.adwords.axis.v201506.cm.Bids _value) {
        this.bids[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BiddingStrategyConfiguration)) return false;
        BiddingStrategyConfiguration other = (BiddingStrategyConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.biddingStrategyId==null && other.getBiddingStrategyId()==null) || 
             (this.biddingStrategyId!=null &&
              this.biddingStrategyId.equals(other.getBiddingStrategyId()))) &&
            ((this.biddingStrategyName==null && other.getBiddingStrategyName()==null) || 
             (this.biddingStrategyName!=null &&
              this.biddingStrategyName.equals(other.getBiddingStrategyName()))) &&
            ((this.biddingStrategyType==null && other.getBiddingStrategyType()==null) || 
             (this.biddingStrategyType!=null &&
              this.biddingStrategyType.equals(other.getBiddingStrategyType()))) &&
            ((this.biddingStrategySource==null && other.getBiddingStrategySource()==null) || 
             (this.biddingStrategySource!=null &&
              this.biddingStrategySource.equals(other.getBiddingStrategySource()))) &&
            ((this.biddingScheme==null && other.getBiddingScheme()==null) || 
             (this.biddingScheme!=null &&
              this.biddingScheme.equals(other.getBiddingScheme()))) &&
            ((this.bids==null && other.getBids()==null) || 
             (this.bids!=null &&
              java.util.Arrays.equals(this.bids, other.getBids())));
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
        if (getBiddingStrategyId() != null) {
            _hashCode += getBiddingStrategyId().hashCode();
        }
        if (getBiddingStrategyName() != null) {
            _hashCode += getBiddingStrategyName().hashCode();
        }
        if (getBiddingStrategyType() != null) {
            _hashCode += getBiddingStrategyType().hashCode();
        }
        if (getBiddingStrategySource() != null) {
            _hashCode += getBiddingStrategySource().hashCode();
        }
        if (getBiddingScheme() != null) {
            _hashCode += getBiddingScheme().hashCode();
        }
        if (getBids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBids(), i);
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
        new org.apache.axis.description.TypeDesc(BiddingStrategyConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "BiddingStrategyConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "biddingStrategyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "biddingStrategyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "biddingStrategyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "BiddingStrategyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingStrategySource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "biddingStrategySource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "BiddingStrategySource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("biddingScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "biddingScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "BiddingScheme"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bids");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "bids"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201506", "Bids"));
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
