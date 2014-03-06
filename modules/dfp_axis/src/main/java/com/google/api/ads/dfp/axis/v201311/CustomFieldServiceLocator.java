/**
 * CustomFieldServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;

public class CustomFieldServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.axis.v201311.CustomFieldService {

    public CustomFieldServiceLocator() {
    }


    public CustomFieldServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomFieldServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomFieldServiceInterfacePort
    private java.lang.String CustomFieldServiceInterfacePort_address = "https://www.google.com/apis/ads/publisher/v201311/CustomFieldService";

    public java.lang.String getCustomFieldServiceInterfacePortAddress() {
        return CustomFieldServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomFieldServiceInterfacePortWSDDServiceName = "CustomFieldServiceInterfacePort";

    public java.lang.String getCustomFieldServiceInterfacePortWSDDServiceName() {
        return CustomFieldServiceInterfacePortWSDDServiceName;
    }

    public void setCustomFieldServiceInterfacePortWSDDServiceName(java.lang.String name) {
        CustomFieldServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.axis.v201311.CustomFieldServiceInterface getCustomFieldServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomFieldServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomFieldServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.axis.v201311.CustomFieldServiceInterface getCustomFieldServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.axis.v201311.CustomFieldServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201311.CustomFieldServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomFieldServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomFieldServiceInterfacePortEndpointAddress(java.lang.String address) {
        CustomFieldServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.axis.v201311.CustomFieldServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.axis.v201311.CustomFieldServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201311.CustomFieldServiceSoapBindingStub(new java.net.URL(CustomFieldServiceInterfacePort_address), this);
                _stub.setPortName(getCustomFieldServiceInterfacePortWSDDServiceName());
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
        if ("CustomFieldServiceInterfacePort".equals(inputPortName)) {
            return getCustomFieldServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CustomFieldService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "CustomFieldServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomFieldServiceInterfacePort".equals(portName)) {
            setCustomFieldServiceInterfacePortEndpointAddress(address);
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
