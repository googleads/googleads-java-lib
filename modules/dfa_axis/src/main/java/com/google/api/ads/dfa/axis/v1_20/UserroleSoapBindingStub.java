/**
 * UserroleSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class UserroleSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfa.axis.v1_20.UserRoleRemote {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserRoles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSearchCriteria"), com.google.api.ads.dfa.axis.v1_20.UserRoleSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.UserRoleRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserRolesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveUserRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRole"), com.google.api.ads.dfa.axis.v1_20.UserRole.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSaveResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.UserRoleSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveUserRoleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUserRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserRoleSummaries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSearchCriteria"), com.google.api.ads.dfa.axis.v1_20.UserRoleSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSummaryRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.UserRoleSummaryRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserRoleSummariesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailablePermissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subnetworkId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfPermission"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.Permission[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getAvailablePermissionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRole"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.UserRole.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserRoleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[5] = oper;

    }

    public UserroleSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public UserroleSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public UserroleSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfPermission");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.Permission[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Permission");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfUserRole");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRole[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRole");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfUserRoleSummary");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRoleSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSummary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Base");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.Base.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PageableSearchCriteriaBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PagedRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.PagedRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Permission");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.Permission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PermissionBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.PermissionBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PermissionGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.PermissionGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PermissionGroupBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.PermissionGroupBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SearchCriteriaBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.SearchCriteriaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRole");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRoleBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRoleRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRoleSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRoleSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSummary");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRoleSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "UserRoleSummaryRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.UserRoleSummaryRecordSet.class;
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

    public com.google.api.ads.dfa.axis.v1_20.UserRoleRecordSet getUserRoles(com.google.api.ads.dfa.axis.v1_20.UserRoleSearchCriteria criteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getUserRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.UserRoleRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.UserRoleRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.UserRoleRecordSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.UserRoleSaveResult saveUserRole(com.google.api.ads.dfa.axis.v1_20.UserRole userGroup) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "saveUserRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userGroup});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.UserRoleSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.UserRoleSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.UserRoleSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteUserRole(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "deleteUserRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.UserRoleSummaryRecordSet getUserRoleSummaries(com.google.api.ads.dfa.axis.v1_20.UserRoleSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getUserRoleSummaries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.UserRoleSummaryRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.UserRoleSummaryRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.UserRoleSummaryRecordSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.Permission[] getAvailablePermissions(long subnetworkId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getAvailablePermissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(subnetworkId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.Permission[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.Permission[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.Permission[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.UserRole getUserRole(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getUserRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.UserRole) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.UserRole) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.UserRole.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
