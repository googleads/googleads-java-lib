/**
 * NetworkSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class NetworkSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfa.axis.v1_19.NetworkRemote {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNetwork");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "networkId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Network"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.Network.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNetworkReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAgreements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AgreementSearchCriteria"), com.google.api.ads.dfa.axis.v1_19.AgreementSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AgreementRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.AgreementRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAgreementsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeAgreement");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "agreementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrencies");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCurrency"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.Currency[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCurrenciesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNetworks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "networkSearchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkSearchCriteria"), com.google.api.ads.dfa.axis.v1_19.NetworkSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.NetworkRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNetworksReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveNetwork");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "network"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Network"), com.google.api.ads.dfa.axis.v1_19.Network.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkSaveResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.NetworkSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveNetworkReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLanguageEncodingList");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfLanguageEncoding"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.LanguageEncoding[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLanguageEncodingListReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTimeZoneList");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfTimeZone"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.TimeZone[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTimeZoneListReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllPermissions");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfPermission"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.Permission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllPermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllNetworkPermissions");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfNetworkPermission"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.NetworkPermission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAllNetworkPermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssignedNetworkPermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "networkId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfNetworkPermission"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.NetworkPermission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAssignedNetworkPermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAdministratorPermissions");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfAdministratorPermission"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.AdministratorPermission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAdministratorPermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadNetworkWidgetImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "WidgetImageUploadRequest"), com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "WidgetImageUploadResponse"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "uploadNetworkWidgetImageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[12] = oper;

    }

    public NetworkSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public NetworkSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public NetworkSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ActiveFilter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.ActiveFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdministratorPermission");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AdministratorPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdvancedReportsConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AdvancedReportsConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Agreement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Agreement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AgreementRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AgreementRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AgreementSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AgreementSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfAdministratorPermission");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AdministratorPermission[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdministratorPermission");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfAgreement");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Agreement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Agreement");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCurrency");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Currency[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Currency");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfFrequencyCapGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "FrequencyCapGroup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfLanguageEncoding");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LanguageEncoding[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LanguageEncoding");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfNetwork");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Network[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Network");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfNetworkPermission");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkPermission[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkPermission");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfPermission");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Permission[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Permission");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfTimeZone");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.TimeZone[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "TimeZone");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Base");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Base.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "BillingCustomer");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.BillingCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Currency");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ExposureToConversionConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.ExposureToConversionConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "FrequencyCapGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "FrequencyCapGroupBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.FrequencyCapGroupBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LanguageEncoding");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LanguageEncoding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LookbackConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LookbackConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Network");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Network.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkPermission");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkPermissionBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkPermissionBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkPermissionGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkPermissionGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkPermissionGroupBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkPermissionGroupBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkSaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "NetworkSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.NetworkSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PageableSearchCriteriaBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.PageableSearchCriteriaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PagedRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.PagedRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Permission");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Permission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PermissionBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.PermissionBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PermissionGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.PermissionGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PermissionGroupBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.PermissionGroupBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ReachReportConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.ReachReportConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ReportsConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.ReportsConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaNetworkConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.RichMediaNetworkConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SearchCriteriaBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.SearchCriteriaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "TimeZone");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.TimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "WidgetImageUploadRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "WidgetImageUploadResponse");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "WidgetNetworkConfig");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.WidgetNetworkConfig.class;
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
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
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

    public com.google.api.ads.dfa.axis.v1_19.Network getNetwork(long networkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getNetwork"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(networkId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.Network) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.Network) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.Network.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.AgreementRecordSet getAgreements(com.google.api.ads.dfa.axis.v1_19.AgreementSearchCriteria criteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getAgreements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.AgreementRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.AgreementRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.AgreementRecordSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void executeAgreement(long agreementId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "executeAgreement"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(agreementId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.Currency[] getCurrencies() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getCurrencies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.Currency[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.Currency[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.Currency[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.NetworkRecordSet getNetworks(com.google.api.ads.dfa.axis.v1_19.NetworkSearchCriteria networkSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getNetworks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {networkSearchCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.NetworkRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.NetworkRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.NetworkRecordSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.NetworkSaveResult saveNetwork(com.google.api.ads.dfa.axis.v1_19.Network network) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "saveNetwork"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {network});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.NetworkSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.NetworkSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.NetworkSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.LanguageEncoding[] getLanguageEncodingList() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getLanguageEncodingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.LanguageEncoding[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.LanguageEncoding[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.LanguageEncoding[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.TimeZone[] getTimeZoneList() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getTimeZoneList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.TimeZone[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.TimeZone[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.TimeZone[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.Permission[] getAllPermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getAllPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.Permission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.Permission[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.Permission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.NetworkPermission[] getAllNetworkPermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getAllNetworkPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.NetworkPermission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.NetworkPermission[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.NetworkPermission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.NetworkPermission[] getAssignedNetworkPermissions(long networkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getAssignedNetworkPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(networkId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.NetworkPermission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.NetworkPermission[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.NetworkPermission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.AdministratorPermission[] getAdministratorPermissions() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getAdministratorPermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.AdministratorPermission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.AdministratorPermission[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.AdministratorPermission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadResponse uploadNetworkWidgetImage(com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "uploadNetworkWidgetImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.WidgetImageUploadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
