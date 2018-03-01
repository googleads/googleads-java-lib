// Copyright 2018 Google Inc. All Rights Reserved.
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
 * OfflineConversionFeedServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class OfflineConversionFeedServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedService {

    public OfflineConversionFeedServiceLocator() {
    }


    public OfflineConversionFeedServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OfflineConversionFeedServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OfflineConversionFeedServiceInterfacePort
    private java.lang.String OfflineConversionFeedServiceInterfacePort_address = "https://adwords.google.com/api/adwords/cm/v201802/OfflineConversionFeedService";

    public java.lang.String getOfflineConversionFeedServiceInterfacePortAddress() {
        return OfflineConversionFeedServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OfflineConversionFeedServiceInterfacePortWSDDServiceName = "OfflineConversionFeedServiceInterfacePort";

    public java.lang.String getOfflineConversionFeedServiceInterfacePortWSDDServiceName() {
        return OfflineConversionFeedServiceInterfacePortWSDDServiceName;
    }

    public void setOfflineConversionFeedServiceInterfacePortWSDDServiceName(java.lang.String name) {
        OfflineConversionFeedServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedServiceInterface getOfflineConversionFeedServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OfflineConversionFeedServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOfflineConversionFeedServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedServiceInterface getOfflineConversionFeedServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOfflineConversionFeedServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOfflineConversionFeedServiceInterfacePortEndpointAddress(java.lang.String address) {
        OfflineConversionFeedServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201802.cm.OfflineConversionFeedServiceSoapBindingStub(new java.net.URL(OfflineConversionFeedServiceInterfacePort_address), this);
                _stub.setPortName(getOfflineConversionFeedServiceInterfacePortWSDDServiceName());
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
        if ("OfflineConversionFeedServiceInterfacePort".equals(inputPortName)) {
            return getOfflineConversionFeedServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OfflineConversionFeedService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OfflineConversionFeedServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OfflineConversionFeedServiceInterfacePort".equals(portName)) {
            setOfflineConversionFeedServiceInterfacePortEndpointAddress(address);
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
