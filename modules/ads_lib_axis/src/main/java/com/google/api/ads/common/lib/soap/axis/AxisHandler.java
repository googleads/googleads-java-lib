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

package com.google.api.ads.common.lib.soap.axis;

import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.RequestInfoXPathSet;
import com.google.api.ads.common.lib.soap.ResponseInfoXPathSet;
import com.google.api.ads.common.lib.soap.SoapCall;
import com.google.api.ads.common.lib.soap.SoapClientHandler;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.common.lib.soap.SoapServiceDescriptor;
import com.google.api.ads.common.lib.soap.compatability.AxisCompatible;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;
import java.util.Map;
import com.google.inject.Inject;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.EngineConfigurationFactory;
import org.apache.axis.MessageContext;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.transport.http.HTTPConstants;
import org.apache.commons.beanutils.BeanUtils;

/**
 * SOAP Client Handler implementation for use with Axis 1.x.
 */
public class AxisHandler extends SoapClientHandler<Stub> {

  private final EngineConfigurationFactory engineConfigurationFactory;
  private final RequestInfoXPathSet requestInfoXPathSet;
  private final ResponseInfoXPathSet responseInfoXPathSet;
  
  @Inject
  public AxisHandler(EngineConfigurationFactory engineConfigurationFactory,
      RequestInfoXPathSet requestInfoXPathSet,
      ResponseInfoXPathSet responseInfoXPathSet) {
    this.engineConfigurationFactory = engineConfigurationFactory;
    this.requestInfoXPathSet = requestInfoXPathSet;
    this.responseInfoXPathSet = responseInfoXPathSet;
  }
  
