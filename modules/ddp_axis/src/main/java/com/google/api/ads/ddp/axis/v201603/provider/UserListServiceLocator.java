/**
 * UserListServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;

public class UserListServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.ddp.axis.v201603.provider.UserListService {

    public UserListServiceLocator() {
    }


    public UserListServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserListServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserListServiceInterfacePort
    private java.lang.String UserListServiceInterfacePort_address = "https://ddp.googleapis.com/api/ddp/provider/v201603/UserListService";

    public java.lang.String getUserListServiceInterfacePortAddress() {
        return UserListServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserListServiceInterfacePortWSDDServiceName = "UserListServiceInterfacePort";

    public java.lang.String getUserListServiceInterfacePortWSDDServiceName() {
        return UserListServiceInterfacePortWSDDServiceName;
    }

    public void setUserListServiceInterfacePortWSDDServiceName(java.lang.String name) {
        UserListServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.ddp.axis.v201603.provider.UserListServiceInterface getUserListServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserListServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserListServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.ddp.axis.v201603.provider.UserListServiceInterface getUserListServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.ddp.axis.v201603.provider.UserListServiceSoapBindingStub _stub = new com.google.api.ads.ddp.axis.v201603.provider.UserListServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserListServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserListServiceInterfacePortEndpointAddress(java.lang.String address) {
        UserListServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.ddp.axis.v201603.provider.UserListServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.ddp.axis.v201603.provider.UserListServiceSoapBindingStub _stub = new com.google.api.ads.ddp.axis.v201603.provider.UserListServiceSoapBindingStub(new java.net.URL(UserListServiceInterfacePort_address), this);
                _stub.setPortName(getUserListServiceInterfacePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserListServiceInterfacePort".equals(inputPortName)) {
            return getUserListServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserListService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserListServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserListServiceInterfacePort".equals(portName)) {
            setUserListServiceInterfacePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
