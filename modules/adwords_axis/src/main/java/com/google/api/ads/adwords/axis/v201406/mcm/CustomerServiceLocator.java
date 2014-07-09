/**
 * CustomerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.mcm;

public class CustomerServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201406.mcm.CustomerService {

    public CustomerServiceLocator() {
    }


    public CustomerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerServiceInterfacePort
    private java.lang.String CustomerServiceInterfacePort_address = "https://adwords.google.com/api/adwords/mcm/v201406/CustomerService";

    public java.lang.String getCustomerServiceInterfacePortAddress() {
        return CustomerServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerServiceInterfacePortWSDDServiceName = "CustomerServiceInterfacePort";

    public java.lang.String getCustomerServiceInterfacePortWSDDServiceName() {
        return CustomerServiceInterfacePortWSDDServiceName;
    }

    public void setCustomerServiceInterfacePortWSDDServiceName(java.lang.String name) {
        CustomerServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201406.mcm.CustomerServiceInterface getCustomerServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201406.mcm.CustomerServiceInterface getCustomerServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201406.mcm.CustomerServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201406.mcm.CustomerServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomerServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerServiceInterfacePortEndpointAddress(java.lang.String address) {
        CustomerServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201406.mcm.CustomerServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201406.mcm.CustomerServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201406.mcm.CustomerServiceSoapBindingStub(new java.net.URL(CustomerServiceInterfacePort_address), this);
                _stub.setPortName(getCustomerServiceInterfacePortWSDDServiceName());
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
        if ("CustomerServiceInterfacePort".equals(inputPortName)) {
            return getCustomerServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "CustomerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201406", "CustomerServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerServiceInterfacePort".equals(portName)) {
            setCustomerServiceInterfacePortEndpointAddress(address);
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
