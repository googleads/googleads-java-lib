// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.soap.jaxws;

import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.RequestInfoXPathSet;
import com.google.api.ads.common.lib.soap.ResponseInfoXPathSet;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import java.util.HashSet;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 * SOAP Context Handler for use with JAX-WS. Responsible for logging SOAP XML
 * messages and attaching implicit headers to the outgoing messages.
 *
 * This class is not thread-safe. Every SOAP client is expected to have its own
 * instance of this class and each SOAP call made by those clients has to be
 * atomic.
 */
public class JaxWsSoapContextHandler implements SOAPHandler<SOAPMessageContext> {

  private RequestInfo.Builder lastRequestInfo;
  private ResponseInfo.Builder lastResponseInfo;
  private Set<SOAPElement> soapHeaders = new HashSet<SOAPElement>();
  private final RequestInfoXPathSet requestInfoXPathSet;
  private final ResponseInfoXPathSet responseInfoXPathSet;

  @Inject
  public JaxWsSoapContextHandler(
      RequestInfoXPathSet requestInfoXPathSet,
      ResponseInfoXPathSet responseInfoXPathSet) {
    this.requestInfoXPathSet = requestInfoXPathSet;
    this.responseInfoXPathSet = responseInfoXPathSet;
    this.lastRequestInfo = new RequestInfo.Builder();
    this.lastResponseInfo = new ResponseInfo.Builder();
  }

  /**
   * Captures pertinent information from SOAP messages exchanged by the SOAP
   * service this handler is attached to. Also responsible for placing custom
   * (implicit) SOAP headers on outgoing messages.
   *
   * @see SOAPHandler#handleMessage(MessageContext)
   * @param context the context of the SOAP message passing through this handler
   * @return whether this SOAP interaction should continue
   */
  @Override
  public boolean handleMessage(SOAPMessageContext context) {
    if ((Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
      // Outbound message (request), so reset the last request and response builders.
      lastRequestInfo = new RequestInfo.Builder();
      lastResponseInfo = new ResponseInfo.Builder();      
      SOAPMessage soapMessage = context.getMessage();
      try {
        SOAPHeader soapHeader = soapMessage.getSOAPHeader();
        if (soapHeader == null) {
          soapHeader = soapMessage.getSOAPPart().getEnvelope().addHeader();
        }

        for (SOAPElement header : soapHeaders) {
          soapHeader.addChildElement(header);
        }
      } catch (SOAPException e) {
        throw new ServiceException("Error setting SOAP headers on outbound message.", e);
      }
      captureServiceAndOperationNames(context);
    }
    captureSoapXml(context);
    return true;
  }

  /**
   * Extracts the name of the web service and SOAP operation from a message.
   *
   * @param context the context of the SOAP message passing through this handler
   */
  @VisibleForTesting
  void captureServiceAndOperationNames(SOAPMessageContext context) {
    lastRequestInfo.withServiceName(
        ((QName) context.get(MessageContext.WSDL_SERVICE)).getLocalPart());
    String lastOperationCalled;
    try {
      lastOperationCalled = context.getMessage().getSOAPBody().getFirstChild().getLocalName();
    } catch (SOAPException e) {
      lastOperationCalled = "";
      // Fail silently. The logs will be missing the operation name for this interaction.
    }
    lastRequestInfo.withMethodName(lastOperationCalled);
  }

  /**
   * Captures pertinent information from a message representing a SOAP fault.
   *
   * @see SOAPHandler#handleFault(MessageContext)
   * @param context the context of the SOAP message passing through this handler
   * @return whether this SOAP interaction should continue
   */
  @Override
  public boolean handleFault(SOAPMessageContext context) {
      captureSoapXml(context);
      return true;
  }

  /**
   * Captures the raw XML message behind a SOAP interaction.
   *
   * @param context the context of the SOAP message passing through this handler
   */
  private void captureSoapXml(SOAPMessageContext context) {
    SOAPMessage message = context.getMessage();
    if ((Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
      // Outbound message (request).
      requestInfoXPathSet.parseMessage(lastRequestInfo, message);
    } else {
      // Inbound message (response).
      responseInfoXPathSet.parseMessage(lastResponseInfo, message);
    }
  }

  /** Returns info for the last SOAP request. */
  public RequestInfo.Builder getLastRequestInfoBuilder() {
    return lastRequestInfo;
  }
  
  /** Returns info for the last SOAP response. */
  public ResponseInfo.Builder getLastResponseInfoBuilder() {
    return lastResponseInfo;
  }
  
  /**
   * Adds a header to the list of SOAP request headers.
   *
   * @param namespace the namespace the header belongs to
   * @param headerName the name of the header element
   * @param headerValue the value of the header element
   */
  public void addHeader(String namespace, String headerName, SOAPElement headerValue) {
    this.soapHeaders.add(headerValue);
  }

  /**
   * Clears all the headers set in this handler.
   */
  public void clearHeaders() {
    this.soapHeaders.clear();
  }

  /**
   * Returns the set of SOAP headers added to this handler.
   */
  public Set<SOAPElement> getAddedHeaders() {
    return soapHeaders;
  }

  /**
   * @see SOAPHandler#getHeaders()
   */
  @Override
  public Set<QName> getHeaders() {
    return null;
  }

  /**
   * @see SOAPHandler#close(MessageContext)
   */
  @Override
  public void close(MessageContext messageContext) {}
}
