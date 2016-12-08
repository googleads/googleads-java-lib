// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.soap.axis.testing.mocks.v201611;

import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.compatability.AxisCompatible;

import org.apache.commons.lang.StringUtils;

import java.net.MalformedURLException;

/**
 * Mock implementation of SoapServiceDescriptor that also implements AxisCompatible.
 */
public class MockAxisCompatibleServiceDescriptor implements AdsServiceDescriptor,
    AxisCompatible {

  public static final String VERSION = "v201611";
  
  @Override
  public Class<?> getLocatorClass() throws ClassNotFoundException {
    return MockAxisServiceLocator.class;
  }

  @Override
  public Class<?> getInterfaceClass() throws ServiceException {
    return MockAxisServiceInterface.class;
  }

  /**
   * Returns {@code /mocks/}{@link #VERSION}{@code /MockAxisService} appended to endpointServer
   * after removing any trailing forward slash from endpointServer.
   *
   * <p>For example, given endpointServer of {@code https://ads.google.com/} or
   * {@code https://ads.google.com}, this method returns
   * {@code https://ads.google.com/mocks/v201611/MockAxisService}.
   */
  @Override
  public String getEndpointAddress(String endpointServer) throws MalformedURLException {
    String trimmedEndPointServer = StringUtils.removeEnd(endpointServer, "/");
    return String.format("%s/mocks/%s/MockAxisService", trimmedEndPointServer, VERSION);
  }

  /**
   * Returns {@link #VERSION}.
   */
  @Override
  public String getVersion() {
    return VERSION;
  }
}