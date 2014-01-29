/**
 * AdRemoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class AdRemoteServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfa.axis.v1_19.AdRemoteService {

    public AdRemoteServiceLocator() {
    }


    public AdRemoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdRemoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ad
    private java.lang.String ad_address = "https://advertisersapi.doubleclick.net/v1.19/api/dfa-api/ad";

    public java.lang.String getadAddress() {
        return ad_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String adWSDDServiceName = "ad";

    public java.lang.String getadWSDDServiceName() {
        return adWSDDServiceName;
    }

    public void setadWSDDServiceName(java.lang.String name) {
        adWSDDServiceName = name;
    }

    public com.google.api.ads.dfa.axis.v1_19.AdRemote getad() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ad_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getad(endpoint);
    }

    public com.google.api.ads.dfa.axis.v1_19.AdRemote getad(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfa.axis.v1_19.AdSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_19.AdSoapBindingStub(portAddress, this);
            _stub.setPortName(getadWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setadEndpointAddress(java.lang.String address) {
        ad_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfa.axis.v1_19.AdRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfa.axis.v1_19.AdSoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_19.AdSoapBindingStub(new java.net.URL(ad_address), this);
                _stub.setPortName(getadWSDDServiceName());
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
        if ("ad".equals(inputPortName)) {
            return getad();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdRemoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ad"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ad".equals(portName)) {
            setadEndpointAddress(address);
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
