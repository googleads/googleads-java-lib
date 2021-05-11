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

package com.google.api.ads.admanager.lib.factory;

import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.factory.AdsServicesInterface;

/** Factory for Ad Manager API services. */
public interface AdManagerServicesInterface extends AdsServicesInterface<AdManagerSession> {
  // This interface exists simply to restrict the session type of AdsServicesInterface
  // to AdManagerSession. This is convenient for library users because they do not have
  // to specify the generic type argument when creating a reference. It also improves readability
  // of user code, since declaring a reference of type AdManagerServicesInterface is clearer
  // than declaring a reference of type AdsServicesInterface<AdManagerSession>.
}
