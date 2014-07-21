/**
 * VideoTargetingGroupServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;

public class VideoTargetingGroupServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupService {

    public VideoTargetingGroupServiceLocator() {
    }


    public VideoTargetingGroupServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VideoTargetingGroupServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VideoTargetingGroupServiceInterfacePort
    private java.lang.String VideoTargetingGroupServiceInterfacePort_address = "https://adwords.google.com/api/adwords/video/v201406/VideoTargetingGroupService";

    public java.lang.String getVideoTargetingGroupServiceInterfacePortAddress() {
        return VideoTargetingGroupServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VideoTargetingGroupServiceInterfacePortWSDDServiceName = "VideoTargetingGroupServiceInterfacePort";

    public java.lang.String getVideoTargetingGroupServiceInterfacePortWSDDServiceName() {
        return VideoTargetingGroupServiceInterfacePortWSDDServiceName;
    }

    public void setVideoTargetingGroupServiceInterfacePortWSDDServiceName(java.lang.String name) {
        VideoTargetingGroupServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupServiceInterface getVideoTargetingGroupServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VideoTargetingGroupServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVideoTargetingGroupServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupServiceInterface getVideoTargetingGroupServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getVideoTargetingGroupServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVideoTargetingGroupServiceInterfacePortEndpointAddress(java.lang.String address) {
        VideoTargetingGroupServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupServiceSoapBindingStub(new java.net.URL(VideoTargetingGroupServiceInterfacePort_address), this);
                _stub.setPortName(getVideoTargetingGroupServiceInterfacePortWSDDServiceName());
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
        if ("VideoTargetingGroupServiceInterfacePort".equals(inputPortName)) {
            return getVideoTargetingGroupServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoTargetingGroupService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoTargetingGroupServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VideoTargetingGroupServiceInterfacePort".equals(portName)) {
            setVideoTargetingGroupServiceInterfacePortEndpointAddress(address);
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
