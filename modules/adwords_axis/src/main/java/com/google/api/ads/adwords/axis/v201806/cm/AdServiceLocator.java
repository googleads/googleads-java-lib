// Copyright 2018 Google LLC
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
 * AdServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;

public class AdServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201806.cm.AdService {

    public AdServiceLocator() {
    }


    public AdServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdServiceInterfacePort
    private java.lang.String AdServiceInterfacePort_address = "https://adwords.google.com/api/adwords/cm/v201806/AdService";

    public java.lang.String getAdServiceInterfacePortAddress() {
        return AdServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdServiceInterfacePortWSDDServiceName = "AdServiceInterfacePort";

    public java.lang.String getAdServiceInterfacePortWSDDServiceName() {
        return AdServiceInterfacePortWSDDServiceName;
    }

    public void setAdServiceInterfacePortWSDDServiceName(java.lang.String name) {
        AdServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201806.cm.AdServiceInterface getAdServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201806.cm.AdServiceInterface getAdServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201806.cm.AdServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201806.cm.AdServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdServiceInterfacePortEndpointAddress(java.lang.String address) {
        AdServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201806.cm.AdServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201806.cm.AdServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201806.cm.AdServiceSoapBindingStub(new java.net.URL(AdServiceInterfacePort_address), this);
                _stub.setPortName(getAdServiceInterfacePortWSDDServiceName());
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
        if ("AdServiceInterfacePort".equals(inputPortName)) {
            return getAdServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AdService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AdServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdServiceInterfacePort".equals(portName)) {
            setAdServiceInterfacePortEndpointAddress(address);
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
