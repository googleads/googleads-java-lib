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

package com.google.api.ads.common.lib.client;

import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.SoapServiceDescriptor;

import java.net.MalformedURLException;

/**
 * Interface for ads service descriptors.
 *
 * @author api.arogal(Adam Rogal)
 */
public interface AdsServiceDescriptor extends SoapServiceDescriptor {

  /**
   * Gets the class representing the RPC interface of the service.
   *
   * @throws ServiceException if the interface could not be retrieved.
   */
  @Override
  Class<?> getInterfaceClass() throws ServiceException;

  /**
   * Gets the endpoint address for this service and server.
   *
   * @return the endpoint address for this service and server.
   * @throws MalformedURLException 
   */
  @Override
  String getEndpointAddress(String endpointServer) throws MalformedURLException;

  /**
   * Gets the version for this service.
   *
   * @return the version for this service
   */
  String getVersion();
}
