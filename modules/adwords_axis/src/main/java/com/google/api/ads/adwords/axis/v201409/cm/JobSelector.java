/**
 * JobSelector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * For selecting jobs whose information will be returned from a get
 * method call
 *             of a job service.
 */
public abstract class JobSelector  implements java.io.Serializable {
    /* Indicates if the event history should be included in each of
     * the
     *                 returned jobs. */
    private java.lang.Boolean includeHistory;

    /* Indicates if the processing statistics should be included in
     * each of
     *                 the returned jobs. */
    private java.lang.Boolean includeStats;

    /* Indicates that this instance is a subtype of JobSelector.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String jobSelectorType;

    public JobSelector() {
    }

    public JobSelector(
           java.lang.Boolean includeHistory,
           java.lang.Boolean includeStats,
           java.lang.String jobSelectorType) {
           this.includeHistory = includeHistory;
           this.includeStats = includeStats;
           this.jobSelectorType = jobSelectorType;
    }


    /**
     * Gets the includeHistory value for this JobSelector.
     * 
     * @return includeHistory   * Indicates if the event history should be included in each of
     * the
     *                 returned jobs.
     */
    public java.lang.Boolean getIncludeHistory() {
        return includeHistory;
    }


    /**
     * Sets the includeHistory value for this JobSelector.
     * 
     * @param includeHistory   * Indicates if the event history should be included in each of
     * the
     *                 returned jobs.
     */
    public void setIncludeHistory(java.lang.Boolean includeHistory) {
        this.includeHistory = includeHistory;
    }


    /**
     * Gets the includeStats value for this JobSelector.
     * 
     * @return includeStats   * Indicates if the processing statistics should be included in
     * each of
     *                 the returned jobs.
     */
    public java.lang.Boolean getIncludeStats() {
        return includeStats;
    }


    /**
     * Sets the includeStats value for this JobSelector.
     * 
     * @param includeStats   * Indicates if the processing statistics should be included in
     * each of
     *                 the returned jobs.
     */
    public void setIncludeStats(java.lang.Boolean includeStats) {
        this.includeStats = includeStats;
    }


    /**
     * Gets the jobSelectorType value for this JobSelector.
     * 
     * @return jobSelectorType   * Indicates that this instance is a subtype of JobSelector.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getJobSelectorType() {
        return jobSelectorType;
    }


    /**
     * Sets the jobSelectorType value for this JobSelector.
     * 
     * @param jobSelectorType   * Indicates that this instance is a subtype of JobSelector.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setJobSelectorType(java.lang.String jobSelectorType) {
        this.jobSelectorType = jobSelectorType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobSelector)) return false;
        JobSelector other = (JobSelector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeHistory==null && other.getIncludeHistory()==null) || 
             (this.includeHistory!=null &&
              this.includeHistory.equals(other.getIncludeHistory()))) &&
            ((this.includeStats==null && other.getIncludeStats()==null) || 
             (this.includeStats!=null &&
              this.includeStats.equals(other.getIncludeStats()))) &&
            ((this.jobSelectorType==null && other.getJobSelectorType()==null) || 
             (this.jobSelectorType!=null &&
              this.jobSelectorType.equals(other.getJobSelectorType())));
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
        if (getIncludeHistory() != null) {
            _hashCode += getIncludeHistory().hashCode();
        }
        if (getIncludeStats() != null) {
            _hashCode += getIncludeStats().hashCode();
        }
        if (getJobSelectorType() != null) {
            _hashCode += getJobSelectorType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobSelector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "JobSelector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "includeHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "includeStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobSelectorType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "JobSelector.Type"));
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
