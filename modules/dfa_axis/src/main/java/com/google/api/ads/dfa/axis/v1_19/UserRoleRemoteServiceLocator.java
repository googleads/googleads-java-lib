/**
 * UserRoleRemoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class UserRoleRemoteServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfa.axis.v1_19.UserRoleRemoteService {

    public UserRoleRemoteServiceLocator() {
    }


    public UserRoleRemoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserRoleRemoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for userrole
    private java.lang.String userrole_address = "https://advertisersapi.doubleclick.net/v1.19/api/dfa-api/userrole";

    public java.lang.String getuserroleAddress() {
        return userrole_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String userroleWSDDServiceName = "userrole";

    public java.lang.String getuserroleWSDDServiceName() {
        return userroleWSDDServiceName;
    }

    public void setuserroleWSDDServiceName(java.lang.String name) {
        userroleWSDDServiceName = name;
    }

    public com.google.api.ads.dfa.axis.v1_19.UserRoleRemote getuserrole() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(userrole_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getuserrole(endpoint);
    }

    public com.google.api.ads.dfa.axis.v1_19.UserRoleRemote getuserrole(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfa.axis.v1_19.UserroleSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_19.UserroleSoapBindingStub(portAddress, this);
            _stub.setPortName(getuserroleWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setuserroleEndpointAddress(java.lang.String address) {
        userrole_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfa.axis.v1_19.UserRoleRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfa.axis.v1_19.UserroleSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_19.UserroleSoapBindingStub(new java.net.URL(userrole_address), this);
                _stub.setPortName(getuserroleWSDDServiceName());
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
        if ("userrole".equals(inputPortName)) {
            return getuserrole();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "UserRoleRemoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "userrole"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("userrole".equals(portName)) {
            setuserroleEndpointAddress(address);
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