  /**
   * Sets the endpoint address of the given SOAP client.
   *
   * @param soapClient the SOAP client to set the endpoint address for
   * @param endpointAddress the target endpoint address
   */
  @Override
  public void setEndpointAddress(Stub soapClient, String endpointAddress) {
    soapClient._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, endpointAddress);
  }
  
  /**
   * Sets the read timeout of the given SOAP client.
   *
   * @param soapClient the SOAP client to set the read timeout for
   * @param timeout the timeout in milliseconds
   */
  @Override
  public void setRequestTimeout(Stub soapClient, int timeout) {
    soapClient.setTimeout(timeout);
  }

  /**
   * Returns a SOAP header from the given SOAP client, if it exists.
   *
   * @param soapClient the SOAP client to check for the given header
   * @param headerName the name of the header being looked for
   * @return the header element, if it exists
   */
  @Override
  public Object getHeader(Stub soapClient, String headerName) {
    SOAPHeaderElement[] soapHeaders = soapClient.getHeaders();
    for (SOAPHeaderElement soapHeader : soapHeaders) {
      if (soapHeader.getName().equals(headerName)) {
        return soapHeader;
      }
    }
    return null;
  }

  /**
   * Clears all of the SOAP headers from the given SOAP client.
   *
   * @param soapClient the client to remove the headers from
   */
  @Override
  public void clearHeaders(Stub soapClient) {
    soapClient._setProperty(HTTPConstants.REQUEST_HEADERS, new Hashtable<String, String>());
    soapClient.clearHeaders();
  }

  /**
   * @see  SoapClientHandler#setHeader(Object, String, String, Object)
   */
  @Override
  public void setHeader(Stub soapClient, String namespace, String headerName,
      Object headerValue) {
    try {
      QName qName = new QName(namespace, headerName);
      SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement(qName);
      soapHeaderElement.setObjectValue(headerValue);
      soapHeaderElement.setActor(null);
      soapClient.setHeader(soapHeaderElement);
    } catch (SOAPException e) {
      throw new ServiceException("Could not set header.", e);
    }
  }
  
  /**
   * Updates the child attribute of headerName named childName to childValue.
   *
   * @param soapClient the stub
   * @param parentHeaderName the name of the parent header
   * @param childName the name of the child
   * @param childValue the value for the child
   *
   * @throws NullPointerException if no header exists named parentHeaderName
   */
  public void setHeaderChild(Stub soapClient, String parentHeaderName, String childName,
      Object childValue) {
    SOAPHeaderElement headerElement = (SOAPHeaderElement) getHeader(soapClient, parentHeaderName);
    Object headerObject = Preconditions.checkNotNull(headerElement,
        "Parent header named %s does not exist", parentHeaderName).getObjectValue();
    try {
      BeanUtils.setProperty(headerObject, childName, childValue);
    } catch (IllegalAccessException e) {
      throw new ServiceException("Failed to set header child " + childName, e);
    } catch (InvocationTargetException e) {
      throw new ServiceException("Failed to set header child " + childName, e);
    }
  }

  /**
   * @see SoapClientHandler#putAllHttpHeaders(Object, Map)
   */
  @Override
  public void putAllHttpHeaders(Stub soapClient, Map<String, String> headersMap) {
    @SuppressWarnings("unchecked")
    Hashtable<String, String> headers =
        (Hashtable<String, String>) soapClient._getProperty(HTTPConstants.REQUEST_HEADERS);
    if (headers == null) {
      headers = new Hashtable<String, String>();
    }
    headers.putAll(headersMap);
    soapClient._setProperty(HTTPConstants.REQUEST_HEADERS, headers);
  }

  /**
   * Set whether SOAP requests should use compression.
   * 
   * @param soapClient the client to set compression settings for
   * @param compress whether or not to use compression
   */
  @Override
  public void setCompression(Stub soapClient, boolean compress) {
    soapClient._setProperty(HTTPConstants.MC_ACCEPT_GZIP, compress);
    soapClient._setProperty(HTTPConstants.MC_GZIP_REQUEST, compress);
  }

  /**
   * Creates a SOAP client using a SOAP service descriptor.
   *
   * @param soapServiceDescriptor the descriptor to use for creating a client
   * @return the SOAP client for this descriptor
   * @throws ServiceException thrown if the SOAP client cannot be created
   */
  @Override
  public Stub createSoapClient(SoapServiceDescriptor soapServiceDescriptor)
      throws ServiceException {
    try {
      if (soapServiceDescriptor instanceof AxisCompatible) {
        AxisCompatible axisCompatibleService = (AxisCompatible) soapServiceDescriptor;
        EngineConfiguration engineConfiguration =
            engineConfigurationFactory.getClientEngineConfig();
        Service locator = (Service) axisCompatibleService.getLocatorClass()
            .getConstructor(new Class[] {EngineConfiguration.class})
            .newInstance(new Object[] {engineConfiguration});
        return (Stub) locator.getClass().getMethod("getPort", Class.class)
            .invoke(locator, soapServiceDescriptor.getInterfaceClass());
      }
      throw new ServiceException(
          "Service [" + soapServiceDescriptor + "] not compatible with Axis", null);
    } catch (SecurityException e) {
      throw new ServiceException("Unexpected Exception.", e);
    } catch (NoSuchMethodException e) {
      throw new ServiceException("Unexpected Exception.", e);
    } catch (IllegalArgumentException e) {
      throw new ServiceException("Unexpected Exception.", e);
    } catch (IllegalAccessException e) {
      throw new ServiceException("Unexpected Exception.", e);
    } catch (InvocationTargetException e) {
      throw new ServiceException("Unexpected Exception.", e);
    } catch (ClassNotFoundException e) {
      throw new ServiceException("Unexpected Exception.", e);
    } catch (InstantiationException e) {
      throw new ServiceException("Unexpected Exception.", e);
    }
  }

  /**
   * Invoke a SOAP call.
   *
   * @param soapCall the call to make to a SOAP web service
   * @return information about the SOAP response
   */
  @Override
  public RemoteCallReturn invokeSoapCall(SoapCall<Stub> soapCall) {
    Stub stub = soapCall.getSoapClient();
    RemoteCallReturn.Builder builder = new RemoteCallReturn.Builder();
    synchronized (stub) {
      Object result = null;
      try {
        result = invoke(soapCall);
      } catch (InvocationTargetException e) {
        builder.withException(e.getTargetException());
      } catch (Exception e) {
        builder.withException(e);
      } finally {
        MessageContext messageContext = stub._getCall().getMessageContext();
        RequestInfo.Builder requestInfoBuilder = new RequestInfo.Builder()
                .withMethodName(stub._getCall().getOperationName().getLocalPart())
                .withServiceName(stub._getService().getServiceName().getLocalPart())
                .withUrl(stub._getCall().getTargetEndpointAddress());
        requestInfoXPathSet.parseMessage(requestInfoBuilder, messageContext.getRequestMessage());
        builder.withRequestInfo(requestInfoBuilder
                .build());
        ResponseInfo.Builder responseInfoBuilder = new ResponseInfo.Builder();
        responseInfoXPathSet.parseMessage(responseInfoBuilder, messageContext.getResponseMessage());
        builder.withResponseInfo(responseInfoBuilder.build());
      }

      return builder.withReturnValue(result).build();
    }
  }

  /**
   * @see SoapClientHandlerInterface#getEndpointAddress(Object)
   */
  @Override
  public String getEndpointAddress(Stub soapClient) {
    return (String) soapClient._getProperty(Stub.ENDPOINT_ADDRESS_PROPERTY);
  }

  /**
   * @see SoapClientHandlerInterface#createSoapHeaderElement(QName)
   */
  @Override
  public javax.xml.soap.SOAPHeaderElement createSoapHeaderElement(QName qName) {
    return new SOAPHeaderElement(qName);
  }
}
