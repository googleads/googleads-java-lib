/**
 * SizeRemoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class SizeRemoteServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfa.axis.v1_20.SizeRemoteService {

    public SizeRemoteServiceLocator() {
    }


    public SizeRemoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SizeRemoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for size
    private java.lang.String size_address = "https://advertisersapi.doubleclick.net/v1.20/api/dfa-api/size";

    public java.lang.String getsizeAddress() {
        return size_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String sizeWSDDServiceName = "size";

    public java.lang.String getsizeWSDDServiceName() {
        return sizeWSDDServiceName;
    }

    public void setsizeWSDDServiceName(java.lang.String name) {
        sizeWSDDServiceName = name;
    }

    public com.google.api.ads.dfa.axis.v1_20.SizeRemote getsize() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(size_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsize(endpoint);
    }

    public com.google.api.ads.dfa.axis.v1_20.SizeRemote getsize(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfa.axis.v1_20.SizeSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_20.SizeSoapBindingStub(portAddress, this);
            _stub.setPortName(getsizeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsizeEndpointAddress(java.lang.String address) {
        size_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfa.axis.v1_20.SizeRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfa.axis.v1_20.SizeSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_20.SizeSoapBindingStub(new java.net.URL(size_address), this);
                _stub.setPortName(getsizeWSDDServiceName());
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
        if ("size".equals(inputPortName)) {
            return getsize();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SizeRemoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "size"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("size".equals(portName)) {
            setsizeEndpointAddress(address);
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
