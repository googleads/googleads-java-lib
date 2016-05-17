/**
 * LineItemCreativeAssociationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public class LineItemCreativeAssociationServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.dfp.axis.v201605.LineItemCreativeAssociationService {

    public LineItemCreativeAssociationServiceLocator() {
    }


    public LineItemCreativeAssociationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LineItemCreativeAssociationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LineItemCreativeAssociationServiceInterfacePort
    private java.lang.String LineItemCreativeAssociationServiceInterfacePort_address = "https://ads.google.com/apis/ads/publisher/v201605/LineItemCreativeAssociationService";

    public java.lang.String getLineItemCreativeAssociationServiceInterfacePortAddress() {
        return LineItemCreativeAssociationServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LineItemCreativeAssociationServiceInterfacePortWSDDServiceName = "LineItemCreativeAssociationServiceInterfacePort";

    public java.lang.String getLineItemCreativeAssociationServiceInterfacePortWSDDServiceName() {
        return LineItemCreativeAssociationServiceInterfacePortWSDDServiceName;
    }

    public void setLineItemCreativeAssociationServiceInterfacePortWSDDServiceName(java.lang.String name) {
        LineItemCreativeAssociationServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.dfp.axis.v201605.LineItemCreativeAssociationServiceInterface getLineItemCreativeAssociationServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LineItemCreativeAssociationServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLineItemCreativeAssociationServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.dfp.axis.v201605.LineItemCreativeAssociationServiceInterface getLineItemCreativeAssociationServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.dfp.axis.v201605.LineItemCreativeAssociationServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201605.LineItemCreativeAssociationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLineItemCreativeAssociationServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLineItemCreativeAssociationServiceInterfacePortEndpointAddress(java.lang.String address) {
        LineItemCreativeAssociationServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.dfp.axis.v201605.LineItemCreativeAssociationServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.dfp.axis.v201605.LineItemCreativeAssociationServiceSoapBindingStub _stub = new com.google.api.ads.dfp.axis.v201605.LineItemCreativeAssociationServiceSoapBindingStub(new java.net.URL(LineItemCreativeAssociationServiceInterfacePort_address), this);
                _stub.setPortName(getLineItemCreativeAssociationServiceInterfacePortWSDDServiceName());
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
        if ("LineItemCreativeAssociationServiceInterfacePort".equals(inputPortName)) {
            return getLineItemCreativeAssociationServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "LineItemCreativeAssociationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201605", "LineItemCreativeAssociationServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LineItemCreativeAssociationServiceInterfacePort".equals(portName)) {
            setLineItemCreativeAssociationServiceInterfacePortEndpointAddress(address);
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
