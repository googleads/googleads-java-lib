// Copyright 2021 Google LLC
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
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202108;

public class TargetingPresetServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.admanager.axis.v202108.TargetingPresetServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTargetingPresetsByStatement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "filterStatement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "Statement"), com.google.api.ads.admanager.axis.v202108.Statement.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "TargetingPresetPage"));
        oper.setReturnClass(com.google.api.ads.admanager.axis.v202108.TargetingPresetPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ApiExceptionFault"),
                      "com.google.api.ads.admanager.axis.v202108.ApiException",
                      new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

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
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "AdUnitTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.AdUnitTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ApiVersionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ApiVersionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ApiVersionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ApiVersionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "AudienceSegmentCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.AudienceSegmentCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "AudienceSegmentCriteria.ComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.AudienceSegmentCriteriaComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BandwidthGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.BandwidthGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BandwidthGroupTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.BandwidthGroupTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BooleanValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.BooleanValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "Browser");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.Browser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BrowserLanguage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.BrowserLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BrowserLanguageTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.BrowserLanguageTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BrowserTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.BrowserTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "BuyerUserListTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.BuyerUserListTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CmsMetadataCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CmsMetadataCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CmsMetadataCriteria.ComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CmsMetadataCriteriaComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CollectionSizeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CollectionSizeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CollectionSizeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CollectionSizeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CommonError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CommonError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CommonError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CommonErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ContentTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ContentTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CustomCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CustomCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CustomCriteria.ComparisonOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CustomCriteriaComparisonOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CustomCriteriaLeaf");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CustomCriteriaLeaf.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CustomCriteriaNode");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CustomCriteriaNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CustomCriteriaSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CustomCriteriaSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CustomCriteriaSet.LogicalOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CustomCriteriaSetLogicalOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CustomTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CustomTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "CustomTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.CustomTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "Date");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DateTime");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DateTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DateTimeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DateTimeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DateTimeRangeTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DateTimeRangeTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DateTimeRangeTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DateTimeRangeTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DateTimeRangeTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DateTimeRangeTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DateTimeValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DateTimeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DateValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DateValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DayPart");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DayPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DayPartTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DayPartTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DayPartTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DayPartTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DayPartTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DayPartTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DeliveryTimeZone");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DeliveryTimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DeviceCapability");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DeviceCapability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DeviceCapabilityTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DeviceCapabilityTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DeviceCategory");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DeviceCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DeviceCategoryTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DeviceCategoryTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DeviceManufacturer");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DeviceManufacturer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "DeviceManufacturerTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.DeviceManufacturerTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "EntityChildrenLimitReachedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.EntityChildrenLimitReachedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "EntityChildrenLimitReachedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.EntityChildrenLimitReachedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "FeatureError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.FeatureError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "FeatureError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.FeatureErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "FieldPathElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.FieldPathElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "GenericTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.GenericTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "GenericTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.GenericTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "GeoTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.GeoTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "GeoTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.GeoTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "GeoTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.GeoTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "InventoryTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.InventoryTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "InventoryTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.InventoryTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "InventoryTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.InventoryTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "Location");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MinuteOfHour");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MinuteOfHour.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileApplicationTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileApplicationTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileApplicationTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileApplicationTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileApplicationTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileApplicationTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileCarrier");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileCarrierTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileCarrierTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileDevice");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileDeviceSubmodel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileDeviceSubmodel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileDeviceSubmodelTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileDeviceSubmodelTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "MobileDeviceTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.MobileDeviceTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "NotNullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.NotNullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "NotNullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.NotNullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "NumberValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.NumberValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ObjectValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ObjectValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "OperatingSystem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.OperatingSystem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "OperatingSystemTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.OperatingSystemTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "OperatingSystemVersion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.OperatingSystemVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "OperatingSystemVersionTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.OperatingSystemVersionTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ParseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ParseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ParseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ParseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "PermissionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.PermissionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "PermissionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.PermissionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "PublisherQueryLanguageContextError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.PublisherQueryLanguageContextError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "PublisherQueryLanguageContextError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.PublisherQueryLanguageContextErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "PublisherQueryLanguageSyntaxError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.PublisherQueryLanguageSyntaxError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "PublisherQueryLanguageSyntaxError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.PublisherQueryLanguageSyntaxErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "QuotaError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.QuotaError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "QuotaError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.QuotaErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "RequestPlatform");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.RequestPlatform.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "RequestPlatformTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.RequestPlatformTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "RequestPlatformTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.RequestPlatformTargetingError.class;
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
            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "RequestPlatformTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.RequestPlatformTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "RequiredCollectionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.RequiredCollectionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "RequiredCollectionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.RequiredCollectionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ServerError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ServerError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "ServerError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.ServerErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "SetValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.SetValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "SoapRequestHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.SoapRequestHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "Statement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.Statement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "StatementError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.StatementError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "StatementError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.StatementErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "String_ValueMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.String_ValueMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "StringFormatError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.StringFormatError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "StringFormatError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.StringFormatErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "Targeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.Targeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "TargetingPreset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.TargetingPreset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "TargetingPresetPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.TargetingPresetPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "Technology");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.Technology.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "TechnologyTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.TechnologyTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "TechnologyTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.TechnologyTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "TechnologyTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.TechnologyTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "TextValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.TextValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "TimeOfDay");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.TimeOfDay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "UniqueError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.UniqueError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "UserDomainTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.UserDomainTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "UserDomainTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.UserDomainTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "UserDomainTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.UserDomainTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "Value");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.Value.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "VideoBumperType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.VideoBumperType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "VideoPosition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.VideoPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "VideoPosition.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.VideoPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "VideoPositionTarget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.VideoPositionTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "VideoPositionTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.VideoPositionTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "VideoPositionTargetingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.VideoPositionTargetingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "VideoPositionTargetingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.VideoPositionTargetingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "VideoPositionWithinPod");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.admanager.axis.v202108.VideoPositionWithinPod.class;
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

    public com.google.api.ads.admanager.axis.v202108.TargetingPresetPage getTargetingPresetsByStatement(com.google.api.ads.admanager.axis.v202108.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202108.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202108", "getTargetingPresetsByStatement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterStatement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.admanager.axis.v202108.TargetingPresetPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.admanager.axis.v202108.TargetingPresetPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.admanager.axis.v202108.TargetingPresetPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.admanager.axis.v202108.ApiException) {
              throw (com.google.api.ads.admanager.axis.v202108.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
