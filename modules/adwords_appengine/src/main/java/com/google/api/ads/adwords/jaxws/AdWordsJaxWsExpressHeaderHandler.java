// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsHandler;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

import javax.inject.Inject;
import javax.xml.ws.BindingProvider;

/**
 * AdWords Express-specific custom header handler.
 */
public class AdWordsJaxWsExpressHeaderHandler implements
    HeaderHandler<AdWordsSession, AdWordsServiceDescriptor> {

  private final JaxWsHandler jaxWsHandler;
  
  private final AdWordsApiConfiguration adWordsApiConfiguration;
  
  @VisibleForTesting
  static final String EXPRESS_BUSINESS_ID_LOCAL_PART = "expressBusinessId";
  @VisibleForTesting
  static final String PLUS_PAGE_ID_LOCAL_PART = "pageId";
  
  @Inject
  public AdWordsJaxWsExpressHeaderHandler(JaxWsHandler jaxHandler,
      AdWordsApiConfiguration adWordsApiConfiguration) {
    this.jaxWsHandler = jaxHandler;
    this.adWordsApiConfiguration = adWordsApiConfiguration;
  }

  @Override
  public void setHeaders(Object soapClient, AdWordsSession adWordsSession,
      AdWordsServiceDescriptor adWordsServiceDescriptor) throws ServiceException,
      AuthenticationException {
    if (adWordsSession.getExpressBusinessId() != null
        || adWordsSession.getExpressPlusPageId() != null) {
      Preconditions.checkArgument(!(adWordsSession.getExpressBusinessId() != null
          && adWordsSession.getExpressPlusPageId() != null),
          "Both expressBusinessId and expressPlusPageId are not null. Please set "
          + "expressBusinessId, expressPlusPageId or neither, but not both.");
      Preconditions.checkArgument(soapClient instanceof BindingProvider,
          "soapClient must be BindingProvider but was: %s", soapClient);
      BindingProvider bindingProvider = (BindingProvider) soapClient;
      String childNamespace = String.format("%s/express/%s",
          adWordsApiConfiguration.getNamespacePrefix(), adWordsServiceDescriptor.getVersion());
      if (adWordsSession.getExpressPlusPageId() != null) {
        jaxWsHandler.setHeaderChildString(bindingProvider,
            AdWordsJaxWsHeaderHandler.REQUEST_HEADER_LOCAL_PART, childNamespace,
            PLUS_PAGE_ID_LOCAL_PART, adWordsSession.getExpressPlusPageId().toString());
      } else {
        jaxWsHandler.setHeaderChildString(bindingProvider,
            AdWordsJaxWsHeaderHandler.REQUEST_HEADER_LOCAL_PART, childNamespace,
            EXPRESS_BUSINESS_ID_LOCAL_PART, adWordsSession.getExpressBusinessId().toString());
      }
    }
  }
}
