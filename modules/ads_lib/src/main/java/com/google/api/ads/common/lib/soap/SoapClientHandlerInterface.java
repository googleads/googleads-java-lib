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

package com.google.api.ads.common.lib.soap;

import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.exception.ServiceException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPHeaderElement;

/**
 * Interface for SOAP client handlers. Instances of {@link SoapServiceClient}
 * use this handlers implementing these methods to interact with SOAP clients
 * from different frameworks. There is separate handler for each framework
 * that implements this interface.
 *
 * @param <T> the client type for the SOAP toolkit, e.g., {@code Stub}
 * for Axis, {@code BindingProvider} for JAX-WS, etc.
 */
public interface SoapClientHandlerInterface<T> {

  /**
   * Creates a SOAP client using the {@code soapServiceDescriptor}.
   *
   * @param soapServiceDescriptor the service descriptor describing the service
   *     that the SOAP client will be stubbed against
   * @return an instantiated SOAP client in the framework on this handler
   * @throws ServiceException if there as a problem creating the SOAP client
   */
  T createSoapClient(SoapServiceDescriptor soapServiceDescriptor) throws ServiceException;

  /**
   * Executes the {@code SoapCall}, which has a reference to a
   * {@code SoapClientHandlerInterface}.
   *
   * @param soapCall the {@code SoapCall} to execute
   * @return the result from the call to the SOAP client
   */
  RemoteCallReturn invokeSoapCall(SoapCall<T> soapCall);

  /**
   * Sets the endpoint address on the SOAP client.
   */
  void setEndpointAddress(T soapClient, String endpointAddress);

  /**
   * Gets the endpoint address on the SOAP client.
   * @return the endpoint address
   */
  String getEndpointAddress(T soapClient);

  /**
   * Clears the headers of the SOAP client.
   */
  void clearHeaders(T soapClient);

  /**
   * Creates a SOAP header element object specific to the framework that this
   * handler works with.
   *
   * @param qName qualified name of the header element
   * @return a new SOAP header element object
   */
  SOAPHeaderElement createSoapHeaderElement(QName qName);

  /**
   * Sets a header on the SOAP client.
   *
   * @param soapClient the SOAP client to set the header of
   * @param namespace the namespace of the header
   * @param headerName the name of the header
   * @param headerValue the value of the header
   * @throws ServiceException if there was a problem setting the header
   */
  void setHeader(T soapClient, String namespace, String headerName, Object headerValue)
      throws ServiceException;

  /**
   * Puts all headers into the existing HTTP headers of the SOAP client,
   * overwriting any existing header keys.
   *
   * @param soapClient the SOAP client to set the headers on
   * @param headersMap the map of headers in the form of header name to value
   */
  void putAllHttpHeaders(T soapClient, Map<String, String> headersMap);

  /**
   * Gets the value of a header given the SOAP client and the header name.
   */
  Object getHeader(T soapClient, String headerName);

  /**
   * Sets if the SOAP client should use compression. This method should fail
   * gracefully in the event that the SOAP framework does not support
   * compression.
   */
  void setCompression(T soapClient, boolean compress);
  
  /**
   * Sets the read timeout of the given SOAP client.
   *
   * @param soapClient the SOAP client to set the read timeout for
   * @param timeout the timeout in milliseconds
   */
  void setRequestTimeout(T soapClient, int timeout);

  /**
   * Gets the method from the SOAP client that matches the supplied method.
   * <p>
   * In the default implementation, only the method name and return type
   * will be matched.
   * </p>
   *
   * @param soapClient the SOAP client within which to search for the method
   * @param method the method to match
   * @return the SOAP client's matching method
   * @throws NoSuchMethodException thrown if the SOAP client does not contain
   *     the requested method.
   */
  Method getSoapClientMethod(T soapClient, Method method) throws NoSuchMethodException;
}
