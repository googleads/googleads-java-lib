// Copyright 2026 Google LLC
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
 * TargetingPresetServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202605;

public class TargetingPresetServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.admanager.axis.v202605.TargetingPresetServiceInterface {
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
        oper.setName("createTargetingPresets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "targetingPresets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPreset"), com.google.api.ads.admanager.axis.v202605.TargetingPreset[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPreset"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.TargetingPreset[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiExceptionFault"),
                      "com.google.api.ads.admanager.axis.v202605.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTargetingPresetsByStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Statement"), com.google.api.ads.admanager.axis.v202605.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPresetPage"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.TargetingPresetPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiExceptionFault"),
                      "com.google.api.ads.admanager.axis.v202605.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performTargetingPresetAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "targetingPresetAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPresetAction"), com.google.api.ads.admanager.axis.v202605.TargetingPresetAction.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Statement"), com.google.api.ads.admanager.axis.v202605.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "UpdateResult"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.UpdateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiExceptionFault"),
                      "com.google.api.ads.admanager.axis.v202605.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateTargetingPresets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "targetingPresets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPreset"), com.google.api.ads.admanager.axis.v202605.TargetingPreset[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPreset"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.TargetingPreset[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiExceptionFault"),
                      "com.google.api.ads.admanager.axis.v202605.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiException"), 
                      true
                     ));
        _operations[3] = oper;

    }

    public TargetingPresetServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TargetingPresetServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TargetingPresetServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AdUnitTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AdUnitTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiVersionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ApiVersionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiVersionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ApiVersionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AudienceSegmentCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AudienceSegmentCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AudienceSegmentCriteria.ComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AudienceSegmentCriteriaComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "BandwidthGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.BandwidthGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "BandwidthGroupTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.BandwidthGroupTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "BooleanValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.BooleanValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Browser");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Browser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "BrowserLanguage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.BrowserLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "BrowserLanguageTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.BrowserLanguageTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "BrowserTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.BrowserTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "BuyerUserListTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.BuyerUserListTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CmsMetadataCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CmsMetadataCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CmsMetadataCriteria.ComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CmsMetadataCriteriaComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CollectionSizeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CollectionSizeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CollectionSizeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CollectionSizeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CommonError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CommonError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CommonError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CommonErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ContentLabelTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ContentLabelTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ContentTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ContentTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CustomCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CustomCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CustomCriteria.ComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CustomCriteriaComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CustomCriteriaLeaf");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CustomCriteriaLeaf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CustomCriteriaNode");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CustomCriteriaNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CustomCriteriaSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CustomCriteriaSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CustomCriteriaSet.LogicalOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CustomCriteriaSetLogicalOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CustomTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CustomTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "CustomTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.CustomTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Date");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DateTime");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DateTimeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DateTimeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DateTimeRangeTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DateTimeRangeTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DateTimeRangeTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DateTimeRangeTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DateTimeRangeTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DateTimeRangeTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DateTimeValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DateTimeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DateValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DateValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DayPart");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DayPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DayPartTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DayPartTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DayPartTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DayPartTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DayPartTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DayPartTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DeleteTargetingPresetAction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DeleteTargetingPresetAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DeliveryTimeZone");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DeliveryTimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DeviceCapability");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DeviceCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DeviceCapabilityTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DeviceCapabilityTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DeviceCategory");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DeviceCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DeviceCategoryTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DeviceCategoryTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DeviceManufacturer");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DeviceManufacturer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DeviceManufacturerTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DeviceManufacturerTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "EntityChildrenLimitReachedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.EntityChildrenLimitReachedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "EntityChildrenLimitReachedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.EntityChildrenLimitReachedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "EntityLimitReachedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.EntityLimitReachedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "EntityLimitReachedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.EntityLimitReachedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "FeatureError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.FeatureError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "FeatureError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.FeatureErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "FieldPathElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.FieldPathElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "GenericTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.GenericTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "GenericTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.GenericTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "GeoTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.GeoTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "GeoTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.GeoTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "GeoTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.GeoTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InventorySizeTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InventorySizeTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InventoryTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InventoryTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InventoryTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InventoryTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InventoryTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InventoryTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InventoryUrl");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InventoryUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InventoryUrlTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InventoryUrlTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Location");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MinuteOfHour");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MinuteOfHour.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileApplicationTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileApplicationTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileApplicationTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileApplicationTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileApplicationTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileApplicationTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileCarrier");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileCarrierTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileCarrierTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileDevice");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileDeviceSubmodel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileDeviceSubmodel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileDeviceSubmodelTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileDeviceSubmodelTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MobileDeviceTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MobileDeviceTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "NotNullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.NotNullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "NotNullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.NotNullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "NumberValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.NumberValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ObjectValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ObjectValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "OperatingSystem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.OperatingSystem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "OperatingSystemTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.OperatingSystemTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "OperatingSystemVersion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.OperatingSystemVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "OperatingSystemVersionTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.OperatingSystemVersionTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ParseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ParseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ParseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ParseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PermissionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PermissionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PermissionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PermissionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PublisherProvidedSignalsTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PublisherProvidedSignalsTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PublisherProvidedSignalsTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PublisherProvidedSignalsTargetingError.class;
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
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PublisherProvidedSignalsTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PublisherProvidedSignalsTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PublisherQueryLanguageContextError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PublisherQueryLanguageContextError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PublisherQueryLanguageContextError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PublisherQueryLanguageContextErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PublisherQueryLanguageSyntaxError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PublisherQueryLanguageSyntaxError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PublisherQueryLanguageSyntaxError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PublisherQueryLanguageSyntaxErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "QuotaError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.QuotaError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "QuotaError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.QuotaErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequestPlatform");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequestPlatform.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequestPlatformTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequestPlatformTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequestPlatformTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequestPlatformTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequestPlatformTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequestPlatformTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequiredCollectionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequiredCollectionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequiredCollectionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequiredCollectionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ServerError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ServerError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ServerError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ServerErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "SetValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.SetValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Size");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Size.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "SoapRequestHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.SoapRequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Statement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Statement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "StatementError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.StatementError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "StatementError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.StatementErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "String_ValueMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.String_ValueMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "StringFormatError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.StringFormatError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "StringFormatError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.StringFormatErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetedSize");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TargetedSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Targeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Targeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPreset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TargetingPreset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPresetAction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TargetingPresetAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TargetingPresetPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TargetingPresetPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Technology");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Technology.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TechnologyTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TechnologyTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TechnologyTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TechnologyTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TechnologyTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TechnologyTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TextValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TextValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TimeOfDay");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TimeOfDay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "UniqueError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.UniqueError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "UpdateResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.UpdateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "UserDomainTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.UserDomainTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "UserDomainTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.UserDomainTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "UserDomainTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.UserDomainTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Value");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Value.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VerticalTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VerticalTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoBumperType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoBumperType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoPosition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoPosition.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoPositionTarget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoPositionTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoPositionTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoPositionTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoPositionTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoPositionTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoPositionTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoPositionTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoPositionWithinPod");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoPositionWithinPod.class;
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

    public com.google.api.ads.admanager.axis.v202605.TargetingPreset[] createTargetingPresets(com.google.api.ads.admanager.axis.v202605.TargetingPreset[] targetingPresets) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "createTargetingPresets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {targetingPresets});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.TargetingPreset[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.TargetingPreset[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.TargetingPreset[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.admanager.axis.v202605.ApiException) {
              throw (com.google.api.ads.admanager.axis.v202605.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.admanager.axis.v202605.TargetingPresetPage getTargetingPresetsByStatement(com.google.api.ads.admanager.axis.v202605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "getTargetingPresetsByStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.TargetingPresetPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.TargetingPresetPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.TargetingPresetPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.admanager.axis.v202605.ApiException) {
              throw (com.google.api.ads.admanager.axis.v202605.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.admanager.axis.v202605.UpdateResult performTargetingPresetAction(com.google.api.ads.admanager.axis.v202605.TargetingPresetAction targetingPresetAction, com.google.api.ads.admanager.axis.v202605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "performTargetingPresetAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {targetingPresetAction, filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.UpdateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.UpdateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.UpdateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.admanager.axis.v202605.ApiException) {
              throw (com.google.api.ads.admanager.axis.v202605.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.admanager.axis.v202605.TargetingPreset[] updateTargetingPresets(com.google.api.ads.admanager.axis.v202605.TargetingPreset[] targetingPresets) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "updateTargetingPresets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {targetingPresets});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.TargetingPreset[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.TargetingPreset[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.TargetingPreset[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.admanager.axis.v202605.ApiException) {
              throw (com.google.api.ads.admanager.axis.v202605.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
