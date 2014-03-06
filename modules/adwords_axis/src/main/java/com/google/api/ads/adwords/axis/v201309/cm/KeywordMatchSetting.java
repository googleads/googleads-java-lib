/**
 * KeywordMatchSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Improved exact and phrase match option includes misspellings, plurals,
 * and other close variants of your keywords.
 *             
 *             Default value set to {@code true} to include close variants.
 * For more
 *             information, see the article
 *             <a href="https://support.google.com/adwords/bin/answer.py?answer=6100">
 * What are keyword matching options?</a>.
 *             
 *             This setting is required when creating new campaigns.
 */
public class KeywordMatchSetting  extends com.google.api.ads.adwords.axis.v201309.cm.Setting  implements java.io.Serializable {
    /* Setting this boolean value to true enables the broadening of
     * exact and phrase keyword matches
     *                     for this campaign to include small variations
     * such as plurals, common misspellings,
     *                     diacriticals and acronyms.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Boolean optIn;

    public KeywordMatchSetting() {
    }

    public KeywordMatchSetting(
           java.lang.String settingType,
           java.lang.Boolean optIn) {
        super(
            settingType);
        this.optIn = optIn;
    }


    /**
     * Gets the optIn value for this KeywordMatchSetting.
     * 
     * @return optIn   * Setting this boolean value to true enables the broadening of
     * exact and phrase keyword matches
     *                     for this campaign to include small variations
     * such as plurals, common misspellings,
     *                     diacriticals and acronyms.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Boolean getOptIn() {
        return optIn;
    }


    /**
     * Sets the optIn value for this KeywordMatchSetting.
     * 
     * @param optIn   * Setting this boolean value to true enables the broadening of
     * exact and phrase keyword matches
     *                     for this campaign to include small variations
     * such as plurals, common misspellings,
     *                     diacriticals and acronyms.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setOptIn(java.lang.Boolean optIn) {
        this.optIn = optIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeywordMatchSetting)) return false;
        KeywordMatchSetting other = (KeywordMatchSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.optIn==null && other.getOptIn()==null) || 
             (this.optIn!=null &&
              this.optIn.equals(other.getOptIn())));
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
        if (getOptIn() != null) {
            _hashCode += getOptIn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeywordMatchSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "KeywordMatchSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optIn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "optIn"));
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
