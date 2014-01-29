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

package com.google.api.ads.common.lib.soap.compatability;

/**
 * Specifies that for the {@code AdsServiceClient} to be JAX-WS compatible, it
 * must be able to retrieve a service class.
 *
 * @author Joseph DiLallo
 */
public interface JaxWsCompatible {

  /**
   * Gets the JAX-WS service class such that it can be instantiated to create
   * an JAX-WS service client.
   *
   * @return the JAX-WS service class
   * @throws ClassNotFoundException if no service class can be found
   */
  public Class<?> getServiceClass() throws ClassNotFoundException;
}
