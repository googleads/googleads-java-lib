/**
 * FeedServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public class FeedServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201402.cm.FeedService {

    public FeedServiceLocator() {
    }


    public FeedServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FeedServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FeedServiceInterfacePort
    private java.lang.String FeedServiceInterfacePort_address = "https://adwords.google.com/api/adwords/cm/v201402/FeedService";

    public java.lang.String getFeedServiceInterfacePortAddress() {
        return FeedServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FeedServiceInterfacePortWSDDServiceName = "FeedServiceInterfacePort";

    public java.lang.String getFeedServiceInterfacePortWSDDServiceName() {
        return FeedServiceInterfacePortWSDDServiceName;
    }

    public void setFeedServiceInterfacePortWSDDServiceName(java.lang.String name) {
        FeedServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201402.cm.FeedServiceInterface getFeedServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FeedServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFeedServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201402.cm.FeedServiceInterface getFeedServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201402.cm.FeedServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201402.cm.FeedServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getFeedServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFeedServiceInterfacePortEndpointAddress(java.lang.String address) {
        FeedServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201402.cm.FeedServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201402.cm.FeedServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201402.cm.FeedServiceSoapBindingStub(new java.net.URL(FeedServiceInterfacePort_address), this);
                _stub.setPortName(getFeedServiceInterfacePortWSDDServiceName());
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
        if ("FeedServiceInterfacePort".equals(inputPortName)) {
            return getFeedServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "FeedService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "FeedServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FeedServiceInterfacePort".equals(portName)) {
            setFeedServiceInterfacePortEndpointAddress(address);
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
