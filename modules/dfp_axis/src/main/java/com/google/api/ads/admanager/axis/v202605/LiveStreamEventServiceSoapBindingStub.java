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
 * LiveStreamEventServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202605;

public class LiveStreamEventServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.admanager.axis.v202605.LiveStreamEventServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createLiveStreamEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "liveStreamEvents"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEvent"), com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEvent"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[].class);
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
        oper.setName("createSlates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "slates"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Slate"), com.google.api.ads.admanager.axis.v202605.Slate[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Slate"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.Slate[].class);
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
        oper.setName("getLiveStreamEventsByStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Statement"), com.google.api.ads.admanager.axis.v202605.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventPage"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.LiveStreamEventPage.class);
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
        oper.setName("getSlatesByStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "statement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Statement"), com.google.api.ads.admanager.axis.v202605.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "SlatePage"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.SlatePage.class);
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

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performLiveStreamEventAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "liveStreamEventAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventAction"), com.google.api.ads.admanager.axis.v202605.LiveStreamEventAction.class, false, false);
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
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performSlateAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "slateAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "SlateAction"), com.google.api.ads.admanager.axis.v202605.SlateAction.class, false, false);
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
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateLiveStreamEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "liveStreamEvents"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEvent"), com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEvent"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiExceptionFault"),
                      "com.google.api.ads.admanager.axis.v202605.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSlates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "slates"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Slate"), com.google.api.ads.admanager.axis.v202605.Slate[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Slate"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202605.Slate[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiExceptionFault"),
                      "com.google.api.ads.admanager.axis.v202605.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ApiException"), 
                      true
                     ));
        _operations[7] = oper;

    }

    public LiveStreamEventServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LiveStreamEventServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LiveStreamEventServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ActivateLiveStreamEvents");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ActivateLiveStreamEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AdBreakFillType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AdBreakFillType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AdBreakMarkupError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AdBreakMarkupError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AdBreakMarkupError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AdBreakMarkupErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AdBreakMarkupType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AdBreakMarkupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "AdServingFormat");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.AdServingFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ArchiveLiveStreamEvents");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ArchiveLiveStreamEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "ArchiveSlates");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.ArchiveSlates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "BooleanValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.BooleanValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DashBridge");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DashBridge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "DynamicAdInsertionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.DynamicAdInsertionType.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "HlsSettings");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.HlsSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InvalidUrlError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InvalidUrlError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "InvalidUrlError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.InvalidUrlErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamConditioning");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamConditioning.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventAction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventActionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventActionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventActionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventActionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventCdnSettingsError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventCdnSettingsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventCdnSettingsError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventCdnSettingsErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventConditioningError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventConditioningError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventConditioningError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventConditioningErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventCustomAssetKeyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventCustomAssetKeyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventCustomAssetKeyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventCustomAssetKeyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventDateTimeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventDateTimeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventDateTimeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventDateTimeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventDvrWindowError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventDvrWindowError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventDvrWindowError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventDvrWindowErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventPrerollSettingsError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventPrerollSettingsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventPrerollSettingsError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventPrerollSettingsErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventSlateError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventSlateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventSlateError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventSlateErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "LiveStreamEventStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.LiveStreamEventStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "MasterPlaylistSettings");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.MasterPlaylistSettings.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.NullErrorReason.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PauseLiveStreamEventAds");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PauseLiveStreamEventAds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PauseLiveStreamEvents");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PauseLiveStreamEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PlaylistType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PlaylistType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PrefetchSettings");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PrefetchSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "PrerollSettings");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.PrerollSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RefreshLiveStreamEventMasterPlaylists");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RefreshLiveStreamEventMasterPlaylists.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RefreshType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RefreshType.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequiredNumberError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequiredNumberError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "RequiredNumberError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.RequiredNumberErrorReason.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Slate");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Slate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "SlateAction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.SlateAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "SlatePage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.SlatePage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "SlateStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.SlateStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "StartDateTimeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.StartDateTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Statement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Statement.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "StreamingFormat");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.StreamingFormat.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TextValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TextValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "TranscodeStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.TranscodeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "UnarchiveSlates");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.UnarchiveSlates.class;
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

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "Value");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.Value.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoAdTagError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoAdTagError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "VideoAdTagError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202605.VideoAdTagErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[] createLiveStreamEvents(com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[] liveStreamEvents) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "createLiveStreamEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {liveStreamEvents});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[].class);
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

    public com.google.api.ads.admanager.axis.v202605.Slate[] createSlates(com.google.api.ads.admanager.axis.v202605.Slate[] slates) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "createSlates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {slates});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.Slate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.Slate[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.Slate[].class);
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

    public com.google.api.ads.admanager.axis.v202605.LiveStreamEventPage getLiveStreamEventsByStatement(com.google.api.ads.admanager.axis.v202605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "getLiveStreamEventsByStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.LiveStreamEventPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.LiveStreamEventPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.LiveStreamEventPage.class);
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

    public com.google.api.ads.admanager.axis.v202605.SlatePage getSlatesByStatement(com.google.api.ads.admanager.axis.v202605.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "getSlatesByStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {statement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.SlatePage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.SlatePage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.SlatePage.class);
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

    public com.google.api.ads.admanager.axis.v202605.UpdateResult performLiveStreamEventAction(com.google.api.ads.admanager.axis.v202605.LiveStreamEventAction liveStreamEventAction, com.google.api.ads.admanager.axis.v202605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "performLiveStreamEventAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {liveStreamEventAction, filterStatement});

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

    public com.google.api.ads.admanager.axis.v202605.UpdateResult performSlateAction(com.google.api.ads.admanager.axis.v202605.SlateAction slateAction, com.google.api.ads.admanager.axis.v202605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "performSlateAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {slateAction, filterStatement});

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

    public com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[] updateLiveStreamEvents(com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[] liveStreamEvents) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "updateLiveStreamEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {liveStreamEvents});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.LiveStreamEvent[].class);
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

    public com.google.api.ads.admanager.axis.v202605.Slate[] updateSlates(com.google.api.ads.admanager.axis.v202605.Slate[] slates) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202605.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202605", "updateSlates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {slates});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202605.Slate[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202605.Slate[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202605.Slate[].class);
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
