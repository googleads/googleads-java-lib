/**
 * AlertQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.mcm;


/**
 * Querying criteria for getting alerts.
 */
public class AlertQuery  implements java.io.Serializable {
    /* Specifies what clients to get alerts for.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.mcm.ClientSpec clientSpec;

    /* Specifies whether/how to filter the result set based on whether
     * the customer can manage.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.mcm.FilterSpec filterSpec;

    /* The specific types of Alerts to return.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.mcm.AlertType[] types;

    /* <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201406.mcm.AlertSeverity[] severities;

    /* Specifies what time interval for which to get alerts.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.mcm.TriggerTimeSpec triggerTimeSpec;

    /* If {@link TriggerTimeSpec#CUSTOM_TIME} is specified,
     *                 only alerts generated after this time will be returned.
     * String Format: yyyymmdd hhmmss zzz
     *                 (e.g. 20100609 150223 UTC). */
    private java.lang.String triggerTime;

    /* If {@link ClientSpec#ID_LIST} is specified,
     *                 only alerts for the client accounts specified here
     * will be returned.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span> */
    private long[] clientCustomerIds;

    public AlertQuery() {
    }

    public AlertQuery(
           com.google.api.ads.adwords.axis.v201406.mcm.ClientSpec clientSpec,
           com.google.api.ads.adwords.axis.v201406.mcm.FilterSpec filterSpec,
           com.google.api.ads.adwords.axis.v201406.mcm.AlertType[] types,
           com.google.api.ads.adwords.axis.v201406.mcm.AlertSeverity[] severities,
           com.google.api.ads.adwords.axis.v201406.mcm.TriggerTimeSpec triggerTimeSpec,
           java.lang.String triggerTime,
           long[] clientCustomerIds) {
           this.clientSpec = clientSpec;
           this.filterSpec = filterSpec;
           this.types = types;
           this.severities = severities;
           this.triggerTimeSpec = triggerTimeSpec;
           this.triggerTime = triggerTime;
           this.clientCustomerIds = clientCustomerIds;
    }


    /**
     * Gets the clientSpec value for this AlertQuery.
     * 
     * @return clientSpec   * Specifies what clients to get alerts for.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.mcm.ClientSpec getClientSpec() {
        return clientSpec;
    }


    /**
     * Sets the clientSpec value for this AlertQuery.
     * 
     * @param clientSpec   * Specifies what clients to get alerts for.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setClientSpec(com.google.api.ads.adwords.axis.v201406.mcm.ClientSpec clientSpec) {
        this.clientSpec = clientSpec;
    }


    /**
     * Gets the filterSpec value for this AlertQuery.
     * 
     * @return filterSpec   * Specifies whether/how to filter the result set based on whether
     * the customer can manage.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.mcm.FilterSpec getFilterSpec() {
        return filterSpec;
    }


    /**
     * Sets the filterSpec value for this AlertQuery.
     * 
     * @param filterSpec   * Specifies whether/how to filter the result set based on whether
     * the customer can manage.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFilterSpec(com.google.api.ads.adwords.axis.v201406.mcm.FilterSpec filterSpec) {
        this.filterSpec = filterSpec;
    }


    /**
     * Gets the types value for this AlertQuery.
     * 
     * @return types   * The specific types of Alerts to return.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.mcm.AlertType[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this AlertQuery.
     * 
     * @param types   * The specific types of Alerts to return.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setTypes(com.google.api.ads.adwords.axis.v201406.mcm.AlertType[] types) {
        this.types = types;
    }

    public com.google.api.ads.adwords.axis.v201406.mcm.AlertType getTypes(int i) {
        return this.types[i];
    }

    public void setTypes(int i, com.google.api.ads.adwords.axis.v201406.mcm.AlertType _value) {
        this.types[i] = _value;
    }


    /**
     * Gets the severities value for this AlertQuery.
     * 
     * @return severities   * <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.mcm.AlertSeverity[] getSeverities() {
        return severities;
    }


    /**
     * Sets the severities value for this AlertQuery.
     * 
     * @param severities   * <span class="constraint ContentsNotNull">This field must not
     * contain {@code null} elements.</span>
     */
    public void setSeverities(com.google.api.ads.adwords.axis.v201406.mcm.AlertSeverity[] severities) {
        this.severities = severities;
    }

    public com.google.api.ads.adwords.axis.v201406.mcm.AlertSeverity getSeverities(int i) {
        return this.severities[i];
    }

    public void setSeverities(int i, com.google.api.ads.adwords.axis.v201406.mcm.AlertSeverity _value) {
        this.severities[i] = _value;
    }


