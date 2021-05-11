// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.factory;

import com.google.api.ads.common.lib.client.AdsSession;

/** Service factory for an ads product. */
public interface AdsServicesInterface<S extends AdsSession> {

  /**
   * Gets a client for the service represented by the interface with a reference to the session.
   *
   * <p>There is no guarantee that the objects returned by this method are thread-safe.
   *
   * @param <T> the service type
   * @param session your current session
   * @param interfaceClass the service interface class representing a SOAP service
   * @return the client for the service
   */
  public <T> T get(S session, Class<T> interfaceClass);
}
