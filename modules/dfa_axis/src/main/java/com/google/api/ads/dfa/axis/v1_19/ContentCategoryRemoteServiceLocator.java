/**
 * ContentCategoryRemoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class ContentCategoryRemoteServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfa.axis.v1_19.ContentCategoryRemoteService {

    public ContentCategoryRemoteServiceLocator() {
    }


    public ContentCategoryRemoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContentCategoryRemoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for contentcategory
    private java.lang.String contentcategory_address = "https://advertisersapi.doubleclick.net/v1.19/api/dfa-api/contentcategory";

    public java.lang.String getcontentcategoryAddress() {
        return contentcategory_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String contentcategoryWSDDServiceName = "contentcategory";

    public java.lang.String getcontentcategoryWSDDServiceName() {
        return contentcategoryWSDDServiceName;
    }

    public void setcontentcategoryWSDDServiceName(java.lang.String name) {
        contentcategoryWSDDServiceName = name;
    }

    public com.google.api.ads.dfa.axis.v1_19.ContentCategoryRemote getcontentcategory() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(contentcategory_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcontentcategory(endpoint);
    }

    public com.google.api.ads.dfa.axis.v1_19.ContentCategoryRemote getcontentcategory(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfa.axis.v1_19.ContentcategorySoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_19.ContentcategorySoapBindingStub(portAddress, this);
            _stub.setPortName(getcontentcategoryWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcontentcategoryEndpointAddress(java.lang.String address) {
        contentcategory_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfa.axis.v1_19.ContentCategoryRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfa.axis.v1_19.ContentcategorySoapBindingStub _stub = new com.google.api.ads.dfa.axis.v1_19.ContentcategorySoapBindingStub(new java.net.URL(contentcategory_address), this);
                _stub.setPortName(getcontentcategoryWSDDServiceName());
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
        if ("contentcategory".equals(inputPortName)) {
            return getcontentcategory();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ContentCategoryRemoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "contentcategory"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("contentcategory".equals(portName)) {
            setcontentcategoryEndpointAddress(address);
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
