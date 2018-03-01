// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * Represents a customer for the CustomerService.
 */
public class Customer  implements java.io.Serializable {
    /* The 10-digit AdWords Customer ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long customerId;

    /* The currency in which this account operates.
     *                 We support a subset of the currency codes derived
     * from the ISO 4217 standard.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/currencycodes"
     * >Currency Codes</a> for the currently supported currencies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive.</span> */
    private java.lang.String currencyCode;

    /* The local timezone ID for this customer.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/timezones"
     * >Time Zone Codes</a> for the currently supported list.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span> */
    private java.lang.String dateTimeZone;

    /* An optional, non-unique descriptive name for this customer.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.String descriptiveName;

    /* Whether this customer can manage other AdWords customers
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean canManageClients;

    /* Whether this customer's account is a test account.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean testAccount;

    /* Whether auto-tagging is enabled for this customer. */
    private java.lang.Boolean autoTaggingEnabled;

    /* URL template for constructing a tracking URL.
     *                 
     *                 <p>On update, empty string ("") indicates to clear
     * the field. */
    private java.lang.String trackingUrlTemplate;

    /* URL template for appending params to Final URL.
     *                 
     *                 <p>On update, empty string ("") indicates to clear
     * the field. */
    private java.lang.String finalUrlSuffix;

    /* Whether parallel tracking is enabled for this customer. */
    private java.lang.Boolean parallelTrackingEnabled;

    /* Customer-level AdWords Conversion Tracking settings */
    private com.google.api.ads.adwords.axis.v201802.mcm.ConversionTrackingSettings conversionTrackingSettings;

    /* Customer-level AdWords Remarketing settings
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.mcm.RemarketingSettings remarketingSettings;

    public Customer() {
    }

    public Customer(
           java.lang.Long customerId,
           java.lang.String currencyCode,
           java.lang.String dateTimeZone,
           java.lang.String descriptiveName,
           java.lang.Boolean canManageClients,
           java.lang.Boolean testAccount,
           java.lang.Boolean autoTaggingEnabled,
           java.lang.String trackingUrlTemplate,
           java.lang.String finalUrlSuffix,
           java.lang.Boolean parallelTrackingEnabled,
           com.google.api.ads.adwords.axis.v201802.mcm.ConversionTrackingSettings conversionTrackingSettings,
           com.google.api.ads.adwords.axis.v201802.mcm.RemarketingSettings remarketingSettings) {
           this.customerId = customerId;
           this.currencyCode = currencyCode;
           this.dateTimeZone = dateTimeZone;
           this.descriptiveName = descriptiveName;
           this.canManageClients = canManageClients;
           this.testAccount = testAccount;
           this.autoTaggingEnabled = autoTaggingEnabled;
           this.trackingUrlTemplate = trackingUrlTemplate;
           this.finalUrlSuffix = finalUrlSuffix;
           this.parallelTrackingEnabled = parallelTrackingEnabled;
           this.conversionTrackingSettings = conversionTrackingSettings;
           this.remarketingSettings = remarketingSettings;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("autoTaggingEnabled", getAutoTaggingEnabled())
            .add("canManageClients", getCanManageClients())
            .add("conversionTrackingSettings", getConversionTrackingSettings())
            .add("currencyCode", getCurrencyCode())
            .add("customerId", getCustomerId())
            .add("dateTimeZone", getDateTimeZone())
            .add("descriptiveName", getDescriptiveName())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("parallelTrackingEnabled", getParallelTrackingEnabled())
            .add("remarketingSettings", getRemarketingSettings())
            .add("testAccount", getTestAccount())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .toString();
    }

    /**
     * Gets the customerId value for this Customer.
     * 
     * @return customerId   * The 10-digit AdWords Customer ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Customer.
     * 
     * @param customerId   * The 10-digit AdWords Customer ID.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the currencyCode value for this Customer.
     * 
     * @return currencyCode   * The currency in which this account operates.
     *                 We support a subset of the currency codes derived
     * from the ISO 4217 standard.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/currencycodes"
     * >Currency Codes</a> for the currently supported currencies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive.</span>
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Customer.
     * 
     * @param currencyCode   * The currency in which this account operates.
     *                 We support a subset of the currency codes derived
     * from the ISO 4217 standard.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/currencycodes"
     * >Currency Codes</a> for the currently supported currencies.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive.</span>
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the dateTimeZone value for this Customer.
     * 
     * @return dateTimeZone   * The local timezone ID for this customer.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/timezones"
     * >Time Zone Codes</a> for the currently supported list.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public java.lang.String getDateTimeZone() {
        return dateTimeZone;
    }


    /**
     * Sets the dateTimeZone value for this Customer.
     * 
     * @param dateTimeZone   * The local timezone ID for this customer.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/timezones"
     * >Time Zone Codes</a> for the currently supported list.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     *                 <span class="constraint StringLength">This string
     * must not be empty.</span>
     */
    public void setDateTimeZone(java.lang.String dateTimeZone) {
        this.dateTimeZone = dateTimeZone;
    }


