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
 * OfflineDataUploadServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;

public class OfflineDataUploadServiceLocator extends org.apache.axis.client.Service implements com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadService {

    public OfflineDataUploadServiceLocator() {
    }


    public OfflineDataUploadServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OfflineDataUploadServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OfflineDataUploadServiceInterfacePort
    private java.lang.String OfflineDataUploadServiceInterfacePort_address = "https://adwords.google.com/api/adwords/rm/v201802/OfflineDataUploadService";

    public java.lang.String getOfflineDataUploadServiceInterfacePortAddress() {
        return OfflineDataUploadServiceInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OfflineDataUploadServiceInterfacePortWSDDServiceName = "OfflineDataUploadServiceInterfacePort";

    public java.lang.String getOfflineDataUploadServiceInterfacePortWSDDServiceName() {
        return OfflineDataUploadServiceInterfacePortWSDDServiceName;
    }

    public void setOfflineDataUploadServiceInterfacePortWSDDServiceName(java.lang.String name) {
        OfflineDataUploadServiceInterfacePortWSDDServiceName = name;
    }

    public com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadServiceInterface getOfflineDataUploadServiceInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OfflineDataUploadServiceInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOfflineDataUploadServiceInterfacePort(endpoint);
    }

    public com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadServiceInterface getOfflineDataUploadServiceInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOfflineDataUploadServiceInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOfflineDataUploadServiceInterfacePortEndpointAddress(java.lang.String address) {
        OfflineDataUploadServiceInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadServiceInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadServiceSoapBindingStub _stub = new com.google.api.ads.adwords.axis.v201802.rm.OfflineDataUploadServiceSoapBindingStub(new java.net.URL(OfflineDataUploadServiceInterfacePort_address), this);
                _stub.setPortName(getOfflineDataUploadServiceInterfacePortWSDDServiceName());
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
        if ("OfflineDataUploadServiceInterfacePort".equals(inputPortName)) {
            return getOfflineDataUploadServiceInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUploadService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "OfflineDataUploadServiceInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OfflineDataUploadServiceInterfacePort".equals(portName)) {
            setOfflineDataUploadServiceInterfacePortEndpointAddress(address);
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
