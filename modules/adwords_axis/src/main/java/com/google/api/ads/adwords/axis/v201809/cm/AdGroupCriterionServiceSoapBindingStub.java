// Copyright 2018 Google LLC
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
 * AdGroupCriterionServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;

public class AdGroupCriterionServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "serviceSelector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Selector"), com.google.api.ads.adwords.axis.v201809.cm.Selector.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionPage"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201809.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mutate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionOperation"), com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionOperation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionReturnValue"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201809.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mutateLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionLabelOperation"), com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelOperation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionLabelReturnValue"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelReturnValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201809.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionPage"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201809.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiException"), 
                      true
                     ));
        _operations[3] = oper;

    }

    public AdGroupCriterionServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AdGroupCriterionServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AdGroupCriterionServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings2();
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionLabelOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionLabelReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionLimitExceeded");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLimitExceeded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionLimitExceeded.CriteriaLimitType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLimitExceededCriteriaLimitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdGroupCriterionReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdxError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdxError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AdxError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AdxErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AgeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AgeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AgeRange.AgeRangeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AgeRangeAgeRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AppPaymentModel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AppPaymentModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AppPaymentModel.AppPaymentModelType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AppPaymentModelAppPaymentModelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ApprovalStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AppUrl");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AppUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AppUrl.OsType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AppUrlOsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AppUrlList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AppUrlList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AuthorizationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AuthorizationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AuthorizationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.AuthorizationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Bid");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Bid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "BiddableAdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.BiddableAdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "BiddingErrors");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.BiddingErrors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "BiddingErrors.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.BiddingErrorsReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "BiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.BiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "BiddingStrategyConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "BiddingStrategySource");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategySource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "BiddingStrategyType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Bids");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Bids.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "BidSource");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.BidSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ClientTermsError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ClientTermsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ClientTermsError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ClientTermsErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CollectionSizeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CollectionSizeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CollectionSizeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CollectionSizeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ComparableValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ComparableValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CpaBid");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CpaBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CpcBid");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CpcBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CpmBid");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CpmBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Criterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Criterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Criterion.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionCustomAffinity");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionCustomAffinity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionCustomIntent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionCustomIntent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionParameter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionPolicyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionPolicyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionUse");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionUse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionUserInterest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionUserInterest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionUserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionUserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CriterionUserList.MembershipStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CriterionUserListMembershipStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CustomParameter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CustomParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CustomParameters");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CustomParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DatabaseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DatabaseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DatabaseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DatabaseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DateError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DateError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DateErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DisplayAttribute");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DisplayAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DistinctError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DistinctError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DistinctError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DistinctErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DoubleValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.DoubleValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "EntityAccessDenied");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.EntityAccessDenied.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "EntityAccessDenied.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.EntityAccessDeniedReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "EntityCountLimitExceeded");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.EntityCountLimitExceeded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "EntityCountLimitExceeded.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.EntityCountLimitExceededReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "EntityNotFound");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.EntityNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "EntityNotFound.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.EntityNotFoundReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ExemptionRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ExemptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "FieldPathElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.FieldPathElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ForwardCompatibilityError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ForwardCompatibilityError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ForwardCompatibilityError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ForwardCompatibilityErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Gender");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Gender.GenderType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.GenderGenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "IdError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.IdError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "IdError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.IdErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "IncomeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.IncomeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "IncomeRange.IncomeRangeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.IncomeRangeIncomeRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Keyword");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Keyword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "KeywordMatchType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.KeywordMatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Label");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Label.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Label.Status");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.LabelStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "LabelAttribute");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.LabelAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ListReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "LongValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.LongValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ManualCpcBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ManualCpcBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ManualCpmBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ManualCpmBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MaximizeConversionsBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.MaximizeConversionsBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MaximizeConversionValueBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.MaximizeConversionValueBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MobileAppCategory");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.MobileAppCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MobileApplication");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.MobileApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Money");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MultiplierError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.MultiplierError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MultiplierError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.MultiplierErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "NegativeAdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.NegativeAdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "NewEntityCreationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.NewEntityCreationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "NewEntityCreationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.NewEntityCreationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "NotEmptyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.NotEmptyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "NotEmptyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.NotEmptyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.NullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "NumberValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.NumberValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Operation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "OperationAccessDenied");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.OperationAccessDenied.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "OperationAccessDenied.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.OperationAccessDeniedReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Operator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "OperatorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.OperatorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "OperatorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.OperatorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "OrderBy");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.OrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Page");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PageOnePromotedBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.PageOnePromotedBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PageOnePromotedBiddingScheme.StrategyGoal");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.PageOnePromotedBiddingSchemeStrategyGoal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Paging");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Paging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PagingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.PagingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PagingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.PagingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Parent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Parent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Parent.ParentType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ParentParentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Placement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Placement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicyViolationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.PolicyViolationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicyViolationError.Part");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.PolicyViolationErrorPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicyViolationKey");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.PolicyViolationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Predicate");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Predicate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Predicate.Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.PredicateOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductAdwordsGrouping");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductAdwordsGrouping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductAdwordsLabels");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductAdwordsLabels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductBiddingCategory");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductBiddingCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductBrand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductBrand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductCanonicalCondition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductCanonicalCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductCanonicalCondition.Condition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductCanonicalConditionCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductChannel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductChannelExclusivity");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductChannelExclusivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductCustomAttribute");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductCustomAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductDimension");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductDimension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductDimensionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductDimensionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductLegacyCondition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductLegacyCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductOfferId");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductOfferId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductPartition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductPartition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductPartitionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductPartitionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ProductTypeFull");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ProductTypeFull.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "QualityInfo");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.QualityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "QueryError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.QueryError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "QueryError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.QueryErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "QuotaCheckError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.QuotaCheckError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "QuotaCheckError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.QuotaCheckErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RateExceededError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RateExceededError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RateExceededError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RateExceededErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ReadOnlyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ReadOnlyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ReadOnlyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ReadOnlyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RejectedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RejectedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RejectedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RejectedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RequestError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RequestError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RequestError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RequestErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Selector");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Selector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SelectorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SelectorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SelectorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SelectorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ShoppingProductChannel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ShoppingProductChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ShoppingProductChannelExclusivity");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ShoppingProductChannelExclusivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SizeLimitError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SizeLimitError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SizeLimitError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SizeLimitErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SoapHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SoapHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "StatsQueryError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.StatsQueryError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "StatsQueryError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.StatsQueryErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "String_StringMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.String_StringMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "StringFormatError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.StringFormatError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "StringFormatError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.StringFormatErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SystemServingStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SystemServingStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "TargetCpaBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.TargetCpaBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "TargetOutrankShareBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.TargetOutrankShareBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "TargetRoasBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.TargetRoasBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "TargetSpendBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.TargetSpendBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "TextLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.TextLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "UnknownProductDimension");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.UnknownProductDimension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "UrlError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.UrlError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "UrlError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.UrlErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "UrlList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.UrlList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "UserStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.UserStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Vertical");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Vertical.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Webpage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Webpage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "WebpageCondition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.WebpageCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "WebpageConditionOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "WebpageConditionOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "WebpageParameter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.WebpageParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "YouTubeChannel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.YouTubeChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "YouTubeVideo");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.YouTubeVideo.class;
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

    public com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage get(com.google.api.ads.adwords.axis.v201809.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceSelector});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.adwords.axis.v201809.cm.ApiException) {
              throw (com.google.api.ads.adwords.axis.v201809.cm.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue mutate(com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "mutate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.adwords.axis.v201809.cm.ApiException) {
              throw (com.google.api.ads.adwords.axis.v201809.cm.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelReturnValue mutateLabel(com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "mutateLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelReturnValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelReturnValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionLabelReturnValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.adwords.axis.v201809.cm.ApiException) {
              throw (com.google.api.ads.adwords.axis.v201809.cm.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.adwords.axis.v201809.cm.ApiException) {
              throw (com.google.api.ads.adwords.axis.v201809.cm.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
