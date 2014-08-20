/**
 * ManagedCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.mcm;


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

    /* The email address of the account's first login user, if any.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Login".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String login;

    /* The company name of the account, if any.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CompanyName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String companyName;

    /* The 10-digit ID that uniquely identifies the AdWords account.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CustomerId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long customerId;

    /* Whether this account can manage clients.
     *                 This field is read only for external clients and will
     * be ignored when sent to the API.
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

    public ManagedCustomer() {
    }

    public ManagedCustomer(
           java.lang.String name,
           java.lang.String login,
           java.lang.String companyName,
           java.lang.Long customerId,
           java.lang.Boolean canManageClients,
           java.lang.String currencyCode,
           java.lang.String dateTimeZone,
           java.lang.Boolean testAccount) {
           this.name = name;
           this.login = login;
           this.companyName = companyName;
           this.customerId = customerId;
           this.canManageClients = canManageClients;
           this.currencyCode = currencyCode;
           this.dateTimeZone = dateTimeZone;
           this.testAccount = testAccount;
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
     * Gets the login value for this ManagedCustomer.
     * 
     * @return login   * The email address of the account's first login user, if any.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Login".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this ManagedCustomer.
     * 
     * @param login   * The email address of the account's first login user, if any.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Login".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the companyName value for this ManagedCustomer.
     * 
     * @return companyName   * The company name of the account, if any.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CompanyName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this ManagedCustomer.
     * 
     * @param companyName   * The company name of the account, if any.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CompanyName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the customerId value for this ManagedCustomer.
     * 
     * @return customerId   * The 10-digit ID that uniquely identifies the AdWords account.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CustomerId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
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
     * only and will be ignored when sent to the API.</span>
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the canManageClients value for this ManagedCustomer.
     * 
     * @return canManageClients   * Whether this account can manage clients.
     *                 This field is read only for external clients and will
     * be ignored when sent to the API.
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
     *                 This field is read only for external clients and will
     * be ignored when sent to the API.
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
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
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
              this.testAccount.equals(other.getTestAccount())));
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
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManagedCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "ManagedCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "companyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canManageClients");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "canManageClients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "dateTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201402", "testAccount"));
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