    /**
     * Gets the triggerTimeSpec value for this AlertQuery.
     * 
     * @return triggerTimeSpec   * Specifies what time interval for which to get alerts.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.mcm.TriggerTimeSpec getTriggerTimeSpec() {
        return triggerTimeSpec;
    }


    /**
     * Sets the triggerTimeSpec value for this AlertQuery.
     * 
     * @param triggerTimeSpec   * Specifies what time interval for which to get alerts.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setTriggerTimeSpec(com.google.api.ads.adwords.axis.v201406.mcm.TriggerTimeSpec triggerTimeSpec) {
        this.triggerTimeSpec = triggerTimeSpec;
    }


    /**
     * Gets the triggerTime value for this AlertQuery.
     * 
     * @return triggerTime   * If {@link TriggerTimeSpec#CUSTOM_TIME} is specified,
     *                 only alerts generated after this time will be returned.
     * String Format: yyyymmdd hhmmss zzz
     *                 (e.g. 20100609 150223 UTC).
     */
    public java.lang.String getTriggerTime() {
        return triggerTime;
    }


    /**
     * Sets the triggerTime value for this AlertQuery.
     * 
     * @param triggerTime   * If {@link TriggerTimeSpec#CUSTOM_TIME} is specified,
     *                 only alerts generated after this time will be returned.
     * String Format: yyyymmdd hhmmss zzz
     *                 (e.g. 20100609 150223 UTC).
     */
    public void setTriggerTime(java.lang.String triggerTime) {
        this.triggerTime = triggerTime;
    }


    /**
     * Gets the clientCustomerIds value for this AlertQuery.
     * 
     * @return clientCustomerIds   * If {@link ClientSpec#ID_LIST} is specified,
     *                 only alerts for the client accounts specified here
     * will be returned.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     */
    public long[] getClientCustomerIds() {
        return clientCustomerIds;
    }


    /**
     * Sets the clientCustomerIds value for this AlertQuery.
     * 
     * @param clientCustomerIds   * If {@link ClientSpec#ID_LIST} is specified,
     *                 only alerts for the client accounts specified here
     * will be returned.
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     */
    public void setClientCustomerIds(long[] clientCustomerIds) {
        this.clientCustomerIds = clientCustomerIds;
    }

    public long getClientCustomerIds(int i) {
        return this.clientCustomerIds[i];
    }

    public void setClientCustomerIds(int i, long _value) {
        this.clientCustomerIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlertQuery)) return false;
        AlertQuery other = (AlertQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientSpec==null && other.getClientSpec()==null) || 
             (this.clientSpec!=null &&
              this.clientSpec.equals(other.getClientSpec()))) &&
            ((this.filterSpec==null && other.getFilterSpec()==null) || 
             (this.filterSpec!=null &&
              this.filterSpec.equals(other.getFilterSpec()))) &&
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              java.util.Arrays.equals(this.types, other.getTypes()))) &&
            ((this.severities==null && other.getSeverities()==null) || 
             (this.severities!=null &&
              java.util.Arrays.equals(this.severities, other.getSeverities()))) &&
            ((this.triggerTimeSpec==null && other.getTriggerTimeSpec()==null) || 
             (this.triggerTimeSpec!=null &&
              this.triggerTimeSpec.equals(other.getTriggerTimeSpec()))) &&
            ((this.triggerTime==null && other.getTriggerTime()==null) || 
             (this.triggerTime!=null &&
              this.triggerTime.equals(other.getTriggerTime()))) &&
            ((this.clientCustomerIds==null && other.getClientCustomerIds()==null) || 
             (this.clientCustomerIds!=null &&
              java.util.Arrays.equals(this.clientCustomerIds, other.getClientCustomerIds())));
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
        if (getClientSpec() != null) {
            _hashCode += getClientSpec().hashCode();
        }
        if (getFilterSpec() != null) {
            _hashCode += getFilterSpec().hashCode();
        }
        if (getTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeverities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeverities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeverities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTriggerTimeSpec() != null) {
            _hashCode += getTriggerTimeSpec().hashCode();
        }
        if (getTriggerTime() != null) {
            _hashCode += getTriggerTime().hashCode();
        }
        if (getClientCustomerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientCustomerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientCustomerIds(), i);
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
        new org.apache.axis.description.TypeDesc(AlertQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "AlertQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "clientSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "ClientSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "filterSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "FilterSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "types"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "AlertType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severities");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "severities"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "AlertSeverity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerTimeSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "triggerTimeSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "TriggerTimeSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "triggerTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCustomerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "clientCustomerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
