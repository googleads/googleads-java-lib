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
 * BatchJobOpsServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class BatchJobOpsServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.adwords.axis.v201802.cm.BatchJobOpsServiceInterface {
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
        oper.setName("mutate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Operation"), com.google.api.ads.adwords.axis.v201802.cm.Operation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MutateResult"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201802.cm.MutateResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201802.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

    }

    public BatchJobOpsServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BatchJobOpsServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BatchJobOpsServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings3();
        addBindings4();
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Ad");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Ad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Ad.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdCustomizerError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdCustomizerError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdCustomizerErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Address");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroup.Status");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAd.Status");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdCountLimitExceeded");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdCountLimitExceeded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdLabelOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdLabelOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdPolicySummary");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdPolicySummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupAdRotationMode");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupAdRotationMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupBidModifier");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupBidModifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupBidModifierOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupBidModifierOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionLabelOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLabelOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionLimitExceeded");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLimitExceeded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionLimitExceeded.CriteriaLimitType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionLimitExceededCriteriaLimitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupCriterionOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupCriterionOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupExtensionSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupExtensionSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupExtensionSettingOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupExtensionSettingOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupLabelOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupLabelOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupServiceError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupServiceError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupServiceError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupServiceErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdGroupType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdRotationMode");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdRotationMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdSchedule");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdServingOptimizationStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdServingOptimizationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdSharingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdSharingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdSharingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdSharingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdUnionId");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdUnionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdvertisingChannelSubType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelSubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdvertisingChannelType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdvertisingChannelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdxError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdxError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AdxError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AdxErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AgeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AgeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AgeRange.AgeRangeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AgeRangeAgeRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AppFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppFeedItem.AppStore");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AppFeedItemAppStore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppPaymentModel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AppPaymentModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppPaymentModel.AppPaymentModelType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AppPaymentModelAppPaymentModelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApprovalStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppUrl");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AppUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppUrl.OsType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AppUrlOsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppUrlList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AppUrlList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Audio");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Audio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AuthorizationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AuthorizationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AuthorizationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.AuthorizationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Bid");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Bid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddableAdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BiddableAdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingErrors");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BiddingErrors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingErrors.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BiddingErrorsReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategyConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategySource");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategySource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BiddingStrategyType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BiddingStrategyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BidModifierSource");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BidModifierSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Bids");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Bids.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BidSource");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BidSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Budget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Budget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Budget.BudgetDeliveryMethod");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetDeliveryMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Budget.BudgetStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BudgetBudgetStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BudgetError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BudgetError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BudgetError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BudgetErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "BudgetOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.BudgetOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CallConversionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CallConversionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CallFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CallFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CallOnlyAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CallOnlyAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CalloutFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CalloutFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Campaign");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Campaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterion.CampaignCriterionStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionCampaignCriterionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignCriterionOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignCriterionOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignExtensionSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignExtensionSettingOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignExtensionSettingOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignLabelOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignLabelOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignSharedSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignSharedSet.class;
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignSharedSet.Status");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignSharedSetStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignSharedSetError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignSharedSetError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignSharedSetError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignSharedSetErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignSharedSetOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignSharedSetOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CampaignTrialType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CampaignTrialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Carrier");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Carrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CertificateDomainMismatchInCountryConstraint");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CertificateDomainMismatchInCountryConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CertificateMissingConstraint");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CertificateMissingConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CertificateMissingInCountryConstraint");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CertificateMissingInCountryConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ClientTermsError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ClientTermsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ClientTermsError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ClientTermsErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CollectionSizeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CollectionSizeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CollectionSizeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CollectionSizeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ComparableValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ComparableValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConstantOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ConstantOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConstantOperand.ConstantType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandConstantType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConstantOperand.Unit");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ContentLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ContentLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ContentLabelType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ContentLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionOptimizerEligibility");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConversionOptimizerEligibility.RejectionReason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ConversionOptimizerEligibilityRejectionReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CountryConstraint");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CountryConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CpaBid");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CpaBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CpcBid");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CpcBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CpmBid");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CpmBid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Criterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Criterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Criterion.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionParameter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionPolicyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionPolicyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionTypeGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionTypeGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionUse");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionUse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionUserInterest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionUserInterest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionUserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionUserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CriterionUserList.MembershipStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CriterionUserListMembershipStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CustomerExtensionSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CustomerExtensionSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CustomerExtensionSettingOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CustomerExtensionSettingOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CustomParameter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CustomParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "CustomParameters");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.CustomParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DatabaseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DatabaseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DatabaseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DatabaseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DateError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DateError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DateErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DateRangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DateRangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DateRangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DateRangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DayOfWeek");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DayOfWeek.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DeprecatedAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DeprecatedAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DeprecatedAd.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DeprecatedAdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisapprovalReason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DisapprovalReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisplayAdFormatSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DisplayAdFormatSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisplayAttribute");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DisplayAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisplayCallToAction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DisplayCallToAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DistinctError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DistinctError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DistinctError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DistinctErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DoubleValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DoubleValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DynamicSearchAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DynamicSearchAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DynamicSearchAdsSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DynamicSearchAdsSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DynamicSettings");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DynamicSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EnhancedCpcBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.EnhancedCpcBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityAccessDenied");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.EntityAccessDenied.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityAccessDenied.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.EntityAccessDeniedReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityCountLimitExceeded");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.EntityCountLimitExceeded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityCountLimitExceeded.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.EntityCountLimitExceededReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityNotFound");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.EntityNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EntityNotFound.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.EntityNotFoundReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ErrorList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ErrorList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExemptionRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExemptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExpandedDynamicSearchAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExpandedDynamicSearchAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExpandedTextAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExpandedTextAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExplorerAutoOptimizerSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExplorerAutoOptimizerSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExtensionFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExtensionSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionSetting.Platform");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExtensionSettingPlatform.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionSettingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExtensionSettingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ExtensionSettingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ExtensionSettingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Feed.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedAttributeReferenceError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeReferenceError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedAttributeReferenceError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedAttributeReferenceErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItem.Status");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAdGroupTarget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAdGroupTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemAdGroupTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemApprovalStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAttributeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemAttributeValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemAttributeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemCampaignTarget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemCampaignTargeting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemCampaignTargeting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemCriterionTarget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemCriterionTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemDevicePreference");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemDevicePreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemGeoRestriction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemGeoRestriction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemPolicyData");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemPolicyData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemQualityApprovalStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemQualityDisapprovalReasons");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemQualityDisapprovalReasons.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemSchedule");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemSchedule.class;
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemScheduling");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemScheduling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTarget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTargetError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTargetError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTargetOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTargetStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemTargetType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemTargetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemValidationStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FeedItemValidationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FieldPathElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ForwardCompatibilityError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ForwardCompatibilityError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ForwardCompatibilityError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ForwardCompatibilityErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FrequencyCap");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FrequencyCap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Function");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Function.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Function.Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FunctionOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FunctionArgumentOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FunctionArgumentOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FunctionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FunctionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FunctionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FunctionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FunctionParsingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FunctionParsingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FunctionParsingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FunctionParsingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Gender");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Gender.GenderType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GenderGenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoPoint");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GeoPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoRestriction");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GeoRestriction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoTargetOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GeoTargetOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoTargetTypeSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoTargetTypeSetting.NegativeGeoTargetType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingNegativeGeoTargetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GeoTargetTypeSetting.PositiveGeoTargetType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GeoTargetTypeSettingPositiveGeoTargetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GmailAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GmailAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "GmailTeaser");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.GmailTeaser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "IdError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.IdError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "IdError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.IdErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Image.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ImageAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ImageAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ImageError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ImageError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ImageError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ImageErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "IncomeOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.IncomeOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "IncomeRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.IncomeRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "IncomeRange.IncomeRangeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.IncomeRangeIncomeRangeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "IncomeTier");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.IncomeTier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "IpBlock");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.IpBlock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Keyword");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Keyword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "KeywordMatchType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.KeywordMatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Label");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Label.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Label.Status");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.LabelStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "LabelAttribute");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.LabelAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Language");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Language.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Level");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Level.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ListError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ListErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListOperations");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ListOperations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListOperations.ListOperator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ListOperationsListOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Location");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "LocationExtensionOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.LocationExtensionOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "LocationGroups");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.LocationGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "LocationTargetingStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.LocationTargetingStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "LongValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.LongValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ManualCpcBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ManualCpcBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ManualCpmBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ManualCpmBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MaximizeConversionsBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MaximizeConversionsBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MaximizeConversionValueBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MaximizeConversionValueBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Media.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media.MediaType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media.MimeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MediaMimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media.Size");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MediaSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media_Size_DimensionsMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Media_Size_DimensionsMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media_Size_StringMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Media_Size_StringMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MediaBundle");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MediaBundle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MediaBundleError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MediaBundleError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MediaBundleError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MediaBundleErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MediaError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MediaError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MediaError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MediaErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MessageFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MessageFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MinuteOfHour");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MinuteOfHour.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileAppCategory");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MobileAppCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileApplication");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MobileApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileApplicationVendor");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MobileApplicationVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileDevice");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MobileDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileDevice.DeviceType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MobileDeviceDeviceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Money");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MoneyWithCurrency");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MultiplierError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MultiplierError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MultiplierError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MultiplierErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MutateResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.MutateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NegativeAdGroupCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NegativeAdGroupCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NegativeCampaignCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NegativeCampaignCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NegativeFeedItemCriterionTarget");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NegativeFeedItemCriterionTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NetworkSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NetworkSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NewEntityCreationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NewEntityCreationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NewEntityCreationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NewEntityCreationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NotEmptyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NotEmptyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NotEmptyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NotEmptyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "NumberValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.NumberValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Operand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Operand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OperatingSystemVersion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.OperatingSystemVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OperatingSystemVersion.OperatorType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.OperatingSystemVersionOperatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Operation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OperationAccessDenied");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.OperationAccessDenied.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OperationAccessDenied.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.OperationAccessDeniedReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Operator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OperatorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.OperatorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OperatorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.OperatorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PageFeed");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PageFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PageOnePromotedBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PageOnePromotedBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PageOnePromotedBiddingScheme.StrategyGoal");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PageOnePromotedBiddingSchemeStrategyGoal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PagingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PagingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PagingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PagingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Parent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Parent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Parent.ParentType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ParentParentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Placement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Placement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PlacesOfInterestOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PlacesOfInterestOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PlacesOfInterestOperand.Category");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PlacesOfInterestOperandCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Platform");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Platform.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyApprovalStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyData");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicySummaryDenormalizedStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryDenormalizedStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicySummaryReviewState");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicySummaryReviewState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicConstraint");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicConstraint.PolicyTopicConstraintType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicConstraintPolicyTopicConstraintType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEntryType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEvidence");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEvidence.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyTopicEvidenceType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyTopicEvidenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyViolationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyViolationError.Part");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationErrorPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyViolationKey");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PolicyViolationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceExtensionPriceQualifier");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceQualifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceExtensionPriceUnit");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceExtensionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PriceFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceTableRow");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PriceTableRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductAdwordsGrouping");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductAdwordsGrouping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductAdwordsLabels");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductAdwordsLabels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductBiddingCategory");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductBrand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductBrand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductCanonicalCondition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductCanonicalCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductCanonicalCondition.Condition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductCanonicalConditionCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductChannel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductChannelExclusivity");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductChannelExclusivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductCustomAttribute");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductCustomAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductDimension");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductDimension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductDimensionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductDimensionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductImage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductImage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductLegacyCondition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductLegacyCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductOfferId");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductOfferId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductPartition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductPartition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductPartitionType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductPartitionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductScope");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductScope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductTypeFull");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProductTypeFull.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PromotionExtensionDiscountModifier");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PromotionExtensionDiscountModifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PromotionExtensionOccasion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PromotionExtensionOccasion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PromotionFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PromotionFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Proximity");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Proximity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Proximity.DistanceUnits");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ProximityDistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "QualityInfo");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.QualityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "QueryError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.QueryError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "QueryError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.QueryErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "QuotaCheckError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.QuotaCheckError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "QuotaCheckError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.QuotaCheckErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RateExceededError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RateExceededError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RateExceededError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RateExceededErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ReadOnlyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ReadOnlyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ReadOnlyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ReadOnlyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RealTimeBiddingSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RealTimeBiddingSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RegionCodeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RegionCodeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RegionCodeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RegionCodeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RejectedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RejectedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RejectedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RejectedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RequestError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RequestError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RequestError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RequestErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ResellerConstraint");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ResellerConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ResponsiveDisplayAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ResponsiveDisplayAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ReviewFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ReviewFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RichMediaAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RichMediaAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RichMediaAd.AdAttribute");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdAdAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "RichMediaAd.RichMediaAdType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.RichMediaAdRichMediaAdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SelectiveOptimization");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SelectiveOptimization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SelectorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SelectorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SelectorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SelectorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ServingStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ServingStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Setting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Setting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SettingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SettingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SettingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SettingErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedCriterionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedCriterionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedCriterionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedCriterionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedCriterionOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedCriterionOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSet.Status");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedSetStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSetError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedSetError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSetError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedSetErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings4() {
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSetOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedSetOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SharedSetType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SharedSetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShoppingProductChannel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ShoppingProductChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShoppingProductChannelExclusivity");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ShoppingProductChannelExclusivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShoppingPurchasePlatform");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ShoppingPurchasePlatform.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShoppingSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ShoppingSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShowcaseAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ShowcaseAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SitelinkFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SitelinkFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SizeLimitError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SizeLimitError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SizeLimitError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SizeLimitErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "StatsQueryError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.StatsQueryError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "StatsQueryError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.StatsQueryErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "String_StringMapEntry");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "StringFormatError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.StringFormatError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "StringFormatError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.StringFormatErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "StructuredSnippetFeedItem");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.StructuredSnippetFeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SystemManagedEntitySource");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SystemManagedEntitySource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SystemServingStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SystemServingStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetCpaBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TargetCpaBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetingSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TargetingSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetingSettingDetail");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TargetingSettingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetOutrankShareBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TargetOutrankShareBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetRoasBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TargetRoasBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TargetSpendBiddingScheme");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TargetSpendBiddingScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TaskExecutionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TaskExecutionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TaskExecutionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TaskExecutionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TempAdUnionId");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TempAdUnionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TemplateAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TemplateElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElementField");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TemplateElementField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElementField.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TemplateElementFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TextAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TextAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TextLabel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TextLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ThirdPartyRedirectAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ThirdPartyRedirectAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ThirdPartyRedirectAd.ExpandingDirection");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ThirdPartyRedirectAdExpandingDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TimeUnit");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TimeUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrackingSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TrackingSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppBiddingStrategyGoalType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UniversalAppBiddingStrategyGoalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppCampaignAdsPolicyDecisions");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAdsPolicyDecisions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppCampaignAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalAppCampaignSetting");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UniversalAppCampaignSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UniversalShoppingAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UniversalShoppingAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UnknownProductDimension");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UnknownProductDimension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlData");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UrlData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UrlError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UrlErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UrlList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UserStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.UserStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VanityPharma");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.VanityPharma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VanityPharmaDisplayUrlMode");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.VanityPharmaDisplayUrlMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VanityPharmaText");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.VanityPharmaText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Vertical");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Vertical.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Video");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Video.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "VideoType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.VideoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Webpage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Webpage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "WebpageCondition");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.WebpageCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "WebpageConditionOperand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.WebpageConditionOperand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "WebpageParameter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.WebpageParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "YouTubeChannel");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.YouTubeChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "YouTubeVideo");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.YouTubeVideo.class;
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

    public com.google.api.ads.adwords.axis.v201802.cm.MutateResult[] mutate(com.google.api.ads.adwords.axis.v201802.cm.Operation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "mutate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201802.cm.MutateResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201802.cm.MutateResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201802.cm.MutateResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.adwords.axis.v201802.cm.ApiException) {
              throw (com.google.api.ads.adwords.axis.v201802.cm.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
