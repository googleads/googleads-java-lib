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

import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.SoapServiceDescriptor;
import com.google.api.ads.common.lib.soap.compatability.JaxWsCompatible;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsHandler;

import java.net.MalformedURLException;

/**
 * Mock {@link SoapServiceDescriptor} used to test
 * {@link JaxWsHandler#createSoapClient(SoapServiceDescriptor)}.
 *
 * @author Joseph DiLallo
 */
public class MockJaxWsCompatibleDescriptor implements SoapServiceDescriptor, JaxWsCompatible{

  /**
   * @see com.google.api.ads.common.lib.soap.compatability.JaxWsCompatible#getServiceClass()
   */
  public Class<?> getServiceClass() throws ClassNotFoundException {
    return ServiceClass.class;
  }

  /**
   * @see com.google.api.ads.common.lib.soap.SoapServiceDescriptor#getInterfaceClass()
   */
  public Class<?> getInterfaceClass() throws ServiceException {
    return CampaignServiceInterface.class;
  }

  /**
   * Unused for this mock.
   *
   * @see com.google.api.ads.common.lib.soap.SoapServiceDescriptor#getEndpointAddress(
   * java.lang.String)
   */
  public String getEndpointAddress(String endpointServer) throws MalformedURLException {
    return null;
  }
}
