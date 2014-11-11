/**
 * CreativefieldSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativefieldSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfa.axis.v1_19.CreativeFieldRemote {
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
        oper.setName("getCreativeFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeFieldSearchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldSearchCriteria"), com.google.api.ads.dfa.axis.v1_19.CreativeFieldSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CreativeFieldRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativeFieldsReturn"));
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
        oper.setName("deleteCreativeField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeFieldId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
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
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveCreativeField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeField"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeField"), com.google.api.ads.dfa.axis.v1_19.CreativeField.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldSaveResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CreativeFieldSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveCreativeFieldReturn"));
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
        oper.setName("getCreativeFieldValues");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeFieldValueSearchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValueSearchCriteria"), com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValueRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativeFieldValuesReturn"));
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
        oper.setName("getCreativeFieldValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeFieldValueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValue"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativeFieldValueReturn"));
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
        oper.setName("saveCreativeFieldValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeFieldValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValue"), com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValueSaveResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveCreativeFieldValueReturn"));
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
        oper.setName("deleteCreativeFieldValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeFieldValueId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
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
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreativeField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeFieldId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeField"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CreativeField.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativeFieldReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[7] = oper;

    }

    public CreativefieldSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CreativefieldSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CreativefieldSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCreativeField");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeField");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCreativeFieldValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Base");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Base.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeField");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldSaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValue");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValueBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValueRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValueSaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeFieldValueSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSearchCriteria.class;
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

    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldRecordSet getCreativeFields(com.google.api.ads.dfa.axis.v1_19.CreativeFieldSearchCriteria creativeFieldSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getCreativeFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creativeFieldSearchCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CreativeFieldRecordSet.class);
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

    public void deleteCreativeField(long creativeFieldId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "deleteCreativeField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeFieldId)});

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

    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldSaveResult saveCreativeField(com.google.api.ads.dfa.axis.v1_19.CreativeField creativeField) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "saveCreativeField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creativeField});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CreativeFieldSaveResult.class);
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

    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueRecordSet getCreativeFieldValues(com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSearchCriteria creativeFieldValueSearchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getCreativeFieldValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creativeFieldValueSearchCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueRecordSet.class);
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

    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue getCreativeFieldValue(long creativeFieldValueId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getCreativeFieldValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeFieldValueId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue.class);
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

    public com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSaveResult saveCreativeFieldValue(com.google.api.ads.dfa.axis.v1_19.CreativeFieldValue creativeFieldValue) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "saveCreativeFieldValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creativeFieldValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CreativeFieldValueSaveResult.class);
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

    public void deleteCreativeFieldValue(long creativeFieldValueId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "deleteCreativeFieldValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeFieldValueId)});

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

    public com.google.api.ads.dfa.axis.v1_19.CreativeField getCreativeField(long creativeFieldId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getCreativeField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeFieldId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeField) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CreativeField) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CreativeField.class);
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
