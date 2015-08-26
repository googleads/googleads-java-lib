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

package com.google.api.ads.dfa.lib.factory.helper;

import com.google.api.ads.common.lib.conf.AdsLibConfiguration;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.factory.helper.BaseAdsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.dfa.lib.client.DfaServiceClient;
import com.google.api.ads.dfa.lib.client.DfaServiceDescriptor;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.inject.Inject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Factory helper for DFA.
 */
public class DfaServiceClientFactoryHelper extends
    BaseAdsServiceClientFactoryHelper<DfaServiceClient,
                                      DfaSession,
                                      DfaServiceDescriptor> {

  private final static Pattern VERSION_PATTERN = Pattern.compile("^.*(v[0-9][^\\.]*).*$");

  private final AdsLibConfiguration adsLibConfiguration;

  /**
   * Constructor.
   *
   * @param adsServiceClientFactory the ads service client factory
   * @param adsServiceDescriptorFactory the ads service descriptor factory
   * @param soapClientHandler the SOAP client handler
   * @param adsLibConfiguration the lib configuration
   */
  @Inject
  public DfaServiceClientFactoryHelper(
      AdsServiceClientFactoryInterface<DfaServiceClient,
                                       DfaSession,
                                       DfaServiceDescriptor> adsServiceClientFactory,
      AdsServiceDescriptorFactoryInterface<DfaServiceDescriptor> adsServiceDescriptorFactory,
      @SuppressWarnings("rawtypes") /* Due to problem with guice binding */
      SoapClientHandlerInterface soapClientHandler,
      AdsLibConfiguration adsLibConfiguration) {
    super(adsServiceClientFactory, adsServiceDescriptorFactory, soapClientHandler);
    this.adsLibConfiguration = adsLibConfiguration;
  }

  /**
   * @see AdsServiceClientFactoryHelper#determineVersion(Class)
   */
  @Override
  public String determineVersion(Class<?> interfaceClass) {
    Matcher m = VERSION_PATTERN.matcher(interfaceClass.getPackage().getName());
    if (m.matches()) {
      String version = m.group(1);
      return version.replace('_', '.');
    } else {
      return adsLibConfiguration.getDuckTypedVersion();
    }
  }
}
