// Copyright 2011 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.lib.client;

import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.soap.compatability.AxisCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

/**
 * {@code DfaServiceDescriptor} provides a class which defines a service that
 * can be instantiated through reflection.
 *
 * @author Joseph DiLallo
 */
public class DfaServiceDescriptor implements AdsServiceDescriptor, AxisCompatible {

  private final Class<?> interfaceClass;
  private final String version;

  /**
   * Constructor. Requires the necessary information to instantiate a DFA
   * service.
   *
   * @param interfaceClass the {@code Class<?>} object of the requested
   *     interfaceClass
   * @param version the version of the service
   */
  @Inject
  public DfaServiceDescriptor(@Assisted("interfaceClass") Class<?> interfaceClass,
        @Assisted("version") String version) {
    this.interfaceClass = interfaceClass;
    this.version = version;
  }

  /**
   * @see AdsServiceDescriptor#getInterfaceClass()
   */
  public Class<?> getInterfaceClass() {
    return interfaceClass;
  }

  /**
   * Generates the locator class for this service by using reflection.
   *
   * @return the {@code Class<? extends Service>} representing the locator
   * @throws ClassNotFoundException if the formulated locator class name name
   *     could not be found
   */
  public Class<?> getLocatorClass() throws ClassNotFoundException {
    return Class.forName(interfaceClass.getCanonicalName() + "ServiceLocator");
  }

  /**
   * Generates the name of this service by using reflection.
   *
   * @return the name of the service this descriptor represents
   */
  @VisibleForTesting
  protected String getServiceName() {
    String simpleName = interfaceClass.getSimpleName();
    String serviceName = simpleName.substring(0, simpleName.indexOf("Remote")).toLowerCase();
    if ("placementstrategy".equalsIgnoreCase(serviceName)) {
      return "strategy";
    } else {
      return serviceName;
    }
  }

  /**
   * @see AdsServiceDescriptor#getEndpointAddress(String)
   */
  public String getEndpointAddress(String endpointServer) {
    return endpointServer + "/" + version + "/api/dfa-api/" + getServiceName();
  }

  /**
   * @see AdsServiceDescriptor#getVersion()
   */
  public String getVersion() {
    return version;
  }
}
