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

package com.google.api.ads.adwords.lib.conf;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor.AdWordsSubProduct;
import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.apache.commons.configuration.Configuration;

/**
 * Configuration information for AdWords library.
 */
public class AdWordsApiConfiguration extends AdsApiConfiguration {

  public static final String NAMESPACE_PREFIX_KEY = "api.adwords.namespace.prefix";

  /**
   * Constructor.
   *
   * @param config the backing configuration
   */
  @Inject
  public AdWordsApiConfiguration(@Named("api") Configuration config) {
    super(config);
  }

  /**
   * @see AdsApiConfiguration#getNamespacePrefix()
   */
  @Override
  public String getNamespacePrefix() {
    return getString(NAMESPACE_PREFIX_KEY);
  }

  /**
   * Gets the service URL group for the service and version.
   */
  public String getServiceUrlGroup(String version, String service) {
    String[] groups = config.getStringArray("api.adwords.version." + version + ".groups");
    for (String group : groups) {
      String[] services =
          config.getStringArray("api.adwords.version." + version + "." + group + ".services");
      if (Lists.newArrayList(services).contains(service)) {
        return group;
      }
    }
    throw new NullPointerException("No group found for service: " + version + "." + service);
  }
  
  /**
   * Gets the sub product for the service and version. 
   */
  public AdWordsSubProduct getServiceSubProduct(String version, String service) {
    String subProductName = config.getString("api.adwords.version." + version + "."
        + getServiceUrlGroup(version, service) + ".subproduct");
    return subProductName != null
        ? Enum.valueOf(AdWordsSubProduct.class, subProductName.toUpperCase())
        : AdWordsSubProduct.DEFAULT;
  }
}
