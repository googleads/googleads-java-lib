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

package com.google.api.ads.adwords.axis;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.common.lib.soap.axis.AxisSoapHeaderFactory;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * AdWords implementation of {@link AxisSoapHeaderFactory}.
 */
public class AdWordsAxisSoapHeaderFactory
    implements AxisSoapHeaderFactory<AdWordsServiceDescriptor> {

  private final String headerPartialName;
  
  /** Constructor used by Guice. */
  @Inject
  AdWordsAxisSoapHeaderFactory() {
    this("cm.SoapHeader");
  }
  
  @VisibleForTesting
  AdWordsAxisSoapHeaderFactory(String headerPartialName) {
    this.headerPartialName = headerPartialName;
  }

  @Override
  public Object createSoapHeader(AdWordsServiceDescriptor adWordsServiceDescriptor)
      throws InvocationTargetException, ClassNotFoundException, NoSuchMethodException,
          IllegalAccessException, InstantiationException {
    Class<?> interfaceClass = adWordsServiceDescriptor.getInterfaceClass();
    String packageName = interfaceClass.getPackage().getName();
    List<String> packageParts = Lists.newArrayList(packageName.split("\\."));
    String parentPackage = Joiner.on(".").join(packageParts.subList(0, packageParts.size() - 1));
    Constructor<?> constructor =
        Class.forName(parentPackage + "." + headerPartialName).getDeclaredConstructor();
    return constructor.newInstance();
  }
}
