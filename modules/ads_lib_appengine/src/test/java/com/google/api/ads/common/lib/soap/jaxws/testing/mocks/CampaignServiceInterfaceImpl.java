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

package com.google.api.ads.common.lib.soap.jaxws.testing.mocks;

import com.google.api.ads.common.lib.soap.jaxws.JaxWsHandler;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsSoapContextHandler;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.EndpointReference;
import javax.xml.ws.handler.Handler;

/**
 * Mock of a JAX-WS web service interface implementation. Used to test
 * {@link JaxWsHandler#createSoapClient(com.google.api.ads.common.lib.soap.SoapServiceDescriptor)}.
 *
 * @author Joseph DiLallo
 */
public class CampaignServiceInterfaceImpl implements CampaignServiceInterface {

  public static String endpointAddress = "http://abcdefg";
  private Binding binding = new MyBinding();
  private Map<String, Object> requestContext = new HashMap<String, Object>()
      {{ put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointAddress); }};

  public String getTestMessage() {
    return "Here!";
  }

  /**
   * Unused in this mock.
   * @see javax.xml.ws.BindingProvider#getRequestContext()
   */
  public Map<String, Object> getRequestContext() {
    return requestContext;
  }

  /**
   * Unused in this mock.
   * @see javax.xml.ws.BindingProvider#getResponseContext()
   */
  public Map<String, Object> getResponseContext() {
    return null;
  }

  /**
   * @see javax.xml.ws.BindingProvider#getBinding()
   */
  public Binding getBinding() {
    return binding;
  }

  /**
   * Unused in this mock.
   * @see javax.xml.ws.BindingProvider#getEndpointReference()
   */
  public EndpointReference getEndpointReference() {
    return null;
  }

  /**
   * Unused in this mock.
   * @see javax.xml.ws.BindingProvider#getEndpointReference(java.lang.Class)
   */
  public <T extends EndpointReference> T getEndpointReference(Class<T> clazz) {
    return null;
  }

  /**
   * Mock of a {@link Binding} implementation. Used to test
   * {@link
   * JaxWsHandler#createSoapClient(com.google.api.ads.common.lib.soap.SoapServiceDescriptor)}.
   *
   * @author Joseph DiLallo
   */
  private static class MyBinding implements Binding {

    private List<Handler> chain = new LinkedList<Handler>();

    /**
     * Constructor.
     */
    public MyBinding() {
      chain.add(new JaxWsSoapContextHandler());
    }

    /**
     * @see javax.xml.ws.Binding#getHandlerChain()
     */
    public List<Handler> getHandlerChain() {
      return chain;
    }

    /**
     * Unused in this mock.
     * @see javax.xml.ws.Binding#setHandlerChain(java.util.List)
     */
    public void setHandlerChain(List<Handler> chain) {
    }

    /**
     * Unused in this mock.
     * @see javax.xml.ws.Binding#getBindingID()
     */
    public String getBindingID() {
      return null;
    }
  }
}
