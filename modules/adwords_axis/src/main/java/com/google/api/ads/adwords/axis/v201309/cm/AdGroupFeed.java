/**
 * AdGroupFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * AdGroupFeeds are used to link a feed to an adgroup using a matching
 * function,
 *             making the feed's feed items available in the adgroup's
 * ads for substitution.
 */
public class AdGroupFeed  implements java.io.Serializable {
    /* Id of the Feed associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long feedId;

    /* Id of the AdGroup associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* Matching function associated with the AdGroupFeed.
     *                 The matching function will return true/false indicating
     * which feed items may serve.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MatchingFunction".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Function matchingFunction;

    /* Indicates which placeholder types the feed may populate under
     * the connected AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderTypes".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private int[] placeholderTypes;

    /* Status of the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.AdGroupFeedStatus status;

    public AdGroupFeed() {
    }

    public AdGroupFeed(
           java.lang.Long feedId,
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201309.cm.Function matchingFunction,
           int[] placeholderTypes,
           com.google.api.ads.adwords.axis.v201309.cm.AdGroupFeedStatus status) {
           this.feedId = feedId;
           this.adGroupId = adGroupId;
           this.matchingFunction = matchingFunction;
           this.placeholderTypes = placeholderTypes;
           this.status = status;
    }


    /**
     * Gets the feedId value for this AdGroupFeed.
     * 
     * @return feedId   * Id of the Feed associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getFeedId() {
        return feedId;
    }


    /**
     * Sets the feedId value for this AdGroupFeed.
     * 
     * @param feedId   * Id of the Feed associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "FeedId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFeedId(java.lang.Long feedId) {
        this.feedId = feedId;
    }


    /**
     * Gets the adGroupId value for this AdGroupFeed.
     * 
     * @return adGroupId   * Id of the AdGroup associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupFeed.
     * 
     * @param adGroupId   * Id of the AdGroup associated with the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AdGroupId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the matchingFunction value for this AdGroupFeed.
     * 
     * @return matchingFunction   * Matching function associated with the AdGroupFeed.
     *                 The matching function will return true/false indicating
     * which feed items may serve.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MatchingFunction".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Function getMatchingFunction() {
        return matchingFunction;
    }


    /**
     * Sets the matchingFunction value for this AdGroupFeed.
     * 
     * @param matchingFunction   * Matching function associated with the AdGroupFeed.
     *                 The matching function will return true/false indicating
     * which feed items may serve.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "MatchingFunction".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setMatchingFunction(com.google.api.ads.adwords.axis.v201309.cm.Function matchingFunction) {
        this.matchingFunction = matchingFunction;
    }


    /**
     * Gets the placeholderTypes value for this AdGroupFeed.
     * 
     * @return placeholderTypes   * Indicates which placeholder types the feed may populate under
     * the connected AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderTypes".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public int[] getPlaceholderTypes() {
        return placeholderTypes;
    }


    /**
     * Sets the placeholderTypes value for this AdGroupFeed.
     * 
     * @param placeholderTypes   * Indicates which placeholder types the feed may populate under
     * the connected AdGroup.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PlaceholderTypes".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setPlaceholderTypes(int[] placeholderTypes) {
        this.placeholderTypes = placeholderTypes;
    }

    public int getPlaceholderTypes(int i) {
        return this.placeholderTypes[i];
    }

    public void setPlaceholderTypes(int i, int _value) {
        this.placeholderTypes[i] = _value;
    }


    /**
     * Gets the status value for this AdGroupFeed.
     * 
     * @return status   * Status of the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.AdGroupFeedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AdGroupFeed.
     * 
     * @param status   * Status of the AdGroupFeed.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201309.cm.AdGroupFeedStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupFeed)) return false;
        AdGroupFeed other = (AdGroupFeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feedId==null && other.getFeedId()==null) || 
             (this.feedId!=null &&
              this.feedId.equals(other.getFeedId()))) &&
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.matchingFunction==null && other.getMatchingFunction()==null) || 
             (this.matchingFunction!=null &&
              this.matchingFunction.equals(other.getMatchingFunction()))) &&
            ((this.placeholderTypes==null && other.getPlaceholderTypes()==null) || 
             (this.placeholderTypes!=null &&
              java.util.Arrays.equals(this.placeholderTypes, other.getPlaceholderTypes()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getFeedId() != null) {
            _hashCode += getFeedId().hashCode();
        }
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getMatchingFunction() != null) {
            _hashCode += getMatchingFunction().hashCode();
        }
        if (getPlaceholderTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlaceholderTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlaceholderTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "AdGroupFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "feedId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchingFunction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "matchingFunction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Function"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeholderTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "placeholderTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "AdGroupFeed.Status"));
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
