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
 * CampaignGroupServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;

public class CampaignGroupServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "selector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Selector"), com.google.api.ads.adwords.axis.v201809.cm.Selector.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupPage"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupPage.class);
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupOperation"), com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupOperation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupReturnValue"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupReturnValue.class);
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

    }

    public CampaignGroupServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CampaignGroupServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CampaignGroupServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CampaignGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "CampaignGroupStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupStatus.class;
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "FieldPathElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.FieldPathElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "ListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.ListReturnValue.class;
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Paging");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.Paging.class;
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SettingError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SettingError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "SettingError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201809.cm.SettingErrorReason.class;
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

    public com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupPage get(com.google.api.ads.adwords.axis.v201809.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException {
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
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {selector});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupPage.class);
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

    public com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupReturnValue mutate(com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException {
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
                return (com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupReturnValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupReturnValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201809.cm.CampaignGroupReturnValue.class);
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
