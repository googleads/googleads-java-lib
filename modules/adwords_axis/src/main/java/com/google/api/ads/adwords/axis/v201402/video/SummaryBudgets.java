/**
 * SummaryBudgets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Class representing the various summary budgets for a campaign page.
 */
public class SummaryBudgets  implements java.io.Serializable {
    /* Total budget for video campaigns. */
    private com.google.api.ads.adwords.axis.v201402.video.VideoBudget totalVideoBudget;

    /* Total budget for non-video campaigns. */
    private com.google.api.ads.adwords.axis.v201402.cm.Money nonVideoBudget;

    /* Total combined budget for both video and non-video campaigns. */
    private com.google.api.ads.adwords.axis.v201402.cm.Money combinedBudget;

    public SummaryBudgets() {
    }

    public SummaryBudgets(
           com.google.api.ads.adwords.axis.v201402.video.VideoBudget totalVideoBudget,
           com.google.api.ads.adwords.axis.v201402.cm.Money nonVideoBudget,
           com.google.api.ads.adwords.axis.v201402.cm.Money combinedBudget) {
           this.totalVideoBudget = totalVideoBudget;
           this.nonVideoBudget = nonVideoBudget;
           this.combinedBudget = combinedBudget;
    }


    /**
     * Gets the totalVideoBudget value for this SummaryBudgets.
     * 
     * @return totalVideoBudget   * Total budget for video campaigns.
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoBudget getTotalVideoBudget() {
        return totalVideoBudget;
    }


    /**
     * Sets the totalVideoBudget value for this SummaryBudgets.
     * 
     * @param totalVideoBudget   * Total budget for video campaigns.
     */
    public void setTotalVideoBudget(com.google.api.ads.adwords.axis.v201402.video.VideoBudget totalVideoBudget) {
        this.totalVideoBudget = totalVideoBudget;
    }


    /**
     * Gets the nonVideoBudget value for this SummaryBudgets.
     * 
     * @return nonVideoBudget   * Total budget for non-video campaigns.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getNonVideoBudget() {
        return nonVideoBudget;
    }


    /**
     * Sets the nonVideoBudget value for this SummaryBudgets.
     * 
     * @param nonVideoBudget   * Total budget for non-video campaigns.
     */
    public void setNonVideoBudget(com.google.api.ads.adwords.axis.v201402.cm.Money nonVideoBudget) {
        this.nonVideoBudget = nonVideoBudget;
    }


    /**
     * Gets the combinedBudget value for this SummaryBudgets.
     * 
     * @return combinedBudget   * Total combined budget for both video and non-video campaigns.
     */
    public com.google.api.ads.adwords.axis.v201402.cm.Money getCombinedBudget() {
        return combinedBudget;
    }


    /**
     * Sets the combinedBudget value for this SummaryBudgets.
     * 
     * @param combinedBudget   * Total combined budget for both video and non-video campaigns.
     */
    public void setCombinedBudget(com.google.api.ads.adwords.axis.v201402.cm.Money combinedBudget) {
        this.combinedBudget = combinedBudget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SummaryBudgets)) return false;
        SummaryBudgets other = (SummaryBudgets) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalVideoBudget==null && other.getTotalVideoBudget()==null) || 
             (this.totalVideoBudget!=null &&
              this.totalVideoBudget.equals(other.getTotalVideoBudget()))) &&
            ((this.nonVideoBudget==null && other.getNonVideoBudget()==null) || 
             (this.nonVideoBudget!=null &&
              this.nonVideoBudget.equals(other.getNonVideoBudget()))) &&
            ((this.combinedBudget==null && other.getCombinedBudget()==null) || 
             (this.combinedBudget!=null &&
              this.combinedBudget.equals(other.getCombinedBudget())));
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
        if (getTotalVideoBudget() != null) {
            _hashCode += getTotalVideoBudget().hashCode();
        }
        if (getNonVideoBudget() != null) {
            _hashCode += getNonVideoBudget().hashCode();
        }
        if (getCombinedBudget() != null) {
            _hashCode += getCombinedBudget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SummaryBudgets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "SummaryBudgets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVideoBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "totalVideoBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoBudget"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonVideoBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "nonVideoBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "combinedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "Money"));
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
