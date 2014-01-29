/**
 * ProposalLineItemServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;

public class ProposalLineItemServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfp.axis.v201306.ProposalLineItemServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProposalLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "proposalLineItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"), com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201306.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProposalLineItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "proposalLineItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"), com.google.api.ads.dfp.axis.v201306.ProposalLineItem[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.ProposalLineItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201306.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProposalLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "proposalLineItemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201306.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProposalLineItemsByStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Statement"), com.google.api.ads.dfp.axis.v201306.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemPage"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.ProposalLineItemPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201306.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performProposalLineItemAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "proposalLineItemAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemAction"), com.google.api.ads.dfp.axis.v201306.ProposalLineItemAction.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Statement"), com.google.api.ads.dfp.axis.v201306.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UpdateResult"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.UpdateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201306.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateProposalLineItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "proposalLineItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"), com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201306.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateProposalLineItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "proposalLineItems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"), com.google.api.ads.dfp.axis.v201306.ProposalLineItem[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.ProposalLineItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiExceptionFault"),
                      "com.google.api.ads.dfp.axis.v201306.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiException"), 
                      true
                     ));
        _operations[6] = oper;

    }

    public ProposalLineItemServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProposalLineItemServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProposalLineItemServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AdUnitTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.AdUnitTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiVersionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ApiVersionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApiVersionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ApiVersionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AppliedLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.AppliedLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ArchiveProposalLineItems");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ArchiveProposalLineItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AudienceSegmentCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.AudienceSegmentCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AudienceSegmentCriteria.ComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.AudienceSegmentCriteriaComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Authentication");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Authentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BandwidthGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BandwidthGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BandwidthGroupTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BandwidthGroupTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BaseCustomFieldValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BillingCap");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BillingCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BillingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BillingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BillingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BillingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BillingSchedule");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BillingSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BillingSource");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BillingSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BooleanValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BooleanValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Browser");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Browser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BrowserLanguage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BrowserLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BrowserLanguageTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BrowserLanguageTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BrowserTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BrowserTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CityLocation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CityLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ClientLogin");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ClientLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CommonError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CommonError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CommonError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CommonErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CompanionDeliveryOption");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CompanionDeliveryOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ComputedStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ComputedStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ContentTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ContentTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CostAdjustment");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CostAdjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CostType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CostType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CountryLocation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CountryLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativePlaceholder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CreativePlaceholder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativeRotationType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CreativeRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CreativeSizeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CreativeSizeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomCriteria.ComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomCriteriaComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomCriteriaLeaf");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomCriteriaLeaf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomCriteriaNode");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomCriteriaNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomCriteriaSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomCriteriaSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomCriteriaSet.LogicalOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomCriteriaSetLogicalOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomFieldValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomFieldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomFieldValueError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomFieldValueError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomFieldValueError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomFieldValueErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Date");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTimeValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DateTimeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DateValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DayPart");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DayPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DayPartTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DayPartTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DayPartTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DayPartTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DayPartTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DayPartTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeliveryData");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeliveryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeliveryIndicator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeliveryIndicator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeliveryRateType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeliveryRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeliveryTimeZone");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeliveryTimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeviceCapability");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeviceCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeviceCapabilityTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeviceCapabilityTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeviceCategory");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeviceCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeviceCategoryTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeviceCategoryTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeviceManufacturer");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeviceManufacturer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeviceManufacturerTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeviceManufacturerTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DropDownCustomFieldValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DropDownCustomFieldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FeatureError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.FeatureError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FeatureError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.FeatureErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FrequencyCap");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.FrequencyCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FrequencyCapError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.FrequencyCapError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FrequencyCapError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.FrequencyCapErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "GenericTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.GenericTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "GenericTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.GenericTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "GeoTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.GeoTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "GeoTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.GeoTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "GeoTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.GeoTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "InventoryTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.InventoryTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "InventoryTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.InventoryTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "InventoryTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.InventoryTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LabelEntityAssociationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.LabelEntityAssociationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LabelEntityAssociationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.LabelEntityAssociationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "LineItemType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.LineItemType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Location");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "MetroLocation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.MetroLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "MinuteOfHour");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.MinuteOfHour.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "MobileCarrier");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.MobileCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "MobileCarrierTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.MobileCarrierTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "MobileDevice");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.MobileDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "MobileDeviceSubmodel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.MobileDeviceSubmodel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "MobileDeviceSubmodelTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.MobileDeviceSubmodelTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "MobileDeviceTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.MobileDeviceTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Money");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "NotNullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.NotNullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "NotNullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.NotNullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "NumberValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.NumberValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "OAuth");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.OAuth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "OperatingSystem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.OperatingSystem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "OperatingSystemTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.OperatingSystemTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "OperatingSystemVersion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.OperatingSystemVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "OperatingSystemVersionTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.OperatingSystemVersionTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PermissionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PermissionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PermissionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PermissionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PostalCodeLocation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PostalCodeLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PrecisionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PrecisionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PrecisionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PrecisionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProductError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProductError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProductErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemAction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItemAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemActionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItemActionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemActionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItemActionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItemError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItemErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItemPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemPremium");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItemPremium.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalLineItemPremiumStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ProposalLineItemPremiumStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PublisherQueryLanguageContextError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PublisherQueryLanguageContextError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PublisherQueryLanguageContextError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PublisherQueryLanguageContextErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PublisherQueryLanguageSyntaxError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PublisherQueryLanguageSyntaxError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PublisherQueryLanguageSyntaxError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PublisherQueryLanguageSyntaxErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "QuotaError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.QuotaError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "QuotaError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.QuotaErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RegionLocation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RegionLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RequiredNumberError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RequiredNumberError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RequiredNumberError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RequiredNumberErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ReservationDetailsError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ReservationDetailsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ReservationDetailsError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ReservationDetailsErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RoadblockingType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RoadblockingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ServerError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ServerError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ServerError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ServerErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Size");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Size.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "SoapRequestHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.SoapRequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Statement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Statement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "StatementError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.StatementError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "StatementError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.StatementErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "String_ValueMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.String_ValueMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Targeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Targeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TeamError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TeamError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TeamError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TeamErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Technology");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Technology.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TechnologyTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TechnologyTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TechnologyTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TechnologyTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TechnologyTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TechnologyTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TextValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TextValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TimeOfDay");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TimeOfDay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TimeUnit");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TimeUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UnarchiveProposalLineItems");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UnarchiveProposalLineItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UniqueError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UniqueError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UpdateResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UpdateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UserDomainTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UserDomainTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UserDomainTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UserDomainTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UserDomainTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UserDomainTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Value");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Value.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "VideoBumperType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.VideoBumperType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "VideoPosition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.VideoPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "VideoPosition.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.VideoPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "VideoPositionTarget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.VideoPositionTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "VideoPositionTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.VideoPositionTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "VideoPositionWithinPod");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.VideoPositionWithinPod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.google.api.ads.dfp.axis.v201306.ProposalLineItem createProposalLineItem(com.google.api.ads.dfp.axis.v201306.ProposalLineItem proposalLineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "createProposalLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proposalLineItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201306.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201306.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201306.ProposalLineItem[] createProposalLineItems(com.google.api.ads.dfp.axis.v201306.ProposalLineItem[] proposalLineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "createProposalLineItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proposalLineItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.ProposalLineItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201306.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201306.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201306.ProposalLineItem getProposalLineItem(java.lang.Long proposalLineItemId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "getProposalLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proposalLineItemId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201306.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201306.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201306.ProposalLineItemPage getProposalLineItemsByStatement(com.google.api.ads.dfp.axis.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "getProposalLineItemsByStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItemPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItemPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.ProposalLineItemPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201306.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201306.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201306.UpdateResult performProposalLineItemAction(com.google.api.ads.dfp.axis.v201306.ProposalLineItemAction proposalLineItemAction, com.google.api.ads.dfp.axis.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "performProposalLineItemAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proposalLineItemAction, filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.UpdateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.UpdateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.UpdateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201306.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201306.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201306.ProposalLineItem updateProposalLineItem(com.google.api.ads.dfp.axis.v201306.ProposalLineItem proposalLineItem) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "updateProposalLineItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proposalLineItem});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.ProposalLineItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201306.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201306.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfp.axis.v201306.ProposalLineItem[] updateProposalLineItems(com.google.api.ads.dfp.axis.v201306.ProposalLineItem[] proposalLineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "updateProposalLineItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {proposalLineItems});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.ProposalLineItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.ProposalLineItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfp.axis.v201306.ApiException) {
              throw (com.google.api.ads.dfp.axis.v201306.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
