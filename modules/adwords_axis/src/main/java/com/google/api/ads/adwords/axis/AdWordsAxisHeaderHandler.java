// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.AuthorizationHeaderHandler;
import com.google.api.ads.common.lib.soap.axis.AxisHandler;
import com.google.api.ads.common.lib.soap.axis.AxisSoapHeaderFactory;
import com.google.api.ads.common.lib.useragent.UserAgentCombiner;
import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationTargetException;
import javax.inject.Inject;
import org.apache.axis.client.Stub;

/**
 * AdWords implementation of {@link HeaderHandler} for Axis.
 */
public class AdWordsAxisHeaderHandler implements
    HeaderHandler<AdWordsSession, AdWordsServiceDescriptor> {

  private final AxisHandler soapClientHandler;
  private final AdWordsApiConfiguration adWordsApiConfiguration;
  private final AdsLibConfiguration adsLibConfiguration;
  private final AuthorizationHeaderHandler authorizationHeaderHandler;
  private final UserAgentCombiner userAgentCombiner;
  private final AxisSoapHeaderFactory<AdWordsServiceDescriptor> soapHeaderFactory;
  
  static final String REQUEST_HEADER_LOCAL_PART = "RequestHeader";
  
  /**
   * Constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param adWordsApiConfiguration the AdWords API configuration
   * @param authorizationHeaderHandler the authorization header handler
   * @param userAgentCombiner the full user agent provider
   * @param soapHeaderFactory factory for creating the underlying soap header objects
   */
  @Inject
  AdWordsAxisHeaderHandler(
      AxisHandler soapClientHandler,
      AdWordsApiConfiguration adWordsApiConfiguration,
      AdsLibConfiguration adsLibConfiguration,
      AuthorizationHeaderHandler authorizationHeaderHandler,
      UserAgentCombiner userAgentCombiner,
      AxisSoapHeaderFactory<AdWordsServiceDescriptor> soapHeaderFactory) {
    this.soapClientHandler = soapClientHandler;
    this.adWordsApiConfiguration = adWordsApiConfiguration;
    this.adsLibConfiguration = adsLibConfiguration;
    this.authorizationHeaderHandler = authorizationHeaderHandler;
    this.userAgentCombiner = userAgentCombiner;
    this.soapHeaderFactory = soapHeaderFactory;
  }

  /**
   * @see HeaderHandler#setHeaders(Object,
   *      com.google.api.ads.common.lib.client.AdsSession,
   *      com.google.api.ads.common.lib.client.AdsServiceDescriptor)
   */
  @Override
  public void setHeaders(Object soapClient, AdWordsSession adWordsSession,
      AdWordsServiceDescriptor adWordsServiceDescriptor) throws AuthenticationException,
      ServiceException {
    try {
      Preconditions.checkArgument(soapClient instanceof Stub,
          "soapClient must be Stub but was: %s", soapClient);
      Stub stub = (Stub) soapClient;
      Object soapHeader = soapHeaderFactory.createSoapHeader(adWordsServiceDescriptor);

      String namespace =
          adWordsApiConfiguration.getNamespacePrefix() + "/"
              + adWordsServiceDescriptor.getPackageGroup() + "/"
              + adWordsServiceDescriptor.getVersion();

      soapClientHandler.setHeader(stub, namespace, REQUEST_HEADER_LOCAL_PART, soapHeader);

      soapClientHandler.setHeaderChild(stub, REQUEST_HEADER_LOCAL_PART, "developerToken",
          adWordsSession.getDeveloperToken());
      soapClientHandler.setHeaderChild(stub, REQUEST_HEADER_LOCAL_PART, "clientCustomerId",
          adWordsSession.getClientCustomerId());
      soapClientHandler.setHeaderChild(stub, REQUEST_HEADER_LOCAL_PART, "userAgent",
          userAgentCombiner.getUserAgent(adWordsSession.getUserAgent()));
      soapClientHandler.setHeaderChild(stub, REQUEST_HEADER_LOCAL_PART, "validateOnly",
          adWordsSession.isValidateOnly());
      soapClientHandler.setHeaderChild(stub, REQUEST_HEADER_LOCAL_PART, "partialFailure",
          adWordsSession.isPartialFailure());

      soapClientHandler.setCompression(stub, adsLibConfiguration.isCompressionEnabled());
      soapClientHandler.setRequestTimeout(stub, adsLibConfiguration.getSoapRequestTimeout());

      authorizationHeaderHandler.setAuthorization(soapClient, adWordsSession);
    } catch (InstantiationException
        | IllegalAccessException
        | ServiceException
        | ClassNotFoundException
        | InvocationTargetException
        | NoSuchMethodException e) {
      throw new ServiceException(
          "Unexpected exception setting headers for: " + adWordsServiceDescriptor, e);
    }
  }
}
