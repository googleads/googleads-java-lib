/**
 * CreativeSetServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;

public class CreativeSetServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.axis.v201311.CreativeSetService {

    public CreativeSetServiceLocator() {
    }


    public CreativeSetServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreativeSetServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreativeSetServiceInterfacePort
    private java.lang.String CreativeSetServiceInterfacePort_address = "https://www.google.com/apis/ads/publisher/v201311/CreativeSetService";

    public java.lang.String getCreativeSetServiceInterfacePortAddress() {
        return CreativeSetServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreativeSetServiceInterfacePortWSDDServiceName = "CreativeSetServiceInterfacePort";

    public java.lang.String getCreativeSetServiceInterfacePortWSDDServiceName() {
        return CreativeSetServiceInterfacePortWSDDServiceName;
    }

    public void setCreativeSetServiceInterfacePortWSDDServiceName(java.lang.String name) {
        CreativeSetServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.axis.v201311.CreativeSetServiceInterface getCreativeSetServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreativeSetServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreativeSetServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.axis.v201311.CreativeSetServiceInterface getCreativeSetServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.axis.v201311.CreativeSetServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201311.CreativeSetServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreativeSetServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreativeSetServiceInterfacePortEndpointAddress(java.lang.String address) {
        CreativeSetServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.axis.v201311.CreativeSetServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.axis.v201311.CreativeSetServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201311.CreativeSetServiceSoapBindingStub(new java.net.URL(CreativeSetServiceInterfacePort_address), this);
                _stub.setPortName(getCreativeSetServiceInterfacePortWSDDServiceName());
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
        if ("CreativeSetServiceInterfacePort".equals(inputPortName)) {
            return getCreativeSetServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CreativeSetService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CreativeSetServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreativeSetServiceInterfacePort".equals(portName)) {
            setCreativeSetServiceInterfacePortEndpointAddress(address);
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
