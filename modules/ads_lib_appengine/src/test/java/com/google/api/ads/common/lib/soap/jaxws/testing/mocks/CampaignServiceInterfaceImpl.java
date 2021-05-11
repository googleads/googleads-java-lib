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

import static org.mockito.Mockito.when;

import com.google.api.ads.common.lib.soap.RequestInfoXPathSet;
import com.google.api.ads.common.lib.soap.ResponseInfoXPathSet;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsHandler;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsSoapContextHandler;
import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.EndpointReference;
import javax.xml.ws.handler.Handler;
import org.mockito.Mockito;

/**
 * Mock of a JAX-WS web service interface implementation. Used to test
 * {@link JaxWsHandler#createSoapClient(com.google.api.ads.common.lib.soap.SoapServiceDescriptor)}.
 */
public class CampaignServiceInterfaceImpl implements CampaignServiceInterface {

  public static String endpointAddress = "http://abcdefg";
  
  private Binding binding;
  private Map<String, Object> requestContext =
      new HashMap<String, Object>() {
        {
          put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointAddress);
        }
      };

  @SuppressWarnings("rawtypes")
  public CampaignServiceInterfaceImpl() {
    binding = Mockito.mock(Binding.class);
    RequestInfoXPathSet requestInfoXPathSet = Mockito.mock(RequestInfoXPathSet.class);
    ResponseInfoXPathSet responseInfoXPathSet = Mockito.mock(ResponseInfoXPathSet.class);
    List<Handler> handlerList =
        Lists.<Handler>newArrayList(
            new JaxWsSoapContextHandler(requestInfoXPathSet, responseInfoXPathSet));
    when(binding.getHandlerChain()).thenReturn(handlerList);
  }
  
  @Override
  public String getTestMessage() {
    return "Here!";
  }

  /**
   * Unused in this mock.
   * @see javax.xml.ws.BindingProvider#getRequestContext()
   */
  @Override
  public Map<String, Object> getRequestContext() {
    return requestContext;
  }

  /**
   * Unused in this mock.
   * @see javax.xml.ws.BindingProvider#getResponseContext()
   */
  @Override
  public Map<String, Object> getResponseContext() {
    return null;
  }

  /**
   * @see javax.xml.ws.BindingProvider#getBinding()
   */
  @Override
  public Binding getBinding() {
    return binding;
  }

  /**
   * Unused in this mock.
   * @see javax.xml.ws.BindingProvider#getEndpointReference()
   */
  @Override
  public EndpointReference getEndpointReference() {
    return null;
  }

  /**
   * Unused in this mock.
   * @see javax.xml.ws.BindingProvider#getEndpointReference(java.lang.Class)
   */
  @Override
  public <T extends EndpointReference> T getEndpointReference(Class<T> clazz) {
    return null;
  }
}