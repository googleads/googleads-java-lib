// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.soap.axis;

import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import java.lang.reflect.InvocationTargetException;

/** Factory for creating Axis soap headers. */
public interface AxisSoapHeaderFactory<D extends AdsServiceDescriptor> {

  public Object createSoapHeader(D adsServiceDescriptor)
      throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException,
          IllegalAccessException, InstantiationException;
}
