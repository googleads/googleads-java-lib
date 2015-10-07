/**
 * BidLandscapeLandscapePoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.cm;


/**
 * A set of estimates for a criterion's performance for a specific
 * bid
 *             amount.
 */
public class BidLandscapeLandscapePoint  implements java.io.Serializable {
    /* The bid amount used to estimate this landscape point's data.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Bid".</span><span class="constraint Filterable">This field
     * can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201502.cm.Money bid;

    /* Estimated number of clicks at this bid. For mobile bid modifier
     * landscapes, this is the
     *                 estimated number of clicks for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalClicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long clicks;

    /* Estimated cost at this bid. For mobile bid modifier landscapes,
     * this is the estimated cost
     *                 for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalCost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201502.cm.Money cost;

    /* Estimated number of impressions at this bid. For mobile bid
     * modifier landscapes, this is the
     *                 estimated number of impressions for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long impressions;

    /* Estimated number of promoted impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long promotedImpressions;

    public BidLandscapeLandscapePoint() {
    }

    public BidLandscapeLandscapePoint(
           com.google.api.ads.adwords.axis.v201502.cm.Money bid,
           java.lang.Long clicks,
           com.google.api.ads.adwords.axis.v201502.cm.Money cost,
           java.lang.Long impressions,
           java.lang.Long promotedImpressions) {
           this.bid = bid;
           this.clicks = clicks;
           this.cost = cost;
           this.impressions = impressions;
           this.promotedImpressions = promotedImpressions;
    }


    /**
     * Gets the bid value for this BidLandscapeLandscapePoint.
     * 
     * @return bid   * The bid amount used to estimate this landscape point's data.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Bid".</span><span class="constraint Filterable">This field
     * can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201502.cm.Money getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this BidLandscapeLandscapePoint.
     * 
     * @param bid   * The bid amount used to estimate this landscape point's data.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Bid".</span><span class="constraint Filterable">This field
     * can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setBid(com.google.api.ads.adwords.axis.v201502.cm.Money bid) {
        this.bid = bid;
    }


    /**
     * Gets the clicks value for this BidLandscapeLandscapePoint.
     * 
     * @return clicks   * Estimated number of clicks at this bid. For mobile bid modifier
     * landscapes, this is the
     *                 estimated number of clicks for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalClicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getClicks() {
        return clicks;
    }


    /**
     * Sets the clicks value for this BidLandscapeLandscapePoint.
     * 
     * @param clicks   * Estimated number of clicks at this bid. For mobile bid modifier
     * landscapes, this is the
     *                 estimated number of clicks for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalClicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setClicks(java.lang.Long clicks) {
        this.clicks = clicks;
    }


    /**
     * Gets the cost value for this BidLandscapeLandscapePoint.
     * 
     * @return cost   * Estimated cost at this bid. For mobile bid modifier landscapes,
     * this is the estimated cost
     *                 for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalCost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201502.cm.Money getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this BidLandscapeLandscapePoint.
     * 
     * @param cost   * Estimated cost at this bid. For mobile bid modifier landscapes,
     * this is the estimated cost
     *                 for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalCost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCost(com.google.api.ads.adwords.axis.v201502.cm.Money cost) {
        this.cost = cost;
    }


    /**
     * Gets the impressions value for this BidLandscapeLandscapePoint.
     * 
     * @return impressions   * Estimated number of impressions at this bid. For mobile bid
     * modifier landscapes, this is the
     *                 estimated number of impressions for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this BidLandscapeLandscapePoint.
     * 
     * @param impressions   * Estimated number of impressions at this bid. For mobile bid
     * modifier landscapes, this is the
     *                 estimated number of impressions for mobile only.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LocalImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }


    /**
     * Gets the promotedImpressions value for this BidLandscapeLandscapePoint.
     * 
     * @return promotedImpressions   * Estimated number of promoted impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getPromotedImpressions() {
        return promotedImpressions;
    }


    /**
     * Sets the promotedImpressions value for this BidLandscapeLandscapePoint.
     * 
     * @param promotedImpressions   * Estimated number of promoted impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotedImpressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setPromotedImpressions(java.lang.Long promotedImpressions) {
        this.promotedImpressions = promotedImpressions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BidLandscapeLandscapePoint)) return false;
        BidLandscapeLandscapePoint other = (BidLandscapeLandscapePoint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bid==null && other.getBid()==null) || 
             (this.bid!=null &&
              this.bid.equals(other.getBid()))) &&
            ((this.clicks==null && other.getClicks()==null) || 
             (this.clicks!=null &&
              this.clicks.equals(other.getClicks()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions()))) &&
            ((this.promotedImpressions==null && other.getPromotedImpressions()==null) || 
             (this.promotedImpressions!=null &&
              this.promotedImpressions.equals(other.getPromotedImpressions())));
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
        if (getBid() != null) {
            _hashCode += getBid().hashCode();
        }
        if (getClicks() != null) {
            _hashCode += getClicks().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        if (getPromotedImpressions() != null) {
            _hashCode += getPromotedImpressions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BidLandscapeLandscapePoint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "BidLandscape.LandscapePoint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "clicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "impressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotedImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "promotedImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
