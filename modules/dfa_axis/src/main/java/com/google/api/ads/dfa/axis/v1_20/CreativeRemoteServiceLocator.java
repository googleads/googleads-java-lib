/**
 * CreativeRemoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeRemoteServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfa.axis.v1_20.CreativeRemoteService {

    public CreativeRemoteServiceLocator() {
    }


    public CreativeRemoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreativeRemoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for creative
    private java.lang.String creative_address = "https://advertisersapi.doubleclick.net/v1.20/api/dfa-api/creative";

    public java.lang.String getcreativeAddress() {
        return creative_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String creativeWSDDServiceName = "creative";

    public java.lang.String getcreativeWSDDServiceName() {
        return creativeWSDDServiceName;
    }

    public void setcreativeWSDDServiceName(java.lang.String name) {
        creativeWSDDServiceName = name;
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeRemote getcreative() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(creative_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcreative(endpoint);
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeRemote getcreative(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfa.axis.v1_20.CreativeSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_20.CreativeSoapBindingStub(portAddress, this);
            _stub.setPortName(getcreativeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcreativeEndpointAddress(java.lang.String address) {
        creative_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfa.axis.v1_20.CreativeRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfa.axis.v1_20.CreativeSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_20.CreativeSoapBindingStub(new java.net.URL(creative_address), this);
                _stub.setPortName(getcreativeWSDDServiceName());
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
        if ("creative".equals(inputPortName)) {
            return getcreative();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeRemoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "creative"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("creative".equals(portName)) {
            setcreativeEndpointAddress(address);
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
