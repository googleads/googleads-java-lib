/**
 * VideoCampaignCriterionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;

public class VideoCampaignCriterionServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201402.video.VideoCampaignCriterionService {

    public VideoCampaignCriterionServiceLocator() {
    }


    public VideoCampaignCriterionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VideoCampaignCriterionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VideoCampaignCriterionServiceInterfacePort
    private java.lang.String VideoCampaignCriterionServiceInterfacePort_address = "https://adwords.google.com/api/adwords/video/v201402/VideoCampaignCriterionService";

    public java.lang.String getVideoCampaignCriterionServiceInterfacePortAddress() {
        return VideoCampaignCriterionServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VideoCampaignCriterionServiceInterfacePortWSDDServiceName = "VideoCampaignCriterionServiceInterfacePort";

    public java.lang.String getVideoCampaignCriterionServiceInterfacePortWSDDServiceName() {
        return VideoCampaignCriterionServiceInterfacePortWSDDServiceName;
    }

    public void setVideoCampaignCriterionServiceInterfacePortWSDDServiceName(java.lang.String name) {
        VideoCampaignCriterionServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignCriterionServiceInterface getVideoCampaignCriterionServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VideoCampaignCriterionServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVideoCampaignCriterionServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignCriterionServiceInterface getVideoCampaignCriterionServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201402.video.VideoCampaignCriterionServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201402.video.VideoCampaignCriterionServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getVideoCampaignCriterionServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVideoCampaignCriterionServiceInterfacePortEndpointAddress(java.lang.String address) {
        VideoCampaignCriterionServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201402.video.VideoCampaignCriterionServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201402.video.VideoCampaignCriterionServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201402.video.VideoCampaignCriterionServiceSoapBindingStub(new java.net.URL(VideoCampaignCriterionServiceInterfacePort_address), this);
                _stub.setPortName(getVideoCampaignCriterionServiceInterfacePortWSDDServiceName());
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
        if ("VideoCampaignCriterionServiceInterfacePort".equals(inputPortName)) {
            return getVideoCampaignCriterionServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaignCriterionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaignCriterionServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VideoCampaignCriterionServiceInterfacePort".equals(portName)) {
            setVideoCampaignCriterionServiceInterfacePortEndpointAddress(address);
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
