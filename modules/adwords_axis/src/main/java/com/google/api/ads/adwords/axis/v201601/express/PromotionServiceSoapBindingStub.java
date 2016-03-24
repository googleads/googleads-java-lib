/**
 * PromotionServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.express;

public class PromotionServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.adwords.axis.v201601.express.PromotionServiceInterface {
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
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "selector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Selector"), com.google.api.ads.adwords.axis.v201601.cm.Selector.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionPage"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201601.express.PromotionPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201601.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mutate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "operations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionOperation"), com.google.api.ads.adwords.axis.v201601.express.PromotionOperation[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "Promotion"));
        oper.setReturnClass(com.google.api.ads.adwords.axis.v201601.express.Promotion[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "rval"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "ApiExceptionFault"),
                      "com.google.api.ads.adwords.axis.v201601.cm.ApiException",
                      new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public PromotionServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PromotionServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PromotionServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Address");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ApplicationException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AuthenticationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.AuthenticationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AuthenticationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.AuthenticationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AuthorizationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.AuthorizationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "AuthorizationError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.AuthorizationErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ClientTermsError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ClientTermsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ClientTermsError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ClientTermsErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ComparableValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ComparableValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Criterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Criterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Criterion.Type");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.CriterionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CriterionUserInterest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.CriterionUserInterest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CriterionUserList");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.CriterionUserList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "CriterionUserList.MembershipStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.CriterionUserListMembershipStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DatabaseError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.DatabaseError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DatabaseError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.DatabaseErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DateError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.DateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DateError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.DateErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DistinctError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.DistinctError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DistinctError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.DistinctErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "DoubleValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.DoubleValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "GeoPoint");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.GeoPoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "IdError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.IdError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "IdError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.IdErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "InternalApiError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.InternalApiError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "InternalApiError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.InternalApiErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Keyword");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Keyword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "KeywordMatchType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.KeywordMatchType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Language");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Language.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Location");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "LocationTargetingStatus");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.LocationTargetingStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "LongValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.LongValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "MobileAppCategory");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.MobileAppCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "MobileApplication");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.MobileApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Money");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NotEmptyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.NotEmptyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NotEmptyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.NotEmptyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NullError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.NullError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NullError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.NullErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "NumberValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.NumberValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Operation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OperationAccessDenied");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.OperationAccessDenied.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OperationAccessDenied.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.OperationAccessDeniedReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Operator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OperatorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.OperatorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OperatorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.OperatorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "OrderBy");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.OrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Page");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Page.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Paging");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Paging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Placement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Placement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Predicate");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Predicate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Predicate.Operator");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.PredicateOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Proximity");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Proximity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Proximity.DistanceUnits");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ProximityDistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "QuotaCheckError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.QuotaCheckError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "QuotaCheckError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.QuotaCheckErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RangeError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RangeError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RangeError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RangeErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RateExceededError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RateExceededError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RateExceededError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RateExceededErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ReadOnlyError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ReadOnlyError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "ReadOnlyError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.ReadOnlyErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RejectedError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RejectedError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RejectedError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RejectedErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RequestError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RequestError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RequestError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RequestErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RequiredError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RequiredError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "RequiredError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.RequiredErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Selector");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Selector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SelectorError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.SelectorError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SelectorError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.SelectorErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SizeLimitError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.SizeLimitError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SizeLimitError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.SizeLimitErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SoapHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.SoapHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SoapResponseHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.SoapResponseHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StringLengthError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.StringLengthError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "StringLengthError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.StringLengthErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "Vertical");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.cm.Vertical.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "Creative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.Creative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "ExpressSoapHeader");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.ExpressSoapHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "KeywordGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.KeywordGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "KeywordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.KeywordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "NegativeCriterion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.NegativeCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "NegativeKeyword");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.NegativeKeyword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "NoStatsPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.NoStatsPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PhoneNumber");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PhoneNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PolicyViolationError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PolicyViolationError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PolicyViolationError.Part");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PolicyViolationErrorPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PolicyViolationKey");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PolicyViolationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "ProductService");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.ProductService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "Promotion");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.Promotion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "Promotion.Status");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PromotionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionError");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PromotionError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionError.Reason");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PromotionErrorReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionOperation");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PromotionOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.PromotionPage.class;
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
            qName = new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "RegionCode");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.adwords.axis.v201601.express.RegionCode.class;
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

    public com.google.api.ads.adwords.axis.v201601.express.PromotionPage get(com.google.api.ads.adwords.axis.v201601.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {selector});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201601.express.PromotionPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201601.express.PromotionPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201601.express.PromotionPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.adwords.axis.v201601.cm.ApiException) {
              throw (com.google.api.ads.adwords.axis.v201601.cm.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.adwords.axis.v201601.express.Promotion[] mutate(com.google.api.ads.adwords.axis.v201601.express.PromotionOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException {
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
        _call.setOperationName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201601", "mutate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {operations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.adwords.axis.v201601.express.Promotion[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.adwords.axis.v201601.express.Promotion[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.adwords.axis.v201601.express.Promotion[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.adwords.axis.v201601.cm.ApiException) {
              throw (com.google.api.ads.adwords.axis.v201601.cm.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
