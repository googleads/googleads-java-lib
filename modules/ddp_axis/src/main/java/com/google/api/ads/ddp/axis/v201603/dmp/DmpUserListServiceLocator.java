/**
 * DmpUserListServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;

public class DmpUserListServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.ddp.axis.v201603.dmp.DmpUserListService {

    public DmpUserListServiceLocator() {
    }


    public DmpUserListServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DmpUserListServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DmpUserListServiceInterfacePort
    private java.lang.String DmpUserListServiceInterfacePort_address = "https://ddp.googleapis.com/api/ddp/dmp/v201603/DmpUserListService";

    public java.lang.String getDmpUserListServiceInterfacePortAddress() {
        return DmpUserListServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DmpUserListServiceInterfacePortWSDDServiceName = "DmpUserListServiceInterfacePort";

    public java.lang.String getDmpUserListServiceInterfacePortWSDDServiceName() {
        return DmpUserListServiceInterfacePortWSDDServiceName;
    }

    public void setDmpUserListServiceInterfacePortWSDDServiceName(java.lang.String name) {
        DmpUserListServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.ddp.axis.v201603.dmp.DmpUserListServiceInterface getDmpUserListServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DmpUserListServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDmpUserListServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.ddp.axis.v201603.dmp.DmpUserListServiceInterface getDmpUserListServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.ddp.axis.v201603.dmp.DmpUserListServiceSoapBindingStub _stub = new com.google.api.ads.ddp.axis.v201603.dmp.DmpUserListServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDmpUserListServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDmpUserListServiceInterfacePortEndpointAddress(java.lang.String address) {
        DmpUserListServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.ddp.axis.v201603.dmp.DmpUserListServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.ddp.axis.v201603.dmp.DmpUserListServiceSoapBindingStub _stub = new com.google.api.ads.ddp.axis.v201603.dmp.DmpUserListServiceSoapBindingStub(new java.net.URL(DmpUserListServiceInterfacePort_address), this);
                _stub.setPortName(getDmpUserListServiceInterfacePortWSDDServiceName());
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
        if ("DmpUserListServiceInterfacePort".equals(inputPortName)) {
            return getDmpUserListServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "DmpUserListService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "DmpUserListServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DmpUserListServiceInterfacePort".equals(portName)) {
            setDmpUserListServiceInterfacePortEndpointAddress(address);
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
