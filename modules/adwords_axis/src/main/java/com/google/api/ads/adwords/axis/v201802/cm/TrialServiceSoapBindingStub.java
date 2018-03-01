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
 * TrialServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class TrialServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.adwords.axis.v201802.cm.TrialServiceInterface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "selector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Selector"), com.google.api.ads.adwords.axis.v201802.cm.Selector.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialPage"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201802.cm.TrialPage.class);
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

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mutate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialOperation"), com.google.api.ads.adwords.axis.v201802.cm.TrialOperation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialReturnValue"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201802.cm.TrialReturnValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201802.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialPage"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201802.cm.TrialPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201802.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

    }

    public TrialServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TrialServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TrialServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ApplicationException.class;
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FieldPathElement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.FieldPathElement.class;
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ListReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.ListReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Operation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OrderBy");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.OrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Page");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Paging");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Paging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Predicate");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Predicate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Predicate.Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.PredicateOperator.class;
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Selector");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Selector.class;
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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SoapHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SoapHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Trial");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.Trial.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TrialError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TrialErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TrialOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TrialPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialReturnValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TrialReturnValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TrialStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201802.cm.TrialStatus.class;
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

    public com.google.api.ads.adwords.axis.v201802.cm.TrialPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {selector});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201802.cm.TrialPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201802.cm.TrialPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201802.cm.TrialPage.class);
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

    public com.google.api.ads.adwords.axis.v201802.cm.TrialReturnValue mutate(com.google.api.ads.adwords.axis.v201802.cm.TrialOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException {
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
                return (com.google.api.ads.adwords.axis.v201802.cm.TrialReturnValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201802.cm.TrialReturnValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201802.cm.TrialReturnValue.class);
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

    public com.google.api.ads.adwords.axis.v201802.cm.TrialPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201802.cm.TrialPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201802.cm.TrialPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201802.cm.TrialPage.class);
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
