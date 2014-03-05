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

package com.google.api.ads.dfp.lib.factory.helper;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.factory.helper.BaseAdsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.dfp.lib.client.DfpServiceClient;
import com.google.api.ads.dfp.lib.client.DfpServiceDescriptor;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.common.base.Strings;
import com.google.inject.Inject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Factory helper for Dfp.
 *
 * @author Adam Rogal
 */
public class DfpServiceClientFactoryHelper extends
    BaseAdsServiceClientFactoryHelper<DfpServiceClient,
                                      DfpSession,
                                      DfpServiceDescriptor> {

  private static final Pattern VERSION_PATTERN = Pattern.compile("^.*(v[0-9][^\\.]*).*$");
  private static final String FINAL_CLIENT_LOGIN_VERSION = "v201311";

  private final AdsLibConfiguration adsLibConfiguration;

  /**
   * Constructor.
   *
   * @param adsServiceClientFactory the ads service client factory
   * @param adsServiceDescriptorFactory the ads service descriptor factory
   * @param soapClientHandler the SOAP client handler
   * @param adsLibConfiguration the lib configuration
   */
  @SuppressWarnings("unchecked") // All generics of SoapClientHandlerInterface
                                 // extend Object.
  @Inject
  public DfpServiceClientFactoryHelper(
      AdsServiceClientFactoryInterface<DfpServiceClient,
                                       DfpSession,
                                       DfpServiceDescriptor> adsServiceClientFactory,
      AdsServiceDescriptorFactoryInterface<DfpServiceDescriptor> adsServiceDescriptorFactory,
      @SuppressWarnings({"rawtypes", "unchecked"})  /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      AdsLibConfiguration adsLibConfiguration) {
    super(adsServiceClientFactory, adsServiceDescriptorFactory, soapClientHandler);
    this.adsLibConfiguration = adsLibConfiguration;
  }

  /**
   * @see AdsServiceClientFactoryHelper#determineVersion(Class)
   */
  public String determineVersion(Class<?> interfaceClass) {
    Matcher m = VERSION_PATTERN.matcher(interfaceClass.getPackage().getName());
    if (m.matches()) {
      String version = m.group(1);
      return version.replace('_', '.');
    } else {
      return adsLibConfiguration.getDuckTypedVersion();
    }
  }

  /**
   * @see AdsServiceClientFactoryHelper#checkServiceClientPreconditions(AdsSession, Class)
   */
  public void checkServiceClientPreconditions(DfpSession dfpSession, Class<?> interfaceClass)
      throws ServiceException {
    String version = determineVersion(interfaceClass);
    if (!Strings.isNullOrEmpty(dfpSession.getClientLoginToken())
        && version.compareTo(FINAL_CLIENT_LOGIN_VERSION) > 0) {
      throw new ServiceException(String.format("ClientLogin is not supported in version %s."
          + " Please upgrade to OAuth2.", version));
    }
  }
}