    /**
     * Gets the descriptiveName value for this Customer.
     * 
     * @return descriptiveName   * An optional, non-unique descriptive name for this customer.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.String getDescriptiveName() {
        return descriptiveName;
    }


    /**
     * Sets the descriptiveName value for this Customer.
     * 
     * @param descriptiveName   * An optional, non-unique descriptive name for this customer.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setDescriptiveName(java.lang.String descriptiveName) {
        this.descriptiveName = descriptiveName;
    }


    /**
     * Gets the canManageClients value for this Customer.
     * 
     * @return canManageClients   * Whether this customer can manage other AdWords customers
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getCanManageClients() {
        return canManageClients;
    }


    /**
     * Sets the canManageClients value for this Customer.
     * 
     * @param canManageClients   * Whether this customer can manage other AdWords customers
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCanManageClients(java.lang.Boolean canManageClients) {
        this.canManageClients = canManageClients;
    }


    /**
     * Gets the testAccount value for this Customer.
     * 
     * @return testAccount   * Whether this customer's account is a test account.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getTestAccount() {
        return testAccount;
    }


    /**
     * Sets the testAccount value for this Customer.
     * 
     * @param testAccount   * Whether this customer's account is a test account.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTestAccount(java.lang.Boolean testAccount) {
        this.testAccount = testAccount;
    }


    /**
     * Gets the autoTaggingEnabled value for this Customer.
     * 
     * @return autoTaggingEnabled   * Whether auto-tagging is enabled for this customer.
     */
    public java.lang.Boolean getAutoTaggingEnabled() {
        return autoTaggingEnabled;
    }


    /**
     * Sets the autoTaggingEnabled value for this Customer.
     * 
     * @param autoTaggingEnabled   * Whether auto-tagging is enabled for this customer.
     */
    public void setAutoTaggingEnabled(java.lang.Boolean autoTaggingEnabled) {
        this.autoTaggingEnabled = autoTaggingEnabled;
    }


    /**
     * Gets the trackingUrlTemplate value for this Customer.
     * 
     * @return trackingUrlTemplate   * URL template for constructing a tracking URL.
     *                 
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public java.lang.String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }


    /**
     * Sets the trackingUrlTemplate value for this Customer.
     * 
     * @param trackingUrlTemplate   * URL template for constructing a tracking URL.
     *                 
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public void setTrackingUrlTemplate(java.lang.String trackingUrlTemplate) {
        this.trackingUrlTemplate = trackingUrlTemplate;
    }


    /**
     * Gets the finalUrlSuffix value for this Customer.
     * 
     * @return finalUrlSuffix   * URL template for appending params to Final URL.
     *                 
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public java.lang.String getFinalUrlSuffix() {
        return finalUrlSuffix;
    }


    /**
     * Sets the finalUrlSuffix value for this Customer.
     * 
     * @param finalUrlSuffix   * URL template for appending params to Final URL.
     *                 
     *                 <p>On update, empty string ("") indicates to clear
     * the field.
     */
    public void setFinalUrlSuffix(java.lang.String finalUrlSuffix) {
        this.finalUrlSuffix = finalUrlSuffix;
    }


    /**
     * Gets the parallelTrackingEnabled value for this Customer.
     * 
     * @return parallelTrackingEnabled   * Whether parallel tracking is enabled for this customer.
     */
    public java.lang.Boolean getParallelTrackingEnabled() {
        return parallelTrackingEnabled;
    }


    /**
     * Sets the parallelTrackingEnabled value for this Customer.
     * 
     * @param parallelTrackingEnabled   * Whether parallel tracking is enabled for this customer.
     */
    public void setParallelTrackingEnabled(java.lang.Boolean parallelTrackingEnabled) {
        this.parallelTrackingEnabled = parallelTrackingEnabled;
    }


