// Copyright 2025 Google LLC
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
 * DaiAuthenticationKeyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public class DaiAuthenticationKeyServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyService {

    public DaiAuthenticationKeyServiceLocator() {
    }


    public DaiAuthenticationKeyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DaiAuthenticationKeyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DaiAuthenticationKeyServiceInterfacePort
    private java.lang.String DaiAuthenticationKeyServiceInterfacePort_address = "https://ads.google.com/apis/ads/publisher/v202502/DaiAuthenticationKeyService";

    public java.lang.String getDaiAuthenticationKeyServiceInterfacePortAddress() {
        return DaiAuthenticationKeyServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DaiAuthenticationKeyServiceInterfacePortWSDDServiceName = "DaiAuthenticationKeyServiceInterfacePort";

    public java.lang.String getDaiAuthenticationKeyServiceInterfacePortWSDDServiceName() {
        return DaiAuthenticationKeyServiceInterfacePortWSDDServiceName;
    }

    public void setDaiAuthenticationKeyServiceInterfacePortWSDDServiceName(java.lang.String name) {
        DaiAuthenticationKeyServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyServiceInterface getDaiAuthenticationKeyServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DaiAuthenticationKeyServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDaiAuthenticationKeyServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyServiceInterface getDaiAuthenticationKeyServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyServiceSoapBindingStub _stub = new com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDaiAuthenticationKeyServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDaiAuthenticationKeyServiceInterfacePortEndpointAddress(java.lang.String address) {
        DaiAuthenticationKeyServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyServiceSoapBindingStub _stub = new com.google.api.ads.admanager.axis.v202502.DaiAuthenticationKeyServiceSoapBindingStub(new java.net.URL(DaiAuthenticationKeyServiceInterfacePort_address), this);
                _stub.setPortName(getDaiAuthenticationKeyServiceInterfacePortWSDDServiceName());
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
        if ("DaiAuthenticationKeyServiceInterfacePort".equals(inputPortName)) {
            return getDaiAuthenticationKeyServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DaiAuthenticationKeyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DaiAuthenticationKeyServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DaiAuthenticationKeyServiceInterfacePort".equals(portName)) {
            setDaiAuthenticationKeyServiceInterfacePortEndpointAddress(address);
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
