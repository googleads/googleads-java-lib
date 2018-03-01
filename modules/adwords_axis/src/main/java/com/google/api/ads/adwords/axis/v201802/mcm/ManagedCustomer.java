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
 * ManagedCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * Data object that represents a managed customer.  Member of {@link
 * ManagedCustomerPage}.
 */
public class ManagedCustomer  implements java.io.Serializable {
    /* The name used by the manager to refer to the client.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String name;

    /* The 10-digit ID that uniquely identifies the AdWords account.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CustomerId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private java.lang.Long customerId;

    /* Whether this account can manage clients.
     *                 <span class="constraint ReadOnly">This field is read
     * only
     *                 and will be ignored when sent to the API.</span>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CanManageClients".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean canManageClients;

    /* The currency in which this account operates.
     *                 We support a subset of the currency codes derived
     * from the ISO 4217 standard.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/currencycodes"
     * >Currency Codes</a> for the currently supported currencies.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CurrencyCode".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive.</span> */
    private java.lang.String currencyCode;

    /* The local timezone ID for this customer.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/timezones"
     * >Time Zone Codes</a> for the currently supported list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DateTimeZone".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String dateTimeZone;

    /* Whether this managed customer's account is a test account.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TestAccount".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean testAccount;

    /* The list of account labels associated with this customer. Only
     * labels owned by the requesting
     *                 manager will be returned. To change the list of labels
     * applied to this customer, see
     *                 {@link ManagedCustomerService#mutateLabels}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccountLabels".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel[] accountLabels;

    /* Specify ExcludeHiddenAccounts=true to exclude hidden accounts
     * during traversal.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "ExcludeHiddenAccounts".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean excludeHiddenAccounts;

    public ManagedCustomer() {
    }

    public ManagedCustomer(
           java.lang.String name,
           java.lang.Long customerId,
           java.lang.Boolean canManageClients,
           java.lang.String currencyCode,
           java.lang.String dateTimeZone,
           java.lang.Boolean testAccount,
           com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel[] accountLabels,
           java.lang.Boolean excludeHiddenAccounts) {
           this.name = name;
           this.customerId = customerId;
           this.canManageClients = canManageClients;
           this.currencyCode = currencyCode;
           this.dateTimeZone = dateTimeZone;
           this.testAccount = testAccount;
           this.accountLabels = accountLabels;
           this.excludeHiddenAccounts = excludeHiddenAccounts;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accountLabels", getAccountLabels())
            .add("canManageClients", getCanManageClients())
            .add("currencyCode", getCurrencyCode())
            .add("customerId", getCustomerId())
            .add("dateTimeZone", getDateTimeZone())
            .add("excludeHiddenAccounts", getExcludeHiddenAccounts())
            .add("name", getName())
            .add("testAccount", getTestAccount())
            .toString();
    }

    /**
     * Gets the name value for this ManagedCustomer.
     * 
     * @return name   * The name used by the manager to refer to the client.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ManagedCustomer.
     * 
     * @param name   * The name used by the manager to refer to the client.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the customerId value for this ManagedCustomer.
     * 
     * @return customerId   * The 10-digit ID that uniquely identifies the AdWords account.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CustomerId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public java.lang.Long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this ManagedCustomer.
     * 
     * @param customerId   * The 10-digit ID that uniquely identifies the AdWords account.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CustomerId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the canManageClients value for this ManagedCustomer.
     * 
     * @return canManageClients   * Whether this account can manage clients.
     *                 <span class="constraint ReadOnly">This field is read
     * only
     *                 and will be ignored when sent to the API.</span>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CanManageClients".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getCanManageClients() {
        return canManageClients;
    }


    /**
     * Sets the canManageClients value for this ManagedCustomer.
     * 
     * @param canManageClients   * Whether this account can manage clients.
     *                 <span class="constraint ReadOnly">This field is read
     * only
     *                 and will be ignored when sent to the API.</span>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CanManageClients".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCanManageClients(java.lang.Boolean canManageClients) {
        this.canManageClients = canManageClients;
    }


    /**
     * Gets the currencyCode value for this ManagedCustomer.
     * 
     * @return currencyCode   * The currency in which this account operates.
     *                 We support a subset of the currency codes derived
     * from the ISO 4217 standard.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/currencycodes"
     * >Currency Codes</a> for the currently supported currencies.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CurrencyCode".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive.</span>
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this ManagedCustomer.
     * 
     * @param currencyCode   * The currency in which this account operates.
     *                 We support a subset of the currency codes derived
     * from the ISO 4217 standard.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/currencycodes"
     * >Currency Codes</a> for the currently supported currencies.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CurrencyCode".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 3 and 3, inclusive.</span>
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the dateTimeZone value for this ManagedCustomer.
     * 
     * @return dateTimeZone   * The local timezone ID for this customer.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/timezones"
     * >Time Zone Codes</a> for the currently supported list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DateTimeZone".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getDateTimeZone() {
        return dateTimeZone;
    }


    /**
     * Sets the dateTimeZone value for this ManagedCustomer.
     * 
     * @param dateTimeZone   * The local timezone ID for this customer.
     *                 See <a href="https://developers.google.com/adwords/api/docs/appendix/timezones"
     * >Time Zone Codes</a> for the currently supported list.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DateTimeZone".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setDateTimeZone(java.lang.String dateTimeZone) {
        this.dateTimeZone = dateTimeZone;
    }


    /**
     * Gets the testAccount value for this ManagedCustomer.
     * 
     * @return testAccount   * Whether this managed customer's account is a test account.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TestAccount".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getTestAccount() {
        return testAccount;
    }


    /**
     * Sets the testAccount value for this ManagedCustomer.
     * 
     * @param testAccount   * Whether this managed customer's account is a test account.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TestAccount".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTestAccount(java.lang.Boolean testAccount) {
        this.testAccount = testAccount;
    }


    /**
     * Gets the accountLabels value for this ManagedCustomer.
     * 
     * @return accountLabels   * The list of account labels associated with this customer. Only
     * labels owned by the requesting
     *                 manager will be returned. To change the list of labels
     * applied to this customer, see
     *                 {@link ManagedCustomerService#mutateLabels}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccountLabels".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel[] getAccountLabels() {
        return accountLabels;
    }


    /**
     * Sets the accountLabels value for this ManagedCustomer.
     * 
     * @param accountLabels   * The list of account labels associated with this customer. Only
     * labels owned by the requesting
     *                 manager will be returned. To change the list of labels
     * applied to this customer, see
     *                 {@link ManagedCustomerService#mutateLabels}.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AccountLabels".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAccountLabels(com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel[] accountLabels) {
        this.accountLabels = accountLabels;
    }

    public com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel getAccountLabels(int i) {
        return this.accountLabels[i];
    }

    public void setAccountLabels(int i, com.google.api.ads.adwords.axis.v201802.mcm.AccountLabel _value) {
        this.accountLabels[i] = _value;
    }


    /**
     * Gets the excludeHiddenAccounts value for this ManagedCustomer.
     * 
     * @return excludeHiddenAccounts   * Specify ExcludeHiddenAccounts=true to exclude hidden accounts
     * during traversal.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "ExcludeHiddenAccounts".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getExcludeHiddenAccounts() {
        return excludeHiddenAccounts;
    }


    /**
     * Sets the excludeHiddenAccounts value for this ManagedCustomer.
     * 
     * @param excludeHiddenAccounts   * Specify ExcludeHiddenAccounts=true to exclude hidden accounts
     * during traversal.
     *                 <span class="constraint Filterable">This field can
     * be filtered on using the value "ExcludeHiddenAccounts".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setExcludeHiddenAccounts(java.lang.Boolean excludeHiddenAccounts) {
        this.excludeHiddenAccounts = excludeHiddenAccounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCustomer)) return false;
        ManagedCustomer other = (ManagedCustomer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.canManageClients==null && other.getCanManageClients()==null) || 
             (this.canManageClients!=null &&
              this.canManageClients.equals(other.getCanManageClients()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.dateTimeZone==null && other.getDateTimeZone()==null) || 
             (this.dateTimeZone!=null &&
              this.dateTimeZone.equals(other.getDateTimeZone()))) &&
            ((this.testAccount==null && other.getTestAccount()==null) || 
             (this.testAccount!=null &&
              this.testAccount.equals(other.getTestAccount()))) &&
            ((this.accountLabels==null && other.getAccountLabels()==null) || 
             (this.accountLabels!=null &&
              java.util.Arrays.equals(this.accountLabels, other.getAccountLabels()))) &&
            ((this.excludeHiddenAccounts==null && other.getExcludeHiddenAccounts()==null) || 
             (this.excludeHiddenAccounts!=null &&
              this.excludeHiddenAccounts.equals(other.getExcludeHiddenAccounts())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getCanManageClients() != null) {
            _hashCode += getCanManageClients().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDateTimeZone() != null) {
            _hashCode += getDateTimeZone().hashCode();
        }
        if (getTestAccount() != null) {
            _hashCode += getTestAccount().hashCode();
        }
        if (getAccountLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeHiddenAccounts() != null) {
            _hashCode += getExcludeHiddenAccounts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("testAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "testAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "accountLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "AccountLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeHiddenAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "excludeHiddenAccounts"));
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