    /**
     * Gets the conversionTrackingSettings value for this Customer.
     * 
     * @return conversionTrackingSettings   * Customer-level AdWords Conversion Tracking settings
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ConversionTrackingSettings getConversionTrackingSettings() {
        return conversionTrackingSettings;
    }


    /**
     * Sets the conversionTrackingSettings value for this Customer.
     * 
     * @param conversionTrackingSettings   * Customer-level AdWords Conversion Tracking settings
     */
    public void setConversionTrackingSettings(com.google.api.ads.adwords.axis.v201802.mcm.ConversionTrackingSettings conversionTrackingSettings) {
        this.conversionTrackingSettings = conversionTrackingSettings;
    }


    /**
     * Gets the remarketingSettings value for this Customer.
     * 
     * @return remarketingSettings   * Customer-level AdWords Remarketing settings
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.RemarketingSettings getRemarketingSettings() {
        return remarketingSettings;
    }


    /**
     * Sets the remarketingSettings value for this Customer.
     * 
     * @param remarketingSettings   * Customer-level AdWords Remarketing settings
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setRemarketingSettings(com.google.api.ads.adwords.axis.v201802.mcm.RemarketingSettings remarketingSettings) {
        this.remarketingSettings = remarketingSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.dateTimeZone==null && other.getDateTimeZone()==null) || 
             (this.dateTimeZone!=null &&
              this.dateTimeZone.equals(other.getDateTimeZone()))) &&
            ((this.descriptiveName==null && other.getDescriptiveName()==null) || 
             (this.descriptiveName!=null &&
              this.descriptiveName.equals(other.getDescriptiveName()))) &&
            ((this.canManageClients==null && other.getCanManageClients()==null) || 
             (this.canManageClients!=null &&
              this.canManageClients.equals(other.getCanManageClients()))) &&
            ((this.testAccount==null && other.getTestAccount()==null) || 
             (this.testAccount!=null &&
              this.testAccount.equals(other.getTestAccount()))) &&
            ((this.autoTaggingEnabled==null && other.getAutoTaggingEnabled()==null) || 
             (this.autoTaggingEnabled!=null &&
              this.autoTaggingEnabled.equals(other.getAutoTaggingEnabled()))) &&
            ((this.trackingUrlTemplate==null && other.getTrackingUrlTemplate()==null) || 
             (this.trackingUrlTemplate!=null &&
              this.trackingUrlTemplate.equals(other.getTrackingUrlTemplate()))) &&
            ((this.finalUrlSuffix==null && other.getFinalUrlSuffix()==null) || 
             (this.finalUrlSuffix!=null &&
              this.finalUrlSuffix.equals(other.getFinalUrlSuffix()))) &&
            ((this.parallelTrackingEnabled==null && other.getParallelTrackingEnabled()==null) || 
             (this.parallelTrackingEnabled!=null &&
              this.parallelTrackingEnabled.equals(other.getParallelTrackingEnabled()))) &&
            ((this.conversionTrackingSettings==null && other.getConversionTrackingSettings()==null) || 
             (this.conversionTrackingSettings!=null &&
              this.conversionTrackingSettings.equals(other.getConversionTrackingSettings()))) &&
            ((this.remarketingSettings==null && other.getRemarketingSettings()==null) || 
             (this.remarketingSettings!=null &&
              this.remarketingSettings.equals(other.getRemarketingSettings())));
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
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDateTimeZone() != null) {
            _hashCode += getDateTimeZone().hashCode();
        }
        if (getDescriptiveName() != null) {
            _hashCode += getDescriptiveName().hashCode();
        }
        if (getCanManageClients() != null) {
            _hashCode += getCanManageClients().hashCode();
        }
        if (getTestAccount() != null) {
            _hashCode += getTestAccount().hashCode();
        }
        if (getAutoTaggingEnabled() != null) {
            _hashCode += getAutoTaggingEnabled().hashCode();
        }
        if (getTrackingUrlTemplate() != null) {
            _hashCode += getTrackingUrlTemplate().hashCode();
        }
        if (getFinalUrlSuffix() != null) {
            _hashCode += getFinalUrlSuffix().hashCode();
        }
        if (getParallelTrackingEnabled() != null) {
            _hashCode += getParallelTrackingEnabled().hashCode();
        }
        if (getConversionTrackingSettings() != null) {
            _hashCode += getConversionTrackingSettings().hashCode();
        }
        if (getRemarketingSettings() != null) {
            _hashCode += getRemarketingSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "Customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "dateTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptiveName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "descriptiveName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canManageClients");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "canManageClients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "testAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTaggingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "autoTaggingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrlTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "trackingUrlTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrlSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "finalUrlSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parallelTrackingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "parallelTrackingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTrackingSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "conversionTrackingSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ConversionTrackingSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarketingSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "remarketingSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "RemarketingSettings"));
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
