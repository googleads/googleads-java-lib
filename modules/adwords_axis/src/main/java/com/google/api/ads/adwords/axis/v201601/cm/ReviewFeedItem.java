/**
 * ReviewFeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;


/**
 * Represents a Review extension.
 */
public class ReviewFeedItem  extends com.google.api.ads.adwords.axis.v201601.cm.ExtensionFeedItem  implements java.io.Serializable {
    /* An exact quote or paraphrase from a third-party source.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String reviewText;

    /* Name of the third-party publisher of the review.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String reviewSourceName;

    /* Landing page of the third-party website of the review.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String reviewSourceUrl;

    /* Indicates if your review is formatted as an exact quote. Use
     * a value of false to indicate that
     *                     the review is paraphrased. If not set, the value
     * is treated as false. */
    private java.lang.Boolean reviewTextExactlyQuoted;

    public ReviewFeedItem() {
    }

    public ReviewFeedItem(
           java.lang.Long feedId,
           java.lang.Long feedItemId,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemStatus status,
           com.google.api.ads.adwords.axis.v201601.cm.FeedType feedType,
           java.lang.String startTime,
           java.lang.String endTime,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemDevicePreference devicePreference,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemScheduling scheduling,
           com.google.api.ads.adwords.axis.v201601.cm.FeedItemPolicyData[] policyData,
           java.lang.String extensionFeedItemType,
           java.lang.String reviewText,
           java.lang.String reviewSourceName,
           java.lang.String reviewSourceUrl,
           java.lang.Boolean reviewTextExactlyQuoted) {
        super(
            feedId,
            feedItemId,
            status,
            feedType,
            startTime,
            endTime,
            devicePreference,
            scheduling,
            policyData,
            extensionFeedItemType);
        this.reviewText = reviewText;
        this.reviewSourceName = reviewSourceName;
        this.reviewSourceUrl = reviewSourceUrl;
        this.reviewTextExactlyQuoted = reviewTextExactlyQuoted;
    }


    /**
     * Gets the reviewText value for this ReviewFeedItem.
     * 
     * @return reviewText   * An exact quote or paraphrase from a third-party source.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getReviewText() {
        return reviewText;
    }


    /**
     * Sets the reviewText value for this ReviewFeedItem.
     * 
     * @param reviewText   * An exact quote or paraphrase from a third-party source.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setReviewText(java.lang.String reviewText) {
        this.reviewText = reviewText;
    }


    /**
     * Gets the reviewSourceName value for this ReviewFeedItem.
     * 
     * @return reviewSourceName   * Name of the third-party publisher of the review.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getReviewSourceName() {
        return reviewSourceName;
    }


    /**
     * Sets the reviewSourceName value for this ReviewFeedItem.
     * 
     * @param reviewSourceName   * Name of the third-party publisher of the review.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setReviewSourceName(java.lang.String reviewSourceName) {
        this.reviewSourceName = reviewSourceName;
    }


    /**
     * Gets the reviewSourceUrl value for this ReviewFeedItem.
     * 
     * @return reviewSourceUrl   * Landing page of the third-party website of the review.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getReviewSourceUrl() {
        return reviewSourceUrl;
    }


    /**
     * Sets the reviewSourceUrl value for this ReviewFeedItem.
     * 
     * @param reviewSourceUrl   * Landing page of the third-party website of the review.
     *                     <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setReviewSourceUrl(java.lang.String reviewSourceUrl) {
        this.reviewSourceUrl = reviewSourceUrl;
    }


    /**
     * Gets the reviewTextExactlyQuoted value for this ReviewFeedItem.
     * 
     * @return reviewTextExactlyQuoted   * Indicates if your review is formatted as an exact quote. Use
     * a value of false to indicate that
     *                     the review is paraphrased. If not set, the value
     * is treated as false.
     */
    public java.lang.Boolean getReviewTextExactlyQuoted() {
        return reviewTextExactlyQuoted;
    }


    /**
     * Sets the reviewTextExactlyQuoted value for this ReviewFeedItem.
     * 
     * @param reviewTextExactlyQuoted   * Indicates if your review is formatted as an exact quote. Use
     * a value of false to indicate that
     *                     the review is paraphrased. If not set, the value
     * is treated as false.
     */
    public void setReviewTextExactlyQuoted(java.lang.Boolean reviewTextExactlyQuoted) {
        this.reviewTextExactlyQuoted = reviewTextExactlyQuoted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReviewFeedItem)) return false;
        ReviewFeedItem other = (ReviewFeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reviewText==null && other.getReviewText()==null) || 
             (this.reviewText!=null &&
              this.reviewText.equals(other.getReviewText()))) &&
            ((this.reviewSourceName==null && other.getReviewSourceName()==null) || 
             (this.reviewSourceName!=null &&
              this.reviewSourceName.equals(other.getReviewSourceName()))) &&
            ((this.reviewSourceUrl==null && other.getReviewSourceUrl()==null) || 
             (this.reviewSourceUrl!=null &&
              this.reviewSourceUrl.equals(other.getReviewSourceUrl()))) &&
            ((this.reviewTextExactlyQuoted==null && other.getReviewTextExactlyQuoted()==null) || 
             (this.reviewTextExactlyQuoted!=null &&
              this.reviewTextExactlyQuoted.equals(other.getReviewTextExactlyQuoted())));
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
        if (getReviewText() != null) {
            _hashCode += getReviewText().hashCode();
        }
        if (getReviewSourceName() != null) {
            _hashCode += getReviewSourceName().hashCode();
        }
        if (getReviewSourceUrl() != null) {
            _hashCode += getReviewSourceUrl().hashCode();
        }
        if (getReviewTextExactlyQuoted() != null) {
            _hashCode += getReviewTextExactlyQuoted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReviewFeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ReviewFeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "reviewText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewSourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "reviewSourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewSourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "reviewSourceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reviewTextExactlyQuoted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "reviewTextExactlyQuoted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
