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
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceClientFactoryInterface;
import com.google.api.ads.common.lib.factory.FactoryModule.AdsServiceDescriptorFactoryInterface;
import com.google.api.ads.common.lib.factory.helper.AdsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.factory.helper.BaseAdsServiceClientFactoryHelper;
import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.dfp.lib.client.DfpServiceClient;
import com.google.api.ads.dfp.lib.client.DfpServiceDescriptor;
import com.google.api.ads.dfp.lib.client.DfpSession;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

/**
 * Factory helper for Dfp.
 */
public class DfpServiceClientFactoryHelper extends
    BaseAdsServiceClientFactoryHelper<DfpServiceClient,
                                      DfpSession,
                                      DfpServiceDescriptor> {

  private static final Pattern VERSION_PATTERN = Pattern.compile("^.*(v[0-9][^\\.]*).*$");

  private final AdsLibConfiguration adsLibConfiguration;

  /**
   * Constructor.
   *
   * @param adsServiceClientFactory the ads service client factory
   * @param adsServiceDescriptorFactory the ads service descriptor factory
   * @param soapClientHandler the SOAP client handler
   * @param adsLibConfiguration the lib configuration
   */
  @SuppressWarnings("unchecked") /* See comments on soapClientHandler argument. */
  @Inject
  public DfpServiceClientFactoryHelper(
      AdsServiceClientFactoryInterface<DfpServiceClient,
                                       DfpSession,
                                       DfpServiceDescriptor> adsServiceClientFactory,
      AdsServiceDescriptorFactoryInterface<DfpServiceDescriptor> adsServiceDescriptorFactory,
      @SuppressWarnings("rawtypes") /* Guice binding for SoapClientHandlerInterface does not include
                                     * the type argument T because it is bound in the SOAP
                                     * toolkit-agnostic configuration module. Therefore, must use
                                     * the raw type here. */
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
