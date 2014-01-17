// Copyright 2011, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.soap.testing;

import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.SoapCall;
import com.google.api.ads.common.lib.soap.SoapCallReturn;
import com.google.api.ads.common.lib.soap.SoapClientHandler;
import com.google.api.ads.common.lib.soap.SoapServiceDescriptor;

import java.util.Map;

import javax.xml.namespace.QName;

/**
 * Test SOAP Client Handler implementation.
 *
 * @author Joseph DiLallo
 */
public class TestHandler extends SoapClientHandler<Object> {

  /**
   * Sets the endpoint address of the given SOAP client.
   *
   * @param soapClient the SOAP client to set the endpoint address for
   * @param endpointAddress the target endpoint address
   */
  public void setEndpointAddress(Object soapClient, String endpointAddress) {}

  /**
   * Returns a SOAP header from the given SOAP client, if it exists.
   *
   * @param soapClient the SOAP client to check for the given header
   * @param headerName the name of the header being looked for
   * @return the header element, if it exists
   */
  public Object getHeader(Object soapClient, String headerName) {
    return null;
  }

  /**
   * Clears all of the SOAP headers from the given SOAP client.
   *
   * @param soapClient the client to remove the headers from
   */
  public void clearHeaders(Object soapClient) {
  }

  /**
   * Sets a SOAP header for the given SOAP client.
   *
   * @param soapClient the client to receive the given header
   * @param namespace the namespace the header belongs to
   * @param headerName the name of the header to set
   * @param headerValue the value that the header should have
   * @throws ServiceException thrown if the headers could not be set
   */
  public void setHeader(Object soapClient, String namespace, String headerName,
      Object headerValue) {
  }

  /**
   * Set whether SOAP requests should use compression.
   *
   * @param soapClient the client to set compression settings for
   * @param compress whether or not to use compression
   */
  public void setCompression(Object soapClient, boolean compress) {
  }

  /**
   * Creates a SOAP client using a SOAP service descriptor.
   *
   * @param soapServiceDescriptor the descriptor to use for creating a client
   * @return the SOAP client for this descriptor
   * @throws ServiceException thrown if the SOAP client cannot be created
   */
  public Object createSoapClient(SoapServiceDescriptor soapServiceDescriptor)
      throws ServiceException {
    return null;
  }

  /**
   * Invoke a SOAP call.
   *
   * @param soapCall the call to make to a SOAP web service
   * @return information about the SOAP response
   */
  public SoapCallReturn invokeSoapCall(SoapCall<Object> soapCall) {
    return null;
  }

  /**
   * @see com.google.api.ads.common.lib.soap.SoapClientHandlerInterface#
   * createSoapHeaderElement(javax.xml.namespace.QName)
   */
  public javax.xml.soap.SOAPHeaderElement createSoapHeaderElement(QName qName) {
    return null;
  }

  /**
   * @see com.google.api.ads.common.lib.soap.SoapClientHandlerInterface#
   * getEndpointAddress(java.lang.Object)
   */
  public String getEndpointAddress(Object soapClient) {
    return null;
  }

  /**
   * @see com.google.api.ads.common.lib.soap.SoapClientHandlerInterface#
   * putAllHttpHeaders(java.lang.Object, java.util.Map)
   */
  public void putAllHttpHeaders(Object soapClient, Map<String, String> headersMap) {}
}
