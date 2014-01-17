/**
 * TrafficEstimatorSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.o;


/**
 * Contains a list of campaigns to perform a traffic estimate on.
 */
public class TrafficEstimatorSelector  implements java.io.Serializable {
    /* A list of all campaigns to estimate.<p>
     *                 
     *                 To create a Keyword estimates request, use {@code
     * null} campaign id.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 5.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201306.o.CampaignEstimateRequest[] campaignEstimateRequests;

    public TrafficEstimatorSelector() {
    }

    public TrafficEstimatorSelector(
           com.google.api.ads.adwords.axis.v201306.o.CampaignEstimateRequest[] campaignEstimateRequests) {
           this.campaignEstimateRequests = campaignEstimateRequests;
    }


    /**
     * Gets the campaignEstimateRequests value for this TrafficEstimatorSelector.
     * 
     * @return campaignEstimateRequests   * A list of all campaigns to estimate.<p>
     *                 
     *                 To create a Keyword estimates request, use {@code
     * null} campaign id.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 5.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.o.CampaignEstimateRequest[] getCampaignEstimateRequests() {
        return campaignEstimateRequests;
    }


    /**
     * Sets the campaignEstimateRequests value for this TrafficEstimatorSelector.
     * 
     * @param campaignEstimateRequests   * A list of all campaigns to estimate.<p>
     *                 
     *                 To create a Keyword estimates request, use {@code
     * null} campaign id.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 5.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setCampaignEstimateRequests(com.google.api.ads.adwords.axis.v201306.o.CampaignEstimateRequest[] campaignEstimateRequests) {
        this.campaignEstimateRequests = campaignEstimateRequests;
    }

    public com.google.api.ads.adwords.axis.v201306.o.CampaignEstimateRequest getCampaignEstimateRequests(int i) {
        return this.campaignEstimateRequests[i];
    }

    public void setCampaignEstimateRequests(int i, com.google.api.ads.adwords.axis.v201306.o.CampaignEstimateRequest _value) {
        this.campaignEstimateRequests[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficEstimatorSelector)) return false;
        TrafficEstimatorSelector other = (TrafficEstimatorSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignEstimateRequests==null && other.getCampaignEstimateRequests()==null) || 
             (this.campaignEstimateRequests!=null &&
              java.util.Arrays.equals(this.campaignEstimateRequests, other.getCampaignEstimateRequests())));
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
        if (getCampaignEstimateRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignEstimateRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignEstimateRequests(), i);
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
        new org.apache.axis.description.TypeDesc(TrafficEstimatorSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "TrafficEstimatorSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEstimateRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "campaignEstimateRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201306", "CampaignEstimateRequest"));
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
