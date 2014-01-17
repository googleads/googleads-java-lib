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

package com.google.api.ads.dfa.axis.testing.mocks.v1_12;

import org.apache.axis.client.Service;

import java.rmi.Remote;

import javax.xml.rpc.ServiceException;

/**
 * Mock of an Apache Axis locator class.
 *
 * @author Joseph DiLallo
 */
public class FunRemoteServiceLocator extends Service {

  @SuppressWarnings("rawtypes")
  @Override
  public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
    if (FunRemote.class.isAssignableFrom(serviceEndpointInterface)) {
      return new FunSoapBindingStub();
    }
    throw new ServiceException();
  }
}
