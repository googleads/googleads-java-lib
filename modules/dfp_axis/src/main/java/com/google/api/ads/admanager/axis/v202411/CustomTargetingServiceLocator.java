// Copyright 2024 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * CustomTargetingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;

public class CustomTargetingServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.admanager.axis.v202411.CustomTargetingService {

    public CustomTargetingServiceLocator() {
    }


    public CustomTargetingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomTargetingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomTargetingServiceInterfacePort
    private java.lang.String CustomTargetingServiceInterfacePort_address = "https://ads.google.com/apis/ads/publisher/v202411/CustomTargetingService";

    public java.lang.String getCustomTargetingServiceInterfacePortAddress() {
        return CustomTargetingServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomTargetingServiceInterfacePortWSDDServiceName = "CustomTargetingServiceInterfacePort";

    public java.lang.String getCustomTargetingServiceInterfacePortWSDDServiceName() {
        return CustomTargetingServiceInterfacePortWSDDServiceName;
    }

    public void setCustomTargetingServiceInterfacePortWSDDServiceName(java.lang.String name) {
        CustomTargetingServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.admanager.axis.v202411.CustomTargetingServiceInterface getCustomTargetingServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomTargetingServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomTargetingServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.admanager.axis.v202411.CustomTargetingServiceInterface getCustomTargetingServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.admanager.axis.v202411.CustomTargetingServiceSoapBindingStub _stub = new com.google.api.ads.admanager.axis.v202411.CustomTargetingServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomTargetingServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomTargetingServiceInterfacePortEndpointAddress(java.lang.String address) {
        CustomTargetingServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.admanager.axis.v202411.CustomTargetingServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.admanager.axis.v202411.CustomTargetingServiceSoapBindingStub _stub = new com.google.api.ads.admanager.axis.v202411.CustomTargetingServiceSoapBindingStub(new java.net.URL(CustomTargetingServiceInterfacePort_address), this);
                _stub.setPortName(getCustomTargetingServiceInterfacePortWSDDServiceName());
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
        if ("CustomTargetingServiceInterfacePort".equals(inputPortName)) {
            return getCustomTargetingServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CustomTargetingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CustomTargetingServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomTargetingServiceInterfacePort".equals(portName)) {
            setCustomTargetingServiceInterfacePortEndpointAddress(address);
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
