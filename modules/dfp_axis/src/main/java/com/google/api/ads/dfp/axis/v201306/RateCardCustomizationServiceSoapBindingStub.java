/**
 * RateCardCustomizationServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;

public class RateCardCustomizationServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfp.axis.v201306.RateCardCustomizationServiceInterface {
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
        oper.setName("createRateCardCustomization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rateCardCustomization"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"), com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class);
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
        oper.setName("createRateCardCustomizations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rateCardCustomizations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"), com.google.api.ads.dfp.axis.v201306.RateCardCustomization[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.RateCardCustomization[].class);
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
        oper.setName("getRateCardCustomization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rateCardCustomizationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class);
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
        oper.setName("getRateCardCustomizationsByStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Statement"), com.google.api.ads.dfp.axis.v201306.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomizationPage"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.RateCardCustomizationPage.class);
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
        oper.setName("performRateCardCustomizationAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rateCardCustomizationAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomizationAction"), com.google.api.ads.dfp.axis.v201306.RateCardCustomizationAction.class, false, false);
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
        oper.setName("updateRateCardCustomization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rateCardCustomization"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"), com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class);
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
        oper.setName("updateRateCardCustomizations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "rateCardCustomizations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"), com.google.api.ads.dfp.axis.v201306.RateCardCustomization[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization"));
        oper.setReturnClass(com.google.api.ads.dfp.axis.v201306.RateCardCustomization[].class);
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

    public RateCardCustomizationServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RateCardCustomizationServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RateCardCustomizationServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ActivateRateCardCustomizations");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.ActivateRateCardCustomizations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AdUnitRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.AdUnitRateCardFeature.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BandwidthRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BandwidthRateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BooleanValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BooleanValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BrowserLanguageRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BrowserLanguageRateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BrowserRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.BrowserRateCardFeature.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "CustomTargetingRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.CustomTargetingRateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DeactivateRateCardCustomizations");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.DeactivateRateCardCustomizations.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "FrequencyCapRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.FrequencyCapRateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "GeographyRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.GeographyRateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.NullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "OperatingSystemRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.OperatingSystemRateCardFeature.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "PlacementRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.PlacementRateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomization");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomizationAction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateCardCustomizationAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomizationAdjustmentType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateCardCustomizationAdjustmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomizationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateCardCustomizationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomizationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateCardCustomizationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomizationPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateCardCustomizationPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardCustomizationStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateCardCustomizationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "RateType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.RateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "TextValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.TextValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UnknownRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UnknownRateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UpdateResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UpdateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "UserDomainRateCardFeature");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.UserDomainRateCardFeature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Value");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfp.axis.v201306.Value.class;
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

    public com.google.api.ads.dfp.axis.v201306.RateCardCustomization createRateCardCustomization(com.google.api.ads.dfp.axis.v201306.RateCardCustomization rateCardCustomization) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "createRateCardCustomization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rateCardCustomization});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class);
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

    public com.google.api.ads.dfp.axis.v201306.RateCardCustomization[] createRateCardCustomizations(com.google.api.ads.dfp.axis.v201306.RateCardCustomization[] rateCardCustomizations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "createRateCardCustomizations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rateCardCustomizations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.RateCardCustomization[].class);
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

    public com.google.api.ads.dfp.axis.v201306.RateCardCustomization getRateCardCustomization(java.lang.Long rateCardCustomizationId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "getRateCardCustomization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rateCardCustomizationId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class);
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

    public com.google.api.ads.dfp.axis.v201306.RateCardCustomizationPage getRateCardCustomizationsByStatement(com.google.api.ads.dfp.axis.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "getRateCardCustomizationsByStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomizationPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomizationPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.RateCardCustomizationPage.class);
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

    public com.google.api.ads.dfp.axis.v201306.UpdateResult performRateCardCustomizationAction(com.google.api.ads.dfp.axis.v201306.RateCardCustomizationAction rateCardCustomizationAction, com.google.api.ads.dfp.axis.v201306.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "performRateCardCustomizationAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rateCardCustomizationAction, filterStatement});

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

    public com.google.api.ads.dfp.axis.v201306.RateCardCustomization updateRateCardCustomization(com.google.api.ads.dfp.axis.v201306.RateCardCustomization rateCardCustomization) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "updateRateCardCustomization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rateCardCustomization});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.RateCardCustomization.class);
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

    public com.google.api.ads.dfp.axis.v201306.RateCardCustomization[] updateRateCardCustomizations(com.google.api.ads.dfp.axis.v201306.RateCardCustomization[] rateCardCustomizations) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201306.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "updateRateCardCustomizations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rateCardCustomizations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfp.axis.v201306.RateCardCustomization[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfp.axis.v201306.RateCardCustomization[].class);
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
